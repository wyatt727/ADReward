package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.json.m4;
import com.mbridge.msdk.e.w;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.net.URLEncoder;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetricsReportUtil.java */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g f2934a;
    private Executor b = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.report.g.1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("mb-common-report-thread");
            return threadNewThread;
        }
    });
    private volatile com.mbridge.msdk.e.m c;

    public static g a() {
        if (f2934a == null) {
            synchronized (g.class) {
                if (f2934a == null) {
                    f2934a = new g();
                }
            }
        }
        return f2934a;
    }

    public final void b() {
        if (this.c != null) {
            this.c.e();
        }
    }

    public final void c() {
        if (af.a().a("metrics", "e_t_l", af.a().a("e_t_l", 1)) == 1) {
            d().e();
        }
    }

    public final com.mbridge.msdk.e.m d() {
        if (this.c == null) {
            this.c = com.mbridge.msdk.e.m.a("mtg_sdk", com.mbridge.msdk.foundation.controller.c.m().c(), e());
            this.c.a(c.a());
            this.c.a();
        }
        return this.c;
    }

    private w e() {
        com.mbridge.msdk.e.o oVar;
        int iA = af.a().a("metrics", "t_m_e_t", af.a().a("t_m_e_t", 604800000));
        int iA2 = af.a().a("metrics", "t_m_e_s", af.a().a("t_m_e_s", 50));
        int iA3 = af.a().a("metrics", "t_m_r_c", af.a().a("t_m_r_c", 50));
        int iA4 = af.a().a("metrics", "t_m_t", af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS));
        int iA5 = af.a().a("metrics", "t_m_r_t_s", af.a().a("t_m_r_t_s", 2));
        int iA6 = af.a().a("metrics", "t_r_t", af.a().a("t_r_t", 1));
        if (iA6 != 0 && iA6 != 1) {
            iA6 = 0;
        }
        try {
            w.a aVarA = new w.a().e(iA).a(iA2).d(iA3).b(iA4).c(iA5).a(new d()).a(c.b()).a(new o());
            if (iA6 == 1) {
                oVar = new com.mbridge.msdk.e.o(new n((byte) 2), com.mbridge.msdk.foundation.same.net.g.d.f().i, com.mbridge.msdk.foundation.same.net.g.d.f().m);
            } else {
                oVar = new com.mbridge.msdk.e.o(new com.mbridge.msdk.e.a.a.g(), DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS, 0);
            }
            return aVarA.a(iA6, oVar).a();
        } catch (Exception e) {
            ad.b("EventLibraryReport", "configTrackManager error: " + e.getMessage());
            return null;
        }
    }

    public final void a(Context context, String str, String str2, String str3, String str4, int i) throws JSONException {
        com.mbridge.msdk.e.m mVarD = a().d();
        if (mVarD == null) {
            return;
        }
        if (!mVarD.a("2000105")) {
            ad.a("MetricsReportUtil", "reportClickImpException can not track");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str2)) {
                jSONObject.put("url", "");
            } else {
                jSONObject.put("url", URLEncoder.encode(str2, m4.M));
            }
            jSONObject.put("type", i);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("rid", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("rid_n", str4);
            }
            try {
                long[] jArrG = mVarD.g();
                jSONObject.put("track_time", jArrG[0]);
                jSONObject.put("track_count", jArrG[1]);
                jSONObject.put("session_id", mVarD.b());
            } catch (Exception unused) {
            }
            jSONObject.put("reason", URLEncoder.encode(str, m4.M));
            com.mbridge.msdk.e.e eVar = new com.mbridge.msdk.e.e("2000105");
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
            eVar.a(c.c());
            mVarD.a(eVar);
        } catch (Exception e) {
            ad.b("MetricsReportUtil", e.getMessage());
        }
    }
}
