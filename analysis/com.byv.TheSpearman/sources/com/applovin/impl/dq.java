package com.applovin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class dq {

    /* renamed from: a, reason: collision with root package name */
    private final List f372a;

    public String toString() {
        return "VastAdVerification{verifications='" + this.f372a + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    private dq(List list) {
        this.f372a = list;
    }

    public static dq a(fs fsVar, dq dqVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        List arrayList;
        try {
            if (dqVar != null) {
                arrayList = dqVar.a();
            } else {
                arrayList = new ArrayList();
            }
            Iterator it = fsVar.a("Verification").iterator();
            while (it.hasNext()) {
                cq cqVarA = cq.a((fs) it.next(), fqVar, kVar);
                if (cqVarA != null) {
                    arrayList.add(cqVarA);
                }
            }
            return new dq(arrayList);
        } catch (Throwable th) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            kVar.B().a("VastAdVerifications", th);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dq) {
            return this.f372a.equals(((dq) obj).f372a);
        }
        return false;
    }

    public int hashCode() {
        return this.f372a.hashCode();
    }

    public List a() {
        return this.f372a;
    }
}
