package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class DynamicSkipCountDownBtn extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.Td {
    private int[] EYQ;
    private int mZx;
    private int zF;

    public DynamicSkipCountDownBtn(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        super.HX();
        ((TextView) this.KO).setText("");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void IPb() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.VwS, this.QQ);
        layoutParams.gravity = 8388629;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
        }
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.KO).getText())) {
            setMeasuredDimension(0, this.QQ);
        } else {
            setMeasuredDimension(this.VwS, this.QQ);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Td
    public void EYQ(CharSequence charSequence, boolean z, int i, boolean z2) {
        String strEYQ = zF.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.KO.setVisibility(0);
            ((TextView) this.KO).setText("| ".concat(String.valueOf(strEYQ)));
            this.KO.measure(-2, -2);
            this.EYQ = new int[]{this.KO.getMeasuredWidth() + 1, this.KO.getMeasuredHeight()};
            View view = this.KO;
            int[] iArr = this.EYQ;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.KO).setGravity(17);
            ((TextView) this.KO).setIncludeFontPadding(false);
            EYQ();
            this.KO.setPadding(this.tsL.Td(), this.mZx, this.tsL.Pm(), this.zF);
        }
        requestLayout();
    }

    private void EYQ() {
        int iEYQ = (int) IPb.EYQ(this.MxO, this.tsL.Kbd());
        this.mZx = ((this.QQ - iEYQ) / 2) - this.tsL.EYQ();
        this.zF = 0;
    }
}
