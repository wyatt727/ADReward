package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e6 {

    /* renamed from: a, reason: collision with root package name */
    public final s f3959a;
    public final j b;
    public final Context c;
    public final a1 d;
    public String e;
    public boolean f = true;

    public e6(s sVar, j jVar, Context context) {
        this.f3959a = sVar;
        this.b = jVar;
        this.c = context;
        this.d = a1.a(sVar, jVar, context);
    }

    public static e6 a(s sVar, j jVar, Context context) {
        return new e6(sVar, jVar, context);
    }

    public f6 a(JSONObject jSONObject, d6 d6Var) {
        String str;
        f6 f6VarNewCard = f6.newCard(d6Var);
        this.d.a(jSONObject, f6VarNewCard);
        String strOptString = jSONObject.optString(FirebaseAnalytics.Param.DISCOUNT);
        if (TextUtils.isEmpty(strOptString)) {
            ba.a("NativeAdBannerParser: no discount value or the value is empty.");
        } else {
            f6VarNewCard.setDiscount(strOptString);
        }
        if (TextUtils.isEmpty(f6VarNewCard.getTrackingLink())) {
            str = "no tracking link in nativeAdCard";
        } else {
            if (f6VarNewCard.getImage() != null) {
                f6VarNewCard.setId(jSONObject.optString("cardID", f6VarNewCard.getId()));
                return f6VarNewCard;
            }
            str = "no image in nativeAdCard";
        }
        a("Required field", str);
        return null;
    }

    public final void a(String str, String str2) {
        if (this.f) {
            String str3 = this.f3959a.f4116a;
            z4 z4VarC = z4.a(str).e(str2).a(this.b.getSlotId()).c(this.e);
            if (str3 == null) {
                str3 = this.f3959a.b;
            }
            z4VarC.b(str3).b(this.c);
        }
    }

    public void a(JSONObject jSONObject, d6 d6Var, n nVar) {
        f6 f6VarA;
        this.d.a(jSONObject, d6Var);
        this.f = d6Var.isLogErrors();
        this.e = d6Var.getId();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cards");
        if (jSONArrayOptJSONArray != null && ca.d()) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (f6VarA = a(jSONObjectOptJSONObject, d6Var)) != null) {
                    d6Var.addNativeAdCard(f6VarA);
                }
            }
            return;
        }
        if (jSONObject.has("content")) {
            d6Var.setCtcText(jSONObject.optString("ctcText", d6Var.getCtcText()));
            String strOptString = jSONObject.optString("ctcIconLink");
            if (!TextUtils.isEmpty(strOptString)) {
                d6Var.setCtcIcon(ImageData.newImageData(strOptString));
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("content");
            if (jSONObjectOptJSONObject2 != null) {
                d6Var.setContent(b(jSONObjectOptJSONObject2, d6Var, nVar));
            }
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject3 != null) {
            b5<VideoData> b5VarNewVideoBanner = b5.newVideoBanner();
            b5VarNewVideoBanner.setId(d6Var.getId());
            b5VarNewVideoBanner.setLogErrors(d6Var.isLogErrors());
            if (d1.a(this.f3959a, this.b, this.c).a(jSONObjectOptJSONObject3, b5VarNewVideoBanner)) {
                d6Var.setVideoBanner(b5VarNewVideoBanner);
            }
        }
    }

    public h6 b(JSONObject jSONObject, d6 d6Var, n nVar) {
        String strOptString = jSONObject.optString("type");
        if (!"html".equals(strOptString)) {
            ba.a("NativeAdBannerParser: NativeAdContent banner has type " + strOptString);
            return null;
        }
        String strA = a1.a(jSONObject, nVar);
        if (TextUtils.isEmpty(strA)) {
            a("Required field", "NativeAdContent has no source field");
            return null;
        }
        h6 h6VarNewContent = h6.newContent(d6Var, strA);
        this.d.a(jSONObject, h6VarNewContent);
        return h6VarNewContent;
    }
}
