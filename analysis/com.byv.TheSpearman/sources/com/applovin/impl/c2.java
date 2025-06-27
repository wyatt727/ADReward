package com.applovin.impl;

import com.applovin.impl.go;
import com.applovin.impl.nh;

/* loaded from: classes.dex */
public abstract class c2 implements nh {

    /* renamed from: a, reason: collision with root package name */
    protected final go.d f309a = new go.d();

    protected c2() {
    }

    @Override // com.applovin.impl.nh
    public final boolean b(int i) {
        return i().a(i);
    }

    @Override // com.applovin.impl.nh
    public final boolean isPlaying() {
        return o() == 3 && l() && j() == 0;
    }

    public final void O() {
        c(t());
    }

    public final void c(int i) {
        a(i, -9223372036854775807L);
    }

    @Override // com.applovin.impl.nh
    public final void a(long j) {
        a(t(), j);
    }

    protected nh.b a(nh.b bVar) {
        return new nh.b.a().a(bVar).a(3, !d()).a(4, y() && !d()).a(5, L() && !d()).a(6, !n().c() && (L() || !N() || y()) && !d()).a(7, K() && !d()).a(8, !n().c() && (K() || (N() && M())) && !d()).a(9, !d()).a(10, y() && !d()).a(11, y() && !d()).a();
    }

    @Override // com.applovin.impl.nh
    public final void B() {
        b(-F());
    }

    @Override // com.applovin.impl.nh
    public final void w() {
        b(e());
    }

    public final boolean L() {
        return I() != -1;
    }

    public final void Q() {
        int I = I();
        if (I != -1) {
            c(I);
        }
    }

    @Override // com.applovin.impl.nh
    public final void D() {
        if (n().c() || d()) {
            return;
        }
        boolean zL = L();
        if (N() && !y()) {
            if (zL) {
                Q();
            }
        } else if (zL && getCurrentPosition() <= q()) {
            Q();
        } else {
            a(0L);
        }
    }

    public final boolean K() {
        return H() != -1;
    }

    public final void P() {
        int iH = H();
        if (iH != -1) {
            c(iH);
        }
    }

    @Override // com.applovin.impl.nh
    public final void u() {
        if (n().c() || d()) {
            return;
        }
        if (K()) {
            P();
        } else if (N() && M()) {
            O();
        }
    }

    public final int H() {
        go goVarN = n();
        if (goVarN.c()) {
            return -1;
        }
        return goVarN.a(t(), J(), r());
    }

    public final int I() {
        go goVarN = n();
        if (goVarN.c()) {
            return -1;
        }
        return goVarN.b(t(), J(), r());
    }

    public final boolean M() {
        go goVarN = n();
        return !goVarN.c() && goVarN.a(t(), this.f309a).j;
    }

    public final boolean N() {
        go goVarN = n();
        return !goVarN.c() && goVarN.a(t(), this.f309a).e();
    }

    @Override // com.applovin.impl.nh
    public final boolean y() {
        go goVarN = n();
        return !goVarN.c() && goVarN.a(t(), this.f309a).i;
    }

    public final long G() {
        go goVarN = n();
        if (goVarN.c()) {
            return -9223372036854775807L;
        }
        return goVarN.a(t(), this.f309a).d();
    }

    private int J() {
        int iM = m();
        if (iM == 1) {
            return 0;
        }
        return iM;
    }

    private void b(long j) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        a(Math.max(currentPosition, 0L));
    }
}
