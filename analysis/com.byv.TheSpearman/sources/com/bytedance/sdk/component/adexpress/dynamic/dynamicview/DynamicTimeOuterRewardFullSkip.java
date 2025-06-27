package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class DynamicTimeOuterRewardFullSkip extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.Td {
    private boolean EYQ;

    public DynamicTimeOuterRewardFullSkip(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        if (dynamicRootView.getRenderRequest() != null) {
            this.EYQ = dynamicRootView.getRenderRequest().pi();
        }
        this.VwS = this.QQ;
        this.KO = new ImageView(context);
        this.KO.setTag(Integer.valueOf(getClickArea()));
        addView(this.KO, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        super.HX();
        ((ImageView) this.KO).setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable gradientDrawable = (GradientDrawable) zF.Td(getContext(), "tt_ad_skip_btn_bg");
        gradientDrawable.setCornerRadius(this.QQ / 2);
        gradientDrawable.setColor(this.tsL.xt());
        ((ImageView) this.KO).setBackgroundDrawable(gradientDrawable);
        ((ImageView) this.KO).setImageResource(this.EYQ ? zF.Pm(getContext(), "tt_close_move_details_normal") : zF.Pm(getContext(), "tt_skip_btn_wrapper"));
        setVisibility(8);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Td
    public void EYQ(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        setVisibility(i2);
    }
}
