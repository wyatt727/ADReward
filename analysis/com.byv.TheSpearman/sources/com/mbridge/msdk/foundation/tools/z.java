package com.mbridge.msdk.foundation.tools;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SameDiTool.java */
/* loaded from: classes4.dex */
public final class z extends j {
    private static String A = "";
    private static Object B = null;
    private static int C = 0;
    private static int D = 0;
    private static String E = "";
    private static String e = "";
    private static String f = "";
    private static int g = -1;
    private static String h = "";
    private static int i = -1;
    private static int j = 0;
    private static String k = "";
    private static int l = -1;
    private static String m = "";
    private static String n = "";
    private static volatile int o = -1;
    private static String p = "";
    private static String q = "";
    private static int r = -1;
    private static int s = -1;
    private static int t = 0;
    private static String u = "";
    private static String v = null;
    private static int w = 0;
    private static String x = "";
    private static int y = -1;
    private static int z;

    public static int b(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public static void d(final Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b(context);
            } else {
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.b(context);
                    }
                });
            }
        } catch (Exception e2) {
            ad.a("SameDiTool", "", e2);
        }
    }

    public static String e(Context context) {
        if (context == null) {
            return q;
        }
        try {
            if (TextUtils.isEmpty(q)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                q = str;
                return str;
            }
            return q;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int f() {
        try {
        } catch (Throwable th) {
            ad.a("SameDiTool", th.getMessage(), th);
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
        long j2 = 0;
        long jLongValue = ((Long) al.a(contextC, "FreeRamSize", 0L)).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLongValue > 1800000 || r == -1) {
            Context contextC2 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (contextC2 != null) {
                ActivityManager activityManager = (ActivityManager) contextC2.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                j2 = memoryInfo.availMem;
            }
            r = Long.valueOf((j2 / 1000) / 1000).intValue();
            al.b(contextC, "FreeRamSize", Long.valueOf(jCurrentTimeMillis));
        }
        return r;
    }

    public static String g() {
        if (TextUtils.isEmpty(x)) {
            f(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        return x;
    }

    public static String f(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return null;
        }
        if (TextUtils.isEmpty(x)) {
            try {
                x = al.a(context, "mbridge_ua", "").toString();
            } catch (Throwable th) {
                ad.a("SameDiTool", th.getMessage(), th);
            }
        }
        try {
            if ((Looper.myLooper() == Looper.getMainLooper()) && !MBridgeConstans.DNT_GUA_ON_UI) {
                if (TextUtils.isEmpty(x)) {
                    try {
                        if (Build.VERSION.SDK_INT >= 17) {
                            x = WebSettings.getDefaultUserAgent(context);
                        }
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(x)) {
                        try {
                            Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                            declaredConstructor.setAccessible(true);
                            x = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                            declaredConstructor.setAccessible(false);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        if (TextUtils.isEmpty(x)) {
                            try {
                                x = new WebView(context).getSettings().getUserAgentString();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                        if (TextUtils.isEmpty(x)) {
                            A();
                        }
                    }
                } else {
                    x(context);
                }
            } else {
                if (TextUtils.isEmpty(x)) {
                    A();
                }
                x(context);
            }
        } catch (Throwable th4) {
            ad.a("SameDiTool", th4.getMessage(), th4);
        }
        y(context);
        return x;
    }

    private static void A() {
        String str = Build.VERSION.RELEASE;
        String strH = h();
        String str2 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strH)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Mozilla/5.0 (Linux; Android ");
            sb.append(str);
            sb.append("; ");
            sb.append(strH);
            sb.append(" Build/");
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
            x = sb.toString();
            return;
        }
        x = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    }

    private static void x(final Context context) {
        try {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.2
                @Override // java.lang.Runnable
                public final void run() {
                    String defaultUserAgent = null;
                    try {
                        if (Build.VERSION.SDK_INT >= 17) {
                            defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        if (TextUtils.isEmpty(defaultUserAgent) || defaultUserAgent.equals(z.x)) {
                            return;
                        }
                        String unused2 = z.x = defaultUserAgent;
                        z.y(context);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }).start();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Context context) {
        try {
            al.b(context, "mbridge_ua", x);
        } catch (Throwable th) {
            ad.a("SameDiTool", th.getMessage(), th);
        }
    }

    public static String h() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MODEL;
    }

    public static String i() {
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    public static int g(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapH = h(context);
            return mapH.get("height") == null ? displayMetrics.heightPixels : ((Integer) mapH.get("height")).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static HashMap h(Context context) {
        HashMap map = new HashMap();
        if (context == null) {
            return map;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            map.put("height", Integer.valueOf(displayMetrics.heightPixels));
            map.put("width", Integer.valueOf(displayMetrics.widthPixels));
        } catch (Exception e2) {
            ad.a("SameDiTool", e2.getMessage(), e2);
        }
        return map;
    }

    public static int i(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapH = h(context);
            return mapH.get("width") == null ? displayMetrics.widthPixels : ((Integer) mapH.get("width")).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static void j() {
        try {
            Object objA = al.a(com.mbridge.msdk.foundation.controller.c.m().c(), MBridgeConstans.SP_GA_ID, "");
            Object objA2 = al.a(com.mbridge.msdk.foundation.controller.c.m().c(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (objA instanceof String) {
                String str = (String) objA;
                if (!TextUtils.isEmpty(str)) {
                    a(str);
                }
                if (objA2 instanceof Integer) {
                    e.d = ((Integer) objA2).intValue();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameDiTool", e2.getMessage());
            }
        }
    }

    public static int k() {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.VERSION.SDK_INT;
        }
        return -1;
    }

    public static String j(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(m)) {
                    if (context == null) {
                        m = "";
                        return "";
                    }
                    String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                    if (ai.j(simOperator)) {
                        m = simOperator.substring(0, Math.min(3, simOperator.length()));
                    }
                }
            } else {
                m = "";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            m = "";
        }
        return m;
    }

    public static String k(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(n)) {
                    if (context == null) {
                        n = "";
                        return m;
                    }
                    String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                    if (ai.j(simOperator)) {
                        n = simOperator.substring(Math.min(3, simOperator.length()));
                    }
                }
            } else {
                n = "";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            n = "";
        }
        return n;
    }

    public static String a(Context context, int i2) {
        TelephonyManager telephonyManager;
        if (i2 == 0 || i2 == 9) {
            return "";
        }
        try {
            return (!com.mbridge.msdk.foundation.same.a.z || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
        } catch (Throwable th) {
            ad.a("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    public static String l() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MANUFACTURER;
    }

    public static int l(Context context) {
        try {
            final Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return o;
            }
            if (contextC == null) {
                return o;
            }
            if (o == -1) {
                o = 0;
                return o;
            }
            try {
                Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            ConnectivityManager connectivityManager = (ConnectivityManager) contextC.getSystemService("connectivity");
                            if (connectivityManager != null && com.mbridge.msdk.foundation.same.a.z) {
                                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                if (activeNetworkInfo == null) {
                                    int unused = z.o = 0;
                                    return;
                                }
                                if (activeNetworkInfo.getType() == 1) {
                                    int unused2 = z.o = 9;
                                    return;
                                }
                                TelephonyManager telephonyManager = (TelephonyManager) contextC.getSystemService("phone");
                                if (telephonyManager == null) {
                                    int unused3 = z.o = 0;
                                } else {
                                    int unused4 = z.o = z.b(telephonyManager.getNetworkType());
                                }
                            }
                        } catch (Exception e2) {
                            ad.a("SameDiTool", e2.getMessage(), e2);
                            int unused5 = z.o = 0;
                        }
                    }
                };
                if (com.mbridge.msdk.foundation.same.f.b.f().getActiveCount() < 1) {
                    com.mbridge.msdk.foundation.same.f.b.f().execute(runnable);
                }
            } catch (Throwable th) {
                ad.b("SameDiTool", th.getMessage());
            }
            return o;
        } catch (Exception e2) {
            ad.a("SameDiTool", e2.getMessage(), e2);
            o = 0;
            return o;
        }
    }

    public static String a(String str, Context context) {
        try {
        } catch (Exception e2) {
            ad.a("SameDiTool", e2.getMessage(), e2);
        }
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            e = context.getPackageManager().getInstallerPackageName(str);
            ad.a("SameDiTool", "PKGSource:" + e);
        }
        return e;
    }

    public static String m() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static String n() throws JSONException {
        Context contextC;
        long jA;
        long jB;
        String strZ;
        String str;
        String str2;
        String strA = "";
        try {
            contextC = com.mbridge.msdk.foundation.controller.c.m().c();
            jA = y.a();
            jB = B();
            strZ = z(contextC);
            str = "app_tki_" + jA + "_" + jB + "_" + strZ;
            str2 = (String) al.a(contextC, str, "");
        } catch (Exception e2) {
            e = e2;
        }
        try {
        } catch (Exception e3) {
            e = e3;
            strA = str2;
            e.printStackTrace();
            return strA;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("1", strZ);
            jSONObject.put("2", String.valueOf(jB));
            jSONObject.put("3", String.valueOf(jA));
            jSONObject.put("4", "");
            jSONObject.put(CampaignEx.CLICKMODE_ON, "");
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        strA = a.a(jSONObject.toString());
        al.b(contextC, str, strA);
        return strA;
    }

    private static long B() {
        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
        if (contextC == null) {
            return 0L;
        }
        ActivityManager activityManager = (ActivityManager) contextC.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        if (Build.VERSION.SDK_INT >= 16) {
            return memoryInfo.totalMem;
        }
        return 0L;
    }

    private static String z(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f)) {
                    f = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
                }
            } else {
                f = "";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            f = "";
        }
        return f;
    }

    public static int o() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        if (s < 1) {
            try {
                Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                long jLongValue = ((Long) al.a(contextC, "TotalRamSize", 0L)).longValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - jLongValue > 1800000 || s == -1) {
                    s = Long.valueOf((B() / 1000) / 1000).intValue();
                    al.b(contextC, "TotalRamSize", Long.valueOf(jCurrentTimeMillis));
                }
            } catch (Throwable th) {
                ad.a("SameDiTool", th.getMessage(), th);
            }
        }
        return s;
    }

    public static String m(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e2) {
            ad.a("SameDiTool", e2.getMessage(), e2);
            return "";
        } catch (Throwable th) {
            ad.a("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    public static String n(Context context) throws IOException {
        FileReader fileReader;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(v)) {
            return v;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(fileReader, 8192);
                        try {
                            String fileSize = Formatter.formatFileSize(context, Long.valueOf(bufferedReader2.readLine().split("\\s+")[1]).longValue() * 1024);
                            v = fileSize;
                            try {
                                bufferedReader2.close();
                            } catch (IOException e2) {
                                ad.a("SameDiTool", e2.getMessage(), e2);
                            }
                            try {
                                fileReader.close();
                            } catch (IOException e3) {
                                ad.a("SameDiTool", e3.getMessage(), e3);
                            }
                            return fileSize;
                        } catch (IOException e4) {
                            e = e4;
                            bufferedReader = bufferedReader2;
                            ad.a("SameDiTool", e.getMessage(), e);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e5) {
                                    ad.a("SameDiTool", e5.getMessage(), e5);
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                            }
                            return "";
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            ad.a("SameDiTool", th.getMessage(), th);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e6) {
                                    ad.a("SameDiTool", e6.getMessage(), e6);
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                            }
                            return "";
                        }
                    } catch (IOException e7) {
                        e = e7;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e8) {
                    ad.a("SameDiTool", e8.getMessage(), e8);
                    return "";
                }
            } catch (IOException e9) {
                e = e9;
                fileReader = null;
            } catch (Throwable th3) {
                th = th3;
                fileReader = null;
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static String p() throws IOException {
        FileReader fileReader;
        Throwable th;
        Exception e2;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (w > 0) {
            return w + "GB";
        }
        ?? bufferedReader = AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO;
        w = 0;
        try {
            try {
                try {
                    fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
                    try {
                        bufferedReader = new BufferedReader(fileReader, 8192);
                    } catch (Exception e3) {
                        e2 = e3;
                        bufferedReader = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = 0;
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (Exception e5) {
                fileReader = null;
                e2 = e5;
                bufferedReader = 0;
            } catch (Throwable th3) {
                fileReader = null;
                th = th3;
                bufferedReader = 0;
            }
            try {
                String str = bufferedReader.readLine().split("\\s+")[1];
                bufferedReader.close();
                if (str != null) {
                    w = (int) Math.ceil(new Float(Float.valueOf(str).floatValue() / 1048576.0f).doubleValue());
                }
                try {
                    fileReader.close();
                } catch (IOException unused) {
                }
                bufferedReader.close();
                bufferedReader = bufferedReader;
            } catch (Exception e6) {
                e2 = e6;
                ad.a("SameDiTool", e2.getMessage(), e2);
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException unused2) {
                    }
                }
                if (bufferedReader != 0) {
                    bufferedReader.close();
                    bufferedReader = bufferedReader;
                }
                return w + "GB";
            } catch (Throwable th4) {
                th = th4;
                ad.a("SameDiTool", th.getMessage(), th);
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException unused3) {
                    }
                }
                if (bufferedReader != 0) {
                    bufferedReader.close();
                    bufferedReader = bufferedReader;
                }
                return w + "GB";
            }
            return w + "GB";
        } finally {
        }
    }

    public static int r() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int s() {
        return y;
    }

    public static Object b(String str) {
        if (B == null) {
            B = ai.g(str);
        }
        return B;
    }

    public static int t() {
        if (C == 0) {
            C = ai.e();
        }
        return C;
    }

    public static int c(String str) {
        if (D == 0) {
            D = ai.f(str);
        }
        return D;
    }

    public static int u() {
        return l;
    }

    public static String v() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(p)) {
            p = r() + "";
        }
        return p;
    }

    public static String p(Context context) {
        if (context == null) {
            return A;
        }
        try {
            if (TextUtils.isEmpty(A)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                A = str;
                return str;
            }
            return A;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int q(Context context) {
        if (context == null) {
            return z;
        }
        int i2 = z;
        if (i2 != 0) {
            return i2;
        }
        try {
            int i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            z = i3;
            return i3;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static int r(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    public static String w() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.BRAND;
    }

    public static String s(Context context) {
        Locale locale;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(k)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                    return "en-US";
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    k = locale.toLanguageTag();
                } else {
                    k = locale.getLanguage() + "-" + locale.getCountry();
                }
                return k;
            } catch (Throwable th) {
                ad.a("SameDiTool", th.getMessage());
                k = "en-US";
            }
        }
        return k;
    }

    public static String x() {
        try {
        } catch (Throwable th) {
            ad.a("SameDiTool", th.getMessage(), th);
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            return "";
        }
        if (TextUtils.isEmpty(u)) {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String unused = z.u = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }).start();
            return u;
        }
        return u;
    }

    public static int t(Context context) {
        if (context == null) {
            return t;
        }
        if (t == 0) {
            try {
                t = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e2) {
                ad.b("SameDiTool", e2.getMessage());
            }
        }
        return t;
    }

    private static String C() {
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        JSONObject jSONObject = new JSONObject();
        String str = null;
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable th) {
            ad.b("SameDiTool", th.getMessage());
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod(MobileAdsBridge.versionMethodName, new Class[0]).invoke(cls2, new Object[0]));
                } catch (Throwable th2) {
                    ad.b("SameDiTool", th2.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.m().c().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th3) {
                    ad.b("SameDiTool", th3.getMessage());
                }
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = x.b(string);
                }
                h = string;
            } else {
                h = "android";
            }
        } catch (Throwable th4) {
            ad.b("SameDiTool", th4.getMessage());
        }
        return h;
    }

    public static int u(Context context) {
        if (g == -1) {
            g = ai.c(context, "com.tencent.mm") ? 1 : 0;
        }
        return g;
    }

    public static int y() {
        if (i == -1) {
            i = ai.f() ? 1 : 0;
        }
        return i;
    }

    public static boolean v(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static void c(int i2) {
        l = i2;
    }

    public static int q() {
        try {
        } catch (Exception e2) {
            j = 0;
            ad.b("SameDiTool", e2.getMessage());
        }
        if (!af.a.f2973a.a("v_a_d_p", false)) {
            return 0;
        }
        if (ai.h()) {
            j = 1;
        } else if (ai.i()) {
            j = 2;
        } else {
            j = 0;
        }
        return j;
    }

    public static void o(Context context) {
        try {
            j.a(context);
            v();
            e(context);
            p(context);
            q(context);
            r(context);
            h();
            w();
            s(context);
            x();
            com.mbridge.msdk.foundation.same.a.B = false;
            com.mbridge.msdk.foundation.same.a.z = ai.a("android.permission.ACCESS_NETWORK_STATE", context);
            t(context);
            C();
            e();
            try {
                com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.mbridge.msdk.f.c.a();
                        } catch (Exception e2) {
                            ad.b("SameDiTool", e2.getMessage());
                        }
                    }
                });
            } catch (Throwable th) {
                ad.b("SameDiTool", th.getMessage());
            }
        } catch (Throwable th2) {
            ad.b("SameDiTool", th2.getMessage());
        }
    }
}
