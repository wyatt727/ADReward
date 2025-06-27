package com.applovin.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class d4 {
    public static int c = -1;
    public static int d = -100;
    public static int e = -200;
    public static int f = -300;

    /* renamed from: a, reason: collision with root package name */
    private final int f351a;
    private final String b;

    public String toString() {
        return "AppLovinConsentFlowErrorImpl{code=" + this.f351a + ", message='" + this.b + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public d4(int i, String str) {
        this.f351a = i;
        this.b = str;
    }

    public int a() {
        return this.f351a;
    }
}
