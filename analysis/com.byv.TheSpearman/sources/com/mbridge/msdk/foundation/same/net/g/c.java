package com.mbridge.msdk.foundation.same.net.g;

import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: RequestControlUtil.java */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f2888a;
    private int b;
    private ConcurrentHashMap<String, a> c;
    private ArrayList<Integer> d;

    private c() {
        this.f2888a = "IDErrorUtil";
        this.c = new ConcurrentHashMap<>();
        this.d = new ArrayList<>();
        g gVarB = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (gVarB == null) {
            h.a();
            gVarB = i.a();
        }
        this.b = gVarB.x() * 1000;
        if (gVarB.B() != null && gVarB.B().size() > 0) {
            ad.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.d.addAll(gVarB.B());
        } else {
            ad.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.d.addAll(Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616));
        }
    }

    public static c a() {
        return b.f2890a;
    }

    public final synchronized void a(String str, int i, String str2, long j) {
        if (this.c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.d.contains(Integer.valueOf(i))) {
            ad.b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.c.put(str, new a(j, i, str2));
        }
    }

    public final k a(String str, String str2, String str3, String str4, String str5) {
        return b(str, str2, str3, str4, str5);
    }

    public final k a(e eVar) {
        String str = eVar.a().get("app_id");
        String str2 = eVar.a().get("placement_id");
        String str3 = TextUtils.isEmpty(str2) ? "" : str2;
        String strReplace = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(strReplace)) {
            strReplace = eVar.a().get("unit_ids");
            if (!TextUtils.isEmpty(strReplace)) {
                strReplace = strReplace.replace(t2.i.d, "").replace(t2.i.e, "");
            }
        }
        String str4 = strReplace;
        String str5 = eVar.a().get("ad_type");
        if (TextUtils.isEmpty(str5)) {
            str5 = "0";
        }
        return b(str, str4, str3, eVar.a().get("token"), str5);
    }

    private k b(String str, String str2, String str3, String str4, String str5) {
        int i;
        String str6 = str + "_" + str3 + "_" + str2 + "_" + str5;
        a aVarA = a(str6);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.mbridge.msdk.foundation.same.net.d.b("data_res_type", "1"));
        if (aVarA != null && !TextUtils.isEmpty(aVarA.b)) {
            try {
                if (aVarA.f2889a != -1) {
                    return k.a(new JSONObject(aVarA.b), new com.mbridge.msdk.foundation.same.net.f.c(200, aVarA.b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (i = Integer.parseInt(str5)) != 287 && i != 94) {
                    if (System.currentTimeMillis() < (h.a().a(str, str2).n() * 1000) + aVarA.c) {
                        return k.a(new JSONObject(aVarA.b), new com.mbridge.msdk.foundation.same.net.f.c(200, aVarA.b.getBytes(), arrayList));
                    }
                    this.c.remove(str6);
                    return null;
                }
            } catch (Exception e) {
                ad.b("IDErrorUtil", e.getMessage());
            }
        }
        ad.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    private synchronized a a(String str) {
        a aVar;
        ad.b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.c.containsKey(str) || (aVar = this.c.get(str)) == null) {
            return null;
        }
        if (aVar.f2889a == -1) {
            return aVar;
        }
        if (System.currentTimeMillis() > aVar.c + this.b) {
            this.c.remove(str);
            if (this.c.size() > 0) {
                for (Map.Entry<String, a> entry : this.c.entrySet()) {
                    ad.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().c > this.b) {
                        this.c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        ad.b("IDErrorUtil", "getErrorInfo : " + aVar.b);
        return aVar;
    }

    /* compiled from: RequestControlUtil.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f2889a;
        public String b;
        public long c;

        public a(long j, int i, String str) {
            this.c = j;
            this.f2889a = i;
            this.b = str;
        }
    }

    /* compiled from: RequestControlUtil.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f2890a = new c();
    }
}
