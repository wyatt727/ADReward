package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class q3 {

    /* renamed from: a, reason: collision with root package name */
    public final s f4098a;
    public final j b;
    public final Context c;
    public final a1 d;
    public boolean e = true;

    public q3(s sVar, j jVar, Context context) {
        this.f4098a = sVar;
        this.b = jVar;
        this.c = context;
        this.d = a1.a(sVar, jVar, context);
    }

    public static q3 a(s sVar, j jVar, Context context) {
        return new q3(sVar, jVar, context);
    }

    public p3 a(JSONObject jSONObject, String str, n nVar) {
        String strOptString = jSONObject.optString("type", "");
        strOptString.hashCode();
        strOptString.hashCode();
        switch (strOptString) {
            case "banner":
            case "fullscreen":
                w3 w3VarNewBanner = w3.newBanner();
                if (a(jSONObject, w3VarNewBanner, nVar)) {
                    return w3VarNewBanner;
                }
                return null;
            case "html":
                u3 u3VarNewBanner = u3.newBanner();
                if (a(jSONObject, u3VarNewBanner, str, nVar)) {
                    return u3VarNewBanner;
                }
                return null;
            case "promo":
                z3 z3VarNewBanner = z3.newBanner();
                if (a(jSONObject, z3VarNewBanner, str, nVar)) {
                    return z3VarNewBanner;
                }
                return null;
            default:
                nVar.a(m.s);
                return null;
        }
    }

    public final void a(String str, String str2, String str3) {
        if (this.e) {
            String str4 = this.f4098a.f4116a;
            z4 z4VarC = z4.a(str).e(str2).a(this.b.getSlotId()).c(str3);
            if (str4 == null) {
                str4 = this.f4098a.b;
            }
            z4VarC.b(str4).b(this.c);
        }
    }

    public final void a(JSONObject jSONObject, j8 j8Var) {
        j8Var.c(x4.a(jSONObject, "ctaButtonColor", j8Var.d()));
        j8Var.e(x4.a(jSONObject, "ctaButtonTouchColor", j8Var.f()));
        j8Var.d(x4.a(jSONObject, "ctaButtonTextColor", j8Var.e()));
        j8Var.a(x4.a(jSONObject, "backgroundColor", j8Var.a()));
        j8Var.h(x4.a(jSONObject, "textColor", j8Var.j()));
        j8Var.i(x4.a(jSONObject, "titleTextColor", j8Var.j()));
        j8Var.f(x4.a(jSONObject, "domainTextColor", j8Var.g()));
        j8Var.g(x4.a(jSONObject, "progressBarColor", j8Var.h()));
        j8Var.b(x4.a(jSONObject, "barColor", j8Var.b()));
        float fOptDouble = (float) jSONObject.optDouble("barOverlayAlpha", j8Var.c());
        if (0.0f <= fOptDouble && fOptDouble <= 1.0f) {
            j8Var.a(fOptDouble);
        }
        String strOptString = jSONObject.optString("storeIcon");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        j8Var.a(ImageData.newImageData(strOptString));
    }

    public final void a(JSONObject jSONObject, p3 p3Var) {
        this.d.a(jSONObject, p3Var);
        this.e = p3Var.isLogErrors();
        Boolean boolC = this.f4098a.c();
        p3Var.setAllowBackButton(boolC != null ? boolC.booleanValue() : jSONObject.optBoolean("allowBackButton", p3Var.isAllowBackButton()));
        p3Var.setAllowCloseDelay((float) jSONObject.optDouble("allowCloseDelay", p3Var.getAllowCloseDelay()));
        String strOptString = jSONObject.optString("close_icon_hd");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        p3Var.setCloseIcon(ImageData.newImageData(strOptString));
    }

    public boolean a(JSONObject jSONObject, u3 u3Var, String str, n nVar) {
        String strA;
        a(jSONObject, u3Var);
        String strA2 = a1.a(jSONObject, nVar);
        if (TextUtils.isEmpty(strA2)) {
            nVar.a(m.q);
            a("Required field", "Banner with type 'html' has no source field", u3Var.getId());
            return false;
        }
        if (!TextUtils.isEmpty(str) && (strA = a1.a(str, strA2)) != null) {
            u3Var.setType(CampaignEx.JSON_KEY_MRAID);
            strA2 = strA;
        }
        if (u3Var.getOmData() != null) {
            strA2 = k7.a(strA2);
        }
        u3Var.setForceMediaPlayback(jSONObject.optBoolean("forceWebMediaPlayback"));
        u3Var.setSource(strA2);
        u3Var.setTimeToReward((float) jSONObject.optDouble("timeToReward", u3Var.getTimeToReward()));
        return true;
    }

    public boolean a(JSONObject jSONObject, w3 w3Var, n nVar) {
        a(jSONObject, w3Var);
        return x3.a(this.f4098a, this.b, this.c).a(jSONObject, w3Var, nVar);
    }

    public boolean a(JSONObject jSONObject, z3 z3Var, String str, n nVar) {
        JSONObject jSONObjectOptJSONObject;
        r3 r3VarB;
        a(jSONObject, z3Var);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("styleSettings");
        if (jSONObjectOptJSONObject2 != null) {
            a(jSONObjectOptJSONObject2, z3Var.getPromoStyleSettings());
        }
        int iC = this.f4098a.C();
        if (iC <= 0) {
            iC = jSONObject.optInt("style", z3Var.getStyle());
        }
        z3Var.setStyle(iC);
        z3Var.setCloseOnClick(jSONObject.optBoolean("closeOnClick", z3Var.isCloseOnClick()));
        z3Var.setVideoRequired(jSONObject.optBoolean("videoRequired", z3Var.isVideoRequired()));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cards");
        if (jSONArrayOptJSONArray != null && ca.d()) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject3 != null && (r3VarB = b(jSONObjectOptJSONObject3, z3Var)) != null) {
                    z3Var.addInterstitialAdCard(r3VarB);
                }
            }
        }
        if (z3Var.getInterstitialAdCards().isEmpty() && (jSONObjectOptJSONObject = jSONObject.optJSONObject("video")) != null) {
            b5<VideoData> b5VarNewVideoBanner = b5.newVideoBanner();
            b5VarNewVideoBanner.setId(z3Var.getId());
            b5VarNewVideoBanner.setLogErrors(z3Var.isLogErrors());
            if (d1.a(this.f4098a, this.b, this.c).a(jSONObjectOptJSONObject, b5VarNewVideoBanner)) {
                z3Var.setVideoBanner(b5VarNewVideoBanner);
                if (b5VarNewVideoBanner.isAutoPlay()) {
                    z3Var.setAllowClose(b5VarNewVideoBanner.isAllowClose());
                    z3Var.setAllowCloseDelay(b5VarNewVideoBanner.getAllowCloseDelay());
                }
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
            if (jSONObjectOptJSONObject4 != null) {
                p3 p3VarA = a(jSONObjectOptJSONObject4, str, nVar);
                if (p3VarA != null && p3VarA.getId().length() == 0) {
                    p3VarA.setId(z3Var.getId());
                }
                z3Var.setEndCard(p3VarA);
            }
        }
        String strOptString = jSONObject.optString("adIconLink");
        if (TextUtils.isEmpty(strOptString)) {
            return true;
        }
        z3Var.setAdIcon(ImageData.newImageData(strOptString));
        z3Var.setAdIconClickLink(jSONObject.optString("adIconClickLink"));
        return true;
    }

    public r3 b(JSONObject jSONObject, p3 p3Var) {
        String id;
        String str;
        r3 r3VarNewCard = r3.newCard(p3Var);
        r3VarNewCard.setClickArea(p3Var.getClickArea());
        this.d.a(jSONObject, r3VarNewCard);
        if (!jSONObject.has("title")) {
            r3VarNewCard.setImageOnly(true);
        }
        if (TextUtils.isEmpty(r3VarNewCard.getTrackingLink())) {
            id = p3Var.getId();
            str = "no tracking link in interstitialAdCard";
        } else {
            if (r3VarNewCard.getImage() != null) {
                r3VarNewCard.setId(jSONObject.optString("cardID", r3VarNewCard.getId()));
                return r3VarNewCard;
            }
            id = p3Var.getId();
            str = "no image in interstitialAdCard";
        }
        a("Required field", str, id);
        return null;
    }
}
