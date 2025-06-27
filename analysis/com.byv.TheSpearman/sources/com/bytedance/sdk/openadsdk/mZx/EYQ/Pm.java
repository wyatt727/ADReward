package com.bytedance.sdk.openadsdk.mZx.EYQ;

import android.content.Context;
import com.bytedance.sdk.component.Kbd.EYQ.EYQ;
import com.bytedance.sdk.openadsdk.core.hu;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AdLogSwitchUtils.java */
/* loaded from: classes2.dex */
public class Pm {
    public static AtomicInteger EYQ = new AtomicInteger(0);
    public static final AtomicBoolean mZx = new AtomicBoolean(false);

    public static void EYQ(Context context, boolean z) {
        if (mZx.compareAndSet(false, true)) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ(new EYQ.C0082EYQ().EYQ(new tp()).mZx(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ.Td()).Td(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ.Kbd()).EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ.Pm()).EYQ(z).EYQ(new MxO()).EYQ(QQ.EYQ).mZx(hu.Pm().KO()).EYQ(hu.Pm().hu()).EYQ(hu.Pm().wG()).EYQ(), context);
            mZx();
        }
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.mZx.EYQ eyq) {
        com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.EYQ eyq2 = new com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.EYQ(eyq.Pm(), eyq);
        eyq2.mZx(eyq.Kbd() ? (byte) 1 : (byte) 2);
        eyq2.EYQ((byte) 0);
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx()) {
            EYQ(hu.EYQ(), com.bytedance.sdk.openadsdk.multipro.mZx.Td());
        }
        com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ(eyq2);
    }

    public static com.bytedance.sdk.openadsdk.tp.Td.EYQ EYQ() {
        return tsL.EYQ;
    }

    public static void EYQ(final List<String> list, final int i, final String str) {
        if (list == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(new com.bytedance.sdk.component.VwS.QQ("track") { // from class: com.bytedance.sdk.openadsdk.mZx.EYQ.Pm.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx()) {
                    Pm.EYQ(hu.EYQ(), com.bytedance.sdk.openadsdk.multipro.mZx.Td());
                }
                com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ(com.bytedance.sdk.openadsdk.core.MxO.EYQ(hu.EYQ()), list, true, i, str);
            }
        });
    }

    public static void EYQ(String str) {
        EYQ(str, false);
    }

    public static void EYQ(String str, boolean z) {
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx()) {
            EYQ(hu.EYQ(), com.bytedance.sdk.openadsdk.multipro.mZx.Td());
        }
        com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ(str, z);
    }

    public static void mZx() {
        com.bytedance.sdk.component.Kbd.EYQ.mZx.Td();
    }

    public static void Td() {
        try {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm();
            com.bytedance.sdk.component.Kbd.EYQ.mZx.Kbd();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("AdLogSwitchUtils", th.getMessage());
        }
    }
}
