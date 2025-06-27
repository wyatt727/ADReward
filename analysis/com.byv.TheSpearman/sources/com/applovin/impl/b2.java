package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.y6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b2 implements wd {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f283a = new ArrayList(1);
    private final HashSet b = new HashSet(1);
    private final xd.a c = new xd.a();
    private final y6.a d = new y6.a();
    private Looper e;
    private go f;

    protected abstract void a(yo yoVar);

    @Override // com.applovin.impl.wd
    public /* synthetic */ boolean c() {
        return wd.CC.$default$c(this);
    }

    @Override // com.applovin.impl.wd
    public /* synthetic */ go d() {
        return wd.CC.$default$d(this);
    }

    protected void e() {
    }

    protected void f() {
    }

    protected abstract void h();

    protected final xd.a b(wd.a aVar) {
        return this.c.a(0, aVar, 0L);
    }

    protected final boolean g() {
        return !this.b.isEmpty();
    }

    @Override // com.applovin.impl.wd
    public final void a(Handler handler, y6 y6Var) {
        a1.a(handler);
        a1.a(y6Var);
        this.d.a(handler, y6Var);
    }

    @Override // com.applovin.impl.wd
    public final void c(wd.b bVar) {
        this.f283a.remove(bVar);
        if (this.f283a.isEmpty()) {
            this.e = null;
            this.f = null;
            this.b.clear();
            h();
            return;
        }
        a(bVar);
    }

    @Override // com.applovin.impl.wd
    public final void b(wd.b bVar) {
        a1.a(this.e);
        boolean zIsEmpty = this.b.isEmpty();
        this.b.add(bVar);
        if (zIsEmpty) {
            f();
        }
    }

    @Override // com.applovin.impl.wd
    public final void a(Handler handler, xd xdVar) {
        a1.a(handler);
        a1.a(xdVar);
        this.c.a(handler, xdVar);
    }

    protected final y6.a a(int i, wd.a aVar) {
        return this.d.a(i, aVar);
    }

    protected final y6.a a(wd.a aVar) {
        return this.d.a(0, aVar);
    }

    protected final xd.a a(int i, wd.a aVar, long j) {
        return this.c.a(i, aVar, j);
    }

    @Override // com.applovin.impl.wd
    public final void a(wd.b bVar) {
        boolean z = !this.b.isEmpty();
        this.b.remove(bVar);
        if (z && this.b.isEmpty()) {
            e();
        }
    }

    @Override // com.applovin.impl.wd
    public final void a(wd.b bVar, yo yoVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        a1.a(looper == null || looper == looperMyLooper);
        go goVar = this.f;
        this.f283a.add(bVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(bVar);
            a(yoVar);
        } else if (goVar != null) {
            b(bVar);
            bVar.a(this, goVar);
        }
    }

    protected final void a(go goVar) {
        this.f = goVar;
        Iterator it = this.f283a.iterator();
        while (it.hasNext()) {
            ((wd.b) it.next()).a(this, goVar);
        }
    }

    @Override // com.applovin.impl.wd
    public final void a(y6 y6Var) {
        this.d.e(y6Var);
    }

    @Override // com.applovin.impl.wd
    public final void a(xd xdVar) {
        this.c.a(xdVar);
    }
}
