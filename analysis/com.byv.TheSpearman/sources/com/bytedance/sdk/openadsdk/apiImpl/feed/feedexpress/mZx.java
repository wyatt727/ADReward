package com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.mZx.Td;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.apiImpl.feed.QQ;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: PAGFeedExpressView.java */
/* loaded from: classes2.dex */
public class mZx extends QQ {
    protected AdSlot HX;
    protected String MxO;
    protected final Context QQ;
    protected NativeExpressView tp;
    private boolean tsL;

    public mZx(Context context, UB ub, AdSlot adSlot) {
        super(context, ub, 5, true);
        this.MxO = "embeded_ad";
        this.tsL = false;
        this.mZx.QQ(1);
        this.Pm.EYQ(this);
        this.QQ = context;
        this.HX = adSlot;
        EYQ();
        mZx();
    }

    protected void EYQ() {
        this.tp = new NativeExpressView(this.QQ, this.mZx, this.HX, this.MxO);
        Td();
    }

    private void mZx() {
        NativeExpressView nativeExpressView = this.tp;
        if (nativeExpressView != null) {
            nativeExpressView.setBackupListener(new Td() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.mZx.1
                @Override // com.bytedance.sdk.component.adexpress.mZx.Td
                public boolean EYQ(ViewGroup viewGroup, int i) {
                    PAGFeedExpressBackupView pAGFeedExpressBackupView = new PAGFeedExpressBackupView(mZx.this.tp.getContext());
                    pAGFeedExpressBackupView.setExtraFuncationHelper(mZx.this.Pm);
                    pAGFeedExpressBackupView.EYQ(mZx.this.tp);
                    return true;
                }
            });
        }
    }

    protected void Td() {
        NativeExpressView nativeExpressView = this.tp;
        if (nativeExpressView != null) {
            nativeExpressView.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.mZx.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    if (!mZx.this.tp.pi()) {
                        mZx.this.EYQ(f, f2);
                        if (mZx.this.tsL) {
                            mZx.this.tp.QQ();
                            return;
                        }
                        return;
                    }
                    com.bytedance.sdk.openadsdk.apiImpl.feed.mZx mzx = new com.bytedance.sdk.openadsdk.apiImpl.feed.mZx(mZx.this.QQ, mZx.this.mZx, 5, mZx.this.HX, mZx.this.Pm, mZx.this.EYQ);
                    mZx mzx2 = mZx.this;
                    if (mzx2 instanceof EYQ) {
                        mzx.EYQ(((NativeExpressVideoView) mzx2.Pm()).getVideoAdListener());
                    }
                    mZx.this.Pm.EYQ((com.bytedance.sdk.openadsdk.core.mZx.EYQ) mZx.this.tp.getClickCreativeListener());
                    PAGMediaView pAGMediaViewHX = mZx.this.Pm.HX();
                    if (pAGMediaViewHX == null) {
                        pAGMediaViewHX = new PAGMediaView(mZx.this.QQ);
                    }
                    mZx.this.tp.addView(pAGMediaViewHX);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(float f, float f2) {
        int iMZx = tr.mZx(this.QQ, f);
        int iMZx2 = tr.mZx(this.QQ, f2);
        ViewGroup.LayoutParams layoutParams = this.tp.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iMZx, iMZx2);
        }
        layoutParams.width = iMZx;
        layoutParams.height = iMZx2;
        this.tp.setLayoutParams(layoutParams);
    }

    public NativeExpressView Pm() {
        return this.tp;
    }

    public void EYQ(boolean z) {
        this.tsL = z;
    }

    public void Kbd() {
        NativeExpressView nativeExpressView = this.tp;
        if (nativeExpressView != null) {
            nativeExpressView.HX();
        }
    }
}
