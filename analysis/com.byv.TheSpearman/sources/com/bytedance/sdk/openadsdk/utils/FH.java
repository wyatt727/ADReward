package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.widget.SSWebView;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ToolUtils.java */
/* loaded from: classes2.dex */
public class FH {
    public static Integer EYQ;
    private static final HashSet<String> MxO;
    private static final ExecutorService mZx = Executors.newSingleThreadExecutor();
    private static volatile boolean Td = false;
    private static final AtomicInteger Pm = new AtomicInteger(0);
    private static volatile String Kbd = "";
    private static final ReentrantLock IPb = new ReentrantLock();
    private static String VwS = null;
    private static String QQ = null;
    private static String HX = null;
    private static final HashSet<String> tp = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    public static String EYQ(int i) {
        if (i == 1) {
            return "embeded_ad";
        }
        if (i == 2) {
            return "banner_ad";
        }
        if (i == 3) {
            return "interaction";
        }
        if (i == 4) {
            return "open_ad";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, View view) {
    }

    public static boolean IPb(int i) {
        return i == 6;
    }

    public static boolean Kbd(int i) {
        return i == 5;
    }

    public static boolean Pm(int i) {
        return i == 4;
    }

    public static String Td(int i) {
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? "open_ad" : i != 7 ? i != 8 ? "embeded_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    public static int VwS(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 5) {
            return 4;
        }
        if (i != 6) {
            return i;
        }
        return 5;
    }

    public static String mZx(int i) {
        if (i == 1) {
            return "embeded_ad_landingpage";
        }
        if (i == 2) {
            return "banner_ad_landingpage";
        }
        if (i == 3) {
            return "interaction_landingpage";
        }
        if (i == 4) {
            return "splash_ad_landingpage";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return null;
        }
        return "rewarded_video_landingpage";
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        MxO = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        EYQ = null;
    }

