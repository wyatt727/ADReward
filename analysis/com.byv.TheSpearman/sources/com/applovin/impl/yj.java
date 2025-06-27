package com.applovin.impl;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class yj implements k5 {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f1210a;
    private final Object b = new Object();
    private final ArrayDeque c = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();
    private final n5[] e;
    private final wg[] f;
    private int g;
    private int h;
    private n5 i;
    private m5 j;
    private boolean k;
    private boolean l;
    private int m;

    protected abstract m5 a(n5 n5Var, wg wgVar, boolean z);

    protected abstract m5 a(Throwable th);

    protected abstract n5 f();

    protected abstract wg g();

    protected yj(n5[] n5VarArr, wg[] wgVarArr) {
        this.e = n5VarArr;
        this.g = n5VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = wgVarArr;
        this.h = wgVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f1210a = aVar;
        aVar.start();
    }

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            yj.this.m();
        }
    }

    @Override // com.applovin.impl.k5
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final n5 d() {
        n5 n5Var;
        synchronized (this.b) {
            l();
            a1.b(this.i == null);
            int i = this.g;
            if (i == 0) {
                n5Var = null;
            } else {
                n5[] n5VarArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                n5Var = n5VarArr[i2];
            }
            this.i = n5Var;
        }
        return n5Var;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final wg c() {
        synchronized (this.b) {
            l();
            if (this.d.isEmpty()) {
                return null;
            }
            return (wg) this.d.removeFirst();
        }
    }

    @Override // com.applovin.impl.k5
    public final void a(n5 n5Var) {
        synchronized (this.b) {
            l();
            a1.a(n5Var == this.i);
            this.c.addLast(n5Var);
            k();
            this.i = null;
        }
    }

    @Override // com.applovin.impl.k5
    public final void b() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            n5 n5Var = this.i;
            if (n5Var != null) {
                b(n5Var);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                b((n5) this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                ((wg) this.d.removeFirst()).g();
            }
        }
    }

    private void l() throws m5 {
        m5 m5Var = this.j;
        if (m5Var != null) {
            throw m5Var;
        }
    }

    private void k() {
        if (e()) {
            this.b.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (h());
    }

    private boolean h() {
        m5 m5VarA;
        synchronized (this.b) {
            while (!this.l && !e()) {
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            n5 n5Var = (n5) this.c.removeFirst();
            wg[] wgVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            wg wgVar = wgVarArr[i];
            boolean z = this.k;
            this.k = false;
            if (n5Var.e()) {
                wgVar.b(4);
            } else {
                if (n5Var.d()) {
                    wgVar.b(Integer.MIN_VALUE);
                }
                try {
                    m5VarA = a(n5Var, wgVar, z);
                } catch (OutOfMemoryError e) {
                    m5VarA = a((Throwable) e);
                } catch (RuntimeException e2) {
                    m5VarA = a((Throwable) e2);
                }
                if (m5VarA != null) {
                    synchronized (this.b) {
                        this.j = m5VarA;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k) {
                    wgVar.g();
                } else if (wgVar.d()) {
                    this.m++;
                    wgVar.g();
                } else {
                    wgVar.c = this.m;
                    this.m = 0;
                    this.d.addLast(wgVar);
                }
                b(n5Var);
            }
            return true;
        }
    }

    private boolean e() {
        return !this.c.isEmpty() && this.h > 0;
    }

    @Override // com.applovin.impl.k5
    public void a() throws InterruptedException {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.f1210a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void b(n5 n5Var) {
        n5Var.b();
        n5[] n5VarArr = this.e;
        int i = this.g;
        this.g = i + 1;
        n5VarArr[i] = n5Var;
    }

    protected void a(wg wgVar) {
        synchronized (this.b) {
            b(wgVar);
            k();
        }
    }

    protected final void a(int i) {
        a1.b(this.g == this.e.length);
        for (n5 n5Var : this.e) {
            n5Var.g(i);
        }
    }

    private void b(wg wgVar) {
        wgVar.b();
        wg[] wgVarArr = this.f;
        int i = this.h;
        this.h = i + 1;
        wgVarArr[i] = wgVar;
    }
}
