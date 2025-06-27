package com.applovin.impl;

import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class ch {

    /* renamed from: a, reason: collision with root package name */
    private final String f331a;
    private Map b;

    public String toString() {
        return "PendingReward{result='" + this.f331a + "'params='" + this.b + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public static ch a(String str) {
        return a(str, null);
    }

    private ch(String str, Map map) {
        this.f331a = str;
        this.b = map;
    }

    public String b() {
        return this.f331a;
    }

    public Map a() {
        return this.b;
    }

    public static ch a(String str, Map map) {
        return new ch(str, map);
    }
}
