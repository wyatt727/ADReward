package com.applovin.impl.sdk;

import com.applovin.impl.oj;
import com.applovin.impl.zp;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public class NativeCrashReporter {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f907a;
    private static boolean b;
    private static final NativeCrashReporter c = new NativeCrashReporter();

    private NativeCrashReporter() {
    }

    public static void a(k kVar) {
        if (kVar == null) {
            return;
        }
        if (!((Boolean) kVar.a(oj.A4)).booleanValue() && !zp.i(k.k())) {
            if (b) {
                try {
                    c.disable();
                    return;
                } catch (Throwable th) {
                    kVar.L();
                    if (t.a()) {
                        kVar.L().a("NativeCrashReporter", "Failed to disable native crash reporter", th);
                    }
                    kVar.B().a("NativeCrashReporter", "disableInstance", th);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List listC = kVar.c(oj.B4);
            int[] iArr = new int[listC.size()];
            for (int i = 0; i < listC.size(); i++) {
                try {
                    iArr[i] = Integer.parseInt((String) listC.get(i));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(k.k().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, kVar);
            } else if (!file.mkdir()) {
                kVar.L();
                if (t.a()) {
                    kVar.L().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                c.enable(file.getAbsolutePath(), iArr);
            } catch (Throwable th2) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("NativeCrashReporter", "Failed to enable native crash reporter", th2);
                }
                kVar.B().a("NativeCrashReporter", "enableInstance", th2);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr);

    private static native String symbolicateSource(String str);

    private static boolean a() {
        if (!f907a) {
            f907a = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                b = true;
            } catch (Throwable th) {
                t.b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.io.File r10, com.applovin.impl.sdk.k r11) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Failed to delete native crash report: "
            java.io.File[] r10 = r10.listFiles()
            if (r10 != 0) goto L9
            return
        L9:
            int r1 = r10.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto Lda
            r4 = r10[r3]
            com.applovin.impl.sdk.p r5 = r11.D()
            java.lang.String r5 = r5.e(r4)
            boolean r6 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)
            java.lang.String r7 = "NativeCrashReporter"
            if (r6 == 0) goto L63
            java.lang.String r6 = "@@@@@"
            r8 = 3
            java.lang.String[] r5 = r5.split(r6, r8)
            int r6 = r5.length
            if (r6 != r8) goto L63
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r8 = r5[r2]
            java.lang.String r9 = "error_message"
            r6.put(r9, r8)
            r8 = 1
            r8 = r5[r8]
            java.lang.String r9 = "details"
            r6.put(r9, r8)
            r8 = 2
            r5 = r5[r8]     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = symbolicateSource(r5)     // Catch: java.lang.Throwable -> L4f
            com.applovin.impl.sdk.o r8 = r11.B()     // Catch: java.lang.Throwable -> L4f
            com.applovin.impl.sdk.o$b r9 = com.applovin.impl.sdk.o.b.NATIVE_ERROR     // Catch: java.lang.Throwable -> L4f
            r8.a(r9, r5, r6)     // Catch: java.lang.Throwable -> L4f
            goto L88
        L4f:
            r5 = move-exception
            r11.L()
            boolean r6 = com.applovin.impl.sdk.t.a()
            if (r6 == 0) goto L88
            com.applovin.impl.sdk.t r6 = r11.L()
            java.lang.String r8 = "Failed to symbolicate native crash report"
            r6.a(r7, r8, r5)
            goto L88
        L63:
            r11.L()
            boolean r5 = com.applovin.impl.sdk.t.a()
            if (r5 == 0) goto L88
            com.applovin.impl.sdk.t r5 = r11.L()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Failed to read native crash error report: "
            r6.append(r8)
            java.lang.String r8 = r4.getAbsolutePath()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r5.b(r7, r6)
        L88:
            boolean r5 = r4.delete()     // Catch: java.lang.Throwable -> Lb2
            if (r5 != 0) goto Ld6
            r11.L()     // Catch: java.lang.Throwable -> Lb2
            boolean r5 = com.applovin.impl.sdk.t.a()     // Catch: java.lang.Throwable -> Lb2
            if (r5 == 0) goto Ld6
            com.applovin.impl.sdk.t r5 = r11.L()     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r6.<init>()     // Catch: java.lang.Throwable -> Lb2
            r6.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r8 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> Lb2
            r6.append(r8)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lb2
            r5.b(r7, r6)     // Catch: java.lang.Throwable -> Lb2
            goto Ld6
        Lb2:
            r5 = move-exception
            r11.L()
            boolean r6 = com.applovin.impl.sdk.t.a()
            if (r6 == 0) goto Ld6
            com.applovin.impl.sdk.t r6 = r11.L()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r4 = r4.getAbsolutePath()
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r6.a(r7, r4, r5)
        Ld6:
            int r3 = r3 + 1
            goto Lc
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.NativeCrashReporter.a(java.io.File, com.applovin.impl.sdk.k):void");
    }
}
