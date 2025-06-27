package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.json.t2;
import com.my.target.common.models.ImageData;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final s f4181a;
    public final j b;
    public final Context c;
    public boolean d = true;

    public x3(s sVar, j jVar, Context context) {
        this.f4181a = sVar;
        this.b = jVar;
        this.c = context;
    }

    public static x3 a(s sVar, j jVar, Context context) {
        return new x3(sVar, jVar, context);
    }

    public final ImageData a(JSONObject jSONObject, String str) {
        String str2;
        String strOptString = jSONObject.optString("imageLink");
        if (TextUtils.isEmpty(strOptString)) {
            str2 = "InterstitialAdImageBanner no imageLink for image";
        } else {
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            if (iOptInt > 0 && iOptInt2 > 0) {
                return ImageData.newImageData(strOptString, iOptInt, iOptInt2);
            }
            str2 = "InterstitialAdImageBanner  image has wrong dimensions, w = " + iOptInt + ", h = " + iOptInt2;
        }
        a(str2, "Required field", str);
        return null;
    }

    public final void a(String str, String str2, String str3) {
        if (this.d) {
            String str4 = this.f4181a.f4116a;
            z4 z4VarC = z4.a(str2).e(str).a(this.b.getSlotId()).c(str3);
            if (str4 == null) {
                str4 = this.f4181a.b;
            }
            z4VarC.b(str4).b(this.c);
        }
    }

    public boolean a(JSONObject jSONObject, w3 w3Var, n nVar) {
        ImageData imageDataA;
        ImageData imageDataA2;
        this.d = w3Var.isLogErrors();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(t2.h.D);
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(t2.h.C);
        if ((jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) && (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0)) {
            nVar.a(m.p);
            a("No images in InterstitialAdImageBanner", "Required field", w3Var.getId());
            return false;
        }
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (imageDataA2 = a(jSONObjectOptJSONObject, w3Var.getId())) != null) {
                    w3Var.addPortraitImage(imageDataA2);
                }
            }
        }
        if (jSONArrayOptJSONArray2 != null) {
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                if (jSONObjectOptJSONObject2 != null && (imageDataA = a(jSONObjectOptJSONObject2, w3Var.getId())) != null) {
                    w3Var.addLandscapeImage(imageDataA);
                }
            }
        }
        boolean z = (w3Var.getLandscapeImages().isEmpty() && w3Var.getPortraitImages().isEmpty()) ? false : true;
        if (z) {
            nVar.a(m.p);
        }
        return z;
    }
}
