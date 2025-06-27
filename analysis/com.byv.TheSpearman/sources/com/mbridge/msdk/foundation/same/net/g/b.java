package com.mbridge.msdk.foundation.same.net.g;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: HttpUtils.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2887a = "b";

    public static String a(List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        com.mbridge.msdk.foundation.same.net.d.b bVarB = b(list, "Content-Type");
        if (bVarB != null) {
            String strB = bVarB.b();
            if (!TextUtils.isEmpty(strB)) {
                String[] strArrSplit = strB.split(";");
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split(t2.i.b);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals(m4.L)) {
                        return strArrSplit2[1];
                    }
                }
            }
        }
        return C.UTF8_NAME;
    }

    private static com.mbridge.msdk.foundation.same.net.d.b b(List<com.mbridge.msdk.foundation.same.net.d.b> list, String str) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                com.mbridge.msdk.foundation.same.net.d.b bVar = list.get(i);
                if (bVar != null && str.equals(bVar.a())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public static boolean b(List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        return TextUtils.equals(a(list, "Content-Encoding"), "gzip");
    }

    public static String a(List<com.mbridge.msdk.foundation.same.net.d.b> list, String str) {
        com.mbridge.msdk.foundation.same.net.d.b bVarB = b(list, str);
        return bVarB != null ? bVarB.b() : "";
    }

    public static void a(e eVar, String str, String str2) {
        if (eVar != null) {
            try {
                if (!an.a(str) && !an.a(str2)) {
                    eVar.a(str, str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith(ProxyConfig.MATCH_HTTP)) {
                str = ao.a(str);
            }
            if (!TextUtils.isEmpty(str) && com.mbridge.msdk.f.c.c()) {
                com.mbridge.msdk.foundation.same.net.a.a.a().a(str);
            }
        } catch (Throwable th) {
            ad.b(f2887a, th.getMessage());
        }
    }
}
