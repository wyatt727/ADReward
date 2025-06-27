package com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: MyDBCallback.java */
/* loaded from: classes2.dex */
public class Kbd implements com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd {
    public static final Kbd EYQ = new Kbd();
    private volatile SQLiteDatabase mZx;

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd
    public String EYQ() {
        return "loghighpriority";
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd
    public String IPb() {
        return null;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd
    public String Kbd() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd
    public String Pm() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd
    public String Td() {
        return null;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd
    public String mZx() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd
    public SQLiteDatabase EYQ(Context context) {
        if (this.mZx == null) {
            synchronized (this) {
                if (this.mZx == null) {
                    this.mZx = new Pm(context).getWritableDatabase();
                }
            }
        }
        return this.mZx;
    }
}
