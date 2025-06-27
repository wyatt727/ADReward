package com.bytedance.sdk.openadsdk.mZx.EYQ;

import android.text.TextUtils;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TrackLinkResultSendListener.java */
/* loaded from: classes2.dex */
public class pi implements com.bytedance.sdk.openadsdk.tp.mZx {
    private final com.bytedance.sdk.component.Kbd.EYQ.IPb.Pm EYQ;
    private final boolean mZx;

    public pi(boolean z, com.bytedance.sdk.component.Kbd.EYQ.IPb.Pm pm) {
        this.EYQ = pm;
        this.mZx = z;
    }

    @Override // com.bytedance.sdk.openadsdk.tp.mZx
    public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
        int i;
        if (this.EYQ == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.mZx);
        jSONObject.put("url", this.EYQ.mZx());
        int iPm = this.EYQ.Pm();
        if (iPm <= 0) {
            iPm = 0;
        }
        jSONObject.put("retry_times", iPm);
        jSONObject.put("ad_id", this.EYQ.IPb());
        jSONObject.put("track_type", this.EYQ.Kbd());
        if (!this.mZx) {
            i = 4;
        } else if (this.EYQ.tp()) {
            i = 3;
        } else {
            i = this.EYQ.Pm() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i);
        String strVwS = this.EYQ.VwS();
        if (!TextUtils.isEmpty(strVwS)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strVwS.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put(AndroidBridgeConstants.ERROR_CODE, jSONArray);
        }
        String strHX = this.EYQ.HX();
        if (!TextUtils.isEmpty(strHX)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strHX.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("track_link_result").mZx(jSONObject.toString());
    }
}
