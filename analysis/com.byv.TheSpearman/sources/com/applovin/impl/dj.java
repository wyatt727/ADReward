package com.applovin.impl;

import androidx.core.view.InputDeviceCompat;
import com.applovin.impl.ep;

/* loaded from: classes.dex */
public final class dj implements ep {

    /* renamed from: a, reason: collision with root package name */
    private final cj f366a;
    private final yg b = new yg(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public dj(cj cjVar) {
        this.f366a = cjVar;
    }

    @Override // com.applovin.impl.ep
    public void a(yg ygVar, int i) {
        boolean z = (i & 1) != 0;
        int iD = z ? ygVar.d() + ygVar.w() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            ygVar.f(iD);
            this.d = 0;
        }
        while (ygVar.a() > 0) {
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iW = ygVar.w();
                    ygVar.f(ygVar.d() - 1);
                    if (iW == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(ygVar.a(), 3 - this.d);
                ygVar.a(this.b.c(), this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    this.b.f(0);
                    this.b.e(3);
                    this.b.g(1);
                    int iW2 = this.b.w();
                    int iW3 = this.b.w();
                    this.e = (iW2 & 128) != 0;
                    this.c = (((iW2 & 15) << 8) | iW3) + 3;
                    int iB = this.b.b();
                    int i4 = this.c;
                    if (iB < i4) {
                        this.b.a(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i4, this.b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(ygVar.a(), this.c - this.d);
                ygVar.a(this.b.c(), this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        if (yp.a(this.b.c(), 0, this.c, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.e(this.c - 4);
                    } else {
                        this.b.e(i6);
                    }
                    this.b.f(0);
                    this.f366a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.applovin.impl.ep
    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.f366a.a(ioVar, k8Var, dVar);
        this.f = true;
    }

    @Override // com.applovin.impl.ep
    public void a() {
        this.f = true;
    }
}
