package com.bytedance.sdk.openadsdk.core.ugen.Td;

import com.bytedance.adsdk.ugeno.core.hu;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import org.json.JSONObject;

/* compiled from: UGRenderRequest.java */
/* loaded from: classes2.dex */
public class EYQ extends pi {
    private JSONObject EYQ;
    private float Pm;
    private float Td;
    private hu mZx;

    public EYQ(C0124EYQ c0124eyq) {
        super(c0124eyq);
        this.EYQ = c0124eyq.EYQ;
        this.mZx = c0124eyq.mZx;
        this.Td = c0124eyq.Td;
        this.Pm = c0124eyq.Pm;
    }

    public float NZ() {
        return this.Td;
    }

    public float tPj() {
        return this.Pm;
    }

    public JSONObject wBa() {
        return this.EYQ;
    }

    public hu rfB() {
        return this.mZx;
    }

    /* compiled from: UGRenderRequest.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ugen.Td.EYQ$EYQ, reason: collision with other inner class name */
    public static class C0124EYQ extends pi.EYQ {
        private JSONObject EYQ;
        private float Pm;
        private float Td;
        private hu mZx;

        public C0124EYQ EYQ(JSONObject jSONObject) {
            this.EYQ = jSONObject;
            return this;
        }

        public C0124EYQ EYQ(hu huVar) {
            this.mZx = huVar;
            return this;
        }

        public C0124EYQ EYQ(float f) {
            this.Td = f;
            return this;
        }

        public C0124EYQ mZx(float f) {
            this.Pm = f;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.mZx.pi.EYQ
        /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
        public EYQ EYQ() {
            return new EYQ(this);
        }
    }
}
