package com.bytedance.sdk.openadsdk.mZx;

/* compiled from: V3EventRepertoryImpl.java */
/* loaded from: classes2.dex */
public class KO extends Pm {
    public static String Td() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0, channel INTEGER default 0)").toString();
    }
}
