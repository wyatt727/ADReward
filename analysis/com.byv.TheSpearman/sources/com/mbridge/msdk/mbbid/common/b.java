package com.mbridge.msdk.mbbid.common;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ak;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: BidCommon.java */
/* loaded from: classes4.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, String> f3088a = new HashMap();
    public static JSONArray b;

    public static String a(Context context, String str) {
        HashMap map = new HashMap();
        map.put(BidConstants.BID_FILTER_KEY_UNIT_ID, str);
        return a(context, map);
    }

    public static String a(Context context, Map<String, String> map) {
        String md5;
        f3088a = map;
        try {
            if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
                com.mbridge.msdk.foundation.controller.c.m().b(context);
            }
            if (b == null) {
                b = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k()).ak();
            }
            md5 = SameMD5.getMD5(ai.d());
            try {
                if (b(context, md5)) {
                    return "";
                }
                Map<String, String> map2 = f3088a;
                return a(context, (map2 == null || !map2.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) ? "" : f3088a.get(BidConstants.BID_FILTER_KEY_UNIT_ID), md5);
            } catch (Exception unused) {
                return a(context, "", md5);
            }
        } catch (Exception unused2) {
            md5 = "";
        }
    }

    private static String a(Context context, String str, String str2) {
        long jA;
        StringBuffer stringBuffer = new StringBuffer();
        if (context != null) {
            try {
                if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
                    com.mbridge.msdk.foundation.controller.c.m().b(context);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("BidCommon", e.getMessage());
                }
            }
        }
        g gVarB = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (gVarB == null) {
            h.a();
            gVarB = i.a();
        }
        stringBuffer.append(z.c());
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(z.w());
        stringBuffer.append("|");
        stringBuffer.append(z.m());
        stringBuffer.append("|");
        stringBuffer.append(z.l(context));
        stringBuffer.append("|");
        stringBuffer.append(MBConfiguration.SDK_VERSION);
        stringBuffer.append("|");
        stringBuffer.append(z.i(context));
        stringBuffer.append("x");
        stringBuffer.append(z.g(context));
        stringBuffer.append("|");
        stringBuffer.append(z.g());
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append(ai.b(20));
        stringBuffer.append("|");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.same.a.d);
        stringBuffer.append("|");
        stringBuffer.append(z.o());
        stringBuffer.append("|");
        stringBuffer.append(z.f());
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append(ag.b());
        stringBuffer.append("|");
        stringBuffer.append(ag.a());
        stringBuffer.append("|");
        try {
            jA = y.a();
        } catch (Exception unused) {
            jA = 0;
        }
        if (jA > 0) {
            stringBuffer.append(jA);
            stringBuffer.append("|");
        } else {
            stringBuffer.append("");
            stringBuffer.append("|");
        }
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.a.a.a.a().a("c"));
        stringBuffer.append("|");
        stringBuffer.append(z.i());
        String strA = gVarB != null ? gVarB.a() : "";
        stringBuffer.append("|");
        stringBuffer.append(strA);
        stringBuffer.append("|");
        stringBuffer.append(ai.a());
        stringBuffer.append("|");
        String strC = ai.c();
        if (TextUtils.isEmpty(strC)) {
            strC = "";
        }
        stringBuffer.append(strC);
        stringBuffer.append("|");
        stringBuffer.append(ai.c(str));
        stringBuffer.append("|");
        if (gVarB != null && gVarB.au() == 1 && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            stringBuffer.append("");
        }
        stringBuffer.append("|");
        stringBuffer.append(z.y());
        stringBuffer.append("|");
        stringBuffer.append(z.u(context));
        stringBuffer.append("|");
        stringBuffer.append(z.t() + "");
        stringBuffer.append("|");
        stringBuffer.append(z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
        stringBuffer.append("|");
        stringBuffer.append(z.u());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.c.a() ? "1" : "2");
        stringBuffer.append("|");
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            stringBuffer.append("");
        }
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("1");
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f());
        stringBuffer.append("|");
        if (z.q() != 0) {
            stringBuffer.append(z.q() + "");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            stringBuffer.append("|");
            stringBuffer.append(1);
        } else {
            stringBuffer.append("|");
            stringBuffer.append("");
        }
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append(str2);
        stringBuffer.append("|");
        stringBuffer.append(z.k(context));
        stringBuffer.append("|");
        stringBuffer.append(z.j(context));
        stringBuffer.append("|");
        stringBuffer.append(z.d());
        stringBuffer.append("|");
        stringBuffer.append(z.a());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.f.c.f2747a);
        stringBuffer.append("|");
        stringBuffer.append("");
        return x.b(stringBuffer.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
    
        r14 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
    
        if (r5 <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        if ((r14 - r5) >= (r9.optInt("ttl") * 1000)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        r4 = r9.optDouble("rate");
        r0 = new java.util.Random().nextInt(100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
    
        if (r4 == com.google.firebase.remoteconfig.FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        if ((r4 * 100.0d) < r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0107, code lost:
    
        r0 = 1;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010a, code lost:
    
        r0 = 2;
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
    
        r5 = r0;
        r16 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0110, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0111, code lost:
    
        r4 = r9;
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
    
        a(r19, r11, r14);
        r16 = 1;
        r4 = 0;
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011b, code lost:
    
        r0 = r4;
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
    
        a(r19, r11, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        r16 = 1;
        r4 = r9;
        r0 = 0;
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0127, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
    
        r6 = 1;
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0140, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("BidCommon", r0.getMessage());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0153 A[Catch: all -> 0x0287, TryCatch #4 {all -> 0x0287, blocks: (B:71:0x0149, B:73:0x0153, B:75:0x01a3, B:77:0x01a9, B:78:0x01c4, B:80:0x01df, B:82:0x01e7, B:83:0x020a, B:85:0x0214, B:86:0x0237, B:88:0x0241, B:89:0x0264, B:91:0x0273, B:92:0x027f), top: B:111:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0296 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean b(android.content.Context r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbid.common.b.b(android.content.Context, java.lang.String):boolean");
    }

    private static void a(Context context, String str, long j) {
        ak.a(context, str, Long.valueOf(j));
    }

    private static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        for (String str3 : str.split("-")) {
            if (!TextUtils.isEmpty(str3) && str3.length() > 2 && str3.startsWith("{") && str3.endsWith("}")) {
                String strSubstring = str3.substring(1, str3.length() - 1);
                Map<String, String> map = f3088a;
                if (map != null && map.containsKey(strSubstring)) {
                    String strValueOf = String.valueOf(f3088a.get(strSubstring));
                    if (!TextUtils.isEmpty(strValueOf)) {
                        str = str.replace(str3, strValueOf + "");
                    }
                } else if (BidConstants.BID_FILTER_KEY_NETWORK.equals(str3)) {
                    str = str.replace(str3, z.l(com.mbridge.msdk.foundation.controller.c.m().c()) + "");
                }
            }
        }
        return str.equals(str2);
    }

    private static void a(String str, int i) {
        d dVar = new d();
        dVar.a("filter", Integer.valueOf(i));
        dVar.a("lrid", str);
        com.mbridge.msdk.foundation.same.report.d.c.a().b("2000124", dVar);
    }
}
