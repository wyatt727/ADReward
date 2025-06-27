package com.json;

import android.util.Base64;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class l7 implements h6 {
    @Override // com.json.h6
    public String a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", "data", Base64.encodeToString(new JSONObject().put(m4.P, m4.Q).put("data", new JSONObject(map)).toString().getBytes(), 2));
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
