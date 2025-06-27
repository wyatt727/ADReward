package com.json.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.json.InitConfig;
import com.json.TestSuiteSettings;
import com.json.b6;
import com.json.environment.StringUtils;
import com.json.i5;
import com.json.l2;
import com.json.la;
import com.json.m4;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.d;
import com.json.mediationsdk.model.InterstitialPlacement;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.model.Placement;
import com.json.ob;
import com.json.r;
import com.json.r1;
import com.json.t2;
import com.json.ub;
import com.json.va;
import com.json.vb;
import com.my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {
    public static final String W1 = "appKey";
    public static final String X1 = "userId";
    public static final String Y1 = "response";
    private final boolean A;
    private final String A0;
    private final String A1;
    private final long B;
    private final String B0;
    private final String B1;
    private final boolean C;
    private final String C0;
    private final String C1;
    private final boolean D;
    private final String D0;
    private final String D1;
    private final int E;
    private final String E0;
    private final String E1;
    private final int F;
    private final String F0;
    private final String F1;
    private final int G;
    private final String G0;
    private final String G1;
    private final int H;
    private final String H0;
    private final String H1;
    private final boolean I;
    private final String I0;
    private final String I1;
    private final String J;
    private final String J0;
    private final String J1;
    private final String K;
    private final String K0;
    private final String K1;
    private final String L;
    private final String L0;
    private final String L1;
    private final String M;
    private final String M0;
    private final String M1;
    private final String N;
    private final String N0;
    private final String N1;
    private final String O;
    private final String O0;
    private ub O1;
    private final String P;
    private final String P0;
    private vb P1;
    private final String Q;
    private final String Q0;
    private l2 Q1;
    private final String R;
    private final String R0;
    private String R1;
    private final String S;
    private final String S0;
    private String S1;
    private final String T;
    private final String T0;
    private JSONObject T1;
    private final String U;
    private final String U0;
    private Context U1;
    private final String V;
    private final String V0;
    private a V1;
    private final String W;
    private final String W0;
    private final String X;
    private final String X0;
    private final String Y;
    private final String Y0;
    private final String Z;
    private final String Z0;

    /* renamed from: a, reason: collision with root package name */
    private final String f2005a;
    private final String a0;
    private final String a1;
    private final int b;
    private final String b0;
    private final String b1;
    private final boolean c;
    private final String c0;
    private final String c1;
    private final boolean d;
    private final String d0;
    private final String d1;
    private final boolean e;
    private final String e0;
    private final String e1;
    private final boolean f;
    private final String f0;
    private final String f1;
    private final int g;
    private final String g0;
    private final String g1;
    private final int h;
    private final String h0;
    private final String h1;
    private final int i;
    private final String i0;
    private final String i1;
    private final int j;
    private final String j0;
    private final String j1;
    private final boolean k;
    private final String k0;
    private final String k1;
    private final boolean l;
    private final String l0;
    private final String l1;
    private final boolean m;
    private final String m0;
    private final String m1;
    private final boolean n;
    private final String n0;
    private final String n1;
    private final int o;
    private final String o0;
    private final String o1;
    private final int p;
    private final String p0;
    private final String p1;
    private final int q;
    private final String q0;
    private final String q1;
    private final int r;
    private final String r0;
    private final String r1;
    private final int s;
    private final String s0;
    private final String s1;
    private final int t;
    private final String t0;
    private final String t1;
    private final int u;
    private final String u0;
    private final String u1;
    private final int v;
    private final String v0;
    private final String v1;
    private final int w;
    private final String w0;
    private final String w1;
    private final int x;
    private final String x0;
    private final String x1;
    private final int y;
    private final String y0;
    private final String y1;
    private final long z;
    private final String z0;
    private final String z1;

    public enum a {
        NOT_SET,
        CACHE,
        SERVER
    }

    public c(Context context, String str, String str2, String str3) {
        this.f2005a = "error";
        this.b = 3;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = true;
        this.g = 2;
        this.h = 2;
        this.i = 1;
        this.j = 1;
        this.k = true;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = 60;
        this.p = 10000;
        this.q = 10000;
        this.r = -1;
        this.s = 5000;
        this.t = 3;
        this.u = 3;
        this.v = 3;
        this.w = 0;
        this.x = 2;
        this.y = 15;
        this.z = 10000L;
        this.A = false;
        this.B = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
        this.C = false;
        this.D = false;
        this.E = 30000;
        this.F = -1;
        this.G = 5000;
        this.H = 1;
        this.I = false;
        this.J = "providerOrder";
        this.K = "providerSettings";
        this.L = d.j;
        this.M = "genericParams";
        this.N = "adUnits";
        this.O = "providerLoadName";
        this.P = "application";
        this.Q = "rewardedVideo";
        this.R = "interstitial";
        this.S = "offerwall";
        this.T = AdFormat.BANNER;
        this.U = "nativeAd";
        this.V = "integration";
        this.W = "loggers";
        this.X = "segment";
        this.Y = "events";
        this.Z = "crashReporter";
        this.a0 = "token";
        this.b0 = "external";
        this.c0 = "mediationTypes";
        this.d0 = "providerDefaultInstance";
        this.e0 = "testSuite";
        this.f0 = "controllerUrl";
        this.g0 = "AdQuality";
        this.h0 = "initSDK";
        this.i0 = d.g;
        this.j0 = "collectBiddingDataTimeout";
        this.k0 = "collectBiddingDataAsyncEnabled";
        this.l0 = "providers";
        this.m0 = "parallelInit";
        this.n0 = "waitUntilAllProvidersFinishInit";
        this.o0 = "threadPerManager";
        this.p0 = "sharedManagersThread";
        this.q0 = d.o0;
        this.r0 = d.p0;
        this.s0 = "adapterTimeOutInSeconds";
        this.t0 = "atim";
        this.u0 = "bannerInterval";
        this.v0 = "isOneFlow";
        this.w0 = "expiredDurationInMinutes";
        this.x0 = "server";
        this.y0 = "publisher";
        this.z0 = com.json.mediationsdk.logger.a.c;
        this.A0 = "sendUltraEvents";
        this.B0 = "sendEventsToggle";
        this.C0 = "eventsCompression";
        this.D0 = "eventsCompressionLevel";
        this.E0 = "serverEventsURL";
        this.F0 = "serverEventsType";
        this.G0 = "backupThreshold";
        this.H0 = "maxNumberOfEvents";
        this.I0 = "maxEventsPerBatch";
        this.J0 = "optOut";
        this.K0 = "optIn";
        this.L0 = "triggerEvents";
        this.M0 = "nonConnectivityEvents";
        this.N0 = "shouldSendPublisherLogsOnUIThread";
        this.O0 = "pixel";
        this.P0 = "pixelEventsUrl";
        this.Q0 = "pixelEventsEnabled";
        this.R0 = "placements";
        this.S0 = t2.k;
        this.T0 = "placementName";
        this.U0 = "delivery";
        this.V0 = "isDefault";
        this.W0 = "capping";
        this.X0 = "pacing";
        this.Y0 = m4.r;
        this.Z0 = "maxImpressions";
        this.a1 = "numOfSeconds";
        this.b1 = "unit";
        this.c1 = "virtualItemName";
        this.d1 = "virtualItemCount";
        this.e1 = b6.f1706a;
        this.f1 = i5.r0;
        this.g1 = "delayLoadFailure";
        this.h1 = "keysToInclude";
        this.i1 = "reporterURL";
        this.j1 = "reporterKeyword";
        this.k1 = "includeANR";
        this.l1 = "timeout";
        this.m1 = "setIgnoreDebugger";
        this.n1 = "adSourceName";
        this.o1 = IronSourceConstants.EVENTS_SUB_PROVIDER_ID;
        this.p1 = "mpis";
        this.q1 = "auction";
        this.r1 = "auctionData";
        this.s1 = "auctioneerURL";
        this.t1 = "extAuctioneerURL";
        this.u1 = "objectPerWaterfall";
        this.v1 = "minTimeBeforeFirstAuction";
        this.w1 = "timeToWaitBeforeAuction";
        this.x1 = "timeToWaitBeforeLoad";
        this.y1 = "auctionRetryInterval";
        this.z1 = "isLoadWhileShow";
        this.A1 = IronSourceConstants.AUCTION_TRIALS;
        this.B1 = "auctionTimeout";
        this.C1 = "auctionSavedHistory";
        this.D1 = "disableLoadWhileShowSupportFor";
        this.E1 = "timeToDeleteOldWaterfallAfterAuction";
        this.F1 = "compressAuctionRequest";
        this.G1 = "compressAuctionResponse";
        this.H1 = "encryptionVersion";
        this.I1 = "shouldSendBannerBURLFromImpression";
        this.J1 = "optInKeys";
        this.K1 = "tokenGenericParams";
        this.L1 = "oneToken";
        this.M1 = "compressToken";
        this.N1 = "compressExternalToken";
        this.V1 = a.NOT_SET;
        this.U1 = context;
        try {
            this.T1 = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            p();
            n();
            o();
            this.R1 = TextUtils.isEmpty(str) ? "" : str;
            this.S1 = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e) {
            e.printStackTrace();
            a();
        }
    }

    public c(c cVar) {
        this.f2005a = "error";
        this.b = 3;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = true;
        this.g = 2;
        this.h = 2;
        this.i = 1;
        this.j = 1;
        this.k = true;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = 60;
        this.p = 10000;
        this.q = 10000;
        this.r = -1;
        this.s = 5000;
        this.t = 3;
        this.u = 3;
        this.v = 3;
        this.w = 0;
        this.x = 2;
        this.y = 15;
        this.z = 10000L;
        this.A = false;
        this.B = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
        this.C = false;
        this.D = false;
        this.E = 30000;
        this.F = -1;
        this.G = 5000;
        this.H = 1;
        this.I = false;
        this.J = "providerOrder";
        this.K = "providerSettings";
        this.L = d.j;
        this.M = "genericParams";
        this.N = "adUnits";
        this.O = "providerLoadName";
        this.P = "application";
        this.Q = "rewardedVideo";
        this.R = "interstitial";
        this.S = "offerwall";
        this.T = AdFormat.BANNER;
        this.U = "nativeAd";
        this.V = "integration";
        this.W = "loggers";
        this.X = "segment";
        this.Y = "events";
        this.Z = "crashReporter";
        this.a0 = "token";
        this.b0 = "external";
        this.c0 = "mediationTypes";
        this.d0 = "providerDefaultInstance";
        this.e0 = "testSuite";
        this.f0 = "controllerUrl";
        this.g0 = "AdQuality";
        this.h0 = "initSDK";
        this.i0 = d.g;
        this.j0 = "collectBiddingDataTimeout";
        this.k0 = "collectBiddingDataAsyncEnabled";
        this.l0 = "providers";
        this.m0 = "parallelInit";
        this.n0 = "waitUntilAllProvidersFinishInit";
        this.o0 = "threadPerManager";
        this.p0 = "sharedManagersThread";
        this.q0 = d.o0;
        this.r0 = d.p0;
        this.s0 = "adapterTimeOutInSeconds";
        this.t0 = "atim";
        this.u0 = "bannerInterval";
        this.v0 = "isOneFlow";
        this.w0 = "expiredDurationInMinutes";
        this.x0 = "server";
        this.y0 = "publisher";
        this.z0 = com.json.mediationsdk.logger.a.c;
        this.A0 = "sendUltraEvents";
        this.B0 = "sendEventsToggle";
        this.C0 = "eventsCompression";
        this.D0 = "eventsCompressionLevel";
        this.E0 = "serverEventsURL";
        this.F0 = "serverEventsType";
        this.G0 = "backupThreshold";
        this.H0 = "maxNumberOfEvents";
        this.I0 = "maxEventsPerBatch";
        this.J0 = "optOut";
        this.K0 = "optIn";
        this.L0 = "triggerEvents";
        this.M0 = "nonConnectivityEvents";
        this.N0 = "shouldSendPublisherLogsOnUIThread";
        this.O0 = "pixel";
        this.P0 = "pixelEventsUrl";
        this.Q0 = "pixelEventsEnabled";
        this.R0 = "placements";
        this.S0 = t2.k;
        this.T0 = "placementName";
        this.U0 = "delivery";
        this.V0 = "isDefault";
        this.W0 = "capping";
        this.X0 = "pacing";
        this.Y0 = m4.r;
        this.Z0 = "maxImpressions";
        this.a1 = "numOfSeconds";
        this.b1 = "unit";
        this.c1 = "virtualItemName";
        this.d1 = "virtualItemCount";
        this.e1 = b6.f1706a;
        this.f1 = i5.r0;
        this.g1 = "delayLoadFailure";
        this.h1 = "keysToInclude";
        this.i1 = "reporterURL";
        this.j1 = "reporterKeyword";
        this.k1 = "includeANR";
        this.l1 = "timeout";
        this.m1 = "setIgnoreDebugger";
        this.n1 = "adSourceName";
        this.o1 = IronSourceConstants.EVENTS_SUB_PROVIDER_ID;
        this.p1 = "mpis";
        this.q1 = "auction";
        this.r1 = "auctionData";
        this.s1 = "auctioneerURL";
        this.t1 = "extAuctioneerURL";
        this.u1 = "objectPerWaterfall";
        this.v1 = "minTimeBeforeFirstAuction";
        this.w1 = "timeToWaitBeforeAuction";
        this.x1 = "timeToWaitBeforeLoad";
        this.y1 = "auctionRetryInterval";
        this.z1 = "isLoadWhileShow";
        this.A1 = IronSourceConstants.AUCTION_TRIALS;
        this.B1 = "auctionTimeout";
        this.C1 = "auctionSavedHistory";
        this.D1 = "disableLoadWhileShowSupportFor";
        this.E1 = "timeToDeleteOldWaterfallAfterAuction";
        this.F1 = "compressAuctionRequest";
        this.G1 = "compressAuctionResponse";
        this.H1 = "encryptionVersion";
        this.I1 = "shouldSendBannerBURLFromImpression";
        this.J1 = "optInKeys";
        this.K1 = "tokenGenericParams";
        this.L1 = "oneToken";
        this.M1 = "compressToken";
        this.N1 = "compressExternalToken";
        this.V1 = a.NOT_SET;
        try {
            this.U1 = cVar.c();
            this.T1 = new JSONObject(cVar.T1.toString());
            this.R1 = cVar.R1;
            this.S1 = cVar.S1;
            this.O1 = cVar.h();
            this.P1 = cVar.i();
            this.Q1 = cVar.b();
            this.V1 = cVar.f();
        } catch (Exception unused) {
            a();
        }
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int iOptInt = 0;
        if (jSONObject.has(str)) {
            iOptInt = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            iOptInt = jSONObject2.optInt(str, 0);
        }
        return iOptInt == 0 ? i : iOptInt;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        long jOptLong = jSONObject.has(str) ? jSONObject.optLong(str, 0L) : jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        return jOptLong == 0 ? j : jOptLong;
    }

    public static a a(c cVar) {
        return cVar != null ? cVar.f() : a.NOT_SET;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r7
      0x0036: PHI (r7v3 com.ironsource.pb) = (r7v1 com.ironsource.pb), (r7v2 com.ironsource.pb) binds: [B:10:0x0034, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.json.ob a(org.json.JSONObject r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            com.ironsource.ob$b r1 = new com.ironsource.ob$b
            r1.<init>()
            java.lang.String r2 = "delivery"
            r3 = 1
            boolean r2 = r10.optBoolean(r2, r3)
            r1.a(r2)
            java.lang.String r2 = "capping"
            org.json.JSONObject r2 = r10.optJSONObject(r2)
            java.lang.String r4 = "enabled"
            r5 = 0
            if (r2 == 0) goto L59
            java.lang.String r6 = "unit"
            java.lang.String r6 = r2.optString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L45
            com.ironsource.pb r7 = com.json.pb.PER_DAY
            java.lang.String r8 = r7.toString()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L38
        L36:
            r0 = r7
            goto L45
        L38:
            com.ironsource.pb r7 = com.json.pb.PER_HOUR
            java.lang.String r8 = r7.toString()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L45
            goto L36
        L45:
            java.lang.String r6 = "maxImpressions"
            int r6 = r2.optInt(r6, r5)
            boolean r2 = r2.optBoolean(r4, r5)
            if (r2 == 0) goto L55
            if (r6 <= 0) goto L55
            r2 = r3
            goto L56
        L55:
            r2 = r5
        L56:
            r1.a(r2, r0, r6)
        L59:
            java.lang.String r0 = "pacing"
            org.json.JSONObject r10 = r10.optJSONObject(r0)
            if (r10 == 0) goto L74
            java.lang.String r0 = "numOfSeconds"
            int r0 = r10.optInt(r0, r5)
            boolean r10 = r10.optBoolean(r4, r5)
            if (r10 == 0) goto L70
            if (r0 <= 0) goto L70
            goto L71
        L70:
            r3 = r5
        L71:
            r1.a(r3, r0)
        L74:
            com.ironsource.ob r10 = r1.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.utils.c.a(org.json.JSONObject):com.ironsource.ob");
    }

    private void a() {
        this.T1 = new JSONObject();
        this.R1 = "";
        this.S1 = "";
        this.O1 = new ub();
        this.P1 = vb.b();
        this.Q1 = new l2.Builder().a();
    }

    private boolean a(String str) {
        String lowerCase = StringUtils.toLowerCase(str);
        return this.P1.a("Mediation") && (StringUtils.toLowerCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME).equals(lowerCase) || StringUtils.toLowerCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME).equals(lowerCase));
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z) : z;
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArrayOptJSONArray.length()];
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            iArr[i] = jSONArrayOptJSONArray.optInt(i);
        }
        return iArr;
    }

    public static d b(c cVar) {
        if (cVar == null || !cVar.m()) {
            return d.a();
        }
        d dVarJ = cVar.b().getApplicationConfigurations().j();
        if (dVarJ.f()) {
            return dVarJ;
        }
        dVarJ.a(cVar.i().b(IronSourceConstants.IRONSOURCE_CONFIG_NAME));
        return dVarJ;
    }

    private r b(JSONObject jSONObject) {
        r rVar = new r();
        JSONObject jSONObjectB = b(jSONObject, "AdQuality");
        if (jSONObjectB != null) {
            rVar.a(jSONObjectB.optBoolean("initSDK"));
        }
        return rVar;
    }

    private JSONObject b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private Context c() {
        return this.U1;
    }

    private r1 c(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(t2.k, -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean("isDefault", false);
            ob obVarA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                r1 r1Var = new r1(iOptInt, strOptString, zOptBoolean, obVarA);
                if (obVarA == null) {
                    return r1Var;
                }
                b.a(this.U1, r1Var);
                return r1Var;
            }
        }
        return null;
    }

    private JSONObject c(JSONObject jSONObject, String str) {
        JSONObject jSONObjectB = b(jSONObject, str);
        return jSONObjectB != null ? jSONObjectB : new JSONObject();
    }

    private InterstitialPlacement d(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(t2.k, -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean("isDefault", false);
            ob obVarA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                InterstitialPlacement interstitialPlacement = new InterstitialPlacement(iOptInt, strOptString, zOptBoolean, obVarA);
                if (obVarA == null) {
                    return interstitialPlacement;
                }
                b.a(this.U1, interstitialPlacement);
                return interstitialPlacement;
            }
        }
        return null;
    }

    private la e(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(t2.k, -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean("isDefault", false);
            ob obVarA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                la laVar = new la(iOptInt, strOptString, zOptBoolean, obVarA);
                if (obVarA == null) {
                    return laVar;
                }
                b.a(this.U1, laVar);
                return laVar;
            }
        }
        return null;
    }

    private va f(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(t2.k, -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean("isDefault", false);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                return new va(iOptInt, strOptString, zOptBoolean);
            }
        }
        return null;
    }

    private Placement g(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(t2.k, -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean("isDefault", false);
            String strOptString2 = jSONObject.optString("virtualItemName", "");
            int iOptInt2 = jSONObject.optInt("virtualItemCount", -1);
            ob obVarA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && iOptInt2 > 0) {
                Placement placement = new Placement(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, obVarA);
                if (obVarA == null) {
                    return placement;
                }
                b.a(this.U1, placement);
                return placement;
            }
        }
        return null;
    }

    private TestSuiteSettings h(JSONObject jSONObject) {
        TestSuiteSettings testSuiteSettings = new TestSuiteSettings();
        JSONObject jSONObjectB = b(jSONObject, "testSuite");
        if (jSONObjectB != null) {
            testSuiteSettings.b(jSONObjectB.optString("controllerUrl"));
        }
        return testSuiteSettings;
    }

    private boolean j() {
        JSONObject jSONObjectB;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectB2 = b(this.T1, "providerOrder");
        JSONArray jSONArrayNames = jSONObjectB2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectB3 = b(b(this.T1, d.j), "adUnits");
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            String strOptString = jSONArrayNames.optString(i);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectB2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectB = b(jSONObjectB3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectB.optJSONArray("placements")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0968  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n() {
        /*
            Method dump skipped, instructions count: 3230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.utils.c.n():void");
    }

    private void o() {
        try {
            JSONObject jSONObjectB = b(this.T1, "providerOrder");
            JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray("rewardedVideo");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectB.optJSONArray("interstitial");
            JSONArray jSONArrayOptJSONArray3 = jSONObjectB.optJSONArray(AdFormat.BANNER);
            JSONArray jSONArrayOptJSONArray4 = jSONObjectB.optJSONArray("nativeAd");
            this.O1 = new ub();
            if (jSONArrayOptJSONArray != null && b() != null && b().getRewardedVideoConfigurations() != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    this.O1.d(strOptString);
                    NetworkSettings networkSettingsB = vb.b().b(strOptString);
                    if (networkSettingsB != null) {
                        networkSettingsB.setRewardedVideoPriority(i);
                    }
                }
            }
            if (jSONArrayOptJSONArray2 != null && b() != null && b().getInterstitialConfigurations() != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    String strOptString2 = jSONArrayOptJSONArray2.optString(i2);
                    this.O1.b(strOptString2);
                    NetworkSettings networkSettingsB2 = vb.b().b(strOptString2);
                    if (networkSettingsB2 != null) {
                        networkSettingsB2.setInterstitialPriority(i2);
                    }
                }
            }
            if (jSONArrayOptJSONArray3 != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                    String strOptString3 = jSONArrayOptJSONArray3.optString(i3);
                    this.O1.a(strOptString3);
                    NetworkSettings networkSettingsB3 = vb.b().b(strOptString3);
                    if (networkSettingsB3 != null) {
                        networkSettingsB3.setBannerPriority(i3);
                    }
                }
            }
            if (jSONArrayOptJSONArray4 != null) {
                for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                    String strOptString4 = jSONArrayOptJSONArray4.optString(i4);
                    this.O1.c(strOptString4);
                    NetworkSettings networkSettingsB4 = vb.b().b(strOptString4);
                    if (networkSettingsB4 != null) {
                        networkSettingsB4.setNativeAdPriority(i4);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void p() {
        JSONObject jSONObject;
        Iterator<String> it;
        c cVar;
        NetworkSettings networkSettings;
        c cVar2 = this;
        try {
            cVar2.P1 = vb.b();
            JSONObject jSONObjectB = cVar2.b(cVar2.T1, "providerSettings");
            Iterator<String> itKeys = jSONObjectB.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("mpis", false);
                    String strOptString = jSONObjectOptJSONObject.optString(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, "0");
                    String strOptString2 = jSONObjectOptJSONObject.optString("adSourceName", null);
                    String strOptString3 = jSONObjectOptJSONObject.optString("providerLoadName", next);
                    String strOptString4 = jSONObjectOptJSONObject.optString("providerDefaultInstance", strOptString3);
                    JSONObject jSONObjectB2 = cVar2.b(jSONObjectOptJSONObject, "adUnits");
                    JSONObject jSONObjectB3 = cVar2.b(jSONObjectOptJSONObject, "application");
                    JSONObject jSONObjectB4 = cVar2.b(jSONObjectB2, "rewardedVideo");
                    JSONObject jSONObjectB5 = cVar2.b(jSONObjectB2, "interstitial");
                    JSONObject jSONObjectB6 = cVar2.b(jSONObjectB2, AdFormat.BANNER);
                    JSONObject jSONObjectB7 = cVar2.b(jSONObjectB2, "nativeAd");
                    JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(jSONObjectB4, jSONObjectB3);
                    JSONObject jSONObjectMergeJsons2 = IronSourceUtils.mergeJsons(jSONObjectB5, jSONObjectB3);
                    JSONObject jSONObjectMergeJsons3 = IronSourceUtils.mergeJsons(jSONObjectB6, jSONObjectB3);
                    JSONObject jSONObjectMergeJsons4 = IronSourceUtils.mergeJsons(jSONObjectB7, jSONObjectB3);
                    if (cVar2.P1.a(next)) {
                        NetworkSettings networkSettingsB = cVar2.P1.b(next);
                        JSONObject rewardedVideoSettings = networkSettingsB.getRewardedVideoSettings();
                        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
                        JSONObject bannerSettings = networkSettingsB.getBannerSettings();
                        JSONObject nativeAdSettings = networkSettingsB.getNativeAdSettings();
                        networkSettingsB.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, jSONObjectMergeJsons));
                        networkSettingsB.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, jSONObjectMergeJsons2));
                        networkSettingsB.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, jSONObjectMergeJsons3));
                        networkSettingsB.setNativeAdSettings(IronSourceUtils.mergeJsons(nativeAdSettings, jSONObjectMergeJsons4));
                        networkSettingsB.setIsMultipleInstances(zOptBoolean);
                        networkSettingsB.setSubProviderId(strOptString);
                        networkSettingsB.setAdSourceNameForEvents(strOptString2);
                    } else {
                        if (cVar2.a(strOptString3)) {
                            NetworkSettings networkSettingsB2 = cVar2.P1.b("Mediation");
                            JSONObject rewardedVideoSettings2 = networkSettingsB2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = networkSettingsB2.getInterstitialSettings();
                            JSONObject bannerSettings2 = networkSettingsB2.getBannerSettings();
                            JSONObject nativeAdSettings2 = networkSettingsB2.getNativeAdSettings();
                            jSONObject = jSONObjectB;
                            JSONObject jSONObject2 = new JSONObject(rewardedVideoSettings2.toString());
                            it = itKeys;
                            JSONObject jSONObject3 = new JSONObject(interstitialSettings2.toString());
                            try {
                                networkSettings = new NetworkSettings(next, strOptString3, strOptString4, jSONObjectB3, IronSourceUtils.mergeJsons(jSONObject2, jSONObjectMergeJsons), IronSourceUtils.mergeJsons(jSONObject3, jSONObjectMergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(bannerSettings2.toString()), jSONObjectMergeJsons3), IronSourceUtils.mergeJsons(new JSONObject(nativeAdSettings2.toString()), jSONObjectMergeJsons4));
                                networkSettings.setIsMultipleInstances(zOptBoolean);
                                networkSettings.setSubProviderId(strOptString);
                                networkSettings.setAdSourceNameForEvents(strOptString2);
                                cVar = this;
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                                return;
                            }
                        } else {
                            try {
                                jSONObject = jSONObjectB;
                                it = itKeys;
                                cVar = cVar2;
                                networkSettings = new NetworkSettings(next, strOptString3, strOptString4, jSONObjectB3, jSONObjectMergeJsons, jSONObjectMergeJsons2, jSONObjectMergeJsons3, jSONObjectMergeJsons4);
                                networkSettings.setIsMultipleInstances(zOptBoolean);
                                networkSettings.setSubProviderId(strOptString);
                                networkSettings.setAdSourceNameForEvents(strOptString2);
                            } catch (Exception e2) {
                                e = e2;
                                e.printStackTrace();
                                return;
                            }
                        }
                        cVar.P1.a(networkSettings);
                        cVar2 = cVar;
                        jSONObjectB = jSONObject;
                        itKeys = it;
                    }
                }
            }
            cVar2.P1.a();
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void a(a aVar) {
        this.V1 = aVar;
    }

    public l2 b() {
        return this.Q1;
    }

    public InitConfig d() {
        return new InitConfig(this.R1, this.S1);
    }

    public List<IronSource.AD_UNIT> e() {
        ub ubVar;
        ub ubVar2;
        ub ubVar3;
        ub ubVar4;
        if (this.T1 == null || this.Q1 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.Q1.getRewardedVideoConfigurations() != null && (ubVar4 = this.O1) != null && !ubVar4.d().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        if (this.Q1.getInterstitialConfigurations() != null && (ubVar3 = this.O1) != null && !ubVar3.b().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
        }
        if (this.Q1.getOfferwallConfigurations() != null) {
            arrayList.add(IronSource.AD_UNIT.OFFERWALL);
        }
        if (this.Q1.getBannerConfigurations() != null && (ubVar2 = this.O1) != null && !ubVar2.a().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.BANNER);
        }
        if (this.Q1.getNativeAdConfigurations() != null && (ubVar = this.O1) != null && !ubVar.c().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.NATIVE_AD);
        }
        return arrayList;
    }

    public a f() {
        return this.V1;
    }

    public JSONObject g() {
        return this.T1;
    }

    public ub h() {
        return this.O1;
    }

    public vb i() {
        return this.P1;
    }

    public boolean k() {
        return b().getApplicationConfigurations().j().f();
    }

    public boolean l() {
        return !TextUtils.isEmpty(b().getTestSuiteSettings().b());
    }

    public boolean m() {
        JSONObject jSONObject = this.T1;
        return (((((jSONObject != null) && !jSONObject.has("error")) && this.O1 != null) && this.P1 != null) && this.Q1 != null) && j();
    }

    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.R1);
            jSONObject.put("userId", this.S1);
            jSONObject.put(Y1, this.T1);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
