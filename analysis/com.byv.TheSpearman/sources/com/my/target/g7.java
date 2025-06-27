package com.my.target;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class g7 extends p1 {
    public synchronized Map<String, String> a(MyTargetConfig myTargetConfig, Context context) {
        HashMap map;
        map = new HashMap();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                map.put("connection", activeNetworkInfo.getTypeName());
                a(map, activeNetworkInfo);
            }
        } catch (Throwable unused) {
            ba.a("NetworkInfoDataProvider: No permissions for access to network state");
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.Map<java.lang.String, java.lang.String> r2, android.net.NetworkInfo r3) {
        /*
            r1 = this;
            int r0 = r3.getType()
            if (r0 != 0) goto L11
            java.lang.String r0 = r3.getSubtypeName()
            if (r0 == 0) goto L1c
            java.lang.String r3 = r3.getSubtypeName()
            goto L1e
        L11:
            java.lang.String r0 = r3.getTypeName()
            if (r0 == 0) goto L1c
            java.lang.String r3 = r3.getTypeName()
            goto L1e
        L1c:
            java.lang.String r3 = ""
        L1e:
            java.lang.String r0 = "connection_type"
            r2.put(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.g7.a(java.util.Map, android.net.NetworkInfo):void");
    }
}
