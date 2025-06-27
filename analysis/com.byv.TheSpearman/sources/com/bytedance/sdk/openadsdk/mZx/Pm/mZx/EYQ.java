package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Td;
import org.json.JSONObject;

/* compiled from: BaseEventModel.java */
/* loaded from: classes2.dex */
public class EYQ<T extends Td> {
    private UB EYQ;
    private boolean Kbd = false;
    private T Pm;
    private JSONObject Td;
    private String mZx;

    public EYQ(UB ub, String str, JSONObject jSONObject, T t) {
        this.Pm = null;
        this.EYQ = ub;
        this.mZx = str;
        this.Td = jSONObject;
        this.Pm = t;
    }

    public UB EYQ() {
        return this.EYQ;
    }

    public String mZx() {
        return this.mZx;
    }

    public JSONObject Td() {
        if (this.Td == null) {
            this.Td = new JSONObject();
        }
        return this.Td;
    }

    public T Pm() {
        return this.Pm;
    }

    public boolean Kbd() {
        return this.Kbd;
    }

    public void EYQ(boolean z) {
        this.Kbd = z;
    }
}
