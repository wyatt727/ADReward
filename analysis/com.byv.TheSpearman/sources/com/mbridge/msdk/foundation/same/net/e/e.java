package com.mbridge.msdk.foundation.same.net.e;

import com.json.m4;
import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;

/* compiled from: JsonRequest.java */
/* loaded from: classes4.dex */
public abstract class e<T> extends i<T> {
    private static final String c = "e";
    private final String d;

    public e(int i, String str, String str2, com.mbridge.msdk.foundation.same.net.e<T> eVar) {
        super(i, str, eVar);
        this.d = str2;
    }

    public e(int i, String str, String str2, com.mbridge.msdk.foundation.same.net.e<T> eVar, boolean z) {
        super(i, str, eVar, z);
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
}
