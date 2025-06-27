package com.vungle.ads.internal.network;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.i5;
import com.json.m4;
import com.mbridge.msdk.foundation.entity.b;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.converters.EmptyResponseConverter;
import com.vungle.ads.internal.network.converters.JsonConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* compiled from: VungleApiImpl.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J(\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006#"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiImpl;", "Lcom/vungle/ads/internal/network/VungleApi;", "okHttpClient", "Lokhttp3/Call$Factory;", "(Lokhttp3/Call$Factory;)V", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "emptyResponseConverter", "Lcom/vungle/ads/internal/network/converters/EmptyResponseConverter;", "getOkHttpClient$vungle_ads_release", "()Lokhttp3/Call$Factory;", b.JSON_KEY_ADS, "Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/AdPayload;", i5.R, "path", "body", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "config", "Lcom/vungle/ads/internal/model/ConfigPayload;", "defaultBuilder", "Lokhttp3/Request$Builder;", "defaultProtoBufBuilder", "pingTPAT", "Ljava/lang/Void;", "url", "ri", "sendAdMarkup", "requestBody", "Lokhttp3/RequestBody;", "sendErrors", "sendMetrics", "setAppId", "", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class VungleApiImpl implements VungleApi {
    private static final String VUNGLE_VERSION = "7.1.0";
    private String appId;
    private final EmptyResponseConverter emptyResponseConverter;
    private final Call.Factory okHttpClient;
    private static final Json json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.internal.network.VungleApiImpl$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
            Json.setAllowStructuredMapKeys(true);
        }
    }, 1, null);

    public VungleApiImpl(Call.Factory okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
        this.emptyResponseConverter = new EmptyResponseConverter();
    }

    /* renamed from: getOkHttpClient$vungle_ads_release, reason: from getter */
    public final Call.Factory getOkHttpClient() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public void setAppId(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.appId = appId;
    }

    private final Request.Builder defaultBuilder(String ua, String path) {
        Request.Builder builderAddHeader = new Request.Builder().url(path).addHeader("User-Agent", ua).addHeader("Vungle-Version", VUNGLE_VERSION).addHeader("Content-Type", m4.K);
        String str = this.appId;
        if (str != null) {
            builderAddHeader.addHeader("X-Vungle-App-Id", str);
        }
        return builderAddHeader;
    }

    private final Request.Builder defaultProtoBufBuilder(String ua, String path) {
        Request.Builder builderAddHeader = new Request.Builder().url(path).addHeader("User-Agent", ua).addHeader("Vungle-Version", VUNGLE_VERSION).addHeader("Content-Type", "application/x-protobuf");
        String str = this.appId;
        if (str != null) {
            builderAddHeader.addHeader("X-Vungle-App-Id", str);
        }
        return builderAddHeader;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<ConfigPayload> config(String ua, String path, CommonRequestBody body) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json2 = json;
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(CommonRequestBody.class));
            Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder(ua, path).post(RequestBody.INSTANCE.create(json2.encodeToString(kSerializerSerializer, body), (MediaType) null)).build()), new JsonConverter(Reflection.typeOf(ConfigPayload.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<AdPayload> ads(String ua, String path, CommonRequestBody body) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json2 = json;
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(CommonRequestBody.class));
            Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder(ua, path).post(RequestBody.INSTANCE.create(json2.encodeToString(kSerializerSerializer, body), (MediaType) null)).build()), new JsonConverter(Reflection.typeOf(AdPayload.class)));
        } catch (Exception unused) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(101, "Error with url: " + path, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> ri(String ua, String path, CommonRequestBody body) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json2 = json;
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(CommonRequestBody.class));
            Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder(ua, path).post(RequestBody.INSTANCE.create(json2.encodeToString(kSerializerSerializer, body), (MediaType) null)).build()), this.emptyResponseConverter);
        } catch (Exception unused) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(101, "Error with url: " + path, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> pingTPAT(String ua, String url) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(url, "url");
        return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder(ua, HttpUrl.INSTANCE.get(url).newBuilder().build().getUrl()).get().build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> sendMetrics(String ua, String path, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.newCall(defaultProtoBufBuilder(ua, HttpUrl.INSTANCE.get(path).newBuilder().build().getUrl()).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> sendErrors(String ua, String path, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.newCall(defaultProtoBufBuilder(ua, HttpUrl.INSTANCE.get(path).newBuilder().build().getUrl()).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> sendAdMarkup(String url, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder("debug", HttpUrl.INSTANCE.get(url).newBuilder().build().getUrl()).post(requestBody).build()), this.emptyResponseConverter);
    }
}
