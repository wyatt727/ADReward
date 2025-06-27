package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.g4;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.t2;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class rm extends xl {
    private final com.applovin.impl.sdk.k h;

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public void run() {
        String str;
        com.applovin.impl.sdk.t tVar;
        String str2;
        StringBuilder sb;
        str = "succeeded";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.t.a()) {
            this.c.a(this.b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.h.F().e();
            this.h.F().a(aa.h);
            this.h.F().a(aa.i);
            this.h.D().b(a());
            this.h.D().e(a());
            this.h.l0().a((xl) new yl(this.h), sm.b.OTHER);
            if (this.h.y() != null) {
                this.h.y().l();
            } else {
                this.h.x().P();
            }
            this.h.e0().c();
            this.h.v().l();
            if (zp.c(this.h)) {
                this.h.a();
            }
            this.h.l().collectAppHubData();
            h();
            if (((Boolean) this.h.a(oj.q4)).booleanValue()) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.rm$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.f();
                    }
                });
            }
            g();
            this.h.a(true);
            this.h.Z().b();
            this.h.i().maybeFireAppKilledWhilePlayingAdPostback();
            this.h.C().maybeTrackAppOpenEvent();
            if (this.h.P().g() || (((Boolean) this.h.a(qe.N6)).booleanValue() && zp.c(this.h) && this.h.D0())) {
                this.h.P().e();
            }
            if (this.h.b0() != null) {
                this.h.b0().b((String) this.h.a(oj.J));
            }
            this.h.Y().i();
            if (((Boolean) this.h.a(oj.n0)).booleanValue()) {
                this.h.a(((Long) this.h.a(oj.o0)).longValue());
            }
        } catch (Throwable th) {
            try {
                com.applovin.impl.sdk.t.c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.h.a(false);
                a(th);
                if (((Boolean) this.h.a(oj.j)).booleanValue()) {
                    this.h.Z().a();
                }
                if (((Boolean) this.h.a(oj.i)).booleanValue()) {
                    this.h.U0();
                }
                if (this.h.b0() != null) {
                    this.h.b0().b((String) this.h.a(oj.J));
                }
                this.h.Y().i();
                if (((Boolean) this.h.a(oj.n0)).booleanValue()) {
                    this.h.a(((Long) this.h.a(oj.o0)).longValue());
                }
                if (!com.applovin.impl.sdk.t.a()) {
                    return;
                }
                tVar = this.c;
                str2 = this.b;
                sb = new StringBuilder();
                sb.append("AppLovin SDK ");
                sb.append(AppLovinSdk.VERSION);
                sb.append(" initialization ");
                if (!this.h.y0()) {
                }
            } catch (Throwable th2) {
                if (this.h.b0() != null) {
                    this.h.b0().b((String) this.h.a(oj.J));
                }
                this.h.Y().i();
                if (((Boolean) this.h.a(oj.n0)).booleanValue()) {
                    this.h.a(((Long) this.h.a(oj.o0)).longValue());
                }
                if (com.applovin.impl.sdk.t.a()) {
                    com.applovin.impl.sdk.t tVar2 = this.c;
                    String str3 = this.b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("AppLovin SDK ");
                    sb2.append(AppLovinSdk.VERSION);
                    sb2.append(" initialization ");
                    sb2.append(this.h.y0() ? "succeeded" : t2.h.t);
                    sb2.append(" in ");
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb2.append("ms");
                    tVar2.a(str3, sb2.toString());
                }
                throw th2;
            }
        }
        if (com.applovin.impl.sdk.t.a()) {
            tVar = this.c;
            str2 = this.b;
            sb = new StringBuilder();
            sb.append("AppLovin SDK ");
            sb.append(AppLovinSdk.VERSION);
            sb.append(" initialization ");
            if (!this.h.y0()) {
                str = t2.h.t;
            }
            sb.append(str);
            sb.append(" in ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb.append("ms");
            tVar.a(str2, sb.toString());
        }
    }

    public rm(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.h = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        tr.f(this.h);
    }

    private void g() {
        if (this.h.N().c()) {
            return;
        }
        Activity activityP0 = this.h.p0();
        if (activityP0 != null) {
            this.h.N().a(activityP0);
        } else {
            this.h.l0().a(new kn(this.h, true, "initializeAdapters", new Runnable() { // from class: com.applovin.impl.rm$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e();
                }
            }), sm.b.CORE, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.h.N().a(this.h.e().b());
    }

    private void h() {
        Map mapL;
        Map mapF;
        String strA;
        boolean zC = this.h.h0().c();
        String str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (this.h.y() != null) {
            mapL = this.h.y().d();
            mapF = this.h.y().j();
            strA = zC ? this.h.z().d().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
            if (zC) {
                str = mapL.get("idfv") + " (use this for test devices)";
            }
        } else {
            mapL = this.h.x().l();
            mapF = this.h.x().F();
            strA = zC ? this.h.x().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
            if (zC) {
                str = mapL.get("idfv") + " (use this for test devices)";
            }
        }
        lc lcVar = new lc();
        lcVar.a().a("=====AppLovin SDK=====");
        lcVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.h.a(oj.U3)).a("Ad Review Version", v.b()).a("OM SDK Version", this.h.Y().c());
        lcVar.a("===Device Info===").a("OS", zp.d()).a(IronSourceConstants.TYPE_GAID, strA).a("App Set ID", str).a("Model", mapL.get(com.json.i5.u)).a("Locale", mapL.get("locale")).a("Emulator", mapL.get("sim")).a("Tablet", mapL.get("is_tablet"));
        lcVar.a("===App Info===").a("Application ID", mapF.get("package_name")).a("Target SDK", mapF.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(zp.f()));
        lcVar.a("===SDK Settings===").a("SDK Key", this.h.d0()).a("Mediation Provider", this.h.Q()).a("TG", xp.a(this.h)).a("AEI", this.h.a(oj.z)).a("MEI", this.h.a(oj.A)).a(com.json.td.B, this.h.a(oj.B)).a("Test Mode On", Boolean.valueOf(this.h.n0().c())).a("Verbose Logging On", Boolean.valueOf(zC));
        lcVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(y3.a(a()));
        lcVar.a("===MAX Terms Flow===");
        f4 f4VarT = this.h.t();
        boolean zK = f4VarT.k();
        lcVar.a("Enabled", Boolean.valueOf(zK));
        if (zK) {
            boolean z = f4VarT.e() == g4.a.UNIFIED;
            lcVar.a("Flow Type", z ? "MAX Terms and Privacy Policy Flow" : "MAX Terms Flow");
            if (z) {
                AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.h.q().getConsentFlowUserGeography();
                AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyF = f4VarT.f();
                AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                String str2 = "Other";
                lcVar.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
                if (zp.c(this.h)) {
                    if (consentFlowUserGeographyF == consentFlowUserGeography2) {
                        str2 = "GDPR";
                    } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                        str2 = "None";
                    }
                    lcVar.a("Debug User Geography", str2);
                }
            }
        }
        lcVar.a("Privacy Policy URI", f4VarT.h()).a("Terms of Service URI", f4VarT.i());
        this.h.m0();
        lcVar.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.h.m0().j());
        lcVar.a();
        com.applovin.impl.sdk.t.g("AppLovinSdk", lcVar.toString());
    }
}
