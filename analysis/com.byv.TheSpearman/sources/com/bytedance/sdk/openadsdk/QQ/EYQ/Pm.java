package com.bytedance.sdk.openadsdk.QQ.EYQ;

import com.bytedance.sdk.component.EYQ.UB;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.wBa;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InteractiveFinishMethod.java */
/* loaded from: classes2.dex */
public class Pm extends com.bytedance.sdk.component.EYQ.Kbd<JSONObject, JSONObject> {
    private final WeakReference<wBa> EYQ;

    public static void EYQ(UB ub, wBa wba) {
        ub.EYQ("interactiveFinish", new Pm(wba));
    }

    @Override // com.bytedance.sdk.component.EYQ.Kbd
    public JSONObject EYQ(JSONObject jSONObject, com.bytedance.sdk.component.EYQ.IPb iPb) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<wBa> weakReference = this.EYQ;
        if (weakReference != null && weakReference.get() != null) {
            wBa wba = this.EYQ.get();
            com.bytedance.sdk.openadsdk.core.model.UB ubTd = wba.Td();
            try {
                boolean z = true;
                int i = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iKJ = ubTd != null ? ubTd.KJ() : 0;
                if (iOptInt >= 0 && iKJ >= 0) {
                    iOptInt = Math.min(iOptInt, iKJ);
                } else if (iOptInt < 0) {
                    iOptInt = iKJ >= 0 ? iKJ : 0;
                }
                if (z) {
                    wba.Td(iOptInt);
                } else {
                    i = -1;
                }
                jSONObject2.put("code", i);
                jSONObject2.put("reduce_duration", iOptInt);
            } catch (JSONException e) {
                pi.EYQ("InteractiveFinishMethod", e.getMessage());
            }
        }
        return jSONObject2;
    }

    public Pm(wBa wba) {
        this.EYQ = new WeakReference<>(wba);
    }
}
