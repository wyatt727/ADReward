package com.json.mediationsdk.adapter;

import com.json.environment.thread.IronSourceThreadManager;
import com.json.mediationsdk.INetworkInitCallbackListener;
import com.json.t2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0004J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0004J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/ironsource/mediationsdk/adapter/AbstractAdUnitAdapter;", "AdNetworkAdapter", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "adapter", "(Ljava/lang/Object;)V", "getAdapter", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getAdUnitIdMissingErrorString", "", t2.h.W, "getConfigStringValueFromKey", "config", "Lorg/json/JSONObject;", "onNetworkInitCallbackFailed", "", "error", "onNetworkInitCallbackSuccess", "postBackgroundThread", "runnable", "Ljava/lang/Runnable;", "postOnUIThread", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AbstractAdUnitAdapter<AdNetworkAdapter> implements INetworkInitCallbackListener {
    private final AdNetworkAdapter adapter;

    public AbstractAdUnitAdapter(AdNetworkAdapter adnetworkadapter) {
        this.adapter = adnetworkadapter;
    }

    protected final String getAdUnitIdMissingErrorString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return "Missing params - " + key;
    }

    public final AdNetworkAdapter getAdapter() {
        return this.adapter;
    }

    protected final String getConfigStringValueFromKey(JSONObject config, String key) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(key, "key");
        String strOptString = config.optString(key);
        Intrinsics.checkNotNullExpressionValue(strOptString, "config.optString(key)");
        return strOptString;
    }

    @Override // com.json.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String error) {
    }

    @Override // com.json.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
    }

    public final void postBackgroundThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postAdapterBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void postOnUIThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }
}
