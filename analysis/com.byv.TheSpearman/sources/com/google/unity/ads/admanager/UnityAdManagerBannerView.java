package com.google.unity.ads.admanager;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.unity.ads.Banner;
import com.google.unity.ads.PluginUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public class UnityAdManagerBannerView extends Banner {
    private final ExecutorService service;

    public UnityAdManagerBannerView(Activity activity, UnityAdManagerAdListener listener) {
        this.unityPlayerActivity = activity;
        this.unityListener = listener;
        this.service = Executors.newSingleThreadExecutor();
    }

    @Override // com.google.unity.ads.Banner
    protected void createAdView(final String publisherId, final AdSize adSize) {
        this.adView = new AdManagerAdView(this.unityPlayerActivity);
        this.adView.setBackgroundColor(0);
        this.adView.setAdUnitId(publisherId);
        this.adView.setAdSize(adSize);
        this.adView.setVisibility(8);
        this.adView.setDescendantFocusability(Opcodes.ASM6);
        this.unityPlayerActivity.addContentView(this.adView, getLayoutParams());
        this.adView.setAdListener(new AnonymousClass1());
        this.adView.setOnPaidEventListener(new AnonymousClass2());
        ((AdManagerAdView) this.adView).setAppEventListener(new AnonymousClass3());
        setLayoutChangeListener();
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerBannerView$1, reason: invalid class name */
    class AnonymousClass1 extends AdListener {
        AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            if (!UnityAdManagerBannerView.this.hidden) {
                UnityAdManagerBannerView.this.show();
            }
            UnityAdManagerBannerView.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m588x9d5d5b9f();
                }
            });
        }

        /* renamed from: lambda$onAdLoaded$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        public /* synthetic */ void m588x9d5d5b9f() {
            if (UnityAdManagerBannerView.this.unityListener != null) {
                UnityAdManagerBannerView.this.unityListener.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(final LoadAdError error) {
            UnityAdManagerBannerView.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m586x4afcba39(error);
                }
            });
        }

        /* renamed from: lambda$onAdFailedToLoad$1$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        public /* synthetic */ void m586x4afcba39(LoadAdError loadAdError) {
            if (UnityAdManagerBannerView.this.unityListener != null) {
                UnityAdManagerBannerView.this.unityListener.onAdFailedToLoad(loadAdError);
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            UnityAdManagerBannerView.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m589xc8363f85();
                }
            });
        }

        /* renamed from: lambda$onAdOpened$2$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        public /* synthetic */ void m589xc8363f85() {
            if (UnityAdManagerBannerView.this.unityListener != null) {
                UnityAdManagerBannerView.this.unityListener.onAdOpened();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            UnityAdManagerBannerView.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m585x594b86c9();
                }
            });
        }

        /* renamed from: lambda$onAdClosed$3$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        public /* synthetic */ void m585x594b86c9() {
            if (UnityAdManagerBannerView.this.unityListener != null) {
                UnityAdManagerBannerView.this.unityListener.onAdClosed();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            UnityAdManagerBannerView.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m587xcfa49b27();
                }
            });
        }

        /* renamed from: lambda$onAdImpression$4$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        public /* synthetic */ void m587xcfa49b27() {
            if (UnityAdManagerBannerView.this.unityListener != null) {
                UnityAdManagerBannerView.this.unityListener.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
        public void onAdClicked() {
            UnityAdManagerBannerView.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m584x3af71968();
                }
            });
        }

        /* renamed from: lambda$onAdClicked$5$com-google-unity-ads-admanager-UnityAdManagerBannerView$1, reason: not valid java name */
        public /* synthetic */ void m584x3af71968() {
            if (UnityAdManagerBannerView.this.unityListener != null) {
                UnityAdManagerBannerView.this.unityListener.onAdClicked();
            }
        }
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerBannerView$2, reason: invalid class name */
    class AnonymousClass2 implements OnPaidEventListener {
        AnonymousClass2() {
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            UnityAdManagerBannerView.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m590x1d98ef4e(adValue);
                }
            });
        }

        /* renamed from: lambda$onPaidEvent$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$2, reason: not valid java name */
        public /* synthetic */ void m590x1d98ef4e(AdValue adValue) {
            if (UnityAdManagerBannerView.this.unityListener != null) {
                UnityAdManagerBannerView.this.unityListener.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerBannerView$3, reason: invalid class name */
    class AnonymousClass3 implements AppEventListener {
        AnonymousClass3() {
        }

        @Override // com.google.android.gms.ads.admanager.AppEventListener
        public void onAppEvent(final String name, final String data) {
            UnityAdManagerBannerView.this.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m591x46c56712(name, data);
                }
            });
        }

        /* renamed from: lambda$onAppEvent$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$3, reason: not valid java name */
        public /* synthetic */ void m591x46c56712(String str, String str2) {
            if (UnityAdManagerBannerView.this.unityListener != null) {
                ((UnityAdManagerAdListener) UnityAdManagerBannerView.this.unityListener).onAppEvent(str, str2);
            }
        }
    }

    /* renamed from: lambda$loadAd$0$com-google-unity-ads-admanager-UnityAdManagerBannerView, reason: not valid java name */
    public /* synthetic */ void m582x49beb234(AdManagerAdRequest adManagerAdRequest) {
        ((AdManagerAdView) this.adView).loadAd(adManagerAdRequest);
    }

    public void loadAd(final AdManagerAdRequest request) {
        this.unityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m582x49beb234(request);
            }
        });
    }

    public List<AdSize> getAdSizes() {
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m581x7749a305();
            }
        });
        this.unityPlayerActivity.runOnUiThread(futureTask);
        AdSize[] adSizeArr = new AdSize[0];
        try {
            adSizeArr = (AdSize[]) futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Failed to get ad sizes: %s", e.getLocalizedMessage()));
        }
        return Arrays.asList(adSizeArr);
    }

    /* renamed from: lambda$getAdSizes$1$com-google-unity-ads-admanager-UnityAdManagerBannerView, reason: not valid java name */
    public /* synthetic */ AdSize[] m581x7749a305() throws Exception {
        return ((AdManagerAdView) this.adView).getAdSizes();
    }

    public void setAdSizes(final List<AdSize> adSizes) {
        if (adSizes == null || adSizes.size() < 1) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.unityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerBannerView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m583xf205807a(adSizes);
            }
        });
    }

    /* renamed from: lambda$setAdSizes$2$com-google-unity-ads-admanager-UnityAdManagerBannerView, reason: not valid java name */
    public /* synthetic */ void m583xf205807a(List list) {
        ((AdManagerAdView) this.adView).setAdSizes((AdSize[]) list.toArray(new AdSize[list.size()]));
    }
}
