package com.mbridge.msdk.newreward.function.d.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.d.c.d;
import com.mbridge.msdk.newreward.function.d.c.e;
import com.mbridge.msdk.newreward.function.d.c.i;
import com.mbridge.msdk.newreward.function.d.c.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MBridgeCampaigns.java */
/* loaded from: classes4.dex */
public final class b {
    private String A;
    private int B;
    private int C;
    private List<CampaignEx> D;
    private int E;
    private long G;
    private Map<String, Object> H;
    private String I;

    /* renamed from: a, reason: collision with root package name */
    private int f3343a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private boolean h;
    private int j;
    private String k;
    private String l;
    private String m;
    private String n;
    private int o;
    private long p;
    private long q;
    private long r;
    private double s;
    private int t;
    private List<a> u;
    private JSONObject v;
    private d<?> w;
    private Context z;
    private long i = 30000;
    private int x = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
    private int y = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
    private int F = 0;

    public b(int i, String str, String str2, String str3) {
        this.f3343a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final int a() {
        return this.f3343a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final void a(String str) {
        this.e = str;
    }

    public final String e() {
        return this.f;
    }

    public final void b(String str) {
        this.f = str;
    }

    public final String f() {
        return this.g;
    }

    public final void c(String str) {
        this.g = str;
    }

    public final boolean g() {
        return this.h;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void a(long j) {
        this.i = j;
    }

    public final int h() {
        return this.j;
    }

    public final void a(int i) {
        this.j = i;
    }

    public final String i() {
        return this.k;
    }

    public final void d(String str) {
        this.k = str;
    }

    public final String j() {
        return this.l;
    }

    public final void e(String str) {
        this.l = str;
    }

    public final String k() {
        return this.m;
    }

    public final void f(String str) {
        this.m = str;
    }

    public final String l() {
        return this.n;
    }

    public final void g(String str) {
        this.n = str;
    }

    public final int m() {
        return this.o;
    }

    public final void b(int i) {
        this.o = i;
    }

    public final long n() {
        return this.p;
    }

    public final void b(long j) {
        this.p = j;
    }

    public final long o() {
        return this.q;
    }

    public final void c(long j) {
        this.q = j;
    }

    public final long p() {
        return this.r;
    }

    public final void d(long j) {
        this.r = j;
    }

    public final double q() {
        return this.s;
    }

    public final void a(double d) {
        this.s = d;
    }

    public final int r() {
        return this.t;
    }

    public final void c(int i) {
        this.t = i;
    }

    public final List<a> s() {
        return this.u;
    }

    public final void a(List<a> list) {
        this.u = list;
    }

    public final JSONObject t() {
        return this.v;
    }

    public final void a(JSONObject jSONObject) {
        this.v = jSONObject;
    }

    public final d<?> u() {
        d<?> dVar = this.w;
        if (dVar != null) {
            return dVar;
        }
        String str = this.A;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.w == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                this.w = new e(this, null);
            } else {
                this.w = new i(this, null);
            }
        }
        return this.w;
    }

    public final int v() {
        return this.x;
    }

    public final void d(int i) {
        this.x = i;
    }

    public final void e(int i) {
        this.y = i;
    }

    public final Context w() {
        return this.z;
    }

    public final boolean x() {
        List<a> list;
        d<?> dVar = this.w;
        if (!(dVar == null || dVar.c()) || (list = this.u) == null || list.isEmpty()) {
            return false;
        }
        int size = this.u.size();
        int i = 0;
        for (a aVar : this.u) {
            n nVarD = aVar.d();
            boolean z = nVarD == null || nVarD.c();
            d<?> dVarF = aVar.f();
            boolean z2 = dVarF == null || dVarF.c();
            d<?> dVarC = aVar.c();
            boolean z3 = dVarC == null || dVarC.c();
            if (z && z2 && z3) {
                i++;
            }
        }
        return i == size;
    }

    public final String z() {
        return this.A;
    }

    public final void h(String str) {
        this.A = str;
    }

    public final int A() {
        return this.C;
    }

    public final void f(int i) {
        this.C = i;
    }

    public final int B() {
        return this.B;
    }

    public final void g(int i) {
        this.B = i;
    }

    public final List<CampaignEx> C() {
        return this.D;
    }

    public final void b(List<CampaignEx> list) {
        this.D = list;
    }

    public final int D() {
        int i = this.E;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public final void h(int i) {
        this.E = i;
    }

    public final int E() {
        return this.F;
    }

    public final void i(int i) {
        this.F = i;
    }

    public final Map<String, Object> F() {
        if (this.H == null) {
            this.H = new HashMap();
        }
        return this.H;
    }

    public final long G() {
        return this.G;
    }

    public final void e(long j) {
        this.G = j;
    }

    public final String H() {
        return this.I;
    }

    public final void i(String str) {
        this.I = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y() {
        /*
            r10 = this;
            long r0 = r10.p
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            boolean r3 = r10.x()
            com.mbridge.msdk.newreward.function.d.c.d<?> r4 = r10.w
            if (r4 == 0) goto L20
            boolean r4 = r4.c()
            if (r4 == 0) goto L1e
            goto L20
        L1e:
            r4 = r2
            goto L21
        L20:
            r4 = r1
        L21:
            if (r4 != 0) goto L25
            goto L87
        L25:
            java.util.List<com.mbridge.msdk.newreward.function.d.a.a> r4 = r10.u
            if (r4 == 0) goto L87
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L31
            goto L87
        L31:
            java.util.List<com.mbridge.msdk.newreward.function.d.a.a> r4 = r10.u
            int r4 = r4.size()
            java.util.List<com.mbridge.msdk.newreward.function.d.a.a> r5 = r10.u
            java.util.Iterator r5 = r5.iterator()
            r6 = r2
        L3e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L83
            java.lang.Object r7 = r5.next()
            com.mbridge.msdk.newreward.function.d.a.a r7 = (com.mbridge.msdk.newreward.function.d.a.a) r7
            com.mbridge.msdk.newreward.function.d.c.n r8 = r7.d()
            if (r8 == 0) goto L59
            boolean r8 = r8.d()
            if (r8 == 0) goto L57
            goto L59
        L57:
            r8 = r2
            goto L5a
        L59:
            r8 = r1
        L5a:
            com.mbridge.msdk.newreward.function.d.c.d r9 = r7.f()
            if (r9 == 0) goto L69
            boolean r9 = r9.d()
            if (r9 == 0) goto L67
            goto L69
        L67:
            r9 = r2
            goto L6a
        L69:
            r9 = r1
        L6a:
            com.mbridge.msdk.newreward.function.d.c.d r7 = r7.c()
            if (r7 == 0) goto L79
            boolean r7 = r7.d()
            if (r7 == 0) goto L77
            goto L79
        L77:
            r7 = r2
            goto L7a
        L79:
            r7 = r1
        L7a:
            if (r8 == 0) goto L3e
            if (r9 == 0) goto L3e
            if (r7 == 0) goto L3e
            int r6 = r6 + 1
            goto L3e
        L83:
            if (r6 != r4) goto L87
            r4 = r1
            goto L88
        L87:
            r4 = r2
        L88:
            if (r0 == 0) goto L8f
            if (r3 == 0) goto L8f
            if (r4 == 0) goto L8f
            goto L90
        L8f:
            r1 = r2
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.d.a.b.y():boolean");
    }
}
