package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MaterialMetaTools.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static String EYQ(List<FilterWord> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectEYQ = EYQ(it.next());
            if (jSONObjectEYQ != null) {
                jSONArray.put(jSONObjectEYQ);
            }
        }
        return jSONArray.toString();
    }

    public static List<FilterWord> EYQ(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                FilterWord filterWordEYQ = EYQ(jSONArray.optJSONObject(i));
                if (filterWordEYQ != null && filterWordEYQ.isValid()) {
                    arrayList.add(filterWordEYQ);
                }
            }
        } catch (JSONException e) {
            pi.EYQ("MaterialMetaTools", e.getMessage());
        }
        return arrayList;
    }

    private static FilterWord EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    FilterWord filterWordEYQ = EYQ(jSONArrayOptJSONArray.optJSONObject(i));
                    if (filterWordEYQ != null && filterWordEYQ.isValid()) {
                        filterWord.addOption(filterWordEYQ);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject EYQ(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(EYQ(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
