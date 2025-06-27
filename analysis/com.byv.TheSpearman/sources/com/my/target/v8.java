package com.my.target;

import android.content.Context;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class v8 {
    public WeakReference<View> b;
    public long d;
    public float c = -1.0f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<u8> f4165a = new ArrayList<>();

    public v8(v9 v9Var) {
        Iterator<w5> it = v9Var.a().iterator();
        while (it.hasNext()) {
            w5 next = it.next();
            if (next instanceof u8) {
                this.f4165a.add((u8) next);
            }
        }
    }

    public static v8 a(v9 v9Var) {
        return new v8(v9Var);
    }

    public final void a() {
        Iterator<u8> it = this.f4165a.iterator();
        while (it.hasNext()) {
            it.next().a(-1.0f);
        }
    }

    public final void a(double d, int i, Context context) {
        float f;
        ArrayList arrayList = new ArrayList();
        Iterator<u8> it = this.f4165a.iterator();
        while (it.hasNext()) {
            u8 next = it.next();
            int iF = next.f();
            int iE = next.e();
            if (!(iF <= i && (iE == 0 || iE >= i)) || next.d > d) {
                f = -1.0f;
                next.a(f);
            } else {
                if (next.d() >= 0.0f) {
                    float f2 = i;
                    if (f2 > next.d()) {
                        if (f2 - next.d() >= next.e) {
                            arrayList.add(next);
                            it.remove();
                        }
                    }
                }
                f = i;
                next.a(f);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        w9.a(arrayList, context);
    }

    public void a(View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.b) == null) {
            this.b = new WeakReference<>(view);
        } else {
            weakReference.clear();
        }
    }

    public final boolean a(int i) {
        float f = i;
        float f2 = this.c;
        if (f < f2) {
            return false;
        }
        return this.d <= 0 || (((long) (f - f2)) * 1000) - (System.currentTimeMillis() - this.d) <= 1000;
    }

    public final void b(double d, int i, Context context) {
        if (this.f4165a.isEmpty()) {
            return;
        }
        if (context != null) {
            a(d, i, context);
            return;
        }
        Iterator<u8> it = this.f4165a.iterator();
        while (it.hasNext()) {
            it.next().a(-1.0f);
        }
    }

    public void b(int i) {
        View view;
        float f = i;
        if (f == this.c) {
            return;
        }
        if (!a(i)) {
            a();
        }
        Context context = null;
        double dA = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        WeakReference<View> weakReference = this.b;
        if (weakReference != null && (view = weakReference.get()) != null) {
            dA = pa.a(view);
            context = view.getContext();
        }
        b(dA, i, context);
        this.c = f;
        this.d = System.currentTimeMillis();
    }
}
