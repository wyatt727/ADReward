package com.facebook.ads;

/* loaded from: classes2.dex */
public interface AdListener {
    void onAdClicked(Ad ad);

    void onAdLoaded(Ad ad);

    void onError(Ad ad, AdError adError);

    void onLoggingImpression(Ad ad);
}
