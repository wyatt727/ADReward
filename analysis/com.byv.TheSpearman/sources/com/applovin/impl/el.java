package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class el {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f391a = new WeakHashMap();
    private final Object b = new Object();
    private final Handler c = new Handler();
    private boolean d = false;
    private final WeakReference e;
    private final ViewTreeObserver.OnPreDrawListener f;
    private a g;

    public interface a {
        void a(int i, int i2);
    }

    public el(View view) {
        this.e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.el$$ExternalSyntheticLambda0
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    return this.f$0.b();
                }
            };
            this.f = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.g = null;
        View view = (View) this.e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.e.clear();
        }
    }

    private void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.postDelayed(new Runnable() { // from class: com.applovin.impl.el$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.b) {
            this.d = false;
            int iMin = -1;
            int iMax = -1;
            for (Map.Entry entry : this.f391a.entrySet()) {
                if (a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (iMin == -1 && iMax == -1) {
                        iMin = num.intValue();
                        iMax = num.intValue();
                    } else {
                        iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                        iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            a aVar = this.g;
            if (aVar != null) {
                aVar.a(iMin, iMax);
            }
        }
    }

    public void b(View view) {
        synchronized (this.b) {
            this.f391a.remove(view);
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public void a(View view, int i) {
        synchronized (this.b) {
            this.f391a.put(view, Integer.valueOf(i));
            d();
        }
    }
}
