package com.applovin.impl;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class re {
    private static final Set b = new HashSet();
    public static final re c = a("ar");
    public static final re d = a("ttdasi_ms");

    /* renamed from: a, reason: collision with root package name */
    private String f859a;

    public interface a {
        Object a(Object obj);
    }

    private re(String str) {
        this.f859a = str;
    }

    protected boolean a(Object obj) {
        return obj instanceof re;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        if (!reVar.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = reVar.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int hashCode() {
        String strA = a();
        return (strA == null ? 43 : strA.hashCode()) + 59;
    }

    public String a() {
        return this.f859a;
    }

    private static re a(String str) {
        Set set = b;
        if (!set.contains(str)) {
            set.add(str);
            return new re(str);
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }

    public String toString() {
        return this.f859a;
    }
}
