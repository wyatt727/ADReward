package com.json.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.json.ApplicationGeneralSettings;
import com.json.ac;
import com.json.ad;
import com.json.b6;
import com.json.b9;
import com.json.ca;
import com.json.cc;
import com.json.dc;
import com.json.ed;
import com.json.environment.ContextProvider;
import com.json.fa;
import com.json.g4;
import com.json.g5;
import com.json.h4;
import com.json.ja;
import com.json.k2;
import com.json.k8;
import com.json.l2;
import com.json.l4;
import com.json.l6;
import com.json.la;
import com.json.lb;
import com.json.m1;
import com.json.m6;
import com.json.m9;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adquality.AdQualityBridge;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.config.ConfigFile;
import com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.json.mediationsdk.demandOnly.f;
import com.json.mediationsdk.demandOnly.h;
import com.json.mediationsdk.demandOnly.k;
import com.json.mediationsdk.events.ISErrorListener;
import com.json.mediationsdk.impressionData.ImpressionDataListener;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.logger.LogListener;
import com.json.mediationsdk.metadata.MetaData;
import com.json.mediationsdk.metadata.MetaDataUtils;
import com.json.mediationsdk.model.InterstitialPlacement;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.model.Placement;
import com.json.mediationsdk.s;
import com.json.mediationsdk.sdk.InitializationListener;
import com.json.mediationsdk.sdk.InterstitialListener;
import com.json.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.json.mediationsdk.sdk.OfferwallListener;
import com.json.mediationsdk.sdk.RewardedVideoListener;
import com.json.mediationsdk.sdk.RewardedVideoManualListener;
import com.json.mediationsdk.sdk.SegmentListener;
import com.json.mediationsdk.server.HttpFunctions;
import com.json.mediationsdk.server.ServerURL;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceAES;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.mediationsdk.utils.b;
import com.json.mediationsdk.utils.c;
import com.json.n8;
import com.json.o3;
import com.json.o8;
import com.json.p1;
import com.json.p3;
import com.json.r0;
import com.json.r1;
import com.json.r2;
import com.json.s6;
import com.json.t;
import com.json.v3;
import com.json.v6;
import com.json.va;
import com.json.vd;
import com.json.w4;
import com.json.w8;
import com.json.w9;
import com.json.wb;
import com.json.x8;
import com.json.xc;
import com.json.za;
import com.json.zc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class p implements w8, za, o3, o3.b, o3.c, o3.a {
    private static boolean r0 = false;
    private boolean A;
    private IronSourceSegment B;
    private final String C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private Boolean L;
    private IronSourceBannerLayout M;
    private String N;
    private Boolean O;
    private l6 P;
    private y Q;
    private w R;
    private k8 S;
    private ac T;
    private m1 U;
    private InitializationListener V;
    private AtomicBoolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a, reason: collision with root package name */
    private final String f1977a;
    private boolean a0;
    private final String b;
    private boolean b0;
    private final b6 c;
    private boolean c0;
    private final b6.a d;
    private int d0;
    private AbstractAdapter e;
    private final ConcurrentHashMap<String, h.d> e0;
    private v f;
    private final ConcurrentHashMap<String, h.b> f0;
    private IronSourceLoggerManager g;
    private final ConcurrentHashMap<String, h.d> g0;
    private w9 h;
    private f h0;
    private com.json.mediationsdk.logger.b i;
    private k i0;
    private AtomicBoolean j;
    private com.json.mediationsdk.demandOnly.c j0;
    private final Object k;
    private w4 k0;
    private com.json.mediationsdk.utils.c l;
    private x8 l0;
    private String m;
    private boolean m0;
    private String n;
    private AdQualityBridge n0;
    private String o;
    ISErrorListener o0;
    private String p;
    s6<ISDemandOnlyInterstitialListener> p0;
    private Map<String, String> q;
    s6<ISDemandOnlyRewardedVideoListener> q0;
    private String r;
    private AtomicBoolean s;
    private boolean t;
    private List<IronSource.AD_UNIT> u;
    private String v;
    private Context w;
    private Boolean x;
    private Set<IronSource.AD_UNIT> y;
    private Set<IronSource.AD_UNIT> z;

    class a implements ISErrorListener {
        a() {
        }

        @Override // com.json.mediationsdk.events.ISErrorListener
        public void onError(Throwable th) {
            IronLog.INTERNAL.error(th.getMessage());
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1979a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[b.EnumC0239b.values().length];
            c = iArr;
            try {
                iArr[b.EnumC0239b.CAPPED_PER_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[b.EnumC0239b.CAPPED_PER_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[b.EnumC0239b.CAPPED_PER_PACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[b.EnumC0239b.NOT_CAPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[s.d.values().length];
            b = iArr2;
            try {
                iArr2[s.d.INIT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[s.d.INIT_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[IronSource.AD_UNIT.values().length];
            f1979a = iArr3;
            try {
                iArr3[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1979a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1979a[IronSource.AD_UNIT.OFFERWALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1979a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1979a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public interface c {
        void a(String str);
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        static volatile p f1980a = new p(null);

        private d() {
        }
    }

    private p() {
        this.f1977a = getClass().getName();
        this.b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b7.9.0";
        this.k = new Object();
        this.l = null;
        this.m = null;
        this.n = "";
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.t = false;
        this.x = null;
        this.A = true;
        this.C = "sessionDepth";
        this.O = null;
        this.m0 = false;
        this.c = ca.h().c();
        this.d = ca.g().a();
        x();
        this.j = new AtomicBoolean();
        this.y = new HashSet();
        this.z = new HashSet();
        this.F = false;
        this.E = false;
        this.G = false;
        this.s = new AtomicBoolean(true);
        this.W = new AtomicBoolean(false);
        this.D = 0;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.v = IronSourceUtils.getSessionId();
        this.L = Boolean.FALSE;
        this.b0 = false;
        this.N = null;
        this.P = null;
        this.Q = null;
        this.V = null;
        this.R = null;
        this.X = false;
        this.e0 = new ConcurrentHashMap<>();
        this.g0 = new ConcurrentHashMap<>();
        this.f0 = new ConcurrentHashMap<>();
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.d0 = 1;
        this.k0 = new w4();
        this.l0 = new x8();
        this.o0 = new a();
        this.n0 = null;
        this.p0 = new s6.a();
        this.q0 = new s6.b();
    }

    /* synthetic */ p(a aVar) {
        this();
    }

    private boolean A() {
        return z() && B();
    }

    private boolean B() {
        com.json.mediationsdk.utils.c cVar = this.l;
        return (cVar == null || cVar.h() == null || this.l.h().a() == null || this.l.h().a().size() <= 0) ? false : true;
    }

    private boolean D() {
        com.json.mediationsdk.utils.c cVar = this.l;
        return (cVar == null || cVar.b() == null || this.l.b().getInterstitialConfigurations() == null) ? false : true;
    }

    private boolean E() {
        return D() && G();
    }

    private boolean G() {
        com.json.mediationsdk.utils.c cVar = this.l;
        return (cVar == null || cVar.h() == null || this.l.h().b() == null || this.l.h().b().size() <= 0) ? false : true;
    }

    private boolean I() {
        com.json.mediationsdk.utils.c cVar = this.l;
        return (cVar == null || cVar.b() == null || this.l.b().getNativeAdConfigurations() == null) ? false : true;
    }

    private boolean J() {
        return I() && K();
    }

    private boolean K() {
        com.json.mediationsdk.utils.c cVar = this.l;
        return (cVar == null || cVar.h() == null || this.l.h().c() == null || this.l.h().c().isEmpty()) ? false : true;
    }

    private boolean L() {
        com.json.mediationsdk.utils.c cVar = this.l;
        return (cVar == null || cVar.b() == null || this.l.b().getOfferwallConfigurations() == null) ? false : true;
    }

    private boolean N() {
        com.json.mediationsdk.utils.c cVar = this.l;
        return (cVar == null || cVar.b() == null || this.l.b().getRewardedVideoConfigurations() == null) ? false : true;
    }

    private boolean O() {
        return N() && P();
    }

    private boolean P() {
        com.json.mediationsdk.utils.c cVar = this.l;
        return (cVar == null || cVar.h() == null || this.l.h().d() == null || this.l.h().d().size() <= 0) ? false : true;
    }

    private void V() {
        if (this.V == null || !this.W.compareAndSet(false, true)) {
            return;
        }
        IronLog.CALLBACK.verbose("onInitializationCompleted()");
        dc.i().a(new l4(IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
        this.V.onInitializationComplete();
    }

    private void W() throws JSONException {
        if (r0) {
            return;
        }
        r0 = true;
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", "false");
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dc.i().a(new l4(114, mediationAdditionalData));
    }

    private void X() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = m9.b().c();
        if (concurrentHashMapC.containsKey(com.json.mediationsdk.metadata.a.c)) {
            if (TextUtils.isEmpty(concurrentHashMapC.get(com.json.mediationsdk.metadata.a.c).get(0))) {
                return;
            }
            v3.f2345a.b(!MetaDataUtils.getMetaDataBooleanValue(r0));
        }
    }

    private boolean Y() {
        return this.n0 == null && this.l.b().getAdQualityConfigurations().a() && AdQualityBridge.adQualityAvailable();
    }

    private void Z() throws JSONException {
        if (this.G) {
            b0();
            return;
        }
        boolean zH = this.l.b().getBannerConfigurations().d().h();
        this.c0 = zH;
        if (zH) {
            a0();
        } else {
            h0();
        }
    }

    private int a(cc ccVar) {
        return !this.Z && !this.X && ccVar.k().e() ? 2 : 1;
    }

    private f a(List<NetworkSettings> list) {
        n8 n8VarD = this.l.b().getInterstitialConfigurations();
        p3.a aVar = new p3.a("Mediation");
        if (n8VarD.k()) {
            aVar.a("isOneFlow", 1);
        }
        return new f(list, n8VarD, com.json.mediationsdk.c.b(), this.p0, q(), r(), new p3.b(o8.i(), aVar));
    }

    private IronSourceError a(s.d dVar) {
        if (!this.J) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.G) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == s.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == s.d.INIT_IN_PROGRESS && s.c().d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    private com.json.mediationsdk.utils.c a(Context context, String str) {
        if (IronSourceUtils.isInitResponseCached(context)) {
            String cachedValueByKeyOfCachedInitResponse = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "appKey");
            String cachedValueByKeyOfCachedInitResponse2 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "userId");
            String cachedValueByKeyOfCachedInitResponse3 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, com.json.mediationsdk.utils.c.Y1);
            if (cachedValueByKeyOfCachedInitResponse.equals(str)) {
                com.json.mediationsdk.utils.c cVar = new com.json.mediationsdk.utils.c(context, cachedValueByKeyOfCachedInitResponse, cachedValueByKeyOfCachedInitResponse2, cachedValueByKeyOfCachedInitResponse3);
                cVar.a(c.a.CACHE);
                return cVar;
            }
        }
        return null;
    }

    private com.json.mediationsdk.utils.c a(Context context, String str, c cVar) {
        com.json.mediationsdk.utils.c cVar2 = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String strB = b(context);
            if (TextUtils.isEmpty(strB)) {
                strB = this.c.J(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = strB;
            IronSourceSegment ironSourceSegment = this.B;
            String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, q(), str, str2, s(), this.X, ironSourceSegment != null ? ironSourceSegment.getSegmentData() : null, C()), cVar);
            if (stringFromURL == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.isEncryptedResponse()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                String strOptString = new JSONObject(stringFromURL).optString(com.json.mediationsdk.utils.c.Y1, null);
                if (TextUtils.isEmpty(strOptString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                stringFromURL = IronSourceAES.decode(h4.b().c(), strOptString);
                if (TextUtils.isEmpty(stringFromURL)) {
                    ironLog.warning("encoded response invalid - return null");
                    W();
                    return null;
                }
            }
            com.json.mediationsdk.utils.c cVar3 = new com.json.mediationsdk.utils.c(context, q(), str, stringFromURL);
            try {
                cVar3.a(c.a.SERVER);
                if (cVar3.m()) {
                    return cVar3;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e) {
                e = e;
                cVar2 = cVar3;
                IronLog.INTERNAL.warning("exception = " + e);
                e.printStackTrace();
                return cVar2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private List<NetworkSettings> a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.l.i().b(str));
            }
        }
        return arrayList2;
    }

    private void a(int i, JSONObject jSONObject) {
        o8.i().a(new l4(i, jSONObject));
    }

    private void a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.g.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    private void a(IronSource.AD_UNIT ad_unit, boolean z) {
        ConcurrentHashMap concurrentHashMap;
        int i = b.f1979a[ad_unit.ordinal()];
        if (i == 1) {
            if (!this.E) {
                if (this.X) {
                    if (this.Y) {
                        this.Y = false;
                        n.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        return;
                    }
                    return;
                }
                if (z || N() || this.z.contains(ad_unit)) {
                    wb.a().a(false, (AdInfo) null);
                    return;
                }
                return;
            }
            Iterator<h.d> it = this.g0.values().iterator();
            while (it.hasNext()) {
                String strB = it.next().getInstanceId();
                this.q0.a(strB).onRewardedVideoAdLoadFailed(strB, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            concurrentHashMap = this.g0;
        } else if (i != 2) {
            if (i == 3) {
                if (z || L() || this.z.contains(ad_unit)) {
                    this.h.onOfferwallAvailable(false);
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
            if (!this.G) {
                if (this.L.booleanValue()) {
                    this.L = Boolean.FALSE;
                    n.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(602, "init() had failed"));
                    this.M = null;
                    this.N = null;
                    return;
                }
                return;
            }
            for (h.b bVar : this.f0.values()) {
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.getCom.my.tracker.ads.AdFormat.BANNER java.lang.String();
                if (iSDemandOnlyBannerLayoutG != null) {
                    iSDemandOnlyBannerLayoutG.getListener().a(bVar.getInstanceId(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                }
            }
            concurrentHashMap = this.f0;
        } else {
            if (!this.F) {
                if (this.b0) {
                    this.b0 = false;
                    n.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
                return;
            }
            Iterator<h.d> it2 = this.e0.values().iterator();
            while (it2.hasNext()) {
                String strB2 = it2.next().getInstanceId();
                this.p0.a(strB2).onInterstitialAdLoadFailed(strB2, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            concurrentHashMap = this.e0;
        }
        concurrentHashMap.clear();
    }

    private synchronized void a(h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String strB = dVar.getInstanceId();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strB);
        try {
        } catch (Throwable th) {
            IronLog.API.error(th.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strB, new IronSourceError(510, th.getMessage()));
        }
        if (!this.I) {
            ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strB, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
            return;
        }
        if (!this.F) {
            ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strB, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
            return;
        }
        s.d dVarA = s.c().a();
        if (dVarA == s.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strB, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            return;
        }
        IronSourceError ironSourceErrorC = dVar.c();
        if (ironSourceErrorC != null) {
            if (ironSourceErrorC.getErrorCode() == 1060) {
                b(IronSourceConstants.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
            }
            ironLog.error(ironSourceErrorC.toString());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strB, ironSourceErrorC);
            return;
        }
        e(dVar.getActivity());
        if (dVarA == s.d.INIT_IN_PROGRESS) {
            if (s.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strB, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            } else {
                synchronized (this.e0) {
                    this.e0.put(dVar.getInstanceId(), dVar);
                }
                if (!TextUtils.isEmpty(dVar.getInstanceId())) {
                    a(IronSourceConstants.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                }
            }
            return;
        }
        if (!E()) {
            ironLog.error("No interstitial configurations found");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strB, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
            return;
        }
        synchronized (this.e0) {
            f fVar = this.h0;
            if (fVar != null) {
                fVar.a(dVar);
                return;
            }
            this.e0.put(dVar.getInstanceId(), dVar);
            if (!TextUtils.isEmpty(dVar.getAdMarkup())) {
                a(IronSourceConstants.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
            }
            return;
        }
    }

    private void a(com.json.mediationsdk.utils.c cVar) {
        this.i.setDebugLevel(cVar.b().getApplicationConfigurations().g().b());
        this.g.setLoggerDebugLevel(com.json.mediationsdk.logger.a.c, cVar.b().getApplicationConfigurations().g().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.json.mediationsdk.utils.c r9, android.content.Context r10) {
        /*
            r8 = this;
            boolean r0 = r8.N()
            r1 = 0
            if (r0 == 0) goto L18
            com.ironsource.l2 r0 = r9.b()
            com.ironsource.cc r0 = r0.getRewardedVideoConfigurations()
            com.ironsource.r0 r0 = r0.n()
            boolean r0 = r0.l()
            goto L19
        L18:
            r0 = r1
        L19:
            boolean r2 = r8.D()
            if (r2 == 0) goto L30
            com.ironsource.l2 r2 = r9.b()
            com.ironsource.n8 r2 = r2.getInterstitialConfigurations()
            com.ironsource.r0 r2 = r2.j()
            boolean r2 = r2.l()
            goto L31
        L30:
            r2 = r1
        L31:
            boolean r3 = r8.z()
            if (r3 == 0) goto L48
            com.ironsource.l2 r3 = r9.b()
            com.ironsource.p1 r3 = r3.getBannerConfigurations()
            com.ironsource.r0 r3 = r3.h()
            boolean r3 = r3.l()
            goto L49
        L48:
            r3 = r1
        L49:
            boolean r4 = r8.I()
            if (r4 == 0) goto L60
            com.ironsource.l2 r4 = r9.b()
            com.ironsource.fa r4 = r4.getNativeAdConfigurations()
            com.ironsource.r0 r4 = r4.getEventsConfigurations()
            boolean r4 = r4.l()
            goto L61
        L60:
            r4 = r1
        L61:
            boolean r5 = r8.L()
            if (r5 == 0) goto L78
            com.ironsource.l2 r5 = r9.b()
            com.ironsource.ua r5 = r5.getOfferwallConfigurations()
            com.ironsource.r0 r5 = r5.c()
            boolean r5 = r5.l()
            goto L79
        L78:
            r5 = r1
        L79:
            com.ironsource.l2 r6 = r9.b()
            com.ironsource.o0 r6 = r6.getApplicationConfigurations()
            com.ironsource.mb r6 = r6.h()
            boolean r7 = r6.i()
            if (r0 == 0) goto L9b
            com.ironsource.l2 r0 = r9.b()
            com.ironsource.cc r0 = r0.getRewardedVideoConfigurations()
            com.ironsource.r0 r0 = r0.n()
        L97:
            r8.b(r0, r10, r9)
            goto Lb1
        L9b:
            if (r5 == 0) goto Laa
            com.ironsource.l2 r0 = r9.b()
            com.ironsource.ua r0 = r0.getOfferwallConfigurations()
            com.ironsource.r0 r0 = r0.c()
            goto L97
        Laa:
            com.ironsource.dc r0 = com.json.dc.i()
            r0.b(r1)
        Lb1:
            if (r2 == 0) goto Lc3
            com.ironsource.l2 r0 = r9.b()
            com.ironsource.n8 r0 = r0.getInterstitialConfigurations()
            com.ironsource.r0 r0 = r0.j()
        Lbf:
            r8.a(r0, r10, r9)
            goto Le8
        Lc3:
            if (r3 == 0) goto Ld2
            com.ironsource.l2 r0 = r9.b()
            com.ironsource.p1 r0 = r0.getBannerConfigurations()
            com.ironsource.r0 r0 = r0.h()
            goto Lbf
        Ld2:
            if (r4 == 0) goto Le1
            com.ironsource.l2 r0 = r9.b()
            com.ironsource.fa r0 = r0.getNativeAdConfigurations()
            com.ironsource.r0 r0 = r0.getEventsConfigurations()
            goto Lbf
        Le1:
            com.ironsource.o8 r9 = com.json.o8.i()
            r9.b(r1)
        Le8:
            com.ironsource.lb r9 = com.json.lb.P
            r9.b(r7)
            if (r7 == 0) goto L112
            java.lang.String r0 = r6.j()
            r9.b(r0, r10)
            int[] r0 = r6.l()
            r9.c(r0, r10)
            int[] r0 = r6.k()
            r9.a(r0, r10)
            boolean r10 = r6.g()
            r9.a(r10)
            int r10 = r6.h()
            r9.d(r10)
        L112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.p.a(com.ironsource.mediationsdk.utils.c, android.content.Context):void");
    }

    private void a(r0 r0Var, Context context, com.json.mediationsdk.utils.c cVar) {
        o8.i().a(r0Var.c(), context);
        o8.i().b(r0Var.d(), context);
        o8.i().b(r0Var.f());
        o8.i().a(r0Var.e());
        o8.i().c(r0Var.a());
        o8.i().c(r0Var.i(), context);
        o8.i().a(r0Var.h(), context);
        o8.i().b(r0Var.j(), context);
        o8.i().d(r0Var.g(), context);
        o8.i().a(cVar.b().getApplicationConfigurations().i());
        o8.i().a(r0Var.k());
        o8.i().d(r0Var.b());
    }

    private void a(ApplicationGeneralSettings applicationGeneralSettings) {
        v3 v3Var = v3.f2345a;
        v3Var.c(applicationGeneralSettings.getShouldUseAppSet());
        v3Var.a(applicationGeneralSettings.getShouldReuseAdvId());
        v3Var.a(applicationGeneralSettings.getUserAgentExpirationThresholdInHours());
    }

    private void a(String str, k2 k2Var) {
        if (a(str, 1, 128)) {
            return;
        }
        k2Var.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    private void a(JSONObject jSONObject, Object[][] objArr) throws JSONException {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
            }
        }
    }

    private void a(boolean z, String str) throws JSONException {
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.E, true, this.d0);
            if (str != null) {
                a(mediationAdditionalData, new Object[][]{new Object[]{"placement", str}});
            }
            b(IronSourceConstants.RV_API_IS_CAPPED_TRUE, mediationAdditionalData);
        }
    }

    private void a(boolean z, boolean z2, int i, JSONObject jSONObject) throws JSONException {
        StringBuilder sb;
        String str;
        try {
            sb = new StringBuilder();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!z2) {
            if (!z) {
                sb.append(",");
                str = IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW;
            }
            sb.append(String.format(",cachedUserAgent=%s", Boolean.valueOf(this.c.q())));
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
            jSONObject.put("sessionDepth", i);
            dc.i().a(new l4(14, jSONObject));
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(ContextProvider.getInstance().getCurrentActiveActivity() != null);
        str = String.format(",Activity=%s", objArr);
        sb.append(str);
        sb.append(String.format(",cachedUserAgent=%s", Boolean.valueOf(this.c.q())));
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
        jSONObject.put("sessionDepth", i);
        dc.i().a(new l4(14, jSONObject));
    }

    private synchronized void a(boolean z, boolean z2, IronSource.AD_UNIT... ad_unitArr) {
        JSONObject mediationAdditionalData;
        int i = 0;
        for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
            if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                this.I = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                this.J = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                this.H = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD)) {
                this.K = true;
            }
        }
        if (s.c().a() == s.d.INIT_FAILED) {
            try {
                if (this.h != null) {
                    int length = ad_unitArr.length;
                    while (i < length) {
                        IronSource.AD_UNIT ad_unit2 = ad_unitArr[i];
                        if (!this.y.contains(ad_unit2)) {
                            a(ad_unit2, true);
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.t) {
            s.c().b(z2);
            if (this.u == null) {
                return;
            }
            mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z2);
            boolean z3 = false;
            for (IronSource.AD_UNIT ad_unit3 : ad_unitArr) {
                if (this.y.contains(ad_unit3)) {
                    a(ad_unit3);
                } else {
                    this.y.add(ad_unit3);
                    this.z.add(ad_unit3);
                    try {
                        mediationAdditionalData.put(ad_unit3.toString(), true);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    List<IronSource.AD_UNIT> list = this.u;
                    if (list == null || !list.contains(ad_unit3)) {
                        a(ad_unit3, false);
                    } else {
                        b(ad_unit3);
                    }
                    z3 = true;
                }
            }
            if (z3) {
                int i2 = this.D + 1;
                this.D = i2;
                a(z, z2, i2, mediationAdditionalData);
            }
        } else {
            mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z2);
            int length2 = ad_unitArr.length;
            boolean z4 = false;
            while (i < length2) {
                IronSource.AD_UNIT ad_unit4 = ad_unitArr[i];
                if (this.y.contains(ad_unit4)) {
                    this.g.log(IronSourceLogger.IronSourceTag.API, ad_unit4 + " ad unit has started initializing.", 3);
                } else {
                    this.y.add(ad_unit4);
                    this.z.add(ad_unit4);
                    try {
                        mediationAdditionalData.put(ad_unit4.toString(), true);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    z4 = true;
                }
                i++;
            }
            if (z4) {
                int i22 = this.D + 1;
                this.D = i22;
                a(z, z2, i22, mediationAdditionalData);
            }
        }
    }

    private boolean a(h.b bVar) {
        if (s.c().a() != s.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.f0) {
            this.f0.put(bVar.getInstanceId(), bVar);
        }
        return true;
    }

    private boolean a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    private void a0() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.l.h().a());
        if (listA.size() > 0) {
            this.U = new m1(listA, this.l.b().getBannerConfigurations(), IronSourceUtils.getUserIdForNetworks(), m9.b(), this.B, this.l.k());
            w();
        } else {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
        }
    }

    private k b(List<NetworkSettings> list) {
        cc ccVarG = this.l.b().getRewardedVideoConfigurations();
        p3.a aVar = new p3.a("Mediation");
        if (ccVarG.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new k(list, ccVarG, com.json.mediationsdk.c.b(), this.q0, q(), r(), new p3.b(dc.i(), aVar));
    }

    private void b(int i, JSONObject jSONObject) {
        dc.i().a(new l4(i, jSONObject));
    }

    private void b(IronSource.AD_UNIT ad_unit) throws JSONException {
        int i = b.f1979a[ad_unit.ordinal()];
        if (i == 1) {
            j0();
            return;
        }
        if (i == 2) {
            e0();
        } else if (i == 3) {
            this.f.a(q(), r());
        } else {
            if (i != 4) {
                return;
            }
            Z();
        }
    }

    private void b(com.json.mediationsdk.utils.c cVar, Context context) {
        a(cVar);
        a(cVar, context);
    }

    private void b(r0 r0Var, Context context, com.json.mediationsdk.utils.c cVar) {
        dc.i().a(r0Var.c(), context);
        dc.i().b(r0Var.d(), context);
        dc.i().b(r0Var.f());
        dc.i().a(r0Var.e());
        dc.i().c(r0Var.a());
        dc.i().c(r0Var.i(), context);
        dc.i().a(r0Var.h(), context);
        dc.i().b(r0Var.j(), context);
        dc.i().d(r0Var.g(), context);
        dc.i().a(cVar.b().getApplicationConfigurations().i());
        dc.i().a(r0Var.k());
        dc.i().d(r0Var.b());
    }

    private void b(String str, k2 k2Var) {
        if (str != null) {
            try {
                if (str.length() > 64) {
                    k2Var.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                }
            } catch (Exception unused) {
                k2Var.a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
            }
        }
    }

    private boolean b(h.b bVar) {
        synchronized (this.f0) {
            if (this.j0 != null) {
                return false;
            }
            this.f0.put(bVar.getInstanceId(), bVar);
            return true;
        }
    }

    private boolean b(com.json.mediationsdk.utils.c cVar) {
        return cVar != null && cVar.l();
    }

    private void b0() throws JSONException {
        this.g.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l.h().a().size(); i++) {
            String str = this.l.h().a().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.i().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
            return;
        }
        synchronized (this.f0) {
            p1 p1VarC = this.l.b().getBannerConfigurations();
            p3.a aVar = new p3.a("Mediation");
            if (p1VarC.k()) {
                aVar.a("isOneFlow", 1);
            }
            this.j0 = new com.json.mediationsdk.demandOnly.c(arrayList, p1VarC, q(), r(), new p3.b(o8.i(), aVar));
        }
        for (h.b bVar : this.f0.values()) {
            this.j0.a(bVar.getCom.my.tracker.ads.AdFormat.BANNER java.lang.String(), bVar.getInstanceId());
        }
        this.f0.clear();
    }

    private void c0() throws JSONException {
        this.g.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l.h().b().size(); i++) {
            String str = this.l.h().b().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.i().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        synchronized (this.e0) {
            this.h0 = a((List<NetworkSettings>) arrayList);
        }
        Iterator<h.d> it = this.e0.values().iterator();
        while (it.hasNext()) {
            this.h0.a(it.next());
        }
        this.e0.clear();
    }

    private void d(Activity activity, String str) {
        try {
            InterstitialPlacement interstitialPlacementP = p(str);
            if (interstitialPlacementP == null) {
                interstitialPlacementP = m();
            }
            if (interstitialPlacementP == null) {
                this.g.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                v6.a().a(new IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), (AdInfo) null);
                return;
            }
            if (activity != null) {
                e(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.g.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showInterstitial when initializing SDK with context", 3);
                v6.a().a(new IronSourceError(510, "Activity must be provided in showInterstitial when initializing SDK with context"), (AdInfo) null);
                return;
            }
            if (this.a0) {
                this.S.a(activity, new Placement(interstitialPlacementP));
            } else {
                this.Q.a(activity, interstitialPlacementP.getPlacementName());
            }
        } catch (Exception e) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e);
        }
    }

    private void d(Context context) {
        AtomicBoolean atomicBoolean = this.j;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        xc.a().a(new g5(context));
        o8.i().a(context, this.B);
        dc.i().a(context, this.B);
        lb.P.a(context, this.B);
    }

    private void d0() {
        this.g.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l.h().d().size(); i++) {
            String str = this.l.h().d().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.l.i().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.g0) {
            this.i0 = b((List<NetworkSettings>) arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        Iterator<h.d> it = this.g0.values().iterator();
        while (it.hasNext()) {
            this.i0.a(it.next());
        }
        this.g0.clear();
    }

    private void e(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(android.app.Activity r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 3
            r1 = 0
            com.ironsource.mediationsdk.model.Placement r8 = r6.t(r8)     // Catch: java.lang.Exception -> L29
            if (r8 != 0) goto Lf
            com.ironsource.mediationsdk.model.Placement r8 = r6.n()     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L2b
        Lf:
            if (r8 != 0) goto L34
            java.lang.String r2 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.g     // Catch: java.lang.Exception -> Ld
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch: java.lang.Exception -> Ld
            r3.log(r4, r2, r0)     // Catch: java.lang.Exception -> Ld
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> Ld
            r4 = 1021(0x3fd, float:1.431E-42)
            r3.<init>(r4, r2)     // Catch: java.lang.Exception -> Ld
            com.ironsource.wb r2 = com.json.wb.a()     // Catch: java.lang.Exception -> Ld
            r2.a(r3, r1)     // Catch: java.lang.Exception -> Ld
            return
        L29:
            r2 = move-exception
            r8 = r1
        L2b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.g
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r5 = "showProgrammaticRewardedVideo()"
            r3.logException(r4, r5, r2)
        L34:
            if (r7 == 0) goto L3a
            r6.e(r7)
            goto L5b
        L3a:
            com.ironsource.environment.ContextProvider r2 = com.json.environment.ContextProvider.getInstance()
            android.app.Activity r2 = r2.getCurrentActiveActivity()
            if (r2 != 0) goto L5b
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.g
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "Activity must be provided in showRewardedVideo when initializing SDK with context"
            r7.log(r8, r2, r0)
            com.ironsource.wb r7 = com.json.wb.a()
            java.lang.String r8 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r2, r8)
            r7.a(r8, r1)
            return
        L5b:
            com.ironsource.ac r2 = r6.T
            if (r2 == 0) goto L6b
            boolean r3 = r6.X
            if (r3 != 0) goto L67
            boolean r3 = r6.Z
            if (r3 == 0) goto L6b
        L67:
            r2.a(r7, r8)
            goto L8a
        L6b:
            com.ironsource.l6 r2 = r6.P
            if (r2 == 0) goto L73
            r2.a(r7, r8)
            goto L8a
        L73:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.g
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"
            r7.log(r8, r2, r0)
            com.ironsource.mediationsdk.logger.IronSourceError r7 = new com.ironsource.mediationsdk.logger.IronSourceError
            r8 = 1023(0x3ff, float:1.434E-42)
            r7.<init>(r8, r2)
            com.ironsource.wb r8 = com.json.wb.a()
            r8.a(r7, r1)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.p.e(android.app.Activity, java.lang.String):void");
    }

    private void e0() throws JSONException {
        if (this.F) {
            c0();
            return;
        }
        boolean zH = this.l.b().getInterstitialConfigurations().g().h();
        this.a0 = zH;
        if (zH) {
            f0();
        } else {
            i0();
        }
    }

    private void f0() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.l.h().b());
        if (listA.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        k8 k8Var = new k8(listA, this.l.b().getInterstitialConfigurations(), IronSourceUtils.getUserIdForNetworks(), m9.b(), this.B, this.l.k());
        this.S = k8Var;
        Boolean bool = this.x;
        if (bool != null) {
            k8Var.a(this.w, bool.booleanValue());
        }
        if (this.b0) {
            this.b0 = false;
            this.S.w();
        }
    }

    private void g() {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        boolean zIsInitResponseCached = IronSourceUtils.isInitResponseCached(applicationContext);
        long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(applicationContext);
        if (zIsInitResponseCached || firstSessionTimestamp != -1) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        IronLog.INTERNAL.verbose("get first session timestamp = " + jCurrentTimeMillis);
        IronSourceUtils.saveFirstSessionTimestamp(applicationContext, jCurrentTimeMillis);
    }

    private void g0() throws JSONException {
        this.g.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> listA = a(this.l.h().d());
        if (listA.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.d0);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        q qVar = new q(listA, this.l.b().getRewardedVideoConfigurations(), q(), IronSourceUtils.getUserIdForNetworks(), m9.b().a(), this.B);
        this.P = qVar;
        Boolean bool = this.x;
        if (bool != null) {
            qVar.a(this.w, bool.booleanValue());
        }
    }

    private void h0() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.l.h().a());
        if (listA.size() > 0) {
            this.g.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
            this.R = new w(listA, new k(q(), IronSourceUtils.getUserIdForNetworks(), this.l.b().getBannerConfigurations()), m9.b().a(), this.B);
            w();
        } else {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
        }
    }

    private void i0() throws JSONException {
        this.g.log(IronSourceLogger.IronSourceTag.INTERNAL, "Adunit: Interstitial is now initiated - programmatic mode", 0);
        List<NetworkSettings> listA = a(this.l.h().b());
        if (listA.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        y yVar = new y(listA, this.l.b().getInterstitialConfigurations(), q(), IronSourceUtils.getUserIdForNetworks(), this.l.b().getInterstitialConfigurations().b(), m9.b().a(), this.B);
        this.Q = yVar;
        Boolean bool = this.x;
        if (bool != null) {
            yVar.a(this.w, bool.booleanValue());
        }
        if (this.b0) {
            this.b0 = false;
            this.Q.i();
        }
    }

    private void j0() throws JSONException {
        if (this.E) {
            d0();
            return;
        }
        cc ccVarG = this.l.b().getRewardedVideoConfigurations();
        this.Z = ccVarG.k().h();
        this.d0 = a(ccVarG);
        if (this.X || this.Z) {
            k0();
        } else {
            g0();
        }
    }

    private void k0() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.l.h().d());
        if (listA.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.d0);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        ac acVar = new ac(listA, this.l.b().getRewardedVideoConfigurations(), IronSourceUtils.getUserIdForNetworks(), this.X, m9.b(), this.B, this.l.k());
        this.T = acVar;
        Boolean bool = this.x;
        if (bool != null) {
            acVar.a(this.w, bool.booleanValue());
        }
        if (this.Y && this.X) {
            this.Y = false;
            this.T.w();
        }
    }

    private r1 l() {
        p1 p1VarC = this.l.b().getBannerConfigurations();
        if (p1VarC != null) {
            return p1VarC.j();
        }
        return null;
    }

    private InterstitialPlacement m() {
        n8 n8VarD = this.l.b().getInterstitialConfigurations();
        if (n8VarD != null) {
            return n8VarD.a();
        }
        return null;
    }

    private Placement n() {
        cc ccVarG = this.l.b().getRewardedVideoConfigurations();
        if (ccVarG != null) {
            return ccVarG.a();
        }
        return null;
    }

    private r1 n(String str) {
        r1 r1VarA;
        p1 p1VarC = this.l.b().getBannerConfigurations();
        return p1VarC == null ? new g4() : (TextUtils.isEmpty(str) || (r1VarA = p1VarC.a(str)) == null) ? p1VarC.j() : r1VarA;
    }

    private b.EnumC0239b o(String str) {
        com.json.mediationsdk.utils.c cVar = this.l;
        if (cVar == null || cVar.b() == null || this.l.b().getInterstitialConfigurations() == null) {
            return b.EnumC0239b.NOT_CAPPED;
        }
        InterstitialPlacement interstitialPlacementP = null;
        try {
            interstitialPlacementP = p(str);
            if (interstitialPlacementP == null && (interstitialPlacementP = m()) == null) {
                this.g.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return interstitialPlacementP == null ? b.EnumC0239b.NOT_CAPPED : com.json.mediationsdk.utils.b.c(ContextProvider.getInstance().getApplicationContext(), interstitialPlacementP);
    }

    private InterstitialPlacement p(String str) {
        n8 n8VarD = this.l.b().getInterstitialConfigurations();
        if (n8VarD != null) {
            return n8VarD.a(str);
        }
        return null;
    }

    public static p p() {
        return d.f1980a;
    }

    private b.EnumC0239b s(String str) {
        com.json.mediationsdk.utils.c cVar = this.l;
        if (cVar == null || cVar.b() == null || this.l.b().getRewardedVideoConfigurations() == null) {
            return b.EnumC0239b.NOT_CAPPED;
        }
        Placement placementT = null;
        try {
            placementT = t(str);
            if (placementT == null && (placementT = n()) == null) {
                this.g.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return placementT == null ? b.EnumC0239b.NOT_CAPPED : com.json.mediationsdk.utils.b.c(ContextProvider.getInstance().getApplicationContext(), placementT);
    }

    private Placement t(String str) {
        cc ccVarG = this.l.b().getRewardedVideoConfigurations();
        if (ccVarG != null) {
            return ccVarG.a(str);
        }
        return null;
    }

    private void w() {
        if (this.L.booleanValue()) {
            IronLog.INTERNAL.verbose("load banner after init");
            this.L = Boolean.FALSE;
            a(this.M, this.N);
            this.M = null;
            this.N = null;
        }
    }

    private void x() {
        this.g = IronSourceLoggerManager.getLogger(0);
        com.json.mediationsdk.logger.b bVar = new com.json.mediationsdk.logger.b(null, 1);
        this.i = bVar;
        this.g.addLogger(bVar);
        this.h = new w9();
        v vVar = new v();
        this.f = vVar;
        vVar.setInternalOfferwallListener(this.h);
    }

    private boolean y() {
        try {
            Class<?> cls = Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality");
            IronLog.INTERNAL.verbose("AdQuality SDK exist: " + cls.getName());
            return true;
        } catch (Throwable unused) {
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean y(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private k2 z(String str) {
        IronSourceError ironSourceError;
        String str2;
        k2 k2Var = new k2();
        if (str != null) {
            if (a(str, 5, 10)) {
                str2 = y(str) ? "length should be between 5-10 characters" : "should contain only english characters and numbers";
                return k2Var;
            }
            ironSourceError = ErrorBuilder.buildInvalidCredentialsError("appKey", str, str2);
        } else {
            ironSourceError = new IronSourceError(506, "Init Fail - appKey is missing");
        }
        k2Var.a(ironSourceError);
        return k2Var;
    }

    private boolean z() {
        com.json.mediationsdk.utils.c cVar = this.l;
        return (cVar == null || cVar.b() == null || this.l.b().getBannerConfigurations() == null) ? false : true;
    }

    boolean C() {
        return this.E || this.F || this.G;
    }

    public boolean F() {
        boolean z;
        boolean z2;
        try {
            if (this.F) {
                this.g.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead", 3);
                return false;
            }
            if (this.a0) {
                k8 k8Var = this.S;
                if (k8Var != null && k8Var.q()) {
                }
            } else {
                y yVar = this.Q;
                z2 = yVar != null && yVar.h();
            }
            try {
                o8.i().a(new l4(z2 ? IronSourceConstants.IS_CHECK_READY_TRUE : IronSourceConstants.IS_CHECK_READY_FALSE, IronSourceUtils.getMediationAdditionalData(false, true, 1)));
                this.g.log(IronSourceLogger.IronSourceTag.API, "isInterstitialReady():" + z2, 1);
                return z2;
            } catch (Throwable th) {
                z = z2;
                th = th;
                IronSourceLoggerManager ironSourceLoggerManager = this.g;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isInterstitialReady():" + z, 1);
                this.g.logException(ironSourceTag, "isInterstitialReady()", th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public boolean H() {
        return s.c().a() == s.d.INITIATED;
    }

    public boolean M() {
        boolean z;
        boolean z2;
        try {
            if (this.E) {
                this.g.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            if (this.X || this.Z) {
                ac acVar = this.T;
                z2 = acVar != null && acVar.q();
            } else {
                l6 l6Var = this.P;
                if (l6Var != null && l6Var.d()) {
                }
            }
            try {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.d0)}});
                dc.i().a(new l4(z2 ? IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE : IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData));
                this.g.log(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable():" + z2, 1);
                return z2;
            } catch (Throwable th) {
                z = z2;
                th = th;
                IronSourceLoggerManager ironSourceLoggerManager = this.g;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isRewardedVideoAvailable():" + z, 1);
                this.g.logException(ironSourceTag, "isRewardedVideoAvailable()", th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public boolean Q() {
        return this.l != null;
    }

    public void R() {
        IronSourceLoggerManager ironSourceLoggerManager = this.g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (this.F) {
                this.g.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                n.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial"));
                return;
            }
            if (!this.I) {
                this.g.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                n.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial"));
                return;
            }
            s.d dVarA = s.c().a();
            if (dVarA == s.d.INIT_FAILED) {
                this.g.log(ironSourceTag, "init() had failed", 3);
                n.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            if (dVarA == s.d.INIT_IN_PROGRESS) {
                if (!s.c().d()) {
                    this.b0 = true;
                    return;
                } else {
                    this.g.log(ironSourceTag, "init() had failed", 3);
                    n.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
            }
            if (!E()) {
                this.g.log(ironSourceTag, "No interstitial configurations found", 3);
                n.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            if (this.a0) {
                k8 k8Var = this.S;
                if (k8Var != null) {
                    k8Var.w();
                    return;
                }
            } else {
                y yVar = this.Q;
                if (yVar != null) {
                    yVar.i();
                    return;
                }
            }
            this.b0 = true;
        } catch (Throwable th) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            n.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(510, th.getMessage()));
        }
    }

    public void S() {
        IronSourceLoggerManager ironSourceLoggerManager = this.g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (this.E) {
                this.g.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                n.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (!this.X && !this.m0) {
                this.g.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
                return;
            }
            if (!this.H) {
                this.g.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                n.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            s.d dVarA = s.c().a();
            if (dVarA == s.d.INIT_FAILED) {
                this.g.log(ironSourceTag, "init() had failed", 3);
                n.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (dVarA == s.d.INIT_IN_PROGRESS) {
                if (!s.c().d()) {
                    this.Y = true;
                    return;
                } else {
                    this.g.log(ironSourceTag, "init() had failed", 3);
                    n.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
            }
            if (!O()) {
                this.g.log(ironSourceTag, "No rewarded video configurations found", 3);
                n.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            ac acVar = this.T;
            if (acVar == null) {
                this.Y = true;
            } else {
                acVar.w();
            }
        } catch (Throwable th) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            n.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, new IronSourceError(510, th.getMessage()));
        }
    }

    public void T() {
        k8 k8Var = this.S;
        if (k8Var != null) {
            k8Var.a((ed) null);
        }
        ac acVar = this.T;
        if (acVar != null) {
            acVar.a((ed) null);
        }
        m1 m1Var = this.U;
        if (m1Var != null) {
            m1Var.a((ed) null);
        }
        this.m0 = false;
    }

    public void U() {
        IronLog.API.info("removing all impression data listeners");
        m9.b().d();
        l6 l6Var = this.P;
        if (l6Var != null) {
            l6Var.c();
        }
        y yVar = this.Q;
        if (yVar != null) {
            yVar.c();
        }
        w wVar = this.R;
        if (wVar != null) {
            wVar.c();
        }
    }

    @Override // com.ironsource.o3.a
    public ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.g.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    @Override // com.json.o3
    public String a(Context context) {
        String strCompressAndEncrypt;
        com.json.mediationsdk.utils.d dVarJ;
        b(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED, (JSONObject) null);
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            b(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (JSONObject) null);
            return null;
        }
        s.d dVarA = s.c().a();
        try {
            b(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, new JSONObject().put(IronSourceConstants.EVENTS_EXT1, dVarA.toString()));
        } catch (Throwable th) {
            b(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, (JSONObject) null);
            IronLog.API.error("got error during token creation: " + th.getMessage());
            strCompressAndEncrypt = null;
        }
        if (dVarA == s.d.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            return null;
        }
        s.c().f();
        com.json.mediationsdk.utils.c cVar = this.l;
        boolean zE = (cVar == null || (dVarJ = cVar.b().getApplicationConfigurations().j()) == null) ? true : dVarJ.e();
        JSONObject jSONObjectA = new vd().a(context);
        com.json.mediationsdk.d.c().a(jSONObjectA, true);
        strCompressAndEncrypt = zE ? IronSourceAES.compressAndEncrypt(jSONObjectA.toString()) : IronSourceAES.encrypt(jSONObjectA.toString());
        if (strCompressAndEncrypt == null) {
            b(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
        }
        return strCompressAndEncrypt;
    }

    String a(String str, b.EnumC0239b enumC0239b) {
        if (enumC0239b == null) {
            return null;
        }
        int i = b.c[enumC0239b.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            return null;
        }
        return "placement " + str + " is capped";
    }

    @Override // com.json.za
    public void a() {
        if (this.L.booleanValue()) {
            this.L = Boolean.FALSE;
            n.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(603, "init() had failed"));
            this.M = null;
            this.N = null;
        }
        if (this.b0) {
            this.b0 = false;
            n.a().a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.Y) {
            this.Y = false;
            n.a().a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.e0) {
            Iterator<h.d> it = this.e0.values().iterator();
            while (it.hasNext()) {
                String strB = it.next().getInstanceId();
                this.p0.a(strB).onInterstitialAdLoadFailed(strB, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
            this.e0.clear();
        }
        synchronized (this.g0) {
            Iterator<h.d> it2 = this.g0.values().iterator();
            while (it2.hasNext()) {
                String strB2 = it2.next().getInstanceId();
                this.q0.a(strB2).onRewardedVideoAdLoadFailed(strB2, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.g0.clear();
        }
        synchronized (this.f0) {
            for (h.b bVar : this.f0.values()) {
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.getCom.my.tracker.ads.AdFormat.BANNER java.lang.String();
                if (iSDemandOnlyBannerLayoutG != null) {
                    iSDemandOnlyBannerLayoutG.getListener().a(bVar.getInstanceId(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                }
            }
            this.f0.clear();
        }
    }

    public void a(long j) throws JSONException {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(C());
        try {
            mediationAdditionalData.put("duration", j);
            mediationAdditionalData.put("sessionDepth", this.D);
        } catch (Exception e) {
            e.printStackTrace();
        }
        dc.i().a(new l4(IronSourceConstants.INIT_COMPLETE, mediationAdditionalData));
    }

    public void a(Activity activity) {
        try {
            this.g.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    @Override // com.ironsource.o3.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        h.b bVarA = new h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(IronSource.AD_UNIT.BANNER).a();
        IronSourceError ironSourceErrorC = bVarA.c();
        if (ironSourceErrorC != null) {
            this.g.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorC.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorC);
            }
            return;
        }
        IronSourceError ironSourceErrorA = a(s.c().a());
        if (ironSourceErrorA != null) {
            this.g.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!A()) {
            this.g.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.j0.a(iSDemandOnlyBannerLayout, str);
        }
    }

    @Override // com.ironsource.o3.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        h.b bVarA = new h.c().b(str).a(activity).a(true).a(str2).a(iSDemandOnlyBannerLayout).a(IronSource.AD_UNIT.BANNER).a();
        IronSourceError ironSourceErrorC = bVarA.c();
        if (ironSourceErrorC != null) {
            this.g.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorC.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorC);
            }
            return;
        }
        IronSourceError ironSourceErrorA = a(s.c().a());
        if (ironSourceErrorA != null) {
            this.g.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!A()) {
            this.g.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.j0.a(iSDemandOnlyBannerLayout, str, str2);
        }
    }

    @Override // com.ironsource.o3.b
    public synchronized void a(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.INTERSTITIAL).b(), this.p0.a(str));
    }

    @Override // com.ironsource.o3.c
    public synchronized void a(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(str2).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.q0.a(str));
    }

    public synchronized void a(Context context, String str, boolean z, InitializationListener initializationListener, IronSource.AD_UNIT... ad_unitArr) {
        IronLog.INTERNAL.verbose();
        if (!b9.a((Object) context, "Init Failed - provided context is null")) {
            d("Provided context is null");
            return;
        }
        boolean z2 = context instanceof Activity;
        if (z2) {
            e((Activity) context);
        }
        if (initializationListener != null) {
            this.V = initializationListener;
        }
        AtomicBoolean atomicBoolean = this.s;
        if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
            if (ad_unitArr == null || ad_unitArr.length == 0) {
                for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                    this.y.add(ad_unit);
                }
                this.H = true;
                this.I = true;
                this.J = true;
                this.K = true;
            } else {
                for (IronSource.AD_UNIT ad_unit2 : ad_unitArr) {
                    this.y.add(ad_unit2);
                    this.z.add(ad_unit2);
                    if (ad_unit2.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                        this.I = true;
                    }
                    if (ad_unit2.equals(IronSource.AD_UNIT.BANNER)) {
                        this.J = true;
                    }
                    if (ad_unit2.equals(IronSource.AD_UNIT.NATIVE_AD)) {
                        this.K = true;
                    }
                    if (ad_unit2.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                        this.H = true;
                    }
                }
            }
            IronLog.API.info("init(appKey:" + str + ")");
            k2 k2VarZ = z(str);
            if (k2VarZ.b()) {
                this.m = str;
            }
            com.json.mediationsdk.utils.c cVarA = a(context, this.m);
            if (cVarA != null) {
                a(cVarA.b().getApplicationConfigurations().e());
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
            this.d.a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(v3.f2345a.d()));
            this.l0.e(IronSourceUtils.getSDKVersion());
            this.l0.a(m6.a());
            this.l0.b(IronSourceUtils.isGooglePlayInstalled(context));
            this.l0.a(t.a());
            g();
            X();
            d(context);
            if (this.m == null) {
                s.c().e();
                if (this.y.contains(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                    wb.a().a(false, (AdInfo) null);
                }
                if (this.y.contains(IronSource.AD_UNIT.OFFERWALL)) {
                    this.h.a(false, k2VarZ.a());
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, k2VarZ.a().toString(), 1);
                return;
            }
            this.l0.a(context);
            this.l0.b(this.m);
            this.l0.g(this.v);
            this.l0.f(ConfigFile.getConfigFile().getPluginType());
            if (this.A) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z);
                if (ad_unitArr != null) {
                    for (IronSource.AD_UNIT ad_unit3 : ad_unitArr) {
                        try {
                            mediationAdditionalData.put(ad_unit3.toString(), true);
                        } catch (Exception unused) {
                        }
                    }
                }
                int i = this.D + 1;
                this.D = i;
                a(z2, z, i, mediationAdditionalData);
                this.A = false;
            }
            s.c().a(this);
            s.c().a(this.k0);
            s.c().a(context, str, this.n, ad_unitArr);
        } else if (ad_unitArr != null) {
            a(z2, z, ad_unitArr);
            if (H() && !z) {
                V();
            }
        } else {
            this.g.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
        }
    }

    @Override // com.json.o3
    public synchronized void a(Context context, String str, IronSource.AD_UNIT... ad_unitArr) {
        ArrayList arrayList = new ArrayList();
        if (ad_unitArr == null || ad_unitArr.length == 0) {
            if (this.H) {
                a(IronSource.AD_UNIT.REWARDED_VIDEO);
            } else {
                this.E = true;
                arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
            }
            if (this.I) {
                a(IronSource.AD_UNIT.INTERSTITIAL);
            } else {
                this.F = true;
                arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
            }
            if (this.J) {
                a(IronSource.AD_UNIT.BANNER);
            } else {
                this.G = true;
                arrayList.add(IronSource.AD_UNIT.BANNER);
            }
        } else {
            for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
                if (ad_unit.equals(IronSource.AD_UNIT.OFFERWALL)) {
                    this.g.log(IronSourceLogger.IronSourceTag.API, ad_unit + " ad unit cannot be initialized in demand only mode", 3);
                } else {
                    if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                        if (this.I) {
                            a(ad_unit);
                        } else {
                            this.F = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                    if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                        if (this.H) {
                            a(ad_unit);
                        } else {
                            this.E = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                    if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                        if (this.J) {
                            a(ad_unit);
                        } else {
                            this.G = true;
                            if (!arrayList.contains(ad_unit)) {
                                arrayList.add(ad_unit);
                            }
                        }
                    }
                }
            }
        }
        if (context != null) {
            if (context instanceof Activity) {
                e((Activity) context);
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        }
        if (!arrayList.isEmpty()) {
            a(context, str, true, null, (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[arrayList.size()]));
        }
    }

    @Override // com.json.w8
    public void a(Context context, boolean z) {
        this.w = context;
        this.x = Boolean.valueOf(z);
        if (this.a0) {
            k8 k8Var = this.S;
            if (k8Var != null) {
                k8Var.a(context, z);
            }
        } else {
            y yVar = this.Q;
            if (yVar != null) {
                yVar.a(context, z);
            }
        }
        if (this.Z) {
            ac acVar = this.T;
            if (acVar != null) {
                acVar.a(context, z);
                return;
            }
            return;
        }
        l6 l6Var = this.P;
        if (l6Var != null) {
            l6Var.a(context, z);
        }
    }

    synchronized void a(AbstractAdapter abstractAdapter) {
        this.e = abstractAdapter;
    }

    public void a(IronSource.AD_UNIT ad_unit, ed edVar) {
        m1 m1Var;
        ac acVar;
        k8 k8Var;
        if (this.m0) {
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL && (k8Var = this.S) != null) {
                k8Var.a(edVar);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO && (acVar = this.T) != null) {
                acVar.a(edVar);
            }
            if (ad_unit != IronSource.AD_UNIT.BANNER || (m1Var = this.U) == null) {
                return;
            }
            m1Var.a(edVar);
        }
    }

    public void a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        if (ad_unit == null) {
            IronLog.API.error("AdUnit should not be null.");
            return;
        }
        IronLog ironLog = IronLog.API;
        Object[] objArr = new Object[2];
        objArr[0] = ad_unit.name();
        objArr[1] = waterfallConfiguration == null ? "NULL" : waterfallConfiguration.toString();
        ironLog.info(String.format("(%s, %s)", objArr));
        l4 l4Var = new l4(53, IronSourceUtils.getMediationAdditionalData(false));
        l4Var.a(IronSourceConstants.EVENTS_EXT1, waterfallConfiguration == null ? "" : waterfallConfiguration.toJsonString());
        dc.i().a(l4Var, ad_unit);
        this.l0.a(ad_unit, waterfallConfiguration);
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        m1 m1Var;
        this.g.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (!this.c0 || (m1Var = this.U) == null) {
                w wVar = this.R;
                if (wVar != null) {
                    wVar.a(ironSourceBannerLayout);
                }
            } else {
                m1Var.a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        IronLog.INTERNAL.verbose("placementName = " + str);
        if (this.G) {
            this.g.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            n.a().a(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"));
            return;
        }
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            StringBuilder sb = new StringBuilder();
            sb.append("loadBanner can't be called - ");
            sb.append(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
            String string = sb.toString();
            this.g.log(IronSourceLogger.IronSourceTag.API, string, 3);
            n.a().a(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError(string));
            return;
        }
        if (!this.J) {
            this.g.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            n.a().a(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
            return;
        }
        if (ironSourceBannerLayout.getSize().getDescription().equals("CUSTOM") && (ironSourceBannerLayout.getSize().getWidth() <= 0 || ironSourceBannerLayout.getSize().getHeight() <= 0)) {
            this.g.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            n.a().a(IronSource.AD_UNIT.BANNER, ErrorBuilder.unsupportedBannerSize(""));
            return;
        }
        s.d dVarA = s.c().a();
        if (dVarA == s.d.INIT_FAILED) {
            this.g.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
            n.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(600, "Init() had failed"));
            return;
        }
        if (dVarA == s.d.INIT_IN_PROGRESS) {
            if (s.c().d()) {
                this.g.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                n.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(601, "Init() had failed"));
                return;
            } else {
                this.M = ironSourceBannerLayout;
                this.L = Boolean.TRUE;
                this.N = str;
                return;
            }
        }
        if (!A()) {
            this.g.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            n.a().a(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "the server response does not contain banner data"));
            return;
        }
        w wVar = this.R;
        if (wVar == null && this.U == null) {
            this.M = ironSourceBannerLayout;
            this.L = Boolean.TRUE;
            this.N = str;
        } else if (this.c0) {
            this.U.a(ironSourceBannerLayout, new Placement(n(str)));
        } else {
            wVar.a(ironSourceBannerLayout, n(str));
        }
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.B = ironSourceSegment;
        ac acVar = this.T;
        if (acVar != null) {
            acVar.a(ironSourceSegment);
        }
        l6 l6Var = this.P;
        if (l6Var != null) {
            l6Var.a(ironSourceSegment);
        }
        k8 k8Var = this.S;
        if (k8Var != null) {
            k8Var.a(ironSourceSegment);
        }
        y yVar = this.Q;
        if (yVar != null) {
            yVar.a(ironSourceSegment);
        }
        w wVar = this.R;
        if (wVar != null) {
            wVar.a(ironSourceSegment);
        }
        m1 m1Var = this.U;
        if (m1Var != null) {
            m1Var.a(ironSourceSegment);
        }
        AdQualityBridge adQualityBridge = this.n0;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(ironSourceSegment);
        }
        o8.i().a(this.B);
        dc.i().a(this.B);
        lb.P.a(this.B);
    }

    @Override // com.ironsource.o3.b
    public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.p0.a((s6<ISDemandOnlyInterstitialListener>) iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.o3.c
    public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.q0.a((s6<ISDemandOnlyRewardedVideoListener>) iSDemandOnlyRewardedVideoListener);
    }

    void a(h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String strB = dVar.getInstanceId();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strB);
        try {
        } catch (Throwable th) {
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strB, new IronSourceError(510, th.getMessage()));
        }
        if (!this.H) {
            ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strB, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
            return;
        }
        if (!this.E) {
            ironLog.error("Rewarded video was initialized in mediation mode");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strB, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
            return;
        }
        s.d dVarA = s.c().a();
        if (dVarA == s.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strB, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronSourceError ironSourceErrorC = dVar.c();
        if (ironSourceErrorC != null) {
            if (ironSourceErrorC.getErrorCode() == 1060) {
                b(81321, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
            }
            ironLog.error(ironSourceErrorC.toString());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strB, ironSourceErrorC);
            return;
        }
        e(dVar.getActivity());
        if (dVarA == s.d.INIT_IN_PROGRESS) {
            if (s.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strB, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.g0) {
                this.g0.put(strB, dVar);
            }
            if (TextUtils.isEmpty(dVar.getAdMarkup())) {
                return;
            }
            b(IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
            return;
        }
        if (!O()) {
            ironLog.error("No rewarded video configurations found");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strB, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        synchronized (this.g0) {
            k kVar = this.i0;
            if (kVar != null) {
                kVar.a(dVar);
                return;
            }
            this.g0.put(strB, dVar);
            if (!TextUtils.isEmpty(dVar.getAdMarkup())) {
                b(IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.getAdMarkup()), 1));
            }
            return;
        }
        IronLog.API.error(th.getMessage());
        iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strB, new IronSourceError(510, th.getMessage()));
    }

    @Override // com.json.b8
    public void a(ImpressionDataListener impressionDataListener) {
        if (b9.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            m9.b().b(impressionDataListener);
            l6 l6Var = this.P;
            if (l6Var != null) {
                l6Var.a(impressionDataListener);
            }
            y yVar = this.Q;
            if (yVar != null) {
                yVar.a(impressionDataListener);
            }
            w wVar = this.R;
            if (wVar != null) {
                wVar.a(impressionDataListener);
            }
            IronLog.API.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    @Override // com.json.z9
    public void a(LogListener logListener) {
        if (logListener == null) {
            this.g.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        this.i.a(logListener);
        this.g.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public void a(InterstitialListener interstitialListener) {
        this.g.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        this.h.a(interstitialListener);
        v6.a().a(interstitialListener);
    }

    public void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayInterstitialListener == null) {
            ironLog.info("ISListener is null");
        } else {
            ironLog.info();
        }
        v6.a().a(levelPlayInterstitialListener);
    }

    public void a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog ironLog = IronLog.API;
        if (levelPlayRewardedVideoListener == null) {
            ironLog.info("RVListener is null");
        } else {
            ironLog.info();
        }
        wb.a().a(levelPlayRewardedVideoListener);
    }

    public synchronized void a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (levelPlayRewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.H) {
            if (levelPlayRewardedVideoManualListener == null) {
                this.X = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.X = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        wb.a().a(levelPlayRewardedVideoManualListener);
    }

    @Override // com.json.ta
    public void a(OfferwallListener offerwallListener) {
        this.g.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        this.h.a(offerwallListener);
    }

    public void a(RewardedVideoListener rewardedVideoListener) {
        this.g.log(IronSourceLogger.IronSourceTag.API, rewardedVideoListener == null ? "setRewardedVideoListener(RVListener:null)" : "setRewardedVideoListener(RVListener)", 1);
        this.h.a(rewardedVideoListener);
        wb.a().a(rewardedVideoListener);
    }

    public synchronized void a(RewardedVideoManualListener rewardedVideoManualListener) {
        IronLog ironLog;
        String str;
        if (rewardedVideoManualListener == null) {
            IronLog.API.info("RVListener is null");
        } else {
            IronLog.API.info();
        }
        if (!this.H) {
            if (rewardedVideoManualListener == null) {
                this.X = false;
                ironLog = IronLog.API;
                str = "Disabling rewarded video manual mode";
            } else {
                this.X = true;
                ironLog = IronLog.API;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        this.h.a((RewardedVideoListener) rewardedVideoManualListener);
        wb.a().a(rewardedVideoManualListener);
    }

    void a(SegmentListener segmentListener) {
        w9 w9Var = this.h;
        if (w9Var != null) {
            w9Var.a(segmentListener);
            s.c().a(this.h);
        }
    }

    @Override // com.ironsource.o3.c
    public synchronized void a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = this.q0.a(str);
        try {
        } catch (Exception e) {
            IronLog.API.error(e.getMessage());
            if (iSDemandOnlyRewardedVideoListenerA != null) {
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e.getMessage()));
            }
        }
        if (!this.E) {
            ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
            iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        k kVar = this.i0;
        if (kVar != null) {
            kVar.b(str);
        } else {
            ironLog.error("Rewarded video was not initiated");
            iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was not initiated"));
        }
    }

    @Override // com.json.ta
    public void a(String str, String str2) {
    }

    public void a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String strCheckMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String strCheckMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (strCheckMetaDataKeyValidity.length() > 0) {
            ironLog.verbose(strCheckMetaDataKeyValidity);
            return;
        }
        if (strCheckMetaDataValueValidity.length() > 0) {
            ironLog.verbose(strCheckMetaDataValueValidity);
            return;
        }
        MetaData metaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = metaData.getMetaDataKey();
        List<String> metaDataValue = metaData.getMetaDataValue();
        if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            com.json.mediationsdk.c.b().a(metaDataKey, metaDataValue);
        } else if (H() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
            ironLog.error("setMetaData with key = " + metaDataKey + " must to be called before init");
        } else {
            m9.b().a(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> concurrentHashMapC = com.json.mediationsdk.c.b().c();
            concurrentHashMapC.putAll(m9.b().c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : concurrentHashMapC.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.l0.a(jSONObject);
        } catch (JSONException e) {
            IronLog.INTERNAL.error("got the following error " + e.getMessage());
            e.printStackTrace();
        }
        dc.i().a(new l4(H() ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
    }

    public void a(String str, JSONObject jSONObject) {
        if (b9.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && b9.a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.k0.a(str, jSONObject);
        }
    }

    @Override // com.json.za
    public void a(List<IronSource.AD_UNIT> list, boolean z, l2 l2Var) throws JSONException {
        IronLog.INTERNAL.verbose();
        try {
            this.i.a(l2Var.getApplicationConfigurations().g().d());
            this.u = list;
            this.t = true;
            this.g.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                dc.i().a(new l4(114, mediationAdditionalData));
            }
            int cmpId = l2Var.getApplicationConfigurations().e().getCmpId();
            if (cmpId >= 0) {
                r2 r2Var = new r2();
                r2Var.a(cmpId);
                r2Var.a(cmpId, this.l.i().c());
            }
            o8.i().h();
            dc.i().h();
            com.json.mediationsdk.c.b().b(q(), r());
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.y.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        b(ad_unit);
                    } else {
                        a(ad_unit, false);
                    }
                }
            }
            if (y() && Y()) {
                AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), q(), r(), new com.json.s(), this.l.b().getApplicationConfigurations().g().a());
                this.n0 = adQualityBridge;
                IronSourceSegment ironSourceSegment = this.B;
                if (ironSourceSegment != null) {
                    adQualityBridge.setSegment(ironSourceSegment);
                }
            }
            V();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.json.w8
    public void a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                this.g.log(IronSourceLogger.IronSourceTag.API, this.f1977a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                this.q = new HashMap(map);
            } catch (Exception e) {
                this.g.logException(IronSourceLogger.IronSourceTag.API, this.f1977a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    @Override // com.json.w8
    public void a(boolean z) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "setAdaptersDebug : " + z, 1);
        com.json.mediationsdk.c.b().a(z);
    }

    public IronSourceBannerLayout b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.g.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    com.json.mediationsdk.utils.c b(Context context, String str, c cVar) {
        synchronized (this.k) {
            com.json.mediationsdk.utils.c cVar2 = this.l;
            if (cVar2 != null) {
                return new com.json.mediationsdk.utils.c(cVar2);
            }
            com.json.mediationsdk.utils.c cVarA = a(context, str, cVar);
            if (cVarA == null || !cVarA.m()) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                cVarA = a(context, q());
                if (cVarA != null) {
                    IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(q(), str);
                    this.g.log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError.toString() + ": " + cVarA.toString(), 1);
                    dc.i().a(new l4(140, IronSourceUtils.getMediationAdditionalData(false)));
                }
            }
            if (cVarA != null) {
                this.l = cVarA;
                IronSourceUtils.saveLastResponse(context, cVarA.toString());
                b(this.l, context);
                o8.i().c(true);
                dc.i().c(true);
                lb.P.c(true);
            }
            return cVarA;
        }
    }

    @Override // com.json.w8
    public String b(Context context) {
        String strP = this.c.p(context);
        return !TextUtils.isEmpty(strP) ? strP : "";
    }

    HashSet<String> b(String str, String str2) {
        com.json.mediationsdk.utils.c cVar = this.l;
        return cVar == null ? new HashSet<>() : cVar.i().a(str, str2);
    }

    public List<NetworkSettings> b(ArrayList<String> arrayList) {
        return a(arrayList);
    }

    @Override // com.json.w8
    public void b() {
        this.q = null;
    }

    public void b(Activity activity) {
        try {
            this.g.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    @Override // com.ironsource.o3.c
    public synchronized void b(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.q0.a(str));
    }

    @Override // com.ironsource.o3.b
    public synchronized void b(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.INTERSTITIAL).a(true).a(str2).b(), this.p0.a(str));
    }

    public void b(IronSourceBannerLayout ironSourceBannerLayout) {
        a(ironSourceBannerLayout, "");
    }

    @Override // com.json.b8
    public void b(ImpressionDataListener impressionDataListener) {
        if (b9.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            m9.b().a(impressionDataListener);
            l6 l6Var = this.P;
            if (l6Var != null) {
                l6Var.b(impressionDataListener);
            }
            y yVar = this.Q;
            if (yVar != null) {
                yVar.b(impressionDataListener);
            }
            w wVar = this.R;
            if (wVar != null) {
                wVar.b(impressionDataListener);
            }
            IronLog.API.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    @Override // com.ironsource.o3.b
    public void b(String str) {
        this.g.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = this.p0.a(str);
        try {
            if (!this.F) {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            f fVar = this.h0;
            if (fVar != null) {
                fVar.a(str);
            } else {
                IronLog.API.error("Interstitial was not initiated");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was not initiated"));
            }
        } catch (Exception e) {
            IronLog.API.error(e.getMessage());
            if (iSDemandOnlyInterstitialListenerA != null) {
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    public void b(String str, JSONObject jSONObject) {
        String str2 = "networkKey = " + str;
        if (jSONObject != null) {
            str2 = str2 + " networkData = " + jSONObject;
        }
        IronLog.API.verbose(str2);
        com.json.mediationsdk.c.b().a(str, jSONObject);
    }

    public void b(boolean z) {
        this.O = Boolean.valueOf(z);
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "setConsent : " + z, 1);
        com.json.mediationsdk.c.b().b(z);
        if (this.e != null) {
            this.g.log(IronSourceLogger.IronSourceTag.ADAPTER_API, "Offerwall | setConsent(consent:" + z + ")", 1);
            this.e.setConsent(z);
        }
        this.l0.a(z);
        dc.i().a(new l4(z ? 40 : 41, IronSourceUtils.getMediationAdditionalData(false)));
    }

    @Override // com.json.ta
    public void c() {
        try {
            this.g.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!L()) {
                this.h.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            va vaVarA = this.l.b().getOfferwallConfigurations().a();
            if (vaVarA != null) {
                j(vaVarA.getPlacementName());
            }
        } catch (Exception e) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e);
            this.h.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public void c(Activity activity) {
        IronSourceLoggerManager ironSourceLoggerManager = this.g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (this.F) {
                this.g.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                v6.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else {
                if (!D()) {
                    v6.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
                    return;
                }
                InterstitialPlacement interstitialPlacementM = m();
                if (interstitialPlacementM != null) {
                    c(activity, interstitialPlacementM.getPlacementName());
                } else {
                    v6.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), (AdInfo) null);
                }
            }
        } catch (Exception e) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e);
            v6.a().a(new IronSourceError(510, e.getMessage()), (AdInfo) null);
        }
    }

    public void c(Activity activity, String str) {
        String str2 = "showInterstitial(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.F) {
                this.g.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                v6.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (D()) {
                d(activity, str);
            } else {
                v6.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
            }
        } catch (Exception e) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            v6.a().a(new IronSourceError(510, e.getMessage()), (AdInfo) null);
        }
    }

    public void c(Context context) {
        zc zcVar = zc.f2479a;
        zcVar.b();
        if (!this.t) {
            zcVar.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!b(this.l)) {
            zcVar.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error("TestSuite cannot be launched, Please contact your account manager to enable it");
            return;
        }
        if (!IronSourceUtils.isNetworkConnected(context)) {
            zcVar.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
            return;
        }
        k8 k8Var = this.S;
        if (k8Var != null) {
            k8Var.F();
        }
        ac acVar = this.T;
        if (acVar != null) {
            acVar.F();
        }
        m1 m1Var = this.U;
        if (m1Var != null) {
            m1Var.F();
            this.U.K();
        }
        new ad().a(context, q(), this.l.g(), IronSourceUtils.getSDKVersion(), this.l.b().getTestSuiteSettings().b(), j(), this.X);
        this.m0 = true;
        zcVar.c();
    }

    @Override // com.ironsource.o3.a
    public void c(String str) {
        this.g.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.json.mediationsdk.demandOnly.c cVar = this.j0;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    @Override // com.json.w8
    public void d() {
        this.g.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        this.h.a((RewardedVideoListener) null);
        wb.a().a((RewardedVideoListener) null);
        wb.a().a((LevelPlayRewardedVideoBaseListener) null);
    }

    public void d(Activity activity) {
        if (!N()) {
            wb.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            this.g.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement placementN = n();
        if (placementN != null) {
            f(activity, placementN.getPlacementName());
            return;
        }
        this.g.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
        wb.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
    }

    @Override // com.json.za
    public void d(String str) {
        try {
            this.g.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.h != null) {
                Iterator<IronSource.AD_UNIT> it = this.y.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.json.w8
    public void e() {
        this.g.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        this.h.a((OfferwallListener) null);
    }

    @Override // com.json.w8
    public boolean e(String str) {
        try {
            String str2 = this.f1977a + ":setDynamicUserId(dynamicUserId:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.g;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            k2 k2Var = new k2();
            a(str, k2Var);
            if (!k2Var.b()) {
                IronSourceLoggerManager.getLogger().log(ironSourceTag, k2Var.a().toString(), 2);
                return false;
            }
            this.p = str;
            dc.i().a(new l4(52, IronSourceUtils.getJsonForUserId(true)));
            return true;
        } catch (Exception e) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, this.f1977a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    @Override // com.json.w8
    public void f() {
        this.g.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        this.h.a((InterstitialListener) null);
        v6.a().a((InterstitialListener) null);
        v6.a().a((LevelPlayInterstitialListener) null);
    }

    public void f(Activity activity, String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.E) {
                this.g.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                wb.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (N()) {
                e(activity, str);
            } else {
                wb.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            }
        } catch (Exception e) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            wb.a().a(new IronSourceError(510, e.getMessage()), (AdInfo) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // com.ironsource.o3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean f(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.demandOnly.f r0 = r1.h0     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Ld
            boolean r2 = r0.b(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            monitor-exit(r1)
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.p.f(java.lang.String):boolean");
    }

    @Override // com.json.w8
    public InterstitialPlacement g(String str) {
        try {
            InterstitialPlacement interstitialPlacementP = p(str);
            if (interstitialPlacementP == null) {
                try {
                    this.g.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    interstitialPlacementP = m();
                } catch (Exception unused) {
                    return interstitialPlacementP;
                }
            }
            this.g.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + interstitialPlacementP, 1);
            return interstitialPlacementP;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.json.ta
    public void getOfferwallCredits() {
        this.g.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            this.f.getOfferwallCredits();
        } catch (Throwable th) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String h() {
        /*
            r3 = this;
            boolean r0 = r3.K
            if (r0 != 0) goto L7
            java.lang.String r0 = "init() must be called first"
            goto L2c
        L7:
            com.ironsource.mediationsdk.s r0 = com.json.mediationsdk.s.c()
            int[] r1 = com.ironsource.mediationsdk.p.b.b
            com.ironsource.mediationsdk.s$d r2 = r0.a()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L2a
            r2 = 2
            if (r1 == r2) goto L20
            java.lang.String r0 = ""
            goto L2c
        L20:
            boolean r0 = r0.d()
            if (r0 == 0) goto L27
            goto L2a
        L27:
            java.lang.String r0 = "init() not finished yet"
            goto L2c
        L2a:
            java.lang.String r0 = "init() had failed"
        L2c:
            boolean r1 = r3.J()
            if (r1 != 0) goto L3a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3a
            java.lang.String r0 = "No Native Ad configurations found"
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.p.h():java.lang.String");
    }

    @Override // com.json.w8
    public void h(String str) {
        try {
            String str2 = this.f1977a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.g;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (a(str, 1, 64) && y(str)) {
                this.r = str;
                this.l0.d(str);
            } else {
                this.g.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            }
        } catch (Exception e) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, this.f1977a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    public ja i() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.l.h().c());
        if (listA.size() > 0) {
            return new ja(listA, this.l.b().getNativeAdConfigurations(), IronSourceUtils.getUserIdForNetworks(), m9.b(), this.B, this.l.k());
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a(IronSourceConstants.TROUBLESHOOTING_NT_INIT_FAILED, mediationAdditionalData);
        return null;
    }

    @Override // com.json.w8
    public Placement i(String str) {
        try {
            Placement placementT = t(str);
            if (placementT == null) {
                try {
                    this.g.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    placementT = n();
                } catch (Exception unused) {
                    return placementT;
                }
            }
            this.g.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + placementT, 1);
            return placementT;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.json.ta
    public boolean isOfferwallAvailable() {
        try {
            v vVar = this.f;
            if (vVar != null) {
                return vVar.isOfferwallAvailable();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    Boolean j() {
        return this.O;
    }

    @Override // com.json.ta
    public void j(String str) {
        String str2 = "showOfferwall(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.g;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (!L()) {
                this.h.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            va vaVarA = this.l.b().getOfferwallConfigurations().a(str);
            if (vaVarA == null) {
                this.g.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                vaVarA = this.l.b().getOfferwallConfigurations().a();
                if (vaVarA == null) {
                    this.g.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f.j(vaVarA.getPlacementName());
        } catch (Exception e) {
            this.g.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.h.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public com.json.mediationsdk.utils.c k() {
        return this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // com.ironsource.o3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean k(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.demandOnly.k r0 = r1.i0     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Ld
            boolean r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            monitor-exit(r1)
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.p.k(java.lang.String):boolean");
    }

    public r1 l(String str) {
        return n(str);
    }

    public InterstitialPlacement m(String str) {
        InterstitialPlacement interstitialPlacementP = p(str);
        return interstitialPlacementP == null ? m() : interstitialPlacementP;
    }

    public String o() {
        return this.p;
    }

    public la q(String str) {
        la laVarA;
        fa faVarE = this.l.b().getNativeAdConfigurations();
        if (faVarE == null) {
            return null;
        }
        return (TextUtils.isEmpty(str) || (laVarA = faVarE.a(str)) == null) ? faVarE.e() : laVarA;
    }

    public String q() {
        return this.m;
    }

    synchronized AbstractAdapter r(String str) {
        try {
            AbstractAdapter abstractAdapter = this.e;
            if (abstractAdapter != null && abstractAdapter.getProviderName().equals(str)) {
                return this.e;
            }
        } catch (Exception e) {
            this.g.log(IronSourceLogger.IronSourceTag.INTERNAL, "getOfferwallAdapter exception: " + e, 1);
        }
        return null;
    }

    public String r() {
        return this.n;
    }

    public String s() {
        return this.r;
    }

    public Map<String, String> t() {
        return this.q;
    }

    public IronSourceSegment u() {
        return this.B;
    }

    boolean u(String str) {
        if (!z()) {
            return false;
        }
        r1 r1VarA = null;
        try {
            r1VarA = this.l.b().getBannerConfigurations().a(str);
            if (r1VarA == null && (r1VarA = this.l.b().getBannerConfigurations().j()) == null) {
                this.g.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (r1VarA == null) {
            return false;
        }
        return com.json.mediationsdk.utils.b.d(ContextProvider.getInstance().getApplicationContext(), r1VarA.getPlacementName());
    }

    public String v() {
        return this.v;
    }

    boolean v(String str) throws JSONException {
        if (this.F) {
            return false;
        }
        boolean z = o(str) != b.EnumC0239b.NOT_CAPPED;
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.F, true, 1);
            try {
                mediationAdditionalData.put("placement", str);
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            } catch (Exception unused) {
            }
            o8.i().a(new l4(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z;
    }

    boolean w(String str) throws JSONException {
        int i;
        b.EnumC0239b enumC0239bS = s(str);
        boolean z = true;
        if (enumC0239bS == null || ((i = b.c[enumC0239bS.ordinal()]) != 1 && i != 2 && i != 3)) {
            z = false;
        }
        a(z, str);
        return z;
    }

    void x(String str) {
        IronLog.API.verbose("userId = " + str);
        this.n = str;
        dc.i().a(new l4(52, IronSourceUtils.getJsonForUserId(false)));
        AdQualityBridge adQualityBridge = this.n0;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }
}
