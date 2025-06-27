package com.mbridge.msdk.foundation.same.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StaticDataPoll.java */
/* loaded from: classes4.dex */
public class d {
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c>> d = null;
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, String>> e = null;
    public static ConcurrentHashMap<String, CopyOnWriteArrayList<String>> f = null;
    private static final String n = "d";

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f2824a = new HashMap();
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> b = new HashMap();
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> c = new HashMap();
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> g = new HashMap();
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> h = new HashMap();
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> i = new HashMap();
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> j = new HashMap();
    public static Map<String, Long> k = new HashMap();
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> l = new HashMap();
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> m = new HashMap();

    public static void a(String str, String str2, String str3, long j2, long j3, long j4) {
        if (d == null) {
            d = new ConcurrentHashMap<>();
        }
        try {
            if (d.containsKey(str)) {
                ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMap = d.get(str);
                if (concurrentHashMap != null) {
                    com.mbridge.msdk.foundation.entity.c cVar = concurrentHashMap.get(str2);
                    if (cVar == null) {
                        com.mbridge.msdk.foundation.entity.c cVar2 = new com.mbridge.msdk.foundation.entity.c();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str3);
                        cVar2.a(arrayList);
                        cVar2.a(j2);
                        cVar2.b(j3);
                        cVar2.c(j4);
                        concurrentHashMap.put(str2, cVar2);
                        return;
                    }
                    if (cVar.c() != null) {
                        cVar.a(j2);
                        cVar.b(j3);
                        cVar.c(j4);
                        cVar.c().add(str3);
                        return;
                    }
                    return;
                }
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str3);
            ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMap2 = new ConcurrentHashMap<>();
            com.mbridge.msdk.foundation.entity.c cVar3 = new com.mbridge.msdk.foundation.entity.c();
            cVar3.a(arrayList2);
            cVar3.a(j2);
            cVar3.b(j3);
            cVar3.c(j4);
            concurrentHashMap2.put(str2, cVar3);
            d.put(str, concurrentHashMap2);
        } catch (Throwable th) {
            ad.b(n, th.getMessage());
        }
    }

    public static void a(String str, String str2, int i2) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        int size;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        if (f == null) {
            f = new ConcurrentHashMap<>();
        }
        try {
            if (f.containsKey(str)) {
                copyOnWriteArrayList = f.get(str);
                copyOnWriteArrayList.add(str2);
            } else {
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(str2);
                f.put(str, copyOnWriteArrayList2);
                copyOnWriteArrayList = copyOnWriteArrayList2;
            }
            if (copyOnWriteArrayList == null || (size = copyOnWriteArrayList.size() - i2) < 0) {
                return;
            }
            for (int i3 = 0; i3 < size; i3++) {
                copyOnWriteArrayList.remove(i3);
            }
        } catch (Exception e2) {
            ad.a(n, e2.getMessage());
        }
    }

    public static void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            if (e == null) {
                e = new ConcurrentHashMap<>();
            }
            if (e.containsKey(str)) {
                if (e.get(str) == null) {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                    concurrentHashMap.put(str2, str3);
                    e.put(str, concurrentHashMap);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap2.put(str2, str3);
            e.put(str, concurrentHashMap2);
        } catch (Exception e2) {
            ad.a(n, e2.getMessage());
        }
    }

    public static String a(String str, String str2) throws JSONException {
        Map<String, List<com.mbridge.msdk.foundation.same.d.a>> mapD;
        List<com.mbridge.msdk.foundation.same.d.a> list;
        JSONArray jSONArray = new JSONArray();
        if (!TextUtils.isEmpty(str2)) {
            mapD = d(str2);
        } else {
            mapD = null;
            if (i.containsKey(str)) {
                mapD = i;
            } else if (j.containsKey(str)) {
                mapD = j;
            } else if (g.containsKey(str)) {
                mapD = g;
            } else if (m.containsKey(str)) {
                mapD = m;
            } else if (h.containsKey(str)) {
                mapD = h;
            } else if (b.containsKey(str)) {
                mapD = b;
            } else if (l.containsKey(str)) {
                mapD = l;
            } else if (c.containsKey(str)) {
                mapD = c;
            }
        }
        if (mapD != null) {
            try {
                if (an.b(str) && mapD.containsKey(str) && (list = mapD.get(str)) != null && list.size() > 0) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("2", list.get(i2).a());
                        jSONObject.put("1", list.get(i2).c());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    private static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> d(String str) {
        str.hashCode();
        switch (str) {
            case "banner":
                return b;
            case "native":
                return i;
            case "reward":
                return j;
            case "splash":
                return l;
            case "h5_native":
                return c;
            case "interstitial":
                return h;
            case "interactive":
                return g;
            default:
                return null;
        }
    }

    public static ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> a(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c>> concurrentHashMap = d;
        if (concurrentHashMap == null) {
            f fVarA = f.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            if (fVarA != null) {
                fVarA.d(str, "");
                d = new ConcurrentHashMap<>();
            }
        } else if (concurrentHashMap.containsKey(str)) {
            return d.get(str);
        }
        return null;
    }

    public static String b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        return (TextUtils.isEmpty(str) || (concurrentHashMap = f) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f.get(str)) == null || copyOnWriteArrayList.size() <= 0) ? "" : copyOnWriteArrayList.get(0);
    }

    public static com.mbridge.msdk.foundation.entity.d b(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        com.mbridge.msdk.foundation.entity.d dVar = new com.mbridge.msdk.foundation.entity.d();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return dVar;
        }
        try {
            ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = e;
            if (concurrentHashMap2 != null && concurrentHashMap2.containsKey(str) && (concurrentHashMap = e.get(str)) != null && concurrentHashMap.containsKey(str2)) {
                dVar.a(1);
                dVar.c(concurrentHashMap.get(str2));
            }
        } catch (Exception e2) {
            ad.a(n, e2.getMessage());
        }
        return dVar;
    }

    public static void a(String str, CampaignEx campaignEx, String str2) {
        Map<String, List<com.mbridge.msdk.foundation.same.d.a>> mapD = d(str2);
        if (campaignEx == null || mapD == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(campaignEx.getId())) {
                return;
            }
            com.mbridge.msdk.foundation.same.d.a aVar = new com.mbridge.msdk.foundation.same.d.a(campaignEx.getId(), campaignEx.getRequestIdNotice());
            if (mapD.containsKey(str)) {
                List<com.mbridge.msdk.foundation.same.d.a> list = mapD.get(str);
                if (list != null && list.size() == 20) {
                    list.remove(0);
                }
                if (list != null) {
                    list.add(aVar);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            mapD.put(str, arrayList);
        } catch (Throwable th) {
            ad.a(n, th.getMessage(), th);
        }
    }

    public static void c(String str, String str2) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c>> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = d) == null || !concurrentHashMap.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            d.remove(str);
            return;
        }
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMap2 = d.get(str);
        if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str2)) {
            return;
        }
        concurrentHashMap2.remove(str2);
    }

    public static void c(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f.get(str)) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        copyOnWriteArrayList.remove(0);
    }

    public static void d(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = e;
            if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str) || (concurrentHashMap = e.get(str2)) == null || !concurrentHashMap.containsKey(str2)) {
                return;
            }
            concurrentHashMap.remove(str2);
        } catch (Exception e2) {
            ad.a(n, e2.getMessage());
        }
    }
}
