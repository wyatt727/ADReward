package com.bytedance.sdk.openadsdk.QQ.EYQ;

import com.bytedance.sdk.component.EYQ.UB;
import com.bytedance.sdk.openadsdk.core.wBa;
import org.json.JSONObject;

/* compiled from: SendCommerceLandingPageMeta.java */
/* loaded from: classes2.dex */
public class QQ extends com.bytedance.sdk.component.EYQ.Kbd<JSONObject, JSONObject> {
    private final wBa EYQ;

    public QQ(wBa wba) {
        this.EYQ = wba;
    }

    public static void EYQ(UB ub, wBa wba) {
        ub.EYQ("commonConvert", new QQ(wba));
    }

    @Override // com.bytedance.sdk.component.EYQ.Kbd
    public JSONObject EYQ(JSONObject jSONObject, com.bytedance.sdk.component.EYQ.IPb iPb) throws Exception {
        this.EYQ.Pm(jSONObject);
        return null;
    }
}
