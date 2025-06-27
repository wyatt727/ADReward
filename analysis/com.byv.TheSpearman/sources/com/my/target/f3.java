package com.my.target;

/* loaded from: classes4.dex */
public class f3 extends q {
    public c3 b;

    public static f3 d() {
        return new f3();
    }

    @Override // com.my.target.q
    public int a() {
        return this.b != null ? 1 : 0;
    }

    public void a(c3 c3Var) {
        this.b = c3Var;
    }

    public c3 c() {
        return this.b;
    }
}
