package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* compiled from: RomUtils.java */
/* loaded from: classes2.dex */
public class WU {
    public static boolean EYQ = false;
    private static int IPb = Integer.MAX_VALUE;
    private static String Kbd = null;
    public static boolean mZx = false;
    private static final CharSequence Td = "amigo";
    private static final CharSequence Pm = "funtouch";
    private static final ConcurrentHashMap<String, String> VwS = new ConcurrentHashMap<>();

    public static String EYQ() throws JSONException {
        if (!TextUtils.isEmpty(Kbd)) {
            return Kbd;
        }
        String strEYQ = com.bytedance.sdk.openadsdk.core.QQ.EYQ("sdk_local_rom_info", 604800000L);
        Kbd = strEYQ;
        if (TextUtils.isEmpty(strEYQ)) {
            String strXN = XN();
            Kbd = strXN;
            com.bytedance.sdk.openadsdk.core.QQ.EYQ("sdk_local_rom_info", strXN);
        }
        return Kbd;
    }

    private static String XN() {
        if (KO()) {
            return hu();
        }
        if (Kbd()) {
            return tsL();
        }
        if (mZx()) {
            return UB();
        }
        if (Uc()) {
            return hYh();
        }
        String strPi = pi();
        if (!TextUtils.isEmpty(strPi)) {
            return strPi;
        }
        if (VwS()) {
            return IPb();
        }
        if (QQ()) {
            return HX();
        }
        if (Pm()) {
            return Td();
        }
        String strTp = tp();
        return !TextUtils.isEmpty(strTp) ? strTp : Build.DISPLAY;
    }

    public static boolean mZx() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    public static String Td() {
        return Pm("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean Pm() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean Kbd() {
        if (!mZx) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    EYQ = true;
                    mZx = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            mZx = true;
        }
        return EYQ;
    }

    public static String IPb() {
        return Pm("ro.vivo.os.build.display.id") + "_" + Pm("ro.vivo.product.version");
    }

    public static boolean VwS() {
        String strPm = Pm("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strPm) && strPm.toLowerCase().contains(Pm);
    }

    public static boolean QQ() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase().contains(Td);
    }

    public static String HX() {
        return Build.DISPLAY + "_" + Pm("ro.gn.sv.version");
    }

    public static String tp() {
        if (!MxO()) {
            return "";
        }
        return "eui_" + Pm("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static boolean MxO() {
        return !TextUtils.isEmpty(Pm("ro.letv.release.version"));
    }

    public static String tsL() {
        if (!Kbd()) {
            return "";
        }
        return "miui_" + Pm("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    public static String pi() {
        String strNWX = nWX();
        if (strNWX == null || !strNWX.toLowerCase().contains("emotionui")) {
            return "";
        }
        return strNWX + "_" + Build.DISPLAY;
    }

    public static String nWX() {
        return Pm("ro.build.version.emui");
    }

    public static boolean KO() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static String hu() {
        if (KO()) {
            try {
                return "smartisan_".concat(String.valueOf(Pm("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String UB() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static boolean Uc() {
        if (IPb == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strVwS = FH.VwS("kllk");
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(strVwS)) {
                IPb = 1;
            } else {
                IPb = 0;
            }
        }
        return IPb == 1;
    }

    public static String hYh() {
        if (!Uc()) {
            return "";
        }
        return "coloros_" + Pm(FH.VwS("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
    }

    public static boolean zF() {
        try {
            if (TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("huawei")) {
                if (TextUtils.isEmpty(Build.MANUFACTURER)) {
                    return false;
                }
                if (!Build.MANUFACTURER.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            str = nWX();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || zF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Td(String str) throws IOException {
        BufferedReader bufferedReader;
        Throwable th;
        Process processExec;
        String line = "";
        Process process = null;
        try {
            try {
                try {
                    processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
                    } catch (IllegalThreadStateException unused) {
                        bufferedReader = null;
                    }
                } catch (IOException e) {
                    com.bytedance.sdk.component.utils.pi.EYQ("ToolUtils", "Exception while closing InputStream", e);
                }
            } catch (IllegalThreadStateException unused2) {
                bufferedReader = null;
            }
        } catch (Throwable th2) {
            bufferedReader = null;
            th = th2;
        }
        try {
            line = bufferedReader.readLine();
            processExec.exitValue();
            bufferedReader.close();
        } catch (IllegalThreadStateException unused3) {
            process = processExec;
            try {
                process.destroy();
            } catch (Throwable unused4) {
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return line;
        } catch (Throwable th3) {
            th = th3;
            try {
                com.bytedance.sdk.component.utils.pi.EYQ("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                return line;
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        com.bytedance.sdk.component.utils.pi.EYQ("ToolUtils", "Exception while closing InputStream", e2);
                    }
                }
            }
        }
        return line;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String Pm(String str) {
        String str2;
        String str3 = VwS.get(str);
        if (str3 != null) {
            return str3;
        }
        if (TextUtils.isEmpty("")) {
            final com.bytedance.sdk.component.VwS.VwS vwS = new com.bytedance.sdk.component.VwS.VwS(new EYQ(str), 5, 2);
            xt.mZx(new com.bytedance.sdk.component.VwS.QQ("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.WU.1
                @Override // java.lang.Runnable
                public void run() {
                    vwS.run();
                }
            });
            str2 = (String) vwS.get(1L, TimeUnit.SECONDS);
        } else {
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }

    /* compiled from: RomUtils.java */
    public static class EYQ implements Callable<String> {
        private final String EYQ;

        public EYQ(String str) {
            this.EYQ = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) WU.VwS.get(this.EYQ);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String strTd = WU.Td(this.EYQ);
            System.currentTimeMillis();
            if (strTd != null) {
                WU.VwS.put(this.EYQ, strTd);
            }
            return strTd;
        }
    }
}
