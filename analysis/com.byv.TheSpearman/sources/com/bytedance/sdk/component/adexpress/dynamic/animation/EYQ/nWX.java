package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SwingAnimation.java */
/* loaded from: classes2.dex */
public class nWX extends Pm {
    public nWX(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        super(view, eyq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm
    List<ObjectAnimator> EYQ() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, Key.ROTATION, 0.0f, this.mZx.Kbd(), 0.0f, this.mZx.Kbd(), 0.0f).setDuration((int) (this.mZx.tp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(EYQ(duration));
        return arrayList;
    }
}
