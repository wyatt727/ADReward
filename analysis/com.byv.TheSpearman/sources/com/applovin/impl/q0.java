package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.google.android.exoplayer2.audio.AacUtil;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class q0 implements i8 {
    private static final int[] r;
    private static final int u;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f807a;
    private final int b;
    private boolean c;
    private long d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private long k;
    private k8 l;
    private ro m;
    private ej n;
    private boolean o;
    public static final m8 p = new m8() { // from class: com.applovin.impl.q0$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return q0.c();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };
    private static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] s = yp.c("#!AMR\n");
    private static final byte[] t = yp.c("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        r = iArr;
        u = iArr[8];
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public q0() {
        this(0);
    }

    public q0(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
        this.f807a = new byte[1];
        this.i = -1;
    }

    private boolean c(int i) {
        return i >= 0 && i <= 15 && (d(i) || b(i));
    }

    private boolean d(int i) {
        return this.c && (i < 10 || i > 13);
    }

    private void b() {
        a1.b(this.m);
        yp.a(this.l);
    }

    private static int a(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    private boolean c(j8 j8Var) {
        byte[] bArr = s;
        if (a(j8Var, bArr)) {
            this.c = false;
            j8Var.a(bArr.length);
            return true;
        }
        byte[] bArr2 = t;
        if (!a(j8Var, bArr2)) {
            return false;
        }
        this.c = true;
        j8Var.a(bArr2.length);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] c() {
        return new i8[]{new q0()};
    }

    private void d() {
        if (this.o) {
            return;
        }
        this.o = true;
        boolean z = this.c;
        this.m.a(new d9.b().f(z ? "audio/amr-wb" : "audio/3gpp").i(u).c(1).n(z ? AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND : 8000).a());
    }

    private boolean b(int i) {
        return !this.c && (i < 12 || i > 14);
    }

    private ej a(long j, boolean z) {
        return new n4(j, this.h, a(this.i, 20000L), this.i, z);
    }

    private int d(j8 j8Var) throws ah {
        if (this.f == 0) {
            try {
                int iB = b(j8Var);
                this.e = iB;
                this.f = iB;
                if (this.i == -1) {
                    this.h = j8Var.f();
                    this.i = this.e;
                }
                if (this.i == this.e) {
                    this.j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.m.a((e5) j8Var, this.f, true);
        if (iA == -1) {
            return -1;
        }
        int i = this.f - iA;
        this.f = i;
        if (i > 0) {
            return 0;
        }
        this.m.a(this.k + this.d, 1, this.e, 0, null);
        this.d += 20000;
        return 0;
    }

    private int b(j8 j8Var) throws ah {
        j8Var.b();
        j8Var.c(this.f807a, 0, 1);
        byte b = this.f807a[0];
        if ((b & 131) <= 0) {
            return a((b >> 3) & 15);
        }
        throw ah.a("Invalid padding bits for frame header " + ((int) b), null);
    }

    private int a(int i) throws ah {
        if (c(i)) {
            return this.c ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ah.a(sb.toString(), null);
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.l = k8Var;
        this.m = k8Var.a(0, 1);
        k8Var.c();
    }

    private void a(long j, int i) {
        int i2;
        if (this.g) {
            return;
        }
        int i3 = this.b;
        if ((i3 & 1) != 0 && j != -1 && ((i2 = this.i) == -1 || i2 == this.e)) {
            if (this.j >= 20 || i == -1) {
                ej ejVarA = a(j, (i3 & 2) != 0);
                this.n = ejVarA;
                this.l.a(ejVarA);
                this.g = true;
                return;
            }
            return;
        }
        ej.b bVar = new ej.b(-9223372036854775807L);
        this.n = bVar;
        this.l.a(bVar);
        this.g = true;
    }

    private static boolean a(j8 j8Var, byte[] bArr) {
        j8Var.b();
        byte[] bArr2 = new byte[bArr.length];
        j8Var.c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) throws ah {
        b();
        if (j8Var.f() == 0 && !c(j8Var)) {
            throw ah.a("Could not find AMR header.", null);
        }
        d();
        int iD = d(j8Var);
        a(j8Var.a(), iD);
        return iD;
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j != 0) {
            ej ejVar = this.n;
            if (ejVar instanceof n4) {
                this.k = ((n4) ejVar).d(j);
                return;
            }
        }
        this.k = 0L;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return c(j8Var);
    }
}
