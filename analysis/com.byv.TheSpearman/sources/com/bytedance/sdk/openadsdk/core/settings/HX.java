package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.Pm;
import org.json.JSONObject;

/* compiled from: MediationInitSettings.java */
/* loaded from: classes2.dex */
public class HX extends nWX {
    public HX() {
        super("tt_set_mediation.prop", null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Pm
    public void EYQ(JSONObject jSONObject) {
        if (jSONObject.has("mediation_init_conf")) {
            Pm.EYQ EYQ = EYQ();
            EYQ.EYQ("mediation_init_conf", jSONObject.optString("mediation_init_conf"));
            EYQ.EYQ();
        }
    }
}
