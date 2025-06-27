package com.mbridge.msdk.c;

import android.content.Context;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingManager.java */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2509a = "h";
    private static volatile h b;
    private static volatile g c;
    private static HashMap<String, k> d = new HashMap<>();

    private h() {
    }

    public static void a(Context context, String str) {
        FastKV fastKVBuild;
        com.mbridge.msdk.foundation.controller.d.a();
        Map<String, Object> all = null;
        try {
            fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
        } catch (Exception unused) {
            fastKVBuild = null;
        }
        if (fastKVBuild != null) {
            try {
                all = fastKVBuild.getAll();
            } catch (Exception unused2) {
            }
            if (all != null) {
                try {
                    for (String str2 : all.keySet()) {
                        if (str2.startsWith(str + "_")) {
                            d.put(str2, k.g((String) all.get(str2)));
                        }
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            return;
        }
        try {
            Map<String, ?> all2 = context.getSharedPreferences("mbridge", 0).getAll();
            for (String str3 : all2.keySet()) {
                if (str3.startsWith(str + "_")) {
                    d.put(str3, k.g((String) all2.get(str3)));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static h a() {
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h();
                }
            }
        }
        return b;
    }

    public final g a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                g gVarB = b(str);
                return gVarB == null ? i.a() : gVarB;
            }
            return i.a();
        } catch (Exception unused) {
            return i.a();
        }
    }

    public final g b(String str) {
        if (c == null) {
            try {
                String strA = com.mbridge.msdk.foundation.a.a.a.a().a(str);
                if (!TextUtils.isEmpty(strA)) {
                    JSONObject jSONObject = new JSONObject(strA);
                    if (jSONObject.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        jSONObject.remove(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    }
                    if (jSONObject.has("c")) {
                        jSONObject.remove("c");
                    }
                    c = g.e(jSONObject.toString());
                    if (c != null) {
                        c.aK();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return c;
    }

    public final String c(String str) {
        return com.mbridge.msdk.foundation.a.a.a.a().a("ivreward_" + str);
    }

    public final k b(String str, String str2) {
        return i(str, str2);
    }

    private k i(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.m().k();
        }
        String str3 = str + "_" + str2;
        k kVarG = null;
        if (d.containsKey(str3)) {
            return d.get(str3);
        }
        try {
            kVarG = k.g(com.mbridge.msdk.foundation.a.a.a.a().a(str3));
            d.put(str3, kVarG);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kVarG;
    }

    public final k c(String str, String str2) {
        k kVarD = d(str, str2);
        return kVarD == null ? k.y() : kVarD;
    }

    public final k d(String str, String str2) {
        k kVarI = i(str, str2);
        if (kVarI != null && kVarI.v() == 0) {
            kVarI.a(1);
        }
        return kVarI;
    }

    public final boolean e(String str, String str2) {
        g gVarB = b(str2);
        if (d(str2) && a(str2, 1, str)) {
            new j().a(com.mbridge.msdk.foundation.controller.c.m().c(), str2, com.mbridge.msdk.foundation.controller.c.m().b());
        }
        k kVarD = d(str2, str);
        if (gVarB != null && kVarD != null) {
            long jAs = gVarB.as() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jI = kVarD.i() + jAs;
            if (jI > jCurrentTimeMillis) {
                ad.c(f2509a, "unit setting  nexttime is not ready  [settingNextRequestTime= " + jI + " currentTime = " + jCurrentTimeMillis + t2.i.e);
                return false;
            }
        }
        ad.c(f2509a, "unit setting timeout or not exists");
        return true;
    }

    public final boolean d(String str) {
        g gVarB = b(str);
        if (gVarB != null) {
            long jE = gVarB.E() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jA = gVarB.A() + jE;
            if (jA > jCurrentTimeMillis) {
                ad.c(f2509a, "app setting nexttime is not ready  [settingNextRequestTime= " + jA + " currentTime = " + jCurrentTimeMillis + t2.i.e);
                return false;
            }
        }
        ad.c(f2509a, "app setting timeout or not exists");
        return true;
    }

    public final boolean a(String str, int i, String str2) {
        try {
            Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
            String str3 = str + "_" + i + "_" + str2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = 0;
            long jLongValue = ((Long) al.a(contextC, str3, 0L)).longValue();
            g gVarB = b(str);
            if (gVarB == null) {
                a();
                gVarB = i.a();
            } else {
                j = jLongValue;
            }
            if (j + (gVarB.an() * 1000) > jCurrentTimeMillis) {
                return false;
            }
            al.b(contextC, str3, Long.valueOf(jCurrentTimeMillis));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                    jSONArray.put(0, a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                    jSONObject.put(next, jSONArray);
                } else {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            }
        }
        return jSONObject;
    }

    public final void e(String str) {
        com.mbridge.msdk.foundation.a.a.a.a().c("ivreward_" + str);
    }

    public final void f(String str, String str2) {
        com.mbridge.msdk.foundation.a.a.a.a().a("ivreward_" + str, str2);
    }

    public final void f(String str) {
        try {
            String strG = g(str);
            if (TextUtils.isEmpty(strG)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strG);
            jSONObject.put("current_time", System.currentTimeMillis());
            g(str, jSONObject.toString());
        } catch (Throwable th) {
            ad.b(f2509a, th.getMessage());
        }
    }

    public final String g(String str) {
        if (str == null) {
            return "";
        }
        try {
            String strA = com.mbridge.msdk.foundation.a.a.a.a().a(str);
            return strA == null ? "" : strA;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return "";
        }
    }

    public final void g(String str, String str2) {
        com.mbridge.msdk.foundation.a.a.a.a().a(str, str2);
        c = g.e(str2);
        if (c != null) {
            c.aK();
        }
    }

    public final void h(String str, String str2) {
        try {
            String strA = com.mbridge.msdk.foundation.a.a.a.a().a(str + "_" + str2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th) {
            ad.b(f2509a, th.getMessage());
        }
    }

    public final void a(String str, String str2, String str3) {
        String str4 = str + "_" + str2;
        com.mbridge.msdk.foundation.a.a.a.a().a(str4, str3);
        d.put(str4, k.g(str3));
    }

    public final k a(String str, String str2) {
        k kVarI = i(str, str2);
        return kVarI == null ? k.y() : kVarI;
    }
}
