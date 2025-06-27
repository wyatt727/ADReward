package com.my.target;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public class e5 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<f5> f3958a = new ArrayList<>();
    public int b = 60;

    public static final e5 c() {
        return new e5();
    }

    public int a() {
        return this.b;
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(f5 f5Var) {
        int size = this.f3958a.size();
        for (int i = 0; i < size; i++) {
            if (f5Var.f() > this.f3958a.get(i).f()) {
                this.f3958a.add(i, f5Var);
                return;
            }
        }
        this.f3958a.add(f5Var);
    }

    public boolean b() {
        return !this.f3958a.isEmpty();
    }

    public f5 d() {
        if (this.f3958a.isEmpty()) {
            return null;
        }
        return this.f3958a.remove(0);
    }
}
