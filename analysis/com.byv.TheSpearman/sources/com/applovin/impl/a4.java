package com.applovin.impl;

/* loaded from: classes.dex */
public class a4 {

    /* renamed from: a, reason: collision with root package name */
    private final j3 f235a;
    private boolean b;

    public a4() {
        this(j3.f557a);
    }

    public synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public synchronized boolean c() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public synchronized void a() {
        while (!this.b) {
            wait();
        }
    }

    public a4(j3 j3Var) {
        this.f235a = j3Var;
    }

    public synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean d() {
        return this.b;
    }
}
