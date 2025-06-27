package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.view.ViewGroup;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: MintegralFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/google/ads/mediation/mintegral/MintegralFactory;", "", "()V", "createBidInterstitialHandler", "Lcom/google/ads/mediation/mintegral/MintegralBidNewInterstitialAdWrapper;", "createInterstitialHandler", "Lcom/google/ads/mediation/mintegral/MintegralNewInterstitialAdWrapper;", "createSplashAdWrapper", "Lcom/google/ads/mediation/mintegral/MintegralSplashAdWrapper;", "mintegral_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MintegralFactory {
    public static final MintegralFactory INSTANCE = new MintegralFactory();

    private MintegralFactory() {
    }

    @JvmStatic
    public static final MintegralSplashAdWrapper createSplashAdWrapper() {
        return new MintegralSplashAdWrapper() { // from class: com.google.ads.mediation.mintegral.MintegralFactory.createSplashAdWrapper.1
            private MBSplashHandler instance;

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void createAd(String placementId, String adUnitId) {
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                this.instance = new MBSplashHandler(placementId, adUnitId, true, 5);
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void setSplashLoadListener(MBSplashLoadWithCodeListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.setSplashLoadListener(listener);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void setSplashShowListener(MBSplashShowListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.setSplashShowListener(listener);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void setExtraInfo(JSONObject jsonObject) {
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.setExtraInfo(jsonObject);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void preLoad() {
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.preLoad();
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void preLoadByToken(String token) {
                Intrinsics.checkNotNullParameter(token, "token");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.preLoadByToken(token);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void show(ViewGroup group) {
                Intrinsics.checkNotNullParameter(group, "group");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.show(group);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void show(ViewGroup group, String bidToken) {
                Intrinsics.checkNotNullParameter(group, "group");
                Intrinsics.checkNotNullParameter(bidToken, "bidToken");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.show(group, bidToken);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void onDestroy() {
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.onDestroy();
                }
            }
        };
    }

    @JvmStatic
    public static final MintegralNewInterstitialAdWrapper createInterstitialHandler() {
        return new MintegralNewInterstitialAdWrapper() { // from class: com.google.ads.mediation.mintegral.MintegralFactory.createInterstitialHandler.1
            private MBNewInterstitialHandler instance;

            @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
            public void createAd(Context context, String placementId, String adUnitId) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                this.instance = new MBNewInterstitialHandler(context, placementId, adUnitId);
            }

            @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
            public void setInterstitialVideoListener(NewInterstitialWithCodeListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                MBNewInterstitialHandler mBNewInterstitialHandler = this.instance;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.setInterstitialVideoListener(listener);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
            public void load() {
                MBNewInterstitialHandler mBNewInterstitialHandler = this.instance;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.load();
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
            public void playVideoMute(int muteConstant) {
                MBNewInterstitialHandler mBNewInterstitialHandler = this.instance;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.playVideoMute(muteConstant);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
            public void show() {
                MBNewInterstitialHandler mBNewInterstitialHandler = this.instance;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.show();
                }
            }
        };
    }

    @JvmStatic
    public static final MintegralBidNewInterstitialAdWrapper createBidInterstitialHandler() {
        return new MintegralBidNewInterstitialAdWrapper() { // from class: com.google.ads.mediation.mintegral.MintegralFactory.createBidInterstitialHandler.1
            private MBBidNewInterstitialHandler instance;

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void createAd(Context context, String placementId, String adUnitId) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                this.instance = new MBBidNewInterstitialHandler(context, placementId, adUnitId);
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void setExtraInfo(JSONObject jsonObject) {
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.instance;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.setExtraInfo(jsonObject);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void setInterstitialVideoListener(NewInterstitialWithCodeListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.instance;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.setInterstitialVideoListener(listener);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void loadFromBid(String bidToken) {
                Intrinsics.checkNotNullParameter(bidToken, "bidToken");
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.instance;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.loadFromBid(bidToken);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void playVideoMute(int muteConstant) {
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.instance;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.playVideoMute(muteConstant);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void showFromBid() {
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.instance;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.showFromBid();
                }
            }
        };
    }
}
