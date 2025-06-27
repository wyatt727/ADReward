package com.json.mediationsdk;

import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.json.c2;
import com.json.ca;
import com.json.e4;
import com.json.environment.ContextProvider;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.f2;
import com.json.g2;
import com.json.i1;
import com.json.i6;
import com.json.j6;
import com.json.k1;
import com.json.l4;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.h;
import com.json.mediationsdk.impressionData.ImpressionDataListener;
import com.json.mediationsdk.l;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.o8;
import com.json.qd;
import com.json.r1;
import com.json.sb;
import com.json.u9;
import com.json.x7;
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
public class w extends m implements sb, y0 {
    private final Object A;
    private e4 B;
    private boolean C;
    private final boolean D;
    private final long E;
    private final Runnable F;
    private final x7 e;
    private final x7.a f;
    private k g;
    private h h;
    private u9 i;
    private IronSourceBannerLayout j;
    private r1 k;
    private int l;
    private x m;
    private int n;
    private final ConcurrentHashMap<String, x> o;
    private CopyOnWriteArrayList<x> p;
    private String q;
    private JSONObject r;
    private String s;
    private int t;
    private com.json.mediationsdk.e u;
    private i1 v;
    private com.json.mediationsdk.h w;
    private ConcurrentHashMap<String, i1> x;
    private ConcurrentHashMap<String, h.a> y;
    private long z;

    class a implements l.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r1 f2009a;
        final /* synthetic */ IronSourceBannerLayout b;

