package com.json.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.json.adapters.ironsource.IronSourceLoadParameters;
import com.json.b9;
import com.json.m0;
import com.json.mediationsdk.AbstractAdapter;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.d;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f1945a;
    protected m0 b;
    protected JSONObject c;
    private a d;
    private Timer e;
    long f;
    protected String g;
    protected JSONObject h;
    protected List<String> i;
    protected String j;
    private final Object k = new Object();
    private final Object l = new Object();
    protected final IronSource.AD_UNIT m;

    protected enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public m(m0 m0Var, AbstractAdapter abstractAdapter) throws JSONException {
        this.b = m0Var;
        this.m = m0Var.b();
        this.f1945a = abstractAdapter;
        JSONObject jSONObjectC = m0Var.c();
        this.c = jSONObjectC;
        try {
            jSONObjectC.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException unused) {
        }
        this.d = a.NOT_LOADED;
        this.e = null;
        this.g = "";
        this.h = null;
        this.i = new ArrayList();
    }

    a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.k) {
            aVar2 = this.d;
            if (Arrays.asList(aVarArr).contains(this.d)) {
                b(aVar);
            }
        }
        return aVar2;
    }

    public void a(String str) {
        this.g = str;
    }

    protected void a(List<String> list, String str, int i, String str2, String str3) {
        Iterator it = ((List) b9.a((ArrayList) list, new ArrayList())).iterator();
        while (it.hasNext()) {
            d.c().a(str3, str, d.c().a((String) it.next(), str, i, str2, "", "", "", ""));
        }
    }

    void a(TimerTask timerTask) {
        synchronized (this.l) {
            p();
            Timer timer = new Timer();
            this.e = timer;
            timer.schedule(timerTask, this.f);
        }
    }

    public void a(JSONObject jSONObject) {
        this.h = jSONObject;
    }

    public void a(boolean z) throws JSONException {
        try {
            this.c.put("isOneFlow", z);
        } catch (Exception e) {
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z + ". Error: " + e.getMessage());
        }
    }

    boolean a(a aVar) {
        boolean z;
        synchronized (this.k) {
            z = this.d == aVar;
        }
        return z;
    }

    boolean a(a aVar, a aVar2) {
        synchronized (this.k) {
            if (this.d != aVar) {
                return false;
            }
            b(aVar2);
            return true;
        }
    }

    void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.b.f() + ": current state=" + this.d + ", new state=" + aVar);
        synchronized (this.k) {
            this.d = aVar;
        }
    }

    public void b(String str) {
        this.j = d.c().d(str);
    }

    public m0 f() {
        return this.b;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.b.f();
    }

    public int i() {
        return this.b.d();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f1945a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f1945a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            map.put("isDemandOnly", 1);
            map.put("instanceType", Integer.valueOf(this.b.d()));
            if (!TextUtils.isEmpty(this.g)) {
                map.put("auctionId", this.g);
            }
            JSONObject jSONObject = this.h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.h);
            }
            if (!TextUtils.isEmpty(this.j)) {
                map.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.j);
            }
            if (o()) {
                map.put("isOneFlow", 1);
            }
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + h() + ")", e);
        }
        return map;
    }

    String k() {
        a aVar = this.d;
        return aVar == null ? AbstractJsonLexerKt.NULL : aVar.toString();
    }

    public String l() {
        return this.b.i();
    }

    public List<String> m() {
        return this.i;
    }

    public boolean n() {
        return this.b.j();
    }

    public boolean o() {
        return this.c.optBoolean("isOneFlow", false);
    }

    void p() {
        synchronized (this.l) {
            Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
                this.e = null;
            }
        }
    }
}
