package com.bytedance.sdk.component.IPb.Pm;

import android.content.Context;
import com.bytedance.sdk.component.IPb.Td.VwS;
import java.util.LinkedHashMap;

/* compiled from: MultiProcessFileUtils.java */
/* loaded from: classes2.dex */
public class Pm {
    public static void EYQ(Context context, int i, String str, int i2) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i == 1) {
                linkedHashMap.put(EYQ(i2), str);
            }
            if (VwS.EYQ().EYQ(i2).Pm() != null) {
                VwS.EYQ().EYQ(i2).Pm().EYQ(context, linkedHashMap);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String EYQ(android.content.Context r2, int r3, int r4) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            if (r3 == r1) goto L6
            goto L29
        L6:
            com.bytedance.sdk.component.IPb.Td.VwS r3 = com.bytedance.sdk.component.IPb.Td.VwS.EYQ()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.IPb.Td.Kbd r3 = r3.EYQ(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.IPb.Td.mZx r3 = r3.Pm()     // Catch: java.lang.Exception -> L29
            if (r3 == 0) goto L29
            com.bytedance.sdk.component.IPb.Td.VwS r3 = com.bytedance.sdk.component.IPb.Td.VwS.EYQ()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.IPb.Td.Kbd r3 = r3.EYQ(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.IPb.Td.mZx r3 = r3.Pm()     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = EYQ(r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = r3.EYQ(r2, r4, r0)     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r2 = r0
        L2a:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L32
            java.lang.String r0 = java.lang.String.valueOf(r2)
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.IPb.Pm.Pm.EYQ(android.content.Context, int, int):java.lang.String");
    }

    private static String EYQ(int i) {
        return "tnc_config".concat(String.valueOf(i));
    }
}
