package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f1077a;
    private final List b;

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public v0(Map map, List list) {
        this.f1077a = map;
        this.b = list;
    }

    protected boolean a(Object obj) {
        return obj instanceof v0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (!v0Var.a(this)) {
            return false;
        }
        Map mapA = a();
        Map mapA2 = v0Var.a();
        if (mapA != null ? !mapA.equals(mapA2) : mapA2 != null) {
            return false;
        }
        List listB = b();
        List listB2 = v0Var.b();
        return listB != null ? listB.equals(listB2) : listB2 == null;
    }

    public int hashCode() {
        Map mapA = a();
        int iHashCode = mapA == null ? 43 : mapA.hashCode();
        List listB = b();
        return ((iHashCode + 59) * 59) + (listB != null ? listB.hashCode() : 43);
    }

    public List b() {
        return this.b;
    }

    public Map a() {
        return this.f1077a;
    }
}
