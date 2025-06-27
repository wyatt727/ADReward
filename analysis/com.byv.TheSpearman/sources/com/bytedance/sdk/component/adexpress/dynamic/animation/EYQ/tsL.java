package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShineAnimation.java */
/* loaded from: classes2.dex */
public class tsL extends Pm {
    public tsL(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        super(view, eyq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm
    List<ObjectAnimator> EYQ() {
        int i;
        int i2;
        this.Td.setTag(2097610711, Integer.valueOf(this.mZx.Pm()));
        if (this.Td == null || !com.bytedance.sdk.component.adexpress.Pm.mZx.EYQ(this.Td.getContext())) {
            i = 1;
            i2 = 0;
        } else {
            i2 = 1;
            i = 0;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "shineValue", i2, i).setDuration((int) (this.mZx.tp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(EYQ(duration));
        return arrayList;
    }
}
