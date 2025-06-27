package com.json.mediationsdk.integration;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinMediationProvider;
import com.json.environment.StringUtils;
import com.json.mediationsdk.IntegrationData;
import com.json.mediationsdk.p;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;

/* loaded from: classes4.dex */
public class IntegrationHelper {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1958a = "IntegrationHelper";
    private static final String b = "4.1";
    private static final String c = "4.3";

    class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1959a;

        a(Context context) {
            this.f1959a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(IntegrationHelper.f1958a, "--------------- Google Play Services --------------");
                if (this.f1959a.getPackageManager().getApplicationInfo(this.f1959a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.i(IntegrationHelper.f1958a, "Google Play Services - VERIFIED");
                    String strB = p.p().b(this.f1959a);
                    if (!TextUtils.isEmpty(strB)) {
                        Log.i(IntegrationHelper.f1958a, "GAID is: " + strB + " (use this for test devices)");
                    }
                } else {
                    Log.e(IntegrationHelper.f1958a, "Google Play Services - MISSING");
                }
            } catch (Exception unused) {
                Log.e(IntegrationHelper.f1958a, "Google Play Services - MISSING");
            }
        }
    }

    private static IntegrationData a(Context context, String str) {
        String str2;
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", Context.class).invoke(null, context);
            Log.i(f1958a, "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (ClassNotFoundException unused) {
            str2 = "Adapter - MISSING";
            Log.e(f1958a, str2);
            return null;
        } catch (Exception unused2) {
            str2 = "Adapter version - NOT VERIFIED";
            Log.e(f1958a, str2);
            return null;
        }
    }

    private static void a(Context context) {
        new a(context).start();
    }

    private static void a(String str) {
        try {
            Log.i(f1958a, "SDK Version - " + ((String) Class.forName(str).getMethod("getAdapterSDKVersion", new Class[0]).invoke(null, new Object[0])));
        } catch (Exception unused) {
            Log.w("validateSDKVersion", "Unable to get SDK version");
        }
    }

    private static boolean a(IntegrationData integrationData) {
        if (integrationData.version.startsWith(b) || integrationData.version.startsWith(c)) {
            Log.i(f1958a, "Adapter - VERIFIED");
            return true;
        }
        Log.e(f1958a, integrationData.name + " adapter " + integrationData.version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + ", please update your adapter to version " + b + ".*");
        return false;
    }

    private static void b(Context context) {
        Log.i(f1958a, "*** Permissions ***");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
            Log.i(f1958a, "android.permission.INTERNET - VERIFIED");
        } else {
            Log.e(f1958a, "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            Log.i(f1958a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            Log.e(f1958a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
    }

    private static boolean b(Context context, String str) {
        String str2;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            char c2 = 65535;
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1875652737) {
                if (iHashCode != 92668925) {
                    if (iHashCode == 497130182 && lowerCase.equals("facebook")) {
                        c2 = 1;
                    }
                } else if (lowerCase.equals(AppLovinMediationProvider.ADMOB)) {
                    c2 = 2;
                }
            } else if (lowerCase.equals("supersonicads")) {
                c2 = 0;
            }
            if (c2 == 0) {
                str2 = "--------------- IronSource --------------";
            } else if (c2 == 1) {
                str2 = "--------------- Meta --------------";
            } else if (c2 != 2) {
                str2 = "--------------- " + str + " --------------";
            } else {
                str2 = "--------------- Google (AdMob and Ad Manager) --------------";
            }
            Log.i(f1958a, str2);
            String str3 = "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
            IntegrationData integrationDataA = a(context, str3);
            if (integrationDataA == null) {
                return false;
            }
            if (!str.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) && !a(integrationDataA)) {
                return false;
            }
            a(str3);
            return true;
        } catch (Exception e) {
            Log.e(f1958a, "isAdapterValid " + str, e);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00c6. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void validateIntegration(android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.integration.IntegrationHelper.validateIntegration(android.content.Context):void");
    }
}
