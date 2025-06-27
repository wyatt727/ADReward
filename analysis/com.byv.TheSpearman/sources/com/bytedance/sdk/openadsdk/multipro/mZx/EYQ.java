package com.bytedance.sdk.openadsdk.multipro.mZx;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VideoControllerDataModel.java */
/* loaded from: classes2.dex */
public class EYQ {
    public boolean EYQ;
    public long IPb;
    public long Kbd;
    public boolean Pm;
    public boolean Td;
    public long VwS;
    public boolean mZx;

    /* compiled from: VideoControllerDataModel.java */
    /* renamed from: com.bytedance.sdk.openadsdk.multipro.mZx.EYQ$EYQ, reason: collision with other inner class name */
    public interface InterfaceC0135EYQ {
        EYQ IPb();
    }

    public EYQ EYQ(boolean z) {
        this.Pm = z;
        return this;
    }

    public EYQ mZx(boolean z) {
        this.EYQ = z;
        return this;
    }

    public EYQ Td(boolean z) {
        this.mZx = z;
        return this;
    }

    public EYQ Pm(boolean z) {
        this.Td = z;
        return this;
    }

    public EYQ EYQ(long j) {
        this.Kbd = j;
        return this;
    }

    public EYQ mZx(long j) {
        this.IPb = j;
        return this;
    }

    public EYQ Td(long j) {
        this.VwS = j;
        return this;
    }

    public JSONObject EYQ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.EYQ);
            jSONObject.put("isFromVideoDetailPage", this.mZx);
            jSONObject.put("isFromDetailPage", this.Td);
            jSONObject.put("duration", this.Kbd);
            jSONObject.put("totalPlayDuration", this.IPb);
            jSONObject.put("currentPlayPosition", this.VwS);
            jSONObject.put("isAutoPlay", this.Pm);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static EYQ EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        EYQ eyq = new EYQ();
        eyq.mZx(jSONObject.optBoolean("isCompleted"));
        eyq.Td(jSONObject.optBoolean("isFromVideoDetailPage"));
        eyq.Pm(jSONObject.optBoolean("isFromDetailPage"));
        eyq.EYQ(jSONObject.optLong("duration"));
        eyq.mZx(jSONObject.optLong("totalPlayDuration"));
        eyq.Td(jSONObject.optLong("currentPlayPosition"));
        eyq.EYQ(jSONObject.optBoolean("isAutoPlay"));
        return eyq;
    }
}
