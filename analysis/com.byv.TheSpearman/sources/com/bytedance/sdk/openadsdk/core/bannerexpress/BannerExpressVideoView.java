package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class BannerExpressVideoView extends BannerExpressView {
    public BannerExpressVideoView(Context context, UB ub, AdSlot adSlot) {
        super(context, ub, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView
    protected void EYQ() {
        this.mZx = new NativeExpressVideoView(this.EYQ, this.Pm, this.Kbd, this.HX);
        addView(this.mZx, new ViewGroup.LayoutParams(-1, -1));
        if (this.IPb != null) {
            setExpressInteractionListener(this.IPb);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView
    public void EYQ(UB ub, AdSlot adSlot) {
        this.Td = new NativeExpressVideoView(this.EYQ, ub, adSlot, this.HX);
        this.Td.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressVideoView.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (BannerExpressVideoView.this.IPb != null) {
                    BannerExpressVideoView.this.IPb.onAdClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                BannerExpressVideoView.this.EYQ(f, f2);
                BannerExpressVideoView.this.Kbd();
            }
        });
        tr.EYQ((View) this.Td, 8);
        addView(this.Td, new ViewGroup.LayoutParams(-1, -1));
    }

    public com.bytedance.sdk.openadsdk.multipro.mZx.EYQ getVideoModel() {
        if (this.mZx != null) {
            return ((NativeExpressVideoView) this.mZx).getVideoModel();
        }
        return null;
    }
}
