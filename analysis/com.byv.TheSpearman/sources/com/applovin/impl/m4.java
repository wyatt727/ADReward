package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class m4 {
    public static List b(com.applovin.impl.sdk.k kVar) {
        return a(R.raw.applovin_consent_flow_terms_of_service_and_privacy_policy, kVar);
    }

    public static List c(com.applovin.impl.sdk.k kVar) {
        return a(R.raw.applovin_consent_flow_unified_cmp, kVar);
    }

    private static List a(int i, com.applovin.impl.sdk.k kVar) {
        String strA = zp.a(i, com.applovin.impl.sdk.k.k(), kVar);
        if (!TextUtils.isEmpty(strA)) {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strA, null);
            if (jSONObjectJsonObjectFromJsonString != null) {
                JSONArray jSONArray = JsonUtils.getJSONArray(jSONObjectJsonObjectFromJsonString, "states", new JSONArray());
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(h4.a(JsonUtils.getJSONObject(jSONArray, i2, new JSONObject()), kVar));
                }
                return arrayList;
            }
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
    }

    public static List a(com.applovin.impl.sdk.k kVar) {
        return a(R.raw.applovin_consent_flow_privacy_policy, kVar);
    }
}
