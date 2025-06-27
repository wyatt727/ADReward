package com.facebook.ads.redexgen.uinode;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Hk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0773Hk implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static byte[] A06;
    public static String[] A07 = {"5TSO5lr", "Uiq36pf0DX0u", "dNHqZ55iPnem4y3dhzVH4NhC", "DOJEdaaUqp1LV7wfBlv79qDRQsxW0GTY", "guLhPKZ6AS5yiDivKc9wkx6W", "v4VlaWQwn4OHm3pLjlth", "v4A3PsxLBQ1NNAoAwErdhJ5LwmF6", "7Ce6kiHf90JXyVCEwcuj9iqZ78CWnN5B"};
    public static final int[] A08;
    public SurfaceTexture A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = new int[1];

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{4, 6, 11, -30, 7, 14, 14, 18, 4, -30, 14, 13, 5, 8, 6, -65, 5, 0, 8, 11, 4, 3, -39, -65, 18, 20, 2, 2, 4, 18, 18, -36, -60, 1, -53, -65, 13, 20, 12, -30, 14, 13, 5, 8, 6, 18, -6, -49, -4, -36, -60, 3, -53, -65, 2, 14, 13, 5, 8, 6, 18, -6, -49, -4, -36, -60, 18, 0, 2, 7, -34, 13, 0, -4, 15, 0, -34, 10, 9, 15, 0, 19, 15, -69, 1, -4, 4, 7, 0, -1, 50, 52, 57, 16, Utf8.REPLACEMENT_BYTE, 50, 46, 65, 50, 29, 47, 66, 51, 51, 50, Utf8.REPLACEMENT_BYTE, 32, 66, Utf8.REPLACEMENT_BYTE, 51, 46, 48, 50, -19, 51, 46, 54, 57, 50, 49, 39, 41, 46, 9, 39, 54, 6, 43, 53, 50, 46, 35, 59, -30, 40, 35, 43, 46, 39, 38, 7, 9, 14, -21, 16, 11, 22, 11, 3, 14, 11, 28, 7, -62, 8, 3, 11, 14, 7, 6, 23, 25, 30, -1, 19, 29, 23, -11, 39, 36, 36, 23, 32, 38, -46, 24, 19, 27, 30, 23, 22, -35, -30, -67, -37, -28, -54, -37, -18, -22, -21, -24, -37, -23, -106, -36, -41, -33, -30, -37, -38, -92, -106, -69, -24, -24, -27, -24, -80, -106};
    }

    static {
        A05();
        A08 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public RunnableC0773Hk(Handler handler) {
        this.A04 = handler;
    }

    public static EGLConfig A00(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, A08, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new C0771Hi(IF.A0P(A04(0, 67, 61), Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    public static EGLContext A01(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        if (i != 0) {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        } else {
            iArr = new int[]{12440, 2, 12344};
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new C0771Hi(A04(67, 23, 57));
    }

    public static EGLDisplay A02() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new C0771Hi(A04(120, 20, 96));
        }
        int[] iArr = new int[2];
        boolean eglInitialized = EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
        if (!eglInitialized) {
            throw new C0771Hi(A04(140, 20, 64));
        }
        return eGLDisplayEglGetDisplay;
    }

    public static EGLSurface A03(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        int[] iArr;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                String[] strArr = A07;
                if (strArr[2].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[5] = "50bPomhroWylyyFBvpVs";
                strArr2[0] = "L3rJnP7";
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new C0771Hi(A04(90, 30, 107));
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            throw new C0771Hi(A04(Opcodes.IF_ICMPNE, 21, 80));
        }
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static void A06(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
        } else {
            throw new C0771Hi(A04(Opcodes.PUTFIELD, 29, 20) + Integer.toHexString(iGlGetError));
        }
    }

    public final SurfaceTexture A07() {
        return (SurfaceTexture) AbstractC0763Ha.A01(this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A08() {
        EGLSurface eGLSurface;
        boolean zEquals;
        EGLSurface eGLSurface2;
        this.A04.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.A00;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.A05, 0);
            }
            EGLDisplay eGLDisplay = this.A02;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.A02, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            eGLSurface2 = this.A03;
        } finally {
            if (eGLSurface != null) {
                if (!zEquals) {
                    throw new RuntimeException();
                }
            }
        }
        if (eGLSurface2 != null) {
            EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
            String[] strArr = A07;
            if (strArr[2].length() == strArr[4].length()) {
                String[] strArr2 = A07;
                strArr2[6] = "8PllVlNdMAAu4TKgTKAS29fkCg54";
                strArr2[1] = "Tgpvj88vDtzw";
                if (!eGLSurface2.equals(eGLSurface3)) {
                    EGL14.eglDestroySurface(this.A02, this.A03);
                }
            }
            throw new RuntimeException();
        }
        EGLContext eGLContext = this.A01;
        if (eGLContext != null) {
            EGL14.eglDestroyContext(this.A02, eGLContext);
        }
        if (IF.A02 >= 19) {
            EGL14.eglReleaseThread();
        }
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
        this.A00 = null;
    }

    public final void A09(int i) {
        EGLDisplay eGLDisplayA02 = A02();
        this.A02 = eGLDisplayA02;
        EGLConfig eGLConfigA00 = A00(eGLDisplayA02);
        EGLContext eGLContextA01 = A01(this.A02, eGLConfigA00, i);
        this.A01 = eGLContextA01;
        this.A03 = A03(this.A02, eGLConfigA00, eGLContextA01, i);
        A06(this.A05);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.A05[0]);
        this.A00 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            SurfaceTexture surfaceTexture = this.A00;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
