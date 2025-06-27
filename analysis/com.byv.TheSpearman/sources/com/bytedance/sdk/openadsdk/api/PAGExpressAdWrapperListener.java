package com.bytedance.sdk.openadsdk.api;

import android.view.View;

/* loaded from: classes2.dex */
public interface PAGExpressAdWrapperListener extends PAGAdWrapperListener {
    void onAdDismissed();

    void onAdShow(View view, int i);

    void onRenderFail(View view, String str, int i);

    void onRenderSuccess(View view, float f, float f2);
}
