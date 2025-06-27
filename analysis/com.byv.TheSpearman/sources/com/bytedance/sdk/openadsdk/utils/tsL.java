package com.bytedance.sdk.openadsdk.utils;

import java.util.ArrayList;
import java.util.List;

/* compiled from: InitChecker.java */
/* loaded from: classes2.dex */
public class tsL {
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #1 {all -> 0x00b1, blocks: (B:35:0x0088, B:38:0x0090), top: B:47:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void EYQ() {
        /*
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.hu.EYQ()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = com.bytedance.sdk.component.utils.pi.Pm()
            if (r1 != 0) goto Le
            return
        Le:
            java.lang.String r1 = "TTAdSdk-InitChecker"
            java.lang.String r2 = "The pangolin sdk access, the environment is debug, the initial configuration detection starts"
            com.bytedance.sdk.component.utils.pi.EYQ(r1, r2)
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 0
            r6 = 1
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r4)     // Catch: java.lang.Throwable -> L80
            java.lang.String[] r0 = r0.requestedPermissions     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L7a
            int r2 = r0.length     // Catch: java.lang.Throwable -> L80
            if (r2 <= 0) goto L7a
            java.util.List r2 = mZx()     // Catch: java.lang.Throwable -> L80
            int r4 = r0.length     // Catch: java.lang.Throwable -> L80
            r7 = r5
        L38:
            if (r7 >= r4) goto L44
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L80
            if (r8 == 0) goto L41
            r2.remove(r8)     // Catch: java.lang.Throwable -> L80
        L41:
            int r7 = r7 + 1
            goto L38
        L44:
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L50
            java.lang.String r0 = "AndroidManifest.xml permissions configuration is normal"
            com.bytedance.sdk.component.utils.pi.EYQ(r1, r0)     // Catch: java.lang.Throwable -> L80
            goto L88
        L50:
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L80
        L54:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r2 == 0) goto L88
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L80
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            java.lang.String r6 = "    May be missing permissions："
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L78
            r4.append(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "，Please refer to the access documentation"
            r4.append(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L78
            com.bytedance.sdk.component.utils.pi.EYQ(r1, r2)     // Catch: java.lang.Throwable -> L78
            r6 = r5
            goto L54
        L78:
            r0 = move-exception
            goto L82
        L7a:
            java.lang.String r0 = "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation"
            com.bytedance.sdk.component.utils.pi.EYQ(r1, r0)     // Catch: java.lang.Throwable -> L80
            goto L88
        L80:
            r0 = move-exception
            r5 = r6
        L82:
            java.lang.String r2 = "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation"
            com.bytedance.sdk.component.utils.pi.EYQ(r1, r2, r0)
            r6 = r5
        L88:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb1
            r2 = 23
            if (r0 < r2) goto L90
            if (r3 >= r2) goto Lb7
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = "No adaptation required for dynamic permissions：target="
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lb1
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = "&phone="
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb1
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb1
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = ", require=23"
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb1
            com.bytedance.sdk.component.utils.pi.EYQ(r1, r0)     // Catch: java.lang.Throwable -> Lb1
            goto Lb7
        Lb1:
            r0 = move-exception
            java.lang.String r2 = "The dynamic permission is abnormal. Please check and read the access document in detail： "
            com.bytedance.sdk.component.utils.pi.EYQ(r1, r2, r0)
        Lb7:
            if (r6 != 0) goto Lbe
            java.lang.String r0 = "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion"
            com.bytedance.sdk.component.utils.pi.EYQ(r1, r0)
        Lbe:
            java.lang.String r0 = "End of pangolin sdk initial configuration test"
            com.bytedance.sdk.component.utils.pi.EYQ(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.tsL.EYQ():void");
    }

    private static List<String> mZx() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
