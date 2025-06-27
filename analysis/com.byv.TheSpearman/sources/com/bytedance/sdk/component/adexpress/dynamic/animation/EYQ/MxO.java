package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ScaleAnimation.java */
/* loaded from: classes2.dex */
public class MxO extends Pm {
    public MxO(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        super(view, eyq);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof DynamicBaseWidget)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof DynamicBaseWidget)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm
    List<ObjectAnimator> EYQ() {
        float f;
        float fMxO = (float) this.mZx.MxO();
        float fTsL = (float) this.mZx.tsL();
        String strHu = this.mZx.hu();
        float f2 = 1.0f;
        if ("reverse".equals(strHu) || "alternate-reverse".equals(strHu)) {
            f = 1.0f;
        } else {
            f = fTsL;
            fTsL = 1.0f;
            f2 = fMxO;
            fMxO = 1.0f;
        }
        this.Td.setTag(2097610710, this.mZx.mZx());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "scaleX", fMxO, f2).setDuration((int) (this.mZx.tp() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.Td, "scaleY", fTsL, f).setDuration((int) (this.mZx.tp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(EYQ(duration));
        arrayList.add(EYQ(duration2));
        return arrayList;
    }
}
