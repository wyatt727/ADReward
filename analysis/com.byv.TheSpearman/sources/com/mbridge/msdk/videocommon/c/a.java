package com.mbridge.msdk.videocommon.c;

import android.content.Context;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardSettingController.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3876a = "com.mbridge.msdk.videocommon.c.a";

    public final void a(Context context, final String str, String str2) {
        e eVar = new e();
        eVar.a("app_id", str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            com.mbridge.msdk.videocommon.d.a aVarE = com.mbridge.msdk.videocommon.d.b.a().e();
            if (aVarE == null) {
                eVar.a("vtag", "");
            } else {
                String strA = aVarE.a();
                if (TextUtils.isEmpty(strA)) {
                    strA = "";
                }
                eVar.a("vtag", strA);
            }
        } catch (Throwable th) {
            ad.b(f3876a, th.getMessage());
        }
        new b(context).get(1, d.f().I, eVar, new com.mbridge.msdk.foundation.same.net.h.d() { // from class: com.mbridge.msdk.videocommon.c.a.1
            @Override // com.mbridge.msdk.foundation.same.net.h.d
            public final void a(JSONObject jSONObject) {
                try {
                    if (ai.a(jSONObject)) {
                        com.mbridge.msdk.videocommon.d.b.a().a(false);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String strG = com.mbridge.msdk.videocommon.d.b.a().g(str);
                            if (!TextUtils.isEmpty(strG)) {
                                try {
                                    jSONObject = h.a().a(new JSONObject(strG), jSONObject);
                                } catch (Exception e) {
                                    ad.b(a.f3876a, e.getMessage());
                                }
                            }
                        }
                        try {
                            jSONObject.put("current_time", System.currentTimeMillis());
                            com.mbridge.msdk.videocommon.d.b.a().c(str, jSONObject.toString());
                        } catch (JSONException e2) {
                            ad.b(a.f3876a, e2.getMessage());
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().f(str);
                    }
                    a.this.a(1, 2, "");
                } catch (Throwable th2) {
                    ad.b(a.f3876a, th2.getMessage());
                }
            }

            @Override // com.mbridge.msdk.foundation.same.net.h.d
            public final void a(String str3) {
                com.mbridge.msdk.videocommon.d.b.a().a(false);
                ad.b(a.f3876a, str3);
                a.this.a(2, 2, str3);
            }
        });
        a(3, 2, "");
    }

    public final void a(Context context, final String str, String str2, String str3, final c cVar) {
        e eVar = new e();
        eVar.a("app_id", str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        eVar.a("unit_ids", t2.i.d + str3 + t2.i.e);
        try {
            com.mbridge.msdk.videocommon.d.c cVarF = com.mbridge.msdk.videocommon.d.b.a().f(str, str3);
            if (cVarF == null) {
                eVar.a("vtag", "");
            } else {
                String strJ = cVarF.j();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "";
                }
                eVar.a("vtag", strJ);
            }
        } catch (Throwable th) {
            ad.b(f3876a, th.getMessage());
        }
        com.mbridge.msdk.foundation.same.net.h.d dVar = new com.mbridge.msdk.foundation.same.net.h.d() { // from class: com.mbridge.msdk.videocommon.c.a.2
            @Override // com.mbridge.msdk.foundation.same.net.h.d
            public final void a(final JSONObject jSONObject) {
                try {
                    try {
                        com.mbridge.msdk.videocommon.d.b.a().b(this.unitId);
                    } catch (Exception e) {
                        ad.b(a.f3876a, e.getMessage());
                    }
                    if (ai.a(jSONObject)) {
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String strE = com.mbridge.msdk.videocommon.d.b.a().e(str, this.unitId);
                            if (!TextUtils.isEmpty(strE)) {
                                try {
                                    jSONObject = h.a().a(new JSONObject(strE), jSONObject);
                                } catch (Exception e2) {
                                    ad.b(a.f3876a, e2.getMessage());
                                }
                            }
                        }
                        if (com.mbridge.msdk.videocommon.d.b.e(jSONObject.toString())) {
                            jSONObject.put("current_time", System.currentTimeMillis());
                            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.videocommon.c.a.2.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.mbridge.msdk.videocommon.d.b.a().a(str, AnonymousClass2.this.unitId, jSONObject.toString());
                                }
                            };
                            com.mbridge.msdk.foundation.controller.d.a();
                            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
                            c cVar2 = cVar;
                            if (cVar2 != null) {
                                cVar2.a("request success");
                            }
                        } else {
                            c cVar3 = cVar;
                            if (cVar3 != null) {
                                cVar3.b("data error");
                            }
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().d(str, this.unitId);
                    }
                    a.this.a(1, 3, "");
                } catch (Throwable th2) {
                    ad.b(a.f3876a, th2.getMessage());
                }
            }

            @Override // com.mbridge.msdk.foundation.same.net.h.d
            public final void a(String str4) {
                try {
                    com.mbridge.msdk.videocommon.d.b.a().b(this.unitId);
                } catch (Exception e) {
                    ad.b(a.f3876a, e.getMessage());
                }
                if (!TextUtils.isEmpty(str4)) {
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.b(str4);
                    }
                } else {
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        cVar3.b("request error");
                    }
                }
                a.this.a(2, 3, str4);
            }
        };
        dVar.setUnitId(str3);
        new b(context).get(1, d.f().I, eVar, dVar);
        a(3, 3, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, String str) {
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(t2.h.W, "2000112");
            dVar.a("st_net", Integer.valueOf(d.f().s));
            dVar.a("result", Integer.valueOf(i));
            dVar.a("type", Integer.valueOf(i2));
            dVar.a("url", d.f().r ? d.f().J : d.f().I);
            dVar.a("reason", str);
            bVar.a("2000112", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000112", bVar);
        } catch (Throwable th) {
            ad.b(f3876a, th.getMessage());
        }
    }
}
