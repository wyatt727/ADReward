package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f1107a;
    private final String b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* renamed from: a, reason: collision with root package name */
        private final String f1108a;

        a(String str) {
            this.f1108a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f1108a;
        }
    }

    public w(String str, com.applovin.impl.sdk.k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (kVar != null) {
            this.b = str;
            this.f1107a = kVar;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public String b() {
        return this.b;
    }

    public a c() {
        if (a(oj.O0) != null) {
            return a.REGULAR;
        }
        if (a(oj.P0) != null) {
            return a.AD_RESPONSE_JSON;
        }
        return a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(oj.O0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(oj.P0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.b.substring(d().length()), 0), C.UTF8_NAME));
                this.f1107a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f1107a.L().a("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e) {
                this.f1107a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f1107a.L().a("AdToken", "Unable to decode token '" + this.b + "' into JSON", e);
                }
                this.f1107a.B().a("AdToken", "decodeFullAdResponseStr", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            this.f1107a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f1107a.L().a("AdToken", "Unable to process ad response from token '" + this.b + "'", e2);
            }
            this.f1107a.B().a("AdToken", "decodeFullAdResponse", e2);
            return null;
        }
    }

    public String toString() {
        return "AdToken{id=" + StringUtils.prefixToIndex(32, this.b) + ", type=" + c() + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        String str = this.b;
        String str2 = ((w) obj).b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    private String a(oj ojVar) {
        for (String str : this.f1107a.c(ojVar)) {
            if (this.b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
