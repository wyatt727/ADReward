package com.my.target.common;

import com.my.target.j;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.o5;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class BaseAd {
    protected final j adConfig;
    private final AtomicBoolean isLoaded = new AtomicBoolean();
    protected final o5.a metricFactory;

    public BaseAd(int i, String str) {
        this.adConfig = j.newConfig(i, str);
        this.metricFactory = o5.a(i);
    }

    public CustomParams getCustomParams() {
        return this.adConfig.getCustomParams();
    }

    public boolean isLoadCalled() {
        return !this.isLoaded.compareAndSet(false, true);
    }

    public void setAdNetworkConfig(String str, AdNetworkConfig adNetworkConfig) {
        this.adConfig.setAdNetworkConfig(str, adNetworkConfig);
    }
}
