package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class FullRewardExpressBackupView extends BackupView {
    private FrameLayout EYQ;
    private FrameLayout nWX;
    private NativeExpressView pi;

    public FullRewardExpressBackupView(Context context) {
        super(context);
        this.mZx = context;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, NativeExpressView nativeExpressView) {
        if (ub == null) {
            return;
        }
        setBackgroundColor(-1);
        this.Td = ub;
        this.pi = nativeExpressView;
        if (ub.KvC() == 7) {
            this.IPb = "rewarded_video";
        } else {
            this.IPb = "fullscreen_interstitial_ad";
        }
        mZx();
        this.pi.addView(this, new ViewGroup.LayoutParams(-2, -2));
    }

    private void mZx() {
        this.VwS = tr.mZx(this.mZx, this.pi.getExpectExpressWidth());
        this.QQ = tr.mZx(this.mZx, this.pi.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.VwS, this.QQ);
        }
        layoutParams.width = this.VwS;
        layoutParams.height = this.QQ;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.Td.lEs();
        Td();
    }

    private void Td() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this.mZx);
        this.EYQ = pAGFrameLayout;
        addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(this.mZx);
        this.nWX = pAGFrameLayout2;
        this.EYQ.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        this.nWX.removeAllViews();
    }

    public FrameLayout getVideoContainer() {
        return this.nWX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void EYQ(View view, int i, com.bytedance.sdk.openadsdk.core.model.pi piVar) {
        NativeExpressView nativeExpressView = this.pi;
        if (nativeExpressView != null) {
            nativeExpressView.EYQ(view, i, piVar);
        }
    }

    public View getBackupContainerBackgroundView() {
        return this.EYQ;
    }
}
