package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.aa;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.de;
import com.applovin.impl.gn;
import com.applovin.impl.ie;
import com.applovin.impl.ke;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.mediation.g;
import com.applovin.impl.mn;
import com.applovin.impl.oj;
import com.applovin.impl.qe;
import com.applovin.impl.qm;
import com.applovin.impl.re;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.q;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.se;
import com.applovin.impl.sm;
import com.applovin.impl.uj;
import com.applovin.impl.vj;
import com.applovin.impl.wj;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f661a;
    private final t b;
    private final uj c;
    private final AtomicReference d = new AtomicReference();

    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0032a {

        /* renamed from: a, reason: collision with root package name */
        private final be f663a;
        private a.InterfaceC0032a b;

        public void a(a.InterfaceC0032a interfaceC0032a) {
            this.b = interfaceC0032a;
        }

        public void b(MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f663a.a(bundle);
            bc.b(this.b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f663a.a(bundle);
            t unused = MediationServiceImpl.this.b;
            if (t.a()) {
                MediationServiceImpl.this.b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f663a, this.b);
            MediationServiceImpl.this.f661a.F().c(aa.f);
            MediationServiceImpl.this.f661a.F().c(aa.i);
            if (!maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f661a.o().b(this.f663a, "DID_DISPLAY");
                bc.c(this.b, maxAd);
                return;
            }
            de deVar = (de) maxAd;
            if (deVar.n0()) {
                MediationServiceImpl.this.f661a.o().b(this.f663a, "DID_DISPLAY");
                MediationServiceImpl.this.f661a.E().a(this.f663a);
                bc.c(this.b, maxAd);
                return;
            }
            t unused2 = MediationServiceImpl.this.b;
            if (t.a()) {
                t tVar = MediationServiceImpl.this.b;
                StringBuilder sb = new StringBuilder();
                sb.append("Received ad display callback before attempting show");
                sb.append(deVar.X() ? " for hybrid ad" : "");
                tVar.k("MediationService", sb.toString());
            }
        }

        public void d(MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f663a.a(bundle);
            bc.d(this.b, maxAd);
        }

        public void e(final MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f663a.a(bundle);
            MediationServiceImpl.this.f661a.o().b((be) maxAd, "DID_HIDE");
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(maxAd);
                }
            }, maxAd instanceof de ? ((de) maxAd).e0() : 0L);
        }

        public void f(MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f663a.a(bundle);
            this.f663a.a0();
            MediationServiceImpl.this.a(this.f663a);
            bc.f(this.b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) throws JSONException {
            a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) throws JSONException {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) throws JSONException {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) throws JSONException {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) throws JSONException {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) throws JSONException {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f663a.a0();
            MediationServiceImpl.this.b(this.f663a, maxError, this.b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) throws JSONException {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            bc.g(this.b, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            bc.h(this.b, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) throws JSONException {
            a(maxAd, maxReward, (Bundle) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f661a.E().b(maxAd);
            }
            bc.e(this.b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f663a.a(bundle);
            MediationServiceImpl.this.a(this.f663a, this.b);
            bc.a((MaxAdListener) this.b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) throws JSONException {
            this.f663a.a(bundle);
            MediationServiceImpl.this.a(this.f663a, maxError, this.b);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof de)) {
                ((de) maxAd).c0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) throws JSONException {
            this.f663a.a(bundle);
            bc.a(this.b, maxAd, maxReward);
            MediationServiceImpl.this.f661a.l0().a((xl) new gn((de) maxAd, MediationServiceImpl.this.f661a), sm.b.OTHER);
        }

        public b(be beVar, a.InterfaceC0032a interfaceC0032a) {
            this.f663a = beVar;
            this.b = interfaceC0032a;
        }
    }

    public MediationServiceImpl(k kVar) {
        this.f661a = kVar;
        this.b = kVar.L();
        this.c = new uj(kVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof be) {
            if (t.a()) {
                this.b.d("MediationService", "Destroying " + maxAd);
            }
            be beVar = (be) maxAd;
            g gVarZ = beVar.z();
            if (gVarZ != null) {
                gVarZ.a();
                beVar.s();
            }
            this.f661a.h().c(beVar.Q());
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.d.getAndSet(null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, d.b bVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0032a interfaceC0032a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0032a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f661a.Q())) {
            t.h("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
        }
        if (!this.f661a.y0()) {
            t.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List<String> adUnitIds = null;
        if (this.f661a.C0().get()) {
            adUnitIds = this.f661a.g0().getInitializationAdUnitIds();
        } else if (this.f661a.I() != null) {
            adUnitIds = this.f661a.I().getAdUnitIds();
        }
        boolean zStartsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !zStartsWith) {
            if (zp.c(this.f661a)) {
                String str3 = "Ad Unit ID " + str + " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow";
                if (((Boolean) this.f661a.a(oj.p6)).booleanValue()) {
                    throw new RuntimeException(str3);
                }
                if (t.a()) {
                    this.b.b("MediationService", str3);
                }
            }
            this.f661a.B().a(o.b.INTEGRATION_ERROR, "uninitialized_ad_unit_id", CollectionUtils.hashMap(MintegralConstants.AD_UNIT_ID, str), "uninitialized_ad_unit_id" + str);
        }
        this.f661a.c();
        if (str.length() != 16 && !zStartsWith && !this.f661a.d0().startsWith("05TMD")) {
            t.h("MediationService", "Please double-check the ad unit " + str + " for " + maxAdFormat.getLabel() + " : " + Log.getStackTraceString(new Throwable("")));
        }
        if (!this.f661a.a(maxAdFormat)) {
            this.f661a.V0();
            bc.a((MaxAdRequestListener) interfaceC0032a, str, true);
            this.f661a.M().a(str, str2, maxAdFormat, bVar, map, map2, context, interfaceC0032a);
            return;
        }
        t.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
        bc.a(interfaceC0032a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object objA = this.f661a.E().a();
            if (objA instanceof be) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (be) objA, true);
            }
        }
    }

    public void processWaterfallInfoPostback(String str, MaxAdFormat maxAdFormat, MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, long j, long j2) {
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap map = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), map);
        CollectionUtils.putStringIfValid(MintegralConstants.AD_UNIT_ID, str, map);
        CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, maxAdFormat.getLabel(), map);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), map);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j2), map);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j), map);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), map);
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap map2 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), map2);
            map2.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), map2);
            map2.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap map3 = new HashMap(4);
                map3.put(AndroidBridgeConstants.ERROR_CODE, Integer.valueOf(maxErrorImpl.getCode()));
                map3.put("error_message", maxErrorImpl.getMessage());
                map3.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                map3.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                map2.put("error_info", map3);
            }
            arrayList.add(map2);
        }
        map.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, map, null, null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.d.set(jSONObject);
    }

    public void showFullscreenAd(final de deVar, final Activity activity, final a.InterfaceC0032a interfaceC0032a) {
        if (deVar != null) {
            if (activity == null && MaxAdFormat.APP_OPEN != deVar.getFormat()) {
                throw new IllegalArgumentException("No activity specified");
            }
            this.f661a.E().a(true);
            final g gVarB = b(deVar);
            long jK0 = deVar.k0();
            if (t.a()) {
                this.b.d("MediationService", "Showing ad " + deVar.getAdUnitId() + " with delay of " + jK0 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(deVar, gVarB, activity, interfaceC0032a);
                }
            }, jK0);
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    public void loadThirdPartyMediatedAd(String str, be beVar, Activity activity, a.InterfaceC0032a interfaceC0032a) {
        if (beVar != null) {
            if (t.a()) {
                this.b.a("MediationService", "Loading " + beVar + "...");
            }
            this.f661a.o().b(beVar, "WILL_LOAD");
            g gVarA = this.f661a.O().a(beVar);
            if (gVarA != null) {
                MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(beVar);
                this.f661a.N().a(beVar, activity);
                be beVarA = beVar.a(gVarA);
                gVarA.a(str, beVarA);
                beVarA.b0();
                gVarA.a(str, maxAdapterParametersImplA, beVarA, activity, new b(beVarA, interfaceC0032a));
                return;
            }
            String str2 = "Failed to load " + beVar + ": adapter not loaded";
            t.h("MediationService", str2);
            b(beVar, new MaxErrorImpl(-5001, str2), interfaceC0032a);
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public void collectSignal(String str, MaxAdFormat maxAdFormat, wj wjVar, Context context, vj.a aVar) {
        if (wjVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar != null) {
            vj vjVarB = this.c.b(wjVar, str, maxAdFormat);
            if (vjVarB != null) {
                aVar.a(vj.a(vjVarB));
                return;
            }
            g gVarA = this.f661a.O().a(wjVar, wjVar.w());
            if (gVarA != null) {
                Activity activityP0 = context instanceof Activity ? (Activity) context : this.f661a.p0();
                MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(wjVar, str, maxAdFormat);
                if (wjVar.u()) {
                    this.f661a.N().a(wjVar, activityP0);
                }
                a aVar2 = new a(gVarA, str, SystemClock.elapsedRealtime(), wjVar, maxAdFormat, aVar);
                if (wjVar.v()) {
                    if (this.f661a.N().a(wjVar)) {
                        if (t.a()) {
                            this.b.a("MediationService", "Collecting signal for now-initialized adapter: " + gVarA.g());
                        }
                        gVarA.a(maxAdapterParametersImplA, wjVar, activityP0, aVar2);
                        return;
                    }
                    if (t.a()) {
                        this.b.b("MediationService", "Skip collecting signal for not-initialized adapter: " + gVarA.g());
                    }
                    aVar.a(vj.a(wjVar, new MaxErrorImpl("Adapter not initialized yet")));
                    return;
                }
                if (t.a()) {
                    this.b.a("MediationService", "Collecting signal for adapter: " + gVarA.g());
                }
                gVarA.a(maxAdapterParametersImplA, wjVar, activityP0, aVar2);
                return;
            }
            aVar.a(vj.a(wjVar, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    class a implements g.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f662a;
        final /* synthetic */ String b;
        final /* synthetic */ long c;
        final /* synthetic */ wj d;
        final /* synthetic */ MaxAdFormat e;
        final /* synthetic */ vj.a f;

        @Override // com.applovin.impl.mediation.g.b
        public void a(MaxError maxError) {
            t unused = MediationServiceImpl.this.b;
            if (t.a()) {
                MediationServiceImpl.this.b.b("MediationService", "Signal collection failed from: " + this.f662a.g() + " for Ad Unit ID: " + this.b + " with error message: \"" + maxError.getMessage() + "\"");
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.c;
            vj vjVarA = vj.a(this.d, this.f662a, maxError, j, jElapsedRealtime - j);
            MediationServiceImpl.this.a(vjVarA, this.d, this.f662a);
            this.f.a(vjVarA);
            this.f662a.a();
        }

        @Override // com.applovin.impl.mediation.g.b
        public void onSignalCollected(String str) {
            t unused = MediationServiceImpl.this.b;
            if (t.a()) {
                MediationServiceImpl.this.b.a("MediationService", "Signal collection successful from: " + this.f662a.g() + " for Ad Unit ID: " + this.b + " with signal: \"" + str + "\"");
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.c;
            vj vjVarA = vj.a(this.d, this.f662a, str, j, jElapsedRealtime - j);
            MediationServiceImpl.this.c.a(vjVarA, this.d, this.b, this.e);
            this.f.a(vjVarA);
            this.f662a.a();
        }

        a(g gVar, String str, long j, wj wjVar, MaxAdFormat maxAdFormat, vj.a aVar) {
            this.f662a = gVar;
            this.b = str;
            this.c = j;
            this.d = wjVar;
            this.e = maxAdFormat;
            this.f = aVar;
        }
    }

    public void showFullscreenAd(final de deVar, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity, final a.InterfaceC0032a interfaceC0032a) {
        if (deVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f661a.E().a(true);
            final g gVarB = b(deVar);
            long jK0 = deVar.k0();
            if (t.a()) {
                this.b.d("MediationService", "Showing ad " + deVar.getAdUnitId() + " with delay of " + jK0 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(deVar, gVarB, viewGroup, lifecycle, activity, interfaceC0032a);
                }
            }, jK0);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    private void a(de deVar, a.InterfaceC0032a interfaceC0032a) {
        this.f661a.E().a(false);
        a(deVar, (MaxAdListener) interfaceC0032a);
        if (t.a()) {
            this.b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(deVar, interfaceC0032a);
    }

    public void processAdapterInitializationPostback(ke keVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap map = new HashMap(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j));
        a("minit", map, new MaxErrorImpl(str), keVar);
    }

    public void processRawAdImpression(be beVar, a.InterfaceC0032a interfaceC0032a) {
        this.f661a.o().b(beVar, "WILL_DISPLAY");
        if (beVar.O().endsWith("mimp")) {
            this.f661a.o().b(beVar);
            bc.a((MaxAdRevenueListener) interfaceC0032a, (MaxAd) beVar);
        }
        if (((Boolean) this.f661a.a(oj.M4)).booleanValue()) {
            this.f661a.T().a(re.d, se.a(beVar), Long.valueOf(System.currentTimeMillis() - this.f661a.J()));
        }
        HashMap map = new HashMap(2);
        if (beVar instanceof de) {
            map.put("{TIME_TO_SHOW_MS}", String.valueOf(((de) beVar).i0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f661a.t0().c());
        if (!((Boolean) this.f661a.a(oj.R3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mimp", map, beVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(be beVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, beVar);
        destroyAd(beVar);
        bc.a(maxAdListener, beVar.getAdUnitId(), maxError);
    }

    public void processViewabilityAdImpressionPostback(ie ieVar, long j, a.InterfaceC0032a interfaceC0032a) {
        if (ieVar.O().endsWith("vimp")) {
            this.f661a.o().b(ieVar);
            bc.a((MaxAdRevenueListener) interfaceC0032a, (MaxAd) ieVar);
        }
        HashMap map = new HashMap(3);
        map.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(ieVar.j0()));
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f661a.t0().c());
        if (!((Boolean) this.f661a.a(oj.R3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mvimp", map, ieVar);
    }

    public void processCallbackAdImpressionPostback(be beVar, a.InterfaceC0032a interfaceC0032a) {
        if (beVar.O().endsWith("cimp")) {
            this.f661a.o().b(beVar);
            bc.a((MaxAdRevenueListener) interfaceC0032a, (MaxAd) beVar);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f661a.t0().c());
        if (!((Boolean) this.f661a.a(oj.R3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mcimp", map, beVar);
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, be beVar) {
        a(maxError, beVar, false);
    }

    private g b(de deVar) {
        g gVarZ = deVar.z();
        if (gVarZ != null) {
            return gVarZ;
        }
        this.f661a.E().a(false);
        if (t.a()) {
            this.b.k("MediationService", "Failed to show " + deVar + ": adapter not found");
        }
        t.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + deVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(de deVar, Long l, MaxAdListener maxAdListener) {
        if (deVar.t().get()) {
            return;
        }
        String str = "Ad (" + deVar.k() + ") has not been displayed after " + l + "ms. Failing ad display...";
        t.h("MediationService", str);
        a(deVar, new MaxErrorImpl(-1, str), maxAdListener);
        this.f661a.E().b(deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(de deVar, g gVar, Activity activity, a.InterfaceC0032a interfaceC0032a) {
        deVar.a(true);
        a(deVar);
        gVar.c(deVar, activity);
        a(deVar, interfaceC0032a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(de deVar, g gVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, a.InterfaceC0032a interfaceC0032a) {
        deVar.a(true);
        a(deVar);
        gVar.a(deVar, viewGroup, lifecycle, activity);
        a(deVar, interfaceC0032a);
    }

    private void a(final de deVar, final MaxAdListener maxAdListener) {
        final Long l = (Long) this.f661a.a(qe.n7);
        if (l.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(deVar, l, maxAdListener);
            }
        }, l.longValue());
    }

    private void a(de deVar) {
        if (deVar.getFormat() == MaxAdFormat.REWARDED || deVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f661a.l0().a((xl) new mn(deVar, this.f661a), sm.b.OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(be beVar, MaxError maxError, MaxAdListener maxAdListener) {
        this.f661a.o().b(beVar, "DID_FAIL_DISPLAY");
        a(maxError, beVar, true);
        if (beVar.t().compareAndSet(false, true)) {
            bc.a(maxAdListener, beVar, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(be beVar, a.InterfaceC0032a interfaceC0032a) {
        this.f661a.o().b(beVar, "DID_CLICKED");
        this.f661a.o().b(beVar, "DID_CLICK");
        if (beVar.O().endsWith(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
            this.f661a.o().b(beVar);
            bc.a((MaxAdRevenueListener) interfaceC0032a, (MaxAd) beVar);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f661a.t0().c());
        if (!((Boolean) this.f661a.a(oj.R3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclick", map, beVar);
    }

    private void a(MaxError maxError, be beVar, boolean z) {
        a("mierr", Collections.EMPTY_MAP, maxError, beVar, z);
    }

    private void a(MaxError maxError, be beVar) {
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(beVar.F()));
        if (beVar.getFormat().isFullscreenAd()) {
            q.a aVarB = this.f661a.E().b(beVar.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
        }
        a("mlerr", map, maxError, beVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(be beVar) {
        this.f661a.o().b(beVar, "DID_LOAD");
        if (beVar.O().endsWith("load")) {
            this.f661a.o().b(beVar);
        }
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(beVar.F()));
        if (beVar.getFormat().isFullscreenAd()) {
            q.a aVarB = this.f661a.E().b(beVar.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
        }
        a("load", map, beVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(vj vjVar, wj wjVar, g gVar) {
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(vjVar.b()));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", gVar.b(), map);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", gVar.i(), map);
        a("serr", map, vjVar.c(), wjVar);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, ke keVar, boolean z) {
        this.f661a.l0().a((xl) new qm(str, list, map, map2, maxError, keVar, this.f661a, z), sm.b.OTHER);
    }

    private void a(String str, Map map, ke keVar) {
        a(str, map, (MaxError) null, keVar);
    }

    private void a(String str, Map map, MaxError maxError, ke keVar) {
        a(str, map, maxError, keVar, true);
    }

    private void a(String str, Map map, MaxError maxError, ke keVar, boolean z) {
        Map map2 = CollectionUtils.map(map);
        map2.put("{PLACEMENT}", z ? StringUtils.emptyIfNull(keVar.getPlacement()) : "");
        map2.put("{CUSTOM_DATA}", z ? StringUtils.emptyIfNull(keVar.e()) : "");
        if (keVar instanceof be) {
            map2.put("{CREATIVE_ID}", z ? StringUtils.emptyIfNull(((be) keVar).getCreativeId()) : "");
        }
        a(str, null, map2, null, maxError, keVar, z);
    }
}
