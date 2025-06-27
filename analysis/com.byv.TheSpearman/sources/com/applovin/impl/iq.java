package com.applovin.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class iq {

    /* renamed from: a, reason: collision with root package name */
    private final String f543a;
    private final String b;

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f543a + "', javascriptResourceUrl='" + this.b + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    private iq(String str, String str2) {
        this.f543a = str;
        this.b = str2;
    }

    public static iq a(fs fsVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            try {
                return new iq((String) fsVar.a().get("apiFramework"), fsVar.d());
            } catch (Throwable th) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("VastJavaScriptResource", "Error occurred while initializing", th);
                }
                kVar.B().a("VastJavaScriptResource", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iq iqVar = (iq) obj;
        String str = this.f543a;
        if (str == null ? iqVar.f543a != null : !str.equals(iqVar.f543a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = iqVar.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f543a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String a() {
        return this.f543a;
    }
}
