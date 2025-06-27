package com.bytedance.sdk.component.EYQ;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Java2JsMsg.java */
/* loaded from: classes2.dex */
public final class KO {
    private final Map<String, Object> EYQ = new ConcurrentHashMap();

    public static KO EYQ() {
        return new KO();
    }

    private KO() {
    }

    public KO EYQ(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.EYQ.put(str, obj);
        }
        return this;
    }

    public String mZx() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.EYQ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
