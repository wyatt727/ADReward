package com.bytedance.sdk.openadsdk.mZx.EYQ;

import com.json.t2;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdEvenRecord.java */
/* loaded from: classes2.dex */
public class mZx {
    public int Pm;
    public AtomicInteger EYQ = new AtomicInteger(0);
    public AtomicInteger mZx = new AtomicInteger(0);
    public AtomicLong Td = new AtomicLong(0);
    public AtomicInteger Kbd = new AtomicInteger(0);
    public Map<Integer, Integer> IPb = new HashMap();
    public AtomicBoolean VwS = new AtomicBoolean(false);

    public mZx(int i) {
        this.Pm = i;
    }

    JSONObject EYQ() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.EYQ.get());
            jSONObject.put(t2.f.e, this.mZx.get());
            jSONObject.put("type", this.Pm);
            jSONObject.put("duration", this.Td.get() / this.EYQ.get());
            JSONObject jSONObject2 = new JSONObject();
            if (this.IPb.size() > 0) {
                for (Map.Entry<Integer, Integer> entry : this.IPb.entrySet()) {
                    jSONObject2.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            }
            jSONObject.put("fail_error_code", jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    JSONObject mZx() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.EYQ.get());
            jSONObject.put(t2.f.e, this.mZx.get());
            jSONObject.put("type", this.Pm);
            jSONObject.put("time", this.Kbd.get());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
