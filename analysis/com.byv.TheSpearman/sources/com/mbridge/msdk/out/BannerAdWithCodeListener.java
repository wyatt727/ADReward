package com.mbridge.msdk.out;

import com.mbridge.msdk.f.a;

/* loaded from: classes4.dex */
public abstract class BannerAdWithCodeListener implements BannerAdListener {
    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str);

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        onLoadFailedWithCode(mBridgeIds, a.a(2000, str), str);
    }
}
