package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: InitHelper.java */
/* loaded from: classes2.dex */
public class pi {
    public static volatile boolean EYQ = false;
    public static long Kbd;
    private static volatile HandlerThread VwS;
    public static AtomicBoolean mZx = new AtomicBoolean(false);
    public static long Td = 0;
    private static volatile int IPb = 0;
    public static float Pm = 1.0f;
    private static volatile Handler QQ = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10);
        VwS = handlerThread;
        handlerThread.start();
        Kbd = System.currentTimeMillis();
    }

    public static void EYQ(long j) {
        Kbd = j;
    }

    public static long EYQ() {
        return Kbd;
    }

    public static Handler mZx() {
        if (VwS == null || !VwS.isAlive()) {
            synchronized (pi.class) {
                if (VwS == null || !VwS.isAlive()) {
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    VwS = handlerThread;
                    handlerThread.start();
                    QQ = new Handler(VwS.getLooper());
                }
            }
        } else if (QQ == null) {
            synchronized (pi.class) {
                if (QQ == null) {
                    QQ = new Handler(VwS.getLooper());
                }
            }
        }
        return QQ;
    }

    public static Handler Td() {
        return new Handler(Looper.getMainLooper());
    }

    public static int Pm() {
        return IPb;
    }

    public static void EYQ(int i) {
        IPb = i;
    }

    public static boolean Kbd() {
        return Pm() == 1;
    }

    public static void IPb() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - Td <= 10000) {
            return;
        }
        Td = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.xt.EYQ(new com.bytedance.sdk.component.VwS.QQ("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.pi.1
            @Override // java.lang.Runnable
            public void run() {
                String strTd = com.bytedance.sdk.openadsdk.core.settings.KO.Td(hu.EYQ());
                if (TextUtils.equals(strTd, com.bytedance.sdk.openadsdk.core.settings.KO.EYQ)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().EYQ(6, true);
                com.bytedance.sdk.openadsdk.core.settings.KO.EYQ = strTd;
            }
        });
    }
}
