package com.my.target;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.my.target.ra;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class pa implements j2 {
    public WeakReference<View> c;
    public WeakReference<ra> d;
    public final ArrayList<x9> e;
    public final q8 f;
    public final float h;
    public final boolean i;
    public a j;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4094a = false;
    public boolean b = false;
    public final Runnable g = new Runnable() { // from class: com.my.target.pa$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.b();
        }
    };

    public static abstract class a {
        public void a() {
        }

        public void a(boolean z) {
        }
    }

    public pa(ma maVar, v9 v9Var, boolean z) {
        float fB = maVar.b();
        this.f = fB == 1.0f ? q8.d : q8.a((int) (fB * 1000.0f));
        this.e = new ArrayList<>();
        a(maVar, v9Var);
        this.h = maVar.c() * 100.0f;
        this.i = z;
    }

    public static float a(View view) {
        if (view != null && view.getParent() != null && view.getWindowVisibility() == 0 && view.getVisibility() == 0 && view.getAlpha() >= 0.5f) {
            int width = view.getWidth();
            if (view.getHeight() > 0 && width > 0) {
                if (view.getGlobalVisibleRect(new Rect())) {
                    return (r3.width() * r3.height()) / ((width * r2) / 100.0f);
                }
            }
        }
        return 0.0f;
    }

    public static pa a(ma maVar, v9 v9Var, boolean z) {
        return new pa(maVar, v9Var, z);
    }

    public static pa b(ma maVar, v9 v9Var) {
        return new pa(maVar, v9Var, true);
    }

    @Override // com.my.target.j2
    public a a() {
        return this.j;
    }

    public void a(ViewGroup viewGroup) {
        c();
        try {
            ra raVar = new ra(viewGroup.getContext());
            ca.b(raVar, "viewability_view");
            viewGroup.addView(raVar);
            ba.b("ViewabilityTracker", "help view added");
            raVar.setStateChangedListener(new ra.a() { // from class: com.my.target.pa$$ExternalSyntheticLambda0
                @Override // com.my.target.ra.a
                public final void a(boolean z) {
                    this.f$0.a(z);
                }
            });
            this.d = new WeakReference<>(raVar);
        } catch (Throwable th) {
            ba.c("ViewabilityTracker", "Unable to add Viewability View - " + th.getMessage());
            this.d = null;
        }
    }

    public final void a(ma maVar, v9 v9Var) {
        long jA = (long) (maVar.a() * 1000.0f);
        ArrayList<u9> arrayListB = v9Var.b("viewabilityDuration");
        ba.b("ViewabilityTracker", "ViewabilityDuration stats count = " + arrayListB.size());
        if (!arrayListB.isEmpty()) {
            this.e.add(na.a(this, arrayListB, jA));
        }
        ArrayList<u9> arrayListB2 = v9Var.b(com.json.i1.u);
        ba.b("ViewabilityTracker", "Show stats count = " + arrayListB2.size());
        this.e.add(g9.a(this, arrayListB2, jA, v9Var));
        ArrayList<u9> arrayListB3 = v9Var.b("render");
        ba.b("ViewabilityTracker", "Render stats count = " + arrayListB3.size());
        this.e.add(p8.a(this, arrayListB3));
    }

    public void a(a aVar) {
        this.j = aVar;
    }

    @Override // com.my.target.j2
    public void a(x9 x9Var) {
        int size = this.e.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (this.e.get(size) == x9Var) {
                this.e.remove(size);
                break;
            }
            size--;
        }
        if (this.e.isEmpty() && this.i) {
            ba.b("ViewabilityTracker", "statTrackers are empty and shouldStopOnShow = true, stop tracking");
            d();
        }
    }

    public void a(boolean z) {
        WeakReference<ra> weakReference = this.d;
        ra raVar = weakReference == null ? null : weakReference.get();
        if (raVar == null) {
            ba.b("ViewabilityTracker", "help view is null");
        } else {
            ViewParent parent = raVar.getParent();
            WeakReference<View> weakReference2 = this.c;
            View view = weakReference2 == null ? null : weakReference2.get();
            if (parent != null && parent == view) {
                ba.b("ViewabilityTracker", "onViewVisibilityChanged = " + z);
                if (!z) {
                    this.f.b(this.g);
                    a(false, 0.0f, view);
                    return;
                } else {
                    b();
                    if (this.f4094a) {
                        this.f.a(this.g);
                        return;
                    }
                    return;
                }
            }
            ba.b("ViewabilityTracker", "onStateChanged viewParent is null or not equals to rootView");
            raVar.setStateChangedListener(null);
            this.d.clear();
        }
        this.d = null;
    }

    public void a(boolean z, float f, View view) {
        boolean z2 = this.b;
        for (int size = this.e.size() - 1; size >= 0; size--) {
            this.e.get(size).a(z, f, view);
        }
        if (z2 == z) {
            return;
        }
        this.b = this.f4094a && z;
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public void b() {
        WeakReference<View> weakReference = this.c;
        View view = weakReference == null ? null : weakReference.get();
        if (view == null) {
            ba.b("ViewabilityTracker", "Tracking view disappeared");
            d();
            return;
        }
        float fA = a(view);
        boolean z = r1.a(fA, this.h) != -1;
        ba.b("ViewabilityTracker", "View visibility " + fA + "% (isVisible = " + z + ")");
        a(z, fA, view);
    }

    public void b(View view) {
        if (this.f4094a) {
            return;
        }
        if (this.e.isEmpty() && this.i) {
            return;
        }
        ba.b("ViewabilityTracker", "start tracking");
        this.f4094a = true;
        this.c = new WeakReference<>(view);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            this.e.get(size).a(view);
        }
        b();
        if (this.f4094a) {
            this.f.a(this.g);
            if (view instanceof ViewGroup) {
                a((ViewGroup) view);
            }
        }
    }

    public void c() {
        WeakReference<ra> weakReference = this.d;
        ra raVar = weakReference == null ? null : weakReference.get();
        this.d = null;
        if (raVar == null) {
            return;
        }
        raVar.setStateChangedListener(null);
        ViewParent parent = raVar.getParent();
        if (parent == null) {
            return;
        }
        ((ViewGroup) parent).removeView(raVar);
        ba.b("ViewabilityTracker", "help view removed");
    }

    public void d() {
        if (this.f4094a) {
            this.f4094a = false;
            ba.b("ViewabilityTracker", "stop tracking");
            c();
            this.f.b(this.g);
            this.b = false;
            this.c = null;
            for (int size = this.e.size() - 1; size >= 0; size--) {
                this.e.get(size).c();
            }
        }
    }
}
