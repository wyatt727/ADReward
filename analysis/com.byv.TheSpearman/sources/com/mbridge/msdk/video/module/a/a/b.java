package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* compiled from: ContainerViewDefaultListener.java */
/* loaded from: classes4.dex */
public final class b extends d {
    private MBridgeVideoView k;
    private MBridgeContainerView l;

    public b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        this.k = mBridgeVideoView;
        this.l = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f3755a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.a.a.d, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i, Object obj) {
        if (this.f3755a) {
            if (i == 8) {
                MBridgeContainerView mBridgeContainerView = this.l;
                if (mBridgeContainerView != null) {
                    if (!mBridgeContainerView.showAlertWebView()) {
                        MBridgeVideoView mBridgeVideoView = this.k;
                        if (mBridgeVideoView != null) {
                            mBridgeVideoView.showAlertView();
                        }
                    } else {
                        MBridgeVideoView mBridgeVideoView2 = this.k;
                        if (mBridgeVideoView2 != null) {
                            mBridgeVideoView2.alertWebViewShowed();
                        }
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.k;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.showAlertView();
                    }
                }
            } else if (i == 107) {
                this.l.showVideoClickView(-1);
                this.k.setCover(false);
                this.k.setMiniEndCardState(false);
                this.k.videoOperate(1);
            } else if (i == 112) {
                this.k.setCover(true);
                this.k.setMiniEndCardState(true);
                this.k.videoOperate(2);
            } else if (i == 115) {
                this.l.resizeMiniCard(this.k.getBorderViewWidth(), this.k.getBorderViewHeight(), this.k.getBorderViewRadius());
            }
        }
        super.a(i, obj);
    }
}
