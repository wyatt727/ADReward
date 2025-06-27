package com.json;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.json.f7;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.sdk.controller.FeaturesManager;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.sdk.utils.Logger;
import com.json.sdk.utils.SDKUtils;
import com.json.t2;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class s8 implements jc, j3, i3, g3, h3, y8, cb {
    private static final String m = "IronSourceAdsPublisherAgent";
    private static s8 n;
    private com.json.sdk.controller.e b;
    private bb c;
    private String d;
    private String e;
    private long f;
    private u3 g;
    private wd h;
    private pa i;
    private v2 k;

    /* renamed from: a, reason: collision with root package name */
    private final String f2115a = IronSourceConstants.SUPERSONIC_CONFIG_NAME;
    private boolean j = false;
    private FeaturesManager l = FeaturesManager.getInstance();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f2116a;

        a(JSONObject jSONObject) {
            this.f2116a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(this.f2116a, (i3) s8.this);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f2117a;

        b(JSONObject jSONObject) {
            this.f2117a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(this.f2117a);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q8 f2118a;
        final /* synthetic */ Map b;

        c(q8 q8Var, Map map) {
            this.f2118a = q8Var;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            f7.e eVar = this.f2118a.g() ? f7.e.Banner : f7.e.Interstitial;
            t3 t3VarA = s8.this.g.a(eVar, this.f2118a);
            h7 h7Var = new h7();
            h7Var.a(m4.w, Boolean.valueOf(this.f2118a.h())).a(m4.F, Boolean.valueOf(this.f2118a.k())).a(m4.u, this.f2118a.e()).a(m4.v, z8.a(this.f2118a)).a(m4.H, Long.valueOf(com.json.n.f2025a.b(this.f2118a.d())));
            m7.a(hc.h, h7Var.a());
            if (eVar == f7.e.Banner) {
                s8.this.b.a(s8.this.d, s8.this.e, t3VarA, (h3) s8.this);
                s8.this.b.a(t3VarA, this.b, (h3) s8.this);
            } else {
                s8.this.b.a(s8.this.d, s8.this.e, t3VarA, (i3) s8.this);
                s8.this.b.b(t3VarA, this.b, s8.this);
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t3 f2119a;
        final /* synthetic */ Map b;

        d(t3 t3Var, Map map) {
            this.f2119a = t3Var;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(this.f2119a, this.b, (i3) s8.this);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q8 f2120a;

        e(q8 q8Var) {
            this.f2120a = q8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            f7.e eVar = this.f2120a.g() ? f7.e.Banner : f7.e.Interstitial;
            t3 t3VarA = s8.this.g.a(eVar, this.f2120a);
            h7 h7Var = new h7();
            h7Var.a(m4.w, Boolean.valueOf(this.f2120a.h())).a(m4.u, this.f2120a.e()).a(m4.v, z8.a(this.f2120a)).a("isMultipleAdObjects", Boolean.valueOf(this.f2120a.j()));
            m7.a(hc.m, h7Var.a());
            if (eVar == f7.e.Banner) {
                s8.this.b.a(t3VarA);
            } else {
                t3VarA.a(false);
                s8.this.b.b(t3VarA);
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2121a;
        final /* synthetic */ String b;
        final /* synthetic */ t3 c;

        f(String str, String str2, t3 t3Var) {
            this.f2121a = str;
            this.b = str2;
            this.c = t3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(this.f2121a, this.b, this.c, (j3) s8.this);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f2122a;

        g(JSONObject jSONObject) {
            this.f2122a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(this.f2122a, (j3) s8.this);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2123a;
        final /* synthetic */ String b;
        final /* synthetic */ Map c;
        final /* synthetic */ bb d;

        h(String str, String str2, Map map, bb bbVar) {
            this.f2123a = str;
            this.b = str2;
            this.c = map;
            this.d = bbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(this.f2123a, this.b, this.c, this.d);
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f2124a;
        final /* synthetic */ bb b;

        i(Map map, bb bbVar) {
            this.f2124a = map;
            this.b = bbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(s8.this.d, s8.this.e, this.f2124a, this.b);
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f2125a;

        j(Map map) {
            this.f2125a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(this.f2125a, s8.this.c);
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2126a;
        final /* synthetic */ String b;
        final /* synthetic */ bb c;

        k(String str, String str2, bb bbVar) {
            this.f2126a = str;
            this.b = str2;
            this.c = bbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(this.f2126a, this.b, this.c);
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bb f2127a;

        l(bb bbVar) {
            this.f2127a = bbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(s8.this.d, s8.this.e, this.f2127a);
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2128a;
        final /* synthetic */ String b;
        final /* synthetic */ t3 c;

        m(String str, String str2, t3 t3Var) {
            this.f2128a = str;
            this.b = str2;
            this.c = t3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(this.f2128a, this.b, this.c, (i3) s8.this);
        }
    }

    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2129a;

        n(String str) {
            this.f2129a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            s8.this.b.a(this.f2129a, s8.this);
        }
    }

    private s8(Context context, int i2) {
        c(context);
    }

    s8(String str, String str2, Context context) {
        this.d = str;
        this.e = str2;
        c(context);
    }

    public static synchronized s8 a(Context context, int i2) throws Exception {
        Logger.i(m, "getInstance()");
        if (n == null) {
            n = new s8(context, i2);
        }
        return n;
    }

    private wd a(Context context) {
        wd wdVarD = wd.d();
        wdVarD.c();
        wdVarD.a(context, this.d, this.e);
        return wdVarD;
    }

    private xa a(t3 t3Var) {
        if (t3Var == null) {
            return null;
        }
        return (xa) t3Var.i();
    }

    public static y8 a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    public static synchronized y8 a(String str, String str2, Context context) {
        if (n == null) {
            m7.a(hc.f1801a);
            n = new s8(str, str2, context);
        } else {
            wd.d().a(str);
            wd.d().b(str2);
        }
        return n;
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    public static synchronized s8 b(Context context) throws Exception {
        return a(context, 0);
    }

    private ya b(t3 t3Var) {
        if (t3Var == null) {
            return null;
        }
        return (ya) t3Var.i();
    }

    private void b(q8 q8Var, Map<String, String> map) {
        Logger.d(m, "loadOnNewInstance " + q8Var.d());
        this.b.a(new c(q8Var, map));
    }

    private eb c(t3 t3Var) {
        if (t3Var == null) {
            return null;
        }
        return (eb) t3Var.i();
    }

    private void c(Context context) {
        try {
            JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
            e9.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new wc(SDKUtils.getNetworkConfiguration().optJSONObject(t2.a.j)));
            e9.e().d(SDKUtils.getSDKVersion());
            this.h = a(context);
            this.g = new u3();
            v2 v2Var = new v2();
            this.k = v2Var;
            if (context instanceof Activity) {
                v2Var.a((Activity) context);
            }
            int debugMode = this.l.getDebugMode();
            this.i = new pa();
            this.b = new com.json.sdk.controller.e(context, this.k, this.h, this.g, o6.f2043a, debugMode, this.l.getDataManagerConfig(), this.d, this.e, this.i);
            Logger.enableLogging(debugMode);
            Logger.i(m, "C'tor");
            a(context, networkConfiguration);
            this.i.d();
            this.i.e();
            this.i.a(context);
            this.i.b();
            this.i.a();
            this.i.b(context);
            this.i.c();
            this.f = 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void c(q8 q8Var, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e2) {
            h7 h7VarA = new h7().a(m4.z, e2.getMessage()).a(m4.w, Boolean.valueOf(q8Var.h())).a(m4.F, Boolean.valueOf(q8Var.k())).a(m4.u, q8Var.e()).a(m4.v, z8.a(q8Var)).a(m4.H, Long.valueOf(com.json.n.f2025a.b(q8Var.d())));
            com.json.n.f2025a.a(q8Var.d());
            m7.a(hc.k, h7VarA.a());
            e2.printStackTrace();
            Logger.d(m, "loadInAppBiddingAd failed decoding  ADM " + e2.getMessage());
        }
        b(q8Var, map);
    }

    private t3 d(f7.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.g.a(eVar, str);
    }

    private void e(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has(t2.i.Z)) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("consent", Boolean.parseBoolean(jSONObject.getString(t2.i.Z)));
            this.h.a(jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.json.y8
    public com.json.sdk.controller.e a() {
        return this.b;
    }

    @Override // com.json.jc, com.json.y8
    public void a(Activity activity) {
        try {
            Logger.i(m, "release()");
            x3.g();
            this.k.b();
            this.b.a((Context) activity);
            this.b.destroy();
            this.b = null;
        } catch (Exception unused) {
        }
        n = null;
    }

    @Override // com.json.a9
    public void a(Activity activity, q8 q8Var, Map<String, String> map) {
        this.k.a(activity);
        Logger.i(m, "showAd " + q8Var.d());
        t3 t3VarA = this.g.a(f7.e.Interstitial, q8Var.d());
        if (t3VarA == null) {
            return;
        }
        if (q8Var.m()) {
            t3VarA.a(q8Var.b());
        }
        this.b.a(new d(t3VarA, map));
    }

    @Override // com.json.jc, com.json.a9
    public void a(Activity activity, Map<String, String> map) {
        if (activity != null) {
            this.k.a(activity);
        }
        this.b.a(new j(map));
    }

    public void a(Context context, JSONObject jSONObject) {
        boolean zOptBoolean = jSONObject.optBoolean(t2.a.f, false);
        this.j = zOptBoolean;
        if (zOptBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new com.json.i(this));
            } catch (Throwable th) {
                h7 h7Var = new h7();
                h7Var.a(m4.x, th.getMessage());
                m7.a(hc.u, h7Var.a());
            }
        }
    }

    @Override // com.json.a9
    public void a(bb bbVar) {
        this.b.a(new l(bbVar));
    }

    @Override // com.json.g3
    public void a(f7.e eVar, String str) {
        ya yaVarB;
        t3 t3VarD = d(eVar, str);
        if (t3VarD != null) {
            if (eVar == f7.e.RewardedVideo) {
                eb ebVarC = c(t3VarD);
                if (ebVarC != null) {
                    ebVarC.c();
                    return;
                }
                return;
            }
            if (eVar != f7.e.Interstitial || (yaVarB = b(t3VarD)) == null) {
                return;
            }
            yaVarB.onInterstitialClose();
        }
    }

    @Override // com.json.g3
    public void a(f7.e eVar, String str, j0 j0Var) {
        xa xaVarA;
        t3 t3VarD = d(eVar, str);
        if (t3VarD != null) {
            t3VarD.b(2);
            if (eVar == f7.e.RewardedVideo) {
                eb ebVarC = c(t3VarD);
                if (ebVarC != null) {
                    ebVarC.a(j0Var);
                    return;
                }
                return;
            }
            if (eVar == f7.e.Interstitial) {
                ya yaVarB = b(t3VarD);
                if (yaVarB != null) {
                    yaVarB.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != f7.e.Banner || (xaVarA = a(t3VarD)) == null) {
                return;
            }
            xaVarA.onBannerInitSuccess();
        }
    }

    @Override // com.json.g3
    public void a(f7.e eVar, String str, String str2) {
        xa xaVarA;
        t3 t3VarD = d(eVar, str);
        h7 h7VarA = new h7().a(m4.u, str).a(m4.v, eVar).a(m4.z, str2);
        if (t3VarD != null) {
            com.json.n nVar = com.json.n.f2025a;
            h7VarA.a(m4.H, Long.valueOf(nVar.b(t3VarD.h())));
            h7VarA.a(m4.w, Boolean.valueOf(n7.a(t3VarD)));
            nVar.a(t3VarD.h());
            t3VarD.b(3);
            if (eVar == f7.e.RewardedVideo) {
                eb ebVarC = c(t3VarD);
                if (ebVarC != null) {
                    ebVarC.b(str2);
                }
            } else if (eVar == f7.e.Interstitial) {
                ya yaVarB = b(t3VarD);
                if (yaVarB != null) {
                    yaVarB.onInterstitialInitFailed(str2);
                }
            } else if (eVar == f7.e.Banner && (xaVarA = a(t3VarD)) != null) {
                xaVarA.onBannerLoadFail(str2);
            }
        }
        m7.a(hc.i, h7VarA.a());
    }

    @Override // com.json.g3
    public void a(f7.e eVar, String str, String str2, JSONObject jSONObject) throws JSONException {
        xa xaVarA;
        t3 t3VarD = d(eVar, str);
        if (t3VarD == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(m, "Received Event Notification: " + str2 + " for demand source: " + t3VarD.f());
            if (eVar == f7.e.Interstitial) {
                ya yaVarB = b(t3VarD);
                if (yaVarB != null) {
                    jSONObject.put("demandSourceName", str);
                    yaVarB.onInterstitialEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar == f7.e.RewardedVideo) {
                eb ebVarC = c(t3VarD);
                if (ebVarC != null) {
                    jSONObject.put("demandSourceName", str);
                    ebVarC.a(str2, jSONObject);
                }
            } else if (eVar == f7.e.Banner && (xaVarA = a(t3VarD)) != null) {
                jSONObject.put("demandSourceName", str);
                if (str2.equalsIgnoreCase(t2.h.z)) {
                    xaVarA.onBannerShowSuccess();
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.json.a9
    public void a(q8 q8Var, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put(t2.h.y0, String.valueOf(jCurrentTimeMillis));
        com.json.n.f2025a.a(q8Var.d(), jCurrentTimeMillis);
        h7 h7Var = new h7();
        h7Var.a(m4.w, Boolean.valueOf(q8Var.h())).a(m4.F, Boolean.valueOf(q8Var.k())).a(m4.u, q8Var.e()).a(m4.v, z8.a(q8Var)).a(m4.H, Long.valueOf(jCurrentTimeMillis));
        m7.a(hc.f, h7Var.a());
        Logger.d(m, "loadAd " + q8Var.d());
        if (q8Var.i()) {
            c(q8Var, map);
        } else {
            b(q8Var, map);
        }
    }

    @Override // com.json.j3
    public void a(String str, int i2) {
        eb ebVarC;
        t3 t3VarD = d(f7.e.RewardedVideo, str);
        if (t3VarD == null || (ebVarC = c(t3VarD)) == null) {
            return;
        }
        ebVarC.a(i2);
    }

    @Override // com.json.h3
    public void a(String str, y6 y6Var) {
        xa xaVarA;
        t3 t3VarD = d(f7.e.Banner, str);
        if (t3VarD == null || (xaVarA = a(t3VarD)) == null) {
            return;
        }
        xaVarA.onBannerLoadSuccess(t3VarD.c(), y6Var);
    }

    @Override // com.json.h3
    public void a(String str, String str2) {
        xa xaVarA;
        t3 t3VarD = d(f7.e.Banner, str);
        if (t3VarD == null || (xaVarA = a(t3VarD)) == null) {
            return;
        }
        xaVarA.onBannerLoadFail(str2);
    }

    @Override // com.json.jc
    public void a(String str, String str2, int i2) {
        f7.e productType;
        t3 t3VarA;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (t3VarA = this.g.a(productType, str2)) == null) {
            return;
        }
        t3VarA.c(i2);
    }

    @Override // com.json.jc
    public void a(String str, String str2, bb bbVar) {
        this.d = str;
        this.e = str2;
        this.b.a(new k(str, str2, bbVar));
    }

    @Override // com.json.jc
    public void a(String str, String str2, String str3, Map<String, String> map, eb ebVar) {
        this.d = str;
        this.e = str2;
        this.b.a(new f(str, str2, this.g.a(f7.e.RewardedVideo, str3, map, ebVar)));
    }

    @Override // com.json.jc
    public void a(String str, String str2, String str3, Map<String, String> map, ya yaVar) {
        this.d = str;
        this.e = str2;
        this.b.a(new m(str, str2, this.g.a(f7.e.Interstitial, str3, map, yaVar)));
    }

    @Override // com.json.jc
    public void a(String str, String str2, Map<String, String> map, bb bbVar) {
        this.d = str;
        this.e = str2;
        this.c = bbVar;
        this.b.a(new h(str, str2, map, bbVar));
    }

    @Override // com.json.a9
    public void a(Map<String, String> map, bb bbVar) {
        this.c = bbVar;
        this.b.a(new i(map, bbVar));
    }

    @Override // com.json.jc, com.json.y8
    public void a(JSONObject jSONObject) throws JSONException {
        e(jSONObject);
        this.b.a(new b(jSONObject));
    }

    @Override // com.json.a9
    public boolean a(q8 q8Var) {
        Logger.d(m, "isAdAvailable " + q8Var.d());
        t3 t3VarA = this.g.a(f7.e.Interstitial, q8Var.d());
        if (t3VarA == null) {
            return false;
        }
        return t3VarA.d();
    }

    @Override // com.json.jc
    public boolean a(String str) {
        return this.b.a(str);
    }

    @Override // com.json.cb
    public void b(Activity activity) {
        try {
            this.b.d();
            this.b.a((Context) activity);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.json.a9
    public void b(Activity activity, q8 q8Var, Map<String, String> map) {
        this.k.a(activity);
        a(q8Var, map);
    }

    @Override // com.json.g3
    public void b(f7.e eVar, String str) {
        eb ebVarC;
        t3 t3VarD = d(eVar, str);
        if (t3VarD != null) {
            if (eVar == f7.e.Interstitial) {
                ya yaVarB = b(t3VarD);
                if (yaVarB != null) {
                    yaVarB.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != f7.e.RewardedVideo || (ebVarC = c(t3VarD)) == null) {
                return;
            }
            ebVarC.a();
        }
    }

    @Override // com.json.a9
    public void b(q8 q8Var) {
        Logger.d(m, "destroyInstance " + q8Var.d());
        this.b.a(new e(q8Var));
    }

    @Override // com.json.i3
    public void b(String str) {
        f7.e eVar = f7.e.Interstitial;
        t3 t3VarD = d(eVar, str);
        h7 h7VarA = new h7().a(m4.u, str);
        if (t3VarD != null) {
            h7 h7VarA2 = h7VarA.a(m4.v, n7.a(t3VarD, eVar)).a(m4.w, Boolean.valueOf(n7.a(t3VarD)));
            com.json.n nVar = com.json.n.f2025a;
            h7VarA2.a(m4.H, Long.valueOf(nVar.b(t3VarD.h())));
            nVar.a(t3VarD.h());
            ya yaVarB = b(t3VarD);
            if (yaVarB != null) {
                yaVarB.onInterstitialLoadSuccess();
            }
        }
        m7.a(hc.l, h7VarA.a());
    }

    @Override // com.json.i3
    public void b(String str, String str2) {
        ya yaVarB;
        t3 t3VarD = d(f7.e.Interstitial, str);
        if (t3VarD == null || (yaVarB = b(t3VarD)) == null) {
            return;
        }
        yaVarB.onInterstitialShowFailed(str2);
    }

    @Override // com.json.jc
    public void b(JSONObject jSONObject) {
        this.b.a(new g(jSONObject));
    }

    @Override // com.json.cb
    public void c(Activity activity) {
        this.k.a(activity);
        this.b.f();
        this.b.b(activity);
    }

    @Override // com.json.g3
    public void c(f7.e eVar, String str) {
        xa xaVarA;
        t3 t3VarD = d(eVar, str);
        if (t3VarD != null) {
            if (eVar == f7.e.RewardedVideo) {
                eb ebVarC = c(t3VarD);
                if (ebVarC != null) {
                    ebVarC.d();
                    return;
                }
                return;
            }
            if (eVar == f7.e.Interstitial) {
                ya yaVarB = b(t3VarD);
                if (yaVarB != null) {
                    yaVarB.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != f7.e.Banner || (xaVarA = a(t3VarD)) == null) {
                return;
            }
            xaVarA.onBannerClick();
        }
    }

    @Override // com.json.i3
    public void c(String str) {
        ya yaVarB;
        t3 t3VarD = d(f7.e.Interstitial, str);
        if (t3VarD == null || (yaVarB = b(t3VarD)) == null) {
            return;
        }
        yaVarB.onInterstitialShowSuccess();
    }

    @Override // com.json.i3
    public void c(String str, String str2) {
        f7.e eVar = f7.e.Interstitial;
        t3 t3VarD = d(eVar, str);
        h7 h7Var = new h7();
        h7Var.a(m4.z, str2).a(m4.u, str);
        if (t3VarD != null) {
            h7 h7VarA = h7Var.a(m4.v, n7.a(t3VarD, eVar)).a(m4.x, t3VarD.e() == 2 ? m4.D : m4.E).a(m4.w, Boolean.valueOf(n7.a(t3VarD)));
            com.json.n nVar = com.json.n.f2025a;
            h7VarA.a(m4.H, Long.valueOf(nVar.b(t3VarD.h())));
            nVar.a(t3VarD.h());
            ya yaVarB = b(t3VarD);
            if (yaVarB != null) {
                yaVarB.onInterstitialLoadFailed(str2);
            }
        }
        m7.a(hc.g, h7Var.a());
    }

    @Override // com.json.jc
    public void c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.b.a(new n(strOptString));
    }

    @Override // com.json.j3
    public void d(String str) {
        eb ebVarC;
        t3 t3VarD = d(f7.e.RewardedVideo, str);
        if (t3VarD == null || (ebVarC = c(t3VarD)) == null) {
            return;
        }
        ebVarC.b();
    }

    @Override // com.json.j3
    public void d(String str, String str2) {
        eb ebVarC;
        t3 t3VarD = d(f7.e.RewardedVideo, str);
        if (t3VarD == null || (ebVarC = c(t3VarD)) == null) {
            return;
        }
        ebVarC.a(str2);
    }

    @Override // com.json.jc
    public void d(JSONObject jSONObject) {
        this.b.a(new a(jSONObject));
    }

    @Override // com.json.i3
    public void onInterstitialAdRewarded(String str, int i2) {
        t3 t3VarD = d(f7.e.Interstitial, str);
        ya yaVarB = b(t3VarD);
        if (t3VarD == null || yaVarB == null) {
            return;
        }
        yaVarB.onInterstitialAdRewarded(str, i2);
    }

    @Override // com.json.jc, com.json.y8
    public void onPause(Activity activity) {
        if (this.j) {
            return;
        }
        b(activity);
    }

    @Override // com.json.jc, com.json.y8
    public void onResume(Activity activity) {
        if (this.j) {
            return;
        }
        c(activity);
    }
}
