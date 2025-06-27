package com.bytedance.sdk.openadsdk.core.VwS.mZx;

import com.bytedance.sdk.openadsdk.core.VwS.mZx.Td;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastFractionalProgressTracker.java */
/* loaded from: classes2.dex */
public class mZx extends Td implements Comparable<mZx> {
    private final float EYQ;

    private mZx(float f, String str, Td.EnumC0113Td enumC0113Td, Boolean bool) {
        super(str, enumC0113Td, bool);
        this.EYQ = f;
    }

    public boolean EYQ(float f) {
        return this.EYQ <= f && !Kbd();
    }

    @Override // java.lang.Comparable
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public int compareTo(mZx mzx) {
        if (mzx == null) {
            return 1;
        }
        float f = this.EYQ;
        float f2 = mzx.EYQ;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.VwS.mZx.Td
    public void h_() {
        super.h_();
    }

    /* compiled from: VastFractionalProgressTracker.java */
    public static class EYQ {
        private final String EYQ;
        private final float mZx;
        private Td.EnumC0113Td Td = Td.EnumC0113Td.TRACKING_URL;
        private boolean Pm = false;

        public EYQ(String str, float f) {
            this.EYQ = str;
            this.mZx = f;
        }

        public mZx EYQ() {
            return new mZx(this.mZx, this.EYQ, this.Td, Boolean.valueOf(this.Pm));
        }
    }

    public JSONObject mZx() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", Td());
        jSONObject.put("trackingFraction", this.EYQ);
        return jSONObject;
    }
}
