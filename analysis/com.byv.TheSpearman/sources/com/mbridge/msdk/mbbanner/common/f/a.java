package com.mbridge.msdk.mbbanner.common.f;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.d.b;
import com.mbridge.msdk.foundation.same.net.f;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.List;
import org.json.JSONObject;

/* compiled from: BannerResponseHandler.java */
/* loaded from: classes4.dex */
public abstract class a extends f<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3076a = "a";
    private String b = "";

    public abstract void a(int i, String str);

    public abstract void a(CampaignUnit campaignUnit);

    public final void a(String str) {
        this.b = str;
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<JSONObject> kVar) {
        super.onSuccess(kVar);
        List<b> list = kVar.b.b;
        final JSONObject jSONObject = kVar.c;
        ad.c(f3076a, "parseLoad content = " + jSONObject);
        final int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            final String strOptString = jSONObject.optString("version");
            com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.f.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    final CampaignUnit v5CampaignUnit = "v5".equals(strOptString) ? CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), a.this.b) : CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), a.this.b);
                    com.mbridge.msdk.foundation.same.f.b.e().post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.f.a.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            CampaignUnit campaignUnit = v5CampaignUnit;
                            if (campaignUnit != null && campaignUnit.getAds() != null && v5CampaignUnit.getAds().size() > 0) {
                                a.this.a(v5CampaignUnit);
                                if (!TextUtils.isEmpty(a.this.b)) {
                                    a.this.saveHbState(1);
                                }
                                a.this.saveRequestTime(v5CampaignUnit.getAds().size());
                                return;
                            }
                            CampaignUnit campaignUnit2 = v5CampaignUnit;
                            String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                            if (TextUtils.isEmpty(msg)) {
                                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                            }
                            a.this.a(iOptInt, msg);
                        }
                    });
                }
            });
            return;
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.c(f3076a, "onFailed errorCode = " + aVar.f2868a);
        a(aVar.f2868a, com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
    }
}
