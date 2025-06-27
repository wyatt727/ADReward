package com.apm.insight.j;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Handler f65a;
    private final long b;
    private final long c;

    a(Handler handler, long j, long j2) {
        this.f65a = handler;
        this.b = j;
        this.c = j2;
    }

    void a() {
        if (b() > 0) {
            this.f65a.postDelayed(this, b());
        } else {
            this.f65a.post(this);
        }
    }

    void a(long j) {
        if (j > 0) {
            this.f65a.postDelayed(this, j);
        } else {
            this.f65a.post(this);
        }
    }

    long b() {
        return this.b;
    }

    long c() {
        return this.c;
    }
}
