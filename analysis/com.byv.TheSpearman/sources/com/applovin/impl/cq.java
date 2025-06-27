package com.applovin.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class cq {

    /* renamed from: a, reason: collision with root package name */
    private final String f342a;
    private final List b;
    private final String c;
    private final Set d;

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f342a + "'javascriptResources='" + this.b + "'verificationParameters='" + this.c + "'errorEventTrackers='" + this.d + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    private cq(String str, List list, String str2, Set set) {
        this.f342a = str;
        this.b = list;
        this.c = str2;
        this.d = set;
    }

    public static cq a(fs fsVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        try {
            String str = (String) fsVar.a().get("vendor");
            fs fsVarB = fsVar.b("VerificationParameters");
            String strD = fsVarB != null ? fsVarB.d() : null;
            List listA = fsVar.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                iq iqVarA = iq.a((fs) it.next(), kVar);
                if (iqVarA != null) {
                    arrayList.add(iqVarA);
                }
            }
            HashMap map = new HashMap();
            nq.a(fsVar, map, fqVar, kVar);
            return new cq(str, arrayList, strD, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("VastAdVerification", "Error occurred while initializing", th);
            }
            kVar.B().a("VastAdVerification", th);
            return null;
        }
    }

    public String c() {
        return this.f342a;
    }

    public List b() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cq cqVar = (cq) obj;
        String str = this.f342a;
        if (str == null ? cqVar.f342a != null : !str.equals(cqVar.f342a)) {
            return false;
        }
        List list = this.b;
        if (list == null ? cqVar.b != null : !list.equals(cqVar.b)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? cqVar.c != null : !str2.equals(cqVar.c)) {
            return false;
        }
        Set set = this.d;
        Set set2 = cqVar.d;
        return set != null ? set.equals(set2) : set2 == null;
    }

    public int hashCode() {
        String str = this.f342a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public Set a() {
        return this.d;
    }
}
