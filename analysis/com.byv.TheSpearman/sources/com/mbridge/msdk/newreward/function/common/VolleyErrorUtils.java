package com.mbridge.msdk.newreward.function.common;

import com.mbridge.msdk.e.a.z;
import com.mbridge.msdk.newreward.function.d.b.b;

/* loaded from: classes4.dex */
public class VolleyErrorUtils {
    public static b parseVolleyError(z zVar) {
        b bVar = new b(0);
        bVar.b("Network unknown error");
        if (zVar == null) {
            return bVar;
        }
        int iA = zVar.a();
        if (iA == 1) {
            zVar.a("Network error,please check state code " + zVar.b());
            bVar = new b(1);
        } else if (iA == 7) {
            zVar.a("The server returns an exception state code " + zVar.b());
            bVar = new b(2);
        } else if (iA == 2) {
            zVar.a("unSupportEncodingException");
            bVar = new b(8);
        } else if (iA == 8) {
            zVar.a("Network error,timeout exception");
            bVar = new b(4);
        } else if (iA == 3) {
            zVar.a("Network error,I/O exception");
            bVar = new b(3);
        } else if (iA == 4) {
            zVar.a(880041);
            zVar.a("Network error,UnknownHostException");
            bVar = new b(5);
        } else if (iA == 6) {
            zVar.a("Network error,I/O exception response null");
            bVar = new b(7);
        } else if (iA == 5) {
            zVar.a("Network error,I/O exception");
            bVar = new b(6);
        } else if (iA == 0) {
            zVar.a("Network error,I/O exception");
            bVar = new b(0);
        } else if (iA == 9) {
            zVar.a("Network unknown error");
            bVar = new b(1);
        }
        bVar.a(zVar);
        bVar.b(zVar.getMessage());
        return bVar;
    }
}
