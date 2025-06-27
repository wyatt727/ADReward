package com.mbridge.msdk.video.dynview.i.c;

import android.os.CountDownTimer;

/* compiled from: MBCountDownTimer.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private long f3638a = 0;
    private long b;
    private com.mbridge.msdk.video.dynview.i.c.a c;
    private a d;

    public final b a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.b = j;
        return this;
    }

    public final b a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.c = aVar;
        return this;
    }

    public final b b(long j) {
        this.f3638a = j;
        return this;
    }

    private void c() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.cancel();
            this.d = null;
        }
        if (this.b <= 0) {
            this.b = this.f3638a + 1000;
        }
        a aVar2 = new a(this.f3638a, this.b);
        this.d = aVar2;
        aVar2.a(this.c);
    }

    public final void a() {
        if (this.d == null) {
            c();
        }
        this.d.start();
    }

    public final void a(long j, com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.f3638a = j;
        this.c = aVar;
        c();
        a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public final void b() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.cancel();
            this.d = null;
        }
    }

    /* compiled from: MBCountDownTimer.java */
    private static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.i.c.a f3639a;

        public a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.f3639a;
            if (aVar != null) {
                aVar.a(j);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.f3639a;
            if (aVar != null) {
                aVar.a();
            }
        }

        final void a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
            this.f3639a = aVar;
        }
    }
}
