package com.bytedance.adsdk.ugeno.core;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: UGenEvent.java */
/* loaded from: classes2.dex */
public class MxO {
    private com.bytedance.adsdk.ugeno.component.mZx EYQ;
    private MxO Kbd;
    private MxO Pm;
    private JSONObject Td;
    private int mZx;

    public com.bytedance.adsdk.ugeno.component.mZx EYQ() {
        return this.EYQ;
    }

    public void EYQ(com.bytedance.adsdk.ugeno.component.mZx mzx) {
        this.EYQ = mzx;
    }

    public int mZx() {
        return this.mZx;
    }

    public void EYQ(int i) {
        this.mZx = i;
    }

    public JSONObject Td() {
        return this.Td;
    }

    public void EYQ(JSONObject jSONObject) {
        this.Td = jSONObject;
    }

    public MxO Pm() {
        return this.Pm;
    }

    public void EYQ(MxO mxO) {
        this.Pm = mxO;
    }

    public void mZx(MxO mxO) {
        this.Kbd = mxO;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.EYQ + ", mEventType=" + this.mZx + ", mEvent=" + this.Td + AbstractJsonLexerKt.END_OBJ;
    }
}
