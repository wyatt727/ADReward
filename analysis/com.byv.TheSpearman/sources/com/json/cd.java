package com.json;

import android.webkit.JavascriptInterface;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.impressionData.ImpressionData;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010*\u001a\u00020\u001f\u0012\u0006\u0010+\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020\"¢\u0006\u0004\b-\u0010.J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0002J \u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\bH\u0007J\b\u0010\u0010\u001a\u00020\bH\u0007J \u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007J\b\u0010\u0012\u001a\u00020\bH\u0007J\b\u0010\u0013\u001a\u00020\bH\u0007J8\u0010\u0018\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\b\u0010\u001c\u001a\u00020\bH\u0007J\b\u0010\u001d\u001a\u00020\bH\u0007J\b\u0010\u001e\u001a\u00020\bH\u0007R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006/"}, d2 = {"Lcom/ironsource/cd;", "", "", "callbackName", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "", "args", "", "a", ImpressionData.IMPRESSION_DATA_KEY_AD_NETWORK, "", "isBidding", "isTest", "loadInterstitialAd", "isInterstitialReady", "showInterstitialAd", "loadRewardedVideoAd", "isRewardedVideoReady", "showRewardedVideoAd", "description", "", "width", "height", "loadBannerAd", "", "marginPercentageFromTop", "addBannerAdToScreen", "destroyBannerAd", "onDataLoaded", "closeTestSuite", "Lcom/ironsource/yc;", "Lcom/ironsource/yc;", "mAdsManager", "Lcom/ironsource/dd;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/dd;", "mJavaScriptEvaluator", "Lcom/ironsource/y7;", "c", "Lcom/ironsource/y7;", "mUILifeCycleListener", "adsManager", "uiLifeCycleListener", "javaScriptEvaluator", "<init>", "(Lcom/ironsource/yc;Lcom/ironsource/y7;Lcom/ironsource/dd;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class cd {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yc mAdsManager;

    /* renamed from: b, reason: from kotlin metadata */
    private final dd mJavaScriptEvaluator;

    /* renamed from: c, reason: from kotlin metadata */
    private final y7 mUILifeCycleListener;

    public cd(yc adsManager, y7 uiLifeCycleListener, dd javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(adsManager, "adsManager");
        Intrinsics.checkNotNullParameter(uiLifeCycleListener, "uiLifeCycleListener");
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.mAdsManager = adsManager;
        this.mJavaScriptEvaluator = javaScriptEvaluator;
        this.mUILifeCycleListener = uiLifeCycleListener;
    }

    private final void a(String callbackName, IronSource.AD_UNIT adUnit, List<? extends Object> args) {
        this.mJavaScriptEvaluator.a(callbackName, adUnit, args);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double marginPercentageFromTop) {
        this.mAdsManager.a(marginPercentageFromTop);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.mUILifeCycleListener.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.mAdsManager.a();
    }

    @JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", IronSource.AD_UNIT.INTERSTITIAL, kd.f1863a.a(Boolean.valueOf(this.mAdsManager.c())));
    }

    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", IronSource.AD_UNIT.REWARDED_VIDEO, kd.f1863a.a(Boolean.valueOf(this.mAdsManager.d())));
    }

    @JavascriptInterface
    public final void loadBannerAd(String adNetwork, boolean isBidding, boolean isTest, String description, int width, int height) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(description, "description");
        this.mAdsManager.a(new ed(adNetwork, isBidding, Boolean.valueOf(isTest)), description, width, height);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String adNetwork, boolean isBidding, boolean isTest) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.mAdsManager.a(new ed(adNetwork, isBidding, Boolean.valueOf(isTest)));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String adNetwork, boolean isBidding, boolean isTest) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.mAdsManager.b(new ed(adNetwork, isBidding, Boolean.valueOf(isTest)));
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.mUILifeCycleListener.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.mAdsManager.e();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.mAdsManager.f();
    }
}
