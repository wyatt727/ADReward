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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vm extends xl {
    private static final AtomicBoolean z = new AtomicBoolean();
    private final String h;
    private final MaxAdFormat i;
    private final JSONObject j;
    private final a.InterfaceC0032a k;
    private final WeakReference l;
    private final String m;
    private final Queue n;
    private final Object o;
    private final Queue p;
    private final Object q;
    private final int r;
    private long s;
    private final List t;
    private final AtomicBoolean u;
    private final AtomicBoolean v;
    private final AtomicBoolean w;
    private be x;
    private ho y;

    private enum c {
        BIDDING,
        TAG
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        final MaxErrorImpl maxErrorImpl;
        this.s = SystemClock.elapsedRealtime();
        if (this.j.optBoolean("is_testing", false) && !this.f1179a.n0().c() && z.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.vm$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e();
                }
            });
        }
        if (this.r != 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Starting waterfall for " + this.i.getLabel() + " ad unit " + this.h + " with " + this.r + " ad(s)...");
            }
            d(c.TAG);
            d(c.BIDDING);
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
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.vm$$ExternalSyntheticLambda1
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

    public vm(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0032a interfaceC0032a) {
        super("TaskProcessMediationWaterfallV2", kVar, str);
        this.n = new LinkedList();
        this.o = new Object();
        this.p = new LinkedList();
        this.q = new Object();
        this.u = new AtomicBoolean();
        this.v = new AtomicBoolean();
        this.w = new AtomicBoolean();
        this.h = str;
        this.i = maxAdFormat;
        this.j = jSONObject;
        this.k = interfaceC0032a;
        this.l = new WeakReference(context);
        this.m = JsonUtils.getString(jSONObject, "mCode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            be beVarA = be.a(i, map, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, kVar);
            if (beVarA.W()) {
                this.p.add(beVarA);
            } else {
                this.n.add(beVarA);
            }
        }
        int size = this.n.size() + this.p.size();
        this.r = size;
        this.t = new ArrayList(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        zp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f1179a.p0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(c cVar) {
        be beVarA = a(cVar);
        if (beVarA == null) {
            b(cVar);
            return false;
        }
        this.f1179a.l0().a((xl) new b(beVarA, cVar), sm.b.MEDIATION);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public be c(c cVar) {
        return a(cVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b extends xl {
        private final String h;
        private final long i;
        private final be j;
        private final c k;
        private final int l;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.h, "Loading ad " + this.l + " of " + vm.this.r + " from " + this.j.c() + " for " + vm.this.i + " ad unit " + vm.this.h);
            }
            b("started to load ad");
            Context context = (Context) vm.this.l.get();
            this.f1179a.S().loadThirdPartyMediatedAd(vm.this.h, this.j, context instanceof Activity ? (Activity) context : this.f1179a.p0(), new a(vm.this.k));
        }

        private b(be beVar, c cVar) {
            super(vm.this.b, vm.this.f1179a, vm.this.h);
            this.h = this.b + ":" + cVar;
            this.i = SystemClock.elapsedRealtime();
            this.j = beVar;
            this.k = cVar;
            this.l = beVar.I() + 1;
        }

        class a extends je {
            a(a.InterfaceC0032a interfaceC0032a) {
                super(interfaceC0032a);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                boolean z;
                long jD;
                be beVar;
                b.this.b("loaded ad");
                be beVar2 = (be) maxAd;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.i;
                com.applovin.impl.sdk.t unused = b.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    b.this.c.a(b.this.h, "Ad (" + b.this.l + ") loaded in " + jElapsedRealtime + "ms for " + vm.this.i + " ad unit " + vm.this.h);
                }
                vm.this.a(beVar2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                b bVar = b.this;
                vm.this.b(bVar.k);
                if (c.BIDDING == b.this.k) {
                    z = vm.this.v.get();
                    jD = beVar2.R();
                } else {
                    z = vm.this.u.get();
                    jD = beVar2.D();
                }
                if (!z && jD != 0) {
                    vm.this.x = beVar2;
                    if (jD < 0) {
                        return;
                    }
                    b bVar2 = b.this;
                    vm.this.y = ho.a(jD, bVar2.f1179a, new Runnable() { // from class: com.applovin.impl.vm$b$a$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a();
                        }
                    });
                    return;
                }
                if (b.this.b(beVar2)) {
                    beVar = beVar2;
                    beVar2 = vm.this.x;
                } else {
                    beVar = vm.this.x;
                }
                vm.this.a(beVar2, beVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void a() {
                vm vmVar = vm.this;
                vmVar.b(vmVar.x);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.i;
                com.applovin.impl.sdk.t unused = b.this.c;
                if (com.applovin.impl.sdk.t.a()) {
                    b.this.c.a(b.this.h, "Ad (" + b.this.l + ") failed to load in " + jElapsedRealtime + "ms for " + vm.this.i + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                vm.this.a(bVar.j, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (vm.this.w.get()) {
                    return;
                }
                if (vm.this.x != null) {
                    b bVar2 = b.this;
                    if (b.this.b(vm.this.c(bVar2.k))) {
                        vm vmVar = vm.this;
                        vmVar.b(vmVar.x);
                        return;
                    }
                }
                b bVar3 = b.this;
                if ((!vm.this.d(bVar3.k)) && vm.this.v.get() && vm.this.u.get()) {
                    vm.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(be beVar) {
            if (vm.this.x == null) {
                return false;
            }
            if (beVar == null) {
                return true;
            }
            double dM = vm.this.x.M();
            double dM2 = beVar.M();
            return (dM < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dM2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? vm.this.x.I() < beVar.I() : dM > dM2;
        }
    }

    private void g() {
        a(this.n);
        a(this.p);
    }

    private void f() {
        ho hoVar = this.y;
        if (hoVar == null) {
            return;
        }
        hoVar.a();
        this.y = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(be beVar) {
        a(beVar, (be) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(c cVar) {
        if (c.BIDDING == cVar) {
            this.u.compareAndSet(false, true);
        } else if (c.TAG == cVar) {
            this.v.compareAndSet(false, true);
        }
    }

    private be a(c cVar) {
        return a(cVar, false);
    }

    private be a(c cVar, boolean z2) {
        Object objPoll;
        be beVar;
        Object objPoll2;
        be beVar2;
        if (cVar == c.BIDDING) {
            synchronized (this.q) {
                if (z2) {
                    objPoll2 = this.p.peek();
                } else {
                    objPoll2 = this.p.poll();
                }
                beVar2 = (be) objPoll2;
            }
            return beVar2;
        }
        synchronized (this.o) {
            if (z2) {
                objPoll = this.n.peek();
            } else {
                objPoll = this.n.poll();
            }
            beVar = (be) objPoll;
        }
        return beVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(be beVar, be beVar2) {
        if (this.w.compareAndSet(false, true)) {
            f();
            g();
            this.f1179a.V().a(beVar, beVar2);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.s;
            if (com.applovin.impl.sdk.t.a()) {
                this.c.d(this.b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + beVar.c() + " for " + this.i + " ad unit " + this.h);
            }
            beVar.a(new MaxAdWaterfallInfoImpl(beVar, jElapsedRealtime, this.t, this.m));
            bc.f(this.k, beVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        int i = 0;
        if (this.w.compareAndSet(false, true)) {
            if (maxError.getCode() == 204) {
                this.f1179a.F().c(aa.u);
            } else if (maxError.getCode() == -5001) {
                this.f1179a.F().c(aa.v);
            } else {
                this.f1179a.F().c(aa.w);
            }
            ArrayList arrayList = new ArrayList(this.t.size());
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.t) {
                if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                    arrayList.add(maxNetworkResponseInfo);
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
                sb.append("\n");
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
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.s;
            if (com.applovin.impl.sdk.t.a()) {
                this.c.d(this.b, "Waterfall failed in " + jElapsedRealtime + "ms for " + this.i + " ad unit " + this.h + " with error: " + maxError);
            }
            ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.j, "waterfall_name", ""), JsonUtils.getString(this.j, "waterfall_test_name", ""), jElapsedRealtime, this.t, JsonUtils.optList(JsonUtils.getJSONArray(this.j, "mwf_info_urls", null), Collections.EMPTY_LIST), this.m));
            bc.a(this.k, this.h, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(be beVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
        this.t.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(ve.b(beVar.b(), this.f1179a)), beVar.E(), beVar.W(), j, beVar.A(), maxError));
    }

    private void a(Queue queue) {
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            a((be) it.next(), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
        }
    }
}
