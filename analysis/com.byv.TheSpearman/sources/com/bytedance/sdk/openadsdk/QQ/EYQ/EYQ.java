package com.bytedance.sdk.openadsdk.QQ.EYQ;

import com.bytedance.sdk.component.EYQ.Pm;
import com.bytedance.sdk.component.EYQ.UB;
import com.bytedance.sdk.openadsdk.core.wBa;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: DoGetAdsFromNetworkAsyncMethod.java */
/* loaded from: classes2.dex */
public class EYQ extends com.bytedance.sdk.component.EYQ.Pm<JSONObject, JSONObject> {
    private final WeakReference<wBa> EYQ;

    public static void EYQ(UB ub, final wBa wba) {
        ub.EYQ("getNetworkData", new Pm.mZx() { // from class: com.bytedance.sdk.openadsdk.QQ.EYQ.EYQ.1
            @Override // com.bytedance.sdk.component.EYQ.Pm.mZx
            public com.bytedance.sdk.component.EYQ.Pm EYQ() {
                return new EYQ(wba);
            }
        });
    }

    public EYQ(wBa wba) {
        this.EYQ = new WeakReference<>(wba);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.EYQ.Pm
    public void EYQ(JSONObject jSONObject, com.bytedance.sdk.component.EYQ.IPb iPb) throws Exception {
        if (this.EYQ.get() == null) {
            Td();
        } else {
            new Object() { // from class: com.bytedance.sdk.openadsdk.QQ.EYQ.EYQ.2
            };
        }
    }
}
