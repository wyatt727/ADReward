package com.my.tracker.obfuscated;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final p f4238a;

    private l(p pVar) {
        this.f4238a = pVar;
    }

    public static l a(p pVar) {
        return new l(pVar);
    }

    public String a(Intent intent) {
        z0.a("DeeplinkHandler: handling deeplink");
        if (intent == null) {
            z0.a("DeeplinkHandler: intent is null");
            return null;
        }
        try {
            Uri data = intent.getData();
            if (data == null) {
                z0.a("DeeplinkHandler: intent data is null");
                return null;
            }
            z0.a("DeeplinkHandler: intent data: " + data);
            String queryParameter = data.getQueryParameter("mt_deeplink");
            String queryParameter2 = data.getQueryParameter("mt_click_id");
            if (queryParameter != null) {
                z0.a("DeeplinkHandler: found mt_deeplink in intent");
            } else {
                z0.a("DeeplinkHandler: mt_deeplink not found in intent");
                queryParameter = data.toString();
            }
            z0.a("DeeplinkHandler: deeplink " + queryParameter);
            z0.a("DeeplinkHandler: clickId " + queryParameter2);
            this.f4238a.a(queryParameter, queryParameter2);
            return queryParameter;
        } catch (Throwable th) {
            z0.b("DeeplinkHandler error: ", th);
            return null;
        }
    }
}
