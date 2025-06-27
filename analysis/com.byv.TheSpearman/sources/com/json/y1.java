package com.json;

import android.text.TextUtils;
import com.json.a0;
import com.json.environment.ContextProvider;
import com.json.f0;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.sc;
import com.json.vc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class y1<Listener extends f0> implements NetworkInitializationListener, vc.a, z, AdapterAdListener, sc.a {

    /* renamed from: a, reason: collision with root package name */
    protected u f2445a;
    protected Listener b;
    protected BaseAdAdapter<?, AdapterAdListener> c;
    protected a0 d;
    protected h e;
    protected Placement g;
    protected m0 h;
    protected JSONObject i;
    protected String j;
    protected AdData k;
    protected Long l;
    protected e4 m;
    private final i1 o;
    private final qb p;
    private AtomicBoolean f = new AtomicBoolean(false);
    private vc n = new vc(TimeUnit.SECONDS.toMillis(s()));
    protected final Object q = new Object();

    class a extends kc {
        a() {
        }

        @Override // com.json.kc
        public void a() {
            y1.this.K();
        }
    }

    class b extends kc {
        b() {
        }

        @Override // com.json.kc
        public void a() {
            y1.this.J();
        }
    }

    class c extends kc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2448a;
        final /* synthetic */ String b;

        c(int i, String str) {
            this.f2448a = i;
            this.b = str;
        }

        @Override // com.json.kc
        public void a() {
            y1.this.a(this.f2448a, this.b);
        }
    }

    class d extends kc {
        d() {
        }

        @Override // com.json.kc
        public void a() {
            y1.this.H();
        }
    }

    class e extends kc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdapterErrorType f2450a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        e(AdapterErrorType adapterErrorType, int i, String str) {
            this.f2450a = adapterErrorType;
            this.b = i;
            this.c = str;
        }

        @Override // com.json.kc
        public void a() {
            y1.this.a(this.f2450a, this.b, this.c);
        }
    }

    class f extends kc {
        f() {
        }

        @Override // com.json.kc
        public void a() {
            y1.this.I();
        }
    }

    class g extends kc {
        g() {
        }

        @Override // com.json.kc
        public void a() {
            y1.this.G();
        }
    }

    protected enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y1(qb qbVar, u uVar, BaseAdAdapter<?, ?> baseAdAdapter, m0 m0Var, i1 i1Var, Listener listener) {
        this.f2445a = uVar;
        this.b = listener;
        this.d = new a0(uVar.a(), a0.b.PROVIDER, this);
        this.h = m0Var;
        this.i = m0Var.c();
        this.c = baseAdAdapter;
        this.o = i1Var;
        this.p = qbVar;
        a(h.NONE);
    }

    private boolean C() {
        return this.e == h.INIT_IN_PROGRESS;
    }

    private void E() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.n.a((vc.a) this);
            F();
        } catch (Throwable th) {
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            a0 a0Var = this.d;
            if (a0Var != null) {
                a0Var.k.c(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        IronLog.INTERNAL.verbose(d());
        a0 a0Var = this.d;
        if (a0Var != null) {
            a0Var.j.a(j());
        }
        this.b.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        boolean zN;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        vc vcVar = this.n;
        if (vcVar != null) {
            vcVar.e();
        }
        synchronized (this.q) {
            h hVar = this.e;
            zN = false;
            if (hVar == h.LOADING) {
                long jA = e4.a(this.m);
                ironLog.verbose(a("Load duration = " + jA));
                if (this.d != null) {
                    if (u()) {
                        this.d.g.a(jA);
                    } else {
                        this.d.g.a(jA, false);
                    }
                }
                a(h.LOADED);
                zN = N();
            } else if (hVar != h.FAILED) {
                ironLog.error(a(String.format("unexpected load success for %s, state - %s", k(), this.e)));
                String str = String.format("unexpected load success, state - %s", this.e);
                if (this.d != null) {
                    if (u()) {
                        this.d.k.n(str);
                    } else {
                        this.d.k.k(str);
                    }
                }
            }
        }
        if (zN) {
            this.b.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        a0 a0Var = this.d;
        if (a0Var != null) {
            a0Var.j.e(j());
        }
        this.b.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (C()) {
            vc vcVar = this.n;
            if (vcVar != null) {
                vcVar.e();
            }
            a(h.READY_TO_LOAD);
            E();
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init success for %s, state - %s", k(), this.e)));
        if (this.d != null) {
            this.d.k.i(String.format("unexpected init success, state - %s", this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        long jA = e4.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", state = " + this.e + ", isBidder = " + v()));
        synchronized (this.q) {
            if (!y()) {
                ironLog.error(a(String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.e, 1025)));
                if (this.d != null) {
                    this.d.k.p(String.format("unexpected timeout, state - %s, error - %s", this.e, 1025));
                }
            } else {
                a(h.FAILED);
                a0 a0Var = this.d;
                if (a0Var != null) {
                    a0Var.g.a(jA, 1025);
                    this.d.g.a(jA, 1025, "time out");
                }
                this.b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        if (C()) {
            vc vcVar = this.n;
            if (vcVar != null) {
                vcVar.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, e4.a(this.m));
            this.b.a(new IronSourceError(i, str), this);
            return;
        }
        if (this.e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.e, Integer.valueOf(i), str)));
        if (this.d != null) {
            this.d.k.h(String.format("unexpected init failed, state - %s, error - %s, %s", this.e, Integer.valueOf(i), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdapterErrorType adapterErrorType, int i, String str) {
        long jA = e4.a(this.m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", error = " + i + ", " + str));
        vc vcVar = this.n;
        if (vcVar != null) {
            vcVar.e();
        }
        synchronized (this.q) {
            h hVar = this.e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i, str, jA);
                a(h.FAILED);
                this.b.a(new IronSourceError(i, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                a(adapterErrorType, i, str, jA);
                return;
            }
            if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a(String.format("ad expired for %s, state = %s", this.h.f(), this.e)));
                a0 a0Var = this.d;
                if (a0Var != null) {
                    a0Var.k.a(String.format("ad expired, state = %s", this.e));
                }
                return;
            }
            ironLog.error(a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.e, Integer.valueOf(i), str)));
            String str2 = String.format("unexpected load failed, state - %s, error - %s, %s", this.e, Integer.valueOf(i), str);
            if (this.d != null) {
                if (u()) {
                    this.d.k.m(str2);
                } else if (this.f2445a.a() != IronSource.AD_UNIT.REWARDED_VIDEO || this.e != h.SHOWING) {
                    this.d.k.j(str2);
                }
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (u()) {
                    this.d.g.c(j, i);
                    return;
                } else {
                    this.d.g.b(j, i);
                    return;
                }
            }
            if (TextUtils.isEmpty(str)) {
                this.d.g.a(j, i);
            } else if (u()) {
                this.d.g.b(j, i, str);
            } else {
                this.d.g.a(j, i, str);
            }
        }
    }

    private boolean b(y yVar) {
        return new ArrayList(Arrays.asList(y.LOAD_AD, y.LOAD_AD_SUCCESS, y.LOAD_AD_FAILED, y.LOAD_AD_FAILED_WITH_REASON, y.LOAD_AD_NO_FILL, y.RELOAD_AD, y.RELOAD_AD_SUCCESS, y.RELOAD_AD_FAILED_WITH_REASON, y.RELOAD_AD_NO_FILL, y.DESTROY_AD, y.AD_PRESENT_SCREEN, y.AD_DISMISS_SCREEN, y.AD_LEFT_APPLICATION, y.AD_OPENED, y.AD_CLOSED, y.SHOW_AD, y.SHOW_AD_FAILED, y.AD_CLICKED, y.AD_REWARDED)).contains(yVar);
    }

    private int o() {
        return 1;
    }

    private int s() {
        i1 i1Var = this.o;
        if (i1Var == null) {
            return this.f2445a.f();
        }
        Integer numE = i1Var.e();
        int iF = (numE == null || numE.intValue() <= 0) ? this.f2445a.f() : numE.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.o.c() + " - " + iF + " seconds"));
        return iF;
    }

    public boolean A() {
        return x();
    }

    public boolean B() {
        return this.e == h.SHOWING;
    }

    public void D() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        i1 i1VarI = i();
        String strJ = i1VarI.j();
        Map<String, Object> mapA = i9.a(i1VarI.a());
        mapA.put("adUnit", this.f2445a.a());
        b(strJ);
        try {
            boolean z = false;
            if (u()) {
                this.d.g.a();
            } else {
                this.d.g.a(false);
            }
            this.l = null;
            this.m = new e4();
            this.k = a(strJ, mapA);
            synchronized (this.q) {
                if (this.e != h.NONE) {
                    z = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str = "loadAd - incorrect state while loading, state = " + this.e;
                ironLog.error(a(str));
                this.d.k.c(str);
                onInitFailed(x.c(this.f2445a.a()), str);
                return;
            }
            this.n.a((vc.a) this);
            AdapterBaseInterface networkAdapter = this.c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(x.c(this.f2445a.a()), str2);
        } catch (Throwable th) {
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            a0 a0Var = this.d;
            if (a0Var != null) {
                a0Var.k.c(str3);
            }
            onInitFailed(x.c(this.f2445a.a()), str3);
        }
    }

    protected void F() {
        Object obj = this.c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    public void L() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
        if (baseAdAdapter != null) {
            try {
                baseAdAdapter.releaseMemory();
                this.c = null;
            } catch (Exception e2) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.h.f() + " - " + e2.getMessage() + " - state = " + this.e;
                IronLog.INTERNAL.error(a(str));
                this.d.k.c(str);
            }
        }
        a0 a0Var = this.d;
        if (a0Var != null) {
            a0Var.f();
            this.d = null;
        }
        vc vcVar = this.n;
        if (vcVar != null) {
            vcVar.d();
            this.n = null;
        }
    }

    public void M() {
        IronLog.INTERNAL.verbose(d());
        a0 a0Var = this.d;
        if (a0Var != null) {
            a0Var.j.a();
        }
    }

    protected boolean N() {
        return true;
    }

    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    protected String a(String str) {
        String str2 = this.f2445a.a().name() + " - " + k() + " - state = " + this.e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    public Map<String, Object> a(y yVar) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception unused) {
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        map.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.h.i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.h.a());
        map.put("instanceType", Integer.valueOf(l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.j)) {
            map.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.j);
        }
        map.put("sessionDepth", r());
        if (this.f2445a.e() != null && this.f2445a.e().length() > 0) {
            map.put("genericParams", this.f2445a.e());
        }
        if (!TextUtils.isEmpty(this.f2445a.c())) {
            map.put("auctionId", this.f2445a.c());
        }
        if (b(yVar)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f2445a.d()));
            if (!TextUtils.isEmpty(this.f2445a.b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f2445a.b());
            }
        }
        if (!TextUtils.isEmpty(this.f2445a.g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f2445a.g().getCustomNetwork());
        }
        return map;
    }

    protected Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f2445a.i());
        return map;
    }

    @Override // com.ironsource.vc.a
    public void a() {
        if (this.p.c()) {
            this.p.a(new a());
        } else {
            K();
        }
    }

    protected void a(h hVar) {
        this.e = hVar;
    }

    public void a(boolean z) {
        this.f.set(z);
    }

    @Override // com.ironsource.sc.a
    public int b() {
        return this.h.e();
    }

    public void b(String str) {
        this.j = com.json.mediationsdk.d.c().d(str);
    }

    @Override // com.ironsource.sc.a
    public String c() {
        return this.h.f();
    }

    protected String d() {
        return a((String) null);
    }

    public Long e() {
        return this.l;
    }

    public AdInfo f() {
        return new AdInfo(this.o.a(j()));
    }

    public IronSource.AD_UNIT g() {
        return this.f2445a.a();
    }

    public String h() {
        return this.f2445a.c();
    }

    public i1 i() {
        return this.o;
    }

    protected String j() {
        Placement placement = this.g;
        return placement == null ? "" : placement.getPlacementName();
    }

    public String k() {
        return String.format("%s %s", c(), Integer.valueOf(hashCode()));
    }

    public int l() {
        return this.h.d();
    }

    public String m() {
        return this.h.h().isMultipleInstances() ? this.h.h().getProviderTypeForReflection() : this.h.f();
    }

    public String n() {
        return this.h.g();
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.p.c()) {
            this.p.a(new g());
        } else {
            G();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str) {
        if (this.p.c()) {
            this.p.a(new e(adapterErrorType, i, str));
        } else {
            a(adapterErrorType, i, str);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.p.c()) {
            this.p.a(new d());
        } else {
            H();
        }
    }

    public void onAdOpened() {
        if (this.p.c()) {
            this.p.a(new f());
        } else {
            I();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        if (this.p.c()) {
            this.p.a(new c(i, str));
        } else {
            a(i, str);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.p.c()) {
            this.p.a(new b());
        } else {
            J();
        }
    }

    public NetworkSettings p() {
        return this.f2445a.g();
    }

    protected Map<String, Object> q() {
        HashMap map = new HashMap();
        map.putAll(i9.a(this.i));
        return map;
    }

    public Integer r() {
        u uVar = this.f2445a;
        if (uVar != null) {
            return Integer.valueOf(uVar.h());
        }
        return null;
    }

    protected qb t() {
        return this.p;
    }

    protected boolean u() {
        return false;
    }

    public boolean v() {
        return this.h.j();
    }

    public boolean w() {
        return this.e == h.FAILED;
    }

    public boolean x() {
        return this.e == h.LOADED;
    }

    public boolean y() {
        h hVar = this.e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    public AtomicBoolean z() {
        return this.f;
    }
}
