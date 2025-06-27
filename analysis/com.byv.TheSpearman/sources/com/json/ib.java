package com.json;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class ib extends e {
    private final String i = nb.f2033a;

    ib(int i) {
        this.g = i;
    }

    @Override // com.json.e
    public String a() {
        return nb.f2033a;
    }

    @Override // com.json.e
    public String a(ArrayList<l4> arrayList, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f = jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<l4> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = a(it.next());
                if (jSONObjectA != null) {
                    jSONArray.put(jSONObjectA);
                }
            }
        }
        return a(jSONArray);
    }

    @Override // com.json.e
    public String c() {
        return "outcome";
    }
}
