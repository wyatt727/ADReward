package com.unity.purchasing.common;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PurchaseFailedEvent {
    public static String jsonEncodePurchaseFailure(String str, PurchaseFailureReason purchaseFailureReason, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, str);
            jSONObject.put("reason", purchaseFailureReason);
            jSONObject.put("message", str2);
            return jSONObject.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
