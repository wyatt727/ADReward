package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c1 extends b1 {
    public c1(s sVar, j jVar, Context context) {
        super(sVar, jVar, context);
    }

    public static c1 a(s sVar, j jVar, Context context) {
        return new c1(sVar, jVar, context);
    }

    public k3 a(JSONObject jSONObject) {
        String strA = y4.a(jSONObject, "text");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new k3(strA);
    }

    public List<o3> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length <= 0) {
            ba.a("CommonVideoMotionParser: videoMotionItems size 0");
            return null;
        }
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strA = y4.a(jSONObject, "id");
                if (!TextUtils.isEmpty(strA)) {
                    String strA2 = y4.a(jSONObject, "currency");
                    if (!TextUtils.isEmpty(strA2)) {
                        String strA3 = y4.a(jSONObject, "image");
                        if (!TextUtils.isEmpty(strA3)) {
                            String strA4 = y4.a(jSONObject, "text");
                            if (!TextUtils.isEmpty(strA4)) {
                                String strA5 = y4.a(jSONObject, "ctaText");
                                if (!TextUtils.isEmpty(strA5) && jSONObject.has("statistics")) {
                                    y9 y9Var = new y9(this.f3926a, this.b, this.c);
                                    v9 v9VarE = v9.e();
                                    y9Var.a(v9VarE, jSONObject, strA, 0.0f);
                                    arrayList.add(new o3(strA, y4.a(jSONObject, "price"), y4.a(jSONObject, "old_price"), strA2, strA3, strA4, strA5, v9VarE, y4.a(jSONObject, "url"), y4.a(jSONObject, "deeplink"), y4.a(jSONObject, "deeplink_fallback_url")));
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public boolean a(JSONObject jSONObject, ja jaVar) {
        if (d(jSONObject, jaVar)) {
            return true;
        }
        float duration = jaVar.getDuration();
        if (duration <= 0.0f) {
            a("Bad value", "wrong videoMotionBanner duration " + duration, jaVar.getId());
            return false;
        }
        jaVar.setCloseActionText(jSONObject.optString("closeActionText", "Close"));
        jaVar.setReplayActionText(jSONObject.optString("replayActionText", jaVar.getReplayActionText()));
        jaVar.setCloseDelayActionText(jSONObject.optString("closeDelayActionText", jaVar.getCloseDelayActionText()));
        Boolean boolK = this.f3926a.k();
        jaVar.setAutoMute(boolK != null ? boolK.booleanValue() : jSONObject.optBoolean("automute", jaVar.isAutoMute()));
        jaVar.setShowPlayerControls(jSONObject.optBoolean("showPlayerControls", jaVar.isShowPlayerControls()));
        Boolean boolL = this.f3926a.l();
        jaVar.setAutoPlay(boolL != null ? boolL.booleanValue() : jSONObject.optBoolean("autoplay", jaVar.isAutoPlay()));
        jaVar.setHasCtaButton(jSONObject.optBoolean("hasCtaButton", jaVar.isHasCtaButton()));
        a(jSONObject, (f0) jaVar);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("shoppable");
        if (jSONObjectOptJSONObject != null) {
            jaVar.setShoppableBanner(e(jSONObjectOptJSONObject, jaVar));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("shoppableAdsData");
        if (jSONObjectOptJSONObject2 != null) {
            jaVar.setShoppableAdsData(a9.a(this.f3926a, this.b, this.c).a(jSONObjectOptJSONObject2, jaVar.getId()));
        }
        c(jSONObject, jaVar);
        try {
            return b(jSONObject.getJSONObject("videoMotionData"), jaVar);
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public l3 b(JSONObject jSONObject) {
        String str;
        String strA = y4.a(jSONObject, "icon");
        if (TextUtils.isEmpty(strA)) {
            str = "CommonVideoMotionParser: can't parse header, icon is empty";
        } else {
            String strA2 = y4.a(jSONObject, "title");
            if (TextUtils.isEmpty(strA2)) {
                str = "CommonVideoMotionParser: can't parse header, title is empty";
            } else {
                String strA3 = y4.a(jSONObject, "linkText");
                if (TextUtils.isEmpty(strA3)) {
                    str = "CommonVideoMotionParser: can't parse header, link text is empty";
                } else {
                    String strA4 = y4.a(jSONObject, "ageRestrictionText");
                    if (TextUtils.isEmpty(strA4)) {
                        str = "CommonVideoMotionParser: can't parse header, age restriction is empty";
                    } else {
                        String strA5 = y4.a(jSONObject, "adDisclaimerText");
                        if (TextUtils.isEmpty(strA5)) {
                            str = "CommonVideoMotionParser: can't parse header, ad disclaimer text is empty";
                        } else {
                            if (jSONObject.has("statistics")) {
                                y9 y9Var = new y9(this.f3926a, this.b, this.c);
                                v9 v9VarE = v9.e();
                                y9Var.a(v9VarE, jSONObject, "0", 0.0f);
                                return new l3(strA, strA2, strA3, strA4, strA5, v9VarE, y4.a(jSONObject, "url"), y4.a(jSONObject, "deeplink"), y4.a(jSONObject, "deeplink_fallback_url"));
                            }
                            str = "CommonVideoMotionParser: can't parse header, hasn't stats key";
                        }
                    }
                }
            }
        }
        ba.a(str);
        return null;
    }

    public boolean b(JSONObject jSONObject, ja jaVar) {
        l3 l3VarB;
        try {
            List<o3> listA = a(jSONObject.getJSONArray(FirebaseAnalytics.Param.ITEMS));
            if (listA == null || listA.isEmpty() || (l3VarB = b(jSONObject.getJSONObject("header"))) == null) {
                return false;
            }
            jaVar.setInternalVideoMotionData(new n3(l3VarB, listA, jSONObject.has("disclaimer") ? a(jSONObject.getJSONObject("disclaimer")) : null));
            return true;
        } catch (JSONException unused) {
        }
        return false;
    }
}
