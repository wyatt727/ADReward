package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: DefaultJSContainerModule.java */
/* loaded from: classes4.dex */
public class e implements com.mbridge.msdk.video.signal.f, com.mbridge.msdk.video.signal.h {
    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i, int i2, int i3) {
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i) {
        ad.a("DefaultJSContainerModule", "showVideoClickView:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i) {
        ad.a("DefaultJSContainerModule", "showEndcard,type=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        ad.a("DefaultJSContainerModule", "endCardShowing");
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        ad.a("DefaultJSContainerModule", "miniCardShowing");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i) {
        ad.a("DefaultJSContainerModule", "notifyCloseBtn:state = " + i);
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i) {
        ad.a("DefaultJSContainerModule", "toggleCloseBtn:state=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i) {
        ad.a("DefaultJSContainerModule", "readyStatus:isReady=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        ad.a("DefaultJSContainerModule", "showMiniCard top = " + i + " left = " + i2 + " width = " + i3 + " height = " + i4 + " radius = " + i5);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i, int i2, int i3) {
        ad.a("DefaultJSContainerModule", "showMiniCard width = " + i + " height = " + i2 + " radius = " + i3);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        ad.a("DefaultJSContainerModule", "showVideoEndCover");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        ad.a("DefaultJSContainerModule", "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        ad.a("DefaultJSContainerModule", "hideAlertWebview ,msg=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        ad.a("DefaultJSContainerModule", "ivRewardAdsWithoutVideo,params=");
    }
}
