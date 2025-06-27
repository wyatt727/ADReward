package com.json;

import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.sdk.LevelPlayBannerListener;
import com.json.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J(\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ironsource/hd;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "", "callbackName", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "", "args", "a", "d", "Lcom/ironsource/dd;", "Lcom/ironsource/dd;", "mJavaScriptEvaluator", "javaScriptEvaluator", "<init>", "(Lcom/ironsource/dd;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class hd {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dd mJavaScriptEvaluator;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, d2 = {"com/ironsource/hd$a", "Lcom/ironsource/mediationsdk/sdk/LevelPlayInterstitialListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "", id.f1816a, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", id.b, id.c, id.d, id.e, id.f, id.g, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements LevelPlayInterstitialListener {
        a() {
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClicked(AdInfo adInfo) {
            hd.this.a(id.f, IronSource.AD_UNIT.INTERSTITIAL, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClosed(AdInfo adInfo) {
            hd.this.a(id.g, IronSource.AD_UNIT.INTERSTITIAL, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdLoadFailed(IronSourceError error) {
            hd hdVar = hd.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            kd kdVar = kd.f1863a;
            Object[] objArr = new Object[1];
            objArr[0] = error != null ? error.getErrorMessage() : null;
            hdVar.a(id.b, ad_unit, kdVar.a(objArr));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdOpened(AdInfo adInfo) {
            hd.this.a(id.c, IronSource.AD_UNIT.INTERSTITIAL, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdReady(AdInfo adInfo) {
            hd.this.a(id.f1816a, IronSource.AD_UNIT.INTERSTITIAL, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowFailed(IronSourceError error, AdInfo adInfo) {
            hd hdVar = hd.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            kd kdVar = kd.f1863a;
            Object[] objArr = new Object[2];
            objArr[0] = error != null ? error.getErrorMessage() : null;
            objArr[1] = adInfo;
            hdVar.a(id.e, ad_unit, kdVar.a(objArr));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowSucceeded(AdInfo adInfo) {
            hd.this.a(id.d, IronSource.AD_UNIT.INTERSTITIAL, kd.f1863a.a(adInfo));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001c\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001c\u0010\u0011\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0013"}, d2 = {"com/ironsource/hd$b", "Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoManualListener;", "Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "", id.f1816a, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", id.b, id.h, id.n, id.c, id.e, "Lcom/ironsource/mediationsdk/model/Placement;", "placement", id.f, id.i, id.g, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements LevelPlayRewardedVideoManualListener, LevelPlayRewardedVideoListener {
        b() {
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdAvailable(AdInfo adInfo) {
            hd.this.a(id.h, IronSource.AD_UNIT.REWARDED_VIDEO, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClicked(Placement placement, AdInfo adInfo) {
            hd.this.a(id.f, IronSource.AD_UNIT.REWARDED_VIDEO, kd.f1863a.a(gd.f1795a.a(placement), adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClosed(AdInfo adInfo) {
            hd.this.a(id.g, IronSource.AD_UNIT.REWARDED_VIDEO, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdLoadFailed(IronSourceError error) {
            hd hdVar = hd.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            kd kdVar = kd.f1863a;
            Object[] objArr = new Object[1];
            objArr[0] = error != null ? error.getErrorMessage() : null;
            hdVar.a(id.b, ad_unit, kdVar.a(objArr));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdOpened(AdInfo adInfo) {
            hd.this.a(id.c, IronSource.AD_UNIT.REWARDED_VIDEO, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdReady(AdInfo adInfo) {
            hd.this.a(id.f1816a, IronSource.AD_UNIT.REWARDED_VIDEO, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdRewarded(Placement placement, AdInfo adInfo) {
            hd.this.a(id.i, IronSource.AD_UNIT.REWARDED_VIDEO, kd.f1863a.a(gd.f1795a.a(placement), adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdShowFailed(IronSourceError error, AdInfo adInfo) {
            hd hdVar = hd.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            kd kdVar = kd.f1863a;
            Object[] objArr = new Object[2];
            objArr[0] = error != null ? error.getErrorMessage() : null;
            objArr[1] = adInfo;
            hdVar.a(id.e, ad_unit, kdVar.a(objArr));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdUnavailable() {
            hd.this.a(id.n, IronSource.AD_UNIT.REWARDED_VIDEO, kd.f1863a.a(new Object[0]));
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, d2 = {"com/ironsource/hd$c", "Lcom/ironsource/mediationsdk/sdk/LevelPlayBannerListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "", id.j, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", id.b, id.f, id.k, id.l, id.m, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements LevelPlayBannerListener {
        c() {
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdClicked(AdInfo adInfo) {
            hd.this.a(id.f, IronSource.AD_UNIT.BANNER, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLeftApplication(AdInfo adInfo) {
            hd.this.a(id.k, IronSource.AD_UNIT.BANNER, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoadFailed(IronSourceError error) {
            hd hdVar = hd.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            kd kdVar = kd.f1863a;
            Object[] objArr = new Object[1];
            objArr[0] = error != null ? error.getErrorMessage() : null;
            hdVar.a(id.b, ad_unit, kdVar.a(objArr));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoaded(AdInfo adInfo) {
            hd.this.a(id.j, IronSource.AD_UNIT.BANNER, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenDismissed(AdInfo adInfo) {
            hd.this.a(id.m, IronSource.AD_UNIT.BANNER, kd.f1863a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenPresented(AdInfo adInfo) {
            hd.this.a(id.l, IronSource.AD_UNIT.BANNER, kd.f1863a.a(adInfo));
        }
    }

    public hd(dd javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.mJavaScriptEvaluator = javaScriptEvaluator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String callbackName, IronSource.AD_UNIT adUnit, List<? extends Object> args) {
        this.mJavaScriptEvaluator.a(callbackName, adUnit, args);
    }

    private final void b() {
        gd gdVar = gd.f1795a;
        gdVar.a((LevelPlayInterstitialListener) null);
        gdVar.a((LevelPlayRewardedVideoBaseListener) null);
        gdVar.a((LevelPlayBannerListener) null);
    }

    private final void c() {
        gd.f1795a.i();
    }

    public final void a() {
        b();
        c();
    }

    public final void d() {
        gd gdVar = gd.f1795a;
        gdVar.a(new a());
        gdVar.a(new b());
        gdVar.a(new c());
    }
}
