package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class de extends be implements h8 {
    private boolean A;
    private final Bundle v;
    private final AtomicReference w;
    private final AtomicBoolean x;
    private final AtomicBoolean y;
    private boolean z;

    public Bundle j0() {
        return this.v;
    }

    public boolean n0() {
        return this.z;
    }

    public void a(boolean z) {
        this.z = z;
    }

    public de(int i, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(i, map, jSONObject, jSONObject2, null, kVar);
        this.v = new Bundle();
        this.y = new AtomicBoolean();
        this.w = new AtomicReference();
        this.x = new AtomicBoolean();
    }

    public long g0() {
        long jA = a("ad_hidden_timeout_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_timeout_ms", ((Long) this.f598a.a(qe.p7)).longValue());
    }

    public boolean p0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f598a.a(qe.q7)).booleanValue();
    }

    public boolean q0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f598a.a(qe.r7)).booleanValue();
    }

    public long f0() {
        long jA = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f598a.a(qe.s7)).longValue());
    }

    public long i0() {
        if (J() > 0) {
            return SystemClock.elapsedRealtime() - J();
        }
        return -1L;
    }

    public long k0() {
        long jA = a("fullscreen_display_delay_ms", -1L);
        return jA >= 0 ? jA : ((Long) this.f598a.a(qe.b7)).longValue();
    }

    private de(de deVar, com.applovin.impl.mediation.g gVar) {
        super(deVar.I(), deVar.i(), deVar.a(), deVar.g(), gVar, deVar.f598a);
        this.v = new Bundle();
        this.y = new AtomicBoolean();
        this.w = deVar.w;
        this.x = deVar.x;
    }

    public long e0() {
        return a("ahdm", ((Long) this.f598a.a(qe.d7)).longValue());
    }

    public boolean r0() {
        return a("susaode", (Boolean) this.f598a.a(qe.c7)).booleanValue();
    }

    public String l0() {
        return b("mcode", "");
    }

    public boolean o0() {
        return this.x.get();
    }

    public void c0() {
        this.x.set(true);
    }

    public ch h0() {
        return (ch) this.w.getAndSet(null);
    }

    public AtomicBoolean m0() {
        return this.y;
    }

    @Override // com.applovin.impl.h8
    public long getTimeToLiveMillis() {
        return d0() - (SystemClock.elapsedRealtime() - J());
    }

    private long d0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f598a.a(qe.k7)).longValue()) : jA;
    }

    @Override // com.applovin.impl.h8
    public void setExpired() {
        this.A = true;
    }

    public void a(ch chVar) {
        this.w.set(chVar);
    }

    @Override // com.applovin.impl.be
    public void a(Bundle bundle) throws JSONException {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.v.putBundle("applovin_ad_view_info", bundle2);
    }

    @Override // com.applovin.impl.be
    public be a(com.applovin.impl.mediation.g gVar) {
        return new de(this, gVar);
    }
}
