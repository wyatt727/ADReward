package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;

/* loaded from: classes4.dex */
public abstract class k {
    public static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            z0.b("InstallHandler: unable to read app version from package manager: " + th);
            return null;
        }
    }

    public static String b(Context context) {
        try {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            z0.a("ReferrerHandler: cannot retrieve \"installer\", exception", th);
            return null;
        }
    }
}
