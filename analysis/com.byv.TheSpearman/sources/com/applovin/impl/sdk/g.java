package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final k f927a;
    private final t b;
    private final long c;
    private final long d;
    private final int e;
    private final int f;
    private final int g;
    private Handler k;
    private HandlerThread l;
    private c n;
    private WeakReference h = new WeakReference(null);
    private int i = 0;
    private Integer j = null;
    private final Runnable m = new Runnable() { // from class: com.applovin.impl.sdk.g$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.a();
        }
    };

    class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f929a;
        final /* synthetic */ Bitmap b;

        b(d dVar, Bitmap bitmap) {
            this.f929a = dVar;
            this.b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i) {
            if (i == 0) {
                this.f929a.a(this.b);
                return;
            }
            t unused = g.this.b;
            if (t.a()) {
                g.this.b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i);
            }
            this.f929a.a(true);
        }
    }

    public interface c {
        void a(View view);
    }

    private interface d {
        void a(Bitmap bitmap);

        void a(boolean z);
    }

    public g(k kVar) {
        this.f927a = kVar;
        this.b = kVar.L();
        this.c = ((Long) kVar.a(oj.a6)).longValue();
        this.d = ((Long) kVar.a(oj.Z5)).longValue();
        this.e = ((Integer) kVar.a(oj.b6)).intValue();
        this.f = ((Integer) kVar.a(oj.c6)).intValue();
        this.g = ((Integer) kVar.a(oj.d6)).intValue();
    }

    static /* synthetic */ int e(g gVar) {
        int i = gVar.i;
        gVar.i = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long j = this.c;
        if (j <= 0) {
            if (this.i == 1) {
                e();
            }
            g();
        } else {
            if (this.i > 1) {
                e();
                g();
                return;
            }
            Handler handler = this.k;
            if (handler != null) {
                handler.postDelayed(this.m, j);
                return;
            }
            if (t.a()) {
                this.b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            g();
        }
    }

    private void e() {
        final View view = (View) this.h.get();
        if (t.a()) {
            this.b.k("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.g$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.i = 0;
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.h.get() != null) {
            if (t.a()) {
                this.b.a("BlackViewDetector", "Stopped monitoring view: " + this.h.get());
            }
            this.h.clear();
        }
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacks(this.m);
            this.k = null;
        }
        if (this.n != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.g$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            });
        }
    }

    public void b() {
        g();
        HandlerThread handlerThread = this.l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.l = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f927a.a(oj.Y5)).booleanValue()) {
            View view2 = (View) this.h.get();
            if (view2 != null) {
                if (t.a()) {
                    this.b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (t.a()) {
                this.b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.l == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.l = handlerThread;
                    handlerThread.start();
                } else {
                    this.f927a.B().a(o.b.BLACK_VIEW, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    g();
                }
                this.n = cVar;
                this.h = new WeakReference(view);
                f();
                Handler handler = new Handler(this.l.getLooper());
                this.k = handler;
                handler.postDelayed(this.m, this.d);
            } catch (Throwable th) {
                g();
                this.f927a.B().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f928a;
        final /* synthetic */ int b;

        a(int i, int i2) {
            this.f928a = i;
            this.b = i2;
        }

        @Override // com.applovin.impl.sdk.g.d
        public void a(Bitmap bitmap) {
            int i = this.f928a / g.this.e;
            int i2 = this.b / g.this.e;
            int i3 = i / 2;
            for (int i4 = i2 / 2; i4 < this.b; i4 += i2) {
                for (int i5 = i3; i5 < this.f928a; i5 += i) {
                    int pixel = bitmap.getPixel(i5, i4);
                    if (g.this.a(pixel)) {
                        bitmap.recycle();
                        g.this.f();
                        g.this.d();
                        return;
                    }
                    if (g.this.j == null) {
                        g.this.j = Integer.valueOf(pixel);
                    }
                }
            }
            g.e(g.this);
            bitmap.recycle();
            g.this.d();
        }

        @Override // com.applovin.impl.sdk.g.d
        public void a(boolean z) {
            if (z) {
                g.this.g();
            } else {
                g.this.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.h.get();
        if (view == null) {
            if (t.a()) {
                this.b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            g();
            return;
        }
        Long l = (Long) this.f927a.a(oj.h6);
        if (l.longValue() > 0 && (memoryInfoA = zp.a((ActivityManager) k.k().getSystemService("activity"))) != null && memoryInfoA.availMem < l.longValue()) {
            if (t.a()) {
                this.b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (t.a()) {
            this.b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a(measuredWidth, measuredHeight));
            return;
        }
        if (t.a()) {
            this.b.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        f();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        c cVar = this.n;
        if (cVar != null) {
            cVar.a(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r9) {
        /*
            r8 = this;
            int r0 = android.graphics.Color.red(r9)
            int r1 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            java.lang.Integer r2 = r8.j
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4e
            int r2 = r2.intValue()
            int r2 = android.graphics.Color.red(r2)
            java.lang.Integer r5 = r8.j
            int r5 = r5.intValue()
            int r5 = android.graphics.Color.green(r5)
            java.lang.Integer r6 = r8.j
            int r6 = r6.intValue()
            int r6 = android.graphics.Color.blue(r6)
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r7 = r8.g
            if (r2 > r7) goto L4c
            int r2 = r1 - r5
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.g
            if (r2 > r5) goto L4c
            int r2 = r9 - r6
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.g
            if (r2 <= r5) goto L4e
        L4c:
            r2 = r3
            goto L4f
        L4e:
            r2 = r4
        L4f:
            int r5 = r8.f
            if (r0 > r5) goto L5b
            if (r1 > r5) goto L5b
            if (r9 > r5) goto L5b
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            r3 = r4
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.g.a(int):boolean");
    }

    private void a(View view, d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Activity activityA = this.f927a.e().a();
            if (activityA == null) {
                if (t.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect = new Rect(i, i2, i + measuredWidth, i2 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (t.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (t.a()) {
            this.b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
