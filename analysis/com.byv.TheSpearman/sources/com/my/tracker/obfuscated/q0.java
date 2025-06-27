package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.json.t2;
import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    final p f4249a;
    final a1 b;
    final Context c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f4250a;
        public final String b;
        public final String c;

        a(int i, String str, String str2) {
            this.f4250a = i;
            this.b = str;
            this.c = str2;
        }
    }

    q0(p pVar, a1 a1Var, Context context) {
        this.f4249a = pVar;
        this.b = a1Var;
        this.c = context.getApplicationContext();
    }

    static a a(int i, String str, String str2) {
        try {
            z0.a("PreInstallHandler: converting raw data to json");
            return new a(i, new JSONObject(str).toString(), str2);
        } catch (Throwable th) {
            z0.a("PreInstallHandler error: exception when converting raw data to json", th);
            try {
                z0.a("PreInstallHandler: converting raw data to json with pid");
                return new a(i, new JSONObject().put("pid", str).toString(), str2);
            } catch (Throwable th2) {
                z0.b("PreInstallHandler error: exception when converting raw data to json with pid", th2);
                z0.a("PreInstallHandler: nothing has been found for source: " + i);
                return null;
            }
        }
    }

    public static q0 a(p pVar, a1 a1Var, Context context) {
        return new q0(pVar, a1Var, context);
    }

    static String a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", TypedValues.Custom.S_STRING, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public a a() {
        if (!this.b.r()) {
            z0.a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        a aVarB = b();
        if (aVarB != null) {
            return aVarB;
        }
        a aVarA = a(1);
        if (aVarA != null) {
            return aVarA;
        }
        if (this.b.s()) {
            return a(2);
        }
        return null;
    }

    a a(int i) {
        String string;
        String str;
        StringBuilder sb;
        String str2;
        if (i == 1) {
            str = "ro.mytracker.preinstall.path";
        } else {
            if (i != 2) {
                string = "PreInstallHandler: wrong property property key";
                z0.a(string);
                return null;
            }
            str = "ro.appsflyer.preinstall.path";
        }
        String strA = x0.a(str);
        if (TextUtils.isEmpty(strA)) {
            sb = new StringBuilder();
            str2 = "PreInstallHandler: empty path for source: ";
        } else {
            String strA2 = a(strA);
            if (!TextUtils.isEmpty(strA2)) {
                z0.a("PreInstallHandler: raw data for source has been found: " + strA2);
                return a(i, strA2, strA);
            }
            sb = new StringBuilder();
            str2 = "PreInstallHandler: empty data for source: ";
        }
        sb.append(str2);
        sb.append(i);
        string = sb.toString();
        z0.a(string);
        return null;
    }

    String a(String str) {
        BufferedReader bufferedReader;
        String str2;
        int length;
        try {
            z0.a("PreInstallHandler: searching string in file " + str);
            str2 = this.c.getPackageName() + t2.i.b;
            length = str2.length();
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    z0.a("PreInstallHandler: processing string " + line);
                    if (line.startsWith(str2) && line.length() > length) {
                        String strSubstring = line.substring(length);
                        if (!TextUtils.isEmpty(strSubstring)) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused) {
                            }
                            return strSubstring;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    z0.b("PreInstallHandler error: exception while retrieving data in file" + str, th);
                    if (bufferedReader != null) {
                        bufferedReader.close();
                        break;
                    }
                    return null;
                } catch (Throwable th3) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
            }
            try {
                bufferedReader.close();
                break;
            } catch (Throwable unused3) {
            }
        }
    }

    a b() {
        String str = String.format("ro.mtpi.%s", this.b.g());
        String strA = x0.a(str);
        if (TextUtils.isEmpty(strA)) {
            z0.a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        z0.a("PreInstallHandler: raw data in SystemProperties has been found: " + strA);
        return a(3, strA, str);
    }

    @Deprecated
    public void c() {
        String strM = this.b.m();
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        r0 r0VarA = r0.a(this.c);
        if (r0VarA.p()) {
            return;
        }
        z0.a("PreInstallHandler: checking preinstall");
        try {
            String strA = a(this.c.getPackageManager().getResourcesForApplication(strM), this.c.getPackageName(), strM);
            r0VarA.t();
            if (TextUtils.isEmpty(strA)) {
                z0.a("PreInstallHandler: referrer is empty");
                return;
            }
            z0.a("PreInstallHandler: referrer " + strA);
            this.f4249a.a(strA, k.b(this.c), (Runnable) null);
            r0.a(this.c).u();
        } catch (Throwable unused) {
            z0.a("PreInstallHandler: unable to locate vendor app " + strM);
        }
    }
}
