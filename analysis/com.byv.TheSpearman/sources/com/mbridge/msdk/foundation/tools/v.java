package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: ResourceUtil.java */
/* loaded from: classes4.dex */
public final class v {
    public static int a(Context context, String str, String str2) {
        String packageName = "";
        try {
            try {
                packageName = com.mbridge.msdk.foundation.controller.c.m().g();
            } catch (Exception unused) {
                ad.b("ResourceUtil", "MBSDKContext.getInstance() is null resName:" + str);
            }
            if (an.a(packageName) && context != null) {
                packageName = context.getPackageName();
            }
            if (an.a(packageName) || context == null) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, packageName);
        } catch (Exception unused2) {
            ad.b("ResourceUtil", "Resource not found resName:" + str);
            return -1;
        }
    }

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e) {
                ad.b("ResourceUtil", "Resource error:" + e.getMessage());
            }
        }
        return null;
    }
}
