package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public interface SnapshotsClient {
    public static final int DISPLAY_LIMIT_NONE = -1;
    public static final String EXTRA_SNAPSHOT_METADATA = "com.google.android.gms.games.SNAPSHOT_METADATA";
    public static final String EXTRA_SNAPSHOT_NEW = "com.google.android.gms.games.SNAPSHOT_NEW";
    public static final int RESOLUTION_POLICY_HIGHEST_PROGRESS = 4;
    public static final int RESOLUTION_POLICY_LAST_KNOWN_GOOD = 2;
    public static final int RESOLUTION_POLICY_LONGEST_PLAYTIME = 1;
    public static final int RESOLUTION_POLICY_MANUAL = -1;
    public static final int RESOLUTION_POLICY_MOST_RECENTLY_MODIFIED = 3;

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResolutionPolicy {
    }

    Task<SnapshotMetadata> commitAndClose(Snapshot snapshot, SnapshotMetadataChange snapshotMetadataChange);

    Task<String> delete(SnapshotMetadata snapshotMetadata);

    Task<Void> discardAndClose(Snapshot snapshot);

    Task<Integer> getMaxCoverImageSize();

    Task<Integer> getMaxDataSize();

    Task<Intent> getSelectSnapshotIntent(String str, boolean z, boolean z2, int i);

    Task<AnnotatedData<SnapshotMetadataBuffer>> load(boolean z);

    Task<DataOrConflict<Snapshot>> open(SnapshotMetadata snapshotMetadata);

    Task<DataOrConflict<Snapshot>> open(SnapshotMetadata snapshotMetadata, int i);

    Task<DataOrConflict<Snapshot>> open(String str, boolean z);

    Task<DataOrConflict<Snapshot>> open(String str, boolean z, int i);

    Task<DataOrConflict<Snapshot>> resolveConflict(String str, Snapshot snapshot);

    Task<DataOrConflict<Snapshot>> resolveConflict(String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents);

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    public static final class SnapshotContentUnavailableApiException extends ApiException {
        protected final SnapshotMetadata metadata;

        public SnapshotContentUnavailableApiException(Status status, SnapshotMetadata snapshotMetadata) {
            super(status);
            this.metadata = snapshotMetadata;
        }

        public final SnapshotMetadata getSnapshotMetadata() {
            return this.metadata;
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    public static final class DataOrConflict<T> {
        private final T data;
        private final SnapshotConflict zzcf;

        public DataOrConflict(T t, SnapshotConflict snapshotConflict) {
            this.data = t;
            this.zzcf = snapshotConflict;
        }

        public final boolean isConflict() {
            return this.zzcf != null;
        }

        public final T getData() {
            if (isConflict()) {
                throw new IllegalStateException("getData called when there is a conflict.");
            }
            return this.data;
        }

        public final SnapshotConflict getConflict() {
            if (!isConflict()) {
                throw new IllegalStateException("getConflict called when there is no conflict.");
            }
            return this.zzcf;
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    public static final class SnapshotConflict {
        private final Snapshot zzcg;
        private final String zzch;
        private final Snapshot zzci;
        private final SnapshotContents zzcj;

        public SnapshotConflict(Snapshot snapshot, String str, Snapshot snapshot2, SnapshotContents snapshotContents) {
            this.zzcg = snapshot;
            this.zzch = str;
            this.zzci = snapshot2;
            this.zzcj = snapshotContents;
        }

        public final Snapshot getSnapshot() {
            return this.zzcg;
        }

        public final Snapshot getConflictingSnapshot() {
            return this.zzci;
        }

        public final String getConflictId() {
            return this.zzch;
        }

        public final SnapshotContents getResolutionSnapshotContents() {
            return this.zzcj;
        }
    }
}
