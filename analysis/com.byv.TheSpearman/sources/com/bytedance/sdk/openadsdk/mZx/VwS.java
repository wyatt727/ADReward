package com.bytedance.sdk.openadsdk.mZx;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdShowTime.java */
/* loaded from: classes2.dex */
public class VwS {
    private long EYQ;
    private long Kbd;
    private long Pm;
    private long Td;
    private long mZx;

    public void EYQ(long j) {
        if (this.EYQ <= 0) {
            this.EYQ = j;
        }
    }

    public void mZx(long j) {
        if (this.mZx <= 0) {
            this.mZx = j;
        }
    }

    public void Td(long j) {
        if (this.Td <= 0) {
            this.Td = j;
        }
    }

    public void Pm(long j) {
        if (this.Pm <= 0) {
            this.Pm = j;
        }
    }

    public void Kbd(long j) {
        if (this.Kbd <= 0) {
            this.Kbd = j;
        }
    }

    public boolean EYQ() {
        return this.EYQ > 0;
    }

    public void EYQ(long j, float f) {
        if (f > 0.0f) {
            EYQ(j);
        }
        double d = f;
        if (d >= 0.25d) {
            EYQ(j);
            mZx(j);
        }
        if (d >= 0.5d) {
            EYQ(j);
            mZx(j);
            Td(j);
        }
        if (d >= 0.75d) {
            EYQ(j);
            mZx(j);
            Td(j);
            Pm(j);
        }
        if (f >= 1.0f) {
            EYQ(j);
            mZx(j);
            Td(j);
            Pm(j);
            Kbd(j);
        }
    }

    public JSONObject mZx() {
        return EYQ((JSONObject) null);
    }

    public JSONObject EYQ(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j = this.EYQ;
        if (j > 0) {
            jSONObject.put("show_start", j);
            long j2 = this.mZx;
            if (j2 > 0) {
                jSONObject.put("show_firstQuartile", j2);
                long j3 = this.Td;
                if (j3 > 0) {
                    jSONObject.put("show_mid", j3);
                    long j4 = this.Pm;
                    if (j4 > 0) {
                        jSONObject.put("show_thirdQuartile", j4);
                        long j5 = this.Kbd;
                        if (j5 > 0) {
                            jSONObject.put("show_full", j5);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
