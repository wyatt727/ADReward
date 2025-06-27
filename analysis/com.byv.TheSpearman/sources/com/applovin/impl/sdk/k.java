package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.impl.aa;
import com.applovin.impl.b4;
import com.applovin.impl.b5;
import com.applovin.impl.ba;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.f4;
import com.applovin.impl.g4;
import com.applovin.impl.im;
import com.applovin.impl.ir;
import com.applovin.impl.ke;
import com.applovin.impl.kj;
import com.applovin.impl.kn;
import com.applovin.impl.le;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mg;
import com.applovin.impl.oj;
import com.applovin.impl.pe;
import com.applovin.impl.pj;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.qe;
import com.applovin.impl.qj;
import com.applovin.impl.rm;
import com.applovin.impl.rn;
import com.applovin.impl.rr;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.sm;
import com.applovin.impl.te;
import com.applovin.impl.th;
import com.applovin.impl.ue;
import com.applovin.impl.w4;
import com.applovin.impl.wf;
import com.applovin.impl.xl;
import com.applovin.impl.xn;
import com.applovin.impl.xp;
import com.applovin.impl.yc;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;
import com.applovin.sdk.AppLovinUserSegment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {
    public static k A0;
    protected static Context B0;
    private static final boolean D0;
    private static volatile com.applovin.impl.q E0;

    /* renamed from: a, reason: collision with root package name */
    private String f935a;
    private WeakReference b;
    private long d;
    private AppLovinSdkSettings f;
    private AppLovinUserSegment g;
    private AppLovinTargetingData h;
    private List h0;
    private String i;
    private boolean l0;
    private volatile AppLovinSdk o;
    private String r0;
    private AppLovinSdkInitializationConfiguration s0;
    private AppLovinSdk.SdkInitializationListener v0;
    private AppLovinSdk.SdkInitializationListener w0;
    private static final Object F0 = new Object();
    private static final long C0 = System.currentTimeMillis();
    private final AtomicBoolean e = new AtomicBoolean();
    private final AtomicReference j = new AtomicReference();
    private final AtomicReference k = new AtomicReference();
    private final AtomicReference l = new AtomicReference();
    private final AtomicReference m = new AtomicReference();
    private final AtomicReference n = new AtomicReference();
    private final t p = new t(this);
    private final o q = new o(this);
    private final AtomicReference r = new AtomicReference();
    private final AtomicReference s = new AtomicReference();
    private final AtomicReference t = new AtomicReference();
    private final AtomicReference u = new AtomicReference();
    private final AtomicReference v = new AtomicReference();
    private final AtomicReference w = new AtomicReference();
    private final AtomicReference x = new AtomicReference();
    private final AtomicReference y = new AtomicReference();
    private final AtomicReference z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();
    private final AtomicReference a0 = new AtomicReference();
    private final AtomicReference b0 = new AtomicReference();
    private final AtomicReference c0 = new AtomicReference();
    private final AtomicReference d0 = new AtomicReference();
    private final AtomicReference e0 = new AtomicReference();
    private final AtomicReference f0 = new AtomicReference();
    private final AtomicReference g0 = new AtomicReference();
    private final Object i0 = new Object();
    private final AtomicBoolean j0 = new AtomicBoolean(true);
    private final AtomicBoolean k0 = new AtomicBoolean();
    private boolean m0 = false;
    private boolean n0 = false;
    private boolean o0 = false;
    private boolean p0 = false;
    private int q0 = 0;
    private final Object t0 = new Object();
    private AppLovinSdkConfiguration u0 = new SdkConfigurationImpl(null, this);
    private final AtomicBoolean x0 = new AtomicBoolean(false);
    private final xl y0 = new kn(this, true, "scheduleAdLoadIntegrationError", new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda12
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.H0();
        }
    });
    private final xl z0 = new kn(this, true, "sdkInit", new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda9
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.I0();
        }
    });
    private long c = System.currentTimeMillis();

    class a implements f4.c {
        a() {
        }

        @Override // com.applovin.impl.f4.c
        public void a(f4.b bVar) {
        }
    }

    class c implements im.b {
        c() {
        }

        @Override // com.applovin.impl.im.b
        public void a(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.length() > 0) {
                k.this.c(jSONObject);
            }
            k.this.e.set(false);
            k.this.O0();
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    zp.c();
                }
            });
            D0 = true;
        } catch (Throwable unused) {
            D0 = false;
        }
    }

    public k(Context context) {
        this.l0 = false;
        this.f = new AppLovinSdkSettings(context);
        this.l0 = true;
        if (!B0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://developers.applovin.com/en/android/overview/integration");
        }
        B0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.b = new WeakReference((Activity) context);
        }
        if (A0 == null) {
            A0 = this;
        } else {
            t.h("AppLovinSdk", "Multiple SDK instances detected");
        }
    }

    public static boolean B0() {
        return D0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0() {
        if (l0().d()) {
            return;
        }
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "Timing out adapters init...");
        }
        l0().e();
        M0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0() {
        sm smVarL0 = l0();
        int i = this.q0 + 1;
        this.q0 = i;
        smVarL0.a((xl) new im(i, this, new c()), sm.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0() {
        if (D0()) {
            r.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0() {
        synchronized (this.i0) {
            boolean zA = c4.a(k());
            if (!((Boolean) a(oj.n3)).booleanValue() || zA) {
                S0();
            }
            if (((Boolean) a(oj.m3)).booleanValue() && !zA) {
                L();
                if (t.a()) {
                    L().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                T0();
            }
            if (t().e() == g4.a.TERMS) {
                if (D0()) {
                    L();
                    if (t.a()) {
                        L().a("AppLovinSdk", "MAX mediation detected... Generating consent flow...");
                    }
                    t().a();
                    t().b(p0(), new a());
                } else {
                    L();
                    if (t.a()) {
                        L().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + this.i);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        synchronized (this.t0) {
            if (this.s0 != null) {
                return;
            }
            this.y0.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        synchronized (this.t0) {
            if (this.s0 != null) {
                return;
            }
            this.x0.set(true);
            this.z0.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        c(qj.I);
    }

    private w N0() {
        if (!th.f(B0)) {
            return null;
        }
        try {
            return new w(this);
        } catch (Throwable th) {
            t.b("AppLovinSdk", "Failed to initialize Privacy Sandbox Service", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0() {
        Long l = (Long) a(oj.v3);
        if (l.longValue() >= 0 && this.e.compareAndSet(false, true)) {
            ir.a(l.longValue(), false, this, new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.G0();
                }
            });
        }
    }

    private void Q0() {
        Context context = B0;
        t tVarL = L();
        sj sjVarI0 = i0();
        f4 f4VarT = t();
        a(context);
        f0();
        h();
        l();
        X();
        N().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        if (TextUtils.isEmpty(this.f935a)) {
            t.h("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            t.h("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        if (this.f935a.length() != 86 && zp.c(this)) {
            t.h("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + this.f935a + ") : " + Log.getStackTraceString(new Throwable("")));
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(this.f935a)) {
            t.h("AppLovinSdk", "Cross Promo SDK has been deprecated and is no longer supported");
            if (zp.c(this)) {
                throw new RuntimeException("Cross Promo SDK has been deprecated and is no longer supported");
            }
            return;
        }
        if (zp.i()) {
            t.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!zp.b(this)) {
            t.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (zp.k(context)) {
            this.f.setVerboseLogging(true);
        }
        h0().a(oj.l, Boolean.valueOf(this.f.isVerboseLoggingEnabled()));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        qj qjVar = qj.c;
        if (TextUtils.isEmpty((String) sjVarI0.a(qjVar, (Object) null, defaultSharedPreferences))) {
            this.n0 = true;
            sjVarI0.b(qjVar, Boolean.toString(true), defaultSharedPreferences);
        } else {
            sjVarI0.b(qjVar, Boolean.toString(false), defaultSharedPreferences);
        }
        qj qjVar2 = qj.d;
        if (((Boolean) sjVarI0.a(qjVar2, Boolean.FALSE)).booleanValue()) {
            if (t.a()) {
                tVarL.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.o0 = true;
        } else {
            if (t.a()) {
                tVarL.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            sjVarI0.b(qjVar2, Boolean.TRUE);
            sjVarI0.b(qj.o, Boolean.valueOf(f4VarT.k()));
        }
        qj qjVar3 = qj.e;
        String str = (String) sjVarI0.a(qjVar3, null);
        if (!StringUtils.isValidString(str)) {
            sjVarI0.b(qjVar3, AppLovinSdk.VERSION);
            return;
        }
        if (AppLovinSdk.VERSION_CODE > zp.f(str)) {
            sjVarI0.b(qjVar3, AppLovinSdk.VERSION);
        }
    }

    private Map R() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(oj.s4)));
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        Q0();
        if (this.f.isExceptionHandlerEnabled() && ((Boolean) a(oj.y)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        int i = StringUtils.parseInt(this.f.getExtraParameters().get("initialization_delay_ms"), ((Integer) a(oj.r4)).intValue());
        sm smVarL0 = l0();
        kn knVar = new kn(this, true, "scheduleAdLoadIntegrationErrorAuto", new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.J0();
            }
        });
        sm.b bVar = sm.b.CORE;
        long j = i;
        smVarL0.a(knVar, bVar, j);
        l0().a(new kn(this, true, "scheduleSdkInit", new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.K0();
            }
        }), bVar, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        wf wfVarX = X();
        wfVarX.a(new d(wfVarX));
    }

    public static long j() {
        return C0;
    }

    public static Context k() {
        return B0;
    }

    public String A() {
        return this.r0;
    }

    public boolean A0() {
        boolean z;
        synchronized (this.i0) {
            z = this.l0;
        }
        return z;
    }

    public o B() {
        return this.q;
    }

    public EventServiceImpl C() {
        Object eventServiceImpl = this.l.get();
        if (eventServiceImpl == null) {
            synchronized (this.l) {
                eventServiceImpl = this.l.get();
                if (eventServiceImpl == null) {
                    eventServiceImpl = new EventServiceImpl(this);
                    this.l.set(eventServiceImpl);
                }
            }
        }
        if (eventServiceImpl == this.l) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    public AtomicBoolean C0() {
        return this.x0;
    }

    public p D() {
        Object pVar = this.G.get();
        if (pVar == null) {
            synchronized (this.G) {
                pVar = this.G.get();
                if (pVar == null) {
                    pVar = new p(this);
                    this.G.set(pVar);
                }
            }
        }
        if (pVar == this.G) {
            pVar = null;
        }
        return (p) pVar;
    }

    public boolean D0() {
        return StringUtils.containsIgnoreCase(Q(), AppLovinMediationProvider.MAX);
    }

    public q E() {
        Object qVar = this.I.get();
        if (qVar == null) {
            synchronized (this.I) {
                qVar = this.I.get();
                if (qVar == null) {
                    qVar = new q(this);
                    this.I.set(qVar);
                }
            }
        }
        if (qVar == this.I) {
            qVar = null;
        }
        return (q) qVar;
    }

    public boolean E0() {
        return zp.a("com.unity3d.player.UnityPlayerActivity");
    }

    public Activity H() {
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public AppLovinSdkInitializationConfiguration I() {
        return this.s0;
    }

    public long J() {
        return this.c;
    }

    public s K() {
        Object sVar = this.S.get();
        if (sVar == null) {
            synchronized (this.S) {
                sVar = this.S.get();
                if (sVar == null) {
                    sVar = new s(this);
                    this.S.set(sVar);
                }
            }
        }
        if (sVar == this.S) {
            sVar = null;
        }
        return (s) sVar;
    }

    public t L() {
        return this.p;
    }

    public com.applovin.impl.mediation.d M() {
        Object dVar = this.f0.get();
        if (dVar == null) {
            synchronized (this.f0) {
                dVar = this.f0.get();
                if (dVar == null) {
                    dVar = new com.applovin.impl.mediation.d(this);
                    this.f0.set(dVar);
                }
            }
        }
        if (dVar == this.f0) {
            dVar = null;
        }
        return (com.applovin.impl.mediation.d) dVar;
    }

    public void M0() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if ((t().j() && t().e() == g4.a.UNIFIED) || (sdkInitializationListener = this.v0) == null) {
            return;
        }
        if (y0()) {
            this.v0 = null;
            this.w0 = null;
            N().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.w0 == sdkInitializationListener) {
                return;
            }
            N().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(oj.v)).booleanValue()) {
                this.v0 = null;
            } else {
                this.w0 = sdkInitializationListener;
            }
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d(sdkInitializationListener);
            }
        }, Math.max(0L, ((Long) a(oj.w)).longValue()));
    }

    public com.applovin.impl.mediation.e N() {
        Object eVar = this.Z.get();
        if (eVar == null) {
            synchronized (this.Z) {
                eVar = this.Z.get();
                if (eVar == null) {
                    eVar = new com.applovin.impl.mediation.e(this);
                    this.Z.set(eVar);
                }
            }
        }
        if (eVar == this.Z) {
            eVar = null;
        }
        return (com.applovin.impl.mediation.e) eVar;
    }

    public com.applovin.impl.mediation.f O() {
        Object fVar = this.Y.get();
        if (fVar == null) {
            synchronized (this.Y) {
                fVar = this.Y.get();
                if (fVar == null) {
                    fVar = new com.applovin.impl.mediation.f(this);
                    this.Y.set(fVar);
                }
            }
        }
        if (fVar == this.Y) {
            fVar = null;
        }
        return (com.applovin.impl.mediation.f) fVar;
    }

    public void P0() {
        o().a();
    }

    public String Q() {
        String str = (String) a(qj.I);
        return StringUtils.isValidString(str) ? str : this.i;
    }

    public MediationServiceImpl S() {
        Object mediationServiceImpl = this.a0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.a0) {
                mediationServiceImpl = this.a0.get();
                if (mediationServiceImpl == null) {
                    mediationServiceImpl = new MediationServiceImpl(this);
                    this.a0.set(mediationServiceImpl);
                }
            }
        }
        if (mediationServiceImpl == this.a0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    public void S0() {
        synchronized (this.i0) {
            this.l0 = true;
            l0().f();
            d();
        }
    }

    public void U0() {
        t.h("AppLovinSdk", "Resetting SDK state...");
        ba baVarF = F();
        aa aaVar = aa.l;
        long jB = baVarF.b(aaVar);
        h0().a();
        h0().e();
        F().a();
        F().b(aaVar, jB + 1);
        if (this.j0.compareAndSet(true, false)) {
            S0();
        } else {
            this.j0.set(true);
        }
    }

    public u V() {
        Object uVar = this.e0.get();
        if (uVar == null) {
            synchronized (this.e0) {
                uVar = this.e0.get();
                if (uVar == null) {
                    uVar = new u(this);
                    this.e0.set(uVar);
                }
            }
        }
        if (uVar == this.e0) {
            uVar = null;
        }
        return (u) uVar;
    }

    public void V0() {
        if (StringUtils.isValidString(this.r0)) {
            return;
        }
        this.r0 = AppLovinMediationProvider.MAX;
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public AppLovinNativeAdService W() {
        Object appLovinNativeAdService = this.k.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.k) {
                appLovinNativeAdService = this.k.get();
                if (appLovinNativeAdService == null) {
                    appLovinNativeAdService = new AppLovinNativeAdService(this);
                    this.k.set(appLovinNativeAdService);
                }
            }
        }
        if (appLovinNativeAdService == this.k) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    public void W0() {
        v().n();
    }

    public void X0() {
        a((Map) null);
    }

    public com.applovin.impl.sdk.network.b Z() {
        Object bVar = this.W.get();
        if (bVar == null) {
            synchronized (this.W) {
                bVar = this.W.get();
                if (bVar == null) {
                    bVar = new com.applovin.impl.sdk.network.b(this);
                    this.W.set(bVar);
                }
            }
        }
        if (bVar == this.W) {
            bVar = null;
        }
        return (com.applovin.impl.sdk.network.b) bVar;
    }

    public PostbackServiceImpl a0() {
        Object postbackServiceImpl = this.V.get();
        if (postbackServiceImpl == null) {
            synchronized (this.V) {
                postbackServiceImpl = this.V.get();
                if (postbackServiceImpl == null) {
                    postbackServiceImpl = new PostbackServiceImpl(this);
                    this.V.set(postbackServiceImpl);
                }
            }
        }
        if (postbackServiceImpl == this.V) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    public w b0() {
        Object objN0 = this.A.get();
        if (objN0 == null) {
            synchronized (this.A) {
                objN0 = this.A.get();
                if (objN0 == null) {
                    objN0 = N0();
                    if (objN0 == null) {
                        objN0 = this.A;
                    }
                    this.A.set(objN0);
                }
            }
        }
        if (objN0 == this.A) {
            objN0 = null;
        }
        return (w) objN0;
    }

    public String c0() {
        return t0().a();
    }

    public String d0() {
        return this.f935a;
    }

    public SessionTracker f0() {
        Object sessionTracker = this.H.get();
        if (sessionTracker == null) {
            synchronized (this.H) {
                sessionTracker = this.H.get();
                if (sessionTracker == null) {
                    sessionTracker = new SessionTracker(this);
                    this.H.set(sessionTracker);
                }
            }
        }
        if (sessionTracker == this.H) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    public com.applovin.impl.sdk.c g() {
        Object cVar = this.E.get();
        if (cVar == null) {
            synchronized (this.E) {
                cVar = this.E.get();
                if (cVar == null) {
                    cVar = new com.applovin.impl.sdk.c(this);
                    this.E.set(cVar);
                }
            }
        }
        if (cVar == this.E) {
            cVar = null;
        }
        return (com.applovin.impl.sdk.c) cVar;
    }

    public AppLovinSdkSettings g0() {
        return this.f;
    }

    public AppLovinAdServiceImpl i() {
        Object appLovinAdServiceImpl = this.j.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.j) {
                appLovinAdServiceImpl = this.j.get();
                if (appLovinAdServiceImpl == null) {
                    appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                    this.j.set(appLovinAdServiceImpl);
                }
            }
        }
        if (appLovinAdServiceImpl == this.j) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    public AppLovinTargetingDataImpl j0() {
        return (AppLovinTargetingDataImpl) this.h;
    }

    public Map k0() {
        if (j0() == null) {
            return null;
        }
        return C0().get() ? j0().getAllData() : j0().getJsonData();
    }

    public ArrayService l() {
        Object arrayService = this.T.get();
        if (arrayService == null) {
            synchronized (this.T) {
                arrayService = this.T.get();
                if (arrayService == null) {
                    arrayService = new ArrayService(this);
                    this.T.set(arrayService);
                }
            }
        }
        if (arrayService == this.T) {
            arrayService = null;
        }
        return (ArrayService) arrayService;
    }

    public f m() {
        Object fVar = this.N.get();
        if (fVar == null) {
            synchronized (this.N) {
                fVar = this.N.get();
                if (fVar == null) {
                    fVar = new f(this);
                    this.N.set(fVar);
                }
            }
        }
        if (fVar == this.N) {
            fVar = null;
        }
        return (f) fVar;
    }

    public CmpServiceImpl n() {
        Object cmpServiceImpl = this.n.get();
        if (cmpServiceImpl == null) {
            synchronized (this.n) {
                cmpServiceImpl = this.n.get();
                if (cmpServiceImpl == null) {
                    cmpServiceImpl = new CmpServiceImpl(this);
                    this.n.set(cmpServiceImpl);
                }
            }
        }
        if (cmpServiceImpl == this.n) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    public h o() {
        Object hVar = this.L.get();
        if (hVar == null) {
            synchronized (this.L) {
                hVar = this.L.get();
                if (hVar == null) {
                    hVar = new h(this);
                    this.L.set(hVar);
                }
            }
        }
        if (hVar == this.L) {
            hVar = null;
        }
        return (h) hVar;
    }

    public long o0() {
        if (this.d == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.d;
    }

    public String p() {
        return t0().b();
    }

    public Activity p0() {
        Activity activityB = a(k()).b();
        return activityB != null ? activityB : H();
    }

    public AppLovinSdkConfiguration q() {
        return this.u0;
    }

    public String q0() {
        return t0().c();
    }

    public AppLovinUserSegment r0() {
        return this.g;
    }

    public j s() {
        Object jVar = this.C.get();
        if (jVar == null) {
            synchronized (this.C) {
                jVar = this.C.get();
                if (jVar == null) {
                    jVar = new j(this);
                    this.C.set(jVar);
                }
            }
        }
        if (jVar == this.C) {
            jVar = null;
        }
        return (j) jVar;
    }

    public UserServiceImpl s0() {
        Object userServiceImpl = this.m.get();
        if (userServiceImpl == null) {
            synchronized (this.m) {
                userServiceImpl = this.m.get();
                if (userServiceImpl == null) {
                    userServiceImpl = new UserServiceImpl(this);
                    this.m.set(userServiceImpl);
                }
            }
        }
        if (userServiceImpl == this.m) {
            userServiceImpl = null;
        }
        return (UserServiceImpl) userServiceImpl;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f935a + "', enabled=" + this.m0 + ", isFirstSession=" + this.n0 + AbstractJsonLexerKt.END_OBJ;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings u() {
        return g0().getBackingConsentFlowSettings();
    }

    public AppLovinSdk v0() {
        return this.o;
    }

    public boolean w0() {
        return this.o0;
    }

    public l x() {
        Object lVar = this.x.get();
        if (lVar == null) {
            synchronized (this.x) {
                lVar = this.x.get();
                if (lVar == null) {
                    lVar = new l(this);
                    this.x.set(lVar);
                }
            }
        }
        if (lVar == this.x) {
            lVar = null;
        }
        return (l) lVar;
    }

    public boolean x0() {
        Object obj;
        Object obj2 = this.z.get();
        Object obj3 = obj2;
        if (obj2 == null) {
            synchronized (this.z) {
                Object obj4 = this.z.get();
                obj = obj4;
                if (obj4 == null) {
                    Boolean bool = (Boolean) a(oj.F3);
                    bool.booleanValue();
                    this.z.set(bool);
                    obj = bool;
                }
            }
            obj3 = obj;
        }
        return ((Boolean) obj3).booleanValue();
    }

    public m y() {
        Object mVar = this.y.get();
        if (mVar == null) {
            synchronized (this.y) {
                mVar = this.y.get();
                if (mVar == null) {
                    mVar = x0() ? new m(this) : null;
                    if (mVar == null) {
                        mVar = this.y;
                    }
                    this.y.set(mVar);
                }
            }
        }
        return (m) (mVar != this.y ? mVar : null);
    }

    public boolean y0() {
        boolean z;
        synchronized (this.i0) {
            z = this.m0;
        }
        return z;
    }

    public n z() {
        Object nVar = this.w.get();
        if (nVar == null) {
            synchronized (this.w) {
                nVar = this.w.get();
                if (nVar == null) {
                    nVar = x0() ? new n(this) : null;
                    if (nVar == null) {
                        nVar = this.w;
                    }
                    this.w.set(nVar);
                }
            }
        }
        return (n) (nVar != this.w ? nVar : null);
    }

    public boolean z0() {
        return this.n0;
    }

    private void d() {
        sm smVarL0 = l0();
        int i = this.q0 + 1;
        this.q0 = i;
        smVarL0.a((xl) new im(i, this, new b()), sm.b.CORE);
    }

    public com.applovin.impl.q e() {
        return a(B0);
    }

    public com.applovin.impl.sdk.a f() {
        Object aVar = this.F.get();
        if (aVar == null) {
            synchronized (this.F) {
                aVar = this.F.get();
                if (aVar == null) {
                    aVar = new com.applovin.impl.sdk.a(this);
                    this.F.set(aVar);
                }
            }
        }
        if (aVar == this.F) {
            aVar = null;
        }
        return (com.applovin.impl.sdk.a) aVar;
    }

    public void g(final String str) {
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "Setting user id: " + str);
        }
        if (StringUtils.isValidString(str) && str.length() > zp.b(8)) {
            t.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + zp.b(8) + " maximum)");
        }
        if (zp.h()) {
            zp.a(new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(str);
                }
            });
        } else {
            t0().a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        L();
        if (t.a()) {
            L().a("AppLovinSdk", str);
        }
        l0().a(new rm(this));
    }

    public void e(String str) {
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "setMediationProvider(mediationProvider=" + str + ")");
        }
        if (str != null && (str.isEmpty() || str.length() > 64 || !StringUtils.isAlphaNumeric(str))) {
            t.h("AppLovinSdk", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return;
        }
        this.i = str;
        if (zp.h()) {
            zp.a(new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.L0();
                }
            });
        } else {
            c(qj.I);
        }
    }

    public void f(final String str) {
        t.g("AppLovinSdk", "Setting plugin version: " + str);
        if (zp.h()) {
            zp.a(new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(str);
                }
            });
        } else {
            h0().a(oj.U3, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.u0);
    }

    public sm l0() {
        Object smVar = this.r.get();
        if (smVar == null) {
            synchronized (this.r) {
                smVar = this.r.get();
                if (smVar == null) {
                    smVar = new sm(this);
                    this.r.set(smVar);
                }
            }
        }
        if (smVar == this.r) {
            smVar = null;
        }
        return (sm) smVar;
    }

    public pj h0() {
        Object pjVar = this.s.get();
        if (pjVar == null) {
            synchronized (this.s) {
                pjVar = this.s.get();
                if (pjVar == null) {
                    pjVar = new pj(this);
                    this.s.set(pjVar);
                }
            }
        }
        if (pjVar == this.s) {
            pjVar = null;
        }
        return (pj) pjVar;
    }

    public b4 r() {
        Object b4Var = this.t.get();
        if (b4Var == null) {
            synchronized (this.t) {
                b4Var = this.t.get();
                if (b4Var == null) {
                    b4Var = new b4(this);
                    this.t.set(b4Var);
                }
            }
        }
        if (b4Var == this.t) {
            b4Var = null;
        }
        return (b4) b4Var;
    }

    public ba F() {
        Object baVar = this.u.get();
        if (baVar == null) {
            synchronized (this.u) {
                baVar = this.u.get();
                if (baVar == null) {
                    baVar = new ba(this);
                    this.u.set(baVar);
                }
            }
        }
        if (baVar == this.u) {
            baVar = null;
        }
        return (ba) baVar;
    }

    public te T() {
        Object teVar = this.v.get();
        if (teVar == null) {
            synchronized (this.v) {
                teVar = this.v.get();
                if (teVar == null) {
                    teVar = new te(this);
                    this.v.set(teVar);
                }
            }
        }
        if (teVar == this.v) {
            teVar = null;
        }
        return (te) teVar;
    }

    public sj i0() {
        Object sjVar = this.B.get();
        if (sjVar == null) {
            synchronized (this.B) {
                sjVar = this.B.get();
                if (sjVar == null) {
                    sjVar = new sj(this);
                    this.B.set(sjVar);
                }
            }
        }
        if (sjVar == this.B) {
            sjVar = null;
        }
        return (sj) sjVar;
    }

    public xp t0() {
        Object xpVar = this.D.get();
        if (xpVar == null) {
            synchronized (this.D) {
                xpVar = this.D.get();
                if (xpVar == null) {
                    xpVar = new xp(this);
                    this.D.set(xpVar);
                }
            }
        }
        if (xpVar == this.D) {
            xpVar = null;
        }
        return (xp) xpVar;
    }

    public rr u0() {
        Object rrVar = this.J.get();
        if (rrVar == null) {
            synchronized (this.J) {
                rrVar = this.J.get();
                if (rrVar == null) {
                    rrVar = new rr(this);
                    this.J.set(rrVar);
                }
            }
        }
        if (rrVar == this.J) {
            rrVar = null;
        }
        return (rr) rrVar;
    }

    public wf X() {
        Object wfVar = this.K.get();
        if (wfVar == null) {
            synchronized (this.K) {
                wfVar = this.K.get();
                if (wfVar == null) {
                    wfVar = new wf(k());
                    this.K.set(wfVar);
                }
            }
        }
        if (wfVar == this.K) {
            wfVar = null;
        }
        return (wf) wfVar;
    }

    public kj e0() {
        Object kjVar = this.M.get();
        if (kjVar == null) {
            synchronized (this.M) {
                kjVar = this.M.get();
                if (kjVar == null) {
                    kjVar = new kj(this);
                    this.M.set(kjVar);
                }
            }
        }
        if (kjVar == this.M) {
            kjVar = null;
        }
        return (kj) kjVar;
    }

    public f4 t() {
        Object f4Var = this.O.get();
        if (f4Var == null) {
            synchronized (this.O) {
                f4Var = this.O.get();
                if (f4Var == null) {
                    f4Var = new f4(this);
                    this.O.set(f4Var);
                }
            }
        }
        if (f4Var == this.O) {
            f4Var = null;
        }
        return (f4) f4Var;
    }

    public rn m0() {
        Object rnVar = this.P.get();
        if (rnVar == null) {
            synchronized (this.P) {
                rnVar = this.P.get();
                if (rnVar == null) {
                    rnVar = new rn(this);
                    this.P.set(rnVar);
                }
            }
        }
        if (rnVar == this.P) {
            rnVar = null;
        }
        return (rn) rnVar;
    }

    public w4 v() {
        Object w4Var = this.Q.get();
        if (w4Var == null) {
            synchronized (this.Q) {
                w4Var = this.Q.get();
                if (w4Var == null) {
                    w4Var = new w4(this);
                    this.Q.set(w4Var);
                }
            }
        }
        if (w4Var == this.Q) {
            w4Var = null;
        }
        return (w4) w4Var;
    }

    public mg Y() {
        Object mgVar = this.R.get();
        if (mgVar == null) {
            synchronized (this.R) {
                mgVar = this.R.get();
                if (mgVar == null) {
                    mgVar = new mg(this);
                    this.R.set(mgVar);
                }
            }
        }
        if (mgVar == this.R) {
            mgVar = null;
        }
        return (mg) mgVar;
    }

    public b5 w() {
        Object b5Var = this.U.get();
        if (b5Var == null) {
            synchronized (this.U) {
                b5Var = this.U.get();
                if (b5Var == null) {
                    b5Var = new b5(this);
                    this.U.set(b5Var);
                }
            }
        }
        if (b5Var == this.U) {
            b5Var = null;
        }
        return (b5) b5Var;
    }

    public com.applovin.impl.v h() {
        Object vVar = this.X.get();
        if (vVar == null) {
            synchronized (this.X) {
                vVar = this.X.get();
                if (vVar == null) {
                    vVar = new com.applovin.impl.v(this);
                    this.X.set(vVar);
                }
            }
        }
        if (vVar == this.X) {
            vVar = null;
        }
        return (com.applovin.impl.v) vVar;
    }

    public yc G() {
        Object ycVar = this.b0.get();
        if (ycVar == null) {
            synchronized (this.b0) {
                ycVar = this.b0.get();
                if (ycVar == null) {
                    ycVar = new yc(this);
                    this.b0.set(ycVar);
                }
            }
        }
        if (ycVar == this.b0) {
            ycVar = null;
        }
        return (yc) ycVar;
    }

    public ue U() {
        Object ueVar = this.c0.get();
        if (ueVar == null) {
            synchronized (this.c0) {
                ueVar = this.c0.get();
                if (ueVar == null) {
                    ueVar = new ue();
                    this.c0.set(ueVar);
                }
            }
        }
        if (ueVar == this.c0) {
            ueVar = null;
        }
        return (ue) ueVar;
    }

    public pe P() {
        Object peVar = this.d0.get();
        if (peVar == null) {
            synchronized (this.d0) {
                peVar = this.d0.get();
                if (peVar == null) {
                    peVar = new pe(this);
                    this.d0.set(peVar);
                }
            }
        }
        if (peVar == this.d0) {
            peVar = null;
        }
        return (pe) peVar;
    }

    public xn n0() {
        Object xnVar = this.g0.get();
        if (xnVar == null) {
            synchronized (this.g0) {
                xnVar = this.g0.get();
                if (xnVar == null) {
                    xnVar = new xn(this);
                    this.g0.set(xnVar);
                }
            }
        }
        if (xnVar == this.g0) {
            xnVar = null;
        }
        return (xn) xnVar;
    }

    class b implements im.b {
        b() {
        }

        @Override // com.applovin.impl.im.b
        public void a(JSONObject jSONObject) {
            boolean z = jSONObject != null && jSONObject.length() > 0;
            k.this.c(jSONObject);
            e.b(k.this);
            c4.a(jSONObject, z, k.this);
            k.this.P().a(JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            k kVar = k.this;
            kVar.h0 = kVar.a(jSONObject);
            if (z) {
                List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", ""));
                k kVar2 = k.this;
                kVar2.u0 = new SdkConfigurationImpl(listExplode, kVar2);
            }
            k.this.n0().a(jSONObject);
            k.this.b(jSONObject);
            bc.b(((Boolean) k.this.a(oj.j6)).booleanValue());
            bc.a(((Boolean) k.this.a(oj.k6)).booleanValue());
            if (!k.this.D0()) {
                k.this.d("Initializing SDK in non-MAX environment...");
            } else if (k.this.t().e() == g4.a.UNIFIED) {
                Activity activityP0 = k.this.p0();
                if (k.this.k0.compareAndSet(false, true)) {
                    k.this.t().a();
                    k.this.t().b(activityP0, new a());
                } else {
                    k.this.d("Initializing SDK in MAX environment...");
                }
            } else {
                k.this.d("Initializing SDK in MAX environment...");
            }
            if (!((Boolean) k.this.a(oj.m3)).booleanValue() || z || !c4.a(k.k())) {
                k.this.O0();
                return;
            }
            k.this.L();
            if (t.a()) {
                k.this.L().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            k.this.T0();
        }

        class a implements f4.c {
            a() {
            }

            @Override // com.applovin.impl.f4.c
            public void a(f4.b bVar) {
                k.this.L();
                if (t.a()) {
                    k.this.L().a("AppLovinSdk", "Unified flow completed with status: " + bVar);
                }
                if (bVar.b()) {
                    k.this.L();
                    if (t.a()) {
                        k.this.L().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
                    }
                    k.this.S0();
                    k.this.P0();
                    return;
                }
                k.this.d("Initializing SDK in MAX environment...");
            }
        }
    }

    class d implements wf.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ wf f940a;

        @Override // com.applovin.impl.wf.a
        public void a() {
            k.this.L();
            if (t.a()) {
                k.this.L().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (k.this.i0) {
                if (!k.this.l0) {
                    k.this.S0();
                }
            }
            this.f940a.b(this);
        }

        @Override // com.applovin.impl.wf.a
        public void b() {
        }

        d(wf wfVar) {
            this.f940a = wfVar;
        }
    }

    public Object a(oj ojVar) {
        return h0().a(ojVar);
    }

    public List c(oj ojVar) {
        return h0().c(ojVar);
    }

    public List b(oj ojVar) {
        return h0().b(ojVar);
    }

    public Object a(qj qjVar) {
        return a(qjVar, (Object) null);
    }

    public void c(qj qjVar) {
        i0().b(qjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        this.d = System.currentTimeMillis();
        c4.c(jSONObject, this);
        c4.b(jSONObject, this);
        c4.a(jSONObject, this);
        le.f(jSONObject, this);
        le.d(jSONObject, this);
        le.e(jSONObject, this);
        le.a(jSONObject);
    }

    public void c() {
        synchronized (this.i0) {
            if (!this.l0 && !this.m0) {
                S0();
            }
        }
    }

    public Object b(qj qjVar) {
        return i0().a(qjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.u0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        t0().a(str);
    }

    public Object a(qj qjVar, Object obj) {
        return i0().a(qjVar, obj);
    }

    public void b(qj qjVar, Object obj) {
        i0().b(qjVar, obj);
    }

    public void b(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        i0().b(qjVar, obj, sharedPreferences);
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        B0 = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.u0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        Q0();
        this.f.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            t.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            h0().a(oj.U3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(oj.y)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        sm smVarL0 = l0();
        xl xlVar = this.y0;
        sm.b bVar = sm.b.CORE;
        smVarL0.a(xlVar, bVar);
        l0().a(this.z0, bVar);
    }

    public Object a(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        return i0().a(qjVar, obj, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            t.h("AppLovinSdk", (String) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r12.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        r15.r0 = (java.lang.String) r13.getValue();
        L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (com.applovin.impl.sdk.t.a() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        L().a("AppLovinSdk", "Detected mediation provider: " + r15.r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r6.booleanValue() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.b():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        h0().a(oj.U3, str);
    }

    public boolean a(oj ojVar, MaxAdFormat maxAdFormat) {
        return b(ojVar).contains(maxAdFormat);
    }

    public void a(ke keVar) {
        if (l0().d()) {
            return;
        }
        List listC = c(qe.G6);
        if (listC.size() <= 0 || !N().a().keySet().containsAll(listC)) {
            return;
        }
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "All required adapters initialized");
        }
        l0().e();
        M0();
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.o = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i) {
        return a(i, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextK = k();
        return a(contextK.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, contextK.getPackageName()), list);
    }

    public static String a(int i, List list) throws Resources.NotFoundException {
        String string = k().getResources().getString(i);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public static com.applovin.impl.q a(Context context) {
        if (E0 == null) {
            synchronized (F0) {
                if (E0 == null) {
                    E0 = new com.applovin.impl.q(context);
                }
            }
        }
        return E0;
    }

    public void a(final AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (this.x0.get()) {
            t.h("AppLovinSdk", "Invalid initialization process. Please initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or functions");
            B().a(o.b.INTEGRATION_ERROR, "legacy_init_already");
            if (zp.c(this)) {
                throw new IllegalStateException("Invalid initialization process. Please initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or functions");
            }
            return;
        }
        synchronized (this.t0) {
            if (this.s0 != null) {
                if (!y0() || sdkInitializationListener == null) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(sdkInitializationListener);
                    }
                });
                return;
            }
            this.s0 = appLovinSdkInitializationConfiguration;
            this.v0 = sdkInitializationListener;
            this.f935a = appLovinSdkInitializationConfiguration.getSdkKey();
            this.i = appLovinSdkInitializationConfiguration.getMediationProvider();
            this.h = appLovinSdkInitializationConfiguration.getTargetingData();
            this.g = appLovinSdkInitializationConfiguration.getUserSegment();
            zp.a(new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(appLovinSdkInitializationConfiguration);
                }
            });
        }
    }

    public void a(String str, AppLovinSdkSettings appLovinSdkSettings) {
        C0().set(true);
        this.f935a = str;
        this.f = appLovinSdkSettings;
        this.g = new AppLovinUserSegment();
        this.h = new AppLovinTargetingDataImpl();
        zp.a(new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.R0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    public void a(boolean z) {
        synchronized (this.i0) {
            this.l0 = false;
            this.m0 = z;
        }
        if (z) {
            List listC = c(qe.G6);
            if (listC.isEmpty()) {
                l0().e();
                M0();
                return;
            }
            Long l = (Long) a(qe.H6);
            kn knVar = new kn(this, true, "timeoutInitAdapters", new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.F0();
                }
            });
            L();
            if (t.a()) {
                L().a("AppLovinSdk", "Waiting for required adapters to init: " + listC + " - timing out in " + l + "ms...");
            }
            l0().a(knVar, sm.b.TIMEOUT, l.longValue(), true);
        }
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.h0;
        return (list == null || list.size() <= 0 || this.h0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) i0().a(qj.e, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < zp.f(str)) {
                t.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public void a(Map map) {
        P().a(map);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        i0().a(str, obj, editor);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return sj.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        i0().a(sharedPreferences);
    }

    public void a(long j) {
        s().b(j);
    }

    public void a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!y0()) {
            this.v0 = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.k$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(sdkInitializationListener);
                }
            });
        }
    }
}
