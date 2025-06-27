package com.bytedance.sdk.component.adexpress.dynamic.Td;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicDiffPlugin.java */
/* loaded from: classes2.dex */
public class Pm {
    public List<EYQ> EYQ;
    public String Pm;
    public String Td;
    public String mZx;

    /* compiled from: DynamicDiffPlugin.java */
    public static class EYQ {
        public int EYQ;
        public JSONObject mZx;
    }

    public static Pm EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Pm pm = new Pm();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    EYQ eyq = new EYQ();
                    eyq.EYQ = jSONObjectOptJSONObject.optInt("id");
                    eyq.mZx = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(eyq);
                }
            }
        } catch (JSONException unused) {
        }
        pm.EYQ = arrayList;
        pm.mZx = jSONObject.optString("diff_data");
        pm.Td = jSONObject.optString("style_diff");
        pm.Pm = jSONObject.optString("tag_diff");
        return pm;
    }
}
