package com.applovin.impl;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import com.applovin.impl.ej;
import com.applovin.impl.ep;
import java.util.Map;

/* loaded from: classes.dex */
public final class ei implements i8 {
    public static final m8 l = new m8() { // from class: com.applovin.impl.ei$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return ei.b();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final io f387a;
    private final SparseArray b;
    private final yg c;
    private final di d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private ci i;
    private k8 j;
    private boolean k;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new ei()};
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public ei() {
        this(new io(0L));
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.j = k8Var;
    }

    public ei(io ioVar) {
        this.f387a = ioVar;
        this.c = new yg(4096);
        this.b = new SparseArray();
        this.d = new di();
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final o7 f388a;
        private final io b;
        private final xg c = new xg(new byte[64]);
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;

        public a(o7 o7Var, io ioVar) {
            this.f388a = o7Var;
            this.b = ioVar;
        }

        public void c() {
            this.f = false;
            this.f388a.a();
        }

        public void a(yg ygVar) {
            ygVar.a(this.c.f1169a, 0, 3);
            this.c.c(0);
            a();
            ygVar.a(this.c.f1169a, 0, this.g);
            this.c.c(0);
            b();
            this.f388a.a(this.h, 4);
            this.f388a.a(ygVar);
            this.f388a.b();
        }

        private void b() {
            this.h = 0L;
            if (this.d) {
                this.c.d(4);
                this.c.d(1);
                this.c.d(1);
                long jA = (this.c.a(3) << 30) | (this.c.a(15) << 15) | this.c.a(15);
                this.c.d(1);
                if (!this.f && this.e) {
                    this.c.d(4);
                    this.c.d(1);
                    this.c.d(1);
                    this.c.d(1);
                    this.b.b((this.c.a(3) << 30) | (this.c.a(15) << 15) | this.c.a(15));
                    this.f = true;
                }
                this.h = this.b.b(jA);
            }
        }

        private void a() {
            this.c.d(8);
            this.d = this.c.f();
            this.e = this.c.f();
            this.c.d(6);
            this.g = this.c.a(8);
        }
    }

    private void a(long j) {
        if (this.k) {
            return;
        }
        this.k = true;
        if (this.d.a() != -9223372036854775807L) {
            ci ciVar = new ci(this.d.b(), this.d.a(), j);
            this.i = ciVar;
            this.j.a(ciVar.a());
            return;
        }
        this.j.a(new ej.b(this.d.a()));
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        a1.b(this.j);
        long jA = j8Var.a();
        if (jA != -1 && !this.d.c()) {
            return this.d.a(j8Var, qhVar);
        }
        a(jA);
        ci ciVar = this.i;
        if (ciVar != null && ciVar.b()) {
            return this.i.a(j8Var, qhVar);
        }
        j8Var.b();
        long jD = jA != -1 ? jA - j8Var.d() : -1L;
        if ((jD != -1 && jD < 4) || !j8Var.b(this.c.c(), 0, 4, true)) {
            return -1;
        }
        this.c.f(0);
        int iJ = this.c.j();
        if (iJ == 441) {
            return -1;
        }
        if (iJ == 442) {
            j8Var.c(this.c.c(), 0, 10);
            this.c.f(9);
            j8Var.a((this.c.w() & 7) + 14);
            return 0;
        }
        if (iJ == 443) {
            j8Var.c(this.c.c(), 0, 2);
            this.c.f(0);
            j8Var.a(this.c.C() + 6);
            return 0;
        }
        if (((iJ & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            j8Var.a(1);
            return 0;
        }
        int i = iJ & 255;
        a aVar = (a) this.b.get(i);
        if (!this.e) {
            if (aVar == null) {
                o7 daVar = null;
                if (i == 189) {
                    daVar = new j();
                    this.f = true;
                    this.h = j8Var.f();
                } else if ((iJ & 224) == 192) {
                    daVar = new nf();
                    this.f = true;
                    this.h = j8Var.f();
                } else if ((iJ & 240) == 224) {
                    daVar = new da();
                    this.g = true;
                    this.h = j8Var.f();
                }
                if (daVar != null) {
                    daVar.a(this.j, new ep.d(i, 256));
                    a aVar2 = new a(daVar, this.f387a);
                    this.b.put(i, aVar2);
                    aVar = aVar2;
                }
            }
            if (j8Var.f() > ((this.f && this.g) ? this.h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.e = true;
                this.j.c();
            }
        }
        j8Var.c(this.c.c(), 0, 2);
        this.c.f(0);
        int iC = this.c.C() + 6;
        if (aVar == null) {
            j8Var.a(iC);
        } else {
            this.c.d(iC);
            j8Var.d(this.c.c(), 0, iC);
            this.c.f(6);
            aVar.a(this.c);
            yg ygVar = this.c;
            ygVar.e(ygVar.b());
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // com.applovin.impl.i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r5, long r7) {
        /*
            r4 = this;
            com.applovin.impl.io r5 = r4.f387a
            long r5 = r5.c()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r6 = 0
            if (r5 != 0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = r6
        L13:
            if (r5 != 0) goto L2a
            com.applovin.impl.io r5 = r4.f387a
            long r2 = r5.a()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            r0 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L31
            goto L2c
        L2a:
            if (r5 == 0) goto L31
        L2c:
            com.applovin.impl.io r5 = r4.f387a
            r5.d(r7)
        L31:
            com.applovin.impl.ci r5 = r4.i
            if (r5 == 0) goto L38
            r5.b(r7)
        L38:
            android.util.SparseArray r5 = r4.b
            int r5 = r5.size()
            if (r6 >= r5) goto L4e
            android.util.SparseArray r5 = r4.b
            java.lang.Object r5 = r5.valueAt(r6)
            com.applovin.impl.ei$a r5 = (com.applovin.impl.ei.a) r5
            r5.c()
            int r6 = r6 + 1
            goto L38
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ei.a(long, long):void");
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        byte[] bArr = new byte[14];
        j8Var.c(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        j8Var.c(bArr[13] & 7);
        j8Var.c(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