    public static Intent EYQ(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static boolean mZx(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean EYQ(Context context, Intent intent) {
        return Td(context, intent) > 0;
    }

    public static mZx mZx(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            return new mZx(null, 0);
        }
        ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
        if (activityInfo != null && !TextUtils.isEmpty(activityInfo.packageName) && !TextUtils.isEmpty(activityInfo.name)) {
            return new mZx(new ComponentName(activityInfo.packageName, activityInfo.name), listQueryIntentActivities.size());
        }
        return new mZx(null, listQueryIntentActivities.size());
    }

    /* compiled from: ToolUtils.java */
    public static class mZx {
        public final ComponentName EYQ;
        public final int mZx;

        public mZx(ComponentName componentName, int i) {
            this.EYQ = componentName;
            this.mZx = i;
        }
    }

    public static int Td(Context context, Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return context.getPackageManager().queryIntentActivities(intent, 65536).size();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean EYQ() {
        return (com.bytedance.sdk.openadsdk.core.nWX.EYQ() == null || com.bytedance.sdk.openadsdk.core.nWX.EYQ().Pm()) ? false : true;
    }

    public static boolean Td(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.mZx.EYQ(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (ub == null) {
            return null;
        }
        try {
            return Td(ub.KvC());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int EYQ(String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    public static String mZx() {
        String strMZx;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.Td.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ());
        try {
            if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                strMZx = com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.mZx("sp_multi_ua_data", "android_system_ua", "unKnow");
            } else {
                strMZx = com.bytedance.sdk.openadsdk.core.Td.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ()).mZx("android_system_ua", "unKnow");
            }
        } catch (Exception unused) {
        }
        if (strMZx != null && !"unKnow".equals(strMZx)) {
            return strMZx;
        }
        FutureTask futureTask = new FutureTask(new EYQ(2));
        mZx.execute(futureTask);
        str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.pi.EYQ("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static String Td() throws JSONException {
        if (!TextUtils.isEmpty(Kbd)) {
            return Kbd;
        }
        com.bytedance.sdk.openadsdk.multipro.Td.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ());
        String strEYQ = com.bytedance.sdk.openadsdk.core.QQ.EYQ("sdk_local_web_ua", SignalManager.TWENTY_FOUR_HOURS_MILLIS);
        Kbd = strEYQ;
        if (TextUtils.isEmpty(strEYQ)) {
            ReentrantLock reentrantLock = IPb;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (Build.VERSION.SDK_INT < 17) {
                            xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.FH.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        if (TextUtils.isEmpty(FH.Kbd)) {
                                            SSWebView sSWebView = new SSWebView(com.bytedance.sdk.openadsdk.core.hu.EYQ());
                                            sSWebView.setWebViewClient(new SSWebView.EYQ());
                                            String unused = FH.Kbd = sSWebView.getUserAgentString();
                                        }
                                    } catch (Exception e) {
                                        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", "", e);
                                    } catch (NoClassDefFoundError e2) {
                                        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", "", e2);
                                    }
                                }
                            });
                        } else if (TextUtils.isEmpty(Kbd)) {
                            Kbd = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.hu.EYQ());
                        }
                        com.bytedance.sdk.openadsdk.core.QQ.EYQ("sdk_local_web_ua", Kbd);
                        reentrantLock.unlock();
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", "", e);
                        return Kbd;
                    } catch (NoClassDefFoundError e2) {
                        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", "", e2);
                        return Kbd;
                    }
                }
            } finally {
                IPb.unlock();
            }
        }
        return Kbd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String NZ() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.hu.EYQ());
            webView.setWebViewClient(new SSWebView.EYQ());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                    com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    com.bytedance.sdk.openadsdk.core.Td.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ()).EYQ("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    /* compiled from: ToolUtils.java */
    public static class EYQ implements Callable<String> {
        private final int EYQ;

        EYQ(int i) {
            this.EYQ = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String strMZx;
            strMZx = "unKnow";
            int i = this.EYQ;
            if (i == 1) {
                strMZx = Td();
            } else if (i == 2) {
                strMZx = mZx();
            }
            return strMZx;
        }

        private String mZx() {
            String property;
            Throwable th;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                                com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_ua_data", "android_system_ua", property);
                            } else {
                                com.bytedance.sdk.openadsdk.core.Td.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ()).EYQ("android_system_ua", property);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.pi.EYQ("getUA", "e:" + th.getMessage());
                        return property;
                    }
                }
            } catch (Throwable th3) {
                property = "unKnow";
                th = th3;
            }
            return property;
        }

        private synchronized String Td() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.FH.EYQ.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = FH.NZ();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", e.getMessage());
            }
            return strArr[0];
        }
    }

    public static String Pm() {
        return hYh.EYQ();
    }

    public static synchronized String Kbd() {
        Context contextEYQ;
        if (TextUtils.isEmpty(VwS) && (contextEYQ = com.bytedance.sdk.openadsdk.core.hu.EYQ()) != null) {
            try {
                VwS = contextEYQ.getPackageName();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
            }
        }
        return VwS;
    }

    public static synchronized String IPb() {
        if (TextUtils.isEmpty(QQ) && com.bytedance.sdk.openadsdk.core.hu.EYQ() != null) {
            try {
                PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.hu.EYQ().getPackageManager().getPackageInfo(Kbd(), 0);
                QQ = String.valueOf(packageInfo.versionCode);
                HX = packageInfo.versionName;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
            }
        }
        return QQ;
    }

    public static synchronized String VwS() {
        if (TextUtils.isEmpty(HX) && com.bytedance.sdk.openadsdk.core.hu.EYQ() != null) {
            try {
                PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.hu.EYQ().getPackageManager().getPackageInfo(Kbd(), 0);
                QQ = String.valueOf(packageInfo.versionCode);
                HX = packageInfo.versionName;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
            }
        }
        return HX;
    }

    public static String EYQ(Context context) throws IOException {
        String strMZx = com.bytedance.sdk.openadsdk.core.Td.EYQ(context).mZx("total_memory", (String) null);
        if (strMZx == null || mZx(strMZx) <= 0) {
            strMZx = Td("MemTotal");
            if (mZx(strMZx) <= 0) {
                strMZx = QQ();
            }
            com.bytedance.sdk.openadsdk.core.Td.EYQ(context).EYQ("total_memory", strMZx);
        }
        return strMZx;
    }

    public static long mZx(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String QQ() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.hu.EYQ().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.totalMem > 0) {
                return String.valueOf(memoryInfo.totalMem / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String mZx(Context context) {
        return com.bytedance.sdk.openadsdk.core.Td.EYQ(context).mZx("total_memory", "0");
    }

    public static String HX() {
        return Td("MemTotal");
    }

    public static String Td(String str) throws IOException {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String[] strArrSplit = line.split("\\s+");
                String str2 = strArrSplit[1];
                String str3 = strArrSplit[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str3;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static long Td(Context context) {
        return com.bytedance.sdk.openadsdk.core.Td.EYQ(context).mZx("total_internal_storage", 0L).longValue();
    }

    public static long tp() {
        long blockSize;
        long blockCount;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                blockCount = statFs.getBlockCountLong();
            } else {
                blockSize = statFs.getBlockSize();
                blockCount = statFs.getBlockCount();
            }
            return blockCount * blockSize;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long Pm(Context context) {
        return com.bytedance.sdk.openadsdk.core.Td.EYQ(context).mZx("free_internal_storage", 0L).longValue();
    }

    public static long Kbd(Context context) {
        return com.bytedance.sdk.openadsdk.core.Td.EYQ(context).mZx("total_sdcard_storage", 0L).longValue();
    }

    public static long MxO() {
        try {
            if (!tPj()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    private static boolean tPj() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int IPb(Context context) {
        return com.bytedance.sdk.openadsdk.core.Td.EYQ(context).mZx("is_root", -1);
    }

    public static boolean tsL() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String Pm(String str) {
        return EYQ(str, false);
    }

    public static String EYQ(String str, boolean z) {
        String str2;
        String strFtN = com.bytedance.sdk.openadsdk.core.hu.Pm().FtN();
        if (TextUtils.isEmpty(strFtN)) {
            int iHu = hu();
            if (iHu == 1) {
                str2 = "https://pangolin16.sgsnssdk.com" + str;
            } else if (iHu == 2) {
                str2 = "https://pangolin16.sgsnssdk.com" + str;
            } else {
                str2 = "https://pangolin16.isnssdk.com" + str;
            }
            if (!z) {
                return lEs.EYQ(str2);
            }
            return tsL(str2);
        }
        String strEYQ = "https://" + strFtN + str;
        if (lEs.EYQ() && !z) {
            strEYQ = lEs.EYQ(strEYQ);
        }
        return z ? tsL(strEYQ) : strEYQ;
    }

    private static String tsL(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", IPb()).toString();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", e.getMessage());
            return str;
        }
    }

    public static String Kbd(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.hu.Pm().PI();
        }
        return TextUtils.isEmpty(str) ? hu() == 2 ? "https://log.sgsnssdk.com/service/2/app_log/" : "https://log-mva.isnssdk.com/service/2/app_log/" : !str.startsWith(ProxyConfig.MATCH_HTTP) ? "https://".concat(String.valueOf(str)) : str;
    }

    public static String pi() {
        return String.format("https://%s", "log.byteoversea.com/service/2/app_log_test/");
    }

    public static String nWX() {
        int iHu = hu();
        return (iHu == 1 || iHu == 2) ? "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    public static String KO() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int hu() {
        try {
            String id = TimeZone.getDefault().getID();
            if (tp.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id != null && id.startsWith("Europe/")) {
                return 4;
            }
            if (id != null && id.startsWith("America/")) {
                if (!MxO.contains(id)) {
                    return 5;
                }
            }
            return 3;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static String VwS(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int UB() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static String Uc() {
        int i = -UB();
        if (i >= 0) {
            return "Etc/GMT+".concat(String.valueOf(i));
        }
        return "Etc/GMT".concat(String.valueOf(i));
    }

    public static JSONObject EYQ(boolean z, com.bytedance.sdk.openadsdk.core.model.UB ub, long j, long j2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, ub.VOV());
            jSONObject.put("load_time", j);
            com.bykv.vk.openvk.component.video.api.Td.mZx mzxMN = ub.mN();
            if (mzxMN != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, mzxMN.Kbd());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, mzxMN.HX());
            }
            if (!z) {
                jSONObject.put(AndroidBridgeConstants.ERROR_CODE, j2);
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                jSONObject.put("error_message", str);
            }
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", "getVideoDownload json error", e);
        }
        return jSONObject;
    }

    public static JSONObject EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, long j, com.bykv.vk.openvk.component.video.api.EYQ eyq) throws JSONException {
        if (ub == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, ub.VOV());
            jSONObject.put("buffers_time", j);
            com.bykv.vk.openvk.component.video.api.Td.mZx mzxMN = ub.mN();
            if (mzxMN != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, mzxMN.Kbd());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, mzxMN.HX());
            }
            EYQ(jSONObject, eyq);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", "getVideoAction json error", e);
        }
        return jSONObject;
    }

    private static void EYQ(JSONObject jSONObject, com.bykv.vk.openvk.component.video.api.EYQ eyq) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || eyq == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(eyq.Pm()), Integer.valueOf(eyq.Kbd())));
        } catch (Throwable unused) {
        }
    }

    public static boolean IPb(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, String str) {
        if (ub != null) {
            try {
                String strXPd = ub.XPd();
                if (TextUtils.isEmpty(strXPd) && ub.dVQ() != null && ub.dVQ().Td() == 1 && !TextUtils.isEmpty(ub.dVQ().mZx())) {
                    strXPd = ub.dVQ().mZx();
                }
                String str2 = strXPd;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.lEs.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ(), str2, ub, EYQ(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean mZx(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (ub == null) {
            return true;
        }
        int iMZx = com.bytedance.sdk.openadsdk.core.hu.Pm().mZx(ub.yK());
        int iTd = com.bytedance.sdk.component.utils.hu.Td(com.bytedance.sdk.openadsdk.core.hu.EYQ());
        if (iMZx == 1) {
            return Pm(iTd);
        }
        if (iMZx == 2) {
            return Kbd(iTd) || Pm(iTd) || IPb(iTd);
        }
        if (iMZx != 3) {
            return iMZx != 5 || Pm(iTd) || IPb(iTd);
        }
        return false;
    }

    public static boolean QQ(Context context) {
        if (context != null) {
            return !(context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30 && context.checkSelfPermission("android.permission.QUERY_ALL_PACKAGES") != 0);
        }
        throw new IllegalArgumentException("params context is null");
    }

    public static String VwS(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static void EYQ(String str, String str2, Context context) {
        int i;
        if (TextUtils.isEmpty(str2) || !HX(context)) {
            return;
        }
        int length = str2.length();
        if (length % 3572 == 0) {
            i = length / 3572;
        } else {
            i = (length / 3572) + 1;
        }
        int i2 = 0;
        int i3 = 3572;
        int i4 = 1;
        while (i4 <= i) {
            if (i3 < length) {
                Log.d(str, i + "-" + i4 + ":" + str2.substring(i2, i3));
                i4++;
                i2 = i3;
                i3 += 3572;
            } else {
                Log.d(str, i + "-" + i4 + ":" + str2.substring(i2));
                return;
            }
        }
    }

    public static boolean HX(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static long tp(Context context) {
        int i = -1;
        try {
            i = context.getApplicationInfo().targetSdkVersion;
            Integer.valueOf(i);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", th.getMessage());
        }
        return i;
    }

    public static long MxO(Context context) {
        int i = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i = context.getApplicationInfo().minSdkVersion;
                Integer.valueOf(i);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.ToolUtils", th.getMessage());
        }
        return i;
    }

    public static void QQ(final String str) {
        com.bytedance.sdk.openadsdk.tp.Td.EYQ();
        com.bytedance.sdk.openadsdk.tp.Td.EYQ("reportMultiLog", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.utils.FH.2
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                if (FH.Td || !com.bytedance.sdk.openadsdk.core.hu.Pm().TZn()) {
                    return null;
                }
                boolean unused = FH.Td = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", str);
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("reportMultiLog").mZx(jSONObject.toString());
            }
        });
    }

    public static boolean HX(String str) {
        if (com.bytedance.sdk.openadsdk.core.pi.Kbd()) {
            return true;
        }
        com.bytedance.sdk.component.utils.pi.mZx("You must use method '" + str + "' after initialization, please check.");
        return false;
    }

    public static void tp(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.pi.mZx("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
    }

    public static int tsL(Context context) {
        return VwS(com.bytedance.sdk.component.utils.NZ.EYQ(context, 0L));
    }

    public static boolean hYh() {
        return Pm.get() == 1;
    }

    public static void pi(Context context) {
        try {
            AtomicInteger atomicInteger = Pm;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.tp.Td.EYQ().mZx();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            Pm.set(2);
        }
    }

    public static boolean QQ(int i) {
        if (i <= 0) {
            return false;
        }
        return i >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i;
    }

    public static void EYQ(StringBuilder sb, String str, String str2) {
        int iIndexOf;
        if (sb == null || TextUtils.isEmpty(str) || (iIndexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static int nWX(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = EYQ;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(listQueryIntentActivities.size());
        EYQ = numValueOf;
        return numValueOf.intValue();
    }
}
