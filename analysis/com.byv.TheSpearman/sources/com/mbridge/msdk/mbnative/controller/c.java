package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.aq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImpressionTracker.java */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f3122a;
    private List<View> b;
    private ViewTreeObserver.OnPreDrawListener c;
    private a d;
    private Handler e;
    private boolean f;
    private int g;

    /* compiled from: ImpressionTracker.java */
    public interface a {
        void a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public c(List<View> list, a aVar, Handler handler, int i) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = null;
        this.d = aVar;
        this.e = handler;
        this.g = i;
        if (list != null) {
            this.b = list;
        } else {
            arrayList.clear();
        }
        try {
            b();
        } catch (Throwable th) {
            ad.a("ImpressionTracker", th.getMessage(), th);
        }
        try {
            this.c = new ViewTreeObserver.OnPreDrawListener() { // from class: com.mbridge.msdk.mbnative.controller.c.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    c.this.b();
                    return true;
                }
            };
        } catch (Throwable th2) {
            ad.a("ImpressionTracker", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f) {
            return;
        }
        Handler handler = this.e;
        if (handler != null) {
            if (this.g == 1) {
                c();
            } else {
                handler.postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.c();
                    }
                }, 100L);
            }
        }
        this.f = true;
    }

    public final void a(View view) {
        View view2;
        final View viewA = null;
        if (view != null) {
            viewA = f.a(view.getContext(), view);
            this.b.add(view);
        } else {
            List<View> list = this.b;
            if (list != null && list.size() > 0) {
                for (int i = 0; i < this.b.size() && ((view2 = this.b.get(i)) == null || (viewA = f.a(view2.getContext(), view2)) == null); i++) {
                }
            }
        }
        if (viewA == null) {
            return;
        }
        viewA.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.c.3
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserver viewTreeObserver = viewA.getViewTreeObserver();
                if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                    c.this.f3122a = new WeakReference(viewTreeObserver);
                    if (c.this.c != null) {
                        viewTreeObserver.addOnPreDrawListener(c.this.c);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            this.f = false;
            List<View> list = this.b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i = 0; i < this.b.size(); i++) {
                View view = this.b.get(i);
                if (b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            a aVar = this.d;
            if (aVar != null) {
                aVar.a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    private boolean b(View view) {
        return !aq.a(view, this.g);
    }

    public final void a() {
        try {
            this.f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f3122a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f3122a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.c);
                }
                this.f3122a.clear();
            }
            this.d = null;
            this.c = null;
            List<View> list = this.b;
            if (list != null) {
                list.clear();
            }
            this.b = null;
        } catch (Throwable unused) {
        }
    }
}
