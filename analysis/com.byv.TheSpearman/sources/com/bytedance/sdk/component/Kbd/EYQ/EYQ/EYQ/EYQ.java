package com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ;

import android.content.Context;
import com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.mZx;

/* compiled from: DBAdapter.java */
/* loaded from: classes2.dex */
public class EYQ extends mZx {
    private static volatile EYQ EYQ;

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.mZx
    public /* bridge */ /* synthetic */ mZx.C0083mZx EYQ() {
        return super.EYQ();
    }

    public static EYQ EYQ(Context context) {
        if (EYQ == null) {
            synchronized (EYQ.class) {
                if (EYQ == null) {
                    EYQ = new EYQ(context);
                }
            }
        }
        return EYQ;
    }

    private EYQ(Context context) {
        super(context);
    }
}
