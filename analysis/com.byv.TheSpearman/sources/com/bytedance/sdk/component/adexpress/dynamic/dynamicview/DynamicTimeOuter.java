package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Pm.MxO;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.utils.zF;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;

/* loaded from: classes2.dex */
public class DynamicTimeOuter extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.Td {
    private boolean EYQ;
    private boolean mZx;
    private boolean zF;

    public DynamicTimeOuter(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(qq.tp().mZx())) {
            dynamicRootView.setTimedown(this.QQ);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        super.HX();
        if (com.bytedance.sdk.component.adexpress.Pm.Kbd.mZx(this.nWX.getRenderRequest().Pm())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.pi.tp().mZx())) {
            ((TextView) this.KO).setText(String.valueOf((int) Double.parseDouble(this.tsL.tp())));
            return true;
        }
        ((TextView) this.KO).setText(((int) Double.parseDouble(this.tsL.tp())) + CmcdHeadersFactory.STREAMING_FORMAT_SS);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void IPb() {
        if (TextUtils.equals("skip-with-countdowns-video-countdown", this.pi.tp().mZx()) || TextUtils.equals("skip-with-time-countdown", this.pi.tp().mZx())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.VwS, this.QQ);
            layoutParams.gravity = 8388627;
            if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                layoutParams.leftMargin = this.HX;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
            }
            setLayoutParams(layoutParams);
            return;
        }
        super.IPb();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.KO).getText())) {
            setMeasuredDimension(0, this.QQ);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Td
    public void EYQ(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 || this.zF) {
            ((TextView) this.KO).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception unused) {
        }
        setVisibility(0);
        if (!z && this.nWX.getRenderRequest().EYQ() && com.bytedance.sdk.component.adexpress.Pm.Kbd.mZx(this.nWX.getRenderRequest().Pm())) {
            ((TextView) this.KO).setText(String.format(zF.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), "tt_reward_full_skip"), Integer.valueOf(i)));
            this.EYQ = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.Pm.mZx() && !"open_ad".equals(this.nWX.getRenderRequest().Pm()) && this.nWX.getRenderRequest().EYQ()) {
            this.zF = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.pi.tp().mZx())) {
            ((TextView) this.KO).setText(charSequence);
            return;
        }
        ((TextView) this.KO).setText(((Object) charSequence) + CmcdHeadersFactory.STREAMING_FORMAT_SS);
        this.mZx = true;
        if (this.EYQ) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (MxO.mZx(((TextView) this.KO).getText() != null ? r4.toString() : "", this.tsL.Kbd(), true)[0] + IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Td() + this.tsL.Pm())), this.QQ);
            layoutParams.gravity = 8388629;
            this.KO.setLayoutParams(layoutParams);
            this.EYQ = false;
            requestLayout();
        }
    }
}
