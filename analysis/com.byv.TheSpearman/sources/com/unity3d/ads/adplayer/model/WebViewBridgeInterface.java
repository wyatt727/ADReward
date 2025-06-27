package com.unity3d.ads.adplayer.model;

import kotlin.Metadata;

/* compiled from: WebViewBridgeWrapperInterface.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/adplayer/model/WebViewBridgeInterface;", "", "handleCallback", "", "callbackId", "", "callbackStatus", "rawParameters", "handleInvocation", "message", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WebViewBridgeInterface {
    void handleCallback(String callbackId, String callbackStatus, String rawParameters);

    void handleInvocation(String message);
}
