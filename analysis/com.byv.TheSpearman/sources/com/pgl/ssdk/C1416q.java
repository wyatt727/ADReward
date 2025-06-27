package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;

/* renamed from: com.pgl.ssdk.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1416q {

    /* renamed from: a, reason: collision with root package name */
    private static AccessibilityManager f4319a = null;
    private static int b = -1;

    public static int a() {
        return b;
    }

    public static void a(Context context) throws Throwable {
        if (b != -1) {
            return;
        }
        boolean zExists = false;
        b = 0;
        boolean zB = b(context);
        try {
            zExists = new File("/data/local/tmp/easyagent.apk").exists();
        } catch (Exception unused) {
        }
        if (zB) {
            b |= 1;
        }
        if (zExists) {
            b |= 2;
        }
    }

    public static boolean b(Context context) throws Throwable {
        List<InputMethodInfo> inputMethodList;
        ZipFile zipFile;
        if (context == null) {
            return false;
        }
        if (f4319a == null) {
            f4319a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        AccessibilityManager accessibilityManager = f4319a;
        if (accessibilityManager == null) {
            return false;
        }
        List<AccessibilityServiceInfo> installedAccessibilityServiceList = accessibilityManager.getInstalledAccessibilityServiceList();
        ZipFile zipFile2 = null;
        try {
            inputMethodList = ((InputMethodManager) context.getSystemService("input_method")).getInputMethodList();
        } catch (Exception unused) {
            inputMethodList = null;
        }
        if (installedAccessibilityServiceList != null && inputMethodList != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<InputMethodInfo> it = inputMethodList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getPackageName());
            }
            for (AccessibilityServiceInfo accessibilityServiceInfo : installedAccessibilityServiceList) {
                if (accessibilityServiceInfo != null && arrayList.contains(accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName)) {
                    arrayList2.add(accessibilityServiceInfo.getResolveInfo().serviceInfo.applicationInfo.publicSourceDir);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    zipFile = new ZipFile((String) it2.next());
                    try {
                        if (zipFile.getEntry("assets/easyagent") != null) {
                            try {
                                zipFile.close();
                                return true;
                            } catch (IOException unused2) {
                                return true;
                            }
                        }
                    } catch (IOException unused3) {
                        if (zipFile != null) {
                            zipFile.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        zipFile2 = zipFile;
                        if (zipFile2 != null) {
                            try {
                                zipFile2.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused5) {
                    zipFile = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    zipFile.close();
                } catch (IOException unused6) {
                }
            }
        }
        return false;
    }

    public static String c(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null) {
            return null;
        }
        if (f4319a == null) {
            f4319a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        AccessibilityManager accessibilityManager = f4319a;
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < enabledAccessibilityServiceList.size(); i++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i);
            if (accessibilityServiceInfo != null) {
                sb.append(String.format("%s#%s", accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName, accessibilityServiceInfo.getResolveInfo().serviceInfo.name));
                if (i != enabledAccessibilityServiceList.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }
}
