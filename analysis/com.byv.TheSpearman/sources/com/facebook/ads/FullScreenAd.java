package com.facebook.ads;

import com.facebook.ads.Ad;

/* loaded from: classes2.dex */
public interface FullScreenAd extends Ad {

    public interface ShowAdConfig {
    }

    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
