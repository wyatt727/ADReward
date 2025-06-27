package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class cr {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.t f343a;
    private final Runnable e;
    private final ViewTreeObserver.OnPreDrawListener f;
    private final WeakReference g;
    private final long h;
    private int k;
    private float l;
    private float m;
    private long n;
    private final Object b = new Object();
    private final Rect c = new Rect();
    private WeakReference i = new WeakReference(null);
    private WeakReference j = new WeakReference(null);
    private long o = Long.MIN_VALUE;
    private final Handler d = new Handler(Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    public cr(final View view, com.applovin.impl.sdk.k kVar, a aVar) {
        this.f343a = kVar.L();
        this.h = ((Long) kVar.a(oj.S1)).longValue();
        this.g = new WeakReference(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.e = new Runnable() { // from class: com.applovin.impl.cr$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(weakReference);
            }
        };
        this.f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.cr$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f$0.a(view);
            }
        };
    }

    private void c(View view) {
        View viewB = ar.b((View) this.g.get());
        if (viewB == null) {
            viewB = ar.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f343a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f343a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            }
        } else {
            this.i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f);
        }
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.c.height());
        if (jPxToDp < this.k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.l) {
            return false;
        }
        return (((float) ((long) (this.c.width() * this.c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.m;
    }

    private boolean a(View view, View view2) {
        if (!b(view, view2)) {
            return false;
        }
        if (this.o == Long.MIN_VALUE) {
            this.o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.o >= this.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (a(viewGroup, view2)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f343a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
            }
            b();
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                aVar.onLogVisibilityImpression();
                return;
            }
            return;
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f);
            } else if (com.applovin.impl.sdk.t.a()) {
                this.f343a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.t.a()) {
            this.f343a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.i.clear();
    }

    private void a() {
        this.d.postDelayed(this.e, this.h);
    }

    public void b() {
        synchronized (this.b) {
            this.d.removeMessages(0);
            b((View) this.g.get());
            this.o = Long.MIN_VALUE;
            this.j.clear();
        }
    }

    public void a(int i, float f, float f2, long j, View view) {
        synchronized (this.b) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f343a.a("VisibilityTracker", "Tracking visibility for " + view);
            }
            b();
            WeakReference weakReference = new WeakReference(view);
            this.j = weakReference;
            this.k = i;
            this.l = f;
            this.m = f2;
            this.n = j;
            c((View) weakReference.get());
        }
    }

    public void a(ie ieVar) {
        View viewL0;
        if (ieVar instanceof ce) {
            viewL0 = ieVar.x();
        } else if (!(ieVar instanceof ee)) {
            return;
        } else {
            viewL0 = ((ee) ieVar).l0();
        }
        a(ieVar.d0(), ieVar.f0(), ieVar.g0(), ieVar.h0(), viewL0);
    }
}
