package com.my.target;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3965a;
    public final String b;
    public final String c;
    public String f;
    public q g;
    public final v9 d = v9.e();
    public final HashMap<String, String> e = new HashMap<>();
    public int h = 10000;
    public float i = 0.0f;

    public f5(String str, String str2, String str3) {
        this.f3965a = str;
        this.b = str2;
        this.c = str3;
    }

    public static f5 a(String str, String str2, String str3) {
        return new f5(str, str2, str3);
    }

    public String a() {
        return this.c;
    }

    public void a(float f) {
        this.i = f;
    }

    public void a(int i) {
        this.h = i;
    }

    public void a(q qVar) {
        this.g = qVar;
    }

    public void a(String str) {
        this.f = str;
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            this.e.remove(str);
        } else {
            this.e.put(str, str2);
        }
    }

    public String b() {
        return this.f3965a;
    }

    public Map<String, String> c() {
        return new HashMap(this.e);
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.b;
    }

    public float f() {
        return this.i;
    }

    public q g() {
        return this.g;
    }

    public v9 h() {
        return this.d;
    }

    public int i() {
        return this.h;
    }
}
