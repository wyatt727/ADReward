package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TranslateAnimation.java */
/* loaded from: classes2.dex */
public class KO extends Pm {
    public KO(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        super(view, eyq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm
    List<ObjectAnimator> EYQ() {
        float f;
        float fEYQ = com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.mZx.IPb());
        float fEYQ2 = com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.mZx.VwS());
        float f2 = 0.0f;
        if ("reverse".equals(this.mZx.hu())) {
            f = fEYQ2;
            fEYQ2 = 0.0f;
            f2 = fEYQ;
            fEYQ = 0.0f;
        } else {
            f = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.Pm.mZx.EYQ(this.Td.getContext())) {
            fEYQ = -fEYQ;
            f2 = -f2;
        }
        this.Td.setTranslationX(fEYQ);
        this.Td.setTranslationY(fEYQ2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "translationX", fEYQ, f2).setDuration((int) (this.mZx.tp() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.Td, "translationY", fEYQ2, f).setDuration((int) (this.mZx.tp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(EYQ(duration));
        arrayList.add(EYQ(duration2));
        return arrayList;
    }
}
