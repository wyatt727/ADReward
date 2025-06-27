package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public class eh {

    /* renamed from: a, reason: collision with root package name */
    private final String f386a;
    private final String b;
    private final boolean c;

    eh(String str, String str2, Context context) {
        this.f386a = str.replace("android.permission.", "");
        this.b = str2;
        this.c = x3.a(str, context);
    }

    public String b() {
        return this.f386a;
    }

    public String a() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}
