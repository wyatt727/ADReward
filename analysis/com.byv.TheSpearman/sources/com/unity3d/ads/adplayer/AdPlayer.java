package com.unity3d.ads.adplayer;

import androidx.core.app.NotificationCompat;
import com.json.i1;
import com.json.x6;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: AdPlayer.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 72\u00020\u0001:\u00017J\u0011\u0010\u0017\u001a\u00020\u0018H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0018H&J\u0019\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H¦@ø\u0001\u0000¢\u0006\u0002\u0010!J'\u0010\"\u001a\u00020\u00182\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010$H¦@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(H¦@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0019\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020(H¦@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0019\u0010,\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0019\u0010-\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0019\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020(H¦@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0019\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u000202H¦@ø\u0001\u0000¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u000206H\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer;", "", "onLoadEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "updateCampaignState", "Lkotlin/Pair;", "", "", "getUpdateCampaignState", "webViewContainer", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "destroy", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "onAllowedPiiChange", "value", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", NotificationCompat.CATEGORY_EVENT, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendFocusChange", "isFocused", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendPrivacyFsmChange", "sendUserConsentChange", "sendVisibilityChange", x6.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", i1.u, "showOptions", "Lcom/unity3d/ads/adplayer/ShowOptions;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AdPlayer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Object destroy(Continuation<? super Unit> continuation);

    void dispatchShowCompleted();

    Flow<LoadEvent> getOnLoadEvent();

    Flow<ShowEvent> getOnShowEvent();

    CoroutineScope getScope();

    Flow<Pair<byte[], Integer>> getUpdateCampaignState();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, Continuation<? super Unit> continuation);

    Object onBroadcastEvent(String str, Continuation<? super Unit> continuation);

    Object requestShow(Map<String, ? extends Object> map, Continuation<? super Unit> continuation);

    Object sendFocusChange(boolean z, Continuation<? super Unit> continuation);

    Object sendMuteChange(boolean z, Continuation<? super Unit> continuation);

    Object sendPrivacyFsmChange(byte[] bArr, Continuation<? super Unit> continuation);

    Object sendUserConsentChange(byte[] bArr, Continuation<? super Unit> continuation);

    Object sendVisibilityChange(boolean z, Continuation<? super Unit> continuation);

    Object sendVolumeChange(double d, Continuation<? super Unit> continuation);

    void show(ShowOptions showOptions);

    /* compiled from: AdPlayer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            throw new NotImplementedError(null, 1, null);
        }

        public static Object destroy(AdPlayer adPlayer, Continuation<? super Unit> continuation) {
            CoroutineScopeKt.cancel$default(adPlayer.getScope(), null, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AdPlayer.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer$Companion;", "", "()V", "broadcastEventChannel", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getBroadcastEventChannel", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final MutableSharedFlow<String> broadcastEventChannel = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

        private Companion() {
        }

        public final MutableSharedFlow<String> getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }
}
