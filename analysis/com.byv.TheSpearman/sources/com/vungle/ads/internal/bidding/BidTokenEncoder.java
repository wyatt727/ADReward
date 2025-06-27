package com.vungle.ads.internal.bidding;

import android.content.Context;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.RtbRequest;
import com.vungle.ads.internal.model.RtbToken;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.InputOutputUtils;
import com.vungle.ads.internal.util.Logger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: BidTokenEncoder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\r\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0002\b\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/bidding/BidTokenEncoder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "enterBackgroundTime", "", "json", "Lkotlinx/serialization/json/Json;", "ordinalView", "", "bidTokenV5", "", "constructV5Token", "constructV5Token$vungle_ads_release", "encode", "Companion", "vungle-ads_release", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BidTokenEncoder {
    private static final int TOKEN_VERSION = 5;
    private final Context context;
    private long enterBackgroundTime;
    private final Json json;
    private int ordinalView;

    public BidTokenEncoder(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                invoke2(jsonBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JsonBuilder Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.setExplicitNulls(false);
            }
        }, 1, null);
        ActivityManager.INSTANCE.addLifecycleListener(new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder.1
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onResume() {
                super.onResume();
                if (System.currentTimeMillis() > BidTokenEncoder.this.enterBackgroundTime + ConfigManager.INSTANCE.getSessionTimeout()) {
                    BidTokenEncoder.this.ordinalView = 0;
                    BidTokenEncoder.this.enterBackgroundTime = 0L;
                }
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onPause() {
                super.onPause();
                BidTokenEncoder.this.enterBackgroundTime = System.currentTimeMillis();
            }
        });
    }

    public final String encode() {
        this.ordinalView++;
        return bidTokenV5();
    }

    private final String bidTokenV5() {
        try {
            String strConstructV5Token$vungle_ads_release = constructV5Token$vungle_ads_release();
            Logger.INSTANCE.w("BidTokenEncoder", "BidToken: " + strConstructV5Token$vungle_ads_release);
            String strConvertForSending = InputOutputUtils.INSTANCE.convertForSending(strConstructV5Token$vungle_ads_release);
            Logger.INSTANCE.w("BidTokenEncoder", "After conversion: 5:" + strConvertForSending);
            return "5:" + strConvertForSending;
        } catch (Exception e) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(116, "Fail to gzip bidtoken " + e.getLocalizedMessage(), (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
            return null;
        }
    }

    /* renamed from: constructV5Token$lambda-0, reason: not valid java name */
    private static final VungleApiClient m927constructV5Token$lambda0(Lazy<VungleApiClient> lazy) {
        return lazy.getValue();
    }

    public final String constructV5Token$vungle_ads_release() throws IllegalStateException {
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        CommonRequestBody commonRequestBodyRequestBody = m927constructV5Token$lambda0(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder$constructV5Token$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final VungleApiClient invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
            }
        })).requestBody(!ConfigManager.INSTANCE.signalsDisabled());
        RtbToken rtbToken = new RtbToken(commonRequestBodyRequestBody.getDevice(), commonRequestBodyRequestBody.getUser(), commonRequestBodyRequestBody.getExt(), new RtbRequest(VungleApiClient.INSTANCE.getHeaderUa()), this.ordinalView);
        Json json = this.json;
        KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(RtbToken.class));
        Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.encodeToString(kSerializerSerializer, rtbToken);
    }
}
