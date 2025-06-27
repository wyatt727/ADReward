package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.my.tracker.obfuscated.q0;

/* loaded from: classes4.dex */
public final class c0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, a1 a1Var, p pVar, w0 w0Var) {
        String string;
        String str;
        char c;
        String str2;
        Context context2;
        a1 a1Var2;
        long jB;
        PackageInfo packageInfoA = k.a(context);
        if (packageInfoA != null) {
            string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfoA.getLongVersionCode()) : Integer.toString(packageInfoA.versionCode);
            str = packageInfoA.versionName;
        } else {
            string = "";
            str = string;
        }
        r0 r0VarA = r0.a(context);
        String strA = r0VarA.a();
        String strG = a1Var.g();
        if (!strG.equals(r0VarA.c())) {
            z0.a("InstallHandler: tracking install");
            if (packageInfoA != null) {
                jB = y0.b(packageInfoA.firstInstallTime);
                context2 = context;
                a1Var2 = a1Var;
            } else {
                context2 = context;
                a1Var2 = a1Var;
                jB = 0;
            }
            q0 q0VarA = q0.a(pVar, a1Var2, context2);
            q0.a aVarA = q0VarA.a();
            pVar.a(jB, k.b(context), aVarA);
            if (aVarA == null) {
                q0VarA.c();
            }
            r0VarA.e(strG);
            c = 1;
        } else if (string.equals(strA)) {
            c = 0;
        } else {
            if (strA.isEmpty()) {
                str2 = "InstallHandler: tracking update";
            } else {
                str2 = "InstallHandler: tracking update from" + strA + " to " + string;
            }
            z0.a(str2);
            pVar.a(r0VarA.e(), strA, str, string, k.b(context));
            c = 2;
        }
        long jI = r0VarA.i();
        long jA = y0.a();
        String strB = a1Var.b();
        if (!TextUtils.isEmpty(strB)) {
            if (jA - jI < 604800 || jI == 0) {
                z0.a("InstallHandler: tracking apkPreinstallParams");
                pVar.b(strB);
            } else {
                z0.a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (c == 0) {
            z0.a("InstallHandler: no install/update");
            w0Var.a(jI);
            return;
        }
        if (c == 1) {
            r0VarA.b(jA);
            w0Var.a(jA);
        } else if (c == 2) {
            w0Var.a(jI);
        }
        r0VarA.d(string);
        r0VarA.g(str);
        r0VarA.c(jA);
    }

    public static void a(final a1 a1Var, final p pVar, final w0 w0Var, final Context context) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.c0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                c0.a(context, a1Var, pVar, w0Var);
            }
        });
    }
}
