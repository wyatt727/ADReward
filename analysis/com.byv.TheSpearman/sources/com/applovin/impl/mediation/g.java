package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.be;
import com.applovin.impl.de;
import com.applovin.impl.ke;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sm;
import com.applovin.impl.wj;
import com.applovin.impl.xl;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;

/* loaded from: classes.dex */
public class g {
    private final k b;
    private final t c;
    private final String d;
    private final ke e;
    private final String f;
    private MaxAdapter g;
    private String h;
    private be i;
    private View j;
    private MaxNativeAd k;
    private MaxNativeAdView l;
    private ViewGroup m;
    private MaxAdapterResponseParameters o;
    private final boolean s;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f690a = new Handler(Looper.getMainLooper());
    private final c n = new c(this, null);
    private final AtomicBoolean p = new AtomicBoolean(true);
    private final AtomicBoolean q = new AtomicBoolean(false);
    private final AtomicBoolean r = new AtomicBoolean(false);

    class a implements MaxSignalCollectionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f691a;

        a(e eVar) {
            this.f691a = eVar;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            g.this.a(str, this.f691a);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            g.this.a(new MaxErrorImpl(str), this.f691a);
        }
    }

    public interface b {
        void a(MaxError maxError);

        void onSignalCollected(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* renamed from: a, reason: collision with root package name */
        private MediationServiceImpl.b f692a;

        private c() {
        }

        private void b(String str, final Bundle bundle) {
            if (g.this.i.v().compareAndSet(false, true)) {
                a(str, this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        this.f$0.i(bundle);
                    }
                });
            }
        }

        private void c(String str, final Bundle bundle) {
            if (!g.this.i.v().get()) {
                g.this.r.set(true);
                a(str, this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda17
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        this.f$0.j(bundle);
                    }
                });
                return;
            }
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.b("MediationAdapterWrapper", g.this.f + ": blocking ad loaded callback for " + g.this.i + " since onAdHidden() has been called");
            }
            g.this.b.o().a(g.this.i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) throws JSONException {
            this.f692a.a(g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            this.f692a.onRewardedVideoStarted(g.this.i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) throws JSONException {
            this.f692a.a(g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) throws JSONException {
            this.f692a.a(g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) throws JSONException {
            this.f692a.c(g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) throws JSONException {
            this.f692a.e(g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) throws JSONException {
            if (g.this.q.compareAndSet(false, true)) {
                this.f692a.f(g.this.i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.k("MediationAdapterWrapper", g.this.f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.k("MediationAdapterWrapper", g.this.f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.k("MediationAdapterWrapper", g.this.f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            if (g.this.i.X()) {
                return;
            }
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.k("MediationAdapterWrapper", g.this.f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": native ad loaded with extra info: " + bundle);
            }
            g.this.k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.k("MediationAdapterWrapper", g.this.f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoCompleted() {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded video completed");
            }
            a("onRewardedAdVideoCompleted", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoStarted() {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded video started");
            }
            a("onRewardedAdVideoStarted", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.k("MediationAdapterWrapper", g.this.f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoCompleted() {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded interstitial completed");
            }
            a("onRewardedInterstitialAdVideoCompleted", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.d();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoStarted() {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded interstitial started");
            }
            a("onRewardedInterstitialAdVideoStarted", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        /* synthetic */ c(g gVar, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            this.f692a.onRewardedVideoCompleted(g.this.i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) throws JSONException {
            this.f692a.a(g.this.i, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f$0.a(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f$0.a();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.k("MediationAdapterWrapper", g.this.f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            if (g.this.i.X()) {
                return;
            }
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(final Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f$0.b(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": adview ad loaded with extra info: " + bundle);
            }
            g.this.j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(final Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f$0.c(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.k("MediationAdapterWrapper", g.this.f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f$0.d(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.k("MediationAdapterWrapper", g.this.f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(final Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f$0.e(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f$0.f(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.k("MediationAdapterWrapper", g.this.f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked(final Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded interstitial ad clicked with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdClicked", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f$0.g(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.k("MediationAdapterWrapper", g.this.f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded interstitial ad hidden with extra info: " + bundle);
            }
            b("onRewardedInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            t unused = g.this.c;
            if (t.a()) {
                g.this.c.d("MediationAdapterWrapper", g.this.f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            }
            c("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(final MaxReward maxReward, final Bundle bundle) {
            if (g.this.i instanceof de) {
                final de deVar = (de) g.this.i;
                if (deVar.m0().compareAndSet(false, true)) {
                    t unused = g.this.c;
                    if (t.a()) {
                        g.this.c.d("MediationAdapterWrapper", g.this.f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            this.f$0.a(deVar, maxReward, bundle);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            this.f692a.onRewardedVideoCompleted(g.this.i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) throws JSONException {
            this.f692a.d(g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f692a.onRewardedVideoStarted(g.this.i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) throws JSONException {
            this.f692a.a(g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(de deVar, MaxReward maxReward, Bundle bundle) throws JSONException {
            this.f692a.a(deVar, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f692a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            if (g.this.i.v().get()) {
                t unused = g.this.c;
                if (t.a()) {
                    g.this.c.b("MediationAdapterWrapper", g.this.f + ": blocking ad load failed callback for " + g.this.i + " since onAdHidden() has been called");
                }
                g.this.b.o().a(g.this.i, str);
                return;
            }
            a(str, this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(maxError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (g.this.q.compareAndSet(false, true)) {
                this.f692a.onAdLoadFailed(g.this.h, maxError);
            }
        }

        private void a(String str, final Bundle bundle) {
            if (g.this.i.v().get()) {
                t unused = g.this.c;
                if (t.a()) {
                    g.this.c.b("MediationAdapterWrapper", g.this.f + ": blocking ad displayed callback for " + g.this.i + " since onAdHidden() has been called");
                }
                g.this.b.o().a(g.this.i, str);
                return;
            }
            if (g.this.i.t().compareAndSet(false, true)) {
                a(str, this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        this.f$0.h(bundle);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError, final Bundle bundle) {
            if (g.this.i.v().get()) {
                t unused = g.this.c;
                if (t.a()) {
                    g.this.c.b("MediationAdapterWrapper", g.this.f + ": blocking ad display failed callback for " + g.this.i + " since onAdHidden() has been called");
                }
                g.this.b.o().a(g.this.i, str);
                return;
            }
            a(str, this.f692a, new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f$0.a(maxError, bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) throws JSONException {
            this.f692a.a(g.this.i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) throws JSONException {
            this.f692a.a(g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() throws JSONException {
            this.f692a.onAdCollapsed(g.this.i);
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            g.this.f690a.post(new Runnable() { // from class: com.applovin.impl.mediation.g$c$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(runnable, maxAdListener, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                t.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + (maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                g.this.b.B().a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", g.this.e.b()));
            }
        }
    }

    private class f extends xl {
        private final WeakReference h;

        /* synthetic */ f(g gVar, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.q.get()) {
                return;
            }
            if (g.this.i.Y()) {
                if (t.a()) {
                    this.c.a(this.b, g.this.f + " is timing out, considering JS Tag ad loaded: " + g.this.i);
                }
                b(g.this.i);
                return;
            }
            if (t.a()) {
                this.c.b(this.b, g.this.f + " is timing out " + g.this.i + "...");
            }
            b(g.this.i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            c cVar = (c) this.h.get();
            if (cVar != null) {
                cVar.a(this.b, maxErrorImpl);
            }
        }

        private f() {
            super("TaskTimeoutMediatedAd", g.this.b);
            this.h = new WeakReference(g.this.n);
        }

        private void b(be beVar) {
            if (beVar != null) {
                this.f1179a.U().a(beVar);
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$g, reason: collision with other inner class name */
    private class C0035g extends xl {
        private final e h;

        /* synthetic */ C0035g(g gVar, e eVar, a aVar) {
            this(eVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.h.c.get()) {
                return;
            }
            if (t.a()) {
                this.c.b(this.b, g.this.f + " is timing out " + this.h.f694a + "...");
            }
            g.this.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + g.this.f + ") timed out"), this.h);
        }

        private C0035g(e eVar) {
            super("TaskTimeoutSignalCollection", g.this.b);
            this.h = eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        this.g.onDestroy();
        this.g = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    public boolean k() {
        return this.p.get();
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f + "'" + AbstractJsonLexerKt.END_OBJ;
    }

    public View d() {
        return this.j;
    }

    public MaxNativeAd e() {
        return this.k;
    }

    public MaxNativeAdView f() {
        return this.l;
    }

    public ViewGroup h() {
        return this.m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            t.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.d, th);
            this.b.B().a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("sdk_version");
            this.b.O().a(this.e.b(), "sdk_version", this.i);
            return null;
        }
    }

    public boolean j() {
        return this.q.get() && this.r.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedInterstitialAdapter) this.g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.g).loadNativeAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Activity activity) {
        ((MaxInterstitialAdapter) this.g).showInterstitialAd(this.o, activity, this.n);
    }

    public String g() {
        return this.d;
    }

    g(ke keVar, MaxAdapter maxAdapter, boolean z, k kVar) {
        if (keVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (kVar != null) {
            this.d = keVar.c();
            this.g = maxAdapter;
            this.b = kVar;
            this.c = kVar.L();
            this.e = keVar;
            this.f = maxAdapter.getClass().getSimpleName();
            this.s = z;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public void c(final be beVar, final Activity activity) {
        Runnable runnable;
        if (b(beVar, activity)) {
            if (beVar.X()) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda16
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(beVar, activity);
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(activity);
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda13
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(activity);
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(activity);
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + beVar + ": " + beVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, beVar);
        }
    }

    public MediationServiceImpl.b c() {
        return this.n.f692a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.g).loadRewardedAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedInterstitialAdapter) this.g).showRewardedInterstitialAd(this.o, activity, this.n);
    }

    private boolean b(be beVar, Activity activity) {
        if (beVar != null) {
            if (beVar.z() == null) {
                t.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (beVar.z() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != beVar.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.p.get()) {
                    String str = "Mediation adapter '" + this.f + "' is disabled. Showing ads with this adapter is disabled.";
                    t.h("MediationAdapterWrapper", str);
                    this.n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException("Mediation adapter '" + this.f + "' does not have an ad loaded. Please load an ad first");
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxRewardedAdapter) this.g).showRewardedAd(this.o, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.g).showRewardedAd(this.o, viewGroup, lifecycle, activity, this.n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            t.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.d, th);
            this.b.B().a("MediationAdapterWrapper", "adapter_version", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("adapter_version");
            this.b.O().a(this.e.b(), "adapter_version", this.i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final wj wjVar, final Activity activity, b bVar) {
        if (bVar != null) {
            if (!this.p.get()) {
                t.h("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is disabled. Signal collection ads with this adapter is disabled.");
                bVar.a(new MaxErrorImpl("The adapter (" + this.f + ") is disabled"));
                return;
            }
            final e eVar = new e(wjVar, bVar);
            MaxAdapter maxAdapter = this.g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                b("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(wjVar, eVar, maxSignalProvider, maxAdapterSignalCollectionParameters, activity);
                    }
                });
                return;
            }
            a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, "The adapter (" + this.f + ") does not support signal collection"), eVar);
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(final Runnable runnable, be beVar) {
        a("show_ad", beVar.getFormat(), new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e {

        /* renamed from: a, reason: collision with root package name */
        private final wj f694a;
        private final b b;
        private final AtomicBoolean c = new AtomicBoolean();

        e(wj wjVar, b bVar) {
            this.f694a = wjVar;
            this.b = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d implements MaxAdapter.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        private final k f693a;
        private final ke b;
        private final long c;
        private final Runnable d;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f693a.N().a(this.b, SystemClock.elapsedRealtime() - this.c, initializationStatus, str);
            Runnable runnable = this.d;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(initializationStatus, str);
                }
            }, this.b.h());
        }

        public d(k kVar, ke keVar, long j, Runnable runnable) {
            this.f693a = kVar;
            this.b = keVar;
            this.c = j;
            this.d = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(wj wjVar, e eVar, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity) {
        a(wjVar, eVar);
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(eVar));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.d + " due to: " + th);
            t.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            a(maxErrorImpl, eVar);
            this.b.B().a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("collect_signal");
            this.b.O().a(this.e.b(), "collect_signal", this.i);
        }
        if (!eVar.c.get() && wjVar.m() == 0) {
            if (t.a()) {
                this.c.a("MediationAdapterWrapper", "Failing signal collection " + wjVar + " since it has 0 timeout");
            }
            a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + this.f + ") has 0 timeout"), eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(be beVar, Runnable runnable) {
        a(this.e, beVar);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.d + " due to: " + th;
            t.h("MediationAdapterWrapper", str);
            this.n.a("load_ad", new MaxErrorImpl(-1, str));
            this.b.B().a("MediationAdapterWrapper", "load_ad", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("load_ad");
            this.b.O().a(this.e.b(), "load_ad", this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(be beVar, Activity activity) {
        this.b.G().a((de) beVar, activity, this.n);
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final be beVar, final Activity activity, MediationServiceImpl.b bVar) {
        final Runnable runnable;
        if (beVar != null) {
            if (!this.p.get()) {
                String str2 = "Mediation adapter '" + this.f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                t.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.o = maxAdapterResponseParameters;
            this.n.a(bVar);
            final MaxAdFormat maxAdFormatH = beVar.X() ? beVar.H() : beVar.getFormat();
            if (maxAdFormatH == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (maxAdFormatH == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (maxAdFormatH == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (maxAdFormatH == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (maxAdFormatH == MaxAdFormat.NATIVE) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.e(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (maxAdFormatH.isAdViewAd()) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(maxAdapterResponseParameters, maxAdFormatH, activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to load " + beVar + ": " + beVar.getFormat() + " (" + beVar.H() + ") is not a supported ad format");
            }
            a("load_ad", maxAdFormatH, new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(beVar, runnable);
                }
            });
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(ke keVar, be beVar) {
        a(new f(this, null), keVar, beVar);
    }

    private void a(ke keVar, e eVar) {
        a(new C0035g(this, eVar, null), keVar, (be) null);
    }

    private void a(xl xlVar, ke keVar, be beVar) {
        long jM = keVar.m();
        if (jM <= 0) {
            if (t.a()) {
                t tVar = this.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Non-positive timeout set for ");
                if (beVar != null) {
                    keVar = beVar;
                }
                sb.append(keVar);
                sb.append(", not scheduling a timeout");
                tVar.a("MediationAdapterWrapper", sb.toString());
                return;
            }
            return;
        }
        if (t.a()) {
            t tVar2 = this.c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting timeout ");
            sb2.append(jM);
            sb2.append("ms for ");
            if (beVar != null) {
                keVar = beVar;
            }
            sb2.append(keVar);
            tVar2.a("MediationAdapterWrapper", sb2.toString());
        }
        this.b.l0().a(xlVar, sm.b.TIMEOUT, jM);
    }

    void a(String str, be beVar) {
        this.h = str;
        this.i = beVar;
    }

    public void a(be beVar, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (b(beVar, activity)) {
            if (beVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda14
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(viewGroup, lifecycle, activity);
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(viewGroup, lifecycle, activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + beVar + ": " + beVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, beVar);
        }
    }

    void a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final Runnable runnable) {
        b(MobileAdsBridgeBase.initializeMethodName, new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(runnable, maxAdapterInitializationParameters, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (t.a()) {
            this.c.a("MediationAdapterWrapper", "Initializing " + this.f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.e.r());
        }
        this.g.initialize(maxAdapterInitializationParameters, activity, new d(this.b, this.e, jElapsedRealtime, runnable));
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.m = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxAppOpenAdapter) this.g).showAppOpenAd(this.o, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.g).showInterstitialAd(this.o, viewGroup, lifecycle, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.d + " due to: " + th;
            t.h("MediationAdapterWrapper", str);
            this.n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.b.B().a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("show_ad");
            this.b.O().a(this.e.b(), "show_ad", this.i);
        }
    }

    void a() {
        if (this.s) {
            return;
        }
        b("destroy", new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.l();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, e eVar) {
        if (!eVar.c.compareAndSet(false, true) || eVar.b == null) {
            return;
        }
        eVar.b.onSignalCollected(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError, e eVar) {
        if (!eVar.c.compareAndSet(false, true) || eVar.b == null) {
            return;
        }
        eVar.b.a(maxError);
    }

    private void a(String str) {
        if (t.a()) {
            this.c.d("MediationAdapterWrapper", "Marking " + this.f + " as disabled due to: " + str);
        }
        this.p.set(false);
    }

    private void a(final String str, MaxAdFormat maxAdFormat, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, runnable);
            }
        };
        if (a(str, maxAdFormat)) {
            this.f690a.post(runnable2);
            return;
        }
        if (((Boolean) this.b.a(oj.a0)).booleanValue()) {
            this.b.l0().a(new kn(this.b, true, str + ":" + this.e.c(), runnable2), this.e);
            return;
        }
        runnable2.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (t.a()) {
                this.c.a("MediationAdapterWrapper", this.f + ": running " + str + "...");
            }
            runnable.run();
            if (t.a()) {
                this.c.a("MediationAdapterWrapper", this.f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            t.c("MediationAdapterWrapper", "Failed operation " + str + " for " + this.d, th);
            StringBuilder sb = new StringBuilder();
            sb.append("fail_");
            sb.append(str);
            a(sb.toString());
            if (str.equals("destroy")) {
                return;
            }
            this.b.O().a(this.e.b(), str, this.i);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("is_wrapper", com.json.mediationsdk.metadata.a.g);
            CollectionUtils.putStringIfValid("adapter_class", this.e.b(), mapHashMap);
            this.b.B().a("MediationAdapterWrapper", str, th, mapHashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolShouldShowAdsOnUiThread;
        MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return this.e.r();
        }
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if ("load_ad".equals(str) && maxAdFormat != null) {
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null && (boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat)) != null) {
            return boolShouldShowAdsOnUiThread.booleanValue();
        }
        return this.e.r();
    }
}
