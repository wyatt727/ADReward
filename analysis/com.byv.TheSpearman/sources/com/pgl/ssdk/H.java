package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class H implements SensorEventListener {
    private static H f;

    /* renamed from: a, reason: collision with root package name */
    private SensorManager f4290a;
    private int b;
    private int c = 0;
    private float[] d = new float[3];
    private List e = new ArrayList();

    private H(Context context) {
        this.f4290a = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            try {
                this.f4290a = (SensorManager) applicationContext.getSystemService("sensor");
            } catch (Throwable unused) {
            }
        }
    }

    public static H a(Context context) {
        if (f == null) {
            synchronized (H.class) {
                if (f == null) {
                    f = new H(context);
                }
            }
        }
        return f;
    }

    private synchronized void c() {
        try {
            SensorManager sensorManager = this.f4290a;
            if (sensorManager != null) {
                int i = this.b - 1;
                this.b = i;
                if (i == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[Catch: all -> 0x001f, Exception -> 0x0022, TRY_LEAVE, TryCatch #6 {Exception -> 0x0022, blocks: (B:4:0x0004, B:6:0x0008, B:8:0x000c, B:10:0x0019), top: B:49:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.H.a():void");
    }

    public synchronized String b() {
        String strSubstring = "";
        int size = this.e.size();
        if (size <= 0) {
            return "";
        }
        if (size == 1) {
            return (String) this.e.get(0);
        }
        try {
            List list = this.e;
            int i = size - 10;
            if (i <= 0) {
                i = 0;
            }
            List listSubList = list.subList(i, size);
            for (int i2 = 0; i2 < listSubList.size(); i2++) {
                strSubstring = strSubstring + ((String) listSubList.get(i2)) + "|";
            }
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        } catch (Throwable unused) {
        }
        return strSubstring;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.d = sensorEvent.values;
        this.c = 1;
    }
}
