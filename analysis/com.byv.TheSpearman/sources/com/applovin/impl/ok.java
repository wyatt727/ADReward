package com.applovin.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import com.applovin.impl.ko;
import com.applovin.impl.ug;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class ok extends GLSurfaceView {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f761a;
    private final SensorManager b;
    private final Sensor c;
    private final ug d;
    private final Handler f;
    private final ko g;
    private final zi h;
    private SurfaceTexture i;
    private Surface j;
    private boolean k;
    private boolean l;
    private boolean m;

    public interface b {
        void a(Surface surface);

        void b(Surface surface);
    }

    public ok(Context context) {
        this(context, null);
    }

    public Surface getVideoSurface() {
        return this.j;
    }

    public vq getVideoFrameMetadataListener() {
        return this.h;
    }

    public t2 getCameraMotionListener() {
        return this.h;
    }

    public void setDefaultStereoMode(int i) {
        this.h.a(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.k = z;
        b();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.l = true;
        b();
    }

    public ok(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f761a = new CopyOnWriteArrayList();
        this.f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) a1.a(context.getSystemService("sensor"));
        this.b = sensorManager;
        Sensor defaultSensor = yp.f1214a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        zi ziVar = new zi();
        this.h = ziVar;
        a aVar = new a(ziVar);
        ko koVar = new ko(context, aVar, 25.0f);
        this.g = koVar;
        this.d = new ug(((WindowManager) a1.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), koVar, aVar);
        this.k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(koVar);
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.l = false;
        b();
        super.onPause();
    }

    public void a(b bVar) {
        this.f761a.add(bVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.post(new Runnable() { // from class: com.applovin.impl.ok$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final SurfaceTexture surfaceTexture) {
        this.f.post(new Runnable() { // from class: com.applovin.impl.ok$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(surfaceTexture);
            }
        });
    }

    final class a implements GLSurfaceView.Renderer, ko.a, ug.a {

        /* renamed from: a, reason: collision with root package name */
        private final zi f762a;
        private final float[] d;
        private final float[] e;
        private final float[] f;
        private float g;
        private float h;
        private final float[] b = new float[16];
        private final float[] c = new float[16];
        private final float[] i = new float[16];
        private final float[] j = new float[16];

        public a(zi ziVar) {
            float[] fArr = new float[16];
            this.d = fArr;
            float[] fArr2 = new float[16];
            this.e = fArr2;
            float[] fArr3 = new float[16];
            this.f = fArr3;
            this.f762a = ziVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.h = 3.1415927f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            ok.this.b(this.f762a.b());
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.b, 0, a(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
            }
            Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
            this.f762a.a(this.c, false);
        }

        @Override // com.applovin.impl.ko.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return ok.this.performClick();
        }

        private float a(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d);
            }
            return 90.0f;
        }

        @Override // com.applovin.impl.ug.a
        public synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.h = -f;
            a();
        }

        @Override // com.applovin.impl.ko.a
        public synchronized void a(PointF pointF) {
            this.g = pointF.y;
            a();
            Matrix.setRotateM(this.f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        private void a() {
            Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(this.h), (float) Math.sin(this.h), 0.0f);
        }
    }

    public void b(b bVar) {
        this.f761a.remove(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        Surface surface = this.j;
        if (surface != null) {
            Iterator it = this.f761a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(surface);
            }
        }
        a(this.i, surface);
        this.i = null;
        this.j = null;
    }

    private void b() {
        boolean z = this.k && this.l;
        Sensor sensor = this.c;
        if (sensor == null || z == this.m) {
            return;
        }
        if (z) {
            this.b.registerListener(this.d, sensor, 0);
        } else {
            this.b.unregisterListener(this.d);
        }
        this.m = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.i;
        Surface surface = this.j;
        Surface surface2 = new Surface(surfaceTexture);
        this.i = surfaceTexture;
        this.j = surface2;
        Iterator it = this.f761a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(surface2);
        }
        a(surfaceTexture2, surface);
    }

    private static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
