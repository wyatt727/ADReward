package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.icu.util.VersionInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.t2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zp {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1253a = {60, 60, 24, 7, 4, 12};
    private static final String[] b = {" second", " minute", " hour", " day", " week", " month"};
    private static final String[] c = {CmcdHeadersFactory.STREAMING_FORMAT_SS, "m", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "d", "w", "mth"};
    private static final DecimalFormat d = new DecimalFormat();
    private static Boolean e;
    private static Boolean f;
    private static String g;
    private static Boolean h;

    public interface b {
        void onCachedResourcesChecked(boolean z);
    }

    public static double a(long j) {
        return j / 1024.0d;
    }

    public static int a(int i, int i2) {
        return (i < 0 || i > 100) ? i2 : i;
    }

    public static void a() {
    }

    public static boolean a(long j, long j2) {
        return (j & j2) != 0;
    }

    public static float b(float f2) {
        return f2 * 1000.0f;
    }

    public static int b(int i) {
        return i * 1024;
    }

    public static long b(long j) {
        return j * 8;
    }

    public static void b() {
    }

    public static void c() {
    }

    public static double d(long j) {
        return j / 1000.0d;
    }

    public static int f() {
        return 2015001;
    }

    public static boolean h() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean h(Context context) {
        if (f == null) {
            f = Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        return f.booleanValue();
    }

    public static boolean k(Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.k.k();
        }
        if (context != null) {
            return t0.a(context).a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static boolean k() {
        Context contextK = com.applovin.impl.sdk.k.k();
        if (contextK != null) {
            return t0.a(contextK).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public static double c(long j) {
        return a(b(j));
    }

    public static String l(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return listQueryIntentActivities.get(0).activityInfo.name;
    }

    public static int f(String str) {
        int i = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                com.applovin.impl.sdk.t.h("Utils", "Version number components cannot be longer than two digits -> " + str);
                return i;
            }
            i = (i * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i * 100) + 99 : i;
    }

    public static boolean f(Context context) {
        if (e == null) {
            e = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return e.booleanValue();
    }

    public static int c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static boolean e(Context context) {
        return t0.a(context).a("applovin.sdk.is_test_environment");
    }

    public static boolean i(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    public static boolean i() {
        return !a("com.applovin.sdk.AppLovinSdk");
    }

    public static boolean a(MaxAdFormat maxAdFormat, MaxAdFormat maxAdFormat2) {
        return (maxAdFormat == null || maxAdFormat2 == null || (maxAdFormat != maxAdFormat2 && (!maxAdFormat.isBannerOrLeaderAd() || !maxAdFormat2.isBannerOrLeaderAd()))) ? false : true;
    }

    public static boolean j(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getResources();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean j() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                String displayName = networkInterfaces.nextElement().getDisplayName();
                if (displayName.contains("tun") || displayName.contains("ppp") || displayName.contains("ipsec")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Unable to check Network Interfaces", th);
            return false;
        }
    }

    public static Context d(Context context) {
        return j(context) ? context : com.applovin.impl.sdk.k.k();
    }

    public static String b(Context context) {
        int iMyPid;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        if (StringUtils.isValidString(g)) {
            return g;
        }
        try {
            iMyPid = Process.myPid();
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.b("Utils", "Unable to determine process name", th);
        }
        if (runningAppProcesses == null) {
            com.applovin.impl.sdk.t.c("Utils", "No running app processes. Unable to determine process name");
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (iMyPid == runningAppProcessInfo.pid) {
                String str = runningAppProcessInfo.processName;
                g = str;
                return str;
            }
        }
        return null;
    }

    public static Boolean g(Context context) {
        if (context == null) {
            return null;
        }
        Boolean bool = h;
        if (bool != null) {
            return bool;
        }
        try {
            String strA = t0.a(context).a();
            String strB = b(context);
            if (strB == null) {
                return null;
            }
            if (strB.equals(strA)) {
                Boolean bool2 = Boolean.TRUE;
                h = bool2;
                return bool2;
            }
            if (TextUtils.isEmpty(strA) && strB.equals(context.getPackageName())) {
                Boolean bool3 = Boolean.TRUE;
                h = bool3;
                return bool3;
            }
            Boolean bool4 = Boolean.FALSE;
            h = bool4;
            return bool4;
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.b("Utils", "Unable to determine if the current process is the main process", th);
            return null;
        }
    }

    public static boolean g() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Exception thrown while getting memory state.", th);
        }
        int i = runningAppProcessInfo.importance;
        return i == 100 || i == 200;
    }

    public static String b(Class cls, String str) {
        try {
            Field fieldA = a(cls, str);
            fieldA.setAccessible(true);
            return (String) fieldA.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean e(com.applovin.impl.sdk.k kVar) {
        if (((Boolean) kVar.a(oj.y2)).booleanValue()) {
            return kVar.g0().isMuted();
        }
        return ((Boolean) kVar.a(oj.w2)).booleanValue();
    }

    public static List a(boolean z, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, Context context) {
        Uri uriS0;
        if (bVar instanceof bq) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : new ArrayList(bVar.i())) {
            if (!kVar.D().b(uri.getLastPathSegment(), context)) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().b("Utils", "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        if (z && (uriS0 = bVar.s0()) != null && !kVar.D().b(uriS0.getLastPathSegment(), context)) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("Utils", "Cached video missing: " + uriS0);
            }
            arrayList.add(uriS0);
        }
        return arrayList;
    }

    public static String e(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static String e() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Unable to get Android SDK codename", th);
            return "";
        }
    }

    public static boolean c(String str) {
        return str != null && (str.contains("applovin.com") || str.contains("applvn.com"));
    }

    public static boolean d(com.applovin.impl.sdk.k kVar) {
        String str = kVar.g0().getExtraParameters().get("user_agent_collection_enabled");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    public static String b(String str) {
        return str.replace("ALPlayableAnalytics.trackEvent = ", "ALPlayableAnalytics.trackEvent = function (eventName) {const SDK_URL = 'applovin://com.applovin.sdk/playable_event';if (!Object.values(ALPlayableEvent).includes(eventName)) {var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=0&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();return;}var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=1&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();}; ALPlayableAnalytics.trackEvent_ignore = ");
    }

    public static boolean c(com.applovin.impl.sdk.k kVar) {
        String str = kVar.g0().getExtraParameters().get("run_in_release_mode");
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (com.applovin.impl.sdk.k.k().getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static void a(final boolean z, final com.applovin.impl.sdk.ad.b bVar, final com.applovin.impl.sdk.k kVar, final Context context, b bVar2) {
        final WeakReference weakReference = new WeakReference(bVar2);
        kVar.l0().a(new kn(kVar, "checkIfAdContainsUnavailableCachedResources", new Runnable() { // from class: com.applovin.impl.zp$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                zp.a(weakReference, bVar, kVar, context, z);
            }
        }));
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    public static long d(String str) {
        if (!StringUtils.isValidString(str)) {
            return Long.MAX_VALUE;
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return Long.MAX_VALUE;
        }
    }

    public static long c(float f2) {
        return a(b(f2));
    }

    public static boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void b(String str, String str2) {
        if (str == null || str.length() <= b(8)) {
            return;
        }
        com.applovin.impl.sdk.t.j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + b(8) + " maximum)");
    }

    public static void a(Closeable closeable, com.applovin.impl.sdk.k kVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (kVar != null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    public static byte[] d(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0 || !b(bArr)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2);
            if (i > 0) {
                byteArrayOutputStream.write(bArr2, 0, i);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String d() {
        try {
            return Build.VERSION.RELEASE + " (" + e() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Unable to get Android OS info", th);
            return "";
        }
    }

    public static long c(byte[] bArr) {
        return a(bArr, 0);
    }

    public static int a(String str, String str2) {
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                int iCompareTo = VersionInfo.getInstance(digitsOnlyVersionString).compareTo(VersionInfo.getInstance(digitsOnlyVersionString2));
                return iCompareTo == 0 ? iCompareTo : iCompareTo > 0 ? 1 : -1;
            }
            String[] strArrSplit = digitsOnlyVersionString.split("\\.");
            String[] strArrSplit2 = digitsOnlyVersionString2.split("\\.");
            int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
            int i = 0;
            while (i < iMax) {
                String str3 = StringUtils.isValidString(strArrSplit[i]) ? strArrSplit[i] : "0";
                String str4 = StringUtils.isValidString(strArrSplit2[i]) ? strArrSplit2[i] : "0";
                int i2 = i < strArrSplit.length ? Integer.parseInt(str3) : 0;
                int i3 = i < strArrSplit2.length ? Integer.parseInt(str4) : 0;
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                i++;
            }
            return 0;
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Failed to process version string.", th);
            return 0;
        }
    }

    public static WebView b(Context context, String str) {
        return a(context, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(AppLovinAd appLovinAd, com.applovin.impl.sdk.k kVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            String strD0 = kVar.d0();
            String strD02 = ((AppLovinAdBase) appLovinAd).getSdk().d0();
            if (strD0.equals(strD02)) {
                return;
            }
            com.applovin.impl.sdk.t.h("AppLovinAd", "Ad was loaded from sdk with key: " + strD02 + ", but is being rendered from sdk with key: " + strD0);
            kVar.F().c(aa.q);
        }
    }

    public static boolean b(com.applovin.impl.sdk.k kVar) {
        if (!x3.e()) {
            return true;
        }
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th) {
            kVar.L();
            if (!com.applovin.impl.sdk.t.a()) {
                return false;
            }
            kVar.L().d("Utils", "Failed to wrap JSONObject with exception", th);
            return false;
        }
    }

    public static boolean b(List list) {
        Context contextK = com.applovin.impl.sdk.k.k();
        if (contextK == null) {
            com.applovin.impl.sdk.t.h("Utils", "Failed to check whether or not app is member of package names");
            return false;
        }
        return list.contains(contextK.getPackageName());
    }

    public static void a(HttpURLConnection httpURLConnection, com.applovin.impl.sdk.k kVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (kVar != null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    public static String a(Map map, boolean z) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            TreeMap treeMap = new TreeMap(new a());
            treeMap.putAll(map);
            map = treeMap;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(t2.i.c);
            }
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.contains(t2.i.c)) {
                    value = str.replace(t2.i.c, "%26");
                }
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(value);
        }
        return sb.toString();
    }

    private static long a(float f2) {
        return Math.round(f2);
    }

    private static List a(List list, com.applovin.impl.sdk.k kVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                arrayList.add(Class.forName(str));
            } catch (ClassNotFoundException unused) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().b("Utils", "Failed to create class for name: " + str);
                }
            }
        }
        return arrayList;
    }

    public static String a(Object obj) {
        if (obj instanceof be) {
            return ((be) obj).Q();
        }
        if (ve.b(obj)) {
            return ((com.applovin.impl.sdk.ad.b) obj).H();
        }
        return null;
    }

    public static int a(Context context) {
        x3.d();
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static String a(kh khVar, com.applovin.impl.sdk.k kVar) {
        if (khVar == null) {
            return "Unknown error";
        }
        Throwable cause = khVar.getCause();
        String message = cause != null ? cause.getMessage() : "Unknown";
        return "Code: " + khVar.f602a + ", Name: " + khVar.a() + ", Message: " + khVar.getMessage() + ", Cause Class: " + (cause != null ? cause.getClass().getName() : "") + ", Cause Message: " + message;
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str);
        }
    }

    public static String a(Uri uri, String str, com.applovin.impl.sdk.k kVar) {
        List listC = kVar.c(oj.a1);
        String lastPathSegment = uri.getLastPathSegment();
        if (listC.contains(lastPathSegment)) {
            return lastPathSegment;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String queryParameter = uri.getQueryParameter(it.next());
            if (StringUtils.isValidString(queryParameter)) {
                arrayList.add(queryParameter);
            }
        }
        arrayList.addAll(uri.getPathSegments());
        String strEncodeUriString = StringUtils.encodeUriString(TextUtils.join("_", arrayList));
        Integer num = (Integer) kVar.a(oj.b1);
        int length = StringUtils.emptyIfNull(strEncodeUriString).length() + StringUtils.emptyIfNull(str).length();
        if (length > num.intValue() && StringUtils.isValidString(strEncodeUriString)) {
            strEncodeUriString = strEncodeUriString.substring(length - num.intValue());
        }
        if (!StringUtils.isValidString(strEncodeUriString) || !StringUtils.isValidString(str)) {
            return strEncodeUriString;
        }
        return str + strEncodeUriString;
    }

    public static ActivityManager.MemoryInfo a(ActivityManager activityManager) {
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.b("Utils", "Unable to collect memory info.", th);
            return null;
        }
    }

    public static Map a(AppLovinSdkSettings appLovinSdkSettings) {
        try {
            Field fieldA = a(appLovinSdkSettings.getClass(), "metaData");
            if (fieldA != null) {
                fieldA.setAccessible(true);
            }
            return (Map) fieldA.get(appLovinSdkSettings);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List a(JSONObject jSONObject, String str, String str2, com.applovin.impl.sdk.k kVar) {
        return a(jSONObject, str, null, str2, null, false, kVar);
    }

    public static List a(JSONObject jSONObject, String str, Map map, String str2, Map map2, boolean z, com.applovin.impl.sdk.k kVar) {
        if (map == null) {
            map = new HashMap(1);
        }
        Map map3 = map;
        map3.put("{CLCODE}", str);
        return a(jSONObject, map3, str2, map2, z, kVar);
    }

    public static List a(JSONObject jSONObject, Map map, String str, Map map2, boolean z, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList(jSONObject.length() + 1);
        if (StringUtils.isValidString(str)) {
            arrayList.add(new s(str, null, map2, z));
        }
        if (jSONObject.length() <= 0) {
            return arrayList;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    String strOptString = jSONObject.optString(next);
                    String strReplace = StringUtils.replace(next, map);
                    if (AppLovinSdkUtils.isValidString(strOptString)) {
                        strOptString = StringUtils.replace(strOptString, map);
                    }
                    arrayList.add(new s(strReplace, strOptString, map2, z));
                }
            } catch (Throwable th) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Failed to create and add postback url.", th);
                }
            }
        }
        return arrayList;
    }

    public static String a(long j, boolean z) {
        String[] strArr = z ? b : c;
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        for (int i = 0; i < strArr.length; i++) {
            long j2 = f1253a[i];
            if (jCurrentTimeMillis < j2) {
                if (jCurrentTimeMillis <= 0) {
                    return z ? "just now" : "now";
                }
                return String.format("%d%s%s%s", Long.valueOf(jCurrentTimeMillis), strArr[i], (!z || jCurrentTimeMillis <= 1) ? "" : CmcdHeadersFactory.STREAMING_FORMAT_SS, z ? " ago" : "");
            }
            jCurrentTimeMillis /= j2;
        }
        return z ? "just now" : "now";
    }

    public static String a(int i, Context context, com.applovin.impl.sdk.k kVar) {
        if (i == 0) {
            return "";
        }
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            try {
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e2) {
                if (kVar != null) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("Utils", "Opening raw resource file threw exception", e2);
                    }
                }
                return "";
            } finally {
                a((Closeable) inputStreamOpenRawResource, kVar);
            }
        } catch (Throwable th) {
            if (kVar != null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Failed to retrieve resource " + i, th);
                }
            }
            return "";
        }
    }

    public static long a(com.applovin.impl.sdk.k kVar) {
        long jLongValue = ((Long) kVar.a(oj.E5)).longValue();
        long jLongValue2 = ((Long) kVar.a(oj.F5)).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (jLongValue <= 0 || jLongValue2 <= 0) ? jCurrentTimeMillis : jCurrentTimeMillis + (jLongValue - jLongValue2);
    }

    public static boolean a(Integer num) {
        return num.intValue() > 0 && num.intValue() <= 100 && ((int) (Math.random() * 100.0d)) + 1 <= num.intValue();
    }

    public static int a(int i) {
        return a(i, 95);
    }

    public static h0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        return h0.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
    }

    public static byte[] a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean a(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER;
    }

    public static boolean a(String str, List list) {
        return StringUtils.startsWithAtLeastOnePrefix(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WeakReference weakReference, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, Context context, boolean z) {
        final b bVar2 = (b) weakReference.get();
        if (bVar2 == null) {
            return;
        }
        if (bVar instanceof bq) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.zp$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    bVar2.onCachedResourcesChecked(true);
                }
            });
            return;
        }
        for (Uri uri : new ArrayList(bVar.i())) {
            if (!kVar.D().c(uri.getLastPathSegment(), context)) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().b("Utils", "Cached HTML asset unavailable: " + uri);
                }
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.zp$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar2.onCachedResourcesChecked(false);
                    }
                });
                return;
            }
        }
        if (z) {
            Uri uriS0 = bVar.s0();
            if (!kVar.D().c(uriS0.getLastPathSegment(), context)) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().b("Utils", "Cached video unavailable: " + uriS0);
                }
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.zp$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar2.onCachedResourcesChecked(false);
                    }
                });
                return;
            }
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.zp$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                bVar2.onCachedResourcesChecked(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, String str) {
        Toast toastMakeText = Toast.makeText(context, str, 0);
        toastMakeText.setMargin(0.0f, 0.1f);
        toastMakeText.show();
    }

    public static void a(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, com.applovin.impl.sdk.k kVar) throws JSONException {
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder sb = new StringBuilder();
            sb.append("\n**************************************************\nNO FILL received:\n..ID: \"");
            sb.append(str);
            sb.append("\"\n..FORMAT: \"");
            sb.append(maxAdFormat != null ? maxAdFormat.getLabel() : "None");
            sb.append("\"\n..SDK KEY: \"");
            sb.append(kVar.d0());
            sb.append("\"\n..PACKAGE NAME: \"");
            sb.append(com.applovin.impl.sdk.k.k().getPackageName());
            sb.append("\"\n..Reason: ");
            sb.append(object);
            sb.append("\n**************************************************\n");
            String string = sb.toString();
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("AppLovinSdk", string);
            }
        }
    }

    public static AppLovinAd a(AppLovinAd appLovinAd, com.applovin.impl.sdk.k kVar) {
        if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
            return appLovinAd;
        }
        com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd;
        AppLovinAd appLovinAdDequeueAd = kVar.i().dequeueAd(cVar.getAdZone());
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().a("Utils", "Dequeued ad for dummy ad: " + appLovinAdDequeueAd);
        }
        if (appLovinAdDequeueAd != null) {
            cVar.a(appLovinAdDequeueAd);
            ((AppLovinAdImpl) appLovinAdDequeueAd).setDummyAd(cVar);
            return appLovinAdDequeueAd;
        }
        return cVar.e();
    }

    public static boolean a(Object obj, List list, com.applovin.impl.sdk.k kVar) {
        if (list == null) {
            return false;
        }
        Iterator it = a(list, kVar).iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(obj)) {
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (!(entry.getKey() instanceof String)) {
                            kVar.L();
                            if (com.applovin.impl.sdk.t.a()) {
                                kVar.L().a("Utils", "Invalid key type used. Map keys should be of type String.");
                            }
                            return false;
                        }
                        if (!a(entry.getValue(), list, kVar)) {
                            return false;
                        }
                    }
                    return true;
                }
                if (!(obj instanceof List)) {
                    return true;
                }
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    if (!a(it2.next(), list, kVar)) {
                        return false;
                    }
                }
                return true;
            }
        }
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().a("Utils", "Object '" + obj + "' does not match any of the required types '" + list + "'.");
        }
        return false;
    }

    public static void a(String str, String str2, Map map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    public static Object a(Object obj, com.applovin.impl.sdk.k kVar) {
        int iIntValue;
        String strValueOf;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    strValueOf = (String) key;
                } else {
                    strValueOf = String.valueOf(key);
                }
                map2.put(strValueOf, a(entry.getValue(), kVar));
            }
            return map2;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next(), kVar));
            }
            return arrayList;
        }
        if (obj instanceof Date) {
            return String.valueOf(((Date) obj).getTime());
        }
        String strValueOf2 = String.valueOf(obj);
        if (!(obj instanceof String)) {
            return (!(obj instanceof Uri) || (iIntValue = ((Integer) kVar.a(oj.U0)).intValue()) <= 0 || strValueOf2.length() <= iIntValue) ? strValueOf2 : strValueOf2.substring(0, iIntValue);
        }
        int iIntValue2 = ((Integer) kVar.a(oj.T0)).intValue();
        return (iIntValue2 <= 0 || strValueOf2.length() <= iIntValue2) ? strValueOf2 : strValueOf2.substring(0, iIntValue2);
    }

    public static boolean a(oj ojVar, com.applovin.impl.sdk.k kVar) {
        String str = kVar.g0().getExtraParameters().get("enable_black_screen_fixes");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return ((Boolean) kVar.a(ojVar)).booleanValue();
    }

    public static void a(MaxError maxError, String str, Context context) {
        StringBuilder sb = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb.append("\nFailed to load " + str + " from " + name + ":\n");
                sb.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                sb.append("\n" + name + " Error " + error.getMediatedNetworkErrorCode() + ": " + error.getMediatedNetworkErrorMessage() + "\n\n");
            }
        } else {
            sb.append("Failed to load " + str + " with error " + maxError.getCode() + ": " + maxError.getMessage());
        }
        a("", sb.toString(), context);
    }

    public static void a(final String str, final Context context) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.zp$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                zp.a(context, str);
            }
        });
    }

    public static void a(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static void a(Uri uri, Activity activity, com.applovin.impl.sdk.k kVar) {
        if (activity == null) {
            activity = kVar.p0();
        }
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, kVar.d0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    public static Map a(Map map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return map2;
    }

    public static long a(byte[] bArr, int i) {
        int i2 = i + 8;
        if (bArr.length < i2) {
            throw new IllegalArgumentException("byte array must be at least 8 bytes long");
        }
        long j = 0;
        while (i < i2) {
            j |= (bArr[i] & 255) << (i * 8);
            i++;
        }
        return j;
    }

    public static Map a(Map map, com.applovin.impl.sdk.k kVar) {
        Map map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = (String) map2.get(str);
            if (str2 != null) {
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    public static double a(String str, double d2) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Failed to parse double from String: " + str, th);
            return d2;
        }
    }

    public static WebView a(Context context, String str, boolean z) {
        try {
            WebView webView = new WebView(context);
            if (z) {
                webView.setWebViewClient(new com.applovin.impl.sdk.x());
            }
            return webView;
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    public static void a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        thread.start();
    }

    public static void a(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
    }

    public static String a(double d2, int i) {
        DecimalFormat decimalFormat = d;
        decimalFormat.setMaximumFractionDigits(i);
        return decimalFormat.format(d2);
    }
}
