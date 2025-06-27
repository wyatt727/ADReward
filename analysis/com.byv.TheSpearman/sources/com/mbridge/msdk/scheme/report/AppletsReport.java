package com.mbridge.msdk.scheme.report;

import android.content.Context;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.e.b;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class AppletsReport {
    public static final String APPLETS_API_VALUE = "2000118";
    private static final String TAG = "com.mbridge.msdk.scheme.report.AppletsReport";

    public static void reportAppletsLoadState(Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000118&");
                stringBuffer.append("network_type=" + z.l(context) + t2.i.c);
                stringBuffer.append("unit_id=" + str2 + t2.i.c);
                if (!TextUtils.isEmpty(a.U)) {
                    stringBuffer.append("b=" + a.U + t2.i.c);
                }
                if (!TextUtils.isEmpty(a.g)) {
                    stringBuffer.append("c=" + a.g + t2.i.c);
                }
                stringBuffer.append("hb=0&");
                if (!TextUtils.isEmpty(str3)) {
                    stringBuffer.append("rid_n=");
                    stringBuffer.append(str3);
                    stringBuffer.append(t2.i.c);
                }
                stringBuffer.append("reason=" + str);
                if (e.a().b()) {
                    e.a().a(stringBuffer.toString());
                } else {
                    reportLoadData(context, stringBuffer.toString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void reportLoadData(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, d.f().c, k.a(str, context), new b() { // from class: com.mbridge.msdk.scheme.report.AppletsReport.1
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public void onSuccess(String str2) {
                    ad.b(AppletsReport.TAG, str2);
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public void onFailed(String str2) {
                    ad.b(AppletsReport.TAG, str2);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            ad.b(TAG, e.getMessage());
        }
    }
}
