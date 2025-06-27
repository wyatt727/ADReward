package com.facebook.ads;

/* loaded from: classes2.dex */
public interface Ad {

    public interface LoadAdConfig {
    }

    public interface LoadConfigBuilder {
        LoadAdConfig build();

        LoadConfigBuilder withBid(String str);
    }

    void destroy();

    String getPlacementId();

    boolean isAdInvalidated();

    void loadAd();

    @Deprecated
    void setExtraHints(ExtraHints extraHints);
}
