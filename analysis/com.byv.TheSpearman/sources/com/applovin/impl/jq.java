package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class jq {

    /* renamed from: a, reason: collision with root package name */
    private a f576a;
    private Uri b;
    private String c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private jq() {
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f576a + ", resourceUri=" + this.b + ", resourceContents='" + this.c + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    static jq a(fs fsVar, jq jqVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            if (jqVar == null) {
                try {
                    jqVar = new jq();
                } catch (Throwable th) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastNonVideoResource", "Error occurred while initializing", th);
                    }
                    kVar.B().a("VastNonVideoResource", th);
                    return null;
                }
            }
            if (jqVar.b == null && !StringUtils.isValidString(jqVar.c)) {
                String strA = a(fsVar, "StaticResource");
                if (URLUtil.isValidUrl(strA)) {
                    jqVar.b = Uri.parse(strA);
                    jqVar.f576a = a.STATIC;
                    return jqVar;
                }
                String strA2 = a(fsVar, "IFrameResource");
                if (StringUtils.isValidString(strA2)) {
                    jqVar.f576a = a.IFRAME;
                    if (URLUtil.isValidUrl(strA2)) {
                        jqVar.b = Uri.parse(strA2);
                    } else {
                        jqVar.c = strA2;
                    }
                    return jqVar;
                }
                String strA3 = a(fsVar, "HTMLResource");
                if (StringUtils.isValidString(strA3)) {
                    jqVar.f576a = a.HTML;
                    if (URLUtil.isValidUrl(strA3)) {
                        jqVar.b = Uri.parse(strA3);
                    } else {
                        jqVar.c = strA3;
                    }
                }
            }
            return jqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public a c() {
        return this.f576a;
    }

    public Uri b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq)) {
            return false;
        }
        jq jqVar = (jq) obj;
        if (this.f576a != jqVar.f576a) {
            return false;
        }
        Uri uri = this.b;
        if (uri == null ? jqVar.b != null : !uri.equals(jqVar.b)) {
            return false;
        }
        String str = this.c;
        String str2 = jqVar.c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.f576a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    private static String a(fs fsVar, String str) {
        fs fsVarC = fsVar.c(str);
        if (fsVarC != null) {
            return fsVarC.d();
        }
        return null;
    }
}
