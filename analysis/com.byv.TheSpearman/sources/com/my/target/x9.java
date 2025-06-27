package com.my.target;

import android.view.View;
import com.my.target.pa;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class x9 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<u9> f4184a;
    public final j2 b;
    public boolean c = false;

    public x9(j2 j2Var, ArrayList<u9> arrayList) {
        this.b = j2Var;
        this.f4184a = arrayList;
    }

    public final pa.a a() {
        if (this.c) {
            return null;
        }
        return this.b.a();
    }

    public abstract void a(View view);

    public abstract void a(boolean z, float f, View view);

    public void b() {
        if (this.c) {
            return;
        }
        this.b.a(this);
        this.c = true;
        ba.b("ViewabilityTracker: StatTracker", "i'm killed");
    }

    public abstract void c();
}
