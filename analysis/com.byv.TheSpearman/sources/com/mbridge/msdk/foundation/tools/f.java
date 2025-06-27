package com.mbridge.msdk.foundation.tools;

/* compiled from: Container.java */
/* loaded from: classes4.dex */
final class f {

    /* compiled from: Container.java */
    static class a extends j {
        @Override // com.mbridge.msdk.foundation.tools.f.b
        final byte a() {
            return (byte) 7;
        }

        a(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }
    }

    /* compiled from: Container.java */
    static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        int f2988a;

        abstract byte a();

        b() {
        }
    }

    /* compiled from: Container.java */
    static class c extends b {
        boolean b;

        @Override // com.mbridge.msdk.foundation.tools.f.b
        final byte a() {
            return (byte) 1;
        }

        c(int i, boolean z) {
            this.f2988a = i;
            this.b = z;
        }
    }

    /* compiled from: Container.java */
    static class d extends b {
        double b;

        @Override // com.mbridge.msdk.foundation.tools.f.b
        final byte a() {
            return (byte) 5;
        }

        d(int i, double d) {
            this.f2988a = i;
            this.b = d;
        }
    }

    /* compiled from: Container.java */
    static class e extends b {
        float b;

        @Override // com.mbridge.msdk.foundation.tools.f.b
        final byte a() {
            return (byte) 3;
        }

        e(int i, float f) {
            this.f2988a = i;
            this.b = f;
        }
    }

    /* compiled from: Container.java */
    /* renamed from: com.mbridge.msdk.foundation.tools.f$f, reason: collision with other inner class name */
    static class C0273f extends b {
        int b;

        @Override // com.mbridge.msdk.foundation.tools.f.b
        final byte a() {
            return (byte) 2;
        }

        C0273f(int i, int i2) {
            this.f2988a = i;
            this.b = i2;
        }
    }

    /* compiled from: Container.java */
    static class g extends b {
        long b;

        @Override // com.mbridge.msdk.foundation.tools.f.b
        final byte a() {
            return (byte) 4;
        }

        g(int i, long j) {
            this.f2988a = i;
            this.b = j;
        }
    }

    /* compiled from: Container.java */
    static class h extends j {
        @Override // com.mbridge.msdk.foundation.tools.f.b
        final byte a() {
            return (byte) 8;
        }

        h(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }
    }

    /* compiled from: Container.java */
    static class i extends j {
        @Override // com.mbridge.msdk.foundation.tools.f.b
        final byte a() {
            return (byte) 6;
        }

        i(int i, int i2, String str, int i3, boolean z) {
            super(i, i2, str, i3, z);
        }
    }

    /* compiled from: Container.java */
    static abstract class j extends b {
        boolean b;
        int c;
        Object d;
        int e;

        j(int i, int i2, Object obj, int i3, boolean z) {
            this.c = i;
            this.f2988a = i2;
            this.d = obj;
            this.e = i3;
            this.b = z;
        }
    }
}
