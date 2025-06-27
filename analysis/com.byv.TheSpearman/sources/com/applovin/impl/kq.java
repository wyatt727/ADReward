package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class kq {

    /* renamed from: a, reason: collision with root package name */
    private String f607a;
    private String b;

    private kq() {
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f607a + "', version='" + this.b + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public static kq a(fs fsVar, kq kqVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            if (kqVar == null) {
                try {
                    kqVar = new kq();
                } catch (Throwable th) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastSystemInfo", "Error occurred while initializing", th);
                    }
                    kVar.B().a("VastSystemInfo", th);
                    return null;
                }
            }
            if (!StringUtils.isValidString(kqVar.f607a)) {
                String strD = fsVar.d();
                if (StringUtils.isValidString(strD)) {
                    kqVar.f607a = strD;
                }
            }
            if (!StringUtils.isValidString(kqVar.b)) {
                String str = (String) fsVar.a().get("version");
                if (StringUtils.isValidString(str)) {
                    kqVar.b = str;
                }
            }
            return kqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj;
        String str = this.f607a;
        if (str == null ? kqVar.f607a != null : !str.equals(kqVar.f607a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = kqVar.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f607a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
