package com.mbridge.msdk.out;

import com.mbridge.msdk.f.a;
import com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener;

/* loaded from: classes4.dex */
public abstract class InterstitialVideoWithCodeListener implements InterstitialVideoListener {
    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str);

    public abstract void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str);

    @Override // com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        onVideoLoadFailWithCode(mBridgeIds, a.a(3000, str), str);
    }

    @Override // com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, 3900, str);
    }
}
