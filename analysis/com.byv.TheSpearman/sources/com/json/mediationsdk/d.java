package com.json.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.AuctionRequestInstanceInfo;
import com.json.a1;
import com.json.b6;
import com.json.ca;
import com.json.dc;
import com.json.e1;
import com.json.environment.ContextProvider;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.h4;
import com.json.i0;
import com.json.i1;
import com.json.i5;
import com.json.i9;
import com.json.l4;
import com.json.m9;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.demandOnly.p;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.utils.IronSourceAES;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.p0;
import com.json.td;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d {
    private static final String A = "auctionData";
    private static final String B = "bannerHeight";
    private static final String C = "bannerSize";
    private static final String D = "bannerWidth";
    private static final String E = "biddingAdditionalData";
    private static final String F = "browserUserAgent";
    private static final String G = "bundleId";
    private static final String H = "clientParams";
    private static final String I = "clientTimestamp";
    private static final String J = "consent";
    private static final String K = "connectionType";
    private static final String L = "deviceHeight";
    private static final String M = "deviceLang";
    private static final String N = "deviceMake";
    private static final String O = "deviceModel";
    private static final String P = "deviceOS";
    private static final String Q = "deviceOSVersion";
    private static final String R = "deviceType";
    private static final String S = "deviceWidth";
    private static final String T = "fs";
    private static final String U = "instances";
    private static final String V = "instanceType";
    private static final String W = "isLimitAdTrackingEnabled";
    private static final String X = "metaData";
    private static final String Y = "mobileCarrier";
    private static final String Z = "performance";
    private static final String a0 = "SDKVersion";
    private static final String b0 = "secure";
    private static final String c = "AuctionDataUtils";
    private static final String c0 = "sessionDepth";
    public static final String d = "auctionId";
    private static final String d0 = "sessionId";
    public static final String e = "armData";
    private static final String e0 = "auid";
    public static final String f = "isAdUnitCapped";
    private static final String f0 = "";
    public static final String g = "settings";
    public static final String g0 = "isOneFlow";
    public static final String h = "waterfall";
    public static final String h0 = "dlpl";
    public static final String i = "genericParams";
    public static final String i0 = "mt";
    public static final String j = "configurations";
    public static final String j0 = "adUnit";
    public static final String k = "instances";
    public static final String k0 = "isDemandOnly";
    public static final String l = "${AUCTION_LOSS}";
    public static final String l0 = "doNotEncryptResponse";
    public static final String m = "${AUCTION_MBR}";
    private static final String m0 = "testSuite";
    public static final String n = "${AUCTION_PRICE}";
    private static final String n0 = "test";
    public static final String o = "${DYNAMIC_DEMAND_SOURCE}";
    public static final String o0 = "parallelLoad";
    public static final String p = "${INSTANCE}";
    public static final String p0 = "bidderExclusive";
    public static final String q = "${INSTANCE_TYPE}";
    public static final String q0 = "showPriorityEnabled";
    public static final String r = "${PLACEMENT_NAME}";
    public static final boolean r0 = false;
    private static final String s = "adMarkup";
    private static d s0 = new d();
    private static final String t = "dynamicDemandSource";
    private static final String u = "params";
    private static final String v = "advId";
    private static final String w = "advIdType";
    private static final String x = "applicationKey";
    private static final String y = "applicationUserId";
    private static final String z = "appVersion";

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f1919a = new AtomicBoolean(false);
    private final b6 b = ca.h().c();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f1920a;
        private List<i1> b;
        private i1 c;
        private JSONObject d;
        private JSONObject e;
        private int f;
        private String g;
        private a1 h;

        public a(String str) {
            this.f1920a = str;
        }

        public p a(String str) {
            a1 a1Var = this.h;
            return a1Var != null ? a1Var.a(str) : new p.b();
        }

        public String a() {
            return this.f1920a;
        }

        public JSONObject b() {
            return this.e;
        }

        public int c() {
            return this.f;
        }

        public String d() {
            return this.g;
        }

        public i1 e() {
            return this.c;
        }

        public JSONObject f() {
            return this.d;
        }

        public a1 g() {
            return this.h;
        }

        public List<i1> h() {
            return this.b;
        }
    }

    static class b implements Runnable {
        private static final int d = 15000;

        /* renamed from: a, reason: collision with root package name */
        private String f1921a;
        private String b;
        private String c;

        public b(String str, String str2, String str3) {
            this.f1921a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException, IOException {
            String str = this.f1921a + ";" + this.b + ";" + this.c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                if (responseCode == 200 || responseCode == 204) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, responseCode);
                jSONObject.put("reason", responseMessage);
                dc.i().a(new l4(IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, jSONObject));
            } catch (Exception e) {
                e.printStackTrace();
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e.getMessage());
            }
        }
    }

    private enum c {
        NOT_SECURE,
        SECURE
    }

    private c a() {
        c cVar = c.SECURE;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                return cVar;
            }
        } else if (i2 >= 23) {
            if (!((ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & C.BUFFER_FLAG_FIRST_SAMPLE) != 0)) {
                return cVar;
            }
        }
        return c.NOT_SECURE;
    }

    private String a(String str, String str2) throws NumberFormatException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d2 = Double.parseDouble(str);
        return Double.parseDouble(str2) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "" : String.valueOf(Math.round((d2 / r7) * 1000.0d) / 1000.0d);
    }

    private JSONObject a(JSONObject jSONObject, List<String> list) {
        if (list.isEmpty()) {
            list = td.y1;
        }
        return d(jSONObject, list);
    }

    private String b() {
        return Locale.getDefault().getLanguage();
    }

    private JSONObject b(JSONObject jSONObject, List<String> list) {
        return list.isEmpty() ? jSONObject : d(jSONObject, list);
    }

    public static d c() {
        return s0;
    }

    private JSONObject c(JSONObject jSONObject, List<String> list) throws JSONException {
        String strA;
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    strA = a(td.z1, next);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if ((list.isEmpty() && !td.y1.contains(strA) && !strA.startsWith(td.r1)) || list.contains(strA)) {
                    jSONObject2.put(strA, jSONObject.opt(next));
                }
            }
        }
        return jSONObject2;
    }

    private JSONObject d(JSONObject jSONObject, List<String> list) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if (list.contains(next)) {
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    public i1 a(String str, List<i1> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).c().equals(str)) {
                return list.get(i2);
            }
        }
        return null;
    }

    public String a(String str, int i2, i1 i1Var, String str2, String str3, String str4) throws NumberFormatException {
        String strH = i1Var.h();
        return a(str, i1Var.c(), i2, c().d(i1Var.j()), strH, c().a(strH, str2), str3, str4);
    }

    public String a(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(n, str4).replace(l, str6).replace(m, str5).replace(p, str2).replace(q, Integer.toString(i2)).replace(o, str3).replace(r, str7);
    }

    String a(HashMap<String, String> map, String str) {
        return map.containsKey(str) ? map.get(str) : str;
    }

    String a(JSONObject jSONObject) {
        return IronSourceAES.encode(h4.b().c(), jSONObject.toString());
    }

    String a(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            return str;
        }
        int i2 = 0;
        String str2 = str;
        while (jSONObject.has(str2)) {
            i2++;
            str2 = str + "_" + i2;
        }
        return str2;
    }

    JSONObject a(Context context, Map<String, Object> map, List<String> list, h hVar, int i2, String str, com.json.mediationsdk.utils.a aVar, ISBannerSize iSBannerSize, JSONObject jSONObject, boolean z2, boolean z3) throws JSONException {
        String str2;
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("instanceType", 2);
            jSONObject3.put(E, new JSONObject((Map) map.get(next)));
            jSONObject3.put(Z, hVar != null ? hVar.a(next) : "");
            if (z3) {
                jSONObject3.put(n0, 1);
            }
            jSONObject2.put(next, jSONObject3);
        }
        if (list != null) {
            for (String str3 : list) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("instanceType", 1);
                jSONObject4.put(Z, hVar != null ? hVar.a(str3) : "");
                jSONObject2.put(str3, jSONObject4);
            }
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = com.json.mediationsdk.c.b().c();
        concurrentHashMapC.putAll(m9.b().c());
        JSONObject jSONObject5 = new JSONObject();
        for (Map.Entry<String, List<String>> entry : concurrentHashMapC.entrySet()) {
            jSONObject5.put(entry.getKey(), TextUtils.join(",", entry.getValue()));
        }
        a(new e1(null).a(), false);
        JSONObject jSONObject6 = new JSONObject();
        String strR = p.p().r();
        if (!TextUtils.isEmpty(strR)) {
            jSONObject6.put("applicationUserId", strR);
        }
        Boolean boolJ = p.p().j();
        if (boolJ != null) {
            jSONObject6.put("consent", boolJ.booleanValue() ? 1 : 0);
        }
        jSONObject6.put("mobileCarrier", this.b.j(context));
        jSONObject6.put("connectionType", IronSourceUtils.getConnectionType(context));
        jSONObject6.put("deviceOS", "android");
        jSONObject6.put("deviceWidth", context.getResources().getConfiguration().screenWidthDp);
        jSONObject6.put("deviceHeight", context.getResources().getConfiguration().screenHeightDp);
        jSONObject6.put("deviceOSVersion", Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")");
        jSONObject6.put("deviceModel", Build.MODEL);
        jSONObject6.put("deviceMake", Build.MANUFACTURER);
        jSONObject6.put("bundleId", context.getPackageName());
        jSONObject6.put("appVersion", p0.b(context, context.getPackageName()));
        jSONObject6.put("clientTimestamp", new Date().getTime());
        jSONObject6.put("fs", IronSourceUtils.getFirstSession(context) ? 1 : 0);
        jSONObject6.put(F, this.b.s());
        jSONObject6.put(R, IronSourceUtils.getDeviceType(context));
        jSONObject6.put(M, b());
        jSONObject6.put(b0, a().ordinal());
        if (iSBannerSize != null) {
            jSONObject6.put("bannerSize", iSBannerSize.getDescription());
            jSONObject6.put(D, iSBannerSize.getWidth());
            jSONObject6.put(B, iSBannerSize.getHeight());
        }
        String strP = this.b.p(context);
        if (TextUtils.isEmpty(strP)) {
            strP = this.b.J(context);
            if (!TextUtils.isEmpty(strP)) {
                str2 = IronSourceConstants.TYPE_UUID;
            }
        } else {
            str2 = IronSourceConstants.TYPE_GAID;
        }
        if (!TextUtils.isEmpty(strP)) {
            jSONObject6.put("advId", strP);
            jSONObject6.put("advIdType", str2);
        }
        String strA = this.b.a(context);
        if (!TextUtils.isEmpty(strA)) {
            jSONObject6.put("isLimitAdTrackingEnabled", strA);
        }
        String strD = this.b.D(context);
        if (!TextUtils.isEmpty(strD)) {
            jSONObject6.put("asid", strD);
        }
        String strS = this.b.s(context);
        if (!TextUtils.isEmpty(strS)) {
            jSONObject6.put("auid", strS);
        }
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("applicationKey", p.p().q());
        jSONObject7.put("SDKVersion", IronSourceUtils.getSDKVersion());
        jSONObject7.put(H, jSONObject6);
        jSONObject7.put("sessionDepth", i2);
        jSONObject7.put("sessionId", str);
        jSONObject7.put("instances", jSONObject2);
        jSONObject7.put(A, aVar.a());
        jSONObject7.put(X, jSONObject5);
        if (jSONObject != null) {
            jSONObject7.put(i5.K0, jSONObject);
        }
        if (z2) {
            jSONObject7.put(m0, 1);
        }
        return jSONObject7;
    }

    JSONObject a(AuctionRequestParams iVar) throws JSONException {
        boolean z2;
        boolean z3;
        ISBannerSize iSBannerSize;
        IronSource.AD_UNIT ad_unitB = iVar.b();
        boolean zQ = iVar.getIsEncryptedResponse();
        Map<String, Object> mapE = iVar.e();
        List<String> listI = iVar.i();
        h hVarC = iVar.getAuctionHistory();
        int iL = iVar.getSessionDepth();
        ISBannerSize iSBannerSizeD = iVar.getBannerSize();
        IronSourceSegment ironSourceSegmentK = iVar.getSegment();
        boolean zM = iVar.getTestSuiteLaunched();
        boolean zN = iVar.getUseTestAds();
        ArrayList<AuctionRequestInstanceInfo> arrayListH = iVar.h();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = mapE.keySet().iterator();
        while (true) {
            z2 = zM;
            z3 = zQ;
            String strA = "";
            iSBannerSize = iSBannerSizeD;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Iterator<String> it2 = it;
            JSONObject jSONObject3 = new JSONObject();
            IronSourceSegment ironSourceSegment = ironSourceSegmentK;
            jSONObject3.put(i5.h0, 2);
            jSONObject3.put(i5.Y, new JSONObject((Map) mapE.get(next)));
            if (hVarC != null) {
                strA = hVarC.a(next);
            }
            jSONObject3.put(i5.k0, strA);
            jSONObject3.put("ts", zN ? 1 : 0);
            jSONObject2.put(next, jSONObject3);
            zM = z2;
            zQ = z3 ? 1 : 0;
            iSBannerSizeD = iSBannerSize;
            it = it2;
            ironSourceSegmentK = ironSourceSegment;
        }
        IronSourceSegment ironSourceSegment2 = ironSourceSegmentK;
        int i2 = 2;
        for (String str : listI) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(i5.h0, 1);
            jSONObject4.put(i5.k0, hVarC != null ? hVarC.a(str) : "");
            jSONObject2.put(str, jSONObject4);
        }
        Iterator<AuctionRequestInstanceInfo> it3 = arrayListH.iterator();
        while (it3.hasNext()) {
            AuctionRequestInstanceInfo next2 = it3.next();
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(i5.h0, next2.e() ? i2 : 1);
            Map<String, Object> mapF = next2.f();
            if (!mapF.isEmpty()) {
                jSONObject5.put(i5.Y, new JSONObject(mapF));
            }
            jSONObject5.put(i5.k0, hVarC != null ? hVarC.a(next2.g()) : "");
            jSONObject5.put("ts", zN ? 1 : 0);
            if (!next2.getPlumbus().isEmpty()) {
                jSONObject5.put(h0, next2.getPlumbus());
            }
            jSONObject2.put(next2.g(), jSONObject5);
            i2 = 2;
        }
        jSONObject.put(i5.g0, jSONObject2);
        if (iVar.getIsOneFlow()) {
            jSONObject.put(i5.Y0, 1);
        }
        if (iVar.getIsDemandOnly()) {
            jSONObject.put("do", 1);
        }
        JSONObject jSONObjectA = new e1(i0.a(ad_unitB)).a();
        a(jSONObjectA, false);
        jSONObjectA.put(i5.i0, iL);
        jSONObjectA.put(i5.j0, a().ordinal());
        if (ironSourceSegment2 != null) {
            jSONObjectA.put(i5.K0, ironSourceSegment2.toJson());
        }
        jSONObject.put(i5.d0, jSONObjectA);
        if (iSBannerSize != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(i5.a0, iSBannerSize.getDescription());
            jSONObject6.put(i5.c0, iSBannerSize.getWidth());
            jSONObject6.put(i5.b0, iSBannerSize.getHeight());
            jSONObject.put(i5.Z, jSONObject6);
        }
        jSONObject.put(i5.X, ad_unitB.toString());
        jSONObject.put(i5.e0, !z3 ? 1 : 0);
        Object objRemove = jSONObjectA.remove(i5.U0);
        if (objRemove != null) {
            jSONObject.put(i5.U0, objRemove);
        }
        if (z2) {
            jSONObject.put(i5.S0, 1);
        }
        return jSONObject;
    }

    public JSONObject a(String str) {
        try {
            return new JSONObject(IronSourceAES.decode(h4.b().c(), str));
        } catch (Exception unused) {
            return null;
        }
    }

    JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, List<String> list) throws JSONException {
        JSONObject jSONObjectA = a(c0.f().g(), list);
        a(jSONObjectA, c(jSONObject, list));
        a(jSONObjectA, b(jSONObject2, list));
        return jSONObjectA;
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    void a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject.put(a(jSONObject, next), jSONObject2.opt(next));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void a(JSONObject jSONObject, boolean z2) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(i5.M0)) || !this.f1919a.compareAndSet(false, true)) {
            return;
        }
        dc.i().a(new l4(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z2, true, -1)));
    }

    public a b(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(strOptString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(strOptString);
        if (jSONObject.has(g)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(g);
            aVar.c = new i1(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(e) ? jSONObject2.optJSONObject(e) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has(j)) {
                aVar.e = jSONObject2.optJSONObject(j);
            }
            if (jSONObject2.has("instances")) {
                aVar.h = new a1.a(jSONObject2.optJSONObject("instances"));
            }
        }
        aVar.b = new ArrayList();
        if (jSONObject.has(h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(h);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                i1 i1Var = new i1(jSONArray.getJSONObject(i2), i2, jSONObjectOptJSONObject);
                if (!i1Var.l()) {
                    aVar.f = 1002;
                    aVar.g = "waterfall " + i2;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i2 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.b.add(i1Var);
            }
        }
        return aVar;
    }

    public String b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException e2) {
            e2.printStackTrace();
            IronLog.INTERNAL.error("exception " + e2.getMessage());
            return str;
        }
    }

    public Map<String, String> c(String str) throws JSONException {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        map.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            IronLog.INTERNAL.error("exception " + e2.getMessage());
        }
        return map;
    }

    public String d(String str) throws JSONException {
        String string = "";
        try {
            if (TextUtils.isEmpty(str) || !i9.a(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject2);
            if (!jSONObject2.has("dynamicDemandSource")) {
                return "";
            }
            string = jSONObject2.getString("dynamicDemandSource");
            ironLog.verbose("demand source = " + string);
            return string;
        } catch (JSONException e2) {
            e2.printStackTrace();
            IronLog.INTERNAL.error("exception " + e2.getMessage());
            return string;
        }
    }
}
