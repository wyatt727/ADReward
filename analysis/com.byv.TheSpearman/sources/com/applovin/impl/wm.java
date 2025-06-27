package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wm extends xl {
    private static final AtomicBoolean q = new AtomicBoolean();
    private final String h;
    private final MaxAdFormat i;
    private final JSONObject j;
    private final List k;
    private final a.InterfaceC0032a l;
    private final WeakReference m;
    private final String n;
    private long o;
    private final List p;

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        final MaxErrorImpl maxErrorImpl;
        this.o = SystemClock.elapsedRealtime();
        if (this.j.optBoolean("is_testing", false) && !this.f1179a.n0().c() && q.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.wm$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e();
                }
            });
        }
        if (this.k.size() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Starting waterfall for " + this.i.getLabel() + " ad unit " + this.h + " with " + this.k.size() + " ad(s)...");
            }
            this.f1179a.l0().a(new a(0, this.k));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.c.k(this.b, "No ads were returned from the server for " + this.i.getLabel() + " ad unit " + this.h);
        }
        zp.a(this.h, this.i, this.j, this.f1179a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.j, com.json.mediationsdk.d.g, new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (ve.a(this.j, this.h, this.f1179a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + this.h + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (zp.c(this.f1179a) && ((Boolean) this.f1179a.a(oj.o6)).booleanValue()) {
                j = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.wm$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            w1.a(millis, this.f1179a, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }

    wm(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0032a interfaceC0032a) {
        super("TaskProcessMediationWaterfall", kVar, str);
        this.h = str;
        this.i = maxAdFormat;
        this.j = jSONObject;
        this.l = interfaceC0032a;
        this.m = new WeakReference(context);
        this.n = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        this.k = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            this.k.add(be.a(i, map, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, kVar));
        }
        this.p = new ArrayList(this.k.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        zp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f1179a.p0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(be beVar) {
        this.f1179a.V().b(beVar);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.o;
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d(this.b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + beVar.c() + " for " + this.i.getLabel() + " ad unit " + this.h);
        }
        beVar.a(new MaxAdWaterfallInfoImpl(beVar, jElapsedRealtime, this.p, this.n));
        bc.f(this.l, beVar);
    }

    private class a extends xl {
        private final long h;
        private final int i;
        private final be j;
        private final List k;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Loading ad " + (this.i + 1) + " of " + this.k.size() + " from " + this.j.c() + " for " + wm.this.i.getLabel() + " ad unit " + wm.this.h);
            }
            b("started to load ad");
            Context context = (Context) wm.this.m.get();
            this.f1179a.S().loadThirdPartyMediatedAd(wm.this.h, this.j, context instanceof Activity ? (Activity) context : this.f1179a.p0(), new C0050a(wm.this.l));
        }

        a(int i, List list) {
            super(wm.this.b, wm.this.f1179a, wm.this.h);
            this.h = SystemClock.elapsedRealtime();
            this.i = i;
            this.j = (be) list.get(i);
            this.k = list;
        }

        /* renamed from: com.applovin.impl.wm$a$a, reason: collision with other inner class name */
        class C0050a extends je {
            C0050a(a.InterfaceC0032a interfaceC0032a) {
                super(interfaceC0032a);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                a.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - a.this.h;
                com.applovin.impl.sdk.t unused = a.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    a.this.c.a(a.this.b, "Ad loaded in " + jElapsedRealtime + "ms for " + wm.this.i.getLabel() + " ad unit " + wm.this.h);
                }
                be beVar = (be) maxAd;
                a.this.a(beVar, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i = a.this.i;
                while (true) {
                    i++;
                    if (i >= a.this.k.size()) {
                        wm.this.b(beVar);
                        return;
                    } else {
                        a aVar = a.this;
                        aVar.a((be) aVar.k.get(i), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - a.this.h;
                com.applovin.impl.sdk.t unused = a.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    a.this.c.a(a.this.b, "Ad failed to load in " + jElapsedRealtime + " ms for " + wm.this.i.getLabel() + " ad unit " + wm.this.h + " with error: " + maxError);
                }
                a.this.b("failed to load ad: " + maxError.getCode());
                a aVar = a.this;
                aVar.a(aVar.j, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (a.this.i < a.this.k.size() - 1) {
                    a aVar2 = a.this;
                    a.this.f1179a.l0().a((xl) wm.this.new a(aVar2.i + 1, a.this.k), sm.b.MEDIATION);
                } else {
                    wm.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(be beVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            wm.this.p.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(ve.b(beVar.b(), this.f1179a)), beVar.E(), beVar.W(), j, beVar.A(), maxError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        if (maxError.getCode() == 204) {
            this.f1179a.F().c(aa.u);
        } else if (maxError.getCode() == -5001) {
            this.f1179a.F().c(aa.v);
        } else {
            this.f1179a.F().c(aa.w);
        }
        ArrayList arrayList = new ArrayList(this.p.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.p) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            int i = 0;
            while (i < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxNetworkResponseInfo2.getError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxNetworkResponseInfo2.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.o;
        if (com.applovin.impl.sdk.t.a()) {
            this.c.d(this.b, "Waterfall failed in " + jElapsedRealtime + "ms for " + this.i.getLabel() + " ad unit " + this.h + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.j, "waterfall_name", ""), JsonUtils.getString(this.j, "waterfall_test_name", ""), jElapsedRealtime, this.p, JsonUtils.optList(JsonUtils.getJSONArray(this.j, "mwf_info_urls", null), Collections.EMPTY_LIST), this.n));
        bc.a(this.l, this.h, maxError);
    }
}
