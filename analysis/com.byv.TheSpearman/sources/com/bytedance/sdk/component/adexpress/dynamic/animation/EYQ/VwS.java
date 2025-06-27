package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarqueeAnimation.java */
/* loaded from: classes2.dex */
public class VwS extends Pm {
    public VwS(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        super(view, eyq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm
    List<ObjectAnimator> EYQ() {
        this.Td.setTag(2097610709, Integer.valueOf(this.mZx.Td()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.mZx.tp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(EYQ(duration));
        return arrayList;
    }
}
