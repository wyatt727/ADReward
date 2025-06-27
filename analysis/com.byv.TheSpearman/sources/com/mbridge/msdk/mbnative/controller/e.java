package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.List;

/* compiled from: NativeVideoTrackingReport.java */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3133a = "com.mbridge.msdk.mbnative.controller.e";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                q qVarA = q.a(h.a(context));
                if (TextUtils.isEmpty(str) || qVarA == null || qVarA.a() <= 0) {
                    return;
                }
                List<n> listA = qVarA.a("m_download_end");
                List<n> listA2 = qVarA.a("2000021");
                List<n> listA3 = qVarA.a("m_download_end");
                String strE = n.e(listA2);
                String strA = n.a(listA);
                String strB = n.b(listA3);
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(strE)) {
                    sb.append(strE);
                }
                if (!TextUtils.isEmpty(strA)) {
                    sb.append(strA);
                }
                if (!TextUtils.isEmpty(strB)) {
                    sb.append(strB);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    return;
                }
                String string = sb.toString();
                if (context == null || TextUtils.isEmpty(string) || TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().c, k.a(string, context, str), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.mbnative.controller.e.1
                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onSuccess(String str2) {
                            ad.b(e.f3133a, str2);
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onFailed(String str2) {
                            ad.b(e.f3133a, str2);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    ad.b(f3133a, e.getMessage());
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
