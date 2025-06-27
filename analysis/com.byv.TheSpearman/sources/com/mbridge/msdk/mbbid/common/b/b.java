package com.mbridge.msdk.mbbid.common.b;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.same.net.f;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.List;
import org.json.JSONObject;

/* compiled from: BidResponseHandler.java */
/* loaded from: classes4.dex */
public abstract class b extends f<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3089a = "b";

    public abstract void a(int i, String str);

    public abstract void a(BidResponsedEx bidResponsedEx);

    public b(String str, String str2) {
        this.unitId = str2;
        this.placementId = str;
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<JSONObject> kVar) {
        super.onSuccess(kVar);
        if (kVar == null || kVar.b == null) {
            return;
        }
        List<com.mbridge.msdk.foundation.same.net.d.b> list = kVar.b.b;
        JSONObject jSONObject = kVar.c;
        int iOptInt = jSONObject.optInt("status");
        if (200 == iOptInt) {
            BidResponsedEx bidResponsedEx = BidResponsedEx.parseBidResponsedEx(jSONObject.optJSONObject("data"), this.unitId);
            if (bidResponsedEx != null) {
                a(bidResponsedEx);
                return;
            } else {
                a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                return;
            }
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.b(f3089a, "errorCode = " + aVar.f2868a);
        a(aVar.f2868a, com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
    }
}
