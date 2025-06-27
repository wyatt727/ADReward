package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CutInAnimation.java */
/* loaded from: classes2.dex */
public class IPb extends Pm {
    public IPb(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        super(view, eyq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm
    List<ObjectAnimator> EYQ() {
        float f = this.Td.getLayoutParams().width;
        this.Td.setTranslationX(f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "translationX", f, 0.0f).setDuration((int) (this.mZx.tp() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.Td, "alpha", 0.0f, 1.0f).setDuration((int) (this.mZx.tp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(EYQ(duration));
        arrayList.add(EYQ(duration2));
        return arrayList;
    }
}
