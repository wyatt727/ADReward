package com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ;

import android.content.Context;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;

/* compiled from: StatsBatchLogEventRepoImpl.java */
/* loaded from: classes2.dex */
public class IPb extends VwS {
    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.VwS
    public byte EYQ() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.VwS
    public byte Td() {
        return (byte) 3;
    }

    public IPb(Context context, com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
        super(context, eyq);
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.VwS, com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Td
    public String mZx() {
        return QQ.VwS().Pm().Kbd();
    }

    public static String EYQ(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
