package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;

/* compiled from: BatteryDataWatcher.java */
/* loaded from: classes2.dex */
public class Kbd {
    static int EYQ = -1;
    private static long Td;
    static float mZx;

    private static void EYQ(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            EYQ = 1;
        } else {
            EYQ = 0;
        }
        mZx = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static EYQ EYQ() {
        if (Td == 0 || SystemClock.elapsedRealtime() - Td > 60000) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.hu.EYQ().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                EYQ(intentRegisterReceiver);
                Td = SystemClock.elapsedRealtime();
            }
        }
        EYQ eyq = new EYQ(EYQ, mZx);
        int i = eyq.EYQ;
        float f = eyq.mZx;
        return eyq;
    }

    /* compiled from: BatteryDataWatcher.java */
    public static class EYQ {
        public final int EYQ;
        public final float mZx;

        public EYQ(int i, float f) {
            this.EYQ = i;
            this.mZx = f;
        }
    }
}
