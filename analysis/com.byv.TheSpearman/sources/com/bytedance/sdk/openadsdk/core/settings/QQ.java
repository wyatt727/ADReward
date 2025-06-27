package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MediationInitConfigs.java */
/* loaded from: classes2.dex */
public class QQ {
    public static final QQ EYQ = new QQ("");
    private final HashMap<String, EYQ> mZx = new HashMap<>();

    public QQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    EYQ eyq = new EYQ(jSONObjectOptJSONObject);
                    this.mZx.put(eyq.EYQ, eyq);
                }
            }
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("MediationInitConfigs", e.getMessage());
        }
    }

    /* compiled from: MediationInitConfigs.java */
    public static class EYQ {
        public final String EYQ;
        public String Kbd;
        public int Pm;
        public int Td;
        public String mZx;

        public EYQ(JSONObject jSONObject) {
            this.EYQ = jSONObject.optString("name");
            this.mZx = jSONObject.optString("app_id");
            this.Td = jSONObject.optInt("init_thread", 2);
            this.Pm = jSONObject.optInt("request_after_init", 2);
            this.Kbd = jSONObject.optString("class_name");
        }
    }
}
