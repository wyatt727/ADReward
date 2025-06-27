package com.my.target;

import com.my.target.v4;
import com.my.target.x7;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class s4 implements v4, x7.a {

    /* renamed from: a, reason: collision with root package name */
    public final x7 f4121a;
    public final v4.a b;
    public final boolean[] c;
    public final List<b> d = new ArrayList();
    public final List<r3> e;

    public s4(x7 x7Var, List<r3> list, v4.a aVar) {
        this.f4121a = x7Var;
        this.b = aVar;
        this.e = new ArrayList(list);
        this.c = new boolean[list.size()];
        x7Var.setListener(this);
    }

    public static v4 a(x7 x7Var, List<r3> list, v4.a aVar) {
        return new s4(x7Var, list, aVar);
    }

    @Override // com.my.target.n4.a
    public void a(b bVar) {
        if (this.d.contains(bVar)) {
            return;
        }
        this.b.b(bVar);
        this.d.add(bVar);
    }

    @Override // com.my.target.n4.a
    public void a(b bVar, boolean z, int i) {
        if (!this.f4121a.b(i)) {
            this.f4121a.a(i);
        } else if (z) {
            this.b.a(bVar);
        }
    }

    @Override // com.my.target.x7.a
    public void a(int[] iArr) {
        for (int i : iArr) {
            if (i >= 0) {
                boolean[] zArr = this.c;
                if (i < zArr.length && !zArr[i]) {
                    zArr[i] = true;
                    this.b.c(this.e.get(i));
                }
            }
        }
    }
}
