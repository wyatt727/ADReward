package com.bytedance.adsdk.lottie.IPb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import com.bytedance.adsdk.lottie.EYQ.EYQ.WU;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class IPb {
    private static final ThreadLocal<PathMeasure> EYQ = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.lottie.IPb.IPb.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> mZx = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lottie.IPb.IPb.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> Td = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lottie.IPb.IPb.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> Pm = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.lottie.IPb.IPb.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float Kbd = (float) (Math.sqrt(2.0d) / 2.0d);

    public static int EYQ(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    public static boolean EYQ(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    public static Path EYQ(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void EYQ(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float EYQ(Matrix matrix) {
        float[] fArr = Pm.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = Kbd;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean mZx(Matrix matrix) {
        float[] fArr = Pm.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void EYQ(Path path, WU wu) {
        if (wu == null || wu.IPb()) {
            return;
        }
        EYQ(path, ((com.bytedance.adsdk.lottie.EYQ.mZx.Pm) wu.Td()).HX() / 100.0f, ((com.bytedance.adsdk.lottie.EYQ.mZx.Pm) wu.Pm()).HX() / 100.0f, ((com.bytedance.adsdk.lottie.EYQ.mZx.Pm) wu.Kbd()).HX() / 360.0f);
    }

    public static void EYQ(Path path, float f, float f2, float f3) {
        com.bytedance.adsdk.lottie.Kbd.EYQ("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = EYQ.get();
        Path path2 = mZx.get();
        Path path3 = Td.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            com.bytedance.adsdk.lottie.Kbd.mZx("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            com.bytedance.adsdk.lottie.Kbd.mZx("applyTrimPathIfNeeded");
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = Kbd.EYQ(fMin, length);
            fMax = Kbd.EYQ(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = Kbd.EYQ(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = Kbd.EYQ(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            com.bytedance.adsdk.lottie.Kbd.mZx("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        com.bytedance.adsdk.lottie.Kbd.mZx("applyTrimPathIfNeeded");
    }

    public static float EYQ() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float EYQ(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        return Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap EYQ(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean EYQ(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void EYQ(Canvas canvas, RectF rectF, Paint paint) {
        EYQ(canvas, rectF, paint, 31);
    }

    public static void EYQ(Canvas canvas, RectF rectF, Paint paint, int i) {
        com.bytedance.adsdk.lottie.Kbd.EYQ("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        com.bytedance.adsdk.lottie.Kbd.mZx("Utils#saveLayer");
    }
}
