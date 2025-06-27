package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class y3 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f1188a = new a("Age Restricted User", qj.m);
    private static final a b = new a("Has User Consent", qj.l);
    private static final a c = new a("\"Do Not Sell\"", qj.n);

    public static a b() {
        return b;
    }

    public static a c() {
        return f1188a;
    }

    public static boolean b(boolean z, Context context) {
        return a(qj.l, Boolean.valueOf(z), context);
    }

    public static boolean c(boolean z, Context context) {
        return a(qj.m, Boolean.valueOf(z), context);
    }

    private static boolean a(qj qjVar, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.t.h("AppLovinSdk", "Failed to update compliance value for key: " + qjVar);
            return false;
        }
        Boolean bool2 = (Boolean) sj.a(qjVar, (Object) null, context);
        sj.b(qjVar, bool, context);
        return bool2 == null || bool2 != bool;
    }

    public static a a() {
        return c;
    }

    public static boolean a(boolean z, Context context) {
        return a(qj.n, Boolean.valueOf(z), context);
    }

    public static String a(Context context) {
        return a(f1188a, context) + a(b, context) + a(c, context);
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f1189a + " - " + aVar.a(context);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f1189a;
        private final qj b;

        a(String str, qj qjVar) {
            this.f1189a = str;
            this.b = qjVar;
        }

        public Boolean b(Context context) {
            if (context == null) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "Failed to get value for key: " + this.b);
                return null;
            }
            return (Boolean) sj.a(this.b, (Object) null, context);
        }

        public String a() {
            return this.f1189a;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }
}
