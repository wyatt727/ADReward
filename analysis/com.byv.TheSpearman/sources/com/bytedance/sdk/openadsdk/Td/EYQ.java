package com.bytedance.sdk.openadsdk.Td;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.tPj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.apiImpl.Pm.mZx;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.nativeexpress.Kbd;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.nWX;
import java.lang.reflect.Method;

/* compiled from: ADNFactory.java */
/* loaded from: classes2.dex */
public class EYQ implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.Td.EYQ.1
            private int mZx;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot adSlotBuild = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                if (pAGAppOpenRequest != null) {
                    this.mZx = pAGAppOpenRequest.getTimeout();
                }
                final com.bytedance.sdk.openadsdk.apiImpl.Td.EYQ eyq = new com.bytedance.sdk.openadsdk.apiImpl.Td.EYQ(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(new QQ("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.Td.EYQ.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!hu.Pm().UB() && FH.hYh()) {
                                eyq.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(eyq)) {
                                return;
                            }
                            if (adSlotBuild == null) {
                                eyq.onError(-4, "adslot is null");
                                return;
                            }
                            Method methodEYQ = tPj.EYQ("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", Context.class, AdSlot.class, PAGAppOpenAdLoadListener.class, Integer.TYPE);
                            if (methodEYQ != null) {
                                methodEYQ.invoke(null, hu.EYQ(), adSlotBuild, eyq, Integer.valueOf(AnonymousClass1.this.mZx));
                            }
                        } catch (Throwable th) {
                            pi.EYQ("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, eyq, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.Td.EYQ.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                if ((pAGBannerRequest != null ? pAGBannerRequest.getAdSize() : null) != null) {
                    codeId.setExpressViewAcceptedSize(r0.getWidth(), r0.getHeight());
                }
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ eyq = new com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(new QQ("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.Td.EYQ.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!hu.Pm().UB() && FH.hYh()) {
                            eyq.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(eyq)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            eyq.onError(-4, "adslot is null");
                            return;
                        }
                        adSlot.setNativeAdType(1);
                        adSlotBuild.setDurationSlotType(1);
                        Kbd.EYQ(hu.EYQ()).EYQ(adSlotBuild, 1, eyq, 5000);
                    }
                }, eyq, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.Td.EYQ.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final com.bytedance.sdk.openadsdk.apiImpl.feed.Kbd kbd = new com.bytedance.sdk.openadsdk.apiImpl.feed.Kbd(pAGNativeAdLoadListener);
                AdSlot.Builder builderWithBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(builderWithBid, pAGNativeRequest);
                final AdSlot adSlotBuild = builderWithBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(new QQ("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.Td.EYQ.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!hu.Pm().UB() && FH.hYh()) {
                            kbd.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(kbd)) {
                            return;
                        }
                        if (adSlotBuild == null) {
                            kbd.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method methodEYQ = tPj.EYQ("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", Context.class, AdSlot.class, PAGNativeAdLoadListener.class);
                            if (methodEYQ != null) {
                                methodEYQ.invoke(null, hu.EYQ(), adSlotBuild, kbd);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, kbd, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.Td.EYQ.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(codeId, pAGRewardedRequest);
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final mZx mzx = new mZx(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(new QQ("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.Td.EYQ.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!hu.Pm().UB() && FH.hYh()) {
                            mzx.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (!nWX.EYQ(nWX.EYQ, "load_reward_ad")) {
                            PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                            if (pAGRewardedAdLoadListener2 != null) {
                                pAGRewardedAdLoadListener2.onError(-17, "Insufficient running memory");
                                return;
                            }
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(mzx)) {
                            return;
                        }
                        if (adSlotBuild == null) {
                            mzx.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method methodEYQ = tPj.EYQ("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", Context.class, AdSlot.class, PAGRewardedAdLoadListener.class);
                            if (methodEYQ != null) {
                                methodEYQ.invoke(null, hu.EYQ(), adSlotBuild, mzx);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, mzx, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.Td.EYQ.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot adSlotBuild = codeId.build();
                final com.bytedance.sdk.openadsdk.apiImpl.mZx.EYQ eyq = new com.bytedance.sdk.openadsdk.apiImpl.mZx.EYQ(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(new QQ("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.Td.EYQ.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!hu.Pm().UB() && FH.hYh()) {
                            eyq.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (!nWX.EYQ(nWX.EYQ, "load_interstitial_ad")) {
                            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                            if (pAGInterstitialAdLoadListener2 != null) {
                                pAGInterstitialAdLoadListener2.onError(-17, "Insufficient running memory");
                                return;
                            }
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.EYQ.EYQ(eyq)) {
                            return;
                        }
                        if (adSlotBuild == null) {
                            eyq.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method methodEYQ = tPj.EYQ("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", Context.class, AdSlot.class, PAGInterstitialAdLoadListener.class);
                            if (methodEYQ != null) {
                                methodEYQ.invoke(null, hu.EYQ(), adSlotBuild, eyq);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, eyq, adSlotBuild);
            }
        };
    }
}
