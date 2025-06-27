package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";
    public static final int MAX_ATTRIBUTES = 64;
    public static final int MAX_ATTRIBUTE_SIZE = 1024;
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final String USERDATA_FILENAME = "user-data";
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private final MetaDataStore metaDataStore;
    private String sessionIdentifier;
    private final SerializeableKeysMap customKeys = new SerializeableKeysMap(false);
    private final SerializeableKeysMap internalKeys = new SerializeableKeysMap(true);
    private final RolloutAssignmentList rolloutsState = new RolloutAssignmentList(128);
    private final AtomicMarkableReference<String> userId = new AtomicMarkableReference<>(null, false);

    public static String readUserId(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).readUserId(str);
    }

    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsBackgroundWorker);
        userMetadata.customKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, false));
        userMetadata.internalKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, true));
        userMetadata.userId.set(metaDataStore.readUserId(str), false);
        userMetadata.rolloutsState.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        this.sessionIdentifier = str;
        this.metaDataStore = new MetaDataStore(fileStore);
        this.backgroundWorker = crashlyticsBackgroundWorker;
    }

    public void setNewSession(String str) {
        synchronized (this.sessionIdentifier) {
            this.sessionIdentifier = str;
            Map<String, String> keys = this.customKeys.getKeys();
            List<RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
            if (getUserId() != null) {
                this.metaDataStore.writeUserData(str, getUserId());
            }
            if (!keys.isEmpty()) {
                this.metaDataStore.writeKeyData(str, keys);
            }
            if (!rolloutAssignmentList.isEmpty()) {
                this.metaDataStore.writeRolloutState(str, rolloutAssignmentList);
            }
        }
    }

    public String getUserId() {
        return this.userId.getReference();
    }

    public void setUserId(String str) {
        String strSanitizeString = KeysMap.sanitizeString(str, 1024);
        synchronized (this.userId) {
            if (CommonUtils.nullSafeEquals(strSanitizeString, this.userId.getReference())) {
                return;
            }
            this.userId.set(strSanitizeString, true);
            this.backgroundWorker.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.m486x76e191c7();
                }
            });
        }
    }

    /* renamed from: lambda$setUserId$0$com-google-firebase-crashlytics-internal-metadata-UserMetadata, reason: not valid java name */
    public /* synthetic */ Object m486x76e191c7() throws Exception {
        serializeUserDataIfNeeded();
        return null;
    }

    public Map<String, String> getCustomKeys() {
        return this.customKeys.getKeys();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.customKeys.setKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.customKeys.setKeys(map);
    }

    public Map<String, String> getInternalKeys() {
        return this.internalKeys.getKeys();
    }

    public boolean setInternalKey(String str, String str2) {
        return this.internalKeys.setKey(str, str2);
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.rolloutsState.getReportRolloutsState();
    }

    public boolean updateRolloutsState(List<RolloutAssignment> list) {
        synchronized (this.rolloutsState) {
            if (!this.rolloutsState.updateRolloutAssignmentList(list)) {
                return false;
            }
            final List<RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
            this.backgroundWorker.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.m487x8982b7e8(rolloutAssignmentList);
                }
            });
            return true;
        }
    }

    /* renamed from: lambda$updateRolloutsState$1$com-google-firebase-crashlytics-internal-metadata-UserMetadata, reason: not valid java name */
    public /* synthetic */ Object m487x8982b7e8(List list) throws Exception {
        this.metaDataStore.writeRolloutState(this.sessionIdentifier, list);
        return null;
    }

    private void serializeUserDataIfNeeded() throws Throwable {
        boolean z;
        String userId;
        synchronized (this.userId) {
            z = false;
            if (this.userId.isMarked()) {
                userId = getUserId();
                this.userId.set(userId, false);
                z = true;
            } else {
                userId = null;
            }
        }
        if (z) {
            this.metaDataStore.writeUserData(this.sessionIdentifier, userId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SerializeableKeysMap {
        private final boolean isInternal;
        final AtomicMarkableReference<KeysMap> map;
        private final AtomicReference<Callable<Void>> queuedSerializer = new AtomicReference<>(null);

        public SerializeableKeysMap(boolean z) {
            this.isInternal = z;
            this.map = new AtomicMarkableReference<>(new KeysMap(64, z ? 8192 : 1024), false);
        }

        public Map<String, String> getKeys() {
            return this.map.getReference().getKeys();
        }

        public boolean setKey(String str, String str2) {
            synchronized (this) {
                if (!this.map.getReference().setKey(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                scheduleSerializationTaskIfNeeded();
                return true;
            }
        }

        public void setKeys(Map<String, String> map) {
            synchronized (this) {
                this.map.getReference().setKeys(map);
                AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            scheduleSerializationTaskIfNeeded();
        }

        private void scheduleSerializationTaskIfNeeded() {
            Callable<Void> callable = new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.m488xb9b680d3();
                }
            };
            if (this.queuedSerializer.compareAndSet(null, callable)) {
                UserMetadata.this.backgroundWorker.submit(callable);
            }
        }

        /* renamed from: lambda$scheduleSerializationTaskIfNeeded$0$com-google-firebase-crashlytics-internal-metadata-UserMetadata$SerializeableKeysMap, reason: not valid java name */
        public /* synthetic */ Void m488xb9b680d3() throws Exception {
            this.queuedSerializer.set(null);
            serializeIfMarked();
            return null;
        }

        private void serializeIfMarked() throws Throwable {
            Map<String, String> keys;
            synchronized (this) {
                if (this.map.isMarked()) {
                    keys = this.map.getReference().getKeys();
                    AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    keys = null;
                }
            }
            if (keys != null) {
                UserMetadata.this.metaDataStore.writeKeyData(UserMetadata.this.sessionIdentifier, keys, this.isInternal);
            }
        }
    }
}
