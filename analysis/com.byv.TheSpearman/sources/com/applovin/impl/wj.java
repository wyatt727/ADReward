package com.applovin.impl;

import com.applovin.impl.uj;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wj extends ke {
    @Override // com.applovin.impl.ke
    public String toString() {
        return "SignalProviderSpec{adObject=" + a() + AbstractJsonLexerKt.END_OBJ;
    }

    public wj(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(map, jSONObject, jSONObject2, kVar);
    }

    public boolean v() {
        return a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean u() {
        return a("initialize_before_collecting_signal", Boolean.TRUE).booleanValue();
    }

    public boolean w() {
        return a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    public long t() {
        return a("signal_expiration_ms", ((Long) this.f598a.a(qe.i7)).longValue());
    }

    public uj.b s() {
        return uj.b.values()[a("signal_cache_level", ((Integer) this.f598a.a(qe.j7)).intValue())];
    }
}
