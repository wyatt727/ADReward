package com.unity3d.ads.gatewayclient;

import kotlin.Metadata;

/* compiled from: RequestPolicy.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"}, d2 = {"Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "", "maxDuration", "", "retryMaxInterval", "retryWaitBase", "retryJitterPct", "", "connectTimeout", "readTimeout", "writeTimeout", "shouldStoreLocally", "", "(IIIFIIIZ)V", "getConnectTimeout", "()I", "getMaxDuration", "getReadTimeout", "getRetryJitterPct", "()F", "getRetryMaxInterval", "getRetryWaitBase", "getShouldStoreLocally", "()Z", "getWriteTimeout", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RequestPolicy {
    private final int connectTimeout;
    private final int maxDuration;
    private final int readTimeout;
    private final float retryJitterPct;
    private final int retryMaxInterval;
    private final int retryWaitBase;
    private final boolean shouldStoreLocally;
    private final int writeTimeout;

    /* renamed from: component1, reason: from getter */
    public final int getMaxDuration() {
        return this.maxDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    /* renamed from: component4, reason: from getter */
    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    /* renamed from: component5, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    /* renamed from: component6, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* renamed from: component7, reason: from getter */
    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    public final RequestPolicy copy(int maxDuration, int retryMaxInterval, int retryWaitBase, float retryJitterPct, int connectTimeout, int readTimeout, int writeTimeout, boolean shouldStoreLocally) {
        return new RequestPolicy(maxDuration, retryMaxInterval, retryWaitBase, retryJitterPct, connectTimeout, readTimeout, writeTimeout, shouldStoreLocally);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPolicy)) {
            return false;
        }
        RequestPolicy requestPolicy = (RequestPolicy) other;
        return this.maxDuration == requestPolicy.maxDuration && this.retryMaxInterval == requestPolicy.retryMaxInterval && this.retryWaitBase == requestPolicy.retryWaitBase && Float.compare(this.retryJitterPct, requestPolicy.retryJitterPct) == 0 && this.connectTimeout == requestPolicy.connectTimeout && this.readTimeout == requestPolicy.readTimeout && this.writeTimeout == requestPolicy.writeTimeout && this.shouldStoreLocally == requestPolicy.shouldStoreLocally;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iFloatToIntBits = ((((((((((((this.maxDuration * 31) + this.retryMaxInterval) * 31) + this.retryWaitBase) * 31) + Float.floatToIntBits(this.retryJitterPct)) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31;
        boolean z = this.shouldStoreLocally;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iFloatToIntBits + i;
    }

    public String toString() {
        return "RequestPolicy(maxDuration=" + this.maxDuration + ", retryMaxInterval=" + this.retryMaxInterval + ", retryWaitBase=" + this.retryWaitBase + ", retryJitterPct=" + this.retryJitterPct + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", shouldStoreLocally=" + this.shouldStoreLocally + ')';
    }

    public RequestPolicy(int i, int i2, int i3, float f, int i4, int i5, int i6, boolean z) {
        this.maxDuration = i;
        this.retryMaxInterval = i2;
        this.retryWaitBase = i3;
        this.retryJitterPct = f;
        this.connectTimeout = i4;
        this.readTimeout = i5;
        this.writeTimeout = i6;
        this.shouldStoreLocally = z;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }
}
