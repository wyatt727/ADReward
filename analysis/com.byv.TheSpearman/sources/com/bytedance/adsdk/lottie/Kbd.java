package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.os.Trace;
import java.io.File;

/* compiled from: L.java */
/* loaded from: classes2.dex */
public class Kbd {
    public static boolean EYQ = false;
    private static com.bytedance.adsdk.lottie.Pm.IPb HX = null;
    private static long[] IPb = null;
    private static String[] Kbd = null;
    private static volatile com.bytedance.adsdk.lottie.Pm.QQ MxO = null;
    private static boolean Pm = true;
    private static int QQ = 0;
    private static boolean Td = true;
    private static int VwS = 0;
    private static boolean mZx = false;
    private static com.bytedance.adsdk.lottie.Pm.Kbd tp;
    private static volatile com.bytedance.adsdk.lottie.Pm.VwS tsL;

    public static void EYQ(String str) {
        if (mZx) {
            int i = VwS;
            if (i == 20) {
                QQ++;
                return;
            }
            Kbd[i] = str;
            IPb[i] = System.nanoTime();
            Trace.beginSection(str);
            VwS++;
        }
    }

    public static float mZx(String str) {
        int i = QQ;
        if (i > 0) {
            QQ = i - 1;
            return 0.0f;
        }
        if (!mZx) {
            return 0.0f;
        }
        int i2 = VwS - 1;
        VwS = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(Kbd[i2])) {
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + Kbd[VwS] + ".");
        }
        Trace.endSection();
        return (System.nanoTime() - IPb[VwS]) / 1000000.0f;
    }

    public static com.bytedance.adsdk.lottie.Pm.QQ EYQ(Context context) {
        com.bytedance.adsdk.lottie.Pm.QQ qq;
        com.bytedance.adsdk.lottie.Pm.QQ qq2 = MxO;
        if (qq2 != null) {
            return qq2;
        }
        synchronized (com.bytedance.adsdk.lottie.Pm.QQ.class) {
            qq = MxO;
            if (qq == null) {
                com.bytedance.adsdk.lottie.Pm.VwS vwSMZx = mZx(context);
                com.bytedance.adsdk.lottie.Pm.IPb mzx = HX;
                if (mzx == null) {
                    mzx = new com.bytedance.adsdk.lottie.Pm.mZx();
                }
                qq = new com.bytedance.adsdk.lottie.Pm.QQ(vwSMZx, mzx);
                MxO = qq;
            }
        }
        return qq;
    }

    public static com.bytedance.adsdk.lottie.Pm.VwS mZx(Context context) {
        com.bytedance.adsdk.lottie.Pm.VwS vwS;
        if (!Td) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.lottie.Pm.VwS vwS2 = tsL;
        if (vwS2 != null) {
            return vwS2;
        }
        synchronized (com.bytedance.adsdk.lottie.Pm.VwS.class) {
            vwS = tsL;
            if (vwS == null) {
                com.bytedance.adsdk.lottie.Pm.Kbd kbd = tp;
                if (kbd == null) {
                    kbd = new com.bytedance.adsdk.lottie.Pm.Kbd() { // from class: com.bytedance.adsdk.lottie.Kbd.1
                        @Override // com.bytedance.adsdk.lottie.Pm.Kbd
                        public File EYQ() {
                            return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                        }
                    };
                }
                vwS = new com.bytedance.adsdk.lottie.Pm.VwS(kbd);
                tsL = vwS;
            }
        }
        return vwS;
    }

    public static boolean EYQ() {
        return Pm;
    }
}
