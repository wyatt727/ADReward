package com.bytedance.sdk.openadsdk.tsL;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;

/* compiled from: SensorHub.java */
/* loaded from: classes2.dex */
public class tp {
    public static EYQ EYQ;
    protected static final float[] mZx = new float[3];
    protected static final float[] Td = new float[3];
    protected static final float[] Pm = new float[9];
    protected static final float[] Kbd = new float[3];

    public static void EYQ(Context context, SensorEventListener sensorEventListener) {
    }

    public static void EYQ(Context context, SensorEventListener sensorEventListener, int i) {
    }

    public static void Pm(Context context, SensorEventListener sensorEventListener, int i) {
    }

    public static void Td(Context context, SensorEventListener sensorEventListener, int i) {
    }

    public static void mZx(Context context, SensorEventListener sensorEventListener, int i) {
    }

    public static void EYQ(EYQ eyq) {
        EYQ = eyq;
    }

    public static void EYQ(Context context, long j) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }
}
