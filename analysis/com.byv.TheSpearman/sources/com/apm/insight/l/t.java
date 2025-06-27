package com.apm.insight.l;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final CharSequence f104a = "sony";
    private static final CharSequence b = "amigo";
    private static final CharSequence c = "funtouch";

    public static String a() {
        if (d.c()) {
            return j();
        }
        if (d.d()) {
            return l();
        }
        if (m()) {
            return n();
        }
        String strK = k();
        if (!TextUtils.isEmpty(strK)) {
            return strK;
        }
        if (e()) {
            return d();
        }
        if (f()) {
            return g();
        }
        if (c()) {
            return b();
        }
        String strH = h();
        return !TextUtils.isEmpty(strH) ? strH : Build.DISPLAY;
    }

    private static String a(String str) {
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            Process processExec = Runtime.getRuntime().exec("getprop " + str);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
            try {
                line = bufferedReader2.readLine();
                processExec.destroy();
                k.a(bufferedReader2);
                return line;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                k.a(bufferedReader);
                return line;
            }
        } catch (Throwable unused2) {
        }
    }

    public static String b() {
        return a("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean c() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static String d() {
        return a("ro.vivo.os.build.display.id") + "_" + a("ro.vivo.product.version");
    }

    public static boolean e() {
        String strA = a("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strA) && strA.toLowerCase(Locale.getDefault()).contains(c);
    }

    public static boolean f() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(b);
    }

    public static String g() {
        return Build.DISPLAY + "_" + a("ro.gn.sv.version");
    }

    public static String h() {
        if (!i()) {
            return "";
        }
        return "eui_" + a("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static boolean i() {
        return !TextUtils.isEmpty(a("ro.letv.release.version"));
    }

    public static String j() {
        if (!d.c()) {
            return "";
        }
        return "miui_" + a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    public static String k() {
        String strA = d.a();
        if (strA == null || !strA.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        return strA + "_" + Build.DISPLAY;
    }

    public static String l() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str;
    }

    public static boolean m() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains("oppo");
    }

    public static String n() {
        if (!m()) {
            return "";
        }
        return "coloros_" + a("ro.build.version.opporom") + "_" + Build.DISPLAY;
    }
}
