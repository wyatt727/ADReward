package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.json.i5;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.File;
import java.net.URLEncoder;

/* compiled from: ReportController.java */
/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2937a = "i";
    private final Context b;
    private int c;

    public final void a(com.mbridge.msdk.foundation.entity.l lVar) {
    }

    public i(Context context, int i) {
        this.c = 0;
        this.b = context;
        this.c = i;
    }

    public i(Context context) {
        this.c = 0;
        this.b = context.getApplicationContext();
    }

    public final void a(String str, com.mbridge.msdk.foundation.entity.e eVar, String str2) {
        com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.b);
        String strA = com.mbridge.msdk.foundation.entity.e.a(eVar);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        if (e.a().b()) {
            e.a().a(strA);
        } else {
            aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, k.a(strA, this.b, str2), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.9
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(String str3) {
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str3) {
                }
            });
        }
    }

    public final void a(final String str, String str2, String str3, Frame frame) {
        com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.b);
        com.mbridge.msdk.foundation.same.net.h.e eVarA = k.a(str2, this.b, str3);
        if (frame != null) {
            eVarA.a("session_id", frame.getSessionId());
            eVarA.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_PARENT_SESSION_ID, frame.getParentSessionId());
        }
        aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, eVarA, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.10
            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onFailed(String str4) {
            }

            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onSuccess(String str4) {
                if ("click_duration".equals(str) || "load_duration".equals(str)) {
                    com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.i.10.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.mbridge.msdk.foundation.controller.d.a().b();
                        }
                    });
                }
            }
        });
    }

    public final void a(int i, int i2, String str, String str2, String str3) {
        Context context = this.b;
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(context);
            StringBuilder sb = new StringBuilder();
            sb.append(t2.h.W);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode("2000058", m4.M));
            sb.append(t2.i.c);
            sb.append("appid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(com.mbridge.msdk.foundation.controller.c.m().k(), m4.M));
            sb.append(t2.i.c);
            sb.append("dl_type");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(i + "", m4.M));
            sb.append(t2.i.c);
            sb.append("dl_link_type");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(i2 + "", m4.M));
            sb.append(t2.i.c);
            sb.append("rid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str, m4.M));
            sb.append(t2.i.c);
            sb.append("rid_n");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str2, m4.M));
            sb.append(t2.i.c);
            sb.append("cid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str3, m4.M));
            sb.append(t2.i.c);
            sb.append("tgt_v");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(z.t(context) + "", m4.M));
            sb.append(t2.i.c);
            sb.append("app_v_n");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(z.p(context) + "", m4.M));
            sb.append(t2.i.c);
            sb.append("app_v_c");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(z.q(context) + "", m4.M));
            if (e.a().b()) {
                e.a().a(sb.toString());
            } else {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, k.a(sb.toString(), context, ""), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.j.1
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str4) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str4) {
                    }

                    AnonymousClass1() {
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("ReportControllerDiff", e.getMessage());
            }
        }
    }

    public final void a(String str, final File file) {
        new com.mbridge.msdk.foundation.same.report.e.a(this.b).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, k.a(this.b, str), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.11
            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onFailed(String str2) {
            }

            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onSuccess(String str2) {
                File file2 = file;
                if (file2 != null) {
                    file2.delete();
                }
            }
        });
    }

    public final void a(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.b);
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append("hb=");
                sb.append(1);
                sb.append(t2.i.c);
            }
            sb.append(t2.h.W);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode("2000065", m4.M));
            sb.append(t2.i.c);
            sb.append("rid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str, m4.M));
            sb.append(t2.i.c);
            sb.append("rid_n");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str2, m4.M));
            sb.append(t2.i.c);
            sb.append("cid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str3, m4.M));
            sb.append(t2.i.c);
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str4, m4.M));
            sb.append(t2.i.c);
            sb.append(CampaignEx.JSON_KEY_CLICK_URL);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str5, m4.M));
            if (e.a().b()) {
                e.a().a(sb.toString());
            } else {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, k.a(sb.toString(), this.b, str4), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.1
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str6) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str6) {
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final void b(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.b);
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append("hb=");
                sb.append(1);
                sb.append(t2.i.c);
            }
            sb.append(t2.h.W);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode("2000066", m4.M));
            sb.append(t2.i.c);
            sb.append("rid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str, m4.M));
            sb.append(t2.i.c);
            sb.append("rid_n");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str2, m4.M));
            sb.append(t2.i.c);
            sb.append("cid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str3, m4.M));
            sb.append(t2.i.c);
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str4, m4.M));
            sb.append(t2.i.c);
            sb.append("err_method");
            sb.append(t2.i.b);
            sb.append(str5);
            if (e.a().b()) {
                e.a().a(sb.toString());
            } else {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, k.a(sb.toString(), this.b, str4), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.2
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str6) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str6) {
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final void a(final com.mbridge.msdk.foundation.entity.l lVar, final Boolean bool) {
        if (lVar != null) {
            if (lVar.b().equals("GET")) {
                new com.mbridge.msdk.foundation.same.report.e.a(this.b).get(0, lVar.f(), null, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.3
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str) {
                        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.i.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    if (i.this.b != null && lVar != null) {
                                        com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(i.this.b)).a(lVar.f());
                                        if (!bool.booleanValue() || com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(i.this.b)).b() <= 20) {
                                            return;
                                        }
                                        com.mbridge.msdk.foundation.controller.d.a().b();
                                    }
                                } catch (Exception e) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.a(i.f2937a, "reportNetError", e);
                                    }
                                }
                            }
                        });
                    }
                });
                return;
            }
            if (lVar.b().equals("POST")) {
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.b);
                if (TextUtils.isEmpty(lVar.a())) {
                    return;
                }
                com.mbridge.msdk.foundation.same.net.h.e eVarA = k.a(lVar.a(), this.b, lVar.e());
                if (lVar.d() > 0) {
                    eVarA.a("retry", lVar.d() + "");
                }
                aVar.post(0, lVar.f(), eVarA, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.4
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str) {
                        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.i.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (i.this.b == null || lVar == null) {
                                    return;
                                }
                                try {
                                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(i.this.b)).a(lVar.a(), lVar.f(), lVar.c());
                                    if (!bool.booleanValue() || com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(i.this.b)).a() <= 0) {
                                        return;
                                    }
                                    com.mbridge.msdk.foundation.controller.d.a().b();
                                } catch (Exception e) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.a(i.f2937a, "reportNetError", e);
                                    }
                                }
                            }
                        });
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str) {
                        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.i.4.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (i.this.b == null || lVar == null) {
                                    return;
                                }
                                com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(i.this.b)).a(lVar);
                            }
                        });
                    }
                });
            }
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.b);
            StringBuilder sb = new StringBuilder();
            int iL = z.l(this.b);
            sb.append(t2.h.W);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode("2000071", m4.M));
            sb.append(t2.i.c);
            sb.append("rid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str, m4.M));
            sb.append(t2.i.c);
            sb.append("rid_n");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str2, m4.M));
            sb.append(t2.i.c);
            sb.append("cid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str3, m4.M));
            sb.append(t2.i.c);
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str4, m4.M));
            sb.append(t2.i.c);
            sb.append("reason");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str5, m4.M));
            sb.append(t2.i.c);
            sb.append("network_type");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(iL + "", m4.M));
            sb.append(t2.i.c);
            sb.append("result");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode("0", m4.M));
            if (e.a().b()) {
                e.a().a(sb.toString());
            } else {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, k.a(sb.toString(), this.b, str4), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.5
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str6) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str6) {
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final void a() {
        try {
            if (k.a()) {
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.b);
                String strK = com.mbridge.msdk.foundation.controller.c.m().k();
                com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(strK);
                if (gVarB == null) {
                    com.mbridge.msdk.c.h.a();
                    gVarB = com.mbridge.msdk.c.i.a();
                }
                int iK = gVarB.K();
                String str = "key=2000053&Appid=" + strK + t2.i.c + "uptips2" + t2.i.b + gVarB.at() + t2.i.c + "info_status" + t2.i.b + com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().h() + t2.i.c + "iseu" + t2.i.b + iK;
                String strC = z.c();
                if (!TextUtils.isEmpty(strC)) {
                    str = str + t2.i.c + i5.w0 + t2.i.b + strC;
                }
                String str2 = str + t2.i.c + "GDPR_area" + t2.i.b + gVarB.aG() + t2.i.c + "GDPR_consent" + t2.i.b + com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g();
                if (e.a().b()) {
                    e.a().a(str2);
                    return;
                }
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, k.a(str2, this.b, ""), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.6
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str3) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str3) {
                    }
                });
                k.b();
            }
        } catch (Throwable th) {
            ad.b(f2937a, th.getMessage());
        }
    }

    public final void a(int i, String str) {
        new com.mbridge.msdk.foundation.same.report.e.a(this.b).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, k.a(NotificationCompat.CATEGORY_EVENT, k.a((Campaign) null, i, AdActivity.REQUEST_KEY_EXTRA), this.b, str), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.7
            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onFailed(String str2) {
            }

            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onSuccess(String str2) {
            }
        });
    }

    public final void a(String str, String str2, String str3) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.b);
            String str4 = "click_type=" + URLEncoder.encode("1", m4.M) + t2.i.c + "cid" + t2.i.b + URLEncoder.encode(str, m4.M) + t2.i.c + MBridgeConstans.PROPERTIES_UNIT_ID + t2.i.b + URLEncoder.encode(str2, m4.M) + t2.i.c + t2.h.W + t2.i.b + URLEncoder.encode("2000027", m4.M) + t2.i.c + "http_url" + t2.i.b + URLEncoder.encode(str3, m4.M);
            if (e.a().b()) {
                e.a().a(str4);
            } else {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, k.a(str4, this.b, str2), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.8
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str5) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str5) {
                    }
                });
            }
        } catch (Exception e) {
            ad.b(f2937a, e.getMessage());
        }
    }
}
