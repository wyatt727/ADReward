package com.mbridge.msdk.video.signal.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSCommonDiff.java */
/* loaded from: classes4.dex */
public class l extends d {
    public boolean o = true;

    public final void a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(t2.h.G, new com.mbridge.msdk.foundation.tools.h(com.mbridge.msdk.foundation.controller.c.m().c()).a());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void a(CampaignEx campaignEx, Context context) {
        String queryParameter;
        try {
            queryParameter = Uri.parse(campaignEx.getNoticeUrl()).getQueryParameter(com.mbridge.msdk.foundation.same.a.m);
        } catch (Throwable unused) {
        }
        this.m.a((!TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0) == 2);
        q().a(this.m);
        q().a(campaignEx);
        com.mbridge.msdk.video.module.b.b.d(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx);
    }

    private com.mbridge.msdk.click.a q() {
        if (this.l == null) {
            this.l = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.j);
        }
        return this.l;
    }
}
