package com.json;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.json.b6;
import com.json.environment.ContextProvider;
import com.json.environment.IronSourceSharedPreferencesUtilities;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.od;
import com.json.t2;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* loaded from: classes4.dex */
public class y3 implements b6, b6.a {
    private static final String A = "IABTCF_TCString";
    private static final String B = "IABTCF_AddtlConsent";
    private static final String i = "android";
    private static final String j = "com.google.android.gms.permission.AD_ID";
    private static final String k = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static final String l = "com.google.android.gms.appset.AppSet";
    private static final String m = "com.google.android.gms.tasks.OnSuccessListener";
    private static final String n = "getAdvertisingIdInfo";
    private static final String o = "getClient";
    private static final String p = "getAppSetIdInfo";
    private static final String q = "addOnSuccessListener";
    private static final String r = "getId";
    private static final String s = "isLimitAdTrackingEnabled";
    private static final String t = "Mediation_Shared_Preferences";
    private static final String u = "supersonic_shared_preferen";
    private static final String v = "cachedUUID";
    private static final String w = "auid";
    private static final String x = "browser_user_agent";
    private static final String y = "browser_user_agent_time";
    private static final String z = "IABTCF_gdprApplies";
    private String b = null;
    private String c = null;
    private String d = "";
    private boolean e = false;
    private String f = "";
    private volatile String g;
    private volatile String h;

