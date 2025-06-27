package com.applovin.impl.sdk;

import com.applovin.impl.h0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final k f921a;
    private final t b;
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Object c = new Object();

    c(k kVar) {
        this.f921a = kVar;
        this.b = kVar.L();
        for (h0 h0Var : h0.a()) {
            this.d.put(h0Var, new v());
            this.e.put(h0Var, new v());
        }
    }

    public AppLovinAdImpl e(h0 h0Var) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.c) {
            v vVarD = d(h0Var);
            if (vVarD.b() > 0) {
                b(h0Var).a(vVarD.a());
                cVar = new com.applovin.impl.sdk.ad.c(h0Var, this.f921a);
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            if (t.a()) {
                this.b.a("AdPreloadManager", "Retrieved ad of zone " + h0Var + "...");
            }
        } else if (t.a()) {
            this.b.a("AdPreloadManager", "Unable to retrieve ad of zone " + h0Var + "...");
        }
        return cVar;
    }

    public AppLovinAdImpl a(h0 h0Var) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.c) {
            appLovinAdImplA = c(h0Var).a();
        }
        return appLovinAdImplA;
    }

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (t.a()) {
                this.b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public AppLovinAdBase f(h0 h0Var) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.c) {
            appLovinAdImplD = c(h0Var).d();
        }
        return appLovinAdImplD;
    }

    private v d(h0 h0Var) {
        v vVar;
        synchronized (this.c) {
            vVar = (v) this.d.get(h0Var);
            if (vVar == null) {
                vVar = new v();
                this.d.put(h0Var, vVar);
            }
        }
        return vVar;
    }

    private v b(h0 h0Var) {
        v vVar;
        synchronized (this.c) {
            vVar = (v) this.e.get(h0Var);
            if (vVar == null) {
                vVar = new v();
                this.e.put(h0Var, vVar);
            }
        }
        return vVar;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    private v c(h0 h0Var) {
        synchronized (this.c) {
            v vVarB = b(h0Var);
            if (vVarB.b() > 0) {
                return vVarB;
            }
            return d(h0Var);
        }
    }
}
