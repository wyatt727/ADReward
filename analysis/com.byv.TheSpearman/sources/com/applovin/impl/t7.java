package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class t7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f1016a = UUID.randomUUID().toString();
    private final String b;
    private final Map c;
    private final long d;

    public String toString() {
        return "Event{name='" + this.b + "', id='" + this.f1016a + "', creationTimestampMillis=" + this.d + ", parameters=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public t7(String str, Map map, Map map2) {
        this.b = str;
        HashMap map3 = new HashMap();
        this.c = map3;
        map3.putAll(map);
        map3.put("applovin_sdk_super_properties", map2);
        this.d = System.currentTimeMillis();
    }

    public String c() {
        return this.b;
    }

    public Map d() {
        return this.c;
    }

    public long a() {
        return this.d;
    }

    public String b() {
        return this.f1016a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t7 t7Var = (t7) obj;
        if (this.d != t7Var.d) {
            return false;
        }
        String str = this.b;
        if (str == null ? t7Var.b != null : !str.equals(t7Var.b)) {
            return false;
        }
        Map map = this.c;
        if (map == null ? t7Var.c != null : !map.equals(t7Var.c)) {
            return false;
        }
        String str2 = this.f1016a;
        String str3 = t7Var.f1016a;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return true;
            }
        } else if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f1016a;
        return i + (str2 != null ? str2.hashCode() : 0);
    }
}
