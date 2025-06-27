package com.my.tracker.obfuscated;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.my.tracker.config.AntiFraudConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class w0 {
    final p b;
    final AntiFraudConfig c;
    final Context d;
    a e;
    Runnable f;
    Runnable g;

    /* renamed from: a, reason: collision with root package name */
    final AtomicInteger f4270a = new AtomicInteger();
    long h = -1;

    static final class a implements SensorEventListener {

        /* renamed from: a, reason: collision with root package name */
        private final p f4271a;
        private final SensorManager b;
        private final AntiFraudConfig c;
        private final ArrayList<Sensor> d = new ArrayList<>();

        a(p pVar, SensorManager sensorManager, AntiFraudConfig antiFraudConfig) {
            this.f4271a = pVar;
            this.b = sensorManager;
            this.c = antiFraudConfig;
        }

        public static a a(p pVar, Context context, AntiFraudConfig antiFraudConfig) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager == null) {
                return null;
            }
            return new a(pVar, sensorManager, antiFraudConfig);
        }

        public void a() {
            z0.a("SensorEventListenerImpl: start()");
            int[] iArr = {5, 2, 4, 6, 8};
            for (int i = 0; i < 5; i++) {
                int i2 = iArr[i];
                if (!((i2 == 5 && !this.c.useLightSensor) || (i2 == 2 && !this.c.useMagneticFieldSensor) || ((i2 == 4 && !this.c.useGyroscope) || ((i2 == 6 && !this.c.usePressureSensor) || (i2 == 8 && !this.c.useProximitySensor))))) {
                    try {
                        Sensor defaultSensor = this.b.getDefaultSensor(i2);
                        if (defaultSensor != null) {
                            this.b.registerListener(this, defaultSensor, 1000000);
                            this.d.add(defaultSensor);
                        }
                    } catch (Throwable th) {
                        z0.a("SensorEventListenerImpl: exception at register listener: " + th);
                    }
                }
            }
        }

        public void b() {
            z0.a("SensorEventListenerImpl: stop()");
            Iterator<Sensor> it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    this.b.unregisterListener(this, it.next());
                } catch (Throwable th) {
                    z0.a("SensorEventListenerImpl: exception at unregister listener: " + th);
                }
            }
            this.d.clear();
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            StringBuilder sb;
            float f;
            int type = sensorEvent.sensor.getType();
            if (type == 2) {
                p pVar = this.f4271a;
                float[] fArr = sensorEvent.values;
                pVar.b(fArr[0], fArr[1], fArr[2]);
                sb = new StringBuilder();
                sb.append("SensorHandler: magnetometer - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f = sensorEvent.values[2];
            } else if (type == 8) {
                this.f4271a.c(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: proximity - ");
                f = sensorEvent.values[0];
            } else if (type == 4) {
                p pVar2 = this.f4271a;
                float[] fArr2 = sensorEvent.values;
                pVar2.a(fArr2[0], fArr2[1], fArr2[2]);
                sb = new StringBuilder();
                sb.append("SensorHandler: gyroscope - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f = sensorEvent.values[2];
            } else if (type == 5) {
                this.f4271a.a(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: light - ");
                f = sensorEvent.values[0];
            } else {
                if (type != 6) {
                    return;
                }
                this.f4271a.b(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: pressure - ");
                f = sensorEvent.values[0];
            }
            sb.append(f);
            z0.a(sb.toString());
        }
    }

    w0(p pVar, AntiFraudConfig antiFraudConfig, Context context) {
        this.b = pVar;
        this.c = antiFraudConfig;
        this.d = context.getApplicationContext();
    }

    public static w0 a(p pVar, AntiFraudConfig antiFraudConfig, Context context) {
        return new w0(pVar, antiFraudConfig, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        if (!this.f4270a.compareAndSet(2, 1)) {
            z0.a("SensorHandler: handle isn't running");
        } else {
            this.e.b();
            this.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.w0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j) {
        if (!this.f4270a.compareAndSet(1, 2)) {
            z0.a("SensorHandler: handler can't start, current state: " + this.f4270a.get());
            return;
        }
        if (this.e == null) {
            z0.a("SensorHandler: handler can't start, sensor event listener is null");
        } else if (y0.a() - j > 259200) {
            z0.a(String.format(Locale.ENGLISH, "SensorHandler: more than %d seconds passed since the app was installed", 259200));
        } else {
            this.e.a();
            g.f4225a.postDelayed(this.f, 20000L);
        }
    }

    public void a(final long j) {
        if (j <= 0) {
            z0.a("SensorHandler: install timestamp is empty, do nothing");
            return;
        }
        if (!this.f4270a.compareAndSet(0, 1)) {
            z0.a("SensorHandler: handler has already been initialized");
            return;
        }
        a aVarA = a.a(this.b, this.d.getApplicationContext(), this.c);
        this.e = aVarA;
        if (aVarA == null) {
            z0.a("SensorHandler: sensor event listener is null");
            return;
        }
        this.f = new Runnable() { // from class: com.my.tracker.obfuscated.w0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        };
        this.g = new Runnable() { // from class: com.my.tracker.obfuscated.w0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(j);
            }
        };
        this.h = j;
        z0.a("SensorHandler: initialized");
        this.g.run();
    }

    public void c() {
        Runnable runnable = this.g;
        if (runnable == null) {
            z0.a("SensorHandler: can't start, startRunnable is null");
        } else {
            g.a(runnable);
        }
    }
}
