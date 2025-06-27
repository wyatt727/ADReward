package com.applovin.impl;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class oh {

    /* renamed from: a, reason: collision with root package name */
    private final b f759a;
    private final a b;
    private final j3 c;
    private final go d;
    private int e;
    private Object f;
    private Looper g;
    private int h;
    private long i = -9223372036854775807L;
    private boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public interface a {
        void a(oh ohVar);
    }

    public interface b {
        void a(int i, Object obj);
    }

    public oh(a aVar, b bVar, go goVar, int i, j3 j3Var, Looper looper) {
        this.b = aVar;
        this.f759a = bVar;
        this.d = goVar;
        this.g = looper;
        this.c = j3Var;
        this.h = i;
    }

    public go f() {
        return this.d;
    }

    public b e() {
        return this.f759a;
    }

    public int g() {
        return this.e;
    }

    public Object c() {
        return this.f;
    }

    public Looper b() {
        return this.g;
    }

    public long d() {
        return this.i;
    }

    public int h() {
        return this.h;
    }

    public oh j() {
        a1.b(!this.k);
        if (this.i == -9223372036854775807L) {
            a1.a(this.j);
        }
        this.k = true;
        this.b.a(this);
        return this;
    }

    public synchronized boolean i() {
        return this.n;
    }

    public synchronized boolean a(long j) {
        boolean z;
        a1.b(this.k);
        a1.b(this.g.getThread() != Thread.currentThread());
        long jC = this.c.c() + j;
        while (true) {
            z = this.m;
            if (z || j <= 0) {
                break;
            }
            this.c.b();
            wait(j);
            j = jC - this.c.c();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.l;
    }

    public boolean a() {
        return this.j;
    }

    public synchronized void a(boolean z) {
        this.l = z | this.l;
        this.m = true;
        notifyAll();
    }

    public oh a(Object obj) {
        a1.b(!this.k);
        this.f = obj;
        return this;
    }

    public oh a(int i) {
        a1.b(!this.k);
        this.e = i;
        return this;
    }
}
