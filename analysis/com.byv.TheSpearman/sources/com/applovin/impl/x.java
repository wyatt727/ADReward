package com.applovin.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.o0;
import com.applovin.impl.r;
import com.applovin.impl.y;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x extends ne implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, o0.a {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f1146a;
    private z b;
    private kr c;
    private y d;
    private MaxAdView f;
    private MaxInterstitialAd g;
    private MaxAppOpenAd h;
    private MaxRewardedInterstitialAd i;
    private MaxRewardedAd j;
    private MaxNativeAdView k;
    private MaxNativeAdLoader l;
    private MaxAd m;
    private d0 n;
    private List o;
    private ListView p;
    private View q;
    private AdControlButton r;
    private TextView s;
    private o0 t;

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        zp.a(com.json.id.f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        zp.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        zp.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        zp.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        zp.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        zp.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        zp.a("onRewardedVideoCompleted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        zp.a("onRewardedVideoStarted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        zp.a("onUserRewarded", maxAd, this);
    }

    public void initialize(final z zVar, final a0 a0Var, kr krVar, final com.applovin.impl.sdk.k kVar) {
        List listA;
        this.f1146a = kVar;
        this.b = zVar;
        this.c = krVar;
        this.o = kVar.n0().b();
        y yVar = new y(zVar, a0Var, krVar, this);
        this.d = yVar;
        yVar.a(new zb.a() { // from class: com.applovin.impl.x$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.zb.a
            public final void a(hb hbVar, yb ybVar) {
                this.f$0.a(kVar, zVar, a0Var, hbVar, ybVar);
            }
        });
        b();
        if (zVar.f().f()) {
            if ((krVar != null && !krVar.b().d().A()) || (listA = kVar.P().a(zVar.c())) == null || listA.isEmpty()) {
                return;
            }
            this.t = new o0(listA, zVar.a(), this);
        }
    }

    @Override // com.applovin.impl.ne
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f1146a;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.d.k());
        this.p = (ListView) findViewById(R.id.listView);
        this.q = findViewById(R.id.ad_presenter_view);
        this.r = (AdControlButton) findViewById(R.id.ad_control_button);
        this.s = (TextView) findViewById(R.id.status_textview);
        this.p.setAdapter((ListAdapter) this.d);
        this.s.setText(a());
        this.s.setTypeface(Typeface.DEFAULT_BOLD);
        this.r.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.q.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        if (this.c != null) {
            this.f1146a.n0().a(this.o);
        }
        MaxAdView maxAdView = this.f;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.g;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.h;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.i;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.j;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.l;
        if (maxNativeAdLoader == null || (maxAd = this.m) == null) {
            return;
        }
        maxNativeAdLoader.destroy(maxAd);
    }

    class a extends MaxNativeAdListener {
        a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (x.this.m != null) {
                x.this.l.destroy(x.this.m);
            }
            x.this.m = maxAd;
            if (maxNativeAdView != null) {
                x.this.k = maxNativeAdView;
            } else {
                x xVar = x.this;
                com.applovin.impl.sdk.k unused = x.this.f1146a;
                xVar.k = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, com.applovin.impl.sdk.k.k());
                x.this.l.render(x.this.k, maxAd);
            }
            x.this.onAdLoaded(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            x.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            x.this.onAdClicked(maxAd);
        }
    }

    private void b() {
        String strC = this.b.c();
        if (this.b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.b.a(), this.f1146a.v0(), this);
            this.f = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.f.setExtraParameter("disable_precache", com.json.mediationsdk.metadata.a.g);
            this.f.setExtraParameter("allow_pause_auto_refresh_immediately", com.json.mediationsdk.metadata.a.g);
            this.f.stopAutoRefresh();
            this.f.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC, this.f1146a.v0(), this);
            this.g = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.g.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC, this.f1146a.v0());
            this.h = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.h.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.a()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(strC, this.f1146a.v0(), this);
            this.i = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.i.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC, this.f1146a.v0(), this);
            this.j = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.j.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.b.a()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC, this.f1146a.v0(), this);
            this.l = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.l.setNativeAdListener(new a());
            this.l.setRevenueListener(this);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f1146a.n0().c()) {
            zp.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.d.j() != this.b.f()) {
            zp.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            o0 o0Var = this.t;
            if (o0Var != null) {
                o0Var.a();
                return;
            } else {
                a(maxAdFormatA);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatA.isAdViewAd() && maxAdFormatA != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(maxAdFormatA);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.s.setText(maxAd.getNetworkName() + " ad loaded");
        this.r.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            a(this.k, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.r.setControlState(AdControlButton.b.LOAD);
        this.s.setText("");
        zp.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.impl.o0.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.l.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.impl.o0.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.l.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(this.f, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            this.g.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            this.h.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.a()) {
            this.i.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.b.a()) {
            this.j.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            a(this.k, MaxAdFormat.MREC.getSize());
        }
    }

    private String a() {
        return this.f1146a.n0().c() ? "Not supported while Test Mode is enabled" : this.d.j() != this.b.f() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(yb ybVar, z zVar, a0 a0Var, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(zVar, a0Var, ((y.b) ybVar).v(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.k kVar, final z zVar, final a0 a0Var, hb hbVar, final yb ybVar) {
        if (ybVar instanceof y.b) {
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new r.b() { // from class: com.applovin.impl.x$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    x.a(ybVar, zVar, a0Var, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.r.setControlState(AdControlButton.b.LOAD);
        this.s.setText("");
        if (204 == maxError.getCode()) {
            zp.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        zp.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.n = null;
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.c != null) {
            this.f1146a.n0().a(this.c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f.setPlacement("[Mediation Debugger Live Ad]");
            this.f.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            this.g.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            this.h.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.a()) {
            this.i.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.b.a()) {
            this.j.loadAd();
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            this.l.setPlacement("[Mediation Debugger Live Ad]");
            this.l.loadAd();
        } else {
            zp.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.n != null) {
            return;
        }
        d0 d0Var = new d0(viewGroup, size, this);
        this.n = d0Var;
        d0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.x$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.a(dialogInterface);
            }
        });
        this.n.show();
    }
}
