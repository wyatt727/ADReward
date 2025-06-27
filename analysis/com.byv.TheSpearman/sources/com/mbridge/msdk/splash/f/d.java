package com.mbridge.msdk.splash.f;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Frame;
import java.util.List;
import org.json.JSONObject;

/* compiled from: SplashResponseHandler.java */
/* loaded from: classes4.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.f<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3512a = "d";
    private int b;
    private String c;

    public abstract void a(List<Frame> list);

    public abstract void a(List<com.mbridge.msdk.foundation.same.net.d.b> list, CampaignUnit campaignUnit);

    public abstract void b(int i, String str);

    public final void a(String str) {
        this.c = str;
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<JSONObject> kVar) {
        CampaignUnit campaignUnit;
        super.onSuccess(kVar);
        if (kVar == null || kVar.b == null) {
            return;
        }
        int i = this.b;
        if (i == 0) {
            final List<com.mbridge.msdk.foundation.same.net.d.b> list = kVar.b.b;
            final JSONObject jSONObject = kVar.c;
            final int iOptInt = jSONObject.optInt("status");
            if (1 == iOptInt) {
                calcRequestTime(System.currentTimeMillis());
                final String strOptString = jSONObject.optString("version");
                com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.splash.f.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final CampaignUnit v5CampaignUnit = "v5".equals(strOptString) ? CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), d.this.c) : CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), d.this.c);
                        com.mbridge.msdk.foundation.same.f.b.e().post(new Runnable() { // from class: com.mbridge.msdk.splash.f.d.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                CampaignUnit campaignUnit2 = v5CampaignUnit;
                                if (campaignUnit2 != null && campaignUnit2.getAds() != null && v5CampaignUnit.getAds().size() > 0) {
                                    d.this.a(list, v5CampaignUnit);
                                    d.this.saveRequestTime(v5CampaignUnit.getAds().size());
                                    return;
                                }
                                CampaignUnit campaignUnit3 = v5CampaignUnit;
                                String msg = campaignUnit3 != null ? campaignUnit3.getMsg() : null;
                                if (TextUtils.isEmpty(msg)) {
                                    msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                                }
                                d.this.b(iOptInt, msg);
                            }
                        });
                    }
                });
                return;
            }
            b(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        if (i == 1) {
            List<com.mbridge.msdk.foundation.same.net.d.b> list2 = kVar.b.b;
            JSONObject jSONObject2 = kVar.c;
            int iOptInt2 = jSONObject2.optInt("status");
            if (1 == iOptInt2) {
                calcRequestTime(System.currentTimeMillis());
                if ("v5".equals(jSONObject2.optString("version"))) {
                    campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject2.optJSONObject("data"), this.c);
                } else {
                    campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject2.optJSONObject("data"), this.c);
                }
                if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                    List<Frame> listFrames = campaignUnit.getListFrames();
                    a(listFrames);
                    saveRequestTime(listFrames.size());
                    return;
                } else {
                    String msg = campaignUnit != null ? campaignUnit.getMsg() : null;
                    if (TextUtils.isEmpty(msg)) {
                        msg = jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE);
                    }
                    b(iOptInt2, msg);
                    return;
                }
            }
            b(iOptInt2, jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE));
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.b(f3512a, "errorCode = " + aVar.f2868a);
        b(aVar.f2868a, com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
    }
}
