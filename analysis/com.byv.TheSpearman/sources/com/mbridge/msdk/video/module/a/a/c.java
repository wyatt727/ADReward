package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* compiled from: ContainerViewJSListener.java */
/* loaded from: classes4.dex */
public final class c extends d {
    private IJSFactory k;

    public c(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        this.k = iJSFactory;
        if (iJSFactory == null) {
            this.f3755a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.a.a.d, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i, Object obj) {
        if (this.f3755a) {
            if (i != 8) {
                if (i == 105) {
                    this.k.getJSNotifyProxy().a(3, obj.toString());
                    i = -1;
                } else if (i == 107) {
                    this.k.getJSContainerModule().showVideoClickView(-1);
                    this.k.getJSVideoModule().setCover(false);
                    this.k.getJSVideoModule().setMiniEndCardState(false);
                    this.k.getJSVideoModule().videoOperate(1);
                } else if (i == 112) {
                    this.k.getJSVideoModule().setCover(true);
                    this.k.getJSVideoModule().setMiniEndCardState(true);
                    this.k.getJSVideoModule().videoOperate(2);
                } else if (i == 115) {
                    com.mbridge.msdk.video.signal.j jSVideoModule = this.k.getJSVideoModule();
                    this.k.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (!this.k.getJSContainerModule().showAlertWebView()) {
                this.k.getJSVideoModule().showAlertView();
            } else {
                this.k.getJSVideoModule().alertWebViewShowed();
            }
        }
        super.a(i, obj);
    }
}
