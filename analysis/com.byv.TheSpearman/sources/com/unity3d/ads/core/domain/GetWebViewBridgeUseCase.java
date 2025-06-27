package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GetWebViewBridgeUseCase.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦\u0002¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "", "invoke", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webViewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GetWebViewBridgeUseCase {
    WebViewBridge invoke(AndroidWebViewContainer webViewContainer, CoroutineScope adPlayerScope);
}
