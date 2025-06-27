package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class ExpressVideoView extends NativeVideoTsView implements View.OnClickListener {
    private boolean hu;

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    protected void EYQ(boolean z) {
    }

    public ExpressVideoView(Context context, com.bytedance.sdk.openadsdk.core.model.UB ub, String str, com.bytedance.sdk.openadsdk.mZx.VwS vwS) {
        super(context, ub, false, str, false, false, vwS);
        this.hu = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    protected void mZx() {
        if (!this.Kbd || !UB.mZx(this.tsL)) {
            this.Pm = false;
        }
        super.mZx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    protected void Td() {
        if (this.hu) {
            super.Td();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.hu = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        if (this.mZx != null) {
            this.mZx.Kbd(z);
        }
    }

    public void Pm() {
        if (this.tp != null) {
            tr.EYQ((View) this.tp, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        if (this.HX != null && this.HX.getVisibility() == 0) {
            Uc();
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (this.HX != null && this.HX.getVisibility() == 0) {
            Uc();
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    private void UB() {
        tr.EYQ((View) this.VwS, 0);
        tr.EYQ((View) this.QQ, 0);
        tr.EYQ((View) this.tp, 8);
    }

    private void Uc() {
        VwS();
        if (this.VwS != null) {
            if (this.VwS.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.EYQ.mN().tp(), this.EYQ.mN().Td(), this.EYQ.mN().mZx(), this.QQ, this.EYQ);
            }
        }
        UB();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.HX != null && this.HX.getVisibility() == 0) {
            tr.Kbd(this.VwS);
        }
        Td();
    }

    public void setShowAdInteractionView(boolean z) {
        com.bykv.vk.openvk.component.video.api.Pm.mZx mzxPi;
        if (this.mZx == null || (mzxPi = this.mZx.pi()) == null) {
            return;
        }
        mzxPi.EYQ(z);
    }

    protected void Kbd() {
        VwS();
        tr.EYQ((View) this.VwS, 0);
    }
}
