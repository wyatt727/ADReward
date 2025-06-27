package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class DynamicMutedView extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.mZx {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public boolean Kbd() {
        return true;
    }

    public DynamicMutedView(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.KO = new ImageView(context);
        this.KO.setTag(5);
        addView(this.KO, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        super.HX();
        if (com.bytedance.sdk.component.adexpress.Pm.Kbd.mZx(this.nWX.getRenderRequest().Pm())) {
            ((ImageView) this.KO).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.KO).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.nWX.mZx);
        GradientDrawable gradientDrawable = (GradientDrawable) zF.Td(getContext(), "tt_ad_skip_btn_bg");
        gradientDrawable.setCornerRadius(this.QQ / 2);
        gradientDrawable.setColor(this.tsL.xt());
        ((ImageView) this.KO).setBackgroundDrawable(gradientDrawable);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZx
    public void setSoundMute(boolean z) {
        int iPm;
        if (com.bytedance.sdk.component.adexpress.Pm.Kbd.mZx(this.nWX.getRenderRequest().Pm())) {
            if (z) {
                iPm = zF.Pm(getContext(), "tt_reward_full_mute");
            } else {
                iPm = zF.Pm(getContext(), "tt_reward_full_unmute");
            }
        } else if (z) {
            iPm = zF.Pm(getContext(), "tt_mute");
        } else {
            iPm = zF.Pm(getContext(), "tt_unmute");
        }
        ((ImageView) this.KO).setImageResource(iPm);
        if (((ImageView) this.KO).getDrawable() == null || Build.VERSION.SDK_INT < 19) {
            return;
        }
        ((ImageView) this.KO).getDrawable().setAutoMirrored(true);
    }
}
