package com.bytedance.sdk.openadsdk.mZx;

/* compiled from: AdEventRepertoryImpl.java */
/* loaded from: classes2.dex */
public class Pm {
    public static String mZx() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }

    public static String EYQ() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)").toString();
    }
}
