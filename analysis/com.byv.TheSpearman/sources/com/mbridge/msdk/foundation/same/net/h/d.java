package com.mbridge.msdk.foundation.same.net.h;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import org.json.JSONObject;

/* compiled from: CommonMBListener.java */
/* loaded from: classes4.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.f<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2894a = "d";

    public abstract void a(String str);

    public abstract void a(JSONObject jSONObject);

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.b(f2894a, "errorCode = " + aVar.f2868a);
        a(com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<JSONObject> kVar) {
        if (kVar == null) {
            a("response is null");
            return;
        }
        super.onSuccess(kVar);
        if (kVar.b == null) {
            a(kVar);
        } else if (kVar.b.d == 204) {
            a(new JSONObject());
        } else {
            a(kVar);
        }
    }

    private void a(k<JSONObject> kVar) {
        if (kVar.c == null) {
            a("response result is null");
            return;
        }
        int iOptInt = kVar.c.optInt("status", -9999);
        if (iOptInt == -9999) {
            a(kVar.c);
            return;
        }
        if (iOptInt == 1 || iOptInt == 200) {
            a(kVar.c.optJSONObject("data"));
            return;
        }
        String strOptString = kVar.c.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = "error message is null";
        }
        a(strOptString);
    }
}
