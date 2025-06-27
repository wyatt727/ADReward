package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.Td;

/* loaded from: classes2.dex */
public interface PAGLoadListener<Ad> extends Td {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.Td
    void onError(int i, String str);
}
