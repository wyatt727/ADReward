package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: RewardFullTopProxyManager.java */
/* loaded from: classes2.dex */
public class tp {
    TopProxyLayout EYQ;
    private boolean Kbd = false;
    private final EYQ Pm;
    private final Activity Td;
    com.bytedance.sdk.component.adexpress.dynamic.Pm mZx;

    public tp(EYQ eyq) {
        this.Td = eyq.TZn;
        this.Pm = eyq;
    }

    public void EYQ() {
        if (this.Kbd) {
            return;
        }
        this.Kbd = true;
        TopProxyLayout topProxyLayout = (TopProxyLayout) this.Td.findViewById(com.bytedance.sdk.openadsdk.utils.tp.lv);
        this.EYQ = topProxyLayout;
        if (topProxyLayout != null) {
            topProxyLayout.EYQ(this.Pm.IPb, this.Pm.EYQ);
            if (this.Pm.EYQ.oIw()) {
                EYQ(false);
            } else {
                EYQ(this.Pm.EYQ.BQ());
            }
        }
    }

    public void EYQ(boolean z) {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.setShowDislike(z);
        }
    }

    public void mZx(boolean z) {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.dynamic.Pm pm = this.mZx;
        if (pm != null) {
            pm.setSoundMute(z);
        }
    }

    public void Td(boolean z) {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSound(z);
        }
    }

    public void Pm(boolean z) {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSkip(z);
        }
    }

    public void EYQ(String str, CharSequence charSequence) {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.EYQ(String.valueOf(str), charSequence);
        }
    }

    public void EYQ(CharSequence charSequence) {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.setSkipText(charSequence);
        }
    }

    public void mZx() {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.Pm();
        }
    }

    public void Kbd(boolean z) {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.setSkipEnable(z);
        }
    }

    public void Td() {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.Kbd();
        }
    }

    public void Pm() {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.EYQ();
        }
    }

    public void Kbd() {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.mZx();
        }
    }

    public void IPb() {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.Td();
        }
    }

    public void EYQ(com.bytedance.sdk.openadsdk.component.reward.top.mZx mzx) {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout != null) {
            topProxyLayout.setListener(mzx);
        }
    }

    public void EYQ(com.bytedance.sdk.component.adexpress.dynamic.Pm pm) {
        this.mZx = pm;
    }

    public void EYQ(int i) {
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout == null || !(topProxyLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) this.EYQ.getLayoutParams()).topMargin = i - tr.mZx(this.Td, 20.0f);
    }

    public void mZx(int i) {
        View viewFindViewById;
        TopProxyLayout topProxyLayout = this.EYQ;
        if (topProxyLayout == null || topProxyLayout.getITopLayout() == null || i == 0 || (viewFindViewById = this.EYQ.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int width = i - (iArr[0] + viewFindViewById.getWidth());
        if (width < tr.mZx(this.Td, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin += tr.mZx(this.Td, 16.0f) - width;
            viewFindViewById.requestLayout();
        }
    }
}
