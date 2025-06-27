package com.applovin.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class t1 {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a, reason: collision with root package name */
    private final a f1011a;
    private final long[] b;
    private AudioTrack c;
    private int d;
    private int e;
    private s1 f;
    private int g;
    private boolean h;
    private long i;
    private float j;
    private boolean k;
    private long l;
    private long m;
    private Method n;
    private long o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private int v;
    private int w;
    private long x;
    private long y;
    private long z;

    public interface a {
        void a(int i, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j);

        void b(long j, long j2, long j3, long j4);
    }

    public t1(a aVar) {
        this.f1011a = (a) a1.a(aVar);
        if (yp.f1214a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    public void i() {
        ((s1) a1.a(this.f)).f();
    }

    public boolean g(long j) {
        int playState = ((AudioTrack) a1.a(this.c)).getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            }
            if (playState == 1 && b() == 0) {
                return false;
            }
        }
        boolean z = this.p;
        boolean zE = e(j);
        this.p = zE;
        if (z && !zE && playState != 1) {
            this.f1011a.a(this.e, r2.b(this.i));
        }
        return true;
    }

    public int b(long j) {
        return this.e - ((int) (j - (b() * this.d)));
    }

    public long c(long j) {
        return r2.b(a(j - b()));
    }

    public boolean f(long j) {
        return this.y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public void d(long j) {
        this.z = b();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = j;
    }

    public boolean e(long j) {
        return j > b() || a();
    }

    private void h(long j) {
        Method method;
        if (!this.q || (method = this.n) == null || j - this.r < 500000) {
            return;
        }
        try {
            long jIntValue = (((Integer) yp.a((Integer) method.invoke(a1.a(this.c), new Object[0]))).intValue() * 1000) - this.i;
            this.o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.o = jMax;
            if (jMax > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.f1011a.b(jMax);
                this.o = 0L;
            }
        } catch (Exception unused) {
            this.n = null;
        }
        this.r = j;
    }

    private boolean a() {
        return this.h && ((AudioTrack) a1.a(this.c)).getPlayState() == 2 && b() == 0;
    }

    public boolean d() {
        return ((AudioTrack) a1.a(this.c)).getPlayState() == 3;
    }

    public void g() {
        h();
        this.c = null;
        this.f = null;
    }

    public boolean f() {
        h();
        if (this.x != -9223372036854775807L) {
            return false;
        }
        ((s1) a1.a(this.f)).f();
        return true;
    }

    private void e() {
        long jC = c();
        if (jC == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.m >= 30000) {
            long[] jArr = this.b;
            int i = this.v;
            jArr[i] = jC - jNanoTime;
            this.v = (i + 1) % 10;
            int i2 = this.w;
            if (i2 < 10) {
                this.w = i2 + 1;
            }
            this.m = jNanoTime;
            this.l = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.w;
                if (i3 >= i4) {
                    break;
                }
                this.l += this.b[i3] / i4;
                i3++;
            }
        }
        if (this.h) {
            return;
        }
        a(jNanoTime, jC);
        h(jNanoTime);
    }

    private long c() {
        return a(b());
    }

    private long b() {
        AudioTrack audioTrack = (AudioTrack) a1.a(this.c);
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * this.g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (yp.f1214a <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    private void h() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.k = false;
    }

    private long a(long j) {
        return (j * 1000000) / this.g;
    }

    public long a(boolean z) {
        long jMax;
        if (((AudioTrack) a1.a(this.c)).getPlayState() == 3) {
            e();
        }
        long jNanoTime = System.nanoTime() / 1000;
        s1 s1Var = (s1) a1.a(this.f);
        boolean zD = s1Var.d();
        if (zD) {
            jMax = a(s1Var.b()) + yp.a(jNanoTime - s1Var.c(), this.j);
        } else {
            if (this.w == 0) {
                jMax = c();
            } else {
                jMax = this.l + jNanoTime;
            }
            if (!z) {
                jMax = Math.max(0L, jMax - this.o);
            }
        }
        if (this.D != zD) {
            this.F = this.C;
            this.E = this.B;
        }
        long j = jNanoTime - this.F;
        if (j < 1000000) {
            long jA = this.E + yp.a(j, this.j);
            long j2 = (j * 1000) / 1000000;
            jMax = ((jMax * j2) + ((1000 - j2) * jA)) / 1000;
        }
        if (!this.k) {
            long j3 = this.B;
            if (jMax > j3) {
                this.k = true;
                this.f1011a.a(System.currentTimeMillis() - r2.b(yp.b(r2.b(jMax - j3), this.j)));
            }
        }
        this.C = jNanoTime;
        this.B = jMax;
        this.D = zD;
        return jMax;
    }

    private void a(long j, long j2) {
        s1 s1Var = (s1) a1.a(this.f);
        if (s1Var.a(j)) {
            long jC = s1Var.c();
            long jB = s1Var.b();
            if (Math.abs(jC - j) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.f1011a.b(jB, jC, j, j2);
                s1Var.e();
            } else if (Math.abs(a(jB) - j2) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.f1011a.a(jB, jC, j, j2);
                s1Var.e();
            } else {
                s1Var.a();
            }
        }
    }

    public void a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new s1(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = z && a(i);
        boolean zG = yp.g(i);
        this.q = zG;
        this.i = zG ? a(i3 / i2) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public void a(float f) {
        this.j = f;
        s1 s1Var = this.f;
        if (s1Var != null) {
            s1Var.f();
        }
    }

    private static boolean a(int i) {
        return yp.f1214a < 23 && (i == 5 || i == 6);
    }
}
