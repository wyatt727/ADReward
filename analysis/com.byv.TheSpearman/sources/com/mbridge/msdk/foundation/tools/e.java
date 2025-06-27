package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.b;
import org.json.JSONObject;

/* compiled from: BaseSameDiTool.java */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f2986a = null;
    public static String b = null;
    public static boolean c = false;
    public static int d = 0;
    private static String e = "";
    private static boolean f = false;
    private static String g = "";

    public static int a() {
        return d;
    }

    public static void a(int i) {
        d = i;
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.a()) {
            return TextUtils.isEmpty(b) ? "" : b;
        }
        if (TextUtils.isEmpty(b)) {
            if (!c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                c = true;
            }
            return "";
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.b()) {
            return b;
        }
        return d == 0 ? b : "";
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.e.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.c.a()) {
                    int i = 1;
                    try {
                        Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        e.a(advertisingIdInfo.getId());
                        e.d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                        e.a(context, advertisingIdInfo.getId(), e.d);
                    } catch (Exception unused) {
                        ad.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                        try {
                            b.a aVarA = new b().a(context);
                            e.a(aVarA.a());
                            if (!aVarA.b()) {
                                i = 0;
                            }
                            e.d = i;
                            e.a(context, aVarA.a(), e.d);
                        } catch (Exception unused2) {
                            ad.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                        }
                    } catch (Throwable th) {
                        ad.b("DomainSameDiTool", th.getMessage());
                    }
                }
            }
        }).start();
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.a()) {
            return TextUtils.isEmpty(f2986a) ? "" : f2986a;
        }
        if (TextUtils.isEmpty(f2986a)) {
            z.j();
            if (!c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                c = true;
            }
            return TextUtils.isEmpty(f2986a) ? "" : f2986a;
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.b()) {
            return f2986a;
        }
        return d == 0 ? f2986a : "";
    }

    public static void a(String str) {
        b = x.b(str);
        f2986a = str;
    }

    public static String d() {
        if (TextUtils.isEmpty(g) && !f) {
            e();
        }
        return g;
    }

    public static String e() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f) {
            return e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.m().c().getContentResolver();
                int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    g = string2;
                    e = x.b(string2);
                }
            } catch (Settings.SettingNotFoundException e2) {
                ad.b("DomainSameDiTool", e2.getMessage());
            }
        } catch (Throwable th) {
            ad.b("DomainSameDiTool", th.getMessage());
        }
        f = true;
        return e;
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry");
            cls.getMethod("check", Context.class).invoke(cls.newInstance(), context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void a(Context context, String str, int i) {
        try {
            if (an.b(str)) {
                al.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            al.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i));
        } catch (Exception e2) {
            ad.b("DomainSameDiTool", e2.getMessage());
        }
    }
}
