package com.bytedance.sdk.openadsdk.QQ.EYQ;

import com.bytedance.sdk.component.EYQ.Pm;
import com.bytedance.sdk.component.EYQ.UB;
import com.bytedance.sdk.openadsdk.core.wBa;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: DoNewClickEventMethod.java */
/* loaded from: classes2.dex */
public class Td extends com.bytedance.sdk.component.EYQ.Pm<JSONObject, JSONObject> {
    private final WeakReference<wBa> EYQ;

    public static void EYQ(UB ub, final wBa wba) {
        ub.EYQ("newClickEvent", new Pm.mZx() { // from class: com.bytedance.sdk.openadsdk.QQ.EYQ.Td.1
            @Override // com.bytedance.sdk.component.EYQ.Pm.mZx
            public com.bytedance.sdk.component.EYQ.Pm EYQ() {
                return new Td(wba);
            }
        });
    }

    public Td(wBa wba) {
        this.EYQ = new WeakReference<>(wba);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.EYQ.Pm
    public void EYQ(JSONObject jSONObject, com.bytedance.sdk.component.EYQ.IPb iPb) throws Exception {
        wBa wba = this.EYQ.get();
        if (wba == null) {
            Td();
        } else {
            wba.Td(jSONObject);
        }
    }
}
