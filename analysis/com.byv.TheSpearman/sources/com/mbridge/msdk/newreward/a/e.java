package com.mbridge.msdk.newreward.a;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;

/* compiled from: AdapterModel.java */
/* loaded from: classes4.dex */
public final class e {
    private int A;
    private long B;
    private RewardVideoListener K;

    /* renamed from: a, reason: collision with root package name */
    public b f3297a;
    int b;
    private String c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean k;
    private long m;
    private long n;
    private String r;
    private boolean s;
    private String u;
    private String v;
    private int w;
    private String x;
    private String y;
    private int i = 2;
    private int j = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
    private boolean l = false;
    private boolean o = false;
    private int p = 0;
    private int q = 0;
    private boolean t = false;
    private String z = "";
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private com.mbridge.msdk.newreward.function.f.a F = new com.mbridge.msdk.newreward.function.f.a();
    private com.mbridge.msdk.newreward.function.f.d G = new com.mbridge.msdk.newreward.function.f.d();
    private com.mbridge.msdk.newreward.function.f.e H = new com.mbridge.msdk.newreward.function.f.e();
    private com.mbridge.msdk.newreward.function.f.c I = new com.mbridge.msdk.newreward.function.f.c();
    private int J = 25000;

    public final boolean a() {
        return this.s;
    }

    public final void a(boolean z) {
        this.s = z;
    }

    public final String b() {
        return this.r;
    }

    public final void a(String str) {
        this.r = str;
    }

    public final void c() {
        this.p++;
    }

    public final void d() {
        this.q++;
    }

    public final boolean e() {
        return this.o;
    }

    public final void b(boolean z) {
        this.o = z;
    }

    public final long f() {
        return this.n;
    }

    public final void a(long j) {
        this.n = j;
    }

    public final long g() {
        return this.m;
    }

    public final void b(long j) {
        this.m = j;
    }

    public final boolean h() {
        return this.l;
    }

    public final void c(boolean z) {
        this.l = z;
    }

    public final boolean i() {
        return this.t;
    }

    public final void d(boolean z) {
        this.t = z;
    }

    public final int j() {
        return this.g;
    }

    public final int k() {
        return this.h;
    }

    public final void e(boolean z) {
        this.E = z;
    }

    public final boolean l() {
        return this.E;
    }

    public final boolean m() {
        return this.D;
    }

    public final void f(boolean z) {
        this.D = z;
    }

    public final boolean n() {
        return this.C;
    }

    public final void g(boolean z) {
        this.C = z;
    }

    public final long o() {
        return this.B;
    }

    public final void c(long j) {
        this.B = j;
    }

    public final int p() {
        return this.w;
    }

    public final void a(int i) {
        this.e = i;
    }

    public final String q() {
        return this.z;
    }

    public final void b(String str) {
        this.z = str;
    }

    public final com.mbridge.msdk.newreward.function.f.e r() {
        return this.H;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.e eVar) {
        this.H = eVar;
    }

    public final int s() {
        return this.A;
    }

    public final void b(int i) {
        this.A = i;
    }

    public final com.mbridge.msdk.newreward.function.f.c t() {
        return this.I;
    }

    public e(boolean z, int i, String str, String str2, boolean z2) {
        this.d = z;
        this.w = i;
        this.u = str;
        this.v = str2;
        this.k = z2;
    }

    public final int u() {
        return this.b;
    }

    public final void c(int i) {
        this.b = i;
    }

    public final String v() {
        return this.x;
    }

    public final void c(String str) {
        this.x = str;
    }

    public final String w() {
        return this.y;
    }

    public final void d(String str) {
        this.y = str;
    }

    public final com.mbridge.msdk.newreward.function.f.a x() {
        return this.F;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.a aVar) {
        this.F = aVar;
    }

    public final com.mbridge.msdk.newreward.function.f.d y() {
        return this.G;
    }

    public final String z() {
        return this.c;
    }

    public final void e(String str) {
        this.c = str;
    }

    public final String A() {
        return this.v;
    }

    public final boolean B() {
        return this.d;
    }

    public final String C() {
        return this.u;
    }

    public final RewardVideoListener D() {
        return this.K;
    }

    public final void a(RewardVideoListener rewardVideoListener) {
        this.K = rewardVideoListener;
    }

    public final int E() {
        return this.f;
    }

    public final int F() {
        return this.d ? 2 : 3;
    }

    public final int G() {
        return this.e;
    }

    public final void d(int i) {
        this.i = i;
    }

    public final int H() {
        return this.i;
    }

    public final void a(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public final int I() {
        int i = this.J;
        if (i <= 0) {
            return 25000;
        }
        return i;
    }

    public final void e(int i) {
        this.J = i;
    }

    public final void f(int i) {
        this.j = i;
    }

    public final int J() {
        return this.j;
    }

    public final boolean K() {
        return this.k;
    }

    public final long L() {
        com.mbridge.msdk.newreward.function.f.a aVar = this.F;
        if (aVar != null && aVar.b() != null && this.F.b().n() > 0) {
            return this.F.b().n();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.mbridge.msdk.videocommon.d.a aVarA = this.H.a();
        return (aVarA == null ? 3600000L : aVarA.f()) + jCurrentTimeMillis;
    }
}
