package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.pa;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class g9 extends g1 {
    public v9 f;

    public g9(j2 j2Var, ArrayList<u9> arrayList, long j, v9 v9Var) {
        super(j2Var, arrayList, j);
        this.f = v9Var;
    }

    public static g9 a(j2 j2Var, ArrayList<u9> arrayList, long j, v9 v9Var) {
        return new g9(j2Var, arrayList, j, v9Var);
    }

    public final void a(Context context) {
        b(context);
        c(context);
        pa.a aVarA = a();
        if (aVarA != null) {
            aVarA.a();
        }
        ba.b("ViewabilityTracker: ShowStatTracker", "Show tracked, kill self");
        b();
    }

    @Override // com.my.target.x9
    public void a(View view) {
    }

    @Override // com.my.target.x9
    public void a(boolean z, float f, View view) {
        if (a(z)) {
            a(view.getContext());
        }
    }

    @Override // com.my.target.x9
    public void b() {
        super.b();
        this.f = null;
    }

    public final void b(Context context) {
        String strD = ca.d(context);
        if (strD != null) {
            w9.a(this.f.a(strD), context);
        }
    }

    @Override // com.my.target.x9
    public void c() {
        this.e = 0L;
    }

    public final void c(Context context) {
        w9.a(this.f4184a, context);
    }
}
