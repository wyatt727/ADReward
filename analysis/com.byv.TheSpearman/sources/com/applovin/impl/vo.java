package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.common.base.MoreObjects;
import com.applovin.impl.ab;
import com.applovin.impl.m2;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes.dex */
public class vo implements m2 {
    public static final m2.a A;
    public static final vo y;
    public static final vo z;

    /* renamed from: a, reason: collision with root package name */
    public final int f1104a;
    public final int b;
    public final int c;
    public final int d;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final ab m;
    public final ab n;
    public final int o;
    public final int p;
    public final int q;
    public final ab r;
    public final ab s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final eb x;

    static {
        vo voVarA = new a().a();
        y = voVarA;
        z = voVarA;
        A = new m2.a() { // from class: com.applovin.impl.vo$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.m2.a
            public final m2 a(Bundle bundle) {
                return vo.a(bundle);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ vo a(Bundle bundle) {
        return new a(bundle).a();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f1105a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private ab l;
        private ab m;
        private int n;
        private int o;
        private int p;
        private ab q;
        private ab r;
        private int s;
        private boolean t;
        private boolean u;
        private boolean v;
        private eb w;

        private void b(Context context) {
            CaptioningManager captioningManager;
            if ((yp.f1214a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.r = ab.a(yp.a(locale));
                }
            }
        }

        public a() {
            this.f1105a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
            this.c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = Integer.MAX_VALUE;
            this.k = true;
            this.l = ab.h();
            this.m = ab.h();
            this.n = 0;
            this.o = Integer.MAX_VALUE;
            this.p = Integer.MAX_VALUE;
            this.q = ab.h();
            this.r = ab.h();
            this.s = 0;
            this.t = false;
            this.u = false;
            this.v = false;
            this.w = eb.h();
        }

        public a(Context context) {
            this();
            a(context);
            a(context, true);
        }

        protected a(Bundle bundle) {
            String strB = vo.b(6);
            vo voVar = vo.y;
            this.f1105a = bundle.getInt(strB, voVar.f1104a);
            this.b = bundle.getInt(vo.b(7), voVar.b);
            this.c = bundle.getInt(vo.b(8), voVar.c);
            this.d = bundle.getInt(vo.b(9), voVar.d);
            this.e = bundle.getInt(vo.b(10), voVar.f);
            this.f = bundle.getInt(vo.b(11), voVar.g);
            this.g = bundle.getInt(vo.b(12), voVar.h);
            this.h = bundle.getInt(vo.b(13), voVar.i);
            this.i = bundle.getInt(vo.b(14), voVar.j);
            this.j = bundle.getInt(vo.b(15), voVar.k);
            this.k = bundle.getBoolean(vo.b(16), voVar.l);
            this.l = ab.c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(17)), new String[0]));
            this.m = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(1)), new String[0]));
            this.n = bundle.getInt(vo.b(2), voVar.o);
            this.o = bundle.getInt(vo.b(18), voVar.p);
            this.p = bundle.getInt(vo.b(19), voVar.q);
            this.q = ab.c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(20)), new String[0]));
            this.r = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(3)), new String[0]));
            this.s = bundle.getInt(vo.b(4), voVar.t);
            this.t = bundle.getBoolean(vo.b(5), voVar.u);
            this.u = bundle.getBoolean(vo.b(21), voVar.v);
            this.v = bundle.getBoolean(vo.b(22), voVar.w);
            this.w = eb.a((Collection) pb.a((int[]) MoreObjects.firstNonNull(bundle.getIntArray(vo.b(23)), new int[0])));
        }

        private static ab a(String[] strArr) {
            ab.a aVarF = ab.f();
            for (String str : (String[]) a1.a(strArr)) {
                aVarF.b(yp.f((String) a1.a((Object) str)));
            }
            return aVarF.a();
        }

        public a a(int i, int i2, boolean z) {
            this.i = i;
            this.j = i2;
            this.k = z;
            return this;
        }

        public a a(Context context, boolean z) {
            Point pointC = yp.c(context);
            return a(pointC.x, pointC.y, z);
        }

        public a a(Context context) {
            if (yp.f1214a >= 19) {
                b(context);
            }
            return this;
        }

        public vo a() {
            return new vo(this);
        }
    }

    protected vo(a aVar) {
        this.f1104a = aVar.f1105a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = aVar.o;
        this.q = aVar.p;
        this.r = aVar.q;
        this.s = aVar.r;
        this.t = aVar.s;
        this.u = aVar.t;
        this.v = aVar.u;
        this.w = aVar.v;
        this.x = aVar.w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vo voVar = (vo) obj;
        return this.f1104a == voVar.f1104a && this.b == voVar.b && this.c == voVar.c && this.d == voVar.d && this.f == voVar.f && this.g == voVar.g && this.h == voVar.h && this.i == voVar.i && this.l == voVar.l && this.j == voVar.j && this.k == voVar.k && this.m.equals(voVar.m) && this.n.equals(voVar.n) && this.o == voVar.o && this.p == voVar.p && this.q == voVar.q && this.r.equals(voVar.r) && this.s.equals(voVar.s) && this.t == voVar.t && this.u == voVar.u && this.v == voVar.v && this.w == voVar.w && this.x.equals(voVar.x);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((this.f1104a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + (this.l ? 1 : 0)) * 31) + this.j) * 31) + this.k) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t) * 31) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + this.x.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i) {
        return Integer.toString(i, 36);
    }
}
