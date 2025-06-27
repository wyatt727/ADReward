package com.bytedance.sdk.openadsdk.core.VwS;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.VwS.Td.EYQ;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastIcon.java */
/* loaded from: classes2.dex */
public class mZx extends Td {
    private long MxO;
    private long tp;

    public mZx(int i, int i2, long j, long j2, EYQ.EnumC0111EYQ enumC0111EYQ, EYQ.mZx mzx, String str, List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list, List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list2, String str2) {
        super(i, i2, enumC0111EYQ, mzx, str, list, list2, str2);
        this.tp = j;
        this.MxO = j2;
        this.HX = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.VwS.Td
    public JSONObject EYQ() throws JSONException {
        JSONObject jSONObjectEYQ = super.EYQ();
        if (jSONObjectEYQ != null) {
            jSONObjectEYQ.put(TypedValues.CycleType.S_WAVE_OFFSET, this.tp);
            jSONObjectEYQ.put("duration", this.MxO);
        }
        return jSONObjectEYQ;
    }

    public static mZx EYQ(JSONObject jSONObject) {
        Td tdMZx = Td.mZx(jSONObject);
        if (tdMZx == null) {
            return null;
        }
        return new mZx(tdMZx.EYQ, tdMZx.mZx, jSONObject.optLong(TypedValues.CycleType.S_WAVE_OFFSET, -1L), jSONObject.optLong("duration", -1L), tdMZx.Td, tdMZx.Pm, tdMZx.Kbd, tdMZx.IPb, tdMZx.VwS, tdMZx.QQ);
    }
}
