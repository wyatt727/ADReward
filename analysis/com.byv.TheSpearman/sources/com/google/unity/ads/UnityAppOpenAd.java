package com.google.unity.ads;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes4.dex */
public class UnityAppOpenAd {
    private final Activity activity;
    private AppOpenAd appOpenAd;
    private final UnityAppOpenAdCallback callback;

    public void destroy() {
    }

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    public void loadAd(final String adUnitId, final AdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m563lambda$loadAd$0$comgoogleunityadsUnityAppOpenAd(adUnitId, request);
            }
        });
    }

    /* renamed from: lambda$loadAd$0$com-google-unity-ads-UnityAppOpenAd, reason: not valid java name */
    public /* synthetic */ void m563lambda$loadAd$0$comgoogleunityadsUnityAppOpenAd(String str, AdRequest adRequest) {
        AppOpenAd.load(this.activity, str, adRequest, new AnonymousClass1());
    }

    /* renamed from: com.google.unity.ads.UnityAppOpenAd$1, reason: invalid class name */
    class AnonymousClass1 extends AppOpenAd.AppOpenAdLoadCallback {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(AppOpenAd ad) {
            UnityAppOpenAd.this.appOpenAd = ad;
            UnityAppOpenAd.this.appOpenAd.setOnPaidEventListener(new C01911());
            UnityAppOpenAd.this.appOpenAd.setFullScreenContentCallback(new AnonymousClass2());
            UnityAppOpenAd.this.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m565lambda$onAdLoaded$0$comgoogleunityadsUnityAppOpenAd$1();
                }
            });
        }

        /* renamed from: com.google.unity.ads.UnityAppOpenAd$1$1, reason: invalid class name and collision with other inner class name */
        class C01911 implements OnPaidEventListener {
            C01911() {
            }

            @Override // com.google.android.gms.ads.OnPaidEventListener
            public void onPaidEvent(final AdValue adValue) {
                UnityAppOpenAd.this.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m566lambda$onPaidEvent$0$comgoogleunityadsUnityAppOpenAd$1$1(adValue);
                    }
                });
            }

            /* renamed from: lambda$onPaidEvent$0$com-google-unity-ads-UnityAppOpenAd$1$1, reason: not valid java name */
            public /* synthetic */ void m566lambda$onPaidEvent$0$comgoogleunityadsUnityAppOpenAd$1$1(AdValue adValue) {
                if (UnityAppOpenAd.this.callback != null) {
                    UnityAppOpenAd.this.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
                }
            }
        }

        /* renamed from: com.google.unity.ads.UnityAppOpenAd$1$2, reason: invalid class name */
        class AnonymousClass2 extends FullScreenContentCallback {
            AnonymousClass2() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(final AdError error) {
                UnityAppOpenAd.this.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$2$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m569xeb82e5e3(error);
                    }
                });
            }

            /* renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-UnityAppOpenAd$1$2, reason: not valid java name */
            public /* synthetic */ void m569xeb82e5e3(AdError adError) {
                if (UnityAppOpenAd.this.callback != null) {
                    UnityAppOpenAd.this.callback.onAdFailedToShowFullScreenContent(adError);
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                UnityAppOpenAd.this.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$2$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m571xef25039d();
                    }
                });
            }

            /* renamed from: lambda$onAdShowedFullScreenContent$1$com-google-unity-ads-UnityAppOpenAd$1$2, reason: not valid java name */
            public /* synthetic */ void m571xef25039d() {
                if (UnityAppOpenAd.this.callback != null) {
                    UnityAppOpenAd.this.callback.onAdShowedFullScreenContent();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                UnityAppOpenAd.this.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m568xe1cd9d4f();
                    }
                });
            }

            /* renamed from: lambda$onAdDismissedFullScreenContent$2$com-google-unity-ads-UnityAppOpenAd$1$2, reason: not valid java name */
            public /* synthetic */ void m568xe1cd9d4f() {
                if (UnityAppOpenAd.this.callback != null) {
                    UnityAppOpenAd.this.callback.onAdDismissedFullScreenContent();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
                UnityAppOpenAd.this.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m570lambda$onAdImpression$3$comgoogleunityadsUnityAppOpenAd$1$2();
                    }
                });
            }

            /* renamed from: lambda$onAdImpression$3$com-google-unity-ads-UnityAppOpenAd$1$2, reason: not valid java name */
            public /* synthetic */ void m570lambda$onAdImpression$3$comgoogleunityadsUnityAppOpenAd$1$2() {
                if (UnityAppOpenAd.this.callback != null) {
                    UnityAppOpenAd.this.callback.onAdImpression();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
                UnityAppOpenAd.this.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m567lambda$onAdClicked$4$comgoogleunityadsUnityAppOpenAd$1$2();
                    }
                });
            }

            /* renamed from: lambda$onAdClicked$4$com-google-unity-ads-UnityAppOpenAd$1$2, reason: not valid java name */
            public /* synthetic */ void m567lambda$onAdClicked$4$comgoogleunityadsUnityAppOpenAd$1$2() {
                if (UnityAppOpenAd.this.callback != null) {
                    UnityAppOpenAd.this.callback.onAdClicked();
                }
            }
        }

        /* renamed from: lambda$onAdLoaded$0$com-google-unity-ads-UnityAppOpenAd$1, reason: not valid java name */
        public /* synthetic */ void m565lambda$onAdLoaded$0$comgoogleunityadsUnityAppOpenAd$1() {
            if (UnityAppOpenAd.this.callback != null) {
                UnityAppOpenAd.this.callback.onAppOpenAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError error) {
            UnityAppOpenAd.this.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m564lambda$onAdFailedToLoad$1$comgoogleunityadsUnityAppOpenAd$1(error);
                }
            });
        }

        /* renamed from: lambda$onAdFailedToLoad$1$com-google-unity-ads-UnityAppOpenAd$1, reason: not valid java name */
        public /* synthetic */ void m564lambda$onAdFailedToLoad$1$comgoogleunityadsUnityAppOpenAd$1(LoadAdError loadAdError) {
            if (UnityAppOpenAd.this.callback != null) {
                UnityAppOpenAd.this.callback.onAppOpenAdFailedToLoad(loadAdError);
            }
        }
    }

    public void show() {
        if (this.appOpenAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show app open ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd.2
                @Override // java.lang.Runnable
                public void run() {
                    UnityAppOpenAd.this.appOpenAd.show(UnityAppOpenAd.this.activity);
                }
            });
        }
    }

    public String getAdUnitId() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return null;
        }
        return appOpenAd.getAdUnitId();
    }

    public ResponseInfo getResponseInfo() {
        if (this.appOpenAd == null) {
            return null;
        }
        FutureTask futureTask = new FutureTask(new Callable<ResponseInfo>() { // from class: com.google.unity.ads.UnityAppOpenAd.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ResponseInfo call() {
                return UnityAppOpenAd.this.appOpenAd.getResponseInfo();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (ResponseInfo) futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Unable to check unity app open ad response info: %s", e.getLocalizedMessage()));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnNewThread(final Runnable action) {
        new Thread(action).start();
    }
}
