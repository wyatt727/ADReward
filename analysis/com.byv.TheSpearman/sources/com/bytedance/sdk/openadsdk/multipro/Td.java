package com.bytedance.sdk.openadsdk.multipro;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.Uc;
import com.bytedance.sdk.component.utils.pi;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTMultiInitHelper.java */
/* loaded from: classes2.dex */
public class Td {
    private static boolean EYQ = true;
    private static final AtomicBoolean mZx = new AtomicBoolean(false);

    public static void EYQ(Context context) {
        if (context != null && EYQ && mZx.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (Uc.EYQ(context)) {
                        mZx(context);
                        return;
                    }
                    String strMZx = Uc.mZx(context);
                    try {
                        if (TextUtils.isEmpty(strMZx)) {
                            strMZx = context.getPackageName() + Process.myPid();
                        }
                        WebView.setDataDirectorySuffix(strMZx);
                    } catch (IllegalStateException unused) {
                        EYQ(strMZx);
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th) {
                pi.mZx(th.getMessage());
            }
        }
    }

    public static void EYQ() {
        EYQ = false;
    }

    private static void EYQ(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void mZx(android.content.Context r5) throws java.lang.Throwable {
        /*
            java.lang.String r0 = mZx()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Ld
            java.lang.String r0 = "webview"
            goto L17
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "webview_"
            java.lang.String r0 = r1.concat(r0)
        L17:
            r1 = 0
            java.io.File r5 = r5.getDir(r0, r1)
            java.lang.String r5 = r5.getPath()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "webview_data.lock"
            r0.<init>(r5, r1)
            r0.getAbsolutePath()
            boolean r5 = r0.exists()
            if (r5 != 0) goto L31
            return
        L31:
            r5 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L88
            if (r2 == 0) goto L46
            java.nio.channels.FileLock r5 = r2.tryLock()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L68
            goto L46
        L44:
            r5 = move-exception
            goto L8b
        L46:
            if (r5 == 0) goto L52
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L68
            r4 = 19
            if (r3 < r4) goto L55
            r5.close()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L68
            goto L55
        L52:
            EYQ(r0)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L68
        L55:
            if (r2 == 0) goto L5f
            r2.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r5 = move-exception
            r5.getMessage()
        L5f:
            r1.close()     // Catch: java.lang.Throwable -> L63
            return
        L63:
            r5 = move-exception
            r5.getMessage()
            return
        L68:
            r5 = r2
            goto L70
        L6a:
            r0 = move-exception
            r1 = r5
            r2 = r1
        L6d:
            r5 = r0
            goto L8b
        L6f:
            r1 = r5
        L70:
            EYQ(r0)     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L7d
            r5.close()     // Catch: java.lang.Throwable -> L79
            goto L7d
        L79:
            r5 = move-exception
            r5.getMessage()
        L7d:
            if (r1 == 0) goto L87
            r1.close()     // Catch: java.lang.Throwable -> L83
            return
        L83:
            r5 = move-exception
            r5.getMessage()
        L87:
            return
        L88:
            r0 = move-exception
            r2 = r5
            goto L6d
        L8b:
            if (r2 == 0) goto L95
            r2.close()     // Catch: java.lang.Throwable -> L91
            goto L95
        L91:
            r0 = move-exception
            r0.getMessage()
        L95:
            if (r1 == 0) goto L9f
            r1.close()     // Catch: java.lang.Throwable -> L9b
            goto L9f
        L9b:
            r0 = move-exception
            r0.getMessage()
        L9f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.Td.mZx(android.content.Context):void");
    }

    private static void EYQ(File file) throws IOException {
        EYQ(file, file.exists() ? file.delete() : false);
    }

    private static void EYQ(File file, boolean z) throws IOException {
        if (!z || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            pi.EYQ("TTAD.TTMultiInitHelper", e.getMessage());
        }
    }

    private static String mZx() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }
}
