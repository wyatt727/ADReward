package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ce extends ie {
    @Override // com.applovin.impl.be
    public be a(com.applovin.impl.mediation.g gVar) {
        return new ce(this, gVar);
    }

    public ce(int i, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(i, map, jSONObject, jSONObject2, null, kVar);
    }

    public int o0() {
        int iA = a("ad_view_width", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public int m0() {
        int iA = a("ad_view_height", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    private ce(ce ceVar, com.applovin.impl.mediation.g gVar) {
        super(ceVar.I(), ceVar.i(), ceVar.a(), ceVar.g(), gVar, ceVar.f598a);
    }

    public long n0() {
        return a("viewability_imp_delay_ms", ((Long) this.f598a.a(oj.H1)).longValue());
    }

    public boolean p0() {
        return k0() >= 0;
    }

    public long k0() {
        long jA = a("ad_refresh_ms", -1L);
        return jA >= 0 ? jA : b("ad_refresh_ms", ((Long) this.f598a.a(qe.S6)).longValue());
    }

    public boolean q0() {
        return a("proe", (Boolean) this.f598a.a(qe.t7)).booleanValue();
    }

    public long l0() {
        return zp.d(a("bg_color", (String) null));
    }
}
