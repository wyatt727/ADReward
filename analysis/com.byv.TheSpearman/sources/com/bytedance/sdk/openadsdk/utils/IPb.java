package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: CpuUtils.java */
/* loaded from: classes2.dex */
public class IPb {
    public static int EYQ() {
        File[] fileArrListFiles;
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 0);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists() && (fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.bytedance.sdk.openadsdk.utils.IPb.1
                private final Pattern EYQ = Pattern.compile("^cpu[0-9]+$");

                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str) {
                    return this.EYQ.matcher(str).matches();
                }
            })) != null) {
                return Math.max(fileArrListFiles.length, 0);
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static int EYQ(Context context) {
        return com.bytedance.sdk.openadsdk.core.Td.EYQ(context).mZx("cpu_count", 0);
    }

    public static int mZx(Context context) {
        return com.bytedance.sdk.openadsdk.core.Td.EYQ(context).mZx("cpu_max_frequency", 0);
    }

    public static int Td(Context context) {
        return com.bytedance.sdk.openadsdk.core.Td.EYQ(context).mZx("cpu_min_frequency", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: Exception -> 0x0061, DONT_GENERATE, TRY_LEAVE, TryCatch #5 {Exception -> 0x0061, blocks: (B:22:0x0059, B:24:0x005e), top: B:46:0x0059 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int EYQ(int r7) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = r0
        L4:
            int r7 = r7 + (-1)
            if (r7 < 0) goto L6f
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            r4.append(r7)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4a
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L44
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L3f
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L3f
            if (r4 != 0) goto L36
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L3f
            if (r1 <= r2) goto L36
            r2 = r1
        L36:
            r0.close()     // Catch: java.lang.Exception -> L3c
            r3.close()     // Catch: java.lang.Exception -> L3c
        L3c:
            r1 = r0
            r0 = r3
            goto L4
        L3f:
            r1 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L4e
        L44:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r6
            goto L4e
        L4a:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L4e:
            java.lang.String r4 = "CpuUtils"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L63
            com.bytedance.sdk.component.utils.pi.EYQ(r4, r1)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L5c
            r3.close()     // Catch: java.lang.Exception -> L61
        L5c:
            if (r0 == 0) goto L61
            r0.close()     // Catch: java.lang.Exception -> L61
        L61:
            r1 = r3
            goto L4
        L63:
            r7 = move-exception
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.lang.Exception -> L6e
        L69:
            if (r0 == 0) goto L6e
            r0.close()     // Catch: java.lang.Exception -> L6e
        L6e:
            throw r7
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.IPb.EYQ(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[Catch: Exception -> 0x0064, DONT_GENERATE, TRY_LEAVE, TryCatch #4 {Exception -> 0x0064, blocks: (B:24:0x005c, B:26:0x0061), top: B:46:0x005c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int mZx(int r7) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = r0
        L4:
            int r7 = r7 + (-1)
            if (r7 < 0) goto L72
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4d
            r4.append(r7)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "/cpufreq/cpuinfo_min_freq"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L47
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L42
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L39
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 >= r2) goto L36
            goto L38
        L36:
            if (r2 != 0) goto L39
        L38:
            r2 = r1
        L39:
            r0.close()     // Catch: java.lang.Exception -> L3f
            r3.close()     // Catch: java.lang.Exception -> L3f
        L3f:
            r1 = r0
            r0 = r3
            goto L4
        L42:
            r1 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L51
        L47:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r6
            goto L51
        L4d:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L51:
            java.lang.String r4 = "CpuUtils"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L66
            com.bytedance.sdk.component.utils.pi.EYQ(r4, r1)     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L5f
            r3.close()     // Catch: java.lang.Exception -> L64
        L5f:
            if (r0 == 0) goto L64
            r0.close()     // Catch: java.lang.Exception -> L64
        L64:
            r1 = r3
            goto L4
        L66:
            r7 = move-exception
            if (r3 == 0) goto L6c
            r3.close()     // Catch: java.lang.Exception -> L71
        L6c:
            if (r0 == 0) goto L71
            r0.close()     // Catch: java.lang.Exception -> L71
        L71:
            throw r7
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.IPb.mZx(int):int");
    }
}
