package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3924a;
    public final s b;
    public final j c;

    public a9(s sVar, j jVar, Context context) {
        this.b = sVar;
        this.c = jVar;
        this.f3924a = context;
    }

    public static a9 a(s sVar, j jVar, Context context) {
        return new a9(sVar, jVar, context);
    }

    public m3 a(JSONObject jSONObject, y9 y9Var, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TextUtils.isEmpty(string)) {
                ba.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't url");
                return null;
            }
            String string2 = jSONObject.getString("id");
            if (TextUtils.isEmpty(string2)) {
                ba.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't id");
                return null;
            }
            String string3 = jSONObject.getString("picture");
            if (TextUtils.isEmpty(string3)) {
                ba.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't picture");
                return null;
            }
            String string4 = jSONObject.getString("text");
            if (TextUtils.isEmpty(string4)) {
                ba.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't text");
                return null;
            }
            String string5 = jSONObject.has("oldPrice") ? jSONObject.getString("oldPrice") : null;
            String string6 = jSONObject.has("price") ? jSONObject.getString("price") : null;
            String string7 = jSONObject.has("deeplink") ? jSONObject.getString("deeplink") : null;
            String string8 = jSONObject.has("deeplink_fallback_url") ? jSONObject.getString("deeplink_fallback_url") : null;
            v9 v9VarE = v9.e();
            y9Var.a(v9VarE, jSONObject, str, -1.0f);
            return m3.a(string, string2, string3, string4, string6, string5, string7, string8, v9VarE);
        } catch (Throwable th) {
            ba.a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – " + th.getMessage());
            return null;
        }
    }

    public z8 a(JSONObject jSONObject, String str) {
        String str2;
        v9 v9VarE = v9.e();
        y9 y9VarA = y9.a(this.b, this.c, this.f3924a);
        boolean zHas = jSONObject.has("statistics");
        if (zHas) {
            y9VarA.a(v9VarE, jSONObject, str, -1.0f);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(FirebaseAnalytics.Param.ITEMS);
        if (jSONArrayOptJSONArray == null) {
            str2 = "ShoppableAdsDataParser: can't parse – ShoppableAdItems'";
        } else {
            int length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                str2 = "ShoppableAdsDataParser: can't parse – shoppableAdItems size is 0";
            } else {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    if (i < length) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject == null) {
                            ba.a("ShoppableAdsDataParser: can't parse – hasn't shoppableItemJson");
                        } else {
                            m3 m3VarA = a(jSONObjectOptJSONObject, y9VarA, str);
                            if (m3VarA == null) {
                                str2 = "ShoppableAdsDataParser: can't parse shoppableAdsItem";
                                break;
                            }
                            arrayList.add(m3VarA);
                        }
                        i++;
                    } else if (arrayList.size() == 0) {
                        str2 = "ShoppableAdsDataParser: can't parse – no one valid shoppableAdItem";
                    } else {
                        if (!zHas || v9VarE.b("shoppableAdsItemShow").size() != 0 || v9VarE.b(com.json.i1.u).size() != 0) {
                            return z8.a(arrayList, v9VarE);
                        }
                        str2 = "ShoppableAdsDataParser: hasn't show stat'";
                    }
                }
            }
        }
        ba.a(str2);
        return null;
    }
}
