package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.i5;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBConfiguration;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ReportUtil.java */
/* loaded from: classes4.dex */
public class k extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2953a = "k";

    public static boolean a() {
        try {
            return System.currentTimeMillis() - SignalManager.TWENTY_FOUR_HOURS_MILLIS > ((Long) al.a(com.mbridge.msdk.foundation.controller.c.m().c(), "privateAuthorityTimesTamp", 0L)).longValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static String a(Campaign campaign, int i, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", "adtrack");
            jSONObject.put(t2.h.h, str);
            jSONObject.put("label", i);
            if (campaign != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", campaign.getId());
                jSONObject2.put("title", campaign.getAppName());
                jSONObject.put("value", jSONObject2);
            } else {
                jSONObject.put("value", "");
            }
        } catch (Exception e) {
            ad.b(f2953a, e.getMessage());
        }
        return jSONObject.toString();
    }

    public static com.mbridge.msdk.foundation.same.net.h.e a(Context context, String str) {
        com.mbridge.msdk.foundation.same.net.h.e eVarA = a(context);
        eVarA.a("app_id", com.mbridge.msdk.foundation.controller.c.m().k() + "");
        if (!TextUtils.isEmpty(str)) {
            try {
                eVarA.a("data", URLEncoder.encode(str, m4.M));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return eVarA;
    }

    public static com.mbridge.msdk.foundation.same.net.h.e a(Context context) {
        String str = "1";
        com.mbridge.msdk.foundation.same.net.h.e eVar = new com.mbridge.msdk.foundation.same.net.h.e();
        try {
            eVar.a("platform", "1");
            eVar.a("package_name", URLEncoder.encode(z.e(context)));
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a("os_version", Build.VERSION.RELEASE);
                eVar.a("brand", URLEncoder.encode(z.w()));
                eVar.a(i5.u, URLEncoder.encode(z.h()));
                if (com.mbridge.msdk.f.b.a()) {
                    eVar.a(i5.w0, "");
                } else {
                    eVar.a(i5.w0, z.c());
                }
                eVar.a("mnc", z.k(context));
                eVar.a("mcc", z.j(context));
                int iL = z.l(context);
                eVar.a("network_type", iL + "");
                eVar.a("network_str", z.a(context, iL));
                eVar.a("language", URLEncoder.encode(z.s(context)));
                eVar.a("timezone", URLEncoder.encode(z.x()));
                eVar.a(i5.R, URLEncoder.encode(z.g()));
                eVar.a("adid_limit", z.a() + "");
                if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.b()) {
                    str = "0";
                }
                eVar.a("adid_limit_dev", str);
            }
            eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
            eVar.a("app_version_name", URLEncoder.encode(z.p(context)));
            eVar.a("orientation", URLEncoder.encode(z.r(context) + ""));
            eVar.a("screen_size", z.i(context) + "x" + z.g(context));
            if (com.mbridge.msdk.f.b.a()) {
                com.mbridge.msdk.foundation.same.net.h.f.b(eVar);
            }
            com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (gVarB == null) {
                com.mbridge.msdk.c.h.a();
                gVarB = com.mbridge.msdk.c.i.a();
            }
            if (gVarB != null) {
                JSONObject jSONObjectA = l.a(context, gVarB);
                if (!TextUtils.isEmpty(jSONObjectA.toString())) {
                    String strB = x.b(jSONObjectA.toString());
                    if (!TextUtils.isEmpty(strB)) {
                        eVar.a("dvi", strB);
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar;
    }

    public static JSONObject a(Context context, com.mbridge.msdk.c.g gVar) throws Exception {
        return l.a(context, gVar);
    }

    public static String a(String str, Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("key=" + str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                sb.append(t2.i.c + entry.getKey() + t2.i.b + entry.getValue());
            }
        }
        sb.append("\n");
        return sb.toString();
    }

    public static com.mbridge.msdk.foundation.same.net.h.e a(String str, String str2, Context context, String str3) {
        String string;
        if (context != null) {
            context = context.getApplicationContext();
        }
        com.mbridge.msdk.foundation.same.net.h.e eVar = new com.mbridge.msdk.foundation.same.net.h.e();
        eVar.a("m_device_info", c(context, str3));
        eVar.a("m_action", str);
        try {
            if (!TextUtils.isEmpty(str2)) {
                String strA = Aa.a();
                if (strA == null) {
                    strA = "";
                }
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("channel", strA);
                String str4 = com.mbridge.msdk.foundation.controller.c.b.get(str3);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("u_stid", str4 != null ? str4 : "");
                }
                string = jSONObject.toString();
            } else {
                JSONObject jSONObject2 = new JSONObject();
                String str5 = com.mbridge.msdk.foundation.controller.c.b.get(str3);
                if (!TextUtils.isEmpty(str5)) {
                    jSONObject2.put("u_stid", str5);
                }
                string = jSONObject2.toString();
            }
            str2 = string;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        eVar.a("m_data", str2);
        eVar.a("m_sdk", "msdk");
        return eVar;
    }

    private static String c(Context context, String str) throws JSONException {
        String str2 = "1";
        if (context == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pf", "1");
            jSONObject.put("ov", z.v());
            jSONObject.put("pn", z.e(context));
            jSONObject.put("vn", z.p(context));
            jSONObject.put("vc", z.q(context));
            jSONObject.put(CmcdConfiguration.KEY_OBJECT_TYPE, z.r(context));
            jSONObject.put("dm", z.h());
            jSONObject.put("bd", z.w());
            jSONObject.put(i5.w0, z.c());
            jSONObject.put("mnc", z.k(context));
            jSONObject.put("mcc", z.j(context));
            int iL = z.l(context);
            jSONObject.put("nt", iL);
            jSONObject.put("nts", z.a(context, iL));
            jSONObject.put(CmcdHeadersFactory.STREAM_TYPE_LIVE, z.s(context));
            jSONObject.put("tz", z.x());
            jSONObject.put(i5.R, z.g());
            jSONObject.put("app_id", com.mbridge.msdk.foundation.controller.c.m().k());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sv", MBConfiguration.SDK_VERSION);
            jSONObject.put("ss", z.i(context) + "x" + z.g(context));
            jSONObject.put("adid_limit", z.a());
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.b()) {
                str2 = "0";
            }
            jSONObject.put("adid_limit_dev", str2);
            if (com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k()) != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    try {
                        try {
                            String strL = z.l();
                            if (!TextUtils.isEmpty(strL)) {
                                jSONObject2.put("manufacturer", strL);
                            }
                            int iK = z.k();
                            if (iK != -1) {
                                jSONObject2.put("sdkint", iK);
                            }
                            String strM = z.m(context);
                            if (!TextUtils.isEmpty(strM)) {
                                jSONObject2.put("is24H", strM);
                            }
                            String strP = z.p();
                            if (!TextUtils.isEmpty(strP)) {
                                jSONObject2.put("totalram", strP);
                            }
                            String strN = z.n(context);
                            if (!TextUtils.isEmpty(strN)) {
                                jSONObject2.put("totalmemory", strN);
                            }
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("ReportUtilDiff", e.getMessage());
                            }
                        }
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("ReportUtilDiff", e2.getMessage());
                        }
                    }
                } catch (Throwable th) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("ReportUtilDiff", th.getMessage());
                    }
                }
                if (!TextUtils.isEmpty(jSONObject2.toString())) {
                    String strB = x.b(jSONObject2.toString());
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObject.put("dvi", URLEncoder.encode(strB, m4.M));
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e3) {
            e3.printStackTrace();
            return "";
        }
    }

    private static void a(final Context context, final String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, a(str, context, str2), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.k.1
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str3) {
                    ad.b(k.f2953a, str3);
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(String str3) {
                    com.mbridge.msdk.foundation.entity.l lVar = new com.mbridge.msdk.foundation.entity.l();
                    lVar.a(str);
                    lVar.a(System.currentTimeMillis());
                    lVar.a(0);
                    lVar.b("POST");
                    lVar.c(com.mbridge.msdk.foundation.same.net.g.d.f().c);
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(context)).a(lVar);
                    ad.b(k.f2953a, str3);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            ad.b(f2953a, e.getMessage());
        }
    }

    public static com.mbridge.msdk.foundation.same.net.h.e a(String str, Context context, String str2) {
        com.mbridge.msdk.foundation.same.net.h.e eVarA = a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(com.mbridge.msdk.foundation.controller.c.m().k());
        sb.append("");
        eVarA.a("app_id", sb.toString());
        eVarA.a(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
        try {
            if (!TextUtils.isEmpty(str2)) {
                String str3 = com.mbridge.msdk.foundation.controller.c.b.get(str2);
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(t2.i.c);
                    sb2.append("u_stid");
                    sb2.append(t2.i.b);
                    sb2.append(str3 != null ? str3 : "");
                    str = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("u_stid=");
                    sb3.append(str3 != null ? str3 : "");
                    str = sb3.toString();
                }
            }
            eVarA.a("data", URLEncoder.encode(str, m4.M));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        eVarA.a("m_sdk", "msdk");
        return eVarA;
    }

    public static void a(Context context, String str, String str2, int i, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000076&");
                    stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
                    stringBuffer.append("unit_id=" + str2 + t2.i.c);
                    stringBuffer.append("reason=" + str3 + t2.i.c);
                    stringBuffer.append("result=" + i + t2.i.c);
                    StringBuilder sb = new StringBuilder();
                    sb.append("url=");
                    sb.append(URLEncoder.encode(str, m4.M));
                    stringBuffer.append(sb.toString());
                    if (e.a().b()) {
                        e.a().a(stringBuffer.toString());
                    } else {
                        a(context, stringBuffer.toString(), str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i, String str3, int i2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000073&");
            stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
            stringBuffer.append("unit_id=" + str2 + t2.i.c);
            stringBuffer.append("cid=" + campaignEx.getId() + t2.i.c);
            stringBuffer.append("reason=" + str3 + t2.i.c);
            stringBuffer.append("result=" + i + t2.i.c);
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append(t2.i.c);
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + t2.i.c);
            if (i2 != -1) {
                stringBuffer.append("d_t=" + i2 + t2.i.c);
            }
            stringBuffer.append("url=" + URLEncoder.encode(str, m4.M));
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i, int i2, int i3) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000075&");
            stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
            stringBuffer.append("unit_id=" + str2 + t2.i.c);
            stringBuffer.append("cid=" + campaignEx.getId() + t2.i.c);
            stringBuffer.append("type=" + i + t2.i.c);
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append(t2.i.c);
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + t2.i.c);
            stringBuffer.append("statue=" + i2 + t2.i.c);
            if (i3 != -1) {
                stringBuffer.append("d_t=" + i3 + t2.i.c);
            }
            stringBuffer.append("url=" + URLEncoder.encode(str, m4.M));
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i, int i2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000074&");
            stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
            stringBuffer.append("unit_id=" + str2 + t2.i.c);
            stringBuffer.append("cid=" + campaignEx.getId() + t2.i.c);
            stringBuffer.append("type=" + i + t2.i.c);
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append(t2.i.c);
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + t2.i.c);
            if (i2 != -1) {
                stringBuffer.append("d_t=" + i2 + t2.i.c);
            }
            stringBuffer.append("url=" + URLEncoder.encode(str, m4.M));
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, String str, String str2, boolean z, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000047&");
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = com.mbridge.msdk.foundation.controller.c.b.get(str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("u_stid=");
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb.append(str3);
                    sb.append(t2.i.c);
                    stringBuffer.append(sb.toString());
                }
                if (campaignEx != null) {
                    stringBuffer.append("cid=" + campaignEx.getId() + t2.i.c);
                    stringBuffer.append("adtp=" + campaignEx.getAdType() + t2.i.c);
                    stringBuffer.append("rid=" + campaignEx.getRequestId());
                    stringBuffer.append(t2.i.c);
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + t2.i.c);
                }
                stringBuffer.append("st=" + System.currentTimeMillis() + t2.i.c);
                stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
                stringBuffer.append("unit_id=" + str2 + t2.i.c);
                stringBuffer.append("hb=");
                stringBuffer.append(z ? 1 : 0);
                stringBuffer.append(t2.i.c);
                stringBuffer.append("reason=" + str);
                if (e.a().b()) {
                    e.a().a(stringBuffer.toString());
                } else {
                    d(context, stringBuffer.toString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void d(final Context context, final String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, a(str, context), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.k.2
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str2) {
                    ad.b(k.f2953a, str2);
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(String str2) {
                    com.mbridge.msdk.foundation.entity.l lVar = new com.mbridge.msdk.foundation.entity.l();
                    lVar.a(str);
                    lVar.a(System.currentTimeMillis());
                    lVar.a(0);
                    lVar.b("POST");
                    lVar.c(com.mbridge.msdk.foundation.same.net.g.d.f().c);
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(context)).a(lVar);
                    ad.b(k.f2953a, str2);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            ad.b(f2953a, e.getMessage());
        }
    }

    public static com.mbridge.msdk.foundation.same.net.h.e a(String str, Context context) {
        com.mbridge.msdk.foundation.same.net.h.e eVarA = a(context);
        eVarA.a("app_id", com.mbridge.msdk.foundation.controller.c.m().k() + "");
        if (!TextUtils.isEmpty(str)) {
            try {
                eVarA.a("data", URLEncoder.encode(str, m4.M));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        eVarA.a("m_sdk", "msdk");
        return eVarA;
    }

    public static void a(Context context, List<CampaignEx> list, String str, boolean z) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.size() <= 0 || TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000048&");
            stringBuffer.append("st=" + System.currentTimeMillis() + t2.i.c);
            stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
            stringBuffer.append("unit_id=" + str + t2.i.c);
            CampaignEx campaignEx = list.get(0);
            stringBuffer.append("cid=" + campaignEx.getId() + t2.i.c);
            if (z) {
                stringBuffer.append("hb=");
                stringBuffer.append(1);
                stringBuffer.append(t2.i.c);
            }
            String requestId = campaignEx.getRequestId();
            if (!TextUtils.isEmpty(requestId)) {
                stringBuffer.append("rid=");
                stringBuffer.append(requestId);
                stringBuffer.append(t2.i.c);
            }
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (!TextUtils.isEmpty(requestIdNotice)) {
                stringBuffer.append("rid_n=");
                stringBuffer.append(requestIdNotice);
                stringBuffer.append(t2.i.c);
            }
            StringBuilder sb = new StringBuilder("rtins_type=");
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx2 = list.get(i);
                if (i < list.size() - 1) {
                    sb.append(campaignEx2.getRtinsType());
                    sb.append(",");
                } else {
                    sb.append(campaignEx2.getRtinsType());
                }
            }
            stringBuffer.append((CharSequence) sb);
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str);
            }
        } catch (Throwable th) {
            ad.b(f2953a, th.getMessage());
        }
    }

    public static void b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, a(str, context), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.k.3
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str2) {
                    ad.b(k.f2953a, str2);
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(String str2) {
                    ad.b(k.f2953a, str2);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            ad.b(f2953a, e.getMessage());
        }
    }

    public static void a(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000104&");
                if (!TextUtils.isEmpty(str2)) {
                    String str7 = com.mbridge.msdk.foundation.controller.c.b.get(str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("u_stid=");
                    if (str7 == null) {
                        str7 = "";
                    }
                    sb.append(str7);
                    sb.append(t2.i.c);
                    stringBuffer.append(sb.toString());
                }
                stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
                if (!TextUtils.isEmpty(str3)) {
                    stringBuffer.append("rid=" + str3 + t2.i.c);
                }
                if (!TextUtils.isEmpty(str4)) {
                    stringBuffer.append("rid_n=" + str4 + t2.i.c);
                }
                if (!TextUtils.isEmpty(str5)) {
                    stringBuffer.append("cid=" + str5 + t2.i.c);
                }
                if (!TextUtils.isEmpty(str6)) {
                    stringBuffer.append("template_id=" + str6 + t2.i.c);
                }
                stringBuffer.append("unit_id=" + str2 + t2.i.c);
                stringBuffer.append("hb=");
                stringBuffer.append(z ? 1 : 0);
                stringBuffer.append(t2.i.c);
                stringBuffer.append("reason=" + str);
                if (e.a().b()) {
                    e.a().a(stringBuffer.toString());
                } else {
                    d(context, stringBuffer.toString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (true ^ TextUtils.isEmpty(str2))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000054&");
                    stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
                    stringBuffer.append("unit_id=" + str + t2.i.c);
                    stringBuffer.append("reason=" + str2 + t2.i.c);
                    stringBuffer.append("result=1&");
                    stringBuffer.append("devid=" + z.c() + t2.i.c);
                    if (campaignEx != null) {
                        stringBuffer.append("cid=" + campaignEx.getId() + t2.i.c);
                        if (campaignEx.getAdType() == 287) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + t2.i.c);
                            stringBuffer.append("ad_type=3&");
                        } else if (campaignEx.getAdType() == 94) {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + t2.i.c);
                            stringBuffer.append("ad_type=1&");
                        } else if (campaignEx.getAdType() == 296) {
                            stringBuffer.append("ad_type=5&");
                            stringBuffer.append("creative=" + campaignEx.getCreativeId() + t2.i.c);
                        } else if (campaignEx.getAdType() == 297) {
                            stringBuffer.append("ad_type=6&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + t2.i.c);
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + t2.i.c);
                        } else if (campaignEx.getAdType() == 298) {
                            stringBuffer.append("ad_type=7&");
                            stringBuffer.append("ad_html=" + campaignEx.getAdHtml() + t2.i.c);
                            stringBuffer.append("ad_tpl_url=" + URLEncoder.encode(campaignEx.getAdZip()) + t2.i.c);
                        } else {
                            stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + t2.i.c);
                            stringBuffer.append("ad_type=1&");
                        }
                        stringBuffer.append("rid=");
                        stringBuffer.append(campaignEx.getRequestId());
                        stringBuffer.append(t2.i.c);
                        stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    }
                    if (e.a().b()) {
                        e.a().a(stringBuffer.toString());
                    } else {
                        a(context, stringBuffer.toString(), str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void b(Context context, CampaignEx campaignEx, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000054&");
            stringBuffer.append("network_type=");
            stringBuffer.append(z.l(context));
            stringBuffer.append(t2.i.c);
            stringBuffer.append("unit_id=");
            stringBuffer.append(str);
            stringBuffer.append(t2.i.c);
            stringBuffer.append("cid=");
            stringBuffer.append(campaignEx.getId());
            stringBuffer.append(t2.i.c);
            stringBuffer.append("reason=&");
            stringBuffer.append("result=2&");
            if (!TextUtils.isEmpty(str2)) {
                stringBuffer.append(str2);
            }
            if (campaignEx.getAdType() == 287) {
                stringBuffer.append("creative=");
                stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                stringBuffer.append(t2.i.c);
                stringBuffer.append("ad_type=3&");
            } else if (campaignEx.getAdType() == 94) {
                stringBuffer.append("creative=");
                stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                stringBuffer.append(t2.i.c);
                stringBuffer.append("ad_type=1&");
            } else if (campaignEx.getAdType() == 296) {
                stringBuffer.append("ad_type=5&");
                stringBuffer.append("creative=");
                stringBuffer.append(campaignEx.getCreativeId());
                stringBuffer.append(t2.i.c);
            } else if (campaignEx.getAdType() == 297) {
                stringBuffer.append("ad_type=6&");
                stringBuffer.append("creative=");
                stringBuffer.append(campaignEx.getCreativeId());
                stringBuffer.append(t2.i.c);
            } else if (campaignEx.getAdType() == 298) {
                stringBuffer.append("ad_type=7&");
                stringBuffer.append("creative=");
                stringBuffer.append(campaignEx.getCreativeId());
                stringBuffer.append(t2.i.c);
            } else {
                stringBuffer.append("creative=");
                stringBuffer.append(URLEncoder.encode(campaignEx.getendcard_url()));
                stringBuffer.append(t2.i.c);
                stringBuffer.append("ad_type=1&");
            }
            stringBuffer.append("devid=");
            stringBuffer.append(z.c());
            stringBuffer.append(t2.i.c);
            if (campaignEx != null) {
                if (campaignEx.isBidCampaign()) {
                    stringBuffer.append("hb=1&");
                }
                stringBuffer.append("rid=");
                stringBuffer.append(campaignEx.getRequestId());
                stringBuffer.append(t2.i.c);
                stringBuffer.append("rid_n=");
                stringBuffer.append(campaignEx.getRequestIdNotice());
                stringBuffer.append(t2.i.c);
                stringBuffer.append("adspace_t=");
                stringBuffer.append(campaignEx.getAdSpaceT());
            }
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i, int i2, String str2, int i3, int i4, int i5, String str3) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = null;
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(t2.h.W, URLEncoder.encode("2000094", m4.M));
            if (campaignEx != null) {
                dVar.a("rid", URLEncoder.encode(campaignEx.getRequestId(), m4.M));
                dVar.a("rid_n", URLEncoder.encode(campaignEx.getRequestIdNotice(), m4.M));
                dVar.a("cid", URLEncoder.encode(campaignEx.getId(), m4.M));
                bVar = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
            }
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str, m4.M));
            if (i == 0) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = "0";
                }
                dVar.a("video_prg", str3 + "");
            } else {
                dVar.a("video_prg", i + "");
            }
            dVar.a(TypedValues.CycleType.S_WAVE_PHASE, i2 + "");
            dVar.a("feedback_content", URLEncoder.encode(str2, m4.M));
            dVar.a("feedback_close", i3 + "");
            dVar.a("type", i5 + "");
            dVar.a("ad_type", i4 + "");
            dVar.a("network_type", URLEncoder.encode(String.valueOf(z.l(com.mbridge.msdk.foundation.controller.c.m().c())), m4.M));
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.d(str);
            bVar.b(i4);
            bVar.a("2000094", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000094", bVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c());
            String str2 = "key=2000088&state=" + str;
            ad.b(f2953a, str2);
            com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (gVarB == null || a(gVarB, str2)) {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, a(str2, com.mbridge.msdk.foundation.controller.c.m().c(), ""), null);
            }
        } catch (Throwable th) {
            ad.b(f2953a, th.getMessage());
        }
    }

    public static void b(String str) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c());
            StringBuilder sb = new StringBuilder();
            sb.append("key=");
            sb.append("2000090");
            sb.append(t2.i.c);
            sb.append("reason=");
            sb.append(TextUtils.isEmpty(str) ? "" : str);
            sb.append(t2.i.c);
            sb.append("result=");
            sb.append(!TextUtils.isEmpty(str));
            aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, a(sb.toString(), com.mbridge.msdk.foundation.controller.c.m().c(), ""), null);
        } catch (Exception e) {
            ad.b(f2953a, e.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, int i, String str, String str2) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000114&");
            stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
            StringBuilder sb = new StringBuilder();
            sb.append("gh_id=");
            String strEncode = "";
            sb.append(TextUtils.isEmpty(campaignEx.getGhId()) ? "" : URLEncoder.encode(campaignEx.getGhId(), m4.M));
            sb.append(t2.i.c);
            stringBuffer.append(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gh_path=");
            sb2.append(TextUtils.isEmpty(campaignEx.getGhPath()) ? "" : URLEncoder.encode(campaignEx.getGhPath(), m4.M));
            sb2.append(t2.i.c);
            stringBuffer.append(sb2.toString());
            stringBuffer.append("unit_id=" + str2 + t2.i.c);
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append(t2.i.c);
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + t2.i.c);
            stringBuffer.append("result=" + i + t2.i.c);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("reason=");
            if (!TextUtils.isEmpty(str)) {
                strEncode = URLEncoder.encode(str, m4.M);
            }
            sb3.append(strEncode);
            sb3.append(t2.i.c);
            stringBuffer.append(sb3.toString());
            stringBuffer.append("cid=" + campaignEx.getId());
            if (e.a().b()) {
                e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(int i, String str, String str2) {
        try {
            new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c()).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, a("key=2000080" + t2.i.c + "reason=" + str2 + t2.i.c + "ad_type=" + i + t2.i.c + "url=" + URLEncoder.encode(str, m4.M), com.mbridge.msdk.foundation.controller.c.m().c(), ""), null);
        } catch (Exception e) {
            ad.b(f2953a, e.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i, int i2, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c());
            StringBuilder sb = new StringBuilder();
            sb.append(t2.h.W);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode("2000121", m4.M));
            sb.append(t2.i.c);
            sb.append("rid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(campaignEx.getRequestId(), m4.M));
            sb.append(t2.i.c);
            sb.append("rid_n");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(campaignEx.getRequestIdNotice(), m4.M));
            sb.append(t2.i.c);
            sb.append("cid");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(campaignEx.getId(), m4.M));
            sb.append(t2.i.c);
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str, m4.M));
            sb.append(t2.i.c);
            sb.append("type");
            sb.append(t2.i.b);
            sb.append(i);
            sb.append(t2.i.c);
            sb.append("result");
            sb.append(t2.i.b);
            sb.append(i2);
            sb.append(t2.i.c);
            sb.append("reason");
            sb.append(t2.i.b);
            sb.append(URLEncoder.encode(str2, m4.M));
            if (e.a().b()) {
                e.a().a(sb.toString());
            } else {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, a(sb.toString(), com.mbridge.msdk.foundation.controller.c.m().c(), str), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.k.4
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str3) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str3) {
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public static void a(String str, int i, int i2, String str2, int i3, String str3) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(t2.h.W, URLEncoder.encode("m_water_mark_result", m4.M));
            dVar.a("water_mark_result", i2 + "");
            dVar.a("water_mark_error_msg", URLEncoder.encode(str2, m4.M));
            dVar.a("render_result", i3 + "");
            dVar.a("water_mark_str", URLEncoder.encode(str3, m4.M));
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.b(i);
            bVar.d(str);
            bVar.a("m_water_mark_result", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_water_mark_result", bVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b() {
        try {
            al.b(com.mbridge.msdk.foundation.controller.c.m().c(), "privateAuthorityTimesTamp", Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c() {
        try {
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.k.5
                @Override // java.lang.Runnable
                public final void run() {
                    String[] list;
                    try {
                        String strA = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_CRASH_INFO);
                        if (TextUtils.isEmpty(strA)) {
                            return;
                        }
                        File file = new File(strA);
                        if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
                            for (String str : list) {
                                File file2 = new File(strA + "/" + str);
                                if (file2.exists()) {
                                    String strB = ab.b(file2);
                                    if (!TextUtils.isEmpty(strB)) {
                                        String[] strArrSplit = strB.split("====");
                                        if (strArrSplit.length > 0) {
                                            new i(com.mbridge.msdk.foundation.controller.c.m().c()).a(strArrSplit[0], file2);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        ad.b(k.f2953a, th.getMessage());
                    }
                }
            });
        } catch (Throwable th) {
            ad.b(f2953a, th.getMessage());
        }
    }
}
