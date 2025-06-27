package com.mbridge.msdk.f.a;

import android.os.CountDownTimer;

/* compiled from: MBCountDownTimer.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.f.a.a f2744a;
    private long b;
    private a c;
    private long d = 0;

    public final void a() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.cancel();
            this.c = null;
        }
    }

    public final b a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.b = j;
        return this;
    }

    public final b a(com.mbridge.msdk.f.a.a aVar) {
        this.f2744a = aVar;
        return this;
    }

    public final b b(long j) {
        this.d = j;
        return this;
    }

    public final void b() {
        a aVar = this.c;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.c = null;
            }
            if (this.b <= 0) {
                this.b = this.d + 1000;
            }
            a aVar2 = new a(this.d, this.b);
            this.c = aVar2;
            aVar2.a(this.f2744a);
        }
        this.c.start();
    }

    /* compiled from: MBCountDownTimer.java */
    private static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.f.a.a f2745a;

        public a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            com.mbridge.msdk.f.a.a aVar = this.f2745a;
            if (aVar != null) {
                aVar.onTick(j);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.f.a.a aVar = this.f2745a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        final void a(com.mbridge.msdk.f.a.a aVar) {
            this.f2745a = aVar;
        }
    }
}