        a(r1 r1Var, IronSourceBannerLayout ironSourceBannerLayout) {
            this.f2009a = r1Var;
            this.b = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() throws JSONException {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f2009a.getPlacementName());
            l.b(this.b);
            w.this.j = this.b;
            w.this.k = this.f2009a;
            if (!com.json.mediationsdk.utils.b.d(ContextProvider.getInstance().getApplicationContext(), this.f2009a.getPlacementName())) {
                w.this.b(false);
                return;
            }
            ironLog.verbose("placement is capped");
            n.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(604, "placement " + this.f2009a.getPlacementName() + " is capped"));
            w.this.a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
            w.this.a(h.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("can't load banner - errorMessage = " + str);
        }
    }

    class b implements l.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceBannerLayout f2010a;

        b(IronSourceBannerLayout ironSourceBannerLayout) {
            this.f2010a = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() throws JSONException {
            IronLog.INTERNAL.verbose("destroying banner");
            w.this.i.b();
            w.this.a(IronSourceConstants.BN_DESTROY, (Object[][]) null, w.this.m != null ? w.this.m.n() : w.this.n);
            w.this.h();
            this.f2010a.a();
            w.this.j = null;
            w.this.k = null;
            w.this.a(h.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("destroy banner failed - errorMessage = " + str);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                if (w.this.j == null) {
                    IronLog.INTERNAL.verbose("mIronSourceBanner is null");
                    w.this.a(IronSourceConstants.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL)}});
                } else {
                    if (w.this.o()) {
                        w.this.v();
                        return;
                    }
                    IronLog.INTERNAL.verbose("banner is not visible, reload skipped");
                    w.this.a(IronSourceConstants.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE)}});
                    w.this.i.a(TimeUnit.SECONDS.toMillis(w.this.g.f()));
                }
            } catch (Throwable th) {
                w.this.a(IronSourceConstants.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, new Object[][]{new Object[]{"reason", th.getMessage()}});
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            w.this.w();
            if (w.this.y()) {
                return;
            }
            w.this.a(IronSourceConstants.BN_AUCTION_REQUEST);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            w.this.b(map, arrayList, sb, arrayList2);
            if (w.this.D) {
                w.this.a(map, arrayList, sb, arrayList2);
            } else {
                w.this.a(map, arrayList, sb);
            }
        }
    }

    class e implements f2.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f2013a;
        final /* synthetic */ StringBuilder b;
        final /* synthetic */ List c;

        e(Map map, StringBuilder sb, List list) {
            this.f2013a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.f2.b
        public void a(List<g2> list, long j, List<String> list2) throws JSONException {
            w.this.a(IronSourceConstants.BN_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            for (g2 g2Var : list) {
                if (g2Var.a() != null) {
                    this.f2013a.put(g2Var.c(), g2Var.a());
                    StringBuilder sb = this.b;
                    sb.append(g2Var.d());
                    sb.append(g2Var.c());
                    sb.append(",");
                    ((x) w.this.o.get(g2Var.c())).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(g2Var.e())}});
                } else {
                    ((x) w.this.o.get(g2Var.c())).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(g2Var.e())}, new Object[]{"reason", g2Var.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                ((x) w.this.o.get(it.next())).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            }
            w.this.a((Map<String, Object>) this.f2013a, (List<String>) this.c, this.b);
        }

        @Override // com.ironsource.f2.b
        public void onFailure(String str) throws JSONException {
            w.this.a(IronSourceConstants.BN_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{"duration", str}});
            w.this.a((Map<String, Object>) this.f2013a, (List<String>) this.c, this.b);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f2014a;

        f(NetworkSettings networkSettings) {
            this.f2014a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.a(this.f2014a);
        }
    }

    class g extends TimerTask {
        g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            w.this.u();
        }
    }

    enum h {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    w(j6 j6Var, i6 i6Var, List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) throws JSONException, InterruptedException {
        super(hashSet, ironSourceSegment);
        this.h = h.NONE;
        this.s = "";
        this.A = new Object();
        this.C = false;
        c cVar = new c();
        this.F = cVar;
        x7 x7VarD = j6Var.d();
        this.e = x7VarD;
        this.f = i6Var.b();
        long time = new Date().getTime();
        a(IronSourceConstants.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog.INTERNAL.verbose("isAuctionEnabled = " + kVar.k());
        this.g = kVar;
        this.o = new ConcurrentHashMap<>();
        this.p = new CopyOnWriteArrayList<>();
        this.x = new ConcurrentHashMap<>();
        this.y = new ConcurrentHashMap<>();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.n = x7VarD.a(ad_unit);
        n.a().a(ad_unit, this.g.d());
        if (this.g.k()) {
            this.u = new com.json.mediationsdk.e(ad_unit, this.g.b(), this);
        }
        this.w = new com.json.mediationsdk.h(list, this.g.b().c());
        a(list, kVar);
        this.z = new Date().getTime();
        a(h.READY_TO_LOAD);
        this.D = kVar.g();
        this.E = kVar.h();
        this.i = new u9(cVar, com.json.lifecycle.b.d(), new qd());
        a(IronSourceConstants.BN_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    public w(List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this(ca.h(), ca.g(), list, kVar, hashSet, ironSourceSegment);
    }

    private String a(List<i1> list) {
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.p.clear();
        this.x.clear();
        this.y.clear();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            i1 i1Var = list.get(i);
            a(i1Var);
            sb.append(b(i1Var));
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) throws JSONException {
        a(i, (Object[][]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object[][] objArr) throws JSONException {
        a(i, objArr, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object[][] objArr, int i2) throws JSONException {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize iSBannerSizeK = k();
            if (iSBannerSizeK != null) {
                a(mediationAdditionalData, iSBannerSizeK);
            }
            if (this.k != null) {
                mediationAdditionalData.put("placement", l());
            }
            mediationAdditionalData.put("sessionDepth", i2);
            if (!TextUtils.isEmpty(this.q)) {
                mediationAdditionalData.put("auctionId", this.q);
            }
            JSONObject jSONObject = this.r;
            if (jSONObject != null && jSONObject.length() > 0) {
                mediationAdditionalData.put("genericParams", this.r);
            }
            if (b(i)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.t);
                if (!TextUtils.isEmpty(this.s)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.s);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e2));
        }
        o8.i().a(new l4(i, mediationAdditionalData));
    }

    private void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceBannerLayout ironSourceBannerLayout = this.j;
        if (ironSourceBannerLayout != null) {
            l.a(ironSourceBannerLayout, view, layoutParams);
        }
    }

    private void a(i1 i1Var) {
        x xVar = this.o.get(i1Var.c());
        if (xVar == null) {
            IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + i1Var.c());
            return;
        }
        AbstractAdapter abstractAdapterA = com.json.mediationsdk.c.b().a(xVar.b.h());
        if (abstractAdapterA != null) {
            x xVar2 = new x(this.g, this, xVar.b.h(), abstractAdapterA, this.n, this.q, this.r, this.t, this.s, p());
            xVar2.a(true);
            this.p.add(xVar2);
            this.x.put(xVar2.c(), i1Var);
            this.y.put(i1Var.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter abstractAdapterA = com.json.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), false);
        if (abstractAdapterA != null) {
            x xVar = new x(this.g, this, networkSettings, abstractAdapterA, this.n, p());
            this.o.put(xVar.c(), xVar);
        } else {
            ironLog.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h hVar) {
        IronLog.INTERNAL.verbose("from '" + this.h + "' to '" + hVar + "'");
        synchronized (this.A) {
            this.h = hVar;
        }
    }

    private void a(x xVar, i1 i1Var) throws JSONException, NumberFormatException {
        this.u.a(i1Var, xVar.g(), this.v, l());
        a(this.x.get(xVar.c()), l());
    }

    private void a(List<NetworkSettings> list, k kVar) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f(it.next()));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(kVar.c().l(), kVar.c().o(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((Object) sb));
        if (map.size() != 0 || list.size() != 0) {
            a(IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
            com.json.mediationsdk.e eVar = this.u;
            if (eVar != null) {
                eVar.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.w, this.n, this.c, j());
                return;
            } else {
                ironLog.error("mAuctionHandler is null");
                return;
            }
        }
        a(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}});
        if (a(h.AUCTION, h.LOADED)) {
            this.i.a(TimeUnit.SECONDS.toMillis(this.g.f()));
            return;
        }
        n.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(1005, "No candidates available for auctioning"));
        a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
        a(h.READY_TO_LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<c2> list2) throws JSONException {
        if (list2.isEmpty()) {
            a(map, list, sb);
            return;
        }
        f2 f2Var = new f2();
        e eVar = new e(map, sb, list);
        a(IronSourceConstants.BN_COLLECT_TOKENS);
        f2Var.a(list2, eVar, this.E, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void a(JSONObject jSONObject, ISBannerSize iSBannerSize) throws JSONException {
        try {
            String description = iSBannerSize.getDescription();
            char c2 = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                jSONObject.put(l.g, 1);
            } else if (c2 == 1) {
                jSONObject.put(l.g, 2);
            } else if (c2 == 2) {
                jSONObject.put(l.g, 3);
            } else if (c2 == 3) {
                jSONObject.put(l.g, 5);
            } else if (c2 == 4) {
                jSONObject.put(l.g, 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                boolean zHas = jSONObject.has(IronSourceConstants.EVENTS_EXT1);
                String str = l.n;
                if (zHas) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , " + l.n;
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e2));
        }
    }

    private boolean a(h hVar, h hVar2) {
        boolean z;
        synchronized (this.A) {
            if (this.h == hVar) {
                IronLog.INTERNAL.verbose("set state from '" + this.h + "' to '" + hVar2 + "'");
                z = true;
                this.h = hVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    private String b(i1 i1Var) {
        x xVar = this.o.get(i1Var.c());
        return ((xVar == null ? !TextUtils.isEmpty(i1Var.j()) : xVar.p()) ? "2" : "1") + i1Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<c2> list2) {
        if (com.json.mediationsdk.utils.b.d(ContextProvider.getInstance().getApplicationContext(), l())) {
            return;
        }
        for (x xVar : this.o.values()) {
            AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(xVar.d, IronSource.AD_UNIT.BANNER, null, this.j);
            if (xVar.p()) {
                if (this.D) {
                    list2.add(new c2(xVar.g(), xVar.c(), adDataCreateAdDataForNetworkAdapter, xVar, null, null));
                } else {
                    try {
                        Map<String, Object> mapA = xVar.a(adDataCreateAdDataForNetworkAdapter);
                        if (mapA != null) {
                            map.put(xVar.c(), mapA);
                            sb.append(xVar.g() + xVar.c() + ",");
                        } else {
                            xVar.a(IronSourceConstants.TROUBLESHOOTING_BN_BIDDING_DATA_MISSING, new Object[][]{new Object[]{"reason", "Missing bidding data"}});
                        }
                    } catch (Exception e2) {
                        String str = "prepareAuctionCandidates - exception while calling smash.getBiddingData - " + e2.getMessage();
                        IronLog.INTERNAL.error(str);
                        xVar.a(IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{"reason", str}});
                    } catch (NoClassDefFoundError e3) {
                        String str2 = "prepareAuctionCandidates - error while calling smash.getBiddingData - " + e3.getMessage();
                        IronLog.INTERNAL.error(str2);
                        xVar.a(IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{"reason", str2}});
                    }
                }
            } else if (!xVar.p()) {
                list.add(xVar.c());
                sb.append(xVar.g() + xVar.c() + ",");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.h);
        if (!a(h.STARTED_LOADING, this.g.k() ? z ? h.AUCTION : h.FIRST_AUCTION : z ? h.RELOADING : h.LOADING)) {
            ironLog.error("wrong state - " + this.h);
            return;
        }
        this.B = new e4();
        this.q = "";
        this.r = null;
        this.l = 0;
        this.n = this.e.a(IronSource.AD_UNIT.BANNER);
        a(z ? IronSourceConstants.BN_RELOAD : 3001);
        if (this.g.k()) {
            u();
        } else {
            x();
            t();
        }
    }

    private boolean b(int i) {
        return i == 3201 || i == 3110 || i == 3111 || i == 3116 || i == 3119 || i == 3112 || i == 3115 || i == 3501 || i == 3502 || i == 3506;
    }

    private void f(x xVar) {
        String strJ;
        IronSourceBannerLayout ironSourceBannerLayout = this.j;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayoutB = null;
        if (xVar.p()) {
            strJ = this.x.get(xVar.c()).j();
            xVar.c(strJ);
        } else {
            strJ = null;
        }
        JSONObject jSONObjectA = this.x.get(xVar.c()).a();
        try {
            ironSourceBannerLayoutB = this.j.b();
        } catch (Exception e2) {
            IronLog.INTERNAL.verbose("Failed to make copy of banner layout: " + e2.getMessage());
        }
        xVar.a(ironSourceBannerLayoutB, this.k, strJ, jSONObjectA);
    }

    private boolean g() {
        IronSourceBannerLayout ironSourceBannerLayout = this.j;
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.m != null) {
            IronLog.INTERNAL.verbose("mActiveSmash = " + this.m.f());
            this.m.t();
            this.m = null;
        }
    }

    private List<i1> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (x xVar : this.o.values()) {
            if (!xVar.p() && !com.json.mediationsdk.utils.b.d(ContextProvider.getInstance().getApplicationContext(), l())) {
                copyOnWriteArrayList.add(new i1(xVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private ISBannerSize j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.j;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return this.j.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? ISBannerSize.e : ISBannerSize.BANNER : this.j.getSize();
    }

    private ISBannerSize k() {
        IronSourceBannerLayout ironSourceBannerLayout = this.j;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    private String l() {
        r1 r1Var = this.k;
        return r1Var != null ? r1Var.getPlacementName() : "";
    }

    private void m() throws JSONException {
        String str = this.p.isEmpty() ? "Empty waterfall" : "Mediation No fill";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("errorReason = " + str);
        g((x) null);
        h hVar = h.LOADING;
        h hVar2 = h.READY_TO_LOAD;
        if (a(hVar, hVar2)) {
            a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(e4.a(this.B))}});
            n.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str));
        } else if (a(h.RELOADING, h.LOADED)) {
            a(IronSourceConstants.BN_CALLBACK_RELOAD_ERROR, new Object[][]{new Object[]{"duration", Long.valueOf(e4.a(this.B))}});
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str), true);
            this.i.a(TimeUnit.SECONDS.toMillis(this.g.f()));
        } else {
            a(hVar2);
            ironLog.error("wrong state = " + this.h);
        }
    }

    private void n() throws JSONException {
        String strL = l();
        com.json.mediationsdk.utils.b.a(ContextProvider.getInstance().getApplicationContext(), strL);
        if (com.json.mediationsdk.utils.b.d(ContextProvider.getInstance().getApplicationContext(), strL)) {
            a(IronSourceConstants.BN_PLACEMENT_CAPPED);
        }
    }

    private boolean p() {
        h hVar = this.h;
        return hVar == h.RELOADING || hVar == h.AUCTION;
    }

    private boolean q() {
        boolean z;
        synchronized (this.A) {
            z = this.h == h.LOADED;
        }
        return z;
    }

    private boolean r() {
        boolean z;
        synchronized (this.A) {
            h hVar = this.h;
            z = hVar == h.FIRST_AUCTION || hVar == h.AUCTION;
        }
        return z;
    }

    private boolean s() {
        boolean z;
        synchronized (this.A) {
            h hVar = this.h;
            z = hVar == h.LOADING || hVar == h.RELOADING;
        }
        return z;
    }

    private void t() throws JSONException {
        try {
            for (int i = this.l; i < this.p.size(); i++) {
                x xVar = this.p.get(i);
                if (xVar.h()) {
                    IronLog.INTERNAL.verbose("loading smash - " + xVar.f());
                    this.l = i + 1;
                    f(xVar);
                    return;
                }
            }
            m();
        } catch (Exception e2) {
            a(IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "loadNextSmash"}, new Object[]{"reason", Log.getStackTraceString(e2)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        IronLog.INTERNAL.verbose();
        AsyncTask.execute(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (a(h.LOADED, h.STARTED_LOADING)) {
            b(true);
            return;
        }
        ironLog.error("wrong state = " + this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.y.isEmpty()) {
            return;
        }
        this.w.a(this.y);
        this.y.clear();
    }

    private void x() {
        List<i1> listI = i();
        this.q = e();
        a(listI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long jA = l.a(this.z, this.g.i());
        if (jA <= 0) {
            return false;
        }
        IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + jA);
        new Timer().schedule(new g(), jA);
        return true;
    }

    @Override // com.json.y0
    public void a(int i, String str, int i2, String str2, long j) throws JSONException {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.h);
            return;
        }
        this.s = str2;
        this.t = i2;
        this.r = null;
        x();
        a(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}});
        a(this.h == h.FIRST_AUCTION ? h.LOADING : h.RELOADING);
        t();
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        IronLog.INTERNAL.verbose();
        l.a(ironSourceBannerLayout, new b(ironSourceBannerLayout));
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, r1 r1Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        a(ad_unit);
        f();
        if (!a(h.READY_TO_LOAD, h.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (n.a().b(ad_unit)) {
            ironLog.verbose("can't load banner - already has pending invocation");
        } else {
            l.a(ironSourceBannerLayout, r1Var, new a(r1Var, ironSourceBannerLayout));
        }
    }

    @Override // com.json.sb
    public void a(IronSourceError ironSourceError, x xVar, boolean z) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (xVar.x() == this.q) {
            if (s()) {
                this.y.put(xVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
                t();
                return;
            } else {
                ironLog.warning("wrong state - mCurrentState = " + this.h);
                return;
            }
        }
        ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.q);
        xVar.a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 3}, new Object[]{"reason", "Wrong auction " + xVar.x() + " State - " + this.h}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
    }

    @Override // com.json.sb
    public void a(x xVar) throws JSONException, NumberFormatException {
        i1 i1Var;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(xVar.f());
        if (q()) {
            if (this.g.k() && this.g.b().p() && (i1Var = this.x.get(xVar.c())) != null) {
                a(xVar, i1Var);
            }
            a(IronSourceConstants.BN_CALLBACK_SHOW);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.h);
        String strC = xVar.c();
        a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.h}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
    }

    @Override // com.json.sb
    public void a(x xVar, View view, FrameLayout.LayoutParams layoutParams) throws JSONException, NumberFormatException {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + xVar.f());
        if (xVar.x() != this.q) {
            ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.q);
            xVar.a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{"reason", "Wrong auction id " + xVar.x() + " State - " + this.h}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
            return;
        }
        if (!s()) {
            ironLog.warning("wrong state - mCurrentState = " + this.h);
            return;
        }
        x xVar2 = this.m;
        if (xVar2 != null) {
            xVar2.q();
        }
        g(xVar);
        this.m = xVar;
        a(view, layoutParams);
        this.y.put(xVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
        if (this.g.k()) {
            i1 i1Var = this.x.get(xVar.c());
            if (i1Var != null) {
                a(i1Var.a(l()));
                this.u.a(i1Var, xVar.g(), this.v);
                this.u.a(this.p, this.x, xVar.g(), this.v, i1Var);
                if (!this.g.b().p()) {
                    a(xVar, i1Var);
                }
            } else {
                String strC = xVar.c();
                ironLog.error("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId = " + this.q);
                a(IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
            }
        }
        if (this.h == h.LOADING) {
            if (g()) {
                k1.a().a(this.d, false);
                objArr = new Object[][]{new Object[]{"duration", Long.valueOf(e4.a(this.B))}};
            } else {
                objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}, new Object[]{"duration", Long.valueOf(e4.a(this.B))}};
            }
            a(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, objArr);
        } else {
            if (g()) {
                k1.a().a(this.d, true);
            }
            IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
            a(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(e4.a(this.B))}});
        }
        n();
        this.f.b(IronSource.AD_UNIT.BANNER);
        a(h.LOADED);
        this.i.a(TimeUnit.SECONDS.toMillis(this.g.f()));
    }

    @Override // com.json.y0
    public void a(List<i1> list, String str, i1 i1Var, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.h);
            return;
        }
        this.s = "";
        this.q = str;
        this.t = i;
        this.v = i1Var;
        this.r = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str2}});
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        a(jSONObject2, ad_unit);
        if (!this.b.a(ad_unit)) {
            a(IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            a(this.h == h.FIRST_AUCTION ? h.LOADING : h.RELOADING);
            a(IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, a(list)}});
            t();
            return;
        }
        a(IronSourceConstants.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
        h hVar = this.h;
        a(h.READY_TO_LOAD);
        if (hVar == h.FIRST_AUCTION) {
            n.a().a(ad_unit, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"));
        }
    }

    @Override // com.json.sb
    public void b(x xVar) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            k1.a().b(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_CLICK, objArr, xVar.n());
    }

    @Override // com.json.sb
    public void c(x xVar) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            k1.a().c(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, xVar.n());
    }

    @Override // com.json.sb
    public void d(x xVar) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            k1.a().e(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, xVar.n());
    }

    @Override // com.json.sb
    public void e(x xVar) throws JSONException {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            k1.a().d(this.d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, xVar.n());
    }

    public void g(x xVar) {
        Iterator<x> it = this.p.iterator();
        while (it.hasNext()) {
            x next = it.next();
            if (!next.equals(xVar)) {
                next.q();
            }
        }
    }

    public boolean o() {
        IronLog ironLog;
        String str;
        if (!this.j.isShown()) {
            ironLog = IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else {
            if (this.j.hasWindowFocus()) {
                boolean globalVisibleRect = this.j.getGlobalVisibleRect(new Rect());
                IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
                return globalVisibleRect;
            }
            ironLog = IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }
}
