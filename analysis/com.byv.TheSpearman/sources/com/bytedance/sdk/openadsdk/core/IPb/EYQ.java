package com.bytedance.sdk.openadsdk.core.IPb;

import android.content.Context;
import com.bytedance.sdk.component.IPb.Td.VwS;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.MxO.Td;
import com.bytedance.sdk.openadsdk.MxO.mZx;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.settings.Kbd;

/* compiled from: TncHelper.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static boolean EYQ = false;
    private static final int mZx = Integer.parseInt("1371");
    private static long Td = System.currentTimeMillis();

    public static void EYQ() {
        Context contextEYQ;
        if (!hu.Pm().HX() || EYQ || (contextEYQ = hu.EYQ()) == null) {
            return;
        }
        try {
            Td.EYQ().mZx().EYQ(contextEYQ, true, new mZx(contextEYQ));
            Td.EYQ().mZx().EYQ(contextEYQ, com.bytedance.sdk.openadsdk.multipro.mZx.Td());
            Td = System.currentTimeMillis();
            EYQ = true;
        } catch (Exception e) {
            pi.EYQ("TncHelper", "initTTAdNet: ", e.getMessage());
        }
    }

    public static void mZx() {
        if (EYQ) {
            Kbd kbdPm = hu.Pm();
            if (kbdPm.HX()) {
                long jKo = kbdPm.Ko();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - Td >= jKo) {
                    Td = jCurrentTimeMillis;
                    Context contextEYQ = hu.EYQ();
                    if (contextEYQ == null) {
                        return;
                    }
                    VwS.EYQ().EYQ(mZx, contextEYQ).Td();
                }
            }
        }
    }
}
