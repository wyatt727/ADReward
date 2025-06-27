package com.bytedance.sdk.component.Kbd.EYQ.VwS;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: TimerUtils.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static volatile HandlerThread EYQ = null;
    private static int Td = 3000;
    private static volatile Handler mZx;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        EYQ = handlerThread;
        handlerThread.start();
    }

    public static Handler EYQ() {
        if (EYQ == null || !EYQ.isAlive()) {
            synchronized (EYQ.class) {
                if (EYQ == null || !EYQ.isAlive()) {
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    EYQ = handlerThread;
                    handlerThread.start();
                    mZx = new Handler(EYQ.getLooper());
                }
            }
        } else if (mZx == null) {
            synchronized (EYQ.class) {
                if (mZx == null) {
                    mZx = new Handler(EYQ.getLooper());
                }
            }
        }
        return mZx;
    }

    public static int mZx() {
        if (Td <= 0) {
            Td = 3000;
        }
        return Td;
    }
}
