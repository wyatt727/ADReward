package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ga implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final jj f452a;
    private String b;
    private ro c;
    private a d;
    private boolean e;
    private long l;
    private final boolean[] f = new boolean[3];
    private final tf g = new tf(32, 128);
    private final tf h = new tf(33, 128);
    private final tf i = new tf(34, 128);
    private final tf j = new tf(39, 128);
    private final tf k = new tf(40, 128);
    private long m = -9223372036854775807L;
    private final yg n = new yg();

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public ga(jj jjVar) {
        this.f452a = jjVar;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        c();
        while (ygVar.a() > 0) {
            int iD = ygVar.d();
            int iE = ygVar.e();
            byte[] bArrC = ygVar.c();
            this.l += ygVar.a();
            this.c.a(ygVar, ygVar.a());
            while (iD < iE) {
                int iA = uf.a(bArrC, iD, iE, this.f);
                if (iA == iE) {
                    a(bArrC, iD, iE);
                    return;
                }
                int iA2 = uf.a(bArrC, iA);
                int i = iA - iD;
                if (i > 0) {
                    a(bArrC, iD, iA);
                }
                int i2 = iE - iA;
                long j = this.l - i2;
                a(j, i2, i < 0 ? -i : 0, this.m);
                b(j, i2, iA2, this.m);
                iD = iA + 3;
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.b = dVar.b();
        ro roVarA = k8Var.a(dVar.c(), 2);
        this.c = roVarA;
        this.d = new a(roVarA);
        this.f452a.a(k8Var, dVar);
    }

    private static void b(zg zgVar) {
        int iF = zgVar.f();
        boolean zC = false;
        int i = 0;
        for (int i2 = 0; i2 < iF; i2++) {
            if (i2 != 0) {
                zC = zgVar.c();
            }
            if (zC) {
                zgVar.g();
                zgVar.f();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (zgVar.c()) {
                        zgVar.g();
                    }
                }
            } else {
                int iF2 = zgVar.f();
                int iF3 = zgVar.f();
                int i4 = iF2 + iF3;
                for (int i5 = 0; i5 < iF2; i5++) {
                    zgVar.f();
                    zgVar.g();
                }
                for (int i6 = 0; i6 < iF3; i6++) {
                    zgVar.f();
                    zgVar.g();
                }
                i = i4;
            }
        }
    }

    private void c() {
        a1.b(this.c);
        yp.a(this.d);
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ro f453a;
        private long b;
        private boolean c;
        private int d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        private static boolean a(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        private static boolean b(int i) {
            return i < 32 || i == 40;
        }

        public a(ro roVar) {
            this.f453a = roVar;
        }

        public void a(long j, int i, boolean z) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (z && this.i) {
                    c(i + ((int) (j - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
        }

        private void c(int i) {
            long j = this.l;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.m;
            this.f453a.a(j, z ? 1 : 0, (int) (this.b - this.k), i, null);
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f) {
                int i3 = this.d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    this.g = (bArr[i4] & 128) != 0;
                    this.f = false;
                } else {
                    this.d = i3 + (i2 - i);
                }
            }
        }

        public void a() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void a(long j, int i, int i2, long j2, boolean z) {
            this.g = false;
            this.h = false;
            this.e = j2;
            this.d = 0;
            this.b = j;
            if (!b(i2)) {
                if (this.i && !this.j) {
                    if (z) {
                        c(i);
                    }
                    this.i = false;
                }
                if (a(i2)) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.c = z2;
            this.f = z2 || i2 <= 9;
        }
    }

    private void a(long j, int i, int i2, long j2) {
        this.d.a(j, i, this.e);
        if (!this.e) {
            this.g.a(i2);
            this.h.a(i2);
            this.i.a(i2);
            if (this.g.a() && this.h.a() && this.i.a()) {
                this.c.a(a(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.a(i2)) {
            tf tfVar = this.j;
            this.n.a(this.j.d, uf.c(tfVar.d, tfVar.e));
            this.n.g(5);
            this.f452a.a(j2, this.n);
        }
        if (this.k.a(i2)) {
            tf tfVar2 = this.k;
            this.n.a(this.k.d, uf.c(tfVar2.d, tfVar2.e));
            this.n.g(5);
            this.f452a.a(j2, this.n);
        }
    }

    private void b(long j, int i, int i2, long j2) {
        this.d.a(j, i, i2, j2, this.e);
        if (!this.e) {
            this.g.b(i2);
            this.h.b(i2);
            this.i.b(i2);
        }
        this.j.b(i2);
        this.k.b(i2);
    }

    private void a(byte[] bArr, int i, int i2) {
        this.d.a(bArr, i, i2);
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @Override // com.applovin.impl.o7
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    private static d9 a(String str, tf tfVar, tf tfVar2, tf tfVar3) {
        int i = tfVar.e;
        byte[] bArr = new byte[tfVar2.e + i + tfVar3.e];
        System.arraycopy(tfVar.d, 0, bArr, 0, i);
        System.arraycopy(tfVar2.d, 0, bArr, tfVar.e, tfVar2.e);
        System.arraycopy(tfVar3.d, 0, bArr, tfVar.e + tfVar2.e, tfVar3.e);
        zg zgVar = new zg(tfVar2.d, 0, tfVar2.e);
        zgVar.d(44);
        int iB = zgVar.b(3);
        zgVar.g();
        zgVar.d(88);
        zgVar.d(8);
        int i2 = 0;
        for (int i3 = 0; i3 < iB; i3++) {
            if (zgVar.c()) {
                i2 += 89;
            }
            if (zgVar.c()) {
                i2 += 8;
            }
        }
        zgVar.d(i2);
        if (iB > 0) {
            zgVar.d((8 - iB) * 2);
        }
        zgVar.f();
        int iF = zgVar.f();
        if (iF == 3) {
            zgVar.g();
        }
        int iF2 = zgVar.f();
        int iF3 = zgVar.f();
        if (zgVar.c()) {
            int iF4 = zgVar.f();
            int iF5 = zgVar.f();
            int iF6 = zgVar.f();
            int iF7 = zgVar.f();
            iF2 -= ((iF == 1 || iF == 2) ? 2 : 1) * (iF4 + iF5);
            iF3 -= (iF == 1 ? 2 : 1) * (iF6 + iF7);
        }
        zgVar.f();
        zgVar.f();
        int iF8 = zgVar.f();
        for (int i4 = zgVar.c() ? 0 : iB; i4 <= iB; i4++) {
            zgVar.f();
            zgVar.f();
            zgVar.f();
        }
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        if (zgVar.c() && zgVar.c()) {
            a(zgVar);
        }
        zgVar.d(2);
        if (zgVar.c()) {
            zgVar.d(8);
            zgVar.f();
            zgVar.f();
            zgVar.g();
        }
        b(zgVar);
        if (zgVar.c()) {
            for (int i5 = 0; i5 < zgVar.f(); i5++) {
                zgVar.d(iF8 + 5);
            }
        }
        zgVar.d(2);
        float f = 1.0f;
        if (zgVar.c()) {
            if (zgVar.c()) {
                int iB2 = zgVar.b(8);
                if (iB2 == 255) {
                    int iB3 = zgVar.b(16);
                    int iB4 = zgVar.b(16);
                    if (iB3 != 0 && iB4 != 0) {
                        f = iB3 / iB4;
                    }
                } else {
                    float[] fArr = uf.b;
                    if (iB2 < fArr.length) {
                        f = fArr[iB2];
                    } else {
                        kc.d("H265Reader", "Unexpected aspect_ratio_idc value: " + iB2);
                    }
                }
            }
            if (zgVar.c()) {
                zgVar.g();
            }
            if (zgVar.c()) {
                zgVar.d(4);
                if (zgVar.c()) {
                    zgVar.d(24);
                }
            }
            if (zgVar.c()) {
                zgVar.f();
                zgVar.f();
            }
            zgVar.g();
            if (zgVar.c()) {
                iF3 *= 2;
            }
        }
        zgVar.a(tfVar2.d, 0, tfVar2.e);
        zgVar.d(24);
        return new d9.b().c(str).f("video/hevc").a(m3.a(zgVar)).q(iF2).g(iF3).b(f).a(Collections.singletonList(bArr)).a();
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        uf.a(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    private static void a(zg zgVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!zgVar.c()) {
                    zgVar.f();
                } else {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        zgVar.e();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        zgVar.e();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }
}
