package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.json.i1;
import com.json.x6;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0011\u0010#\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010%J\t\u0010&\u001a\u00020$H\u0096\u0001J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0019\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0019\u0010/\u001a\u00020$2\u0006\u0010,\u001a\u000200H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u001eH\u0096Aø\u0001\u0000¢\u0006\u0002\u00104J\u0019\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u0006H\u0096Aø\u0001\u0000¢\u0006\u0002\u00107J'\u00108\u001a\u00020$2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020;\u0018\u00010:H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010<J\u0019\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020?H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010@J\u0019\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020?H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010@J\u0019\u0010C\u001a\u00020$2\u0006\u00103\u001a\u00020\u001eH\u0096Aø\u0001\u0000¢\u0006\u0002\u00104J\u0019\u0010D\u001a\u00020$2\u0006\u00103\u001a\u00020\u001eH\u0096Aø\u0001\u0000¢\u0006\u0002\u00104J\u0019\u0010E\u001a\u00020$2\u0006\u0010F\u001a\u00020?H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010@J\u0019\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020IH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010JJ\u0010\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020MH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d0\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "webViewAdPlayer", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "opportunityId", "", "webViewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "onLoadEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "updateCampaignState", "Lkotlin/Pair;", "", "", "getUpdateCampaignState", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "destroy", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "displayEventsRouter", "Lkotlinx/coroutines/Job;", "displayMessage", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "handleSessionChange", "change", "Lcom/unity3d/ads/core/data/model/SessionChange;", "(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleVolumeSettingsChange", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAllowedPiiChange", "value", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", NotificationCompat.CATEGORY_EVENT, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendFocusChange", "isFocused", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendPrivacyFsmChange", "sendUserConsentChange", "sendVisibilityChange", x6.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", i1.u, "showOptions", "Lcom/unity3d/ads/adplayer/ShowOptions;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final MutableSharedFlow<DisplayMessage> displayMessages = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    private final DeviceInfoRepository deviceInfoRepository;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final SessionRepository sessionRepository;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {0, 1, 2}, l = {92, 97, 101, 103}, m = "destroy", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidFullscreenWebViewAdPlayer.this.destroy(this);
        }
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public CoroutineScope getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<Pair<byte[], Integer>> getUpdateCampaignState() {
        return this.webViewAdPlayer.getUpdateCampaignState();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.onBroadcastEvent(str, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.requestShow(map, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendFocusChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendMuteChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendVisibilityChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendVolumeChange(d, continuation);
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository) {
        Intrinsics.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        Context context = androidShowOptions.getContext();
        Intent intent = new Intent(context, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", unityAdsShowOptions.toString());
        }
        intent.addFlags(268500992);
        final MutableSharedFlow<DisplayMessage> mutableSharedFlow = displayMessages;
        FlowKt.launchIn(FlowKt.onEach(new Flow<DisplayMessage>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super DisplayMessage> flowCollector, Continuation continuation) {
                Object objCollect = mutableSharedFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r7
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r7 = r0.label
                        int r7 = r7 - r2
                        r0.label = r7
                        goto L19
                    L14:
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L19:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L56
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        r2 = r6
                        com.unity3d.ads.adplayer.DisplayMessage r2 = (com.unity3d.ads.adplayer.DisplayMessage) r2
                        java.lang.String r2 = r2.getOpportunityId()
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = r5.this$0
                        java.lang.String r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOpportunityId$p(r4)
                        boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                        if (r2 == 0) goto L56
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L56
                        return r1
                    L56:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
        }, new AnonymousClass2(this)), getScope());
        FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getVolumeSettingsChange(), new AnonymousClass3(this)), getScope());
        final Flow<ShowEvent> onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        FlowKt.launchIn(FlowKt.onEach(new Flow<ShowEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ShowEvent> flowCollector, Continuation continuation) {
                Object objCollect = onShowEvent.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r7
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r7 = r0.label
                        int r7 = r7 - r2
                        r0.label = r7
                        goto L19
                    L14:
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1
                        r0.<init>(r7)
                    L19:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L54
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        r2 = r6
                        com.unity3d.ads.core.data.model.ShowEvent r2 = (com.unity3d.ads.core.data.model.ShowEvent) r2
                        boolean r4 = r2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed
                        if (r4 != 0) goto L48
                        boolean r2 = r2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Error
                        if (r2 == 0) goto L46
                        goto L48
                    L46:
                        r2 = 0
                        goto L49
                    L48:
                        r2 = r3
                    L49:
                        if (r2 == 0) goto L54
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L54
                        return r1
                    L54:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
        }, new AnonymousClass5(null)), getScope());
        FlowKt.launchIn(FlowKt.onEach(this.sessionRepository.getOnChange(), new AnonymousClass6(this)), getScope());
        context.startActivity(intent);
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements Function2<DisplayMessage, Continuation<? super Unit>, Object>, SuspendFunction {
        AnonymousClass2(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DisplayMessage displayMessage, Continuation<? super Unit> continuation) {
            return AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, Continuation continuation) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return Unit.INSTANCE;
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function2<VolumeSettingsChange, Continuation<? super Unit>, Object>, SuspendFunction {
        AnonymousClass3(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VolumeSettingsChange volumeSettingsChange, Continuation<? super Unit> continuation) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, continuation);
        }
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$5", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<ShowEvent, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ShowEvent showEvent, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(showEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (AndroidFullscreenWebViewAdPlayer.this.destroy(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6, reason: invalid class name */
    /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function2<SessionChange, Continuation<? super Unit>, Object>, SuspendFunction {
        AnonymousClass6(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SessionChange sessionChange, Continuation<? super Unit> continuation) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, Continuation<? super Unit> continuation) throws Throwable {
        if (volumeSettingsChange instanceof VolumeSettingsChange.MuteChange) {
            Object objSendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), continuation);
            return objSendMuteChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendMuteChange : Unit.INSTANCE;
        }
        if (!(volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange)) {
            return Unit.INSTANCE;
        }
        Object objSendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), continuation);
        return objSendVolumeChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendVolumeChange : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, Continuation<? super Unit> continuation) throws Throwable {
        if (sessionChange instanceof SessionChange.UserConsentChange) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "change.value.toByteArray()");
            Object objSendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, continuation);
            return objSendUserConsentChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendUserConsentChange : Unit.INSTANCE;
        }
        if (!(sessionChange instanceof SessionChange.PrivacyFsmChange)) {
            return Unit.INSTANCE;
        }
        WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
        byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray2, "change.value.toByteArray()");
        Object objSendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, continuation);
        return objSendPrivacyFsmChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendPrivacyFsmChange : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object destroy(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r9
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L53
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            kotlin.ResultKt.throwOnFailure(r9)
            goto La1
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L95
        L43:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L86
        L4b:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6b
        L53:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.DisplayMessage> r9 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayMessages
            com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest r2 = new com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest
            java.lang.String r7 = r8.opportunityId
            r2.<init>(r7)
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto L6a
            return r1
        L6a:
            r2 = r8
        L6b:
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r2.openMeasurementRepository
            java.lang.String r6 = r2.opportunityId
            com.google.protobuf.ByteString r6 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(r6)
            boolean r9 = r9.hasSessionFinished(r6)
            if (r9 == 0) goto L86
            r6 = 1000(0x3e8, double:4.94E-321)
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r9 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r9 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r9 != r1) goto La1
            return r1
        La1:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {108, 109, 110, 111, 113}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1, reason: invalid class name and case insensitive filesystem */
    static final class C14261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DisplayMessage $displayMessage;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14261(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Continuation<? super C14261> continuation) {
            super(2, continuation);
            this.$displayMessage = displayMessage;
            this.this$0 = androidFullscreenWebViewAdPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14261(this.$displayMessage, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DisplayMessage displayMessage = this.$displayMessage;
                if (displayMessage instanceof DisplayMessage.DisplayReady) {
                    this.label = 1;
                    if (this.this$0.webViewAdPlayer.requestShow(((DisplayMessage.DisplayReady) this.$displayMessage).getShowOptions(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof DisplayMessage.WebViewInstanceRequest) {
                    this.label = 2;
                    if (AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages().emit(new DisplayMessage.WebViewInstanceResponse(this.$displayMessage.getOpportunityId(), this.this$0.getWebViewContainer().getWebView()), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof DisplayMessage.VisibilityChanged) {
                    this.label = 3;
                    if (this.this$0.webViewAdPlayer.sendVisibilityChange(((DisplayMessage.VisibilityChanged) this.$displayMessage).getIsVisible(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof DisplayMessage.FocusChanged) {
                    this.label = 4;
                    if (this.this$0.webViewAdPlayer.sendFocusChange(((DisplayMessage.FocusChanged) this.$displayMessage).getIsFocused(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof DisplayMessage.DisplayError) {
                    this.label = 5;
                    if (this.this$0.destroy(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final Job displayEventsRouter(DisplayMessage displayMessage) {
        return BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new C14261(displayMessage, this, null), 3, null);
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer$Companion;", "", "()V", "displayMessages", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "getDisplayMessages", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MutableSharedFlow<DisplayMessage> getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }
    }
}
