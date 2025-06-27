package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class xp {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f1182a;
    private String b;
    private final String c = a(qj.i, (String) sj.a(qj.h, (Object) null, com.applovin.impl.sdk.k.k()));
    private final String d;

    public xp(com.applovin.impl.sdk.k kVar) {
        this.f1182a = kVar;
        this.d = a(qj.j, (String) kVar.a(oj.g));
        a(d());
    }

    private String d() {
        if (!((Boolean) this.f1182a.a(oj.T3)).booleanValue()) {
            this.f1182a.c(qj.g);
        }
        String str = (String) this.f1182a.a(qj.g);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f1182a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f1182a.L().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String c() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String a() {
        return this.d;
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        qj qjVar = qj.k;
        String str = (String) kVar.a(qjVar);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(qjVar, strValueOf);
        return strValueOf;
    }

    private String a(qj qjVar, String str) {
        String str2 = (String) sj.a(qjVar, (Object) null, com.applovin.impl.sdk.k.k());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        sj.b(qjVar, str, com.applovin.impl.sdk.k.k());
        return str;
    }

    public void a(String str) {
        if (((Boolean) this.f1182a.a(oj.T3)).booleanValue()) {
            this.f1182a.b(qj.g, str);
        }
        this.b = str;
        this.f1182a.o().b(str, a());
    }
}
