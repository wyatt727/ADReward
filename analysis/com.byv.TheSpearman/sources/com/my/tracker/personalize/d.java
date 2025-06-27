package com.my.tracker.personalize;

import android.text.TextUtils;
import com.applovin.impl.b0$$ExternalSyntheticBackport0;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.tracker.obfuscated.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class d extends b<List<PersonalizePlacement>> {
    d() {
    }

    static <T> c<T> a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        String string = sb.toString();
        z0.a("PersonalizePlacementsParser: " + string);
        return new c<>(null, string);
    }

    static String a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                String str2 = "No value for key: " + str;
                z0.a("PersonalizePlacementsParser: " + str2);
                return str2;
            }
        }
        return null;
    }

    static c<PersonalizeItem> b(JSONObject jSONObject) {
        String strA = a(jSONObject, AppLovinEventParameters.PRODUCT_IDENTIFIER, "payload", "value", "discount_value", "price", "discount_price");
        if (strA != null) {
            return new c<>(null, strA);
        }
        String strOptString = jSONObject.optString(AppLovinEventParameters.PRODUCT_IDENTIFIER);
        if (TextUtils.isEmpty(strOptString)) {
            return a("Invalid value for key: ", AppLovinEventParameters.PRODUCT_IDENTIFIER);
        }
        String strOptString2 = jSONObject.optString("payload");
        if (TextUtils.isEmpty(strOptString2)) {
            return a("Invalid value for key: ", "payload");
        }
        return new c<>(new PersonalizeItem(strOptString, strOptString2, jSONObject.optDouble("price"), jSONObject.optDouble("discount_price"), jSONObject.optInt("value"), jSONObject.optInt("discount_value")), null);
    }

    static c<PersonalizeOffer> c(JSONObject jSONObject) {
        String str;
        StringBuilder sb;
        String strA = a(jSONObject, "offer_id", "subitems");
        if (strA != null) {
            return new c<>(null, strA);
        }
        int iOptInt = jSONObject.optInt("offer_id");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subitems");
        if (jSONArrayOptJSONArray == null) {
            return a("No value for key: ", "subitems");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            c<PersonalizeItem> cVarB = b(jSONArrayOptJSONArray.optJSONObject(i));
            String strA2 = cVarB.a();
            if (TextUtils.isEmpty(strA2)) {
                PersonalizeItem personalizeItemB = cVarB.b();
                if (personalizeItemB == null) {
                    str = "Can't parse item " + i + " without errors";
                    arrayList2.add(str);
                    sb = new StringBuilder();
                } else {
                    arrayList.add(personalizeItemB);
                }
            } else {
                str = "Can't parse item " + i + " with errors: " + strA2;
                arrayList2.add(str);
                sb = new StringBuilder();
            }
            sb.append("PersonalizePlacementsParser: ");
            sb.append(str);
            z0.a(sb.toString());
        }
        return arrayList2.size() > 0 ? new c<>(null, b0$$ExternalSyntheticBackport0.m(", ", arrayList2)) : new c<>(new PersonalizeOffer(iOptInt, arrayList), null);
    }

    static c<PersonalizePlacement> d(JSONObject jSONObject) {
        String strA = a(jSONObject, "placement_id", "test_id", FirebaseAnalytics.Param.GROUP_ID, "offer");
        if (strA != null) {
            return new c<>(null, strA);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("offer");
        if (jSONObjectOptJSONObject == null) {
            return a("Invalid value for key: ", "offer");
        }
        c<PersonalizeOffer> cVarC = c(jSONObjectOptJSONObject);
        String strA2 = cVarC.a();
        if (strA2 != null) {
            z0.a("PersonalizePlacementsParser: Can't parse offer's object with error: " + strA2);
            return new c<>(null, strA2);
        }
        PersonalizeOffer personalizeOfferB = cVarC.b();
        if (personalizeOfferB == null) {
            return a("Can't parse offer's object without error from parser", null);
        }
        String strOptString = jSONObject.optString("placement_id");
        return TextUtils.isEmpty(strOptString) ? a("Invalid value for key: ", "placement_id") : new c<>(new PersonalizePlacement(strOptString, jSONObject.optInt(FirebaseAnalytics.Param.GROUP_ID), jSONObject.optInt("test_id"), personalizeOfferB), null);
    }

    @Override // com.my.tracker.personalize.b
    c<List<PersonalizePlacement>> a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("errors");
        ArrayList arrayList = new ArrayList();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                arrayList.add(next + ": " + jSONObjectOptJSONObject.optString(next));
            }
            return new c<>(null, b0$$ExternalSyntheticBackport0.m(", ", arrayList));
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            return a("No value for key: ", "data");
        }
        if (jSONArrayOptJSONArray.length() == 0) {
            return a("No placements in the list");
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            c<PersonalizePlacement> cVarD = d(jSONArrayOptJSONArray.optJSONObject(i));
            String strA = cVarD.a();
            if (strA != null) {
                z0.a("PersonalizePlacementsParser: Placement parsing error: " + strA);
            } else {
                PersonalizePlacement personalizePlacementB = cVarD.b();
                if (personalizePlacementB != null) {
                    arrayList2.add(personalizePlacementB);
                }
            }
        }
        return arrayList2.isEmpty() ? a("No placements in the list") : new c<>(arrayList2, null);
    }
}
