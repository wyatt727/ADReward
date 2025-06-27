package com.bytedance.sdk.openadsdk.QQ.EYQ;

import com.bytedance.sdk.component.EYQ.UB;
import com.bytedance.sdk.openadsdk.core.wBa;
import org.json.JSONObject;

/* compiled from: PlayableEndCardOverlayMethod.java */
/* loaded from: classes2.dex */
public class IPb extends com.bytedance.sdk.component.EYQ.Kbd<JSONObject, JSONObject> {
    private final wBa EYQ;

    public IPb(wBa wba) {
        this.EYQ = wba;
    }

    public static void EYQ(UB ub, wBa wba) {
        ub.EYQ("overlayRenderFinish", new IPb(wba));
    }

    @Override // com.bytedance.sdk.component.EYQ.Kbd
    public JSONObject EYQ(JSONObject jSONObject, com.bytedance.sdk.component.EYQ.IPb iPb) throws Exception {
        this.EYQ.pi();
        return null;
    }
}
