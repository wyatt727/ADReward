package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class y extends zb {
    private final z f;
    private final a0 g;
    private final kr h;
    private final String i;
    private final List j;
    private final List k;
    private final List l;

    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    private yb f() {
        return yb.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private yb g() {
        return yb.a().d("ID").c(this.f.c()).a();
    }

    private yb i() {
        return yb.a().d("Selected Network").c(this.h.b().a()).a();
    }

    @Override // com.applovin.impl.zb
    protected int b() {
        return a.COUNT.ordinal();
    }

    y(z zVar, a0 a0Var, kr krVar, Context context) {
        super(context);
        this.f = zVar;
        this.h = krVar;
        this.g = a0Var != null ? a0Var : zVar.f();
        this.i = a0Var != null ? a0Var.c() : zVar.d();
        this.j = h();
        this.k = e();
        this.l = l();
        notifyDataSetChanged();
    }

    public String k() {
        return this.i;
    }

    public a0 j() {
        return this.g;
    }

    @Override // com.applovin.impl.zb
    protected int d(int i) {
        if (i == a.INFO.ordinal()) {
            return this.j.size();
        }
        if (i == a.BIDDERS.ordinal()) {
            return this.k.size();
        }
        return this.l.size();
    }

    private yb d() {
        return yb.a().d("Ad Format").c(this.f.b()).a();
    }

    @Override // com.applovin.impl.zb
    protected List c(int i) {
        if (i == a.INFO.ordinal()) {
            return this.j;
        }
        if (i == a.BIDDERS.ordinal()) {
            return this.k;
        }
        return this.l;
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.g.b() != null) {
            arrayList.add(f());
        }
        if (this.h != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private List e() {
        kr krVar = this.h;
        if (krVar != null && !krVar.d()) {
            return new ArrayList();
        }
        List<kr> listA = this.g.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (kr krVar2 : listA) {
            kr krVar3 = this.h;
            if (krVar3 == null || krVar3.b().c().equals(krVar2.b().c())) {
                arrayList.add(new b(krVar2, krVar2.a() != null ? krVar2.a().a() : "", this.h == null));
            }
        }
        return arrayList;
    }

    private List l() {
        kr krVar = this.h;
        if (krVar != null && krVar.d()) {
            return new ArrayList();
        }
        List<kr> listE = this.g.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (kr krVar2 : listE) {
            kr krVar3 = this.h;
            if (krVar3 == null || krVar3.b().c().equals(krVar2.b().c())) {
                arrayList.add(new b(krVar2, null, this.h == null));
                for (yf yfVar : krVar2.c()) {
                    arrayList.add(yb.a().d(yfVar.a()).c(yfVar.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    class b extends xf {
        private final kr p;

        @Override // com.applovin.impl.yb
        public int g() {
            return -12303292;
        }

        b(kr krVar, String str, boolean z) {
            super(krVar.b().d(), y.this.f1235a);
            this.p = krVar;
            this.c = StringUtils.createSpannedString(krVar.b().a(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.b = z;
        }

        public kr v() {
            return this.p;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public boolean o() {
            return this.b;
        }
    }

    @Override // com.applovin.impl.zb
    protected yb e(int i) {
        if (i == a.INFO.ordinal()) {
            return new bj("INFO");
        }
        if (i == a.BIDDERS.ordinal()) {
            return new bj("BIDDERS");
        }
        return new bj("WATERFALL");
    }
}
