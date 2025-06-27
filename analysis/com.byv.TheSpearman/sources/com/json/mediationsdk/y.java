package com.json.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.json.c2;
import com.json.ca;
import com.json.environment.ContextProvider;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.f2;
import com.json.g2;
import com.json.i1;
import com.json.i6;
import com.json.j6;
import com.json.k6;
import com.json.l4;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.h;
import com.json.mediationsdk.impressionData.ImpressionDataListener;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.n8;
import com.json.o8;
import com.json.sc;
import com.json.tb;
import com.json.v6;
import com.json.x7;
import com.json.y0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class y extends m implements tb, y0, k6 {
    boolean A;
    private final x7 B;
    private final x7.a C;
    private sc e;
    private e f;
    private final ConcurrentHashMap<String, z> g;
    private CopyOnWriteArrayList<z> h;
    private ConcurrentHashMap<String, i1> i;
    private ConcurrentHashMap<String, h.a> j;
    private i1 k;
    private String l;
    private String m;
    private JSONObject n;
    private int o;
    private boolean p;
    private final boolean q;
    private final long r;
    private boolean s;
    private com.json.mediationsdk.e t;
    private h u;
    private long v;
    private long w;
    private long x;
    private int y;
    private String z;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f2018a;
        final /* synthetic */ n8 b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        a(NetworkSettings networkSettings, n8 n8Var, String str, String str2) {
            this.f2018a = networkSettings;
            this.b = n8Var;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.a(this.f2018a, this.b, this.c, this.d);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.m = "";
            y.this.n = null;
            if (y.this.m()) {
                return;
            }
            y.this.a(2000, (Object[][]) null);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            y.this.b(map, arrayList, sb, arrayList2);
            if (y.this.q) {
                y.this.a(map, arrayList, sb, arrayList2);
            } else {
                y.this.a(map, arrayList, sb.toString());
            }
        }
    }

    class c implements f2.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f2020a;
        final /* synthetic */ StringBuilder b;
        final /* synthetic */ List c;

        c(Map map, StringBuilder sb, List list) {
            this.f2020a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.f2.b
        public void a(List<g2> list, long j, List<String> list2) {
            y.this.a(IronSourceConstants.IS_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            for (g2 g2Var : list) {
                if (g2Var.a() != null) {
                    this.f2020a.put(g2Var.c(), g2Var.a());
                    StringBuilder sb = this.b;
                    sb.append(g2Var.d());
                    sb.append(g2Var.c());
                    sb.append(",");
                    y yVar = y.this;
                    yVar.a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, (z) yVar.g.get(g2Var.c()), new Object[][]{new Object[]{"duration", Long.valueOf(g2Var.e())}});
                } else {
                    y yVar2 = y.this;
                    yVar2.a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, (z) yVar2.g.get(g2Var.c()), new Object[][]{new Object[]{"duration", Long.valueOf(g2Var.e())}, new Object[]{"reason", g2Var.b()}});
                }
            }
            for (String str : list2) {
                y yVar3 = y.this;
                yVar3.a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, (z) yVar3.g.get(str), new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            }
            y.this.a((Map<String, Object>) this.f2020a, (List<String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.f2.b
        public void onFailure(String str) {
            y.this.a(IronSourceConstants.IS_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{"reason", str}});
            y.this.a((Map<String, Object>) this.f2020a, (List<String>) this.c, this.b.toString());
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.k();
        }
    }

    enum e {
        STATE_NOT_INITIALIZED,
        STATE_READY_TO_LOAD,
        STATE_AUCTION,
        STATE_LOADING_SMASHES,
        STATE_READY_TO_SHOW,
        STATE_SHOWING
    }

    y(j6 j6Var, i6 i6Var, List<NetworkSettings> list, n8 n8Var, String str, String str2, int i, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) throws InterruptedException {
        super(hashSet, ironSourceSegment);
        this.z = "";
        this.A = false;
        this.B = j6Var.d();
        this.C = i6Var.b();
        long time = new Date().getTime();
        a(IronSourceConstants.IS_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_IS_MANAGER_NAME}});
        a(e.STATE_NOT_INITIALIZED);
        ConcurrentHashMap<String, z> concurrentHashMap = new ConcurrentHashMap<>();
        this.g = concurrentHashMap;
        this.h = new CopyOnWriteArrayList<>();
        this.i = new ConcurrentHashMap<>();
        this.j = new ConcurrentHashMap<>();
        this.l = "";
        this.m = "";
        this.n = null;
        this.o = n8Var.c();
        this.p = n8Var.f();
        this.q = n8Var.h();
        this.r = n8Var.i();
        n nVarA = n.a();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        nVarA.a(ad_unit, i);
        com.json.mediationsdk.utils.a aVarG = n8Var.g();
        this.w = aVarG.k();
        boolean z = aVarG.g() > 0;
        this.s = z;
        if (z) {
            this.t = new com.json.mediationsdk.e(ad_unit, aVarG, this);
        }
        a(list, n8Var, str, str2);
        this.u = new h(list, aVarG.c());
        this.e = new sc(new ArrayList(concurrentHashMap.values()));
        for (z zVar : concurrentHashMap.values()) {
            if (zVar.r()) {
                zVar.t();
            }
        }
        this.v = new Date().getTime();
        a(e.STATE_READY_TO_LOAD);
        a(IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    public y(List<NetworkSettings> list, n8 n8Var, String str, String str2, int i, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this(ca.h(), ca.g(), list, n8Var, str, str2, i, hashSet, ironSourceSegment);
    }

    private String a(i1 i1Var) {
        z zVar = this.g.get(i1Var.c());
        return (zVar != null ? Integer.toString(zVar.g()) : TextUtils.isEmpty(i1Var.j()) ? "1" : "2") + i1Var.c();
    }

    private void a(int i) {
        a(i, (Object[][]) null, false);
    }

    private void a(int i, z zVar) {
        a(i, zVar, (Object[][]) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, z zVar, Object[][] objArr) {
        a(i, zVar, objArr, false);
    }

    private void a(int i, z zVar, Object[][] objArr, boolean z) {
        Map<String, Object> mapM = zVar.m();
        if (!TextUtils.isEmpty(this.m)) {
            mapM.put("auctionId", this.m);
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.n);
        }
        if (z && !TextUtils.isEmpty(this.l)) {
            mapM.put("placement", this.l);
        }
        if (c(i)) {
            o8.i().a(mapM, this.y, this.z);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e2), 3);
            }
        }
        o8.i().a(new l4(i, new JSONObject(mapM)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object[][] objArr) {
        a(i, objArr, false);
    }

    private void a(int i, Object[][] objArr, boolean z) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.m)) {
            map.put("auctionId", this.m);
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null && jSONObject.length() > 0) {
            map.put("genericParams", this.n);
        }
        if (z && !TextUtils.isEmpty(this.l)) {
            map.put("placement", this.l);
        }
        if (c(i)) {
            o8.i().a(map, this.y, this.z);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    map.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e2) {
                b("sendMediationEvent " + e2.getMessage());
            }
        }
        o8.i().a(new l4(i, new JSONObject(map)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings, n8 n8Var, String str, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter abstractAdapterA = com.json.mediationsdk.c.b().a(networkSettings, networkSettings.getInterstitialSettings(), false);
        if (abstractAdapterA != null) {
            z zVar = new z(str, str2, networkSettings, this, n8Var.d(), abstractAdapterA);
            this.g.put(zVar.c(), zVar);
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    private void a(e eVar) {
        this.f = eVar;
        b("state=" + eVar);
    }

    private void a(z zVar, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + zVar.c() + " : " + str, 0);
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void a(List<i1> list) {
        this.h.clear();
        this.i.clear();
        this.j.clear();
        StringBuilder sb = new StringBuilder();
        for (i1 i1Var : list) {
            sb.append(a(i1Var) + ",");
            z zVar = this.g.get(i1Var.c());
            if (zVar != null) {
                zVar.a(true);
                this.h.add(zVar);
                this.i.put(zVar.c(), i1Var);
                this.j.put(i1Var.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                b("updateWaterfall() - could not find matching smash for auction response item " + i1Var.c());
            }
        }
        b("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            b("Updated waterfall is empty");
        }
        a(IronSourceConstants.IS_RESULT_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
    }

    private void a(List<NetworkSettings> list, n8 n8Var, String str, String str2) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next(), n8Var, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(n8Var.l(), n8Var.o(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        if (map.size() == 0 && list.size() == 0) {
            a(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}});
            b("makeAuction() failed - No candidates available for auctioning");
            n.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1005, "No candidates available for auctioning"));
            a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
            a(e.STATE_READY_TO_LOAD);
            return;
        }
        a(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str}});
        int iA = this.B.a(IronSource.AD_UNIT.INTERSTITIAL);
        com.json.mediationsdk.e eVar = this.t;
        if (eVar != null) {
            eVar.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.u, iA, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<c2> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        f2 f2Var = new f2();
        c cVar = new c(map, sb, list);
        a(IronSourceConstants.IS_COLLECT_TOKENS);
        f2Var.a(list2, cVar, this.r, TimeUnit.MILLISECONDS);
    }

    private void b(int i) {
        a(i, (Object[][]) null, true);
    }

    private void b(int i, z zVar) {
        a(i, zVar, (Object[][]) null, true);
    }

    private void b(int i, z zVar, Object[][] objArr) {
        a(i, zVar, objArr, true);
    }

    private void b(int i, Object[][] objArr) {
        a(i, objArr, true);
    }

    private void b(z zVar, String str) {
        a(e.STATE_SHOWING);
        zVar.x();
        b(2201, zVar);
        this.e.a(zVar);
        if (this.e.b(zVar)) {
            a(IronSourceConstants.IS_CAP_SESSION, zVar);
            IronSourceUtils.sendAutomationLog(zVar.c() + " was session capped");
        }
        com.json.mediationsdk.utils.b.b(ContextProvider.getInstance().getApplicationContext(), str);
        if (com.json.mediationsdk.utils.b.e(ContextProvider.getInstance().getApplicationContext(), str)) {
            b(IronSourceConstants.IS_CAP_PLACEMENT);
        }
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<c2> list2) {
        for (z zVar : this.g.values()) {
            if (h(zVar)) {
                if (!zVar.p()) {
                    list.add(zVar.c());
                    sb.append(zVar.g() + zVar.c() + ",");
                } else if (this.q) {
                    list2.add(new c2(zVar.g(), zVar.c(), null, zVar, null, null));
                } else {
                    try {
                        Map<String, Object> mapA = zVar.a((AdData) null);
                        if (mapA != null) {
                            map.put(zVar.c(), mapA);
                            sb.append(zVar.g() + zVar.c() + ",");
                        } else {
                            a(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, zVar, new Object[][]{new Object[]{"reason", "Missing bidding data"}});
                        }
                    } catch (Exception e2) {
                        String str = "prepareAuctionCandidates - exception while calling smash.getBiddingData - " + e2.getMessage();
                        IronLog.INTERNAL.error(str);
                        zVar.a(IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, new Object[][]{new Object[]{"reason", str}});
                    } catch (NoClassDefFoundError e3) {
                        String str2 = "prepareAuctionCandidates - error while calling smash.getBiddingData - " + e3.getMessage();
                        IronLog.INTERNAL.error(str2);
                        zVar.a(IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, new Object[][]{new Object[]{"reason", str2}});
                    }
                }
            }
        }
    }

    private boolean c(int i) {
        return i == 2002 || i == 2003 || i == 2200 || i == 2213 || i == 2005 || i == 2204 || i == 2201 || i == 2203 || i == 2006 || i == 2004 || i == 2110 || i == 2301 || i == 2300 || i == 2303;
    }

    private List<i1> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (z zVar : this.g.values()) {
            if (!zVar.p() && h(zVar)) {
                copyOnWriteArrayList.add(new i1(zVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void g(z zVar) {
        String strJ = this.i.get(zVar.c()).j();
        JSONObject jSONObjectA = this.i.get(zVar.c()).a();
        zVar.c(strJ);
        a(2002, zVar);
        zVar.a(strJ, jSONObjectA);
    }

    private boolean h(z zVar) {
        IronLog.INTERNAL.verbose();
        return (zVar == null || zVar.o() || this.e.b(zVar)) ? false : true;
    }

    private void j() {
        if (this.h.isEmpty()) {
            a(e.STATE_READY_TO_LOAD);
            a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES)}, new Object[]{"reason", "Empty waterfall"}});
            n.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Empty waterfall"));
            return;
        }
        a(e.STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.h.size() && i < this.o; i2++) {
            z zVar = this.h.get(i2);
            if (zVar.h()) {
                if (this.p && zVar.p()) {
                    if (i != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + zVar.c() + " as a non bidder is being loaded";
                        b(str);
                        IronSourceUtils.sendAutomationLog(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + zVar.c() + ". No other instances will be loaded at the same time.";
                    b(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    g(zVar);
                    return;
                }
                g(zVar);
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        a(e.STATE_AUCTION);
        AsyncTask.execute(new b());
    }

    private void l() {
        List<i1> listG = g();
        this.m = e();
        a(listG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        long time = this.w - (new Date().getTime() - this.v);
        if (time <= 0) {
            return false;
        }
        IronLog.INTERNAL.verbose("delaying auction by " + time);
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new d(), time);
        return true;
    }

    @Override // com.json.y0
    public void a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        b(str3);
        IronSourceUtils.sendAutomationLog("IS: " + str3);
        this.y = i2;
        this.z = str2;
        this.n = null;
        l();
        if (TextUtils.isEmpty(str)) {
            a(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            a(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}});
        }
        j();
    }

    public synchronized void a(Activity activity, String str) {
        e eVar = this.f;
        if (eVar == e.STATE_SHOWING) {
            a("showInterstitial error: can't show ad while an ad is already showing");
            v6.a().a(new IronSourceError(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, "showInterstitial error: can't show ad while an ad is already showing"), this.d);
            a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW)}, new Object[]{"reason", "showInterstitial error: can't show ad while an ad is already showing"}});
            return;
        }
        if (eVar != e.STATE_READY_TO_SHOW) {
            b("showInterstitial() error state=" + this.f.toString());
            a("showInterstitial error: show called while no ads are available");
            v6.a().a(new IronSourceError(509, "showInterstitial error: show called while no ads are available"), this.d);
            a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 509}, new Object[]{"reason", "showInterstitial error: show called while no ads are available"}});
            return;
        }
        if (str == null) {
            a("showInterstitial error: empty default placement");
            v6.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement"), this.d);
            a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1020}, new Object[]{"reason", "showInterstitial error: empty default placement"}});
            return;
        }
        this.l = str;
        b(2100, activity != null ? new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}} : null);
        if (com.json.mediationsdk.utils.b.e(ContextProvider.getInstance().getApplicationContext(), str)) {
            String str2 = "placement " + this.l + " is capped";
            a(str2);
            v6.a().a(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str2), this.d);
            b(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{"reason", str2}});
            return;
        }
        Iterator<z> it = this.h.iterator();
        while (it.hasNext()) {
            z next = it.next();
            if (next.v()) {
                b(next, str);
                return;
            }
            b("showInterstitial " + next.c() + " isReadyToShow() == false");
        }
        v6.a().a(ErrorBuilder.buildNoAdsToShowError("Interstitial"), this.d);
        b(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 509}, new Object[]{"reason", "Show Fail - No ads to show"}});
    }

    void a(Context context, boolean z) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Should Track Network State: " + z, 0);
        this.A = z;
    }

    @Override // com.json.tb
    public void a(IronSourceError ironSourceError, z zVar) {
        a(IronSourceConstants.IS_INSTANCE_INIT_FAILED, zVar, new Object[][]{new Object[]{"reason", ironSourceError.getErrorMessage()}});
    }

    @Override // com.json.tb
    public void a(IronSourceError ironSourceError, z zVar, long j) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        synchronized (this) {
            a(zVar, "onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.f.name());
            if (ironSourceError.getErrorCode() == 1158) {
                a(2213, zVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j)}});
            } else {
                a(2200, zVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j)}});
            }
            if (zVar != null && this.j.containsKey(zVar.c())) {
                this.j.put(zVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
            }
            Iterator<z> it = this.h.iterator();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                z next = it.next();
                if (next.h()) {
                    if (this.p && next.p()) {
                        if (!z && !z2) {
                            String str = "Advanced Loading: Starting to load bidder " + next.c() + ". No other instances will be loaded at the same time.";
                            b(str);
                            IronSourceUtils.sendAutomationLog(str);
                        }
                        String str2 = "Advanced Loading: Won't start loading bidder " + next.c() + " as " + (z ? "a non bidder is being loaded" : "a non bidder was already loaded successfully");
                        b(str2);
                        IronSourceUtils.sendAutomationLog(str2);
                    }
                    copyOnWriteArrayList.add(next);
                    if (!this.p || !zVar.p() || next.p() || copyOnWriteArrayList.size() >= this.o) {
                        break;
                    }
                } else if (!next.u()) {
                    if (next.v()) {
                        z2 = true;
                    }
                }
                z = true;
            }
            if (copyOnWriteArrayList.size() == 0 && this.f == e.STATE_LOADING_SMASHES && !z) {
                n.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(509, "No ads to show"));
                a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 509}});
                a(e.STATE_READY_TO_LOAD);
            }
        }
        IronLog.INTERNAL.verbose("smashesToLoad.size() = " + copyOnWriteArrayList.size());
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            g((z) it2.next());
        }
    }

    @Override // com.json.tb
    public void a(z zVar) {
        synchronized (this) {
            a(zVar, "onInterstitialAdOpened");
            b(2005, zVar);
            if (this.s) {
                i1 i1Var = this.i.get(zVar.c());
                if (i1Var != null) {
                    a(i1Var.a(this.l));
                    this.t.a(i1Var, zVar.g(), this.k, this.l);
                    this.j.put(zVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
                    a(i1Var, this.l);
                } else {
                    String strC = zVar.c();
                    b("onInterstitialAdOpened showing instance " + strC + " missing from waterfall");
                    a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{"reason", "Showing missing " + this.f}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
                }
            }
            v6.a().d(this.d);
        }
    }

    @Override // com.json.tb
    public void a(z zVar, long j) {
        synchronized (this) {
            a(zVar, "onInterstitialAdReady");
            a(2003, zVar, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            if (zVar != null && this.j.containsKey(zVar.c())) {
                this.j.put(zVar.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
            }
            if (this.f == e.STATE_LOADING_SMASHES) {
                a(e.STATE_READY_TO_SHOW);
                a(2004, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.x)}});
                if (this.s) {
                    i1 i1Var = this.i.get(zVar.c());
                    if (i1Var != null) {
                        a(i1Var.a(""));
                        this.t.a(i1Var, zVar.g(), this.k);
                        this.t.a(this.h, this.i, zVar.g(), this.k, i1Var);
                    } else {
                        String strC = zVar.c();
                        b("onInterstitialAdReady winner instance " + strC + " missing from waterfall");
                        a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
                    }
                }
                v6.a().e(this.d);
            }
        }
    }

    @Override // com.json.y0
    public void a(List<i1> list, String str, i1 i1Var, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        this.m = str;
        this.k = i1Var;
        this.n = jSONObject;
        this.y = i;
        this.z = "";
        if (!TextUtils.isEmpty(str2)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str2}});
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        a(jSONObject2, ad_unit);
        if (this.b.a(ad_unit)) {
            a(2303, new Object[][]{new Object[]{"auctionId", str}});
            a(e.STATE_READY_TO_LOAD);
            n.a().a(ad_unit, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"));
        } else {
            a(IronSourceConstants.IS_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            a(list);
            j();
        }
    }

    @Override // com.json.tb
    public void b(IronSourceError ironSourceError, z zVar) {
        i1 i1Var;
        synchronized (this) {
            if (this.s && (i1Var = this.i.get(zVar.c())) != null) {
                a(i1Var.a(this.l));
            }
            a(zVar, "onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
            v6.a().a(ironSourceError, this.d);
            b(2203, zVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
            this.j.put(zVar.c(), h.a.ISAuctionPerformanceFailedToShow);
            a(e.STATE_READY_TO_LOAD);
        }
    }

    @Override // com.json.tb
    public void b(z zVar) {
        a(IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, zVar);
    }

    @Override // com.json.tb
    public void c(z zVar) {
        synchronized (this) {
            a(zVar, "onInterstitialAdClosed");
            x7 x7Var = this.B;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            b(2204, zVar, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(x7Var.a(ad_unit))}});
            this.C.b(ad_unit);
            v6.a().c(this.d);
            a(e.STATE_READY_TO_LOAD);
        }
    }

    @Override // com.json.tb
    public void d(z zVar) {
        a(zVar, "onInterstitialAdClicked");
        v6.a().b(this.d);
        b(2006, zVar);
    }

    @Override // com.json.tb
    public void e(z zVar) {
        a(zVar, "onInterstitialAdVisible");
    }

    @Override // com.json.tb
    public void f(z zVar) {
        a(zVar, "onInterstitialAdShowSucceeded");
        v6.a().f(this.d);
        b(2202, zVar);
    }

    public synchronized boolean h() {
        if ((this.A && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) || this.f != e.STATE_READY_TO_SHOW) {
            return false;
        }
        Iterator<z> it = this.h.iterator();
        while (it.hasNext()) {
            if (it.next().v()) {
                return true;
            }
        }
        return false;
    }

    public synchronized void i() {
        e eVar = this.f;
        if (eVar == e.STATE_SHOWING) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "loadInterstitial: load cannot be invoked while showing an ad", 3);
            v6.a().a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial: load cannot be invoked while showing an ad"));
            return;
        }
        if (eVar == e.STATE_READY_TO_LOAD || eVar == e.STATE_READY_TO_SHOW) {
            n nVarA = n.a();
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            if (!nVarA.b(ad_unit)) {
                this.m = "";
                this.l = "";
                this.n = null;
                a(ad_unit);
                f();
                a(2001);
                this.x = new Date().getTime();
                if (this.s) {
                    if (!this.j.isEmpty()) {
                        this.u.a(this.j);
                        this.j.clear();
                    }
                    k();
                } else {
                    l();
                    j();
                }
                return;
            }
        }
        b("loadInterstitial: load is already in progress");
    }
}
