package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.player.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1534s {
    private static CameraManager B;
    private static String[] C;
    private static Semaphore D = new Semaphore(1);

    /* renamed from: a, reason: collision with root package name */
    private com.unity3d.player.a.a f4408a;
    private CameraDevice b;
    private HandlerThread c;
    private Handler d;
    private Rect e;
    private Rect f;
    private int g;
    private int h;
    private int k;
    private int l;
    private Range n;
    private Image p;
    private CaptureRequest.Builder q;
    private int t;
    private SurfaceTexture u;
    private float i = -1.0f;
    private float j = -1.0f;
    private boolean m = false;
    private ImageReader o = null;
    private CameraCaptureSession r = null;
    private Object s = new Object();
    private Surface v = null;
    private EnumC1533r w = EnumC1533r.c;
    private CameraCaptureSession.CaptureCallback x = new C1528m(this);
    private final CameraDevice.StateCallback y = new C1530o(this);
    private final ImageReader.OnImageAvailableListener z = new C1531p(this);
    private final SurfaceTexture.OnFrameAvailableListener A = new C1532q(this);

    protected C1534s(com.unity3d.player.a.a aVar) {
        this.f4408a = null;
        this.f4408a = aVar;
        d();
    }

    public static int a(Context context) {
        return b(context).length;
    }

    public static int a(Context context, int i) throws CameraAccessException {
        try {
            CameraCharacteristics cameraCharacteristics = c(context).getCameraCharacteristics(b(context)[i]);
            float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (fArr.length > 0) {
                return (int) ((fArr[0] * 36.0f) / sizeF.getWidth());
            }
        } catch (CameraAccessException e) {
            AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CameraDevice cameraDevice) {
        synchronized (this.s) {
            this.r = null;
        }
        cameraDevice.close();
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        if (obj != "Focus") {
            if (obj == "Cancel focus") {
                synchronized (this.s) {
                    if (this.r != null) {
                        f();
                    }
                }
                return;
            }
            return;
        }
        this.m = false;
        synchronized (this.s) {
            if (this.r != null) {
                try {
                    this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    this.q.setTag("Regular");
                    this.r.setRepeatingRequest(this.q.build(), this.x, this.d);
                } catch (CameraAccessException e) {
                    AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e);
                }
            }
        }
    }

    private static Size[] a(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            AbstractC1536u.Log(6, "Camera2: configuration map is not available.");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        return outputSizes;
    }

    public static int[] b(Context context, int i) {
        try {
            Size[] sizeArrA = a(c(context).getCameraCharacteristics(b(context)[i]));
            if (sizeArrA == null) {
                return null;
            }
            int[] iArr = new int[sizeArrA.length * 2];
            for (int i2 = 0; i2 < sizeArrA.length; i2++) {
                int i3 = i2 * 2;
                iArr[i3] = sizeArrA[i2].getWidth();
                iArr[i3 + 1] = sizeArrA[i2].getHeight();
            }
            return iArr;
        } catch (CameraAccessException e) {
            AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e);
            return null;
        }
    }

    private static String[] b(Context context) {
        if (C == null) {
            try {
                C = c(context).getCameraIdList();
            } catch (CameraAccessException e) {
                AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e);
                C = new String[0];
            }
        }
        return C;
    }

    public static int c(Context context, int i) {
        try {
            return ((Integer) c(context).getCameraCharacteristics(b(context)[i]).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } catch (CameraAccessException e) {
            AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e);
            return 0;
        }
    }

    private static CameraManager c(Context context) {
        if (B == null) {
            B = (CameraManager) context.getSystemService("camera");
        }
        return B;
    }

    private void d() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(this.c.getLooper());
    }

    public static boolean d(Context context, int i) {
        try {
            return ((Integer) c(context).getCameraCharacteristics(b(context)[i]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
        } catch (CameraAccessException e) {
            AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    private void e() throws CameraAccessException {
        try {
            CameraCaptureSession cameraCaptureSession = this.r;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
                this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.q.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.q.setTag("Cancel focus");
                this.r.capture(this.q.build(), this.x, this.d);
            }
        } catch (CameraAccessException e) {
            AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    public static boolean e(Context context, int i) {
        try {
            return ((Integer) c(context).getCameraCharacteristics(b(context)[i]).get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        } catch (CameraAccessException e) {
            AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bc A[Catch: CameraAccessException -> 0x00e1, TryCatch #0 {CameraAccessException -> 0x00e1, blocks: (B:2:0x0000, B:4:0x0004, B:8:0x0011, B:13:0x001d, B:14:0x00bc, B:16:0x00d3), top: B:22:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() throws android.hardware.camera2.CameraAccessException {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.C1534s.f():void");
    }

    public void a() {
        if (this.b != null) {
            h();
            try {
                Semaphore semaphore = D;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (semaphore.tryAcquire(4L, timeUnit)) {
                    this.b.close();
                    try {
                        if (!D.tryAcquire(4L, timeUnit)) {
                            AbstractC1536u.Log(5, "Camera2: Timeout waiting to close camera.");
                        }
                    } catch (InterruptedException e) {
                        AbstractC1536u.Log(6, "Camera2: Interrupted while waiting to close camera " + e);
                    }
                    this.b = null;
                    D.release();
                } else {
                    AbstractC1536u.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                }
            } catch (InterruptedException e2) {
                AbstractC1536u.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + e2);
            }
            this.x = null;
            this.v = null;
            this.u = null;
            Image image = this.p;
            if (image != null) {
                image.close();
                this.p = null;
            }
            ImageReader imageReader = this.o;
            if (imageReader != null) {
                imageReader.close();
                this.o = null;
            }
        }
        this.c.quit();
        try {
            this.c.join(4000L);
            this.c = null;
            this.d = null;
        } catch (InterruptedException e3) {
            this.c.interrupt();
            AbstractC1536u.Log(6, "Camera2: Interrupted while waiting for the background thread to finish " + e3);
        }
    }

    public boolean a(float f, float f2) {
        if (this.h <= 0) {
            return false;
        }
        if (this.m) {
            AbstractC1536u.Log(5, "Camera2: Setting manual focus point already started.");
            return false;
        }
        this.i = f;
        this.j = f2;
        synchronized (this.s) {
            if (this.r != null && this.w != EnumC1533r.b) {
                e();
            }
        }
        return true;
    }

    public Rect b() {
        return this.e;
    }

    public void c() {
        synchronized (this.s) {
            CameraCaptureSession cameraCaptureSession = this.r;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.stopRepeating();
                    this.w = EnumC1533r.b;
                } catch (CameraAccessException e) {
                    AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e);
                }
            }
        }
    }

    public void g() throws CameraAccessException {
        Surface surface;
        if (this.t != 0) {
            if (this.v == null) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.t);
                this.u = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.e.width(), this.e.height());
                this.u.setOnFrameAvailableListener(this.A, this.d);
                surface = new Surface(this.u);
                this.v = surface;
            }
        } else if (this.v == null && this.o == null) {
            ImageReader imageReaderNewInstance = ImageReader.newInstance(this.e.width(), this.e.height(), 35, 2);
            this.o = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(this.z, this.d);
            this.p = null;
            surface = this.o.getSurface();
            this.v = surface;
        }
        try {
            CameraCaptureSession cameraCaptureSession = this.r;
            if (cameraCaptureSession == null) {
                this.b.createCaptureSession(Arrays.asList(this.v), new C1529n(this), this.d);
            } else if (this.w == EnumC1533r.b) {
                cameraCaptureSession.setRepeatingRequest(this.q.build(), this.x, this.d);
            }
            this.w = EnumC1533r.f4407a;
        } catch (CameraAccessException e) {
            AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    public void h() {
        synchronized (this.s) {
            CameraCaptureSession cameraCaptureSession = this.r;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.abortCaptures();
                } catch (CameraAccessException e) {
                    AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e);
                }
                this.r.close();
                this.r = null;
                this.w = EnumC1533r.c;
            }
        }
    }

    public boolean a(Context context, int i, int i2, int i3, int i4, int i5, Surface surface) throws CameraAccessException {
        int iIntValue = i4;
        try {
            CameraCharacteristics cameraCharacteristics = B.getCameraCharacteristics(b(context)[i]);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                AbstractC1536u.Log(5, "Camera2: only LEGACY hardware level is supported.");
                return false;
            }
            Size[] sizeArrA = a(cameraCharacteristics);
            if (sizeArrA == null || sizeArrA.length == 0) {
                return false;
            }
            double d = i2;
            double d2 = i3;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            double d3 = Double.MAX_VALUE;
            while (i6 < sizeArrA.length) {
                int width = sizeArrA[i6].getWidth();
                int height = sizeArrA[i6].getHeight();
                CameraCharacteristics cameraCharacteristics2 = cameraCharacteristics;
                double d4 = d;
                double dAbs = Math.abs(Math.log(d / width)) + Math.abs(Math.log(d2 / height));
                if (dAbs < d3) {
                    i7 = height;
                    d3 = dAbs;
                    i8 = width;
                }
                i6++;
                cameraCharacteristics = cameraCharacteristics2;
                d = d4;
            }
            CameraCharacteristics cameraCharacteristics3 = cameraCharacteristics;
            this.e = new Rect(0, 0, i8, i7);
            Range[] rangeArr = (Range[]) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr == null || rangeArr.length == 0) {
                AbstractC1536u.Log(6, "Camera2: target FPS ranges are not avialable.");
                return false;
            }
            int i9 = -1;
            int i10 = 0;
            double d5 = Double.MAX_VALUE;
            while (true) {
                if (i10 < rangeArr.length) {
                    int iIntValue2 = ((Integer) rangeArr[i10].getLower()).intValue();
                    int iIntValue3 = ((Integer) rangeArr[i10].getUpper()).intValue();
                    float f = iIntValue;
                    if (f + 0.1f > iIntValue2 && f - 0.1f < iIntValue3) {
                        break;
                    }
                    if (dMin < d5) {
                        i9 = i10;
                        d5 = dMin;
                    }
                    i10++;
                } else {
                    iIntValue = ((Integer) (iIntValue > ((Integer) rangeArr[i9].getUpper()).intValue() ? rangeArr[i9].getUpper() : rangeArr[i9].getLower())).intValue();
                }
            }
            this.n = new Range(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            try {
                Semaphore semaphore = D;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (!semaphore.tryAcquire(4L, timeUnit)) {
                    AbstractC1536u.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                    return false;
                }
                try {
                    B.openCamera(b(context)[i], this.y, this.d);
                    try {
                    } catch (InterruptedException e) {
                        AbstractC1536u.Log(6, "Camera2: Interrupted while waiting to open camera " + e);
                    }
                    if (!D.tryAcquire(4L, timeUnit)) {
                        AbstractC1536u.Log(5, "Camera2: Timeout waiting to open camera.");
                        return false;
                    }
                    D.release();
                    this.t = i5;
                    this.v = surface;
                    int iIntValue4 = ((Integer) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
                    this.h = iIntValue4;
                    if (iIntValue4 > 0) {
                        this.f = (Rect) cameraCharacteristics3.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        float fWidth = this.e.width() / this.e.height();
                        if (fWidth > r0.width() / this.f.height()) {
                            this.k = 0;
                            this.l = (int) ((this.f.height() - (this.f.width() / fWidth)) / 2.0f);
                        } else {
                            this.l = 0;
                            this.k = (int) ((this.f.width() - (this.f.height() * fWidth)) / 2.0f);
                        }
                        this.g = Math.min(this.f.width(), this.f.height()) / 20;
                    }
                    return this.b != null;
                } catch (CameraAccessException e2) {
                    AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e2);
                    D.release();
                    return false;
                }
            } catch (InterruptedException e3) {
                AbstractC1536u.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + e3);
                return false;
            }
        } catch (CameraAccessException e4) {
            AbstractC1536u.Log(6, "Camera2: CameraAccessException " + e4);
            return false;
        }
    }
}
