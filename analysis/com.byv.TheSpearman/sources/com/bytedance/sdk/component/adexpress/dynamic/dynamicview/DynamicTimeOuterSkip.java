package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class DynamicTimeOuterSkip extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.Td {
    private boolean EYQ;

    public DynamicTimeOuterSkip(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            this.EYQ = dynamicRootView.getRenderRequest().pi();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        super.HX();
        if (!TextUtils.equals(this.pi.tp().mZx(), "skip-with-time-skip-btn")) {
            return true;
        }
        ((TextView) this.KO).setText("");
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.KO).getText())) {
            setMeasuredDimension(0, this.QQ);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void IPb() {
        if (TextUtils.equals("skip-with-time-skip-btn", this.pi.tp().mZx())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.VwS, this.QQ);
            layoutParams.gravity = 8388629;
            setLayoutParams(layoutParams);
            if (Build.VERSION.SDK_INT >= 17) {
                this.KO.setTextAlignment(1);
            }
            ((TextView) this.KO).setGravity(17);
        } else {
            super.IPb();
        }
        if (!"skip-with-time-skip-btn".equals(this.pi.tp().mZx()) && Build.VERSION.SDK_INT >= 17) {
            this.KO.setTextAlignment(1);
            ((TextView) this.KO).setGravity(17);
        }
        setVisibility(8);
    }

    private String EYQ(boolean z) {
        String strEYQ = zF.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), "tt_reward_screen_skip_tx");
        if (!"skip-with-time-skip-btn".equals(this.pi.tp().mZx())) {
            return strEYQ;
        }
        if (com.bytedance.sdk.component.adexpress.Pm.mZx() && this.EYQ) {
            strEYQ = "X";
        }
        return z ? strEYQ : "| ".concat(String.valueOf(strEYQ));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Td
    public void EYQ(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2 = 0;
        if (z) {
            ((TextView) this.KO).setText(EYQ(z2));
        } else {
            if (z2) {
                ((TextView) this.KO).setText(EYQ(z2));
            }
            if (!z2) {
                i2 = 8;
            }
        }
        setVisibility(i2);
    }
}
