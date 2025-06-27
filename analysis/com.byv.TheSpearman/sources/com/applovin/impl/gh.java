package com.applovin.impl;

import android.graphics.Bitmap;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class gh extends bk {
    private final yg o;
    private final yg p;
    private final a q;
    private Inflater r;

    public gh() {
        super("PgsDecoder");
        this.o = new yg();
        this.p = new yg();
        this.q = new a();
    }

    @Override // com.applovin.impl.bk
    protected kl a(byte[] bArr, int i, boolean z) {
        this.o.a(bArr, i);
        a(this.o);
        this.q.b();
        ArrayList arrayList = new ArrayList();
        while (this.o.a() >= 3) {
            z4 z4VarA = a(this.o, this.q);
            if (z4VarA != null) {
                arrayList.add(z4VarA);
            }
        }
        return new hh(Collections.unmodifiableList(arrayList));
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final yg f460a = new yg();
        private final int[] b = new int[256];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        /* JADX INFO: Access modifiers changed from: private */
        public void c(yg ygVar, int i) {
            if (i % 5 != 2) {
                return;
            }
            ygVar.g(2);
            Arrays.fill(this.b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int iW = ygVar.w();
                int iW2 = ygVar.w();
                int iW3 = ygVar.w();
                int iW4 = ygVar.w();
                double d = iW2;
                double d2 = iW3 - 128;
                double d3 = iW4 - 128;
                this.b[iW] = (yp.a((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (ygVar.w() << 24) | (yp.a((int) ((1.402d * d2) + d), 0, 255) << 16) | yp.a((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.c = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(yg ygVar, int i) {
            if (i < 19) {
                return;
            }
            this.d = ygVar.C();
            this.e = ygVar.C();
            ygVar.g(11);
            this.f = ygVar.C();
            this.g = ygVar.C();
        }

        public z4 a() {
            int iW;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.f460a.e() == 0 || this.f460a.d() != this.f460a.e() || !this.c) {
                return null;
            }
            this.f460a.f(0);
            int i = this.h * this.i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int iW2 = this.f460a.w();
                if (iW2 != 0) {
                    iW = i2 + 1;
                    iArr[i2] = this.b[iW2];
                } else {
                    int iW3 = this.f460a.w();
                    if (iW3 != 0) {
                        iW = ((iW3 & 64) == 0 ? iW3 & 63 : ((iW3 & 63) << 8) | this.f460a.w()) + i2;
                        Arrays.fill(iArr, i2, iW, (iW3 & 128) == 0 ? 0 : this.b[this.f460a.w()]);
                    }
                }
                i2 = iW;
            }
            return new z4.b().a(Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888)).b(this.f / this.d).b(0).a(this.g / this.e, 0).a(0).d(this.h / this.d).a(this.i / this.e).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(yg ygVar, int i) {
            int iZ;
            if (i < 4) {
                return;
            }
            ygVar.g(3);
            int i2 = i - 4;
            if ((ygVar.w() & 128) != 0) {
                if (i2 < 7 || (iZ = ygVar.z()) < 4) {
                    return;
                }
                this.h = ygVar.C();
                this.i = ygVar.C();
                this.f460a.d(iZ - 4);
                i2 = i - 11;
            }
            int iD = this.f460a.d();
            int iE = this.f460a.e();
            if (iD >= iE || i2 <= 0) {
                return;
            }
            int iMin = Math.min(i2, iE - iD);
            ygVar.a(this.f460a.c(), iD, iMin);
            this.f460a.f(iD + iMin);
        }

        public void b() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.f460a.d(0);
            this.c = false;
        }
    }

    private void a(yg ygVar) {
        if (ygVar.a() <= 0 || ygVar.g() != 120) {
            return;
        }
        if (this.r == null) {
            this.r = new Inflater();
        }
        if (yp.a(ygVar, this.p, this.r)) {
            ygVar.a(this.p.c(), this.p.e());
        }
    }

    private static z4 a(yg ygVar, a aVar) {
        int iE = ygVar.e();
        int iW = ygVar.w();
        int iC = ygVar.C();
        int iD = ygVar.d() + iC;
        z4 z4VarA = null;
        if (iD > iE) {
            ygVar.f(iE);
            return null;
        }
        if (iW != 128) {
            switch (iW) {
                case 20:
                    aVar.c(ygVar, iC);
                    break;
                case 21:
                    aVar.a(ygVar, iC);
                    break;
                case 22:
                    aVar.b(ygVar, iC);
                    break;
            }
        } else {
            z4VarA = aVar.a();
            aVar.b();
        }
        ygVar.f(iD);
        return z4VarA;
    }
}
