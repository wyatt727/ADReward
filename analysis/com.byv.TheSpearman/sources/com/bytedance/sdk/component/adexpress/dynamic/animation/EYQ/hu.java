package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WaggleAnimation.java */
/* loaded from: classes2.dex */
public class hu extends Pm {
    public hu(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        super(view, eyq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm
    List<ObjectAnimator> EYQ() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), 20.0f), 0.0f, -com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), 20.0f), 0.0f).setDuration((int) (this.mZx.tp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(EYQ(duration));
        return arrayList;
    }
}
