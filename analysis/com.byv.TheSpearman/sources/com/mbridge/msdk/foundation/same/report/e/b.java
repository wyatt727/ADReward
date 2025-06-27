package com.mbridge.msdk.foundation.same.report.e;

import com.mbridge.msdk.foundation.same.net.f;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: ReportResponseHandler.java */
/* loaded from: classes4.dex */
public abstract class b extends f<String> {
    private static final String TAG = "b";

    public abstract void onFailed(String str);

    public abstract void onSuccess(String str);

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.b(TAG, "errorCode = " + aVar.f2868a);
        onFailed(com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<String> kVar) {
        if (kVar != null) {
            onSuccess(kVar.c);
        }
    }
}
