package com.json;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class p0 {
    public static int a(Activity activity) {
        return activity.getRequestedOrientation();
    }

    static PackageInfo a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(g(context), 0);
    }

    public static String a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && !TextUtils.isEmpty(str)) {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static JSONObject a(Context context, JSONArray jSONArray) throws JSONException, PackageManager.NameNotFoundException {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            int i = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i], (packageInfo.requestedPermissionsFlags[i] & 2) != 0 ? "Granted" : "Rejected");
                    i++;
                }
            } else {
                List listAsList = Arrays.asList(packageInfo.requestedPermissions);
                while (i < jSONArray.length()) {
                    String string = jSONArray.getString(i);
                    int iIndexOf = listAsList.indexOf(string);
                    if (iIndexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[iIndexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static boolean a() {
        try {
            Class.forName("kotlin.jvm.internal.Intrinsics");
            return true;
        } catch (Throwable unused) {
            Log.d("ApplicationContext", "Kotlin Intrinsics not found");
            return false;
        }
    }

    public static String b(Context context) {
        try {
            return a(context).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath();
        }
        return null;
    }

    public static boolean c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static long d(Context context) {
        try {
            return a(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static boolean d(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean z = false;
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions == null) {
                return false;
            }
            boolean zEquals = false;
            while (true) {
                try {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length || zEquals) {
                        break;
                    }
                    zEquals = str.equals(strArr[i]);
                    i++;
                } catch (Exception e) {
                    e = e;
                    z = zEquals;
                    e.printStackTrace();
                    return z;
                }
            }
            return zEquals;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static String e(Context context) {
        String installerPackageName;
        try {
            installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable unused) {
            installerPackageName = null;
        }
        return TextUtils.isEmpty(installerPackageName) ? "" : installerPackageName;
    }

    public static long f(Context context) {
        try {
            return a(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static String g(Context context) {
        return context.getPackageName();
    }
}
