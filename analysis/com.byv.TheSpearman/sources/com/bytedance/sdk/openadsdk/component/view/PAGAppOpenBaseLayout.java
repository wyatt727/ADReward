package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.DSPAdChoice;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;

/* loaded from: classes2.dex */
public class PAGAppOpenBaseLayout extends PAGRelativeLayout {
    PAGImageView EYQ;
    final PAGAppOpenTopBarView HX;
    PAGLinearLayout IPb;
    ButtonFlash Kbd;
    PAGTextView MxO;
    PAGLogoView Pm;
    PAGTextView QQ;
    PAGImageView Td;
    TTRoundRectImageView VwS;
    PAGFrameLayout mZx;
    DSPAdChoice pi;
    TTRoundRectImageView tp;
    PAGTextView tsL;

    public PAGAppOpenBaseLayout(Context context) {
        super(context);
        this.HX = new PAGAppOpenTopBarView(context);
    }

    public TTRoundRectImageView getIconOnlyView() {
        return this.tp;
    }

    public PAGTextView getTitle() {
        return this.MxO;
    }

    public PAGTextView getContent() {
        return this.tsL;
    }

    public PAGImageView getBackImage() {
        return this.EYQ;
    }

    public PAGFrameLayout getVideoContainer() {
        return this.mZx;
    }

    public PAGImageView getImageView() {
        return this.Td;
    }

    public PAGLogoView getAdLogo() {
        return this.Pm;
    }

    public ButtonFlash getClickButton() {
        return this.Kbd;
    }

    public PAGLinearLayout getUserInfo() {
        return this.IPb;
    }

    public TTRoundRectImageView getAppIcon() {
        return this.VwS;
    }

    public PAGTextView getAppName() {
        return this.QQ;
    }

    public DSPAdChoice getDspAdChoice() {
        return this.pi;
    }

    public TextView getTopDisLike() {
        PAGAppOpenTopBarView pAGAppOpenTopBarView = this.HX;
        if (pAGAppOpenTopBarView != null) {
            return pAGAppOpenTopBarView.getTopDislike();
        }
        return null;
    }

    public TextView getTopSkip() {
        PAGAppOpenTopBarView pAGAppOpenTopBarView = this.HX;
        if (pAGAppOpenTopBarView != null) {
            return pAGAppOpenTopBarView.getTopSkip();
        }
        return null;
    }
}
