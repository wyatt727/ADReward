package com.mbridge.msdk.foundation.same.net.c;

import com.mbridge.msdk.foundation.same.net.f;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: CommonStringResponseHandler.java */
/* loaded from: classes4.dex */
public abstract class a extends f<String> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2869a = "a";

    public abstract void a(String str);

    public abstract void b(String str);

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<String> kVar) {
        if (kVar != null) {
            b(kVar.c);
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.b(f2869a, "errorCode = " + aVar.f2868a);
        a(com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
    }
}
