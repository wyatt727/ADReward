package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.mZx.EYQ;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.Td;

/* loaded from: classes2.dex */
public class PAGVideoMediaView extends PAGMediaView implements EYQ.InterfaceC0118EYQ {
    private UB Pm;
    private final com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ Td;
    private NativeVideoTsView mZx;

    public PAGVideoMediaView(Context context, View view, com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ eyq) {
        super(context);
        EYQ(view);
        this.Td = eyq;
    }

    private void EYQ(View view) {
        if (view instanceof NativeVideoTsView) {
            NativeVideoTsView nativeVideoTsView = (NativeVideoTsView) view;
            this.mZx = nativeVideoTsView;
            addView(nativeVideoTsView, -1, -1);
        }
    }

    private void EYQ() {
        NativeVideoTsView nativeVideoTsView = this.mZx;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.nWX();
        }
    }

    private boolean mZx() {
        NativeVideoTsView nativeVideoTsView = this.mZx;
        if (nativeVideoTsView != null) {
            return nativeVideoTsView.tsL();
        }
        return false;
    }

    public void handleInterruptVideo() {
        if (mZx()) {
            return;
        }
        EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ eyq = this.Td;
        if (eyq == null) {
            return;
        }
        eyq.EYQ(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof EYQ) {
            ((EYQ) onClickListener).EYQ((EYQ.InterfaceC0118EYQ) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        NativeVideoTsView nativeVideoTsView = this.mZx;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.KO();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mZx.EYQ.InterfaceC0118EYQ
    public long getVideoProgress() {
        NativeVideoTsView nativeVideoTsView = this.mZx;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0L;
        }
        return this.mZx.getNativeVideoController().Kbd();
    }

    public void setMaterialMeta(UB ub) {
        this.Pm = ub;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Td.EYQ(this, this.Pm);
    }
}
