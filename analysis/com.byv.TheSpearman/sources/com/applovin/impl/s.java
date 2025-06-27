package com.applovin.impl;

import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f870a;
    private final String b;
    private final Map c;
    private final boolean d;

    public String toString() {
        return "AdEventPostback{url='" + this.f870a + "', backupUrl='" + this.b + "', headers='" + this.c + "', shouldFireInWebView='" + this.d + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public s(String str, String str2) {
        this(str, str2, null, false);
    }

    public String c() {
        return this.f870a;
    }

    public String a() {
        return this.b;
    }

    public s(String str, String str2, Map map, boolean z) {
        this.f870a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
    }

    public Map b() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
