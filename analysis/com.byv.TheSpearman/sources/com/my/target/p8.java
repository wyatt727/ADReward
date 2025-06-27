package com.my.target;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class p8 extends x9 {
    public p8(j2 j2Var, ArrayList<u9> arrayList) {
        super(j2Var, arrayList);
    }

    public static p8 a(j2 j2Var, ArrayList<u9> arrayList) {
        return new p8(j2Var, arrayList);
    }

    @Override // com.my.target.x9
    public void a(View view) {
        w9.a(this.f4184a, view.getContext());
        ba.b("ViewabilityTracker: RenderStatTracker", "Render tracked, kill self");
        b();
    }

    @Override // com.my.target.x9
    public void a(boolean z, float f, View view) {
    }

    @Override // com.my.target.x9
    public void c() {
    }
}
