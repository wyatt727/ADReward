package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    byte[] getLogAsBytes();

    String getLogAsString();

    void writeToLog(long j, String str);
}
