package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
class CrashlyticsAppQualitySessionsStore {
    private static final String AQS_SESSION_ID_FILENAME_PREFIX = "aqs.";
    private static final FilenameFilter AQS_SESSION_ID_FILE_FILTER = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore$$ExternalSyntheticLambda0
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(CrashlyticsAppQualitySessionsStore.AQS_SESSION_ID_FILENAME_PREFIX);
        }
    };
    private static final Comparator<File> FILE_RECENCY_COMPARATOR = new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };
    private final FileStore fileStore;
    private String sessionId = null;
    private String appQualitySessionId = null;

    CrashlyticsAppQualitySessionsStore(FileStore fileStore) {
        this.fileStore = fileStore;
    }

    public synchronized String getAppQualitySessionId(String str) {
        if (Objects.equals(this.sessionId, str)) {
            return this.appQualitySessionId;
        }
        return readAqsSessionIdFile(this.fileStore, str);
    }

    public synchronized void rotateAppQualitySessionId(String str) {
        if (!Objects.equals(this.appQualitySessionId, str)) {
            persist(this.fileStore, this.sessionId, str);
            this.appQualitySessionId = str;
        }
    }

    public synchronized void rotateSessionId(String str) {
        if (!Objects.equals(this.sessionId, str)) {
            persist(this.fileStore, str, this.appQualitySessionId);
            this.sessionId = str;
        }
    }

    private static void persist(FileStore fileStore, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fileStore.getSessionFile(str, AQS_SESSION_ID_FILENAME_PREFIX + str2).createNewFile();
        } catch (IOException e) {
            Logger.getLogger().w("Failed to persist App Quality Sessions session id.", e);
        }
    }

    static String readAqsSessionIdFile(FileStore fileStore, String str) {
        List<File> sessionFiles = fileStore.getSessionFiles(str, AQS_SESSION_ID_FILE_FILTER);
        if (sessionFiles.isEmpty()) {
            Logger.getLogger().w("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((File) Collections.min(sessionFiles, FILE_RECENCY_COMPARATOR)).getName().substring(4);
    }
}
