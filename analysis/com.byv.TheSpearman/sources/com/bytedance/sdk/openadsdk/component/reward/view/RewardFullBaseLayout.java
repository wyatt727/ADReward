package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;

/* loaded from: classes2.dex */
public class RewardFullBaseLayout extends PAGFrameLayout {
    public RewardFullBaseLayout(Context context) {
        super(context);
    }

    public void EYQ(com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx) {
        mzx.EYQ(this);
        RFEndCardBackUpLayout rFEndCardBackUpLayoutQQ = mzx.QQ();
        if (rFEndCardBackUpLayoutQQ != null) {
            addView(rFEndCardBackUpLayoutQQ, new FrameLayout.LayoutParams(-1, -1));
        }
        EYQ(mzx.HX(), this);
        EYQ(mzx.tp(), this);
    }

    private void EYQ(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
