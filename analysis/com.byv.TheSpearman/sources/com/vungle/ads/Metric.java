package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Metrics.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/Metric;", "", "metricType", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V", "meta", "", "getMeta", "()Ljava/lang/String;", "setMeta", "(Ljava/lang/String;)V", "getMetricType", "()Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "getValue", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Metric {
    private String meta;
    private final Sdk.SDKMetric.SDKMetricType metricType;

    public abstract long getValue();

    public Metric(Sdk.SDKMetric.SDKMetricType metricType) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.metricType = metricType;
    }

    public final Sdk.SDKMetric.SDKMetricType getMetricType() {
        return this.metricType;
    }

    public final String getMeta() {
        return this.meta;
    }

    public final void setMeta(String str) {
        this.meta = str;
    }
}
