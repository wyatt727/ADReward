package com.my.target;

/* loaded from: classes4.dex */
public class q9 extends q {
    public j9 b;
    public boolean c = true;

    public static q9 e() {
        return new q9();
    }

    @Override // com.my.target.q
    public int a() {
        return this.b == null ? 0 : 1;
    }

    public void a(j9 j9Var) {
        this.b = j9Var;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public j9 c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }
}
