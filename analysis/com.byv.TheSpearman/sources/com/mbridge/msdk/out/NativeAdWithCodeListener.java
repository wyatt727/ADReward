package com.mbridge.msdk.out;

import com.mbridge.msdk.f.a;
import com.mbridge.msdk.out.NativeListener;

/* loaded from: classes4.dex */
public abstract class NativeAdWithCodeListener implements NativeListener.NativeAdListener {
    public abstract void onAdLoadErrorWithCode(int i, String str);

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        onAdLoadErrorWithCode(a.a(1000, str), str);
    }
}
