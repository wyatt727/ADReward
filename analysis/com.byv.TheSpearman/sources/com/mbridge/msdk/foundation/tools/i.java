package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DomainDeviceInfo.java */
/* loaded from: classes4.dex */
public class i extends c {
    public int w;
    public int x;

    public i(Context context) {
        super(context);
        this.x = z.o();
        this.w = z.f();
    }

    @Override // com.mbridge.msdk.foundation.tools.c
    public JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt", this.x + "");
                jSONObject.put("dmf", this.w);
            }
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("DomainDeviceInfo", e.getMessage());
            }
        }
        return jSONObjectA;
    }
}
