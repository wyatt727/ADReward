package com.mbridge.msdk.reward.d;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.f;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Frame;
import java.util.List;
import org.json.JSONObject;

/* compiled from: RewardResponseHandler.java */
/* loaded from: classes4.dex */
public abstract class c extends f<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3454a = "c";
    private int b;
    private String c;
    private com.mbridge.msdk.foundation.same.report.d.b d;

    public abstract void a(List<Frame> list);

    public abstract void a(List<com.mbridge.msdk.foundation.same.net.d.b> list, CampaignUnit campaignUnit);

    public abstract void b(int i, String str, com.mbridge.msdk.foundation.same.report.d.b bVar);

    public final void a(String str) {
        this.c = str;
    }

    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        this.d = bVar;
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
                com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.d.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final CampaignUnit v5CampaignUnit = "v5".equals(strOptString) ? CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), c.this.c) : CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), c.this.c);
                        com.mbridge.msdk.foundation.same.f.b.e().post(new Runnable() { // from class: com.mbridge.msdk.reward.d.c.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                CampaignUnit campaignUnit2 = v5CampaignUnit;
                                if (campaignUnit2 != null && campaignUnit2.getAds() != null && v5CampaignUnit.getAds().size() > 0) {
                                    v5CampaignUnit.setMetricsData(c.this.d);
                                    c.this.a(list, v5CampaignUnit);
                                    c.this.saveRequestTime(v5CampaignUnit.getAds().size());
                                } else {
                                    CampaignUnit campaignUnit3 = v5CampaignUnit;
                                    String msg = campaignUnit3 != null ? campaignUnit3.getMsg() : null;
                                    if (TextUtils.isEmpty(msg)) {
                                        msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                                    }
                                    c.this.b(iOptInt, msg, c.this.d);
                                }
                            }
                        });
                    }
                });
                return;
            }
            a(list, jSONObject, iOptInt, this.d);
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
                    b(iOptInt2, msg, this.d);
                    return;
                }
            }
            a(list2, jSONObject2, iOptInt2, this.d);
        }
    }

    private void a(List<com.mbridge.msdk.foundation.same.net.d.b> list, JSONObject jSONObject, int i, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.foundation.c.b bVarB;
        String strB = "";
        if (list != null && list.size() > 0) {
            for (com.mbridge.msdk.foundation.same.net.d.b bVar2 : list) {
                if (bVar2 != null) {
                    String strA = bVar2.a();
                    if (!TextUtils.isEmpty(strA) && strA.equals("data_res_type")) {
                        strB = bVar2.b();
                    }
                }
            }
        }
        String strB2 = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (!TextUtils.isEmpty(strB) && strB.equals("1")) {
            com.mbridge.msdk.foundation.c.b bVarB2 = com.mbridge.msdk.foundation.c.a.b(880018, strB2);
            if (bVar != null) {
                bVar.a(bVarB2);
                bVar.b(true);
                if (TextUtils.isEmpty(strB2)) {
                    strB2 = bVarB2.b();
                }
            }
            b(i, strB2, bVar);
            return;
        }
        if (i == -1) {
            bVarB = com.mbridge.msdk.foundation.c.a.b(880017, strB2);
        } else {
            bVarB = com.mbridge.msdk.foundation.c.a.b(880003, strB2);
        }
        if (bVar != null) {
            bVar.a(bVarB);
            bVar.b(false);
            if (TextUtils.isEmpty(strB2)) {
                strB2 = bVarB.b();
            }
        }
        b(i, strB2, bVar);
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.b(f3454a, "errorCode = " + aVar.f2868a);
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(aVar.f2868a, com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.e(aVar.b);
        this.d.a(bVar);
        b(aVar.f2868a, com.mbridge.msdk.foundation.same.net.g.a.a(aVar), this.d);
    }
}
