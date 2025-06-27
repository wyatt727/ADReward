package com.json;

import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.utils.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class cc {
    private static final int q = 0;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<Placement> f1724a;
    private r0 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private Placement n;
    private a o;
    private boolean p;

    public cc() {
        this.f1724a = new ArrayList<>();
        this.b = new r0();
    }

    public cc(int i, boolean z, int i2, int i3, r0 r0Var, a aVar, int i4, boolean z2, boolean z3, long j, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f1724a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = r0Var;
        this.f = i3;
        this.o = aVar;
        this.g = i4;
        this.p = z2;
        this.h = z3;
        this.i = j;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
    }

    public Placement a() {
        Iterator<Placement> it = this.f1724a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.getIsDefault()) {
                return next;
            }
        }
        return this.n;
    }

    public Placement a(String str) {
        Iterator<Placement> it = this.f1724a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public void a(Placement placement) {
        if (placement != null) {
            this.f1724a.add(placement);
            if (this.n == null || placement.isPlacementId(0)) {
                this.n = placement;
            }
        }
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.p;
    }

    public ArrayList<Placement> e() {
        return this.f1724a;
    }

    public boolean f() {
        return this.j;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean j() {
        return this.d;
    }

    public a k() {
        return this.o;
    }

    public boolean l() {
        return this.h;
    }

    public long m() {
        return this.i;
    }

    public r0 n() {
        return this.b;
    }

    public boolean o() {
        return this.m;
    }

    public boolean p() {
        return this.l;
    }

    public boolean q() {
        return this.k;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }
}
