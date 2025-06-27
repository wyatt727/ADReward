package com.json;

import com.json.mediationsdk.model.InterstitialPlacement;
import com.json.mediationsdk.utils.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class n8 {
    private static final int p = 0;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<InterstitialPlacement> f2031a;
    private r0 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private a g;
    private boolean h;
    private boolean i;
    private long j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private InterstitialPlacement o;

    public n8() {
        this.f2031a = new ArrayList<>();
        this.b = new r0();
    }

    public n8(int i, boolean z, int i2, r0 r0Var, a aVar, int i3, boolean z2, boolean z3, long j, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f2031a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = r0Var;
        this.g = aVar;
        this.k = z4;
        this.l = z5;
        this.f = i3;
        this.h = z2;
        this.i = z3;
        this.j = j;
        this.m = z6;
        this.n = z7;
    }

    public InterstitialPlacement a() {
        Iterator<InterstitialPlacement> it = this.f2031a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.getIsDefault()) {
                return next;
            }
        }
        return this.o;
    }

    public InterstitialPlacement a(String str) {
        Iterator<InterstitialPlacement> it = this.f2031a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public void a(InterstitialPlacement interstitialPlacement) {
        if (interstitialPlacement != null) {
            this.f2031a.add(interstitialPlacement);
            if (this.o == null || interstitialPlacement.isPlacementId(0)) {
                this.o = interstitialPlacement;
            }
        }
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean f() {
        return this.d;
    }

    public a g() {
        return this.g;
    }

    public boolean h() {
        return this.i;
    }

    public long i() {
        return this.j;
    }

    public r0 j() {
        return this.b;
    }

    public boolean k() {
        return this.h;
    }

    public boolean l() {
        return this.k;
    }

    public boolean m() {
        return this.n;
    }

    public boolean n() {
        return this.m;
    }

    public boolean o() {
        return this.l;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }
}
