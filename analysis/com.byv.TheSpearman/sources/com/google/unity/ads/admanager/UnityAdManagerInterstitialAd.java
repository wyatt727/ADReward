package com.google.unity.ads.admanager;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.unity.ads.PluginUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes4.dex */
public class UnityAdManagerInterstitialAd {
    private final Activity activity;
    private AdManagerInterstitialAd adManagerInterstitialAd;
    private final UnityAdManagerInterstitialAdCallback callback;
    private final ExecutorService service = Executors.newSingleThreadExecutor();

    public void destroy() {
    }

    public UnityAdManagerInterstitialAd(Activity activity, UnityAdManagerInterstitialAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    public void loadAd(final String adUnitId, final AdManagerAdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m597x872d7532(adUnitId, request);
            }
        });
    }

    /* renamed from: lambda$loadAd$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd, reason: not valid java name */
    public /* synthetic */ void m597x872d7532(String str, AdManagerAdRequest adManagerAdRequest) {
        AdManagerInterstitialAd.load(this.activity, str, adManagerAdRequest, new AnonymousClass1());
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1, reason: invalid class name */
    class AnonymousClass1 extends AdManagerInterstitialAdLoadCallback {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(AdManagerInterstitialAd ad) {
            UnityAdManagerInterstitialAd.this.adManagerInterstitialAd = ad;
            UnityAdManagerInterstitialAd.this.adManagerInterstitialAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    this.f$0.m601x7fd6bc5e(adValue);
                }
            });
            UnityAdManagerInterstitialAd.this.adManagerInterstitialAd.setAppEventListener(new AppEventListener() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.ads.admanager.AppEventListener
                public final void onAppEvent(String str, String str2) {
                    this.f$0.m603x66f5c4e0(str, str2);
                }
            });
            UnityAdManagerInterstitialAd.this.adManagerInterstitialAd.setFullScreenContentCallback(new C02041());
            UnityAdManagerInterstitialAd.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m604x5a854921();
                }
            });
        }

        /* renamed from: lambda$onAdLoaded$1$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1, reason: not valid java name */
        public /* synthetic */ void m601x7fd6bc5e(final AdValue adValue) {
            UnityAdManagerInterstitialAd.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m600x8c47381d(adValue);
                }
            });
        }

        /* renamed from: lambda$onAdLoaded$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1, reason: not valid java name */
        public /* synthetic */ void m600x8c47381d(AdValue adValue) {
            if (UnityAdManagerInterstitialAd.this.callback != null) {
                UnityAdManagerInterstitialAd.this.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }

        /* renamed from: lambda$onAdLoaded$3$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1, reason: not valid java name */
        public /* synthetic */ void m603x66f5c4e0(final String str, final String str2) {
            UnityAdManagerInterstitialAd.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m602x7366409f(str, str2);
                }
            });
        }

        /* renamed from: lambda$onAdLoaded$2$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1, reason: not valid java name */
        public /* synthetic */ void m602x7366409f(String str, String str2) {
            if (UnityAdManagerInterstitialAd.this.callback != null) {
                UnityAdManagerInterstitialAd.this.callback.onAppEvent(str, str2);
            }
        }

        /* renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$1, reason: invalid class name and collision with other inner class name */
        class C02041 extends FullScreenContentCallback {
            C02041() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(final AdError error) {
                UnityAdManagerInterstitialAd.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$1$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m607xb906eef0(error);
                    }
                });
            }

            /* renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1$1, reason: not valid java name */
            public /* synthetic */ void m607xb906eef0(AdError adError) {
                if (UnityAdManagerInterstitialAd.this.callback != null) {
                    UnityAdManagerInterstitialAd.this.callback.onAdFailedToShowFullScreenContent(adError);
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                UnityAdManagerInterstitialAd.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$1$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m609xfa79feaa();
                    }
                });
            }

            /* renamed from: lambda$onAdShowedFullScreenContent$1$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1$1, reason: not valid java name */
            public /* synthetic */ void m609xfa79feaa() {
                if (UnityAdManagerInterstitialAd.this.callback != null) {
                    UnityAdManagerInterstitialAd.this.callback.onAdShowedFullScreenContent();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                UnityAdManagerInterstitialAd.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m606x3cbd225c();
                    }
                });
            }

            /* renamed from: lambda$onAdDismissedFullScreenContent$2$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1$1, reason: not valid java name */
            public /* synthetic */ void m606x3cbd225c() {
                if (UnityAdManagerInterstitialAd.this.callback != null) {
                    UnityAdManagerInterstitialAd.this.callback.onAdDismissedFullScreenContent();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
                UnityAdManagerInterstitialAd.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$1$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m608x2d85aaf1();
                    }
                });
            }

            /* renamed from: lambda$onAdImpression$3$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1$1, reason: not valid java name */
            public /* synthetic */ void m608x2d85aaf1() {
                if (UnityAdManagerInterstitialAd.this.callback != null) {
                    UnityAdManagerInterstitialAd.this.callback.onAdImpression();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
                UnityAdManagerInterstitialAd.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m605x12f6b472();
                    }
                });
            }

            /* renamed from: lambda$onAdClicked$4$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1$1, reason: not valid java name */
            public /* synthetic */ void m605x12f6b472() {
                if (UnityAdManagerInterstitialAd.this.callback != null) {
                    UnityAdManagerInterstitialAd.this.callback.onAdClicked();
                }
            }
        }

        /* renamed from: lambda$onAdLoaded$4$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1, reason: not valid java name */
        public /* synthetic */ void m604x5a854921() {
            if (UnityAdManagerInterstitialAd.this.callback != null) {
                UnityAdManagerInterstitialAd.this.callback.onInterstitialAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError error) {
            UnityAdManagerInterstitialAd.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m599x55bfcabb(error);
                }
            });
        }

        /* renamed from: lambda$onAdFailedToLoad$5$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1, reason: not valid java name */
        public /* synthetic */ void m599x55bfcabb(LoadAdError loadAdError) {
            if (UnityAdManagerInterstitialAd.this.callback != null) {
                UnityAdManagerInterstitialAd.this.callback.onInterstitialAdFailedToLoad(loadAdError);
            }
        }
    }

    public String getAdUnitId() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.adManagerInterstitialAd;
        if (adManagerInterstitialAd == null) {
            return null;
        }
        return adManagerInterstitialAd.getAdUnitId();
    }

    public ResponseInfo getResponseInfo() {
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m596xc03c3f35();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (ResponseInfo) futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Unable to check Ad Manager interstitial response info: %s", e.getLocalizedMessage()));
            return null;
        }
    }

    /* renamed from: lambda$getResponseInfo$1$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd, reason: not valid java name */
    public /* synthetic */ ResponseInfo m596xc03c3f35() throws Exception {
        return this.adManagerInterstitialAd.getResponseInfo();
    }

    public void show() {
        if (this.adManagerInterstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show Ad Manager interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m598xc74915c8();
                }
            });
        }
    }

    /* renamed from: lambda$show$2$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd, reason: not valid java name */
    public /* synthetic */ void m598xc74915c8() {
        this.adManagerInterstitialAd.show(this.activity);
    }
}
