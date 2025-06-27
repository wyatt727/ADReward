package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class DynamicLogoUnion extends DynamicBaseWidgetImp {
    public DynamicLogoUnion(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.KO = new ImageView(context);
        this.KO.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            this.QQ = Math.max(dynamicRootView.getLogoUnionHeight(), this.QQ);
        }
        addView(this.KO, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        super.HX();
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            ((ImageView) this.KO).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.KO).setImageResource(zF.Pm(getContext(), "tt_ad_logo_reward_full"));
        } else {
            ((ImageView) this.KO).setImageResource(zF.Pm(getContext(), "tt_ad_logo"));
        }
        ((ImageView) this.KO).setColorFilter(this.tsL.VwS(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
