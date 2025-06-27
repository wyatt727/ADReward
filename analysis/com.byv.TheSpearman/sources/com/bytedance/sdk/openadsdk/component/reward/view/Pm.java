package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: RewardFullNativeVideoLayout.java */
/* loaded from: classes2.dex */
public class Pm extends Kbd {
    @Override // com.bytedance.sdk.openadsdk.component.reward.view.Kbd
    protected boolean EYQ() {
        return false;
    }

    public Pm(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        super(eyq);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.Kbd
    public void EYQ(int i, int i2) {
        super.EYQ(i, i2);
        if (UB.Kbd(this.Td) && this.Td.rfB() == 3 && this.Td.lEs() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.mZx.findViewById(tp.tp);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.Td.TZE() == 1) {
                    int iMZx = tr.mZx(hu.EYQ(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = iMZx;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
