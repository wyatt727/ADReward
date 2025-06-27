package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class eq {

    /* renamed from: a, reason: collision with root package name */
    private int f398a;
    private int b;
    private Uri c;
    private jq d;
    private final Set e = new HashSet();
    private final Map f = new HashMap();

    public String toString() {
        return "VastCompanionAd{width=" + this.f398a + ", height=" + this.b + ", destinationUri=" + this.c + ", nonVideoResource=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }

    private eq() {
    }

    public static eq a(fs fsVar, eq eqVar, fq fqVar, com.applovin.impl.sdk.k kVar) {
        fs fsVarC;
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            if (eqVar == null) {
                try {
                    eqVar = new eq();
                } catch (Throwable th) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastCompanionAd", "Error occurred while initializing", th);
                    }
                    kVar.B().a("VastCompanionAd", th);
                    return null;
                }
            }
            if (eqVar.f398a == 0 && eqVar.b == 0) {
                int i = StringUtils.parseInt((String) fsVar.a().get("width"));
                int i2 = StringUtils.parseInt((String) fsVar.a().get("height"));
                if (i > 0 && i2 > 0) {
                    eqVar.f398a = i;
                    eqVar.b = i2;
                }
            }
            eqVar.d = jq.a(fsVar, eqVar.d, kVar);
            if (eqVar.c == null && (fsVarC = fsVar.c("CompanionClickThrough")) != null) {
                String strD = fsVarC.d();
                if (StringUtils.isValidString(strD)) {
                    eqVar.c = Uri.parse(strD);
                }
            }
            nq.a(fsVar.a("CompanionClickTracking"), eqVar.e, fqVar, kVar);
            nq.a(fsVar, eqVar.f, fqVar, kVar);
            return eqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri b() {
        return this.c;
    }

    public jq d() {
        return this.d;
    }

    public Map c() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        if (this.f398a != eqVar.f398a || this.b != eqVar.b) {
            return false;
        }
        Uri uri = this.c;
        if (uri == null ? eqVar.c != null : !uri.equals(eqVar.c)) {
            return false;
        }
        jq jqVar = this.d;
        if (jqVar == null ? eqVar.d != null : !jqVar.equals(eqVar.d)) {
            return false;
        }
        Set set = this.e;
        if (set == null ? eqVar.e != null : !set.equals(eqVar.e)) {
            return false;
        }
        Map map = this.f;
        Map map2 = eqVar.f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.f398a * 31) + this.b) * 31;
        Uri uri = this.c;
        int iHashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        jq jqVar = this.d;
        int iHashCode2 = (iHashCode + (jqVar != null ? jqVar.hashCode() : 0)) * 31;
        Set set = this.e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public Set a() {
        return this.e;
    }
}
