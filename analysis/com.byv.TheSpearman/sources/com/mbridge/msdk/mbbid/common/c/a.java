package com.mbridge.msdk.mbbid.common.c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.same.report.d.d;

/* compiled from: BidReport.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3091a = "com.mbridge.msdk.mbbid.common.c.a";

    public static void a(Context context, String str, String str2, String str3, String str4) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            d dVar = new d();
            dVar.a("result", 1);
            dVar.a("bidid", str2);
            dVar.a("bid_tk", str4);
            dVar.a("lrid", str3);
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            c.a().b("2000064", dVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            d dVar = new d();
            dVar.a("result", 2);
            dVar.a("lrid", str3);
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            dVar.a("reason", str2);
            c.a().b("2000064", dVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
