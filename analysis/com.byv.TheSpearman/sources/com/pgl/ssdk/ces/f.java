package com.pgl.ssdk.ces;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.json.p2;
import com.pgl.ssdk.AbstractC1403d;
import com.pgl.ssdk.C;
import com.pgl.ssdk.C1423y;
import com.pgl.ssdk.D;
import com.pgl.ssdk.E;
import com.pgl.ssdk.F;
import com.pgl.ssdk.G;
import com.pgl.ssdk.H;
import com.pgl.ssdk.J;
import com.pgl.ssdk.M;
import com.pgl.ssdk.Q;
import com.pgl.ssdk.S;
import com.pgl.ssdk.T;
import com.pgl.ssdk.W;
import com.pgl.ssdk.X;
import com.pgl.ssdk.b0;
import com.pgl.ssdk.r;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f {
    private static volatile f h = null;
    private static boolean i = false;
    private static Map j = null;
    private static int k = 1;
    private static Q l;

    /* renamed from: a, reason: collision with root package name */
    public Context f4309a;
    private String b;
    private int c;
    private int d;
    private String e = null;
    private String f = null;
    private String g = null;

    private f(Context context, String str) {
        this.f4309a = null;
        this.b = "";
        this.f4309a = context;
        this.b = str;
    }

    public static String b() {
        if (h != null) {
            return h.b;
        }
        return null;
    }

    public static String c() {
        if (h != null) {
            return h.e;
        }
        return null;
    }

    public static int d() {
        return k;
    }

    public static f e() {
        return h;
    }

    public static Q f() {
        return l;
    }

    public Object a(int i2, Object obj) {
        Object byteArray;
        String string;
        String displayName = null;
        if (i2 == 123) {
            return F.a(this.f4309a);
        }
        if (i2 == 121) {
            return (Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0) : Locale.getDefault()).getLanguage();
        }
        if (i2 == 122) {
            try {
                displayName = TimeZone.getDefault().getDisplayName(false, 0);
            } catch (Throwable unused) {
            }
            return displayName != null ? displayName.trim() : "";
        }
        if (i2 == 126) {
            return D.a(this.f4309a);
        }
        if (i2 == 128) {
            return "";
        }
        if (i2 == 120) {
            return C.b();
        }
        if (i2 == 124) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        if (i2 != 130) {
            if (i2 == 145) {
                Context context = this.f4309a;
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(p2.b);
                if (wifiManager != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(wifiManager.isWifiEnabled() ? "1" : "0");
                    string = sb.toString();
                } else {
                    string = "0";
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append(telephonyManager.getSimState() != 5 ? "0" : "1");
                    return sb2.toString();
                }
                return string + "0";
            }
            if (i2 == 125) {
                return "";
            }
            if (i2 == 129) {
                return E.b(this.f4309a);
            }
            if (i2 == 141) {
                Context context2 = this.f4309a;
                int i3 = -1;
                if (context2 != null) {
                    try {
                        i3 = Settings.System.getInt(context2.getContentResolver(), "screen_brightness", -1);
                    } catch (Throwable unused2) {
                    }
                }
                return String.valueOf(i3);
            }
            if (i2 == 131) {
                return b0.a();
            }
            if (i2 == 132) {
                a((String) obj);
            } else {
                if (i2 == 134) {
                    return H.a(this.f4309a).b();
                }
                if (i2 == 140) {
                    return G.a(this.f4309a).c();
                }
                if (i2 == 144) {
                    return G.a(this.f4309a).b();
                }
                if (i2 == 133) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : j.entrySet()) {
                            if (entry.getValue() == null) {
                                jSONObject.put((String) entry.getKey(), "");
                            } else {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            }
                        }
                        displayName = jSONObject.toString();
                    } catch (Throwable unused3) {
                    }
                    return displayName == null ? JsonUtils.EMPTY_JSON : displayName.trim();
                }
                try {
                    if (i2 == 135) {
                        byte[] byteArray2 = this.f4309a.getPackageManager().getPackageInfo(this.f4309a.getPackageName(), 64).signatures[0].toByteArray();
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                        if (messageDigest != null) {
                            byte[] bArrDigest = messageDigest.digest(byteArray2);
                            StringBuilder sb3 = new StringBuilder();
                            for (byte b : bArrDigest) {
                                sb3.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                                sb3.append(":");
                            }
                            byteArray = sb3.substring(0, sb3.length() - 1);
                            return byteArray;
                        }
                    } else {
                        if (i2 == 136) {
                            byteArray = this.f4309a.getPackageManager().getPackageInfo(this.f4309a.getPackageName(), 64).signatures[0].toByteArray();
                            return byteArray;
                        }
                        if (i2 == 201) {
                            try {
                                displayName = Settings.Secure.getString(this.f4309a.getContentResolver(), "android_id");
                            } catch (Throwable unused4) {
                            }
                            return displayName != null ? displayName.trim() : "";
                        }
                        if (i2 == 202) {
                            return "";
                        }
                        if (i2 == 236) {
                            try {
                                return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, (String) obj);
                            } catch (Throwable unused5) {
                                return null;
                            }
                        }
                        if (i2 == 142) {
                            try {
                                displayName = this.f4309a.getPackageResourcePath();
                            } catch (Throwable unused6) {
                            }
                            return displayName == null ? "" : displayName.trim();
                        }
                        if (i2 == 143) {
                            return F.b(this.f4309a);
                        }
                        if (i2 == 146) {
                            try {
                                return r.b();
                            } catch (Throwable unused7) {
                                return null;
                            }
                        }
                    }
                } catch (Throwable unused8) {
                }
            }
        }
        return null;
    }

    public void a() {
        AbstractC1403d.a(new e(this));
    }

    public void a(HashMap map) {
        if (map != null) {
            j = map;
        }
    }

    public synchronized void b(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.e)) {
            a.meta(103, null, str);
            b0.c();
            this.e = str;
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.g)) {
            a.meta(111, null, str);
            this.g = str;
            b0.c();
        }
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f)) {
            a.meta(112, null, str);
            this.f = str;
            b0.c();
        }
    }

    public static f a(Context context, String str, int i2, int i3, int i4) {
        Application application;
        if (h == null) {
            synchronized (f.class) {
                if (h == null) {
                    if (context == null) {
                        try {
                            application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                        } catch (Throwable unused) {
                            application = null;
                        }
                        context = application.getApplicationContext();
                    }
                    if (context == null) {
                        k = 4;
                        return null;
                    }
                    J.f4291a = i2;
                    Q qA = S.a(context, "nms");
                    if (qA != null) {
                        k = qA.f4298a;
                        l = qA;
                        return null;
                    }
                    f fVar = new f(context, str);
                    h = fVar;
                    fVar.c = i3;
                    h.d = i4;
                    h.a(context);
                    f fVar2 = h;
                    SharedPreferences sharedPreferencesA = T.a(context);
                    String string = sharedPreferencesA != null ? sharedPreferencesA.getString("iid", "") : "";
                    if (TextUtils.isEmpty(string)) {
                        string = UUID.randomUUID().toString();
                        SharedPreferences sharedPreferencesA2 = T.a(context);
                        if (sharedPreferencesA2 != null) {
                            sharedPreferencesA2.edit().putString("iid", string).commit();
                        }
                    }
                    Objects.requireNonNull(fVar2);
                    if (!TextUtils.isEmpty(string)) {
                        a.meta(104, null, string);
                    }
                    C1423y.b(context);
                    k = 0;
                    AbstractC1403d.a(new c());
                }
            }
        }
        return h;
    }

    public void a(String str, String str2, String str3, String str4) {
        this.e = str2;
        this.f = str3;
        a.meta(113, null, str);
        a.meta(112, null, str3);
        a.meta(103, null, str2);
        a.meta(111, null, str4);
        try {
            M.b();
            b0.a(this.f4309a, this.b, new d(this));
            a("CZL-L1st");
        } catch (Throwable unused) {
        }
    }

    private void a(Context context) {
        String packageName;
        String absolutePath;
        String str;
        String absolutePath2;
        String path;
        if (context == null || i) {
            return;
        }
        try {
            a.meta(101, null, "1");
            a.meta(102, null, this.b);
            a.meta(114, null, Integer.valueOf(this.c));
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC1403d.a(context));
            a.meta(105, null, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            try {
                packageName = context.getPackageName();
            } catch (Throwable unused) {
                packageName = null;
            }
            sb2.append(packageName == null ? "" : packageName.trim());
            a.meta(106, null, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            try {
                absolutePath = context.getFilesDir().getAbsolutePath();
            } catch (Throwable unused2) {
                absolutePath = null;
            }
            sb3.append(absolutePath == null ? "" : absolutePath.trim());
            a.meta(107, null, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            try {
                str = context.getApplicationInfo().sourceDir;
            } catch (Throwable unused3) {
                str = null;
            }
            sb4.append(str == null ? "" : str.trim());
            a.meta(108, null, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            try {
                absolutePath2 = Environment.getExternalStorageDirectory().getAbsolutePath();
            } catch (Throwable unused4) {
                absolutePath2 = null;
            }
            sb5.append(absolutePath2 == null ? "" : absolutePath2.trim());
            a.meta(109, null, sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            try {
                path = Environment.getDataDirectory().getPath();
            } catch (Throwable unused5) {
                path = null;
            }
            sb6.append(path != null ? path.trim() : "");
            a.meta(110, null, sb6.toString());
            i = true;
        } catch (Throwable unused6) {
        }
    }

    public void a(String str) {
        X xC;
        try {
            if ("CZL-L1st".equals(str) && (xC = W.a().c()) != null) {
                xC.postDelayed(new g(this.f4309a, str), 10000L);
            }
            AbstractC1403d.a(new e(this));
            C1423y.a();
        } catch (Throwable unused) {
        }
    }
}
