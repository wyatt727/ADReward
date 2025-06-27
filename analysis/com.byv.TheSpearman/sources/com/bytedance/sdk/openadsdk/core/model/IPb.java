package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AutoTestModel.java */
/* loaded from: classes2.dex */
public class IPb {
    private String EYQ;
    private List<String> mZx;

    public IPb(String str) {
        this.EYQ = "";
        this.mZx = new ArrayList();
        HashMap<String, Object> map = TextUtils.isEmpty(str) ? new HashMap<>() : EYQ(str);
        try {
            this.EYQ = (String) map.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) map.get("auto_test_hosts"));
            this.mZx = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.mZx.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("AutoTestModel", e.getMessage());
        }
    }

    public String EYQ() {
        return this.EYQ;
    }

    public List<String> mZx() {
        return this.mZx;
    }

    private static final HashMap<String, Object> EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                map.put(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("value"));
            }
            return map;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
