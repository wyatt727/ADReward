package com.my.target;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class s0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f4117a;
    public n4 b;

    public s0(p0 p0Var) {
        super(p0Var.a());
        this.f4117a = p0Var;
    }

    public void a() {
        n4 n4Var = this.b;
        if (n4Var != null) {
            n4Var.a(this.f4117a);
        }
        this.b = null;
    }

    public void a(n4 n4Var, int i) {
        this.b = n4Var;
        n4Var.a(this.f4117a, i);
    }
}
