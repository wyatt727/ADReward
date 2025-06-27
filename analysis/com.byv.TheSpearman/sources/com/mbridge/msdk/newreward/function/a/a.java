package com.mbridge.msdk.newreward.function.a;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.a.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseCandidateCache.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f3300a = 4;
    public static int b = 5;
    private static String c = "BaseCandidateCache";
    private JSONArray d;
    private JSONObject e;
    private String f;
    private int g;
    private String h;
    private e i;
    private com.mbridge.msdk.newreward.function.c.c j;

    public final JSONObject a(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray = this.d;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() > 1) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (int i = 0; i < this.d.length(); i++) {
                try {
                    jSONObjectOptJSONObject = this.d.optJSONObject(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (jSONObjectOptJSONObject != null && str.equals(jSONObjectOptJSONObject.getString("g"))) {
                    this.e = jSONObjectOptJSONObject;
                    return jSONObjectOptJSONObject;
                }
            }
            return null;
        }
        return this.d.optJSONObject(0);
    }

    public final String b(String str) throws NumberFormatException {
        b bVarC = c(str);
        if (bVarC != null && bVarC.h() != com.mbridge.msdk.foundation.b.c.c && bVarC.h() != com.mbridge.msdk.foundation.b.c.f2754a) {
            String[] strArrSplit = x.a(str.split("_")[3]).split("\\|");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    public final b c(String str) throws NumberFormatException {
        b bVar = new b();
        if (TextUtils.isEmpty(str) || str.split("_").length <= 3 || TextUtils.isEmpty(str.split("_")[3])) {
            bVar.d("bid token exception");
            bVar.a(com.mbridge.msdk.foundation.b.c.f2754a);
            return bVar;
        }
        JSONArray jSONArray = this.d;
        if (jSONArray == null || jSONArray.length() == 0) {
            bVar.d("config is empty");
            bVar.a(com.mbridge.msdk.foundation.b.c.f2754a);
            return bVar;
        }
        String strA = x.a(str.split("_")[3]);
        if (TextUtils.isEmpty(strA)) {
            bVar.d("bid token exception:decode error");
            bVar.a(com.mbridge.msdk.foundation.b.c.f2754a);
            return bVar;
        }
        String[] strArrSplit = strA.split("\\|");
        if (strArrSplit.length == 0) {
            bVar.d("bid token can not get bid price");
            bVar.a(com.mbridge.msdk.foundation.b.c.f2754a);
            return bVar;
        }
        if (strArrSplit.length > 0) {
            try {
                Double.parseDouble(strArrSplit[0]);
            } catch (Exception unused) {
                bVar.d("bid token can not cast bid price");
                bVar.a(com.mbridge.msdk.foundation.b.c.f2754a);
                return bVar;
            }
        }
        if (TextUtils.isEmpty(this.f)) {
            bVar.d("unitId is empty");
            bVar.a(com.mbridge.msdk.foundation.b.c.c);
        }
        return bVar;
    }

    public final double d(String str) throws NumberFormatException {
        b bVarC = c(str);
        if (bVarC != null && bVarC.h() != com.mbridge.msdk.foundation.b.c.c && bVarC.h() != com.mbridge.msdk.foundation.b.c.f2754a) {
            try {
                String[] strArrSplit = x.a(str.split("_")[3]).split("\\|");
                if (strArrSplit.length > 0) {
                    return Double.parseDouble(strArrSplit[0]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1.0d;
    }

    public final void a(JSONArray jSONArray) {
        this.d = jSONArray;
    }

    public final void a(List<com.mbridge.msdk.newreward.function.d.a.a> list, com.mbridge.msdk.foundation.same.report.d.b bVar, String str, int i, String str2, int i2, double d) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        CampaignEx campaignExG = list.get(i3).g();
                        campaignExG.setReadyState(0);
                        if (bVar != null) {
                            campaignExG.setNLRid(bVar.f());
                        }
                        campaignExG.setNRid(str);
                        campaignExG.setReasond(str2);
                        campaignExG.setTyped(i);
                        String strB = x.b(d + "");
                        campaignExG.setNoticeUrl(a(campaignExG.getNoticeUrl(), i2, str, strB));
                        campaignExG.setClickURL(a(campaignExG.getClickURL(), i2, str, strB));
                        campaignExG.setImpressionURL(a(campaignExG.getImpressionURL(), i2, str, strB));
                        campaignExG.setOnlyImpressionURL(a(campaignExG.getOnlyImpressionURL(), i2, str, strB));
                        campaignExG.setAdvImp(a(campaignExG.getAdvImpList(), i2, str, strB));
                        j nativeVideoTracking = campaignExG.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.k(a(nativeVideoTracking.l(), i2, str, strB));
                            nativeVideoTracking.c(a(nativeVideoTracking.c(), i2, str, strB));
                            nativeVideoTracking.o(a(nativeVideoTracking.p(), i2, str, strB));
                            nativeVideoTracking.s(a(nativeVideoTracking.t(), i2, str, strB));
                            nativeVideoTracking.a(a(nativeVideoTracking.a(), i2, str, strB));
                            nativeVideoTracking.b(a(nativeVideoTracking.b(), i2, str, strB));
                            nativeVideoTracking.r(a(nativeVideoTracking.s(), i2, str, strB));
                            nativeVideoTracking.u(a(nativeVideoTracking.v(), i2, str, strB));
                            nativeVideoTracking.t(a(nativeVideoTracking.v(), i2, str, strB));
                            nativeVideoTracking.v(a(nativeVideoTracking.w(), i2, str, strB));
                            nativeVideoTracking.h(a(nativeVideoTracking.h(), i2, str, strB));
                            nativeVideoTracking.p(a(nativeVideoTracking.q(), i2, str, strB));
                            nativeVideoTracking.q(a(nativeVideoTracking.r(), i2, str, strB));
                            nativeVideoTracking.n(a(nativeVideoTracking.o(), i2, str, strB));
                            nativeVideoTracking.e(a(nativeVideoTracking.e(), i2, str, strB));
                            nativeVideoTracking.f(a(nativeVideoTracking.f(), i2, str, strB));
                            nativeVideoTracking.g(a(nativeVideoTracking.g(), i2, str, strB));
                            nativeVideoTracking.i(a(nativeVideoTracking.j(), i2, str, strB));
                            nativeVideoTracking.j(a(nativeVideoTracking.k(), i2, str, strB));
                            nativeVideoTracking.l(a(nativeVideoTracking.m(), i2, str, strB));
                            nativeVideoTracking.a(a(nativeVideoTracking.i(), i2, str, strB));
                            nativeVideoTracking.d(a(nativeVideoTracking.d(), i2, str, strB));
                            nativeVideoTracking.m(a(nativeVideoTracking.n(), i2, str, strB));
                            campaignExG.setNativeVideoTracking(nativeVideoTracking);
                            campaignExG.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignExG.setPv_urls(b(campaignExG.getPv_urls(), i2, str, strB));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final b a() {
        b bVar = new b();
        try {
            JSONArray jSONArray = this.d;
            if (jSONArray == null || jSONArray.length() == 0) {
                bVar.d("setting config is null");
                bVar.a(com.mbridge.msdk.foundation.b.c.f2754a);
                return bVar;
            }
        } catch (Exception unused) {
            bVar.d("checkConfigAndDB exception");
            bVar.a(com.mbridge.msdk.foundation.b.c.c);
        }
        return bVar;
    }

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i, int i2, String str) {
        return com.mbridge.msdk.newreward.function.e.c.a().b().a(i2, str, this.f, true, 0);
    }

    private String a(String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (ao.c(str) > 0) {
            return str + "&ca_sce=" + i + "&real_rid=" + str2 + "&real_bp=" + str3;
        }
        return str + "?ca_sce=" + i + "&real_rid=" + str2 + "&real_bp=" + str3;
    }

    private String a(Map<Integer, String> map, int i, String str, String str2) throws JSONException {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", a(value, i, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    private String[] a(String[] strArr, int i, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr2[i2] = a(strArr[i2], i, str, str2);
        }
        return strArr2;
    }

    private List<Map<Integer, String>> a(List<Map<Integer, String>> list, int i, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Map<Integer, String> map = list.get(i2);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue(), i, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    private List<String> b(List<String> list, int i, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(a(list.get(i2), i, str, str2));
        }
        return arrayList;
    }

    public final void e(String str) {
        this.f = str;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void f(String str) {
        this.h = str;
    }

    public final void a(e eVar) {
        this.i = eVar;
    }

    public final void a(com.mbridge.msdk.newreward.function.c.c cVar) {
        this.j = cVar;
    }

    public final void a(String str, String str2, int i, double d) {
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        try {
            if (i == 1) {
                a(f3300a, 3, null, true, str2, str, -1, this.f);
            } else if (i == 2) {
                a(f3300a, 1, null, true, str2, str, -1, this.f);
            } else if (i != 3) {
            } else {
                a(f3300a, 4, null, true, str2, str, -1, this.f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0181 A[Catch: Exception -> 0x01a0, TryCatch #0 {Exception -> 0x01a0, blocks: (B:3:0x000d, B:7:0x002a, B:9:0x0064, B:12:0x0075, B:14:0x007b, B:16:0x0096, B:19:0x009d, B:21:0x00a3, B:23:0x00ab, B:24:0x0101, B:25:0x0105, B:28:0x0110, B:31:0x0116, B:33:0x011c, B:35:0x0129, B:36:0x012d, B:39:0x0139, B:41:0x013f, B:43:0x0147, B:44:0x015f, B:45:0x0162, B:53:0x0177, B:55:0x0181, B:56:0x0186, B:51:0x0171), top: B:61:0x000d, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r17, int r18, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.a.a.a(int, int, java.util.List, boolean, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    /* compiled from: BaseCandidateCache.java */
    /* renamed from: com.mbridge.msdk.newreward.function.a.a$a, reason: collision with other inner class name */
    public static class C0283a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.newreward.function.d.a.b f3302a;
        private double b;

        public C0283a(double d, com.mbridge.msdk.newreward.function.d.a.b bVar) {
            this.b = d;
            this.f3302a = bVar;
        }

        public final com.mbridge.msdk.newreward.function.d.a.b a() {
            return this.f3302a;
        }
    }
}
