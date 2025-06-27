package com.mbridge.msdk.videocommon.d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RewardSettingManager.java */
/* loaded from: classes4.dex */
public class b {
    private static volatile b d;
    private volatile boolean c = false;
    private CopyOnWriteArrayList<String> e = new CopyOnWriteArrayList<>();
    private static ConcurrentHashMap<String, c> b = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public static a f3881a = null;

    private b() {
    }

    public static b a() {
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b();
                }
            }
        }
        return d;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.e.add(str);
        } catch (Exception unused) {
        }
    }

    public final void b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.e.remove(str);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mbridge.msdk.videocommon.d.a b() {
        /*
            r7 = this;
            com.mbridge.msdk.videocommon.d.a r0 = com.mbridge.msdk.videocommon.d.b.f3881a
            if (r0 != 0) goto L77
            com.mbridge.msdk.foundation.a.a.a r0 = com.mbridge.msdk.foundation.a.a.a.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "reward_"
            r1.append(r2)
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r2 = r2.k()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.a(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L60
            com.mbridge.msdk.videocommon.d.a r0 = com.mbridge.msdk.videocommon.d.a.a(r0)
            if (r0 == 0) goto L44
            long r1 = r0.d()
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.i()
            long r5 = r5 + r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L44
            r1 = 0
            goto L45
        L44:
            r1 = 1
        L45:
            if (r1 != 0) goto L48
            return r0
        L48:
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.k()
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r1 = r1.b()
            r7.g(r0, r1)
            com.mbridge.msdk.videocommon.d.a r0 = r7.c()
            return r0
        L60:
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.k()
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r1 = r1.b()
            r7.g(r0, r1)
            com.mbridge.msdk.videocommon.d.a r0 = r7.c()
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.d.b.b():com.mbridge.msdk.videocommon.d.a");
    }

    private void g(String str, String str2) {
        if (this.c) {
            return;
        }
        this.c = true;
        new com.mbridge.msdk.videocommon.c.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2);
    }

    public final void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.c.c cVar) {
        if (!TextUtils.isEmpty(str3) && !this.e.contains(str3)) {
            a(str3);
            new com.mbridge.msdk.videocommon.c.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, str3, cVar);
            return;
        }
        ad.a("test_reward_unit_setting", "unitID: " + str3 + " is requesting");
    }

    public final c a(String str, String str2) {
        c cVar;
        String str3 = "reward_" + str + "_" + str2;
        if (b.containsKey(str3)) {
            boolean zA = false;
            try {
                cVar = b.get(str3);
                try {
                    zA = a(cVar);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                cVar = null;
            }
            if (zA) {
                a(str, com.mbridge.msdk.foundation.controller.c.m().b(), str2, null);
            }
            return cVar;
        }
        c cVarC = c.c(com.mbridge.msdk.foundation.a.a.a.a().a(str3));
        if (a(cVarC)) {
            a(str, com.mbridge.msdk.foundation.controller.c.m().b(), str2, null);
            return null;
        }
        b.put(str3, cVarC);
        return cVarC;
    }

    public final c a(String str, String str2, boolean z) {
        c cVar;
        String str3 = "reward_" + str + "_" + str2;
        if (b.containsKey(str3)) {
            boolean zA = false;
            try {
                cVar = b.get(str3);
                try {
                    zA = a(cVar);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                cVar = null;
            }
            if (zA) {
                a(str, com.mbridge.msdk.foundation.controller.c.m().b(), str2, null);
            }
            return cVar;
        }
        c cVarC = c.c(com.mbridge.msdk.foundation.a.a.a.a().a(str3));
        if (!a(cVarC)) {
            b.put(str3, cVarC);
            return cVarC;
        }
        if (cVarC != null) {
            return cVarC;
        }
        a(str, com.mbridge.msdk.foundation.controller.c.m().b(), str2, null);
        return b(z);
    }

    public final a c() {
        a aVar = new a();
        HashMap map = new HashMap(5);
        map.put("1", 1000);
        map.put("9", 1000);
        map.put("8", 1000);
        HashMap map2 = new HashMap(3);
        map2.put("1", new com.mbridge.msdk.videocommon.b.c("Virtual Item", 1));
        aVar.a(map);
        aVar.b(map2);
        aVar.a(43200L);
        aVar.b(5400L);
        aVar.c(3600L);
        aVar.d(3600L);
        aVar.e(5L);
        aVar.a(1);
        return aVar;
    }

    private final boolean a(c cVar) {
        a aVarB = b();
        if (aVarB == null || cVar == null) {
            return true;
        }
        return cVar.x() + aVarB.e() <= System.currentTimeMillis();
    }

    public final void a(String str, String str2, String str3) {
        String str4 = "reward_" + str + "_" + str2;
        com.mbridge.msdk.foundation.a.a.a.a().a(str4, str3);
        b.put(str4, c.c(str3));
        if (com.mbridge.msdk.f.b.a() || TextUtils.isEmpty(c.f3883a)) {
            return;
        }
        h(c.f3883a, str2);
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a().a(com.mbridge.msdk.foundation.controller.c.m().k(), str, false);
        String str2 = c.f3883a;
        if (TextUtils.isEmpty(str2) || !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str2))) {
            return;
        }
        h(str2, str);
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str2))) {
            return;
        }
        h(str2, str);
    }

    private void h(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, 2, "alert url is exception ,url:" + str);
            return;
        }
        H5DownLoadManager.getInstance().downloadH5Res(new com.mbridge.msdk.foundation.same.report.d.b(true), str, new H5DownLoadManager.ZipDownloadListener() { // from class: com.mbridge.msdk.videocommon.d.b.1
            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
            public final void onSuccess(String str3, String str4, boolean z) {
                k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, 1, "");
            }

            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
            public final void onFailed(String str3, String str4) {
                k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, 2, str4);
            }
        });
    }

    public final void c(String str, String str2) {
        com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str, str2);
        f3881a = a.a(str2);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.e.contains(str);
    }

    public static boolean e(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String strOptString = jSONArrayOptJSONArray.optJSONObject(0).optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    if (!TextUtils.isEmpty(strOptString)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final void f(String str) {
        try {
            String strA = com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            c(str, jSONObject.toString());
        } catch (Throwable th) {
            ad.b("RewardSettingManager", th.getMessage());
        }
    }

    public final void d(String str, String str2) {
        try {
            String strA = com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str + "_" + str2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th) {
            ad.b("RewardSettingManager", th.getMessage());
        }
    }

    public final String g(String str) {
        return com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str);
    }

    public final String e(String str, String str2) {
        return com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str + "_" + str2);
    }

    public final c f(String str, String str2) {
        String str3 = "reward_" + str + "_" + str2;
        if (b.containsKey(str3)) {
            return b.get(str3);
        }
        c cVarC = c.c(com.mbridge.msdk.foundation.a.a.a.a().a(str3));
        if (cVarC != null) {
            b.put(str3, cVarC);
        }
        return cVarC;
    }

    public final a e() {
        String str = "reward_" + com.mbridge.msdk.foundation.controller.c.m().k();
        if (f3881a == null) {
            String strA = com.mbridge.msdk.foundation.a.a.a.a().a(str);
            if (!TextUtils.isEmpty(strA)) {
                a aVarA = a.a(strA);
                if (aVarA != null) {
                    f3881a = aVarA;
                }
                return aVarA;
            }
        }
        return f3881a;
    }

    public final c b(boolean z) {
        c cVar = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.mbridge.msdk.videocommon.b.b(1, 60, null));
            cVar.a((List<com.mbridge.msdk.videocommon.b.b>) arrayList);
            cVar.m(1);
            cVar.l(1);
            cVar.n(1);
            cVar.q(1);
            cVar.o(1);
            cVar.p(1);
            cVar.h(3);
            cVar.i(80);
            cVar.j(100);
            cVar.k(0);
            cVar.g(2);
            cVar.e(-1);
            cVar.x(70);
            cVar.d(2);
            if (z) {
                cVar.c(5);
            } else {
                cVar.c(-1);
            }
            cVar.b(0);
            cVar.a(0);
            cVar.f(1);
            cVar.r(1);
            cVar.t(3);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(4);
            arrayList2.add(6);
            cVar.a(arrayList2);
            cVar.u(1);
            cVar.v(1);
            cVar.w(60);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cVar;
    }
}
