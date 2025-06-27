package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Method;

/* compiled from: TTCrashHandler.java */
/* loaded from: classes2.dex */
public class wBa implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler EYQ = Thread.getDefaultUncaughtExceptionHandler();
    private String mZx;

    public static wBa EYQ() {
        return new wBa();
    }

    private wBa() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        mZx();
    }

    private void mZx() {
        Context contextEYQ = com.bytedance.sdk.openadsdk.core.hu.EYQ();
        if (contextEYQ == null) {
            return;
        }
        try {
            File file = new File(contextEYQ.getFilesDir(), "TTCache");
            file.mkdirs();
            this.mZx = file.getPath();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        boolean zContains = false;
        com.bytedance.sdk.component.VwS.IPb.EYQ(false);
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            if (string != null) {
                zContains = string.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (zContains) {
            EYQ(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.EYQ;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Properties] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EYQ(java.lang.Thread r17, java.lang.Throwable r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.wBa.EYQ(java.lang.Thread, java.lang.Throwable):void");
    }

    private void Td() {
        try {
            Method methodEYQ = com.bytedance.sdk.component.utils.tPj.EYQ("com.bytedance.sdk.openadsdk.TTC2Proxy", "a", Context.class);
            if (methodEYQ != null) {
                methodEYQ.invoke(null, com.bytedance.sdk.openadsdk.core.hu.EYQ());
            }
        } catch (Throwable unused) {
        }
        try {
            Method methodEYQ2 = com.bytedance.sdk.component.utils.tPj.EYQ("com.bytedance.sdk.openadsdk.TTC3Proxy", "a", Context.class);
            if (methodEYQ2 != null) {
                methodEYQ2.invoke(null, com.bytedance.sdk.openadsdk.core.hu.EYQ());
            }
        } catch (Throwable unused2) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().EYQ();
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.mZx();
        } catch (Throwable unused4) {
        }
    }
}
