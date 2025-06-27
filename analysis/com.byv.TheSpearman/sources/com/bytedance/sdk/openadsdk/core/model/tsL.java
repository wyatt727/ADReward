package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DspStyle.java */
/* loaded from: classes2.dex */
public class tsL {
    private final int EYQ;
    private final int Pm;
    private final int Td;
    private final int mZx;

    public tsL(JSONObject jSONObject) {
        this.EYQ = jSONObject.optInt("auto_click", 0);
        this.mZx = jSONObject.optInt("close_jump_probability", 0);
        this.Td = jSONObject.optInt("skip_jump_probability", 0);
        this.Pm = jSONObject.optInt("hidden_bar", 0);
    }

    public int EYQ() {
        return this.EYQ;
    }

    public int mZx() {
        int i = this.mZx;
        if (i < 0 || i > 100) {
            return 0;
        }
        return i;
    }

    public int Td() {
        int i = this.Td;
        if (i < 0 || i > 100) {
            return 0;
        }
        return i;
    }

    public boolean Pm() {
        return this.Pm == 1;
    }

    public JSONObject Kbd() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = this.EYQ;
            if (i == 1) {
                jSONObject.put("auto_click", i);
            }
            int i2 = this.mZx;
            if (i2 > 0 && i2 <= 100) {
                jSONObject.put("close_jump_probability", i2);
            }
            int i3 = this.Td;
            if (i3 > 0 && i3 <= 100) {
                jSONObject.put("skip_jump_probability", i3);
            }
            if (this.Pm == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static boolean EYQ(UB ub) {
        if (ub == null || !ub.oIw() || ub.JyA() == null) {
            return false;
        }
        return ub.JyA().Pm();
    }
}
