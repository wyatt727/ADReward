package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ec implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f383a;
    private final String b;
    private final boolean c;
    private final fe d;

    ec(String str, String str2, boolean z, fe feVar) {
        this.f383a = str;
        this.b = str2;
        this.c = z;
        this.d = feVar;
    }

    public String c() {
        return this.f383a;
    }

    public List b() {
        List listL = this.d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f383a) : listL;
    }

    public fe d() {
        return this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ec ecVar) {
        return this.b.compareToIgnoreCase(ecVar.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ec ecVar = (ec) obj;
        String str = this.f383a;
        if (str == null ? ecVar.f383a != null : !str.equals(ecVar.f383a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? ecVar.b == null : str2.equals(ecVar.b)) {
            return this.c == ecVar.c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f383a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.c ? 1 : 0);
    }

    public String a() {
        return this.b;
    }
}
