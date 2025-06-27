package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.de;
import com.applovin.impl.gf;
import com.applovin.impl.h8;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.v;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0042a, v.b {

    /* renamed from: a, reason: collision with root package name */
    private final b f667a;
    private final WeakReference b;
    private final com.applovin.impl.mediation.b c;
    private final Object d;
    private de e;
    private d f;
    private de g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;
    private boolean j;
    private boolean k;
    private WeakReference l;
    protected final c listenerWrapper;
    private WeakReference m;
    private WeakReference n;

    public interface b {
        Activity getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements MaxAdListener, MaxRewardedAdListener, MaxAdRevenueListener, a.InterfaceC0032a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.k) {
                MaxFullscreenAdImpl.this.e();
                return;
            }
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final boolean z = MaxFullscreenAdImpl.this.k;
            MaxFullscreenAdImpl.this.k = false;
            final de deVar = (de) maxAd;
            MaxFullscreenAdImpl.this.a(d.IDLE, new e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c$$ExternalSyntheticLambda2
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    this.f$0.a(maxAd, z, deVar, maxError);
                }

                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public /* synthetic */ void a(MaxError maxError2) {
                    MaxFullscreenAdImpl.e.CC.$default$a(this, maxError2);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            de deVar = (de) maxAd;
            MaxFullscreenAdImpl.this.g = deVar;
            MaxFullscreenAdImpl.this.k = false;
            MaxFullscreenAdImpl.this.sdk.f().a(deVar);
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.k = false;
            MaxFullscreenAdImpl.this.a(d.IDLE, new e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    this.f$0.a(maxAd);
                }

                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public /* synthetic */ void a(MaxError maxError) {
                    MaxFullscreenAdImpl.e.CC.$default$a(this, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.d();
            MaxFullscreenAdImpl.this.a(d.IDLE, new e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c$$ExternalSyntheticLambda3
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    this.f$0.a(str, maxError);
                }

                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public /* synthetic */ void a(MaxError maxError2) {
                    MaxFullscreenAdImpl.e.CC.$default$a(this, maxError2);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            de deVar;
            synchronized (MaxFullscreenAdImpl.this.d) {
                deVar = MaxFullscreenAdImpl.this.e;
            }
            MaxFullscreenAdImpl.this.sdk.E().a(MaxFullscreenAdImpl.this.adUnitId);
            MaxFullscreenAdImpl.this.a((de) maxAd);
            if (!MaxFullscreenAdImpl.this.h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(d.READY, new e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c$$ExternalSyntheticLambda0
                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public final void a() {
                        this.f$0.b(maxAd);
                    }

                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public /* synthetic */ void a(MaxError maxError) {
                        MaxFullscreenAdImpl.e.CC.$default$a(this, maxError);
                    }
                });
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.e();
            }
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + deVar + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            bc.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) deVar, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            bc.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            bc.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxRewardedAdListener.onRewardedVideoCompleted(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.g(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxRewardedAdListener.onRewardedVideoStarted(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.h(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxRewardedAdListener.onUserRewarded(ad=" + maxAd + ", reward=" + maxReward + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }

        /* synthetic */ c(MaxFullscreenAdImpl maxFullscreenAdImpl, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z, de deVar, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z && deVar.r0() && MaxFullscreenAdImpl.this.sdk.M().d(MaxFullscreenAdImpl.this.adUnitId)) {
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a();
                    }
                });
                return;
            }
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.k = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    public enum d {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface e {

        /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$e$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(e _this, MaxError maxError) {
            }
        }

        void a();

        void a(MaxError maxError);
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, b bVar, String str2, k kVar, Context context) {
        super(str, maxAdFormat, str2, kVar);
        this.d = new Object();
        this.e = null;
        this.f = d.IDLE;
        this.g = null;
        this.h = new AtomicBoolean();
        this.i = new AtomicBoolean();
        this.l = new WeakReference(null);
        this.m = new WeakReference(null);
        this.n = new WeakReference(null);
        this.f667a = bVar;
        this.listenerWrapper = new c(this, null);
        this.c = new com.applovin.impl.mediation.b(kVar);
        this.b = new WeakReference(context);
        kVar.h().a(this);
        t.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(d.DESTROYED, new e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
            public final void a() {
                this.f$0.b();
            }

            @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
            public /* synthetic */ void a(MaxError maxError) {
                MaxFullscreenAdImpl.e.CC.$default$a(this, maxError);
            }
        });
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.d) {
            de deVar = this.e;
            z = deVar != null && deVar.Z() && this.f == d.READY;
        }
        if (!z) {
            this.sdk.E().c(this.adUnitId);
        }
        return z;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0042a
    public void onAdExpired(h8 h8Var) {
        if (t.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.h.set(true);
        b bVar = this.f667a;
        Activity activity = bVar != null ? bVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            d();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.S().loadAd(this.adUnitId, null, this.adFormat, d.b.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
        }
    }

    @Override // com.applovin.impl.v.b
    public void onCreativeIdGenerated(String str, String str2) {
        de deVar = this.e;
        if (deVar == null || !deVar.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.e.h(str2);
        bc.b(this.adReviewListener, str2, this.e);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        List listB = this.sdk.n0().b();
        if (!this.sdk.n0().d() || listB == null || listB.contains(this.e.c())) {
            if (activity == null) {
                activity = this.sdk.p0();
            }
            if (a(activity, str)) {
                a(d.SHOWING, new e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda3
                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public final void a() {
                        this.f$0.a(str, str2, activity);
                    }

                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public /* synthetic */ void a(MaxError maxError) {
                        MaxFullscreenAdImpl.e.CC.$default$a(this, maxError);
                    }
                });
                return;
            }
            return;
        }
        final String str3 = "Attempting to show ad from <" + this.e.c() + "> which is not in the list of selected ad networks " + listB;
        t.h(this.tag, str3);
        a(d.IDLE, new e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
            public final void a() {
                this.f$0.a(str3);
            }

            @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
            public /* synthetic */ void a(MaxError maxError) {
                MaxFullscreenAdImpl.e.CC.$default$a(this, maxError);
            }
        });
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f667a) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (this.i.compareAndSet(true, false)) {
            t.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.E().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            gf gfVar = new gf(this.adUnitId, this.adFormat, this.e.getPlacement());
            if (t.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + gfVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            bc.a(this.adListener, (MaxAd) gfVar, (MaxError) maxErrorImpl, true);
            if (this.e != null) {
                this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Activity activityP0 = (Activity) this.l.get();
        if (activityP0 == null) {
            activityP0 = this.sdk.p0();
        }
        Activity activity = activityP0;
        if (this.j) {
            showAd(this.e.getPlacement(), this.e.e(), (ViewGroup) this.m.get(), (Lifecycle) this.n.get(), activity);
        } else {
            showAd(this.e.getPlacement(), this.e.e(), activity);
        }
    }

    public void loadAd(d.b bVar) {
        if (t.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f == d.DESTROYED) {
            boolean zC = zp.c(this.sdk);
            this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToLoadDestroyedAd", (Map) CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            b bVar2 = this.f667a;
            a(d.LOADING, new a(bVar2 != null ? bVar2.getActivity() : null, (Context) this.b.get(), bVar));
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (t.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdLoaded(ad=" + this.e + "), listener=" + this.adListener);
        }
        bc.f(this.adListener, (MaxAd) this.e, true);
    }

    class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f668a;
        final /* synthetic */ Context b;
        final /* synthetic */ d.b c;

        a(Activity activity, Context context, d.b bVar) {
            this.f668a = activity;
            this.b = context;
            this.c = bVar;
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
        public void a() {
            Context contextP0 = this.f668a;
            if (contextP0 == null && (contextP0 = this.b) == null) {
                contextP0 = MaxFullscreenAdImpl.this.sdk.p0() != null ? MaxFullscreenAdImpl.this.sdk.p0() : k.k();
            }
            Context context = contextP0;
            MediationServiceImpl mediationServiceImplS = MaxFullscreenAdImpl.this.sdk.S();
            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
            mediationServiceImplS.loadAd(maxFullscreenAdImpl.adUnitId, null, maxFullscreenAdImpl.adFormat, this.c, maxFullscreenAdImpl.localExtraParameters, maxFullscreenAdImpl.extraParameters, context, maxFullscreenAdImpl.listenerWrapper);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
        public void a(MaxError maxError) {
            if (((Boolean) MaxFullscreenAdImpl.this.sdk.a(qe.L7)).booleanValue()) {
                t tVar = MaxFullscreenAdImpl.this.logger;
                if (t.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + MaxFullscreenAdImpl.this.adUnitId + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                }
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                bc.a(maxFullscreenAdImpl2.adListener, maxFullscreenAdImpl2.adUnitId, maxError, true);
            }
        }
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final Lifecycle lifecycle, Activity activity) {
        if (viewGroup != null && lifecycle != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(qe.B7)).booleanValue()) {
                t.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                bc.a(this.adListener, (MaxAd) this.e, (MaxError) maxErrorImpl, true);
                this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.e);
                return;
            }
            List listB = this.sdk.n0().b();
            if (this.sdk.n0().d() && listB != null && !listB.contains(this.e.c())) {
                final String str3 = "Attempting to show ad from <" + this.e.c() + "> which is not in the list of selected ad networks " + listB;
                t.h(this.tag, str3);
                a(d.IDLE, new e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda2
                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public final void a() {
                        this.f$0.b(str3);
                    }

                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public /* synthetic */ void a(MaxError maxError) {
                        MaxFullscreenAdImpl.e.CC.$default$a(this, maxError);
                    }
                });
                return;
            }
            if (activity == null) {
                activity = this.sdk.p0();
            }
            final Activity activity2 = activity;
            if (a(activity2, str)) {
                a(d.SHOWING, new e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda4
                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public final void a() {
                        this.f$0.a(str, str2, activity2, viewGroup, lifecycle);
                    }

                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public /* synthetic */ void a(MaxError maxError) {
                        MaxFullscreenAdImpl.e.CC.$default$a(this, maxError);
                    }
                });
                return;
            }
            return;
        }
        t.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (t.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.e + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
        }
        bc.a(this.adListener, (MaxAd) this.e, (MaxError) maxErrorImpl2, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        de deVar;
        if (this.h.compareAndSet(true, false)) {
            synchronized (this.d) {
                deVar = this.e;
                this.e = null;
            }
            this.sdk.S().destroyAd(deVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        synchronized (this.d) {
            if (this.e != null) {
                if (t.a()) {
                    this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.e + "...");
                }
                this.sdk.S().destroyAd(this.e);
            }
        }
        this.sdk.h().b(this);
        this.c.a();
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        de deVar = this.e;
        a((MaxAd) deVar);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (t.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + deVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        bc.a(this.adListener, (MaxAd) deVar, (MaxError) maxErrorImpl, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(de deVar) {
        if (this.sdk.f().a(deVar, this)) {
            if (t.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + deVar);
            }
            this.e = deVar;
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        de deVar = this.e;
        a((MaxAd) deVar);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (t.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + deVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        bc.a(this.adListener, (MaxAd) deVar, (MaxError) maxErrorImpl, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.j = false;
        this.l = new WeakReference(activity);
        this.sdk.S().showFullscreenAd(this.e, activity, this.listenerWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, Lifecycle lifecycle) {
        a(str, str2);
        this.j = true;
        this.l = new WeakReference(activity);
        this.m = new WeakReference(viewGroup);
        this.n = new WeakReference(lifecycle);
        this.sdk.S().showFullscreenAd(this.e, viewGroup, lifecycle, activity, this.listenerWrapper);
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f == d.DESTROYED) {
            boolean zC = zp.c(this.sdk);
            this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToShowDestroyedAd", (Map) CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            t.h(this.tag, str2);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
            gf gfVar = new gf(this.adUnitId, this.adFormat, str);
            if (t.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + gfVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            bc.a(this.adListener, (MaxAd) gfVar, (MaxError) maxErrorImpl, true);
            if (this.e != null) {
                this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.e);
            }
            return false;
        }
        Long l = (Long) this.sdk.a(qe.o7);
        Long l2 = (Long) this.sdk.a(qe.h7);
        if (l.longValue() > 0 && (this.e.getTimeToLiveMillis() < l2.longValue() || this.h.get())) {
            this.i.set(true);
            this.sdk.l0().a(new kn(this.sdk, "handleShowOnLoadTimeoutError", new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            }), sm.b.TIMEOUT, l.longValue());
            return false;
        }
        if (zp.a(k.k()) != 0 && this.sdk.g0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!zp.c(this.sdk)) {
                if (((Boolean) this.sdk.a(qe.A7)).booleanValue()) {
                    t.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (t.a()) {
                        this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.e + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                    }
                    bc.a(this.adListener, (MaxAd) this.e, (MaxError) maxErrorImpl2, true);
                    this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.e);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.E().d() && !this.sdk.E().c()) {
            String str3 = this.sdk.g0().getExtraParameters().get("fullscreen_ads_block_showing_if_activity_is_finishing");
            if (((!StringUtils.isValidString(str3) || !Boolean.valueOf(str3).booleanValue()) && !((Boolean) this.sdk.a(qe.g7)).booleanValue()) || activity == null || !activity.isFinishing()) {
                return true;
            }
            t.h(this.tag, "Attempting to show ad when activity is finishing");
            MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing");
            if (t.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.e + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
            }
            bc.a(this.adListener, (MaxAd) this.e, (MaxError) maxErrorImpl3, true);
            this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.e);
            return false;
        }
        t.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        if (((Boolean) this.sdk.a(qe.K7)).booleanValue()) {
            if (this.g != null) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap(FirebaseAnalytics.Param.SOURCE, this.tag);
                mapHashMap.put("adapter_version", this.g.y());
                mapHashMap.put("error_message", "Attempting to show ad when another fullscreen ad is already showing");
                this.sdk.B().a(o.b.DISPLAY_ERROR, this.g, mapHashMap, 0L);
            } else if (t.a()) {
                this.logger.a(this.tag, "Unable to submit error report for previously displayed ad because it doesn't exist");
            }
        }
        MaxErrorImpl maxErrorImpl4 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (t.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.e + ", error=" + maxErrorImpl4 + "), listener=" + this.adListener);
        }
        bc.a(this.adListener, (MaxAd) this.e, (MaxError) maxErrorImpl4, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl4, this.e);
        return false;
    }

    private void a(String str, String str2) {
        this.c.e(this.e);
        this.e.g(str);
        this.e.f(str2);
        this.sdk.v().d(this.e);
        if (t.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.e + "...");
        }
        a((be) this.e);
    }

    private void a() {
        de deVar;
        synchronized (this.d) {
            deVar = this.e;
            this.e = null;
        }
        this.sdk.S().destroyAd(deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, e eVar) {
        boolean z;
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1);
        d dVar2 = this.f;
        synchronized (this.d) {
            d dVar3 = d.IDLE;
            if (dVar2 == dVar3) {
                if (dVar == d.LOADING || dVar == d.DESTROYED) {
                    z = true;
                } else {
                    if (dVar == d.SHOWING) {
                        t.h(this.tag, "No ad is loading or loaded");
                    } else if (t.a()) {
                        this.logger.b(this.tag, "Unable to transition to: " + dVar);
                    }
                    z = false;
                }
            } else {
                d dVar4 = d.LOADING;
                if (dVar2 == dVar4) {
                    if (dVar != dVar3) {
                        if (dVar == dVar4) {
                            maxErrorImpl = new MaxErrorImpl(-26, "An ad is already loading");
                            t.h(this.tag, maxErrorImpl.getMessage());
                        } else if (dVar != d.READY) {
                            if (dVar == d.SHOWING) {
                                t.h(this.tag, "An ad is not ready to be shown yet");
                            } else if (dVar != d.DESTROYED) {
                                if (t.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                }
                            }
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    d dVar5 = d.READY;
                    if (dVar2 == dVar5) {
                        if (dVar != dVar3) {
                            if (dVar == dVar4) {
                                t.h(this.tag, "An ad is already loaded");
                            } else if (dVar == dVar5) {
                                if (t.a()) {
                                    this.logger.b(this.tag, "An ad is already marked as ready");
                                }
                            } else if (dVar != d.SHOWING && dVar != d.DESTROYED) {
                                if (t.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        d dVar6 = d.SHOWING;
                        if (dVar2 == dVar6) {
                            if (dVar != dVar3) {
                                if (dVar == dVar4) {
                                    maxErrorImpl = new MaxErrorImpl(-27, "Can not load another ad while the ad is showing");
                                    t.h(this.tag, maxErrorImpl.getMessage());
                                } else if (dVar == dVar5) {
                                    if (t.a()) {
                                        this.logger.b(this.tag, "An ad is already showing, ignoring");
                                    }
                                } else if (dVar == dVar6) {
                                    t.h(this.tag, "The ad is already showing, not showing another one");
                                } else if (dVar != d.DESTROYED) {
                                    if (t.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                    }
                                }
                            }
                            z = true;
                        } else if (dVar2 == d.DESTROYED) {
                            t.h(this.tag, "No operations are allowed on a destroyed instance");
                        } else if (t.a()) {
                            this.logger.b(this.tag, "Unknown state: " + this.f);
                        }
                        z = false;
                    }
                }
            }
            if (z) {
                if (t.a()) {
                    this.logger.a(this.tag, "Transitioning from " + this.f + " to " + dVar + "...");
                }
                this.f = dVar;
            } else if (t.a()) {
                this.logger.k(this.tag, "Not allowed to transition from " + this.f + " to " + dVar);
            }
        }
        if (z) {
            eVar.a();
        } else {
            eVar.a(maxErrorImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((de) maxAd);
        this.c.a();
        a();
        this.sdk.V().a((be) maxAd);
    }
}
