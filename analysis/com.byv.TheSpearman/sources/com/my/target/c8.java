package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.my.target.common.models.VideoData;
import com.my.target.e8;
import com.my.target.k8;
import com.my.target.n4;
import com.my.target.p4;
import com.my.target.v4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class c8 {

    /* renamed from: a, reason: collision with root package name */
    public final j8 f3939a;
    public final k7 b;
    public final Context c;
    public final w8 d;
    public boolean e = true;

    public c8(j8 j8Var, k7 k7Var, Context context) {
        this.f3939a = j8Var;
        this.b = k7Var;
        this.c = context;
        this.d = w8.a(context);
    }

    public static c8 a(j8 j8Var, k7 k7Var, Context context) {
        return new c8(j8Var, k7Var, context);
    }

    public e8 a(e8.a aVar) {
        return new f8(this.d, this.c, aVar);
    }

    public k4 a(b5<VideoData> b5Var, x xVar, p4.a aVar) {
        return p4.a(b5Var, xVar, aVar, this, d5.a(this.e, xVar.getContext()));
    }

    public k8 a(z3 z3Var, View view, View view2, View view3, k8.a aVar) {
        return !z3Var.getInterstitialAdCards().isEmpty() ? new m8(z3Var.getInterstitialAdCards().get(0).isImageOnly(), view, view2, aVar, view3, this.d, this.c) : z3Var.getVideoBanner() != null ? new o8(view, view2, aVar, view3, this.d, this.c) : new n8(view, view2, aVar, view3, this.d, this.c);
    }

    public n4 a(r3 r3Var, n4.a aVar) {
        return o4.a(r3Var, aVar);
    }

    public o7 a(b5<VideoData> b5Var) {
        return o7.a(b5Var, this.b, this.c);
    }

    public p0 a() {
        return new q0(this.c, this.f3939a, this.d);
    }

    public v4 a(y7 y7Var, List<r3> list, v4.a aVar) {
        v4 v4VarA = s4.a(y7Var, list, aVar);
        ArrayList arrayList = new ArrayList();
        Iterator<r3> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next(), v4VarA));
        }
        y7Var.setAdapter(new n0(arrayList, this));
        return v4VarA;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public x b() {
        return new x(this.c);
    }

    public y7 c() {
        return new y7(this.c);
    }

    public Handler d() {
        return new Handler(Looper.getMainLooper());
    }

    public g8 e() {
        return new h8(this.c);
    }
}
