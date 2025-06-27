package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.em;
import com.applovin.impl.km;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.oj;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final k f678a;
    private final Map b = new HashMap(4);
    private final Object c = new Object();
    private final Map d = new HashMap(4);
    private final Object e = new Object();
    private final Map f = new HashMap();
    private final Object g = new Object();

    class a implements em.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f679a;
        final /* synthetic */ Map b;
        final /* synthetic */ String c;
        final /* synthetic */ MaxAdFormat d;
        final /* synthetic */ Map e;
        final /* synthetic */ Map f;
        final /* synthetic */ Context g;
        final /* synthetic */ a.InterfaceC0032a h;

        a(long j, Map map, String str, MaxAdFormat maxAdFormat, Map map2, Map map3, Context context, a.InterfaceC0032a interfaceC0032a) {
            this.f679a = j;
            this.b = map;
            this.c = str;
            this.d = maxAdFormat;
            this.e = map2;
            this.f = map3;
            this.g = context;
            this.h = interfaceC0032a;
        }

        @Override // com.applovin.impl.em.b
        public void a(JSONArray jSONArray) {
            this.b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f679a));
            this.b.put("calfc", Integer.valueOf(d.this.b(this.c)));
            km kmVar = new km(this.c, this.d, this.e, this.f, this.b, jSONArray, this.g, d.this.f678a, this.h);
            if (((Boolean) d.this.f678a.a(qe.J7)).booleanValue()) {
                d.this.f678a.l0().a((xl) kmVar, sm.b.MEDIATION);
            } else {
                d.this.f678a.l0().a(kmVar);
            }
        }
    }

    public enum b {
        PUBLISHER_INITIATED("publisher_initiated"),
        SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
        REFRESH(ToolBar.REFRESH),
        EXPONENTIAL_RETRY("exponential_retry"),
        EXPIRED("expired"),
        NATIVE_AD_PLACER("native_ad_placer");


        /* renamed from: a, reason: collision with root package name */
        private final String f680a;

        b(String str) {
            this.f680a = str;
        }

        public String b() {
            return this.f680a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements a.InterfaceC0032a {

        /* renamed from: a, reason: collision with root package name */
        private final k f681a;
        private final WeakReference b;
        private final d c;
        private final C0033d d;
        private final MaxAdFormat f;
        private final Map g;
        private final Map h;
        private final Map i;
        private final int j;
        private long k;
        private long l;

        /* synthetic */ c(Map map, Map map2, Map map3, C0033d c0033d, MaxAdFormat maxAdFormat, long j, long j2, d dVar, k kVar, Context context, a aVar) {
            this(map, map2, map3, c0033d, maxAdFormat, j, j2, dVar, kVar, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i, String str) {
            this.h.put("retry_delay_sec", Integer.valueOf(i));
            this.h.put("retry_attempt", Integer.valueOf(this.d.d));
            Context contextK = (Context) this.b.get();
            if (contextK == null) {
                contextK = k.k();
            }
            this.i.put("art", b.EXPONENTIAL_RETRY.b());
            this.i.put("era", Integer.valueOf(this.d.d));
            this.l = System.currentTimeMillis();
            this.c.a(str, this.f, this.g, this.h, this.i, contextK, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            this.c.c(str);
            if (((Boolean) this.f681a.a(qe.z7)).booleanValue() && this.d.c.get()) {
                this.f681a.L();
                if (t.a()) {
                    this.f681a.L().a("MediationAdLoadManager", "Ad failed to load but its load state was destroyed");
                    return;
                }
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.k;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f681a.S().processWaterfallInfoPostback(str, this.f, maxAdWaterfallInfoImpl, this.l, jElapsedRealtime);
            }
            boolean z = maxError.getCode() == -5603 && zp.c(this.f681a) && ((Boolean) this.f681a.a(oj.o6)).booleanValue();
            if (this.f681a.a(qe.y7, this.f) && this.d.d < this.j && !z) {
                C0033d.f(this.d);
                final int iPow = (int) Math.pow(2.0d, this.d.d);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.d$c$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.d.d = 0;
            this.d.b.set(false);
            if (this.d.e != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(this.d.f682a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                bc.a(this.d.e, str, maxError);
                this.d.e = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (((Boolean) this.f681a.a(qe.z7)).booleanValue() && this.d.c.get()) {
                this.f681a.L();
                if (t.a()) {
                    this.f681a.L().a("MediationAdLoadManager", "Ad loaded but its load state was destroyed");
                }
                this.f681a.S().destroyAd(maxAd);
                return;
            }
            be beVar = (be) maxAd;
            beVar.i(this.d.f682a);
            beVar.a(SystemClock.elapsedRealtime() - this.k);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) beVar.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f681a.S().processWaterfallInfoPostback(beVar.getAdUnitId(), this.f, maxAdWaterfallInfoImpl, this.l, beVar.getRequestLatencyMillis());
            }
            this.c.a(maxAd.getAdUnitId());
            this.d.d = 0;
            if (this.d.e == null) {
                this.c.a(beVar);
                this.d.b.set(false);
                return;
            }
            beVar.z().c().a(this.d.e);
            this.d.e.onAdLoaded(beVar);
            if (beVar.O().endsWith("load")) {
                this.d.e.onAdRevenuePaid(beVar);
            }
            this.d.e = null;
            if ((!this.f681a.c(qe.w7).contains(maxAd.getAdUnitId()) && !this.f681a.a(qe.v7, maxAd.getFormat())) || this.f681a.n0().c() || this.f681a.n0().d()) {
                this.d.b.set(false);
                return;
            }
            Context contextK = (Context) this.b.get();
            if (contextK == null) {
                contextK = k.k();
            }
            this.k = SystemClock.elapsedRealtime();
            this.l = System.currentTimeMillis();
            this.i.put("art", b.SEQUENTIAL_OR_PRECACHE.b());
            this.c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.g, this.h, this.i, contextK, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private c(Map map, Map map2, Map map3, C0033d c0033d, MaxAdFormat maxAdFormat, long j, long j2, d dVar, k kVar, Context context) {
            this.f681a = kVar;
            this.b = new WeakReference(context);
            this.c = dVar;
            this.d = c0033d;
            this.f = maxAdFormat;
            this.h = map2;
            this.g = map;
            this.i = map3;
            this.k = j;
            this.l = j2;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.j = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.j = Math.min(2, ((Integer) kVar.a(qe.x7)).intValue());
            } else {
                this.j = ((Integer) kVar.a(qe.x7)).intValue();
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$d, reason: collision with other inner class name */
    private static class C0033d {

        /* renamed from: a, reason: collision with root package name */
        private final String f682a;
        private final AtomicBoolean b;
        private final AtomicBoolean c;
        private int d;
        private volatile a.InterfaceC0032a e;

        /* synthetic */ C0033d(String str, a aVar) {
            this(str);
        }

        static /* synthetic */ int f(C0033d c0033d) {
            int i = c0033d.d;
            c0033d.d = i + 1;
            return i;
        }

        private C0033d(String str) {
            this.b = new AtomicBoolean();
            this.c = new AtomicBoolean();
            this.f682a = str;
        }
    }

    public d(k kVar) {
        this.f678a = kVar;
    }

    private String b(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    public void c(String str, String str2) {
        synchronized (this.c) {
            String strB = b(str, str2);
            a(str, str2).c.set(true);
            this.b.remove(strB);
        }
    }

    public boolean d(String str) {
        boolean z;
        synchronized (this.e) {
            z = this.d.get(str) != null;
        }
        return z;
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.g) {
            Integer num = (Integer) this.f.get(str);
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }

    public void c(String str) {
        synchronized (this.g) {
            this.f678a.L();
            if (t.a()) {
                this.f678a.L().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    private be e(String str) {
        be beVar;
        synchronized (this.e) {
            beVar = (be) this.d.get(str);
            this.d.remove(str);
        }
        return beVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(be beVar) {
        synchronized (this.e) {
            if (this.d.containsKey(beVar.getAdUnitId())) {
                t.h("AppLovinSdk", "Ad in cache already: " + beVar.getAdUnitId());
            }
            this.d.put(beVar.getAdUnitId(), beVar);
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, b bVar, Map map, Map map2, Context context, a.InterfaceC0032a interfaceC0032a) {
        be beVarE = (this.f678a.n0().d() || zp.f(k.k())) ? null : e(str);
        if (beVarE != null) {
            beVarE.i(str2);
            beVarE.z().c().a(interfaceC0032a);
            interfaceC0032a.onAdLoaded(beVarE);
            if (beVarE.O().endsWith("load")) {
                interfaceC0032a.onAdRevenuePaid(beVarE);
            }
        }
        C0033d c0033dA = a(str, str2);
        if (!c0033dA.b.compareAndSet(false, true)) {
            if (c0033dA.e != null && c0033dA.e != interfaceC0032a) {
                t.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            c0033dA.e = interfaceC0032a;
            return;
        }
        if (beVarE == null) {
            c0033dA.e = interfaceC0032a;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", bVar.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new c(map, map2, mapSynchronizedMap, c0033dA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f678a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0032a interfaceC0032a) {
        this.f678a.l0().a((xl) new em(str, maxAdFormat, map, context, this.f678a, new a(SystemClock.elapsedRealtime(), map3, str, maxAdFormat, map, map2, context, interfaceC0032a)), sm.b.MEDIATION);
    }

    private C0033d a(String str, String str2) {
        C0033d c0033d;
        synchronized (this.c) {
            String strB = b(str, str2);
            c0033d = (C0033d) this.b.get(strB);
            if (c0033d == null) {
                c0033d = new C0033d(str2, null);
                this.b.put(strB, c0033d);
            }
        }
        return c0033d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.g) {
            this.f678a.L();
            if (t.a()) {
                this.f678a.L().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f.remove(str);
        }
    }
}
