package com.mbridge.msdk.foundation.same.net.e;

import com.json.m4;
import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;

/* compiled from: StringRequest.java */
/* loaded from: classes4.dex */
public class f extends i<String> {
    private static final String c = "f";
    private String d;

    public f(int i, String str, String str2, com.mbridge.msdk.foundation.same.net.e<String> eVar) {
        super(i, str, eVar);
        this.d = str2;
    }

    @Override // com.mbridge.msdk.foundation.same.net.i
    public final byte[] h() {
        try {
            String str = this.d;
            if (str == null) {
                return null;
            }
            return str.getBytes(m4.M);
        } catch (UnsupportedEncodingException unused) {
            ad.b(c, "Unsupported Encoding while trying to get the bytes of " + this.d + " using utf-8");
            return null;
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.i
    protected final k<String> a(com.mbridge.msdk.foundation.same.net.f.c cVar) {
        try {
            return k.a(new String(cVar.f2886a, com.mbridge.msdk.foundation.same.net.g.b.a(cVar.b)), cVar);
        } catch (UnsupportedEncodingException e) {
            ad.b(c, e.getMessage());
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(8, cVar));
        }
    }
}
