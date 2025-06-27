package com.json;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.json.a0;
import com.json.d0;
import com.json.environment.ContextProvider;
import com.json.environment.NetworkStateReceiver;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.f2;
import com.json.mediationsdk.AuctionRequestParams;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.IronSourceSegment;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.h;
import com.json.mediationsdk.impressionData.ImpressionData;
import com.json.mediationsdk.impressionData.ImpressionDataListener;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.n;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.x7;
import com.json.y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class v1<Smash extends y1<?>, Listener extends AdapterAdListener> implements f0, y0, z, y9, qa, m, ke, d2, qb {
    private AdInfo A;
    private m9 B;
    private boolean E;
    private ed F;
    private v8 H;

    /* renamed from: a, reason: collision with root package name */
    protected je<Smash> f2337a;
    protected ConcurrentHashMap<String, h.a> b;
    protected com.json.mediationsdk.e c;
    protected h d;
    protected int e;
    protected JSONObject g;
    protected i1 h;
    protected Placement i;
    private NetworkStateReceiver k;
    protected sc l;
    protected e4 m;
    protected e4 n;
    protected p o;
    protected f p;
    protected e0 q;
    protected v4 r;
    protected a0 s;
    protected c0 t;
    protected w u;
    protected IronSourceSegment v;
    private Boolean z;
    protected String f = "";
    protected boolean j = false;
    protected final Object x = new Object();
    private long y = 0;
    private AtomicBoolean G = new AtomicBoolean(false);
    protected UUID w = UUID.randomUUID();
    final x7 C = ca.h().d();
    final x7.a D = ca.g().b();

    class a extends kc {
        a() {
        }

        @Override // com.json.kc
        public void a() throws JSONException {
            v1.this.x();
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f2339a;

        b(NetworkSettings networkSettings) {
            this.f2339a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            v1.this.c(this.f2339a);
        }
    }

    class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            v1.this.z();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            v1.this.g = new JSONObject();
            v1.this.s.i.a();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            v1.this.b(map, arrayList, sb, arrayList2);
            if (v1.this.o.getCollectBiddingDataAsyncEnabled()) {
                v1.this.a(map, arrayList, sb, arrayList2);
            } else {
                v1.this.a(map, arrayList, sb.toString());
            }
        }
    }

    class e implements f2.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f2342a;
        final /* synthetic */ StringBuilder b;
        final /* synthetic */ List c;

        e(Map map, StringBuilder sb, List list) {
            this.f2342a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.f2.b
        public void a(List<g2> list, long j, List<String> list2) throws JSONException {
            v1.this.s.h.a(j);
            for (g2 g2Var : list) {
                NetworkSettings networkSettingsA = v1.this.o.a(g2Var.c());
                Map<String, Object> mapA = v1.this.a(networkSettingsA, com.json.mediationsdk.c.b().b(networkSettingsA, v1.this.o.getAdUnit(), v1.this.h()));
                if (g2Var.a() != null) {
                    this.f2342a.put(g2Var.c(), g2Var.a());
                    StringBuilder sb = this.b;
                    sb.append(g2Var.d());
                    sb.append(g2Var.c());
                    sb.append(",");
                    v1.this.s.h.a(mapA, g2Var.e());
                } else {
                    v1.this.s.h.a(mapA, g2Var.e(), g2Var.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings networkSettingsA2 = v1.this.o.a(it.next());
                v1.this.s.h.b(v1.this.a(networkSettingsA2, com.json.mediationsdk.c.b().b(networkSettingsA2, v1.this.o.getAdUnit(), v1.this.h())), j);
            }
            v1.this.a((Map<String, Object>) this.f2342a, (List<String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.f2.b
        public void onFailure(String str) {
            v1.this.s.h.a(str);
            v1.this.a((Map<String, Object>) this.f2342a, (List<String>) this.c, this.b.toString());
        }
    }

    protected enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public v1(p pVar, m9 m9Var, IronSourceSegment ironSourceSegment, boolean z) throws InterruptedException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + pVar.getAdUnit() + ", loading mode = " + pVar.getLoadingData().a());
        StringBuilder sb = new StringBuilder();
        sb.append(pVar.getAdUnit());
        sb.append(" initiated object per waterfall mode");
        IronSourceUtils.sendAutomationLog(sb.toString());
        e4 e4Var = new e4();
        this.H = a(pVar);
        this.v = ironSourceSegment;
        this.o = pVar;
        this.s = new a0(pVar.getAdUnit(), a0.b.MEDIATION, this);
        this.t = e();
        this.q = new e0(this.o.getLoadingData(), this);
        a(f.NONE);
        this.B = m9Var;
        this.f2337a = new je<>(this.o.getAuctionSettings().f(), this.o.getAuctionSettings().i(), this);
        this.s.f.a(l(), this.o.getLoadingData().a().toString());
        this.b = new ConcurrentHashMap<>();
        this.i = null;
        C();
        this.g = new JSONObject();
        if (this.o.r()) {
            this.c = new com.json.mediationsdk.e(new com.json.mediationsdk.f(this.o.getAuctionSettings(), z, IronSourceUtils.getSessionId()));
        }
        this.d = new h(this.o.j(), this.o.getAuctionSettings().c());
        p();
        o();
        this.m = new e4();
        a(f.READY_TO_LOAD);
        this.r = new v4(pVar.getAdExpirationInMinutes(), this);
        this.u = new w();
        this.s.f.a(e4.a(e4Var));
        if (this.o.getLoadingData().e()) {
            ironLog.verbose("first automatic load");
            w();
        }
    }

    private ne<Smash> A() {
        IronLog.INTERNAL.verbose();
        return new me(this.o).d(this.f2337a.b());
    }

    private void B() {
        this.u.a(this.o.getAdUnit(), false);
    }

    private void G() {
        IronLog.INTERNAL.verbose(f());
        synchronized (this.x) {
            f fVar = this.p;
            f fVar2 = f.AUCTION;
            if (fVar == fVar2) {
                return;
            }
            a(fVar2);
            this.G.set(false);
            long jK = this.o.getAuctionSettings().k() - e4.a(this.m);
            if (jK > 0) {
                new Timer().schedule(new c(), jK);
            } else {
                z();
            }
        }
    }

    private void H() throws JSONException {
        IronLog.INTERNAL.verbose(f());
        a(g(), j());
    }

    private v8 a(p pVar) {
        if (pVar.getThreadPerManager()) {
            return IronSourceThreadManager.INSTANCE.createAndStartThread(String.format("%s_%s", pVar.getAdUnit().name(), Integer.valueOf(hashCode())));
        }
        if (pVar.getSharedManagersThread()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    private Smash a(i1 i1Var, String str) throws JSONException {
        NetworkSettings networkSettingsA = this.o.a(i1Var.c());
        if (networkSettingsA != null) {
            com.json.mediationsdk.c.b().b(networkSettingsA, this.o.getAdUnit(), h());
            BaseAdAdapter<?, Listener> baseAdAdapterA = a(networkSettingsA, this.o.getAdUnit());
            if (baseAdAdapterA != null) {
                Smash smash = (Smash) a(networkSettingsA, baseAdAdapterA, this.C.a(this.o.getAdUnit()), str, i1Var);
                this.b.put(i1Var.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return smash;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsA.getProviderInstanceName()));
        } else {
            String str2 = "could not find matching provider settings for auction response item - item = " + i1Var.c() + " state = " + this.p;
            IronLog.INTERNAL.error(b(str2));
            this.s.k.d(str2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String a(List<i1> list, String str) throws JSONException {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.b.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < list.size(); i++) {
            i1 i1Var = list.get(i);
            y1 y1VarA = a(i1Var, str);
            if (y1VarA != null) {
                copyOnWriteArrayList.add(y1VarA);
                sb.append(a(i1Var, y1VarA.l()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f2337a.a(this.o.getLoadingData().a(), copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb)));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap map = new HashMap();
        try {
            map.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, networkSettings.getSubProviderId());
            map.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.o.getAdUnit())));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m()));
        } catch (Exception e2) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e2);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.s.i.a(1005, "No candidates available for auctioning");
            a(x.e(this.o.getAdUnit()), "no available ad to load", false);
            return;
        }
        this.s.i.b(str);
        if (this.c == null) {
            ironLog.error(b("mAuctionHandler is null"));
            return;
        }
        int iA = this.C.a(this.o.getAdUnit());
        AuctionRequestParams auctionRequestParams = new AuctionRequestParams(this.o.getAdUnit());
        auctionRequestParams.b(IronSourceUtils.isEncryptedResponse());
        auctionRequestParams.a(map);
        auctionRequestParams.a(list);
        auctionRequestParams.a(this.d);
        auctionRequestParams.a(iA);
        auctionRequestParams.a(this.v);
        auctionRequestParams.d(this.E);
        ed edVar = this.F;
        if (edVar != null && edVar.a()) {
            z = true;
        }
        auctionRequestParams.e(z);
        a(ContextProvider.getInstance().getApplicationContext(), auctionRequestParams, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<c2> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        f2 f2Var = new f2();
        e eVar = new e(map, sb, list);
        this.s.h.a();
        f2Var.a(list2, eVar, this.o.getCollectBiddingDataTimeout(), TimeUnit.MILLISECONDS);
    }

    private void a(JSONObject jSONObject) {
        this.u.a(this.o.getAdUnit(), jSONObject != null ? jSONObject.optBoolean(com.json.mediationsdk.d.f, false) : false);
        b(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<c2> list2) throws JSONException {
        StringBuilder sb2;
        String providerName;
        String string;
        StringBuilder sb3;
        String str;
        for (NetworkSettings networkSettings : this.o.j()) {
            ed edVar = this.F;
            if (edVar == null || edVar.a(networkSettings, this.o.getAdUnit())) {
                if (!this.l.b(new rc(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.getAdUnit()))) && d(networkSettings)) {
                    AdData adDataA = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.o.getAdUnit())) {
                        AdapterBaseInterface adapterBaseInterfaceB = com.json.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), h());
                        if (!(adapterBaseInterfaceB instanceof e2)) {
                            if (adapterBaseInterfaceB == null) {
                                sb2 = new StringBuilder();
                                sb2.append("prepareAuctionCandidates - could not load network adapter ");
                                providerName = networkSettings.getProviderName();
                            } else {
                                sb2 = new StringBuilder();
                                sb2.append("network adapter ");
                                sb2.append(networkSettings.getProviderName());
                                providerName = " does not implementing BiddingDataInterface";
                            }
                            sb2.append(providerName);
                            string = sb2.toString();
                        } else if (this.o.getCollectBiddingDataAsyncEnabled()) {
                            list2.add(new c2(networkSettings.getInstanceType(this.o.getAdUnit()), networkSettings.getProviderInstanceName(), adDataA, (e2) adapterBaseInterfaceB, this, networkSettings));
                        } else {
                            try {
                                Map<String, Object> mapA = ((e2) adapterBaseInterfaceB).a(adDataA);
                                if (mapA != null) {
                                    map.put(networkSettings.getProviderInstanceName(), mapA);
                                    sb.append(networkSettings.getInstanceType(this.o.getAdUnit()));
                                    sb.append(networkSettings.getProviderInstanceName());
                                    sb.append(",");
                                } else {
                                    this.s.k.a(a(networkSettings, adapterBaseInterfaceB), "Missing bidding data");
                                }
                            } catch (Exception e2) {
                                e = e2;
                                sb3 = new StringBuilder();
                                str = "prepareAuctionCandidates - exception while calling networkAdapter.getBiddingData - ";
                                sb3.append(str);
                                sb3.append(e.getMessage());
                                string = sb3.toString();
                                IronLog.INTERNAL.error(string);
                                this.s.k.c(string);
                            } catch (NoClassDefFoundError e3) {
                                e = e3;
                                sb3 = new StringBuilder();
                                str = "prepareAuctionCandidates - error while calling networkAdapter.getBiddingData - ";
                                sb3.append(str);
                                sb3.append(e.getMessage());
                                string = sb3.toString();
                                IronLog.INTERNAL.error(string);
                                this.s.k.c(string);
                            }
                        }
                        this.s.k.c(string);
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.o.getAdUnit()));
                        sb.append(networkSettings.getProviderInstanceName());
                        sb.append(",");
                    }
                }
            }
        }
    }

    private void b(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.o.b(false);
                IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.o.s()));
                return;
            }
            try {
                if (jSONObject.has(com.json.mediationsdk.d.o0) && (i = jSONObject.getInt(com.json.mediationsdk.d.o0)) > 0) {
                    this.o.a(i);
                }
                if (jSONObject.has(com.json.mediationsdk.d.p0)) {
                    this.o.a(jSONObject.getBoolean(com.json.mediationsdk.d.p0));
                }
                this.o.b(jSONObject.optBoolean(com.json.mediationsdk.d.q0, false));
            } catch (JSONException e2) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.o.getAdUnit() + " Error: " + e2.getMessage());
                ironLog.verbose(b(this.o.s()));
            }
        } finally {
            IronLog.INTERNAL.verbose(b(this.o.s()));
        }
    }

    private boolean b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f2337a.a(adapterBaseInterface, this.o.getAdUnit(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.o.getAdUnit());
    }

    private boolean b(y yVar) {
        return !new ArrayList(Arrays.asList(y.INIT_STARTED, y.LOAD_AD, y.AUCTION_REQUEST, y.AUCTION_REQUEST_WATERFALL, y.AUCTION_FAILED_NO_CANDIDATES, y.COLLECT_TOKEN, y.COLLECT_TOKENS_COMPLETED, y.COLLECT_TOKENS_FAILED, y.INSTANCE_COLLECT_TOKEN, y.INSTANCE_COLLECT_TOKEN_SUCCESS, y.INSTANCE_COLLECT_TOKEN_FAILED, y.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(yVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) throws JSONException {
        IronLog.INTERNAL.verbose(b(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
        AdData adDataA = a(networkSettings, this.o.getUserId());
        AdapterBaseInterface adapterBaseInterfaceB = com.json.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), h());
        if (adapterBaseInterfaceB != null) {
            try {
                adapterBaseInterfaceB.init(adDataA, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e2) {
                this.s.k.c("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e2);
            }
        }
        IronLog.INTERNAL.verbose(b(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
    }

    private boolean c(y yVar) {
        return new ArrayList(Arrays.asList(y.LOAD_AD_SUCCESS, y.LOAD_AD_FAILED, y.LOAD_AD_FAILED_WITH_REASON, y.AUCTION_SUCCESS, y.AUCTION_FAILED, y.AUCTION_FAILED_NO_CANDIDATES, y.AD_UNIT_CAPPED, y.AD_OPENED, y.SHOW_AD, y.SHOW_AD_FAILED, y.AD_CLICKED, y.RELOAD_AD_FAILED_WITH_REASON, y.RELOAD_AD_SUCCESS, y.AD_LEFT_APPLICATION)).contains(yVar);
    }

    private boolean c(boolean z) {
        Boolean bool = this.z;
        if (bool == null) {
            return false;
        }
        return (z && !bool.booleanValue() && q()) || (!z && this.z.booleanValue());
    }

    private boolean d(NetworkSettings networkSettings) throws JSONException {
        AdapterBaseInterface adapterBaseInterfaceB = com.json.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), h());
        if (adapterBaseInterfaceB instanceof AdapterSettingsInterface) {
            return this.f2337a.a(this.o.getLoadingData().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), ((AdapterSettingsInterface) adapterBaseInterfaceB).getLoadWhileShowSupportedState(networkSettings), adapterBaseInterfaceB, this.o.getAdUnit());
        }
        return false;
    }

    private List<i1> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (!networkSettings.isBidder(this.o.getAdUnit()) && d(networkSettings)) {
                rc rcVar = new rc(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.getAdUnit()));
                if (!this.l.b(rcVar)) {
                    copyOnWriteArrayList.add(new i1(rcVar.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int m() {
        return 1;
    }

    private void o() throws InterruptedException {
        IronLog.INTERNAL.verbose(f());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            if (b(networkSettings, com.json.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), h()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.o.getProvidersParallelInit(), this.o.getWaitUntilAllProvidersFinishInit(), arrayList);
    }

    private void p() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.j()) {
            arrayList.add(new rc(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.getAdUnit())));
        }
        this.l = new sc(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() throws JSONException {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        synchronized (this.x) {
            if (this.o.getLoadingData().e() && this.l.a()) {
                ironLog.verbose(b("all smashes are capped"));
                a(x.a(this.o.getAdUnit()), "all smashes are capped", false);
                return;
            }
            d0.a aVarA = this.o.getLoadingData().a();
            d0.a aVar = d0.a.AUTOMATIC_LOAD_WHILE_SHOW;
            if (aVarA != aVar && this.p == f.SHOWING) {
                IronLog.API.error(b("load cannot be invoked while showing an ad"));
                IronSourceError ironSourceError = new IronSourceError(x.d(this.o.getAdUnit()), "load cannot be invoked while showing an ad");
                if (this.o.getLoadingData().f()) {
                    a(ironSourceError, r());
                } else {
                    this.t.a(false, (AdInfo) null);
                }
                return;
            }
            if (this.o.getLoadingData().a() != aVar && (((fVar = this.p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || n.a().b(this.o.getAdUnit()))) {
                IronLog.API.error(b("load is already in progress"));
                return;
            }
            this.g = new JSONObject();
            B();
            if (r()) {
                this.s.g.a();
            } else {
                this.s.g.a(n());
            }
            this.n = new e4();
            if (this.o.r()) {
                if (!this.b.isEmpty()) {
                    this.d.a(this.b);
                    this.b.clear();
                }
                G();
            } else {
                a(f.LOADING);
            }
            if (this.o.r()) {
                return;
            }
            ironLog.verbose(b("auction disabled"));
            H();
            y();
        }
    }

    private void y() {
        ne<Smash> neVarA = A();
        if (neVarA.c()) {
            a(509, "Mediation No fill", false);
        }
        Iterator<Smash> it = neVarA.a().iterator();
        while (it.hasNext()) {
            it.next().D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        IronLog.INTERNAL.verbose(f());
        AsyncTask.execute(new d());
    }

    protected void C() {
        n.a().a(this.o.getAdUnit(), this.o.getDelayLoadFailure());
    }

    protected boolean D() {
        return true;
    }

    protected boolean E() {
        return true;
    }

    public void F() throws JSONException {
        Iterator<NetworkSettings> it = this.o.j().iterator();
        while (it.hasNext()) {
            com.json.mediationsdk.c.b().b(it.next(), this.o.getAdUnit(), h());
        }
    }

    protected BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.json.mediationsdk.c.b().a(networkSettings, ad_unit, h());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.getAdUnit(), str);
    }

    protected abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i, String str, i1 i1Var);

    protected String a(i1 i1Var, int i) {
        return String.format("%s%s", Integer.valueOf(i), i1Var.c());
    }

    public Map<String, Object> a(y yVar) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.g;
        if (jSONObject != null && jSONObject.length() > 0) {
            map.put("genericParams", this.g);
        }
        map.put("sessionDepth", Integer.valueOf(this.C.a(this.o.getAdUnit())));
        if (c(yVar)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.e));
            if (!TextUtils.isEmpty(this.f)) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f);
            }
        }
        if (b(yVar) && !TextUtils.isEmpty(this.f2337a.c())) {
            map.put("auctionId", this.f2337a.c());
        }
        return map;
    }

    public void a() {
        IronLog.INTERNAL.verbose(f());
        w();
    }

    @Override // com.json.ke
    public void a(int i) {
        this.s.k.q("waterfalls hold too many with size = " + i);
    }

    @Override // com.json.y0
    public void a(int i, String str, int i2, String str2, long j) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (!u()) {
            String str3 = "unexpected auction fail - error = " + i + ", " + str + " state = " + this.p;
            ironLog.error(b(str3));
            this.s.k.e(str3);
            return;
        }
        String str4 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        ironLog.verbose(b(str4));
        IronSourceUtils.sendAutomationLog(i() + ": " + str4);
        this.e = i2;
        this.f = str2;
        this.g = new JSONObject();
        H();
        this.s.i.a(j, i, str);
        a(f.LOADING);
        y();
    }

    protected void a(int i, String str, boolean z) {
        a(f.READY_TO_LOAD);
        IronLog.INTERNAL.verbose(b("errorCode = " + i + ", errorReason = " + str));
        if (this.o.getLoadingData().f()) {
            if (!z) {
                this.s.g.a(e4.a(this.n), i, str);
            }
            a(new IronSourceError(i, str), false);
        } else {
            if (!z) {
                this.s.k.b(i, str);
            }
            b(false);
        }
        this.q.c();
    }

    protected void a(Context context, AuctionRequestParams auctionRequestParams, y0 y0Var) {
        com.json.mediationsdk.e eVar = this.c;
        if (eVar != null) {
            eVar.a(context, auctionRequestParams, y0Var);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    public void a(Context context, boolean z) {
        IronLog.INTERNAL.verbose(b("track = " + z));
        try {
            this.j = z;
            if (z) {
                if (this.k == null) {
                    this.k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.k != null) {
                context.getApplicationContext().unregisterReceiver(this.k);
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    protected void a(c0 c0Var) {
        this.t = c0Var;
    }

    public void a(ed edVar) {
        this.F = edVar;
        this.E = edVar != null;
        this.z = null;
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.v = ironSourceSegment;
    }

    @Override // com.json.f0
    public void a(IronSourceError ironSourceError, y1<?> y1Var) {
        ne<Smash> neVarA;
        y1<?> y1VarC;
        synchronized (this.x) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(b(y1Var.k() + " - error = " + ironSourceError));
            if (y1Var.h().equals(this.f2337a.c()) && this.p != f.AUCTION) {
                this.b.put(y1Var.c(), h.a.ISAuctionPerformanceFailedToLoad);
                if (v() || t()) {
                    neVarA = A();
                    if (neVarA.c()) {
                        a(509, "Mediation No fill", false);
                        return;
                    }
                } else {
                    neVarA = null;
                }
                if (neVarA == null) {
                    return;
                }
                if (this.o.getShowPriorityEnabled()) {
                    synchronized (this.x) {
                        if (neVarA.b() && s() && (y1VarC = new me(this.o).c(this.f2337a.b())) != null) {
                            i(y1VarC);
                        }
                    }
                }
                Iterator<Smash> it = neVarA.a().iterator();
                while (it.hasNext()) {
                    it.next().D();
                }
                return;
            }
            ironLog.error(b("onAdLoadFailed was invoked from " + y1Var.c() + " with state =" + this.p + " auctionId: " + y1Var.h() + " and the current id is " + this.f2337a.c()));
            xd xdVar = this.s.k;
            StringBuilder sb = new StringBuilder();
            sb.append("onAdLoadFailed was invoked with state =");
            sb.append(this.p);
            xdVar.j(sb.toString());
        }
    }

    protected void a(IronSourceError ironSourceError, boolean z) {
        n.a().b(this.o.getAdUnit(), ironSourceError, z);
    }

    @Override // com.json.d2
    public void a(NetworkSettings networkSettings) throws JSONException {
        AdapterBaseInterface adapterBaseInterfaceB = com.json.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), h());
        if (adapterBaseInterfaceB != null) {
            this.s.h.a(a(networkSettings, adapterBaseInterfaceB));
        }
    }

    protected void a(f fVar) {
        synchronized (this.x) {
            this.p = fVar;
        }
    }

    protected void a(y1<?> y1Var, AdInfo adInfo) {
        this.t.c(adInfo);
    }

    @Override // com.json.qb
    public void a(Runnable runnable) {
        v8 v8Var = this.H;
        if (v8Var != null) {
            v8Var.a(runnable);
        }
    }

    @Override // com.json.d2
    public void a(String str) {
        this.s.k.c(str);
    }

    @Override // com.json.y0
    public void a(List<i1> list, String str, i1 i1Var, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) throws JSONException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (!u()) {
            ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.p));
            xd xdVar = this.s.k;
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected auction success, state = ");
            sb.append(this.p);
            xdVar.f(sb.toString());
            return;
        }
        this.f = "";
        this.e = i;
        this.h = i1Var;
        this.g = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            this.s.k.a(i2, str2);
        }
        a(jSONObject2);
        if (this.u.a(this.o.getAdUnit())) {
            this.s.i.a(str);
            a(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped", true);
            return;
        }
        String strA = a(list, str);
        this.s.i.a(j, this.o.s());
        this.s.i.c(strA);
        a(f.LOADING);
        y();
    }

    @Override // com.json.qa
    public void a(boolean z) {
        if (!this.j || this.o.getLoadingData().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z);
        if (c(z)) {
            a(z, false, (y1<?>) null);
        }
    }

    protected void a(boolean z, boolean z2, y1<?> y1Var) {
        synchronized (this.x) {
            Boolean bool = this.z;
            if (bool == null || bool.booleanValue() != z) {
                this.z = Boolean.valueOf(z);
                long time = 0;
                if (this.y != 0) {
                    time = new Date().getTime() - this.y;
                }
                this.y = new Date().getTime();
                this.s.g.a(z, time, z2);
                AdInfo adInfoF = y1Var != null ? y1Var.f() : this.A;
                this.A = adInfoF;
                c0 c0Var = this.t;
                if (!z) {
                    adInfoF = null;
                }
                c0Var.a(z, adInfoF);
            }
        }
    }

    protected boolean a(f fVar, f fVar2) {
        boolean z;
        synchronized (this.x) {
            if (this.p == fVar) {
                z = true;
                this.p = fVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    protected String b(String str) {
        String strName = this.o.getAdUnit().name();
        if (TextUtils.isEmpty(str)) {
            return strName;
        }
        return strName + " - " + str;
    }

    protected abstract JSONObject b(NetworkSettings networkSettings);

    @Override // com.json.m
    public void b() {
        if (this.o.getLoadingData().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            w();
        }
    }

    protected void b(i1 i1Var, String str) throws JSONException {
        if (i1Var == null) {
            IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
            a0 a0Var = this.s;
            if (a0Var != null) {
                a0Var.k.c("reportImpressionDataToPublisher - no auctionResponseItem or listener");
                return;
            }
            return;
        }
        ImpressionData impressionDataA = i1Var.a(str);
        if (impressionDataA != null) {
            for (ImpressionDataListener impressionDataListener : new HashSet(this.B.a())) {
                IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + impressionDataA));
                impressionDataListener.onImpressionSuccess(impressionDataA);
            }
        }
    }

    @Override // com.json.f0
    public void b(y1<?> y1Var) throws JSONException, NumberFormatException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(y1Var.k()));
        this.s.j.e(k());
        this.f2337a.a(y1Var);
        this.l.a(y1Var);
        if (this.l.b(y1Var)) {
            ironLog.verbose(b(y1Var.c() + " was session capped"));
            y1Var.M();
            IronSourceUtils.sendAutomationLog(y1Var.c() + " was session capped");
        }
        com.json.mediationsdk.utils.b.a(ContextProvider.getInstance().getApplicationContext(), k(), this.o.getAdUnit());
        if (com.json.mediationsdk.utils.b.b(ContextProvider.getInstance().getApplicationContext(), k(), this.o.getAdUnit())) {
            ironLog.verbose(b("placement " + k() + " is capped"));
            this.s.j.i(k());
        }
        this.D.b(this.o.getAdUnit());
        if (this.o.r()) {
            i1 i1VarI = y1Var.i();
            this.c.a(i1VarI, y1Var.l(), this.h, k());
            this.b.put(y1Var.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
            if (D()) {
                b(i1VarI, k());
            }
        }
        g(y1Var);
        if (this.o.getLoadingData().e()) {
            b(false);
        }
        this.q.f();
    }

    protected void b(boolean z) {
        a(false, z, (y1<?>) null);
    }

    @Override // com.json.qb
    public boolean c() {
        v8 v8Var = this.H;
        if (v8Var == null || v8Var == Thread.currentThread()) {
            return false;
        }
        return this.o.getThreadPerManager() || this.o.getSharedManagersThread();
    }

    protected abstract c0 e();

    @Override // com.json.f0
    public void e(y1<?> y1Var) throws NumberFormatException {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(y1Var.k()));
        if (!y1Var.h().equals(this.f2337a.c())) {
            ironLog.error(b("invoked from " + y1Var.c() + " with state = " + this.p + " auctionId: " + y1Var.h() + " and the current id is " + this.f2337a.c()));
            xd xdVar = this.s.k;
            StringBuilder sb = new StringBuilder();
            sb.append("onAdLoadSuccess invoked with state = ");
            sb.append(this.p);
            xdVar.k(sb.toString());
            return;
        }
        if (this.o.getShowPriorityEnabled()) {
            List<Smash> listB = this.f2337a.b();
            me meVar = new me(this.o);
            boolean zA = meVar.a(y1Var, listB);
            synchronized (this.x) {
                if (zA) {
                    if (s()) {
                        i(y1Var);
                    }
                }
                if (meVar.a(listB)) {
                    i(meVar.c(listB));
                }
            }
        }
        this.b.put(y1Var.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long jA = e4.a(this.n);
            if (r()) {
                this.s.g.a(jA);
            } else {
                this.s.g.a(jA, n());
            }
            if (this.o.getLoadingData().e()) {
                this.r.a(0L);
            }
            if (!this.o.getShowPriorityEnabled()) {
                i(y1Var);
            }
            h(y1Var);
        }
    }

    protected String f() {
        return b((String) null);
    }

    @Override // com.json.f0
    public void f(y1<?> y1Var) {
        IronLog.INTERNAL.verbose(b(y1Var.k()));
        this.s.j.a(k());
        this.t.a(this.i, y1Var.f());
    }

    protected void g(y1<?> y1Var) {
        this.t.d(y1Var.f());
    }

    public UUID h() {
        return this.w;
    }

    protected void h(y1<?> y1Var) {
        if (this.o.getLoadingData().f()) {
            a(y1Var, y1Var.f());
        } else {
            a(true, false, y1Var);
        }
    }

    protected abstract String i();

    protected void i(y1<?> y1Var) throws NumberFormatException {
        if (this.o.r() && this.G.compareAndSet(false, true)) {
            i1 i1VarI = y1Var.i();
            this.c.a(i1VarI, y1Var.l(), this.h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, i1> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f2337a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.c.a(arrayList, concurrentHashMap, y1Var.l(), this.h, i1VarI);
        }
    }

    protected String j() {
        return "fallback_" + System.currentTimeMillis();
    }

    protected String k() {
        Placement placement = this.i;
        return placement == null ? "" : placement.getPlacementName();
    }

    abstract String l();

    protected boolean n() {
        return false;
    }

    protected boolean q() {
        return false;
    }

    protected abstract boolean r();

    protected boolean s() {
        boolean z;
        synchronized (this.x) {
            f fVar = this.p;
            z = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
        }
        return z;
    }

    protected boolean t() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.READY_TO_SHOW;
        }
        return z;
    }

    protected boolean u() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.AUCTION;
        }
        return z;
    }

    protected boolean v() {
        boolean z;
        synchronized (this.x) {
            z = this.p == f.LOADING;
        }
        return z;
    }

    public void w() {
        if (c()) {
            a(new a());
        } else {
            x();
        }
    }
}
