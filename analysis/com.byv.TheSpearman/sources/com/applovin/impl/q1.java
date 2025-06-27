package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface q1 {

    public interface c {
        void a();

        void a(int i, long j, long j2);

        void a(long j);

        void a(Exception exc);

        void a(boolean z);

        void b();

        void b(long j);
    }

    long a(boolean z);

    mh a();

    void a(float f);

    void a(int i);

    void a(d9 d9Var, int i, int[] iArr);

    void a(k1 k1Var);

    void a(mh mhVar);

    void a(c cVar);

    void a(u1 u1Var);

    boolean a(d9 d9Var);

    boolean a(ByteBuffer byteBuffer, long j, int i);

    int b(d9 d9Var);

    void b();

    void b(boolean z);

    boolean c();

    void d();

    void e();

    void f();

    boolean g();

    void h();

    void i();

    void j();

    void pause();

    void reset();

    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final d9 f808a;

        public a(String str, d9 d9Var) {
            super(str);
            this.f808a = d9Var;
        }

        public a(Throwable th, d9 d9Var) {
            super(th);
            this.f808a = d9Var;
        }
    }

    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f809a;
        public final boolean b;
        public final d9 c;

        public b(int i, int i2, int i3, int i4, d9 d9Var, boolean z, Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(")");
            sb.append(z ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.f809a = i;
            this.b = z;
            this.c = d9Var;
        }
    }

    public static final class e extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f811a;
        public final boolean b;
        public final d9 c;

        public e(int i, d9 d9Var, boolean z) {
            super("AudioTrack write failed: " + i);
            this.b = z;
            this.f811a = i;
            this.c = d9Var;
        }
    }

    public static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final long f810a;
        public final long b;

        public d(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.f810a = j;
            this.b = j2;
        }
    }
}
