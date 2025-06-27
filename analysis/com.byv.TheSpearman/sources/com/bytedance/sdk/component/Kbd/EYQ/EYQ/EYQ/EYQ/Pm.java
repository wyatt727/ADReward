package com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ;

import android.content.Context;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;

/* compiled from: HighPriorityAdEventRepoImpl.java */
/* loaded from: classes2.dex */
public class Pm extends EYQ {
    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.EYQ
    public byte Pm() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.EYQ
    public byte Td() {
        return (byte) 1;
    }

    public Pm(Context context, com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
        super(context, eyq);
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.EYQ, com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Td
    public String mZx() {
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd kbdPm = QQ.VwS().Pm();
        if (kbdPm != null) {
            return kbdPm.EYQ();
        }
        return null;
    }

    public static String Td(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
