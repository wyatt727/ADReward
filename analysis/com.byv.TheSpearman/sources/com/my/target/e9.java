package com.my.target;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e9 {
    public d9 a(String str) {
        try {
            String string = new JSONObject(str).getString("id");
            if (!TextUtils.isEmpty(string)) {
                return new d9(string);
            }
            ba.a("ShoppablePostMessageParamsParser: can't parse shoppablePostMessageParams – shoppableAdsDataId is empty");
            return null;
        } catch (Throwable th) {
            ba.a("ShoppablePostMessageParamsParser: can't parse shoppablePostMessageParams – " + th.getMessage());
            return null;
        }
    }
}
