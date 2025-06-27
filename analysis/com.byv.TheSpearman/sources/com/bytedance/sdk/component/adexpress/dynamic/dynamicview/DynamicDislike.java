package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.adexpress.widget.DislikeView;

/* loaded from: classes2.dex */
public class DynamicDislike extends DynamicBaseWidgetImp {
    public DynamicDislike(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.KO = new DislikeView(context);
        this.KO.setTag(3);
        addView(this.KO, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.KO);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        super.HX();
        int iEYQ = (int) IPb.EYQ(this.MxO, this.tsL.UB());
        if (!(this.KO instanceof DislikeView)) {
            return true;
        }
        ((DislikeView) this.KO).setRadius((int) IPb.EYQ(this.MxO, this.tsL.KO()));
        ((DislikeView) this.KO).setStrokeWidth(iEYQ);
        ((DislikeView) this.KO).setStrokeColor(this.tsL.hu());
        ((DislikeView) this.KO).setBgColor(this.tsL.xt());
        ((DislikeView) this.KO).setDislikeColor(this.tsL.VwS());
        ((DislikeView) this.KO).setDislikeWidth((int) IPb.EYQ(this.MxO, 1.0f));
        return true;
    }
}
