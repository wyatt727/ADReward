package com.json.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.json.c2;
import com.json.cc;
import com.json.dc;
import com.json.environment.ContextProvider;
import com.json.environment.NetworkStateReceiver;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.f2;
import com.json.fc;
import com.json.g2;
import com.json.gc;
import com.json.i1;
import com.json.l4;
import com.json.l6;
import com.json.l9;
import com.json.m;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.h;
import com.json.mediationsdk.impressionData.ImpressionDataListener;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.qa;
import com.json.s9;
import com.json.sc;
import com.json.t9;
import com.json.v4;
import com.json.wb;
import com.json.y0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class q extends m implements s9, gc, y0, l6, qa, m {
    private long A;
    private Boolean B;
    private final Object C;
    private v4 D;
    private final boolean E;
    private final long F;
    private t9 e;
    private ConcurrentHashMap<String, i1> f;
    private ConcurrentHashMap<String, h.a> g;
    private i1 h;
    private h i;
    private com.json.mediationsdk.e j;
    private JSONObject k;
    private fc l;
    private boolean m;
    private long n;
    private String o;
    private int p;
    private NetworkStateReceiver q;
    private boolean r;
    private final ConcurrentHashMap<String, r> s;
    private sc t;
    private int u;
    private String v;
    private int w;
    private boolean x;
    private boolean y;
    private e z;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f1981a;
        final /* synthetic */ cc b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        a(NetworkSettings networkSettings, cc ccVar, String str, String str2) {
            this.f1981a = networkSettings;
            this.b = ccVar;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.a(this.f1981a, this.b, this.c, this.d);
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            q.this.j();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.d("makeAuction()");
            q.this.n = new Date().getTime();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            q.this.b(map, arrayList, sb, arrayList2);
            if (q.this.E) {
                q.this.a(map, arrayList, sb, arrayList2);
            } else {
                q.this.a(map, arrayList, sb.toString());
            }
        }
    }

    class d implements f2.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f1984a;
        final /* synthetic */ StringBuilder b;
        final /* synthetic */ List c;

        d(Map map, StringBuilder sb, List list) {
            this.f1984a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.f2.b
        public void a(List<g2> list, long j, List<String> list2) {
            q.this.c(IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, l9.a(new Object[][]{new Object[]{"duration", Long.valueOf(j)}}));
            for (g2 g2Var : list) {
                r rVar = (r) q.this.s.get(g2Var.c());
                if (g2Var.a() != null) {
                    this.f1984a.put(g2Var.c(), g2Var.a());
                    StringBuilder sb = this.b;
                    sb.append(g2Var.d());
                    sb.append(g2Var.c());
                    sb.append(",");
                    if (rVar != null) {
                        rVar.a(1021, new Object[][]{new Object[]{"duration", Long.valueOf(g2Var.e())}});
                    }
                } else if (rVar != null) {
                    rVar.a(1022, new Object[][]{new Object[]{"duration", Long.valueOf(g2Var.e())}, new Object[]{"reason", g2Var.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                r rVar2 = (r) q.this.s.get(it.next());
                if (rVar2 != null) {
                    rVar2.a(1023, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
                }
            }
            q.this.a((Map<String, Object>) this.f1984a, (List<String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.f2.b
        public void onFailure(String str) {
            q.this.c(IronSourceConstants.RV_COLLECT_TOKENS_FAILED, l9.a(new Object[][]{new Object[]{"reason", str}}));
            q.this.a((Map<String, Object>) this.f1984a, (List<String>) this.c, this.b.toString());
        }
    }

    private enum e {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public q(List<NetworkSettings> list, cc ccVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) throws InterruptedException {
        super(hashSet, ironSourceSegment);
        this.o = "";
        this.r = false;
        this.u = 1;
        this.C = new Object();
        long time = new Date().getTime();
        c(IronSourceConstants.RV_MANAGER_INIT_STARTED, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}));
        a(e.RV_STATE_INITIATING);
        this.B = null;
        this.w = ccVar.g();
        this.x = ccVar.j();
        this.v = "";
        this.k = null;
        com.json.mediationsdk.utils.a aVarK = ccVar.k();
        this.y = false;
        this.e = new t9(ccVar.k().f(), ccVar.k().i());
        this.f = new ConcurrentHashMap<>();
        this.g = new ConcurrentHashMap<>();
        this.A = new Date().getTime();
        boolean z = aVarK.g() > 0;
        this.m = z;
        if (z) {
            this.j = new com.json.mediationsdk.e(IronSource.AD_UNIT.REWARDED_VIDEO, aVarK, this);
        }
        this.l = new fc(aVarK, this);
        ConcurrentHashMap<String, r> concurrentHashMap = new ConcurrentHashMap<>();
        this.s = concurrentHashMap;
        a(list, ccVar, str, str2);
        this.i = new h(list, aVarK.c());
        this.t = new sc(new ArrayList(concurrentHashMap.values()));
        this.D = new v4(ccVar.c(), this);
        this.E = ccVar.l();
        this.F = ccVar.m();
        c(IronSourceConstants.RV_MANAGER_INIT_ENDED, l9.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        a(aVarK.k());
    }

    private String a(i1 i1Var) {
        r rVar = this.s.get(i1Var.c());
        return (rVar != null ? Integer.toString(rVar.g()) : TextUtils.isEmpty(i1Var.j()) ? "1" : "2") + i1Var.c();
    }

    private void a(int i) {
        a(i, (Map<String, Object>) null, true, true);
    }

    private void a(int i, Map<String, Object> map) {
        a(i, map, false, true);
    }

    private void a(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map2.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z2 && !TextUtils.isEmpty(this.e.d())) {
            map2.put("auctionId", this.e.d());
        }
        JSONObject jSONObject = this.k;
        if (jSONObject != null && jSONObject.length() > 0) {
            map2.put("genericParams", this.k);
        }
        if (z && !TextUtils.isEmpty(this.v)) {
            map2.put("placement", this.v);
        }
        if (c(i)) {
            dc.i().a(map2, this.p, this.o);
        }
        map2.put("sessionDepth", Integer.valueOf(this.u));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    map2.putAll(map);
                }
            } catch (Exception e2) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e2), 3);
            }
        }
        dc.i().a(new l4(i, new JSONObject(map2)));
    }

    private void a(long j) {
        Map<String, Object> mapA;
        if (this.t.a()) {
            d("all smashes are capped");
            mapA = l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{"reason", "all smashes are capped"}});
        } else {
            a(IronSource.AD_UNIT.REWARDED_VIDEO);
            if (this.m) {
                if (!this.g.isEmpty()) {
                    this.i.a(this.g);
                    this.g.clear();
                }
                new Timer().schedule(new b(), j);
                return;
            }
            d("auction fallback flow starting");
            k();
            if (!this.e.c().isEmpty()) {
                b(1000);
                i();
                return;
            } else {
                d("loadSmashes -  waterfall is empty");
                mapA = l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}});
            }
        }
        a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, mapA);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings, cc ccVar, String str, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter abstractAdapterA = com.json.mediationsdk.c.b().a(networkSettings, networkSettings.getRewardedVideoSettings(), false);
        if (abstractAdapterA != null) {
            r rVar = new r(str, str2, networkSettings, this, ccVar.h(), abstractAdapterA, this.u);
            this.s.put(rVar.c(), rVar);
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    private void a(e eVar) {
        d("current state=" + this.z + ", new state=" + eVar);
        this.z = eVar;
    }

    private void a(r rVar, String str) {
        String str2 = rVar.c() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void a(List<NetworkSettings> list, cc ccVar, String str, String str2) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next(), ccVar, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(ccVar.f(), ccVar.q(), arrayList);
    }

    private void a(List<i1> list, String str, JSONObject jSONObject) {
        this.f.clear();
        this.g.clear();
        CopyOnWriteArrayList<r> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (i1 i1Var : list) {
            sb.append(a(i1Var) + ",");
            r rVar = this.s.get(i1Var.c());
            if (rVar != null) {
                AbstractAdapter abstractAdapterA = com.json.mediationsdk.c.b().a(rVar.b.h());
                if (abstractAdapterA != null) {
                    r rVar2 = new r(rVar, this, abstractAdapterA, this.u, str, jSONObject, this.p, this.o);
                    rVar2.a(true);
                    copyOnWriteArrayList.add(rVar2);
                    this.f.put(rVar2.c(), i1Var);
                    this.g.put(i1Var.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                d("updateWaterfall() - could not find matching smash for auction response item " + i1Var.c());
            }
        }
        this.e.a(copyOnWriteArrayList, str);
        if (this.e.a()) {
            a(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, l9.a(new Object[][]{new Object[]{"reason", "waterfalls hold too many with size=" + this.e.e()}}));
        }
        d("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            d("Updated waterfall is empty");
        }
        a(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            c(IronSourceConstants.RV_AUCTION_FAILED, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
            d("makeAuction() failed - No candidates available for auctioning");
            h();
            return;
        }
        d("makeAuction() - request waterfall is: " + str);
        b(1000);
        b(IronSourceConstants.RV_AUCTION_REQUEST);
        c(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}));
        this.j.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.i, this.u, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<c2> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        f2 f2Var = new f2();
        d dVar = new d(map, sb, list);
        b(IronSourceConstants.RV_COLLECT_TOKENS);
        f2Var.a(list2, dVar, this.F, TimeUnit.MILLISECONDS);
    }

    private void a(boolean z, Map<String, Object> map) {
        synchronized (this.C) {
            Boolean bool = this.B;
            if (bool == null || bool.booleanValue() != z) {
                this.B = Boolean.valueOf(z);
                long time = new Date().getTime() - this.A;
                this.A = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("duration", Long.valueOf(time));
                a(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                wb wbVarA = wb.a();
                t9 t9Var = this.e;
                wbVarA.a(z, t9Var.a(t9Var.d()));
            }
        }
    }

    private void b(int i) {
        a(i, (Map<String, Object>) null, false, false);
    }

    private void b(int i, Map<String, Object> map) {
        a(i, map, true, true);
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<c2> list2) {
        for (r rVar : this.s.values()) {
            if (!this.t.b(rVar) && this.e.b(rVar)) {
                if (!rVar.p()) {
                    list.add(rVar.c());
                    sb.append(rVar.g() + rVar.c() + ",");
                } else if (this.E) {
                    list2.add(new c2(rVar.g(), rVar.c(), null, rVar, null, null));
                } else {
                    try {
                        Map<String, Object> mapA = rVar.a((AdData) null);
                        if (mapA != null) {
                            map.put(rVar.c(), mapA);
                            sb.append(rVar.g() + rVar.c() + ",");
                        } else {
                            rVar.a(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, new Object[][]{new Object[]{"reason", "Missing bidding data"}});
                        }
                    } catch (Exception e2) {
                        String str = "prepareAuctionCandidates - exception while calling smash.getBiddingData - " + e2.getMessage();
                        IronLog.INTERNAL.error(str);
                        rVar.a(IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, new Object[][]{new Object[]{"reason", str}});
                    } catch (NoClassDefFoundError e3) {
                        String str2 = "prepareAuctionCandidates - error while calling smash.getBiddingData - " + e3.getMessage();
                        IronLog.INTERNAL.error(str2);
                        rVar.a(IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, new Object[][]{new Object[]{"reason", str2}});
                    }
                }
            }
        }
    }

    private void b(boolean z) {
        a(z, (Map<String, Object>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, Map<String, Object> map) {
        a(i, map, false, false);
    }

    private void c(r rVar, Placement placement) {
        d("showVideo()");
        this.t.a(rVar);
        if (this.t.b(rVar)) {
            rVar.B();
            IronSourceUtils.sendAutomationLog(rVar.c() + " rewarded video is now session capped");
        }
        com.json.mediationsdk.utils.b.c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
        if (com.json.mediationsdk.utils.b.f(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
            a(IronSourceConstants.RV_CAP_PLACEMENT);
        }
        this.D.a();
        rVar.a(placement);
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 3);
    }

    private boolean c(int i) {
        return i == 1003 || i == 1302 || i == 1301 || i == 1303;
    }

    private boolean c(boolean z) {
        Boolean bool = this.B;
        if (bool == null) {
            return false;
        }
        return (z && !bool.booleanValue() && d()) || (!z && this.B.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 0);
    }

    private List<i1> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (r rVar : this.s.values()) {
            if (!rVar.p() && !this.t.b(rVar) && this.e.b(rVar)) {
                copyOnWriteArrayList.add(new i1(rVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void g(r rVar) {
        String strJ = this.f.get(rVar.c()).j();
        JSONObject jSONObjectA = this.f.get(rVar.c()).a();
        rVar.c(strJ);
        rVar.a(strJ, jSONObjectA);
    }

    private void h() {
        a(e.RV_STATE_NOT_LOADED);
        if (!this.y) {
            b(false);
        }
        this.l.a();
    }

    private void i() {
        if (this.e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
            return;
        }
        a(e.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.e.c().size() && i < this.w; i2++) {
            r rVar = this.e.c().get(i2);
            if (rVar.h()) {
                if (this.x && rVar.p()) {
                    if (i != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + rVar.c() + " as a non bidder is being loaded";
                        d(str);
                        IronSourceUtils.sendAutomationLog(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + rVar.c() + ". No other instances will be loaded at the same time.";
                    d(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    g(rVar);
                    return;
                }
                g(rVar);
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.C) {
            e eVar = this.z;
            e eVar2 = e.RV_STATE_AUCTION_IN_PROGRESS;
            if (eVar != eVar2) {
                a(eVar2);
                AsyncTask.execute(new c());
            }
        }
    }

    private void k() {
        a(g(), "fallback_" + System.currentTimeMillis(), this.k);
    }

    @Override // com.json.gc
    public void a() {
        d("onLoadTriggered: RV load was triggered in " + this.z + " state");
        a(0L);
    }

    @Override // com.json.y0
    public void a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        d(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.p = i2;
        this.o = str2;
        this.k = null;
        k();
        a(IronSourceConstants.RV_AUCTION_FAILED, TextUtils.isEmpty(str) ? l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(j)}}) : l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}}));
        i();
    }

    @Override // com.json.l6
    public void a(Activity activity, Placement placement) {
        synchronized (this.C) {
            if (placement == null) {
                a("showRewardedVideo error: empty default placement");
                IronSourceError ironSourceError = new IronSourceError(1021, "showRewardedVideo error: empty default placement");
                wb wbVarA = wb.a();
                t9 t9Var = this.e;
                wbVarA.a(ironSourceError, t9Var.a(t9Var.d()));
                a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                return;
            }
            this.v = placement.getPlacementName();
            b("showRewardedVideo(" + placement + ")");
            r rVar = null;
            b(IronSourceConstants.RV_API_SHOW_CALLED, activity != null ? l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}}) : null);
            if (this.y) {
                a("showRewardedVideo error: can't show ad while an ad is already showing");
                IronSourceError ironSourceError2 = new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing");
                wb wbVarA2 = wb.a();
                t9 t9Var2 = this.e;
                wbVarA2.a(ironSourceError2, t9Var2.a(t9Var2.d()));
                b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1022}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}));
                return;
            }
            if (this.z != e.RV_STATE_READY_TO_SHOW) {
                a("showRewardedVideo error: show called while no ads are available");
                IronSourceError ironSourceError3 = new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available");
                wb wbVarA3 = wb.a();
                t9 t9Var3 = this.e;
                wbVarA3.a(ironSourceError3, t9Var3.a(t9Var3.d()));
                b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1023}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}));
                return;
            }
            if (com.json.mediationsdk.utils.b.f(ContextProvider.getInstance().getApplicationContext(), this.v)) {
                String str = "showRewardedVideo error: placement " + this.v + " is capped";
                a(str);
                IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str);
                wb wbVarA4 = wb.a();
                t9 t9Var4 = this.e;
                wbVarA4.a(ironSourceError4, t9Var4.a(t9Var4.d()));
                b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{"reason", str}}));
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<r> it = this.e.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r next = it.next();
                if (next.A()) {
                    this.y = true;
                    next.b(true);
                    a(e.RV_STATE_NOT_LOADED);
                    rVar = next;
                    break;
                }
                if (next.e() != null) {
                    stringBuffer.append(next.c() + ":" + next.e() + ",");
                }
                next.b(false);
            }
            if (rVar != null) {
                c(rVar, placement);
                return;
            }
            d("showRewardedVideo(): No ads to show");
            wb wbVarA5 = wb.a();
            IronSourceError ironSourceErrorBuildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            t9 t9Var5 = this.e;
            wbVarA5.a(ironSourceErrorBuildNoAdsToShowError, t9Var5.a(t9Var5.d()));
            HashMap map = new HashMap();
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, 509);
            map.put("reason", "showRewardedVideo(): No ads to show");
            if (stringBuffer.length() != 0) {
                map.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
            }
            b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map);
            this.l.b();
        }
    }

    @Override // com.json.l6
    public void a(Context context, boolean z) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager Should Track Network State: " + z, 0);
        try {
            this.r = z;
            if (z) {
                if (this.q == null) {
                    this.q = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.q != null) {
                context.getApplicationContext().unregisterReceiver(this.q);
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    @Override // com.json.s9
    public void a(IronSourceError ironSourceError, r rVar) {
        i1 i1Var;
        if (this.m && (i1Var = this.f.get(rVar.c())) != null) {
            t9 t9Var = this.e;
            t9Var.a(t9Var.d(), i1Var.a(this.v));
        }
        a(rVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.y = false;
        b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}));
        wb.a().a(ironSourceError, this.e.a(rVar.u()));
        this.g.put(rVar.c(), h.a.ISAuctionPerformanceFailedToShow);
        if (this.z != e.RV_STATE_READY_TO_SHOW) {
            b(false);
        }
        this.l.b();
    }

    @Override // com.json.s9
    public void a(r rVar) {
        a(rVar, "onRewardedVideoAdStarted");
        wb.a().c();
    }

    @Override // com.json.s9
    public void a(r rVar, Placement placement) {
        a(rVar, "onRewardedVideoAdRewarded");
        wb.a().b(placement, this.e.a(rVar.u()));
    }

    @Override // com.json.y0
    public void a(List<i1> list, String str, i1 i1Var, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        d("makeAuction(): success");
        this.h = i1Var;
        this.p = i;
        this.k = jSONObject;
        this.o = "";
        if (!TextUtils.isEmpty(str2)) {
            a(88002, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str2}}));
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        a(jSONObject2, ad_unit);
        if (this.b.a(ad_unit)) {
            a(IronSourceConstants.RV_AD_UNIT_CAPPED, l9.a(new Object[][]{new Object[]{"auctionId", str}}));
            h();
        } else {
            a(list, str, this.k);
            a(IronSourceConstants.RV_AUCTION_SUCCESS, l9.a(new Object[][]{new Object[]{"duration", Long.valueOf(j)}}));
            i();
        }
    }

    @Override // com.json.qa
    public void a(boolean z) {
        if (this.r) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 0);
            if (c(z)) {
                b(z);
            }
        }
    }

    @Override // com.json.m
    public void b() {
        a(e.RV_STATE_NOT_LOADED);
        a(false, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.json.s9
    public void b(r rVar) {
        String str;
        a(rVar, "onRewardedVideoAdClosed, mediation state: " + this.z.name());
        wb.a().b(this.e.a(rVar.u()));
        this.y = false;
        boolean z = this.z == e.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z) {
            Iterator<r> it = this.e.c().iterator();
            while (it.hasNext()) {
                r next = it.next();
                if (next.y()) {
                    sb.append(next.c() + ";");
                }
            }
        }
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + ((Object) sb);
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr2[1] = sb2.toString();
        objArr[0] = objArr2;
        rVar.b(1203, objArr);
        if (rVar.equals(this.e.f())) {
            this.e.a((r) null);
            if (this.z != e.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
        }
    }

    @Override // com.json.s9
    public void b(r rVar, Placement placement) {
        a(rVar, "onRewardedVideoAdClicked");
        wb.a().a(placement, this.e.a(rVar.u()));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0058 A[SYNTHETIC] */
    @Override // com.json.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.json.mediationsdk.r r12) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.q.c(com.ironsource.mediationsdk.r):void");
    }

    @Override // com.json.s9
    public void d(r rVar) throws JSONException, NumberFormatException {
        this.e.a(rVar);
        this.u++;
        a(rVar, "onRewardedVideoAdOpened");
        if (this.m) {
            i1 i1Var = this.f.get(rVar.c());
            if (i1Var != null) {
                t9 t9Var = this.e;
                t9Var.a(t9Var.d(), i1Var.a(this.v));
                this.j.a(i1Var, rVar.g(), this.h, this.v);
                this.g.put(rVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
                a(i1Var, this.v);
            } else {
                String strC = rVar.c();
                c("onRewardedVideoAdOpened showing instance " + strC + " missing from waterfall");
                a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, l9.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{"reason", "Showing missing " + this.z}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
            }
        }
        wb.a().c(this.e.a(rVar.u()));
        b(false);
        this.l.c();
    }

    @Override // com.json.l6
    public boolean d() {
        if ((!this.r || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.z == e.RV_STATE_READY_TO_SHOW && !this.y) {
            Iterator<r> it = this.e.c().iterator();
            while (it.hasNext()) {
                if (it.next().A()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.json.s9
    public void e(r rVar) {
        synchronized (this.C) {
            a(rVar, "onLoadSuccess mState=" + this.z);
            if (rVar.u() == this.e.d() && this.z != e.RV_STATE_AUCTION_IN_PROGRESS) {
                this.g.put(rVar.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
                e eVar = this.z;
                e eVar2 = e.RV_STATE_LOADING_SMASHES;
                if (eVar == eVar2) {
                    a(e.RV_STATE_READY_TO_SHOW);
                    a(1003, l9.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.n)}}));
                    this.D.a(0L);
                    if (this.m) {
                        i1 i1Var = this.f.get(rVar.c());
                        if (i1Var != null) {
                            t9 t9Var = this.e;
                            t9Var.a(t9Var.d(), i1Var.a(""));
                            this.j.a(i1Var, rVar.g(), this.h);
                            this.j.a(this.e.c(), this.f, rVar.g(), this.h, i1Var);
                        } else {
                            String strC = rVar.c();
                            c("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId: " + rVar.u() + " and the current id is " + this.e.d());
                            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1010};
                            StringBuilder sb = new StringBuilder();
                            sb.append("Loaded missing ");
                            sb.append(eVar2);
                            a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, l9.a(new Object[][]{objArr, new Object[]{"reason", sb.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
                        }
                    }
                    b(true);
                }
                return;
            }
            d("onLoadSuccess was invoked with auctionId: " + rVar.u() + " and the current id is " + this.e.d());
            Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onLoadSuccess wrong auction ID ");
            sb2.append(this.z);
            rVar.a(IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr2, new Object[]{"reason", sb2.toString()}});
        }
    }

    @Override // com.json.s9
    public void f(r rVar) {
        a(rVar, "onRewardedVideoAdEnded");
        wb.a().b();
    }
}
