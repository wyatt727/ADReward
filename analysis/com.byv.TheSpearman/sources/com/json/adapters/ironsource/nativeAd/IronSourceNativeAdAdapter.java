package com.json.adapters.ironsource.nativeAd;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.adapters.ironsource.IronSourceAdapter;
import com.json.environment.ContextProvider;
import com.json.i1;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.json.mediationsdk.d;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.q7;
import com.json.t2;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J,\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J,\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J,\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/adapters/ironsource/nativeAd/IronSourceNativeAdAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractNativeAdAdapter;", "Lcom/ironsource/adapters/ironsource/IronSourceAdapter;", "Lorg/json/JSONObject;", "config", "", i1.r, "prepareLoadParams", "appKey", "userId", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initNativeAdForBidding", "adData", "loadNativeAdForBidding", "", "", "getNativeAdBiddingData", "destroyNativeAd", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "releaseMemory", "Lcom/ironsource/q7;", "nativeAd", "Lcom/ironsource/q7;", "adapter", "<init>", "(Lcom/ironsource/adapters/ironsource/IronSourceAdapter;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {
    private q7 nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(IronSourceAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter this$0, JSONObject config, NativeAdSmashListener listener, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        try {
            q7 q7VarA = q7.INSTANCE.a();
            q7VarA.a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(q7VarA, this$0.getNativeAdProperties(config)), listener));
            Activity activity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject jSONObjectPrepareLoadParams = this$0.prepareLoadParams(config, str);
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            q7VarA.a(activity, jSONObjectPrepareLoadParams);
            this$0.nativeAd = q7VarA;
        } catch (Exception e) {
            listener.onNativeAdLoadFailed(new IronSourceError(510, "IronSourceAdapter loadNativeAd exception " + e.getMessage()));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject config, String serverData) throws JSONException {
        JSONObject loadParams = new JSONObject().put("demandSourceName", getAdapter().getDemandSourceName(config)).put(t2.s, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, d.c().b(serverData));
        HashMap<String, String> extraParams = getAdapter().getInitParams();
        Intrinsics.checkNotNullExpressionValue(extraParams, "extraParams");
        for (Map.Entry<String, String> entry : extraParams.entrySet()) {
            loadParams.put(entry.getKey(), entry.getValue());
        }
        Intrinsics.checkNotNullExpressionValue(loadParams, "loadParams");
        return loadParams;
    }

    @Override // com.json.mediationsdk.adapter.AbstractNativeAdAdapter, com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        q7 q7Var = this.nativeAd;
        if (q7Var != null) {
            q7Var.destroy();
        }
    }

    @Override // com.json.mediationsdk.adapter.AbstractNativeAdAdapter, com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(JSONObject config, JSONObject adData) {
        Intrinsics.checkNotNullParameter(config, "config");
        return getAdapter().getBiddingData();
    }

    @Override // com.json.mediationsdk.adapter.AbstractNativeAdAdapter, com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String appKey, String userId, JSONObject config, NativeAdSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getAdapter().initSDK(appKey, config);
        listener.onNativeAdInitSuccess();
    }

    @Override // com.json.mediationsdk.adapter.AbstractNativeAdAdapter, com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(final JSONObject config, JSONObject adData, final String serverData, final NativeAdSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0(this.f$0, config, listener, serverData);
            }
        });
    }

    @Override // com.json.mediationsdk.sdk.ReleaseMemoryAdapterInterface
    public void releaseMemory(IronSource.AD_UNIT adUnit, JSONObject config) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
    }
}
