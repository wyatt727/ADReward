package com.my.target;

import android.text.TextUtils;
import com.json.sdk.controller.f;
import com.my.target.ads.Reward;
import com.my.target.c;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ea {
    public static ea a() {
        return new ea();
    }

    public c a(JSONObject jSONObject) throws JSONException {
        c cVarC = c(jSONObject);
        ba.a("VastAdChoicesParser: parsed adChoices");
        return cVarC;
    }

    public final c.a b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f.b.c);
        if (jSONObjectOptJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: adId json object is mandatory");
        }
        String strA = y4.a(jSONObjectOptJSONObject, "text");
        if (TextUtils.isEmpty(strA)) {
            throw new JSONException("VastAdChoicesParser: adId:text json field is mandatory");
        }
        String strA2 = y4.a(jSONObjectOptJSONObject, "copyText");
        if (TextUtils.isEmpty(strA2)) {
            throw new JSONException("VastAdChoicesParser: adId:copyText json field is mandatory");
        }
        ba.a("VastAdChoicesParser: parsed adId: name = " + strA + ", copyText = " + strA2);
        return c.a.a(strA, "copy", null, null, strA2, false);
    }

    public final c c(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adInfo");
        if (jSONObjectOptJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: adInfo json object is mandatory");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(d(jSONObjectOptJSONObject));
        arrayList.add(b(jSONObjectOptJSONObject));
        ImageData imageDataE = e(jSONObjectOptJSONObject);
        c.a aVarF = f(jSONObjectOptJSONObject);
        if (aVarF != null) {
            arrayList.add(aVarF);
        }
        c cVarA = c.a(imageDataE, "");
        cVarA.a(arrayList);
        ba.a("VastAdChoicesParser: parsed adInfo");
        return cVarA;
    }

    public final c.a d(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("advertiserInfo");
        if (jSONObjectOptJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: advertiserInfo json object is mandatory");
        }
        String strA = y4.a(jSONObjectOptJSONObject, "text");
        if (TextUtils.isEmpty(strA)) {
            throw new JSONException("VastAdChoicesParser: advertiserInfo:text json field is mandatory");
        }
        String strA2 = y4.a(jSONObjectOptJSONObject, "url");
        if (!TextUtils.isEmpty(strA2) && da.e(strA2)) {
            ba.a("VastAdChoicesParser: parsed advertiserInfo: name = " + strA + ", clickLink = " + strA2);
            return c.a.a(strA, Reward.DEFAULT, null, strA2, null, true);
        }
        throw new JSONException("VastAdChoicesParser: Invalid url (" + strA2 + ") in advertiserInfo:url");
    }

    public final ImageData e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("icon");
        if (jSONObjectOptJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: icon json object is mandatory");
        }
        String strA = y4.a(jSONObjectOptJSONObject, "url");
        if (TextUtils.isEmpty(strA) || !da.e(strA)) {
            throw new JSONException("VastAdChoicesParser: Invalid iconLink in adChoices = " + strA);
        }
        ba.a("VastAdChoicesParser: parsed icon: url = " + strA);
        return ImageData.newImageData(strA);
    }

    public final c.a f(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("recommendationInfo");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        String strA = y4.a(jSONObjectOptJSONObject, "text");
        if (TextUtils.isEmpty(strA)) {
            throw new JSONException("VastAdChoicesParser: recommendationInfo:text json field is mandatory");
        }
        String strA2 = y4.a(jSONObjectOptJSONObject, "url");
        if (!TextUtils.isEmpty(strA2) && da.e(strA2)) {
            ba.a("VastAdChoicesParser: parsed recommendationInfo: name = " + strA + ", clickLink = " + strA2);
            return c.a.a(strA, Reward.DEFAULT, null, strA2, null, true);
        }
        throw new JSONException("VastAdChoicesParser: Invalid url (" + strA2 + ") in recommendationInfo:url");
    }
}
