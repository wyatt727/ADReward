package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class k9 {

    /* renamed from: a, reason: collision with root package name */
    public final s f4031a;
    public final j b;
    public final Context c;
    public final a1 d;
    public boolean e = true;

    public k9(s sVar, j jVar, Context context) {
        this.f4031a = sVar;
        this.b = jVar;
        this.c = context;
        this.d = a1.a(sVar, jVar, context);
    }

    public static k9 a(s sVar, j jVar, Context context) {
        return new k9(sVar, jVar, context);
    }

    public final void a(String str, String str2, String str3) {
        if (this.e) {
            String str4 = this.f4031a.f4116a;
            z4 z4VarC = z4.a(str).e(str2).a(this.b.getSlotId()).c(str3);
            if (str4 == null) {
                str4 = this.f4031a.b;
            }
            z4VarC.b(str4).b(this.c);
        }
    }

    public boolean a(JSONObject jSONObject, j9 j9Var, String str, n nVar) {
        this.d.a(jSONObject, j9Var);
        this.e = j9Var.isLogErrors();
        if (!"html".equals(j9Var.getType())) {
            ba.a("StandardAdBannerParser: Standard banner with unsupported type " + j9Var.getType());
            return false;
        }
        if (jSONObject.has("timeout")) {
            int iOptInt = jSONObject.optInt("timeout");
            if (iOptInt >= 5) {
                j9Var.setTimeout(iOptInt);
            } else {
                a("Required field", "Wrong banner timeout: " + iOptInt, j9Var.getId());
            }
        }
        String strA = a1.a(jSONObject, nVar);
        if (TextUtils.isEmpty(strA)) {
            nVar.a(m.q);
            a("Required field", "Banner has no source field", j9Var.getId());
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            j9Var.setMraidJs(str);
            String strA2 = a1.a(str, strA);
            if (strA2 != null) {
                j9Var.setSource(strA2);
                j9Var.setType(CampaignEx.JSON_KEY_MRAID);
                strA = strA2;
            }
        }
        if (j9Var.getOmData() != null) {
            strA = k7.a(strA);
        }
        j9Var.setSource(strA);
        return true;
    }
}
