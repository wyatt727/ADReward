package com.my.target;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public class s7 {
    public static volatile s7 b;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4125a;

    public s7(SharedPreferences sharedPreferences) {
        this.f4125a = sharedPreferences;
    }

    public static s7 a(Context context) {
        s7 s7Var = b;
        if (s7Var == null) {
            synchronized (s7.class) {
                s7Var = b;
                if (s7Var == null) {
                    s7Var = new s7(context.getSharedPreferences("mytarget_prefs", 0));
                    b = s7Var;
                }
            }
        }
        return s7Var;
    }

    public final int a(String str) {
        try {
            return this.f4125a.getInt(str, -1);
        } catch (Throwable th) {
            ba.c("PrefsCache exception - " + th);
            return 0;
        }
    }

    public String a() {
        return b("asid");
    }

    public void a(int i) {
        a("asis", i);
    }

    public final void a(String str, int i) {
        try {
            SharedPreferences.Editor editorEdit = this.f4125a.edit();
            editorEdit.putInt(str, i);
            editorEdit.commit();
        } catch (Throwable th) {
            ba.c("PrefsCache exception - " + th);
        }
    }

    public final void a(String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = this.f4125a.edit();
            editorEdit.putString(str, str2);
            editorEdit.commit();
        } catch (Throwable th) {
            ba.c("PrefsCache exception - " + th);
        }
    }

    public int b() {
        return a("asis");
    }

    public final String b(String str) {
        try {
            String string = this.f4125a.getString(str, null);
            return string != null ? string : "";
        } catch (Throwable th) {
            ba.c("PrefsCache exception - " + th);
            return "";
        }
    }

    public void b(int i) {
        a("sdk_flags", i);
    }

    public int c() {
        return a("sdk_flags");
    }

    public void c(String str) {
        a("asid", str);
    }

    public String d() {
        return b("hlimit");
    }

    public void d(String str) {
        a("hoaid", str);
    }

    public String e() {
        return b("hoaid");
    }

    public void e(String str) {
        a("hlimit", str);
    }

    public String f() {
        return b("hosts");
    }

    public void f(String str) {
        a("hosts", str);
    }

    public String g() {
        return b("instanceId");
    }

    public void g(String str) {
        a("instanceId", str);
    }
}
