package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import com.json.unity.androidbridge.AndroidBridgeConstants;
import org.json.JSONObject;

/* compiled from: LoadVideoErrorModel.java */
/* loaded from: classes2.dex */
public class tp implements Td {
    private String EYQ;
    private String IPb;
    private String Kbd;
    private int Pm;
    private long Td;
    private long mZx;

    public void EYQ(String str) {
        this.EYQ = str;
    }

    public void EYQ(long j) {
        this.mZx = j;
    }

    public void mZx(long j) {
        this.Td = j;
    }

    public void EYQ(int i) {
        this.Pm = i;
    }

    public void mZx(String str) {
        this.Kbd = str;
    }

    public void Td(String str) {
        this.IPb = str;
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Td
    public void EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.EYQ);
            jSONObject.put("preload_size", this.mZx);
            jSONObject.put("load_time", this.Td);
            jSONObject.put(AndroidBridgeConstants.ERROR_CODE, this.Pm);
            jSONObject.put("error_message", this.Kbd);
            jSONObject.put("error_message_server", this.IPb);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("LoadVideoErrorModel", th.getMessage());
        }
    }
}
