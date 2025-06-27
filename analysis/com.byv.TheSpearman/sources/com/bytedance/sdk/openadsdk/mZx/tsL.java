package com.bytedance.sdk.openadsdk.mZx;

/* compiled from: StatsBatchEventRepertoryImpl.java */
/* loaded from: classes2.dex */
public class tsL {
    public static String EYQ() {
        return "CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public static String mZx() {
        return "ALTER TABLE logstatsbatch ADD COLUMN encrypt INTEGER default 0";
    }
}
