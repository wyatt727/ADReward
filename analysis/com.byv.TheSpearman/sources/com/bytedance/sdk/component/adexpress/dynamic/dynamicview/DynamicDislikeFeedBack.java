package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class DynamicDislikeFeedBack extends DynamicBaseWidgetImp {
    public DynamicDislikeFeedBack(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            this.KO = new ImageView(context);
            ((ImageView) this.KO).setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.VwS = this.QQ;
        } else {
            this.KO = new TextView(context);
        }
        this.KO.setTag(3);
        addView(this.KO, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.KO);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().QQ()) {
            return;
        }
        this.KO.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        super.HX();
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            GradientDrawable gradientDrawable = (GradientDrawable) zF.Td(getContext(), "tt_ad_skip_btn_bg");
            gradientDrawable.setCornerRadius(this.QQ / 2);
            gradientDrawable.setColor(this.tsL.xt());
            ((ImageView) this.KO).setBackgroundDrawable(gradientDrawable);
            ((ImageView) this.KO).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.KO).setImageResource(zF.Pm(getContext(), "tt_reward_full_feedback"));
            return true;
        }
        ((TextView) this.KO).setText(getText());
        if (Build.VERSION.SDK_INT >= 17) {
            this.KO.setTextAlignment(this.tsL.QQ());
        }
        ((TextView) this.KO).setTextColor(this.tsL.VwS());
        ((TextView) this.KO).setTextSize(this.tsL.Kbd());
        if (Build.VERSION.SDK_INT >= 16) {
            this.KO.setBackground(getBackgroundDrawable());
        }
        if (!this.tsL.XN()) {
            ((TextView) this.KO).setMaxLines(1);
            ((TextView) this.KO).setGravity(17);
            ((TextView) this.KO).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int iNZ = this.tsL.NZ();
            if (iNZ > 0) {
                ((TextView) this.KO).setLines(iNZ);
                ((TextView) this.KO).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        this.KO.setPadding((int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Td()), (int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.mZx()), (int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Pm()), (int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.EYQ()));
        ((TextView) this.KO).setGravity(17);
        return true;
    }

    public String getText() {
        return zF.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), "tt_reward_feedback");
    }
}
