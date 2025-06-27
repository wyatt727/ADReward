package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.IPb;

/* compiled from: DBAdapter.java */
/* loaded from: classes2.dex */
public class Kbd extends IPb {
    private static volatile Kbd EYQ;

    @Override // com.bytedance.sdk.openadsdk.core.IPb
    public /* bridge */ /* synthetic */ IPb.Td EYQ() {
        return super.EYQ();
    }

    public static Kbd EYQ(Context context) {
        if (EYQ == null) {
            synchronized (Kbd.class) {
                if (EYQ == null) {
                    EYQ = new Kbd(context);
                }
            }
        }
        return EYQ;
    }

    private Kbd(Context context) {
        super(context);
    }
}
