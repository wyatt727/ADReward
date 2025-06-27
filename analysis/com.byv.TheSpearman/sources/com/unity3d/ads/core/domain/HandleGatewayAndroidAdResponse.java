package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.json.mediationsdk.utils.c;
import com.json.t2;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.services.core.di.ServiceProvider;
import gateway.v1.AdResponseOuterClass;
import gateway.v1.AllowedPiiOuterClass;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.koin.core.annotation.Factory;
import org.koin.core.annotation.Named;
import org.objectweb.asm.Opcodes;

/* compiled from: HandleGatewayAndroidAdResponse.kt */
@Factory
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ3\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)JA\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0096Bø\u0001\u0000¢\u0006\u0002\u00104R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleGatewayAndroidAdResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "getWebViewContainerUseCase", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "getWebViewBridge", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getHandleInvocationsFromAdViewer", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "executeAdViewerRequest", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getLatestWebViewConfiguration", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "adPlayerScope", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;Lcom/unity3d/ads/adplayer/AdPlayerScope;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "cleanup", "", "t", "", "opportunityId", "Lcom/google/protobuf/ByteString;", c.Y1, "Lgateway/v1/AdResponseOuterClass$AdResponse;", "adPlayer", "Lcom/unity3d/ads/adplayer/AdPlayer;", "(Ljava/lang/Throwable;Lcom/google/protobuf/ByteString;Lgateway/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/adplayer/AdPlayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "context", "Landroid/content/Context;", t2.k, "", "adType", "Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "(Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgateway/v1/AdResponseOuterClass$AdResponse;Landroid/content/Context;Ljava/lang/String;Lgateway/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HandleGatewayAndroidAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CampaignRepository campaignRepository;
    private final CoroutineDispatcher defaultDispatcher;
    private final DeviceInfoRepository deviceInfoRepository;
    private final ExecuteAdViewerRequest executeAdViewerRequest;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* compiled from: HandleGatewayAndroidAdResponse.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse", f = "HandleGatewayAndroidAdResponse.kt", i = {0}, l = {236, 242}, m = "cleanup", n = {"adPlayer"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$cleanup$1, reason: invalid class name */
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
            return HandleGatewayAndroidAdResponse.this.cleanup(null, null, null, null, this);
        }
    }

    /* compiled from: HandleGatewayAndroidAdResponse.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse", f = "HandleGatewayAndroidAdResponse.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6}, l = {93, 126, 189, Opcodes.IFNULL, 202, 214, 218}, m = "invoke", n = {"this", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", c.Y1, t2.k, "adType", "adPlayer", "this", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", c.Y1, t2.k, "adType", "adPlayer", "webViewUrl", "base64ImpressionConfiguration", "this", "opportunityId", c.Y1, "adPlayer", "webViewAdPlayer", "adObject", "this", "opportunityId", c.Y1, "adPlayer", "adObject", "this", "opportunityId", c.Y1, "adPlayer", "loadEvent", "this", "opportunityId", c.Y1, "adPlayer", "adObject", "t"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0"})
    /* renamed from: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$1, reason: invalid class name and case insensitive filesystem */
    static final class C14681 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        C14681(Continuation<? super C14681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HandleGatewayAndroidAdResponse.this.invoke(null, null, null, null, null, null, this);
        }
    }

    public HandleGatewayAndroidAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridge, @Named(ServiceProvider.DEFAULT_DISPATCHER) CoroutineDispatcher defaultDispatcher, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, SessionRepository sessionRepository, CampaignRepository campaignRepository, ExecuteAdViewerRequest executeAdViewerRequest, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, OpenMeasurementRepository openMeasurementRepository) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        Intrinsics.checkNotNullParameter(getWebViewBridge, "getWebViewBridge");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(executeAdViewerRequest, "executeAdViewerRequest");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        Intrinsics.checkNotNullParameter(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.defaultDispatcher = defaultDispatcher;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.executeAdViewerRequest = executeAdViewerRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.openMeasurementRepository = openMeasurementRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0094: MOVE (r14 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:23:0x0093 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0095: MOVE (r13 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:23:0x0093 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03f6 A[Catch: CancellationException -> 0x045f, TryCatch #0 {CancellationException -> 0x045f, blocks: (B:116:0x0459, B:111:0x0425, B:105:0x03f0, B:107:0x03f6, B:113:0x043e), top: B:158:0x03f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x043e A[Catch: CancellationException -> 0x045f, TryCatch #0 {CancellationException -> 0x045f, blocks: (B:116:0x0459, B:111:0x0425, B:105:0x03f0, B:107:0x03f6, B:113:0x043e), top: B:158:0x03f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01dd A[Catch: CancellationException -> 0x01f2, TRY_ENTER, TRY_LEAVE, TryCatch #12 {CancellationException -> 0x01f2, blocks: (B:66:0x01dd, B:75:0x020e), top: B:181:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8 A[Catch: CancellationException -> 0x049c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x049c, blocks: (B:60:0x01ca, B:70:0x01f8, B:77:0x0217), top: B:171:0x01ca }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ec A[Catch: CancellationException -> 0x046b, TRY_ENTER, TryCatch #14 {CancellationException -> 0x046b, blocks: (B:85:0x0299, B:92:0x02fa, B:91:0x02ec), top: B:183:0x0299 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03bb A[RETURN] */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions r38, com.google.protobuf.ByteString r39, gateway.v1.AdResponseOuterClass.AdResponse r40, android.content.Context r41, java.lang.String r42, gateway.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r43, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult> r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gateway.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gateway.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: HandleGatewayAndroidAdResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lgateway/v1/AllowedPiiOuterClass$AllowedPii;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$2", f = "HandleGatewayAndroidAdResponse.kt", i = {}, l = {Opcodes.IF_ICMPNE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<AllowedPiiOuterClass.AllowedPii, Continuation<? super Unit>, Object> {
        final /* synthetic */ WebViewAdPlayer $webViewAdPlayer;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(WebViewAdPlayer webViewAdPlayer, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$webViewAdPlayer = webViewAdPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$webViewAdPlayer, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(allowedPii, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
                WebViewAdPlayer webViewAdPlayer = this.$webViewAdPlayer;
                byte[] byteArray = allowedPii.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                this.label = 1;
                if (webViewAdPlayer.onAllowedPiiChange(byteArray, this) == coroutine_suspended) {
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

    /* compiled from: HandleGatewayAndroidAdResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u008a@"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$3", f = "HandleGatewayAndroidAdResponse.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Pair<? extends byte[], ? extends Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ String $placementId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ByteString byteString, String str, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$opportunityId = byteString;
            this.$placementId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = HandleGatewayAndroidAdResponse.this.new AnonymousClass3(this.$opportunityId, this.$placementId, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Pair<? extends byte[], ? extends Integer> pair, Continuation<? super Unit> continuation) {
            return invoke2((Pair<byte[], Integer>) pair, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Pair<byte[], Integer> pair, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r6.label
                if (r0 != 0) goto L91
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlin.Pair r7 = (kotlin.Pair) r7
                java.lang.Object r0 = r7.component1()
                byte[] r0 = (byte[]) r0
                java.lang.Object r7 = r7.component2()
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse r1 = com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse.this
                com.unity3d.ads.core.data.repository.CampaignRepository r1 = com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse.access$getCampaignRepository$p(r1)
                com.google.protobuf.ByteString r2 = r6.$opportunityId
                gateway.v1.CampaignStateOuterClass$Campaign r1 = r1.getCampaign(r2)
                if (r1 == 0) goto L55
                gateway.v1.CampaignKt$Dsl$Companion r2 = gateway.v1.CampaignKt.Dsl.INSTANCE
                com.google.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()
                java.lang.String r3 = "this.toBuilder()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                gateway.v1.CampaignStateOuterClass$Campaign$Builder r1 = (gateway.v1.CampaignStateOuterClass.Campaign.Builder) r1
                gateway.v1.CampaignKt$Dsl r1 = r2._create(r1)
                java.lang.String r2 = new java.lang.String
                java.nio.charset.Charset r3 = kotlin.text.Charsets.ISO_8859_1
                r2.<init>(r0, r3)
                com.google.protobuf.ByteString r2 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64(r2)
                r1.setData(r2)
                r1.setDataVersion(r7)
                gateway.v1.CampaignStateOuterClass$Campaign r1 = r1._build()
                if (r1 == 0) goto L55
                goto L83
            L55:
                java.lang.String r1 = r6.$placementId
                com.google.protobuf.ByteString r2 = r6.$opportunityId
                gateway.v1.CampaignKt$Dsl$Companion r3 = gateway.v1.CampaignKt.Dsl.INSTANCE
                gateway.v1.CampaignStateOuterClass$Campaign$Builder r4 = gateway.v1.CampaignStateOuterClass.Campaign.newBuilder()
                java.lang.String r5 = "newBuilder()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                gateway.v1.CampaignKt$Dsl r3 = r3._create(r4)
                java.lang.String r4 = new java.lang.String
                java.nio.charset.Charset r5 = kotlin.text.Charsets.ISO_8859_1
                r4.<init>(r0, r5)
                com.google.protobuf.ByteString r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64(r4)
                r3.setData(r0)
                r3.setDataVersion(r7)
                r3.setPlacementId(r1)
                r3.setImpressionOpportunityId(r2)
                gateway.v1.CampaignStateOuterClass$Campaign r1 = r3._build()
            L83:
                com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse r7 = com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse.this
                com.unity3d.ads.core.data.repository.CampaignRepository r7 = com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse.access$getCampaignRepository$p(r7)
                com.google.protobuf.ByteString r0 = r6.$opportunityId
                r7.setCampaign(r0, r1)
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L91:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: HandleGatewayAndroidAdResponse.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$4", f = "HandleGatewayAndroidAdResponse.kt", i = {}, l = {Opcodes.MONITOREXIT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $webViewUrl;
        final /* synthetic */ AndroidWebViewContainer $webviewContainer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AndroidWebViewContainer androidWebViewContainer, String str, Continuation<? super AnonymousClass4> continuation) {
            super(1, continuation);
            this.$webviewContainer = androidWebViewContainer;
            this.$webViewUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass4(this.$webviewContainer, this.$webViewUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$webviewContainer.loadUrl(this.$webViewUrl, this) == coroutine_suspended) {
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

    /* compiled from: HandleGatewayAndroidAdResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$5", f = "HandleGatewayAndroidAdResponse.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AdPlayer> $adPlayer;
        final /* synthetic */ LoadEvent $loadEvent;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(LoadEvent loadEvent, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Ref.ObjectRef<AdPlayer> objectRef, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$loadEvent = loadEvent;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HandleGatewayAndroidAdResponse.this.new AnonymousClass5(this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (HandleGatewayAndroidAdResponse.this.cleanup(new Error(((LoadEvent.Error) this.$loadEvent).getMessage()), this.$opportunityId, this.$response, this.$adPlayer.element, this) == coroutine_suspended) {
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

    /* compiled from: HandleGatewayAndroidAdResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$6", f = "HandleGatewayAndroidAdResponse.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$6, reason: invalid class name */
    static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AdPlayer> $adPlayer;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        final /* synthetic */ CancellationException $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Ref.ObjectRef<AdPlayer> objectRef, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$t = cancellationException;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HandleGatewayAndroidAdResponse.this.new AnonymousClass6(this.$t, this.$opportunityId, this.$response, this.$adPlayer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (HandleGatewayAndroidAdResponse.this.cleanup(this.$t, this.$opportunityId, this.$response, this.$adPlayer.element, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cleanup(java.lang.Throwable r15, com.google.protobuf.ByteString r16, gateway.v1.AdResponseOuterClass.AdResponse r17, com.unity3d.ads.adplayer.AdPlayer r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r14
            r1 = r19
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse.AnonymousClass1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$cleanup$1 r2 = (com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L17
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1c
        L17:
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$cleanup$1 r2 = new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$cleanup$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r13 = 2
            r4 = 1
            if (r3 == 0) goto L42
            if (r3 == r4) goto L39
            if (r3 != r13) goto L31
            kotlin.ResultKt.throwOnFailure(r1)
            goto Lad
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            java.lang.Object r3 = r2.L$0
            com.unity3d.ads.adplayer.AdPlayer r3 = (com.unity3d.ads.adplayer.AdPlayer) r3
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r3
            goto L9f
        L42:
            kotlin.ResultKt.throwOnFailure(r1)
            gateway.v1.OperativeEventErrorDataKt$Dsl$Companion r1 = gateway.v1.OperativeEventErrorDataKt.Dsl.INSTANCE
            gateway.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder r3 = gateway.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder()
            java.lang.String r5 = "newBuilder()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            gateway.v1.OperativeEventErrorDataKt$Dsl r1 = r1._create(r3)
            gateway.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r3 = gateway.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED
            r1.setErrorType(r3)
            java.lang.Throwable r3 = r15.getCause()
            if (r3 == 0) goto L65
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto L6d
        L65:
            java.lang.String r3 = r15.getMessage()
            if (r3 != 0) goto L6d
            java.lang.String r3 = ""
        L6d:
            r1.setMessage(r3)
            gateway.v1.OperativeEventRequestOuterClass$OperativeEventErrorData r1 = r1._build()
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r3 = r0.getOperativeEventApi
            gateway.v1.OperativeEventRequestOuterClass$OperativeEventType r5 = gateway.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR
            com.google.protobuf.ByteString r6 = r17.getTrackingToken()
            java.lang.String r7 = "response.trackingToken"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            com.google.protobuf.ByteString r7 = r1.toByteString()
            java.lang.String r1 = "operativeEventErrorData.toByteString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            r8 = 0
            r10 = 16
            r11 = 0
            r1 = r18
            r2.L$0 = r1
            r2.label = r4
            r4 = r5
            r5 = r16
            r9 = r2
            java.lang.Object r3 = com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r12) goto L9f
            return r12
        L9f:
            if (r1 == 0) goto Lb0
            r3 = 0
            r2.L$0 = r3
            r2.label = r13
            java.lang.Object r1 = r1.destroy(r2)
            if (r1 != r12) goto Lad
            return r12
        Lad:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        Lb0:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.ByteString, gateway.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
