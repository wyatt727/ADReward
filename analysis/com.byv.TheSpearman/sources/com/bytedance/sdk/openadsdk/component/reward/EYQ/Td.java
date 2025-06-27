package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;

/* compiled from: RewardFullDislikeManager.java */
/* loaded from: classes2.dex */
public class Td {
    private final EYQ EYQ;
    private TTAdDislikeToast Td;
    private TTAdDislikeDialog mZx;

    public Td(EYQ eyq) {
        this.EYQ = eyq;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx) {
        if (this.EYQ.TZn.isFinishing()) {
            return;
        }
        if (this.EYQ.NZ.get()) {
            this.Td.EYQ(TTAdDislikeToast.getDislikeTip());
            return;
        }
        if (this.mZx == null) {
            try {
                mZx(mzx);
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.mZx;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.EYQ();
        }
    }

    public void EYQ() {
        TTAdDislikeToast tTAdDislikeToast = this.Td;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.mZx();
        }
    }

    public void mZx() {
        TTAdDislikeToast tTAdDislikeToast = this.Td;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.Td();
        }
    }

    private void mZx(final com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx) {
        if (this.mZx == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.EYQ.TZn, this.EYQ.EYQ);
            this.mZx = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.Td.1
                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                public void EYQ(View view) {
                    Td.this.EYQ.XN.set(true);
                    if (Td.this.EYQ.FtN.Kbd) {
                        if (Td.this.EYQ.mN != null) {
                            Td.this.EYQ.mN.EYQ(8, false);
                        }
                    } else {
                        mzx.UB();
                        if (Td.this.EYQ.FtN.mZx()) {
                            Td.this.EYQ.FtN.KO();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                public void mZx(View view) {
                    Td.this.EYQ.XN.set(false);
                    if (Td.this.EYQ.FtN.Kbd) {
                        if (Td.this.EYQ.mN != null) {
                            Td.this.EYQ.mN.EYQ(0, true);
                        }
                    } else {
                        Td.this.EYQ.FtN.EYQ(mzx);
                        if (Td.this.EYQ.FtN.Pm()) {
                            Td.this.EYQ.FtN.nWX();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                public void EYQ(int i, FilterWord filterWord) {
                    if (Td.this.EYQ.NZ.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    Td.this.EYQ.NZ.set(true);
                    Td.this.Td();
                }
            });
            ((FrameLayout) this.EYQ.TZn.findViewById(R.id.content)).addView(this.mZx);
        }
        if (this.Td == null) {
            this.Td = new TTAdDislikeToast(this.EYQ.TZn);
            ((FrameLayout) this.EYQ.TZn.findViewById(R.id.content)).addView(this.Td);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td() {
        this.Td.EYQ(TTAdDislikeToast.getDislikeSendTip());
    }
}
