package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.e.v;
import java.io.UnsupportedEncodingException;

/* compiled from: StringReportResponseHandler.java */
/* loaded from: classes4.dex */
public final class o extends v {
    @Override // com.mbridge.msdk.e.v
    protected final r<String> a(com.mbridge.msdk.e.a.m mVar) {
        String str;
        try {
            str = new String(mVar.b, com.mbridge.msdk.e.a.a.e.a(mVar.c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(mVar.b);
        }
        return r.a(str, com.mbridge.msdk.e.a.a.e.a(mVar));
    }
}
