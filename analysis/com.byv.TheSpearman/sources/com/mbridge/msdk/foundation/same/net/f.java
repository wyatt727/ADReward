package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.tools.ad;
import org.json.JSONObject;

/* compiled from: Listener.java */
/* loaded from: classes4.dex */
public class f<T> implements e<T> {
    private long startTime;
    public int adType = 0;
    public String placementId = "";
    public String unitId = "";
    private com.mbridge.msdk.foundation.same.report.a.b mRequestTime = null;

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onCancel() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onFinish() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onNetworking() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onProgressChange(long j, long j2) {
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onRetry() {
    }

    public void calcRequestTime(long j) {
        com.mbridge.msdk.foundation.same.report.a.b bVar = new com.mbridge.msdk.foundation.same.report.a.b(new com.mbridge.msdk.foundation.entity.h());
        this.mRequestTime = bVar;
        bVar.b(this.unitId);
        this.mRequestTime.b(1);
        this.mRequestTime.a((j - this.startTime) + "");
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onPreExecute() {
        this.startTime = System.currentTimeMillis();
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<T> kVar) {
        try {
            String str = com.mbridge.msdk.foundation.controller.c.m().k() + "_" + this.placementId + "_" + this.unitId + "_" + this.adType;
            com.mbridge.msdk.c.h.a();
            ad.b("Listener", kVar.c + " " + str);
            if (kVar.c instanceof JSONObject) {
                com.mbridge.msdk.foundation.same.net.g.c.a().a(str, ((JSONObject) kVar.c).optInt("status"), ((JSONObject) kVar.c).toString(), System.currentTimeMillis());
            }
            if (kVar.c instanceof String) {
                com.mbridge.msdk.foundation.same.net.g.c.a().a(str, new JSONObject((String) kVar.c).optInt("status"), (String) kVar.c, System.currentTimeMillis());
            }
        } catch (Exception e) {
            ad.b("Listener", e.getMessage());
        }
    }

    public void saveHbState(int i) {
        com.mbridge.msdk.foundation.same.report.a.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.c(i);
        }
    }

    public void saveRequestTime(int i) {
        com.mbridge.msdk.foundation.same.report.a.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.a(i);
            this.mRequestTime.a();
        }
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }
}
