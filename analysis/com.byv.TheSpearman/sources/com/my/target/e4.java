package com.my.target;

/* loaded from: classes4.dex */
public class e4 extends q {
    public p3 b;

    public static e4 d() {
        return new e4();
    }

    @Override // com.my.target.q
    public int a() {
        return this.b == null ? 0 : 1;
    }

    public void a(p3 p3Var) {
        this.b = p3Var;
    }

    public p3 c() {
        return this.b;
    }
}
