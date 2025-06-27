package com.my.target;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class s {
    public Boolean A;
    public Boolean B;
    public Boolean C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Boolean H;
    public Boolean I;
    public i7 J;
    public c K;

    /* renamed from: a, reason: collision with root package name */
    public final String f4116a;
    public final String b;
    public ArrayList<u9> f;
    public ArrayList<e1> g;
    public s h;
    public String i;
    public String j;
    public String k;
    public int l;
    public boolean t;
    public boolean u;
    public boolean v;
    public Boolean x;
    public Boolean y;
    public Boolean z;
    public final ArrayList<s> c = new ArrayList<>();
    public final ArrayList<u9> d = new ArrayList<>();
    public final v9 e = v9.e();
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public float r = -1.0f;
    public float s = -1.0f;
    public float w = -1.0f;

    public s(String str, String str2) {
        this.b = str;
        this.f4116a = str2;
    }

    public static s a(String str, String str2) {
        return new s(str, str2);
    }

    public static s b(String str) {
        return a(str, null);
    }

    public int A() {
        return this.n;
    }

    public int B() {
        return this.l;
    }

    public int C() {
        return this.p;
    }

    public ArrayList<s> D() {
        return this.c;
    }

    public boolean E() {
        return this.t;
    }

    public boolean F() {
        return this.u;
    }

    public Boolean G() {
        return this.I;
    }

    public boolean H() {
        return this.v;
    }

    public c a() {
        return this.K;
    }

    public ArrayList<u9> a(String str) {
        ArrayList<u9> arrayList = new ArrayList<>();
        Iterator<u9> it = this.d.iterator();
        while (it.hasNext()) {
            u9 next = it.next();
            if (str.equals(next.a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void a(float f) {
        this.w = f;
    }

    public void a(int i) {
        this.q = i;
    }

    public void a(c cVar) {
        this.K = cVar;
    }

    public void a(i7 i7Var) {
        this.J = i7Var;
    }

    public void a(s sVar) {
        this.c.add(sVar);
    }

    public void a(u9 u9Var) {
        this.d.add(u9Var);
    }

    public void a(Boolean bool) {
        this.F = bool;
    }

    public void a(ArrayList<u9> arrayList) {
        ArrayList<u9> arrayList2 = this.f;
        if (arrayList2 == null) {
            this.f = arrayList;
        } else if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
    }

    public void a(boolean z) {
        this.t = z;
    }

    public String b() {
        return this.k;
    }

    public void b(float f) {
        this.r = f;
    }

    public void b(int i) {
        this.o = i;
    }

    public void b(s sVar) {
        this.h = sVar;
        if (sVar != null) {
            sVar.d(this.n);
        }
    }

    public void b(Boolean bool) {
        this.x = bool;
    }

    public void b(ArrayList<e1> arrayList) {
        this.g = arrayList;
    }

    public void b(boolean z) {
        this.u = z;
    }

    public Boolean c() {
        return this.F;
    }

    public void c(float f) {
        this.s = f;
    }

    public void c(int i) {
        this.m = i;
    }

    public void c(Boolean bool) {
        this.y = bool;
    }

    public void c(String str) {
        this.k = str;
    }

    public void c(ArrayList<u9> arrayList) {
        this.f = arrayList;
    }

    public void c(boolean z) {
        this.v = z;
    }

    public Boolean d() {
        return this.x;
    }

    public void d(int i) {
        this.n = i;
        s sVar = this.h;
        if (sVar != null) {
            sVar.d(i);
        }
    }

    public void d(Boolean bool) {
        this.E = bool;
    }

    public void d(String str) {
        this.j = str;
    }

    public float e() {
        return this.w;
    }

    public void e(int i) {
        this.l = i;
    }

    public void e(Boolean bool) {
        this.z = bool;
    }

    public void e(String str) {
        this.i = str;
    }

    public Boolean f() {
        return this.y;
    }

    public void f(int i) {
        this.p = i;
    }

    public void f(Boolean bool) {
        this.A = bool;
    }

    public Boolean g() {
        return this.E;
    }

    public void g(Boolean bool) {
        this.B = bool;
    }

    public Boolean h() {
        return this.z;
    }

    public void h(Boolean bool) {
        this.G = bool;
    }

    public Boolean i() {
        return this.A;
    }

    public void i(Boolean bool) {
        this.H = bool;
    }

    public Boolean j() {
        return this.B;
    }

    public void j(Boolean bool) {
        this.C = bool;
    }

    public Boolean k() {
        return this.G;
    }

    public void k(Boolean bool) {
        this.I = bool;
    }

    public Boolean l() {
        return this.H;
    }

    public void l(Boolean bool) {
        this.D = bool;
    }

    public v9 m() {
        return this.e;
    }

    public int n() {
        return this.q;
    }

    public ArrayList<e1> o() {
        return this.g;
    }

    public String p() {
        return this.j;
    }

    public Boolean q() {
        return this.C;
    }

    public int r() {
        return this.o;
    }

    public int s() {
        return this.m;
    }

    public ArrayList<u9> t() {
        if (this.f != null) {
            return new ArrayList<>(this.f);
        }
        return null;
    }

    public String u() {
        return this.i;
    }

    public i7 v() {
        return this.J;
    }

    public s w() {
        return this.h;
    }

    public Boolean x() {
        return this.D;
    }

    public float y() {
        return this.r;
    }

    public float z() {
        return this.s;
    }
}
