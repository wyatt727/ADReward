package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.List;

/* loaded from: classes4.dex */
public final class q {
    private final d0 b;

    /* renamed from: a, reason: collision with root package name */
    private final e f4248a = new e();
    private final m c = new m();
    private final s d = new s();
    private final a0 e = new a0();
    private final l0 f = new l0();
    private final f0 g = new f0();
    private final f h = new f();
    private final o i = new o();
    private final i j = new i();
    private final r k = new r();

    private q(a1 a1Var) {
        this.b = new d0(a1Var);
    }

    public static q a(a1 a1Var) {
        return new q(a1Var);
    }

    public void a(Context context) {
        this.f4248a.a(context);
        this.b.a(context);
        this.c.a(context);
        this.d.a(context);
        this.e.a(context);
        this.f.a(context);
        this.g.a(context);
        this.h.a(context);
        this.i.a(context);
        this.j.a(context);
        this.k.a(context);
    }

    public void a(s0 s0Var, Context context) {
        this.f4248a.a(s0Var, context);
        this.b.a(s0Var, context);
        this.c.a(s0Var, context);
        this.d.a(s0Var, context);
        this.e.a(s0Var, context);
        this.f.a(s0Var, context);
        this.g.a(s0Var, context);
        this.h.a(s0Var, context);
        this.i.c(s0Var, context);
        this.j.a(s0Var, context);
        this.k.a(s0Var, context);
    }

    public void a(List<PackageInfo> list, boolean z, boolean z2) {
        this.h.c(list);
        this.i.a(z);
        this.g.a(z2);
    }

    public void b(Context context) {
        this.f4248a.c(context);
        this.b.b(context);
        this.c.d(context);
        this.d.c(context);
        this.e.c(context);
        this.f.b(context);
        this.g.b(context);
        this.h.b(context);
        this.i.b(context);
        this.j.b(context);
        this.k.b(context);
    }
}
