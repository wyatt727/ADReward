package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.k;

/* compiled from: NativeShakeManager.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private SensorManager f3465a;

    /* compiled from: NativeShakeManager.java */
    /* renamed from: com.mbridge.msdk.shake.a$a, reason: collision with other inner class name */
    private static class C0298a {

        /* renamed from: a, reason: collision with root package name */
        static a f3466a = new a();
    }

    private a() {
    }

    public static a a() {
        return C0298a.f3466a;
    }

    public final void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f3465a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void a(SensorEventListener sensorEventListener) {
        Context contextC = c.m().c();
        if (contextC != null) {
            try {
                if (this.f3465a == null) {
                    this.f3465a = (SensorManager) contextC.getSystemService("sensor");
                }
                this.f3465a.registerListener(sensorEventListener, this.f3465a.getDefaultSensor(1), 2);
            } catch (Exception e) {
                e.printStackTrace();
                String message = e.getMessage();
                if (contextC != null) {
                    try {
                        if (TextUtils.isEmpty(message)) {
                            return;
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("key=2000106&");
                        if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U)) {
                            stringBuffer.append("b=" + com.mbridge.msdk.foundation.same.a.U + t2.i.c);
                        }
                        if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                            stringBuffer.append("c=" + com.mbridge.msdk.foundation.same.a.g + t2.i.c);
                        }
                        stringBuffer.append("reason=" + message);
                        if (e.a().b()) {
                            e.a().a(stringBuffer.toString());
                        } else {
                            k.b(contextC, stringBuffer.toString());
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }
}
