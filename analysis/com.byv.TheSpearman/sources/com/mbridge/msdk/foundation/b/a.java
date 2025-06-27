package com.mbridge.msdk.foundation.b;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseCandidateCache.java */
/* loaded from: classes4.dex */
public class a {
    public static int b = 4;
    private static String c = "BaseCandidateCache";

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.foundation.db.c f2750a;
    private JSONArray d;
    private JSONObject e;
    private String f;

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
        c cVarC = c(str);
        if (cVarC != null && cVarC.g() != c.c && cVarC.g() != c.f2754a) {
            String[] strArrSplit = x.a(str.split("_")[3]).split("\\|");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    public final c c(String str) throws NumberFormatException {
        c cVar = new c();
        if (TextUtils.isEmpty(str) || str.split("_").length <= 3 || TextUtils.isEmpty(str.split("_")[3])) {
            cVar.d("bid token exception");
            cVar.a(c.f2754a);
            return cVar;
        }
        JSONArray jSONArray = this.d;
        if (jSONArray == null || jSONArray.length() == 0) {
            cVar.d("config is empty");
            cVar.a(c.f2754a);
            return cVar;
        }
        String strA = x.a(str.split("_")[3]);
        if (TextUtils.isEmpty(strA)) {
            cVar.d("bid token exception:decode error");
            cVar.a(c.f2754a);
            return cVar;
        }
        String[] strArrSplit = strA.split("\\|");
        if (strArrSplit.length == 0) {
            cVar.d("bid token can not get bid price");
            cVar.a(c.f2754a);
            return cVar;
        }
        if (strArrSplit.length > 0) {
            try {
                Double.parseDouble(strArrSplit[0]);
            } catch (Exception unused) {
                cVar.d("bid token can not cast bid price");
                cVar.a(c.f2754a);
                return cVar;
            }
        }
        if (TextUtils.isEmpty(this.f)) {
            cVar.d("unitId is empty");
            cVar.a(c.c);
        }
        return cVar;
    }

    public final double d(String str) throws NumberFormatException {
        c cVarC = c(str);
        if (cVarC != null && cVarC.g() != c.c && cVarC.g() != c.f2754a) {
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

    public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar, String str, int i, String str2, int i2, double d) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        CampaignEx campaignEx = list.get(i3);
                        campaignEx.setReadyState(0);
                        if (bVar != null) {
                            campaignEx.setNLRid(bVar.f());
                        }
                        campaignEx.setNRid(str);
                        campaignEx.setReasond(str2);
                        campaignEx.setTyped(i);
                        String strB = x.b(d + "");
                        campaignEx.setNoticeUrl(a(campaignEx.getNoticeUrl(), i2, str, strB));
                        campaignEx.setClickURL(a(campaignEx.getClickURL(), i2, str, strB));
                        campaignEx.setImpressionURL(a(campaignEx.getImpressionURL(), i2, str, strB));
                        campaignEx.setOnlyImpressionURL(a(campaignEx.getOnlyImpressionURL(), i2, str, strB));
                        campaignEx.setAdvImp(a(campaignEx.getAdvImpList(), i2, str, strB));
                        j nativeVideoTracking = campaignEx.getNativeVideoTracking();
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
                            campaignEx.setNativeVideoTracking(nativeVideoTracking);
                            campaignEx.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignEx.setPv_urls(b(campaignEx.getPv_urls(), i2, str, strB));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final c a() {
        JSONArray jSONArray;
        c cVar = new c();
        try {
            jSONArray = this.d;
        } catch (Exception unused) {
            cVar.d("checkConfigAndDB exception");
            cVar.a(c.c);
        }
        if (jSONArray != null && jSONArray.length() != 0) {
            if (this.f2750a == null) {
                cVar.d("db error");
                cVar.a(c.c);
                return cVar;
            }
            return cVar;
        }
        cVar.d("setting config is null");
        cVar.a(c.f2754a);
        return cVar;
    }

    public final void a(List<C0262a> list, int i) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list, new Comparator<C0262a>() { // from class: com.mbridge.msdk.foundation.b.a.1
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(C0262a c0262a, C0262a c0262a2) {
                            return Double.compare(c0262a.b, c0262a2.b);
                        }
                    });
                    int size = list.size() - i;
                    if (size > 0) {
                        List<C0262a> listSubList = list.subList(0, size);
                        if (this.f2750a == null || listSubList.size() <= 0) {
                            return;
                        }
                        for (int i2 = 0; i2 < listSubList.size(); i2++) {
                            b bVar = listSubList.get(i2).f2752a;
                            this.f2750a.a(this.f, bVar.e(), bVar.d());
                            a(b, 1, null, true, bVar.e(), bVar.d(), -1, this.f);
                        }
                    }
                }
            } catch (Exception e) {
                ad.a(c, e);
            }
        }
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

    public final long a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return 0L;
        }
        String ecppv = list.get(0).getEcppv();
        if (TextUtils.isEmpty(ecppv)) {
            return 0L;
        }
        String strA = x.a(ecppv);
        if (TextUtils.isEmpty(strA)) {
            return 0L;
        }
        try {
            if (Double.parseDouble(strA) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return 0L;
            }
            JSONObject jSONObjectA = a(b(str));
            int iOptInt = jSONObjectA != null ? jSONObjectA.optInt("max_cache_num", 20) : 20;
            com.mbridge.msdk.foundation.db.c cVar = this.f2750a;
            if (cVar == null || iOptInt <= 0) {
                return -1L;
            }
            return cVar.a(list, this.f);
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public final void a(String str, String str2, int i, String str3) {
        try {
            if (this.f2750a == null || TextUtils.isEmpty(str3)) {
                return;
            }
            if (i == 1) {
                this.f2750a.a(str2, str, this.f, i);
                a(b, 3, null, true, str2, str, -1, this.f);
            } else if (i == 2) {
                this.f2750a.a(this.f, str2, str);
                a(b, 1, null, true, str2, str, -1, this.f);
            } else if (i == 3) {
                this.f2750a.b(str2, str, this.f);
                a(b, 4, null, true, str2, str, -1, this.f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0199 A[Catch: Exception -> 0x01ac, TryCatch #2 {Exception -> 0x01ac, blocks: (B:3:0x0011, B:7:0x002e, B:9:0x0066, B:12:0x0076, B:14:0x007c, B:17:0x0083, B:19:0x008e, B:22:0x0095, B:24:0x009b, B:26:0x00a3, B:28:0x00b3, B:30:0x00fe, B:37:0x0114, B:41:0x011d, B:43:0x0123, B:45:0x0131, B:46:0x0135, B:48:0x0140, B:50:0x0146, B:52:0x014e, B:54:0x0159, B:56:0x016b, B:65:0x0187, B:67:0x018f, B:69:0x0199, B:70:0x019e, B:57:0x0170, B:31:0x0103), top: B:79:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r17, int r18, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.b.a.a(int, int, java.util.List, boolean, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    /* compiled from: BaseCandidateCache.java */
    /* renamed from: com.mbridge.msdk.foundation.b.a$a, reason: collision with other inner class name */
    public static class C0262a {

        /* renamed from: a, reason: collision with root package name */
        private b f2752a;
        private double b;

        public C0262a(double d, b bVar) {
            this.b = d;
            this.f2752a = bVar;
        }

        public final b a() {
            return this.f2752a;
        }
    }

    public final List<b> a(int i, long j) throws JSONException {
        com.mbridge.msdk.foundation.db.c cVar;
        if (i >= 0 && (cVar = this.f2750a) != null) {
            cVar.a(this.f, i);
            a(b, 1, null, true, "", "", i, this.f);
        }
        com.mbridge.msdk.foundation.db.c cVar2 = this.f2750a;
        if (cVar2 != null) {
            return cVar2.a(this.f, 0, j);
        }
        return null;
    }
}