    class a implements InvocationHandler {
        a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr == null) {
                return null;
            }
            try {
                if (objArr.length <= 0 || (obj2 = objArr[0]) == null) {
                    return null;
                }
                String string = obj2.getClass().getMethod(y3.r, new Class[0]).invoke(objArr[0], new Object[0]).toString();
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                y3.this.f = string;
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2458a;
        final /* synthetic */ long b;

        b(Context context, long j) {
            this.f2458a = context;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = new WebView(this.f2458a);
                webView.setLayerType(1, null);
                WebSettings settings = webView.getSettings();
                y3.this.d = settings.getUserAgentString();
                webView.destroy();
                y3 y3Var = y3.this;
                y3Var.a(this.f2458a, y3Var.d);
                if (this.b > 0) {
                    y3.this.b(this.f2458a, System.currentTimeMillis());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private String L(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objN = N(context);
        return objN.getClass().getMethod(r, new Class[0]).invoke(objN, new Object[0]).toString();
    }

    private void M(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = Class.forName(l);
        Object objInvoke = cls.getMethod(o, Context.class).invoke(cls, context);
        Object objInvoke2 = objInvoke.getClass().getMethod(p, new Class[0]).invoke(objInvoke, new Object[0]);
        Class<?> cls2 = Class.forName(m);
        objInvoke2.getClass().getMethod(q, cls2).invoke(objInvoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls2}, new a()));
    }

    private Object N(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(k);
        return cls.getMethod(n, Context.class).invoke(cls, context);
    }

    private String O(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objN = N(context);
        return String.valueOf(((Boolean) objN.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(objN, new Object[0])).booleanValue());
    }

    private String P(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, t, x, "");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private long Q(Context context) {
        try {
            return Long.parseLong(IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, t, y, String.valueOf(-1L)));
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    private long a(File file) {
        long availableBlocksLong;
        long blockSizeLong;
        StatFs statFs = new StatFs(file.getPath());
        if (Build.VERSION.SDK_INT < 19) {
            availableBlocksLong = statFs.getAvailableBlocks();
            blockSizeLong = statFs.getBlockSize();
        } else {
            availableBlocksLong = statFs.getAvailableBlocksLong();
            blockSizeLong = statFs.getBlockSizeLong();
        }
        return (availableBlocksLong * blockSizeLong) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, t, x, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, long j2) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, t, y, String.valueOf(j2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i2 = 0; i2 < 8; i2++) {
                if (new File(strArr[i2] + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.json.b6
    public String A(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, A, null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.json.b6
    public boolean B(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.json.b6
    public String C(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.json.b6
    public String D(Context context) {
        if (v3.f2345a.c()) {
            try {
                M(context);
                if (!TextUtils.isEmpty(this.f)) {
                    return this.f;
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    @Override // com.json.b6
    public int E(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.json.b6
    public String F(Context context) throws Exception {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.json.b6
    public boolean G(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.json.b6
    public String H(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, B, null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.json.b6
    public int I(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.json.b6
    public synchronized String J(Context context) {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (IronSourceSharedPreferencesUtilities.getBooleanFromSharedPrefs(context, t, b6.f1706a, true)) {
            String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, t, v, "");
            if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                String string = UUID.randomUUID().toString();
                this.b = string;
                IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, t, v, string);
            } else {
                this.b = stringFromSharedPrefs;
            }
        }
        return this.b;
    }

    @Override // com.json.b6
    public int K(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.json.b6
    public int a() {
        return j();
    }

    @Override // com.json.b6
    public long a(String str) {
        return a(new File(str));
    }

    @Override // com.json.b6
    public String a(Context context) {
        String strO;
        try {
            if (!v3.f2345a.a()) {
                strO = O(context);
            } else if (this.g == null) {
                strO = O(context);
                try {
                    if (!TextUtils.isEmpty(strO)) {
                        this.g = strO;
                    }
                } catch (Exception unused) {
                    return strO;
                }
            } else {
                strO = this.g;
            }
            return strO;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.ironsource.b6.a
    public void a(Context context, long j2) {
        if (context != null) {
            if (!new zd(new od.a()).a(Q(context), j2)) {
                this.d = P(context);
                this.e = !r0.isEmpty();
            }
            if (this.d.isEmpty()) {
                if (Build.VERSION.SDK_INT < 17) {
                    IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(context, j2));
                    return;
                }
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.d = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j2 > 0) {
                        b(context, System.currentTimeMillis());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.json.b6
    public boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    @Override // com.json.b6
    public String b() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    @Override // com.json.b6
    public String b(Context context) throws Exception {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.json.b6
    public boolean c() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return Environment.isExternalStorageRemovable();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.json.b6
    public boolean c(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override // com.json.b6
    public int d() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.json.b6
    public boolean d(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override // com.json.b6
    public File e(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.json.b6
    public String e() {
        return Build.MODEL;
    }

    @Override // com.json.b6
    public String f(Context context) {
        if (context == null) {
            return "";
        }
        int iK = K(context);
        if (iK != 0) {
            if (iK != 1) {
                if (iK != 11) {
                    if (iK != 12) {
                        switch (iK) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return t2.h.D;
        }
        return t2.h.C;
    }

    @Override // com.json.b6
    public boolean f() {
        return b("su");
    }

    @Override // com.json.b6
    public String g() {
        return Build.MANUFACTURER;
    }

    @Override // com.json.b6
    public boolean g(Context context) {
        return Build.VERSION.SDK_INT >= 17 && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.json.b6
    public float h() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // com.json.b6
    public long h(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.json.b6
    public long i() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.json.b6
    public String i(Context context) {
        return r(context) ? "Tablet" : "Phone";
    }

    @Override // com.json.b6
    public int j() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.json.b6
    public String j(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.json.b6
    public int k() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.json.b6
    public File k(Context context) {
        return context.getCacheDir();
    }

    @Override // com.json.b6
    public int l(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.json.b6
    public String l() {
        return "android";
    }

    @Override // com.json.b6
    public float m(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e) {
            e.printStackTrace();
            return -1.0f;
        }
    }

    @Override // com.json.b6
    public long m() {
        if (c()) {
            return a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.json.b6
    public long n() {
        return a(Environment.getDataDirectory());
    }

    @Override // com.json.b6
    public String n(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.json.b6
    public String o() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.json.b6
    public List<ApplicationInfo> o(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.json.b6
    public int p() {
        return -(TimeZone.getDefault().getOffset(i()) / MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
    }

    @Override // com.json.b6
    public String p(Context context) {
        String strL;
        v3 v3Var = v3.f2345a;
        if (v3Var.b()) {
            try {
                if (!v3Var.a()) {
                    strL = L(context);
                } else if (this.h == null) {
                    strL = L(context);
                    try {
                        if (!TextUtils.isEmpty(strL)) {
                            this.h = strL;
                        }
                    } catch (Exception unused) {
                        return strL;
                    }
                } else {
                    strL = this.h;
                }
                return strL;
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    @Override // com.json.b6
    public boolean q() {
        return this.e;
    }

    @Override // com.json.b6
    public boolean q(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override // com.json.b6
    public int r() {
        return d();
    }

    @Override // com.json.b6
    public boolean r(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return false;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return ((float) displayMetrics.widthPixels) / displayMetrics.density >= 600.0f;
    }

    @Override // com.json.b6
    public String s() {
        try {
            return this.d.isEmpty() ? P(ContextProvider.getInstance().getApplicationContext()) : this.d;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.json.b6
    public synchronized String s(Context context) {
        if (!TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        if (context == null) {
            return "";
        }
        String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "supersonic_shared_preferen", "auid", "");
        this.c = stringFromSharedPrefs;
        if (TextUtils.isEmpty(stringFromSharedPrefs)) {
            String string = UUID.randomUUID().toString();
            this.c = string;
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "supersonic_shared_preferen", "auid", string);
        }
        return this.c;
    }

    @Override // com.json.b6
    public File t(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.json.b6
    public boolean u(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(j)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.json.b6
    public File v(Context context) {
        return context.getFilesDir();
    }

    @Override // com.json.b6
    public int w(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // com.json.b6
    public int x(Context context) {
        int I = I(context);
        int iE = E(context);
        return (((I == 0 || I == 2) && iE == 2) || ((I == 1 || I == 3) && iE == 1)) ? 2 : 1;
    }

    @Override // com.json.b6
    public int y(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, z, -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.json.b6
    public int z(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }
}
