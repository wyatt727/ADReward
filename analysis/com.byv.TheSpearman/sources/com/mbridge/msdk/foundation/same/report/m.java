package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SameCommonReporter.java */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f2956a;
    private final String b;

    private m(a aVar) {
        this.b = aVar.b;
        this.f2956a = aVar.f2957a;
    }

    public final void a(String str) {
        String strA;
        if (TextUtils.isEmpty(this.b)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("key=");
        sb.append(this.b);
        com.mbridge.msdk.foundation.same.net.h.e eVarA = null;
        try {
            strA = a(this.f2956a);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameCommonReporter", e.getMessage());
            }
            strA = null;
        }
        if (!TextUtils.isEmpty(strA)) {
            sb.append(strA);
        }
        if (e.a().b()) {
            e.a().a(sb.toString());
            return;
        }
        try {
            eVarA = k.a(sb.toString(), com.mbridge.msdk.foundation.controller.c.m().c(), str);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameCommonReporter", e2.getMessage());
            }
        }
        if (eVarA == null || eVarA == null) {
            return;
        }
        try {
            new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c()).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, eVarA, new b());
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameCommonReporter", e3.getMessage());
            }
        }
    }

    private String a(Map<String, String> map) throws UnsupportedEncodingException {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String strEncode = map.get(str);
                        if (!TextUtils.isEmpty(strEncode)) {
                            try {
                                strEncode = URLEncoder.encode(strEncode, m4.M);
                            } catch (Exception e) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("SameCommonReporter", e.getMessage());
                                }
                            }
                            sb.append(t2.i.c);
                            sb.append(str);
                            sb.append(t2.i.b);
                            sb.append(strEncode);
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("SameCommonReporter", e2.getMessage());
                }
                sb = null;
            }
            if (sb != null && sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    /* compiled from: SameCommonReporter.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, String> f2957a = new HashMap();
        private final String b;

        public a(String str) {
            this.b = str;
        }

        public final m a() {
            return new m(this);
        }
    }

    /* compiled from: SameCommonReporter.java */
    private static final class b extends com.mbridge.msdk.foundation.same.report.e.b {
        @Override // com.mbridge.msdk.foundation.same.report.e.b
        public final void onSuccess(String str) {
            if (MBridgeConstans.DEBUG) {
                ad.a("SameCommonReporter", "report success for： " + str);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.report.e.b
        public final void onFailed(String str) {
            if (MBridgeConstans.DEBUG) {
                ad.a("SameCommonReporter", "report failed for： " + str);
            }
        }
    }
}
