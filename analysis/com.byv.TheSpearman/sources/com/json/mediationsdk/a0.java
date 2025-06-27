package com.json.mediationsdk;

import android.text.TextUtils;
import com.json.environment.ContextProvider;
import com.json.m0;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.sc;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a0 implements sc.a {

    /* renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f1908a;
    protected m0 b;
    private boolean c;
    protected JSONObject d;
    protected String e;
    protected int f;
    protected Long g = null;

    a0(m0 m0Var, AbstractAdapter abstractAdapter) {
        this.b = m0Var;
        this.f1908a = abstractAdapter;
        this.d = m0Var.c();
    }

    private void a(String str, int i) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " " + c() + " : " + str, i);
    }

    public void a(String str) {
        a(str, 0);
    }

    public void a(boolean z) {
        this.c = z;
    }

    @Override // com.ironsource.sc.a
    public int b() {
        return this.b.e();
    }

    public void b(String str) {
        a(str, 3);
    }

    @Override // com.ironsource.sc.a
    public String c() {
        return this.b.f();
    }

    public void c(String str) {
        this.e = d.c().d(str);
    }

    public abstract IronSource.AD_UNIT d();

    public Long e() {
        return this.g;
    }

    public String f() {
        return String.format("%s %s", i(), Integer.valueOf(hashCode()));
    }

    public int g() {
        return this.b.d();
    }

    public boolean h() {
        return this.c;
    }

    public String i() {
        return this.b.h().isMultipleInstances() ? this.b.h().getProviderTypeForReflection() : this.b.h().getProviderName();
    }

    public String j() {
        return this.b.g();
    }

    public abstract String k();

    public int l() {
        return 1;
    }

    public Map<String, Object> m() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f1908a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f1908a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            map.put("instanceType", Integer.valueOf(p() ? 2 : 1));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(l()));
            if (!TextUtils.isEmpty(this.e)) {
                map.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.e);
            }
        } catch (Throwable th) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + c() + ")", th);
        }
        return map;
    }

    public int n() {
        return this.f;
    }

    public boolean o() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f1908a.isUsingActivityBeforeImpression(d())) {
                return false;
            }
            ironLog.verbose(c() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th) {
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th.getLocalizedMessage());
            return true;
        }
    }

    public boolean p() {
        return this.b.j();
    }

    public void q() {
        try {
            AbstractAdapter abstractAdapter = this.f1908a;
            if (abstractAdapter != null) {
                abstractAdapter.releaseMemory(this.b.b(), this.d);
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.error("exception - " + th.getMessage());
        }
        this.f1908a = null;
    }

    public boolean r() {
        if (o()) {
            return false;
        }
        return p() || s();
    }

    public boolean s() {
        return this.b.k();
    }
}
