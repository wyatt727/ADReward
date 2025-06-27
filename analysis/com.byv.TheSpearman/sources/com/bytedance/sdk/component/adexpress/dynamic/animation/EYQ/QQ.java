package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RippleAnimation.java */
/* loaded from: classes2.dex */
public class QQ extends Pm {
    public QQ(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        super(view, eyq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm
    List<ObjectAnimator> EYQ() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.mZx.tp() * 1000.0d));
        ((ViewGroup) this.Td.getParent()).setClipChildren(false);
        ((ViewGroup) this.Td.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.Td.getParent().getParent().getParent()).setClipChildren(false);
        this.Td.setTag(2097610712, this.mZx.QQ());
        ArrayList arrayList = new ArrayList();
        arrayList.add(EYQ(duration));
        return arrayList;
    }
}
