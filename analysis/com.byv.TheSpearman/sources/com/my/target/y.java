package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final s f4185a;
    public final j b;
    public final Context c;
    public final y9 d;

    public y(s sVar, j jVar, Context context) {
        this.f4185a = sVar;
        this.b = jVar;
        this.c = context;
        this.d = y9.a(sVar, jVar, context);
    }

    public static y a(s sVar, j jVar, Context context) {
        return new y(sVar, jVar, context);
    }

    public final i7 a(i7 i7Var, JSONObject jSONObject) {
        return jSONObject == null ? i7Var : j7.a(this.b, this.f4185a.b, true, this.c).a(i7Var, jSONObject);
    }

    public s a(JSONObject jSONObject, n nVar) {
        JSONObject jSONObjectOptJSONObject;
        u9 u9VarA;
        int iB = this.f4185a.B();
        Boolean boolValueOf = null;
        if (iB >= 5) {
            nVar.a(m.i);
            ba.a("AdditionalDataParser: Got additional data, but max redirects limit exceeded");
            return null;
        }
        int iOptInt = jSONObject.optInt("id", this.f4185a.s());
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            nVar.a(m.n);
            a("Required field", "No url in additionalData Id = " + iOptInt);
            return null;
        }
        s sVarB = s.b(strOptString);
        sVarB.e(iB + 1);
        sVarB.c(iOptInt);
        sVarB.b(jSONObject.optBoolean("doAfter", sVarB.F()));
        sVarB.b(jSONObject.optInt("doOnEmptyResponseFromId", sVarB.r()));
        sVarB.c(jSONObject.optBoolean("isMidrollPoint", sVarB.H()));
        float fE = this.f4185a.e();
        if (fE < 0.0f) {
            fE = (float) jSONObject.optDouble("allowCloseDelay", sVarB.e());
        }
        sVarB.a(fE);
        Boolean boolD = this.f4185a.d();
        if (boolD == null) {
            boolD = jSONObject.has("allowClose") ? Boolean.valueOf(jSONObject.optBoolean("allowClose")) : null;
        }
        sVarB.b(boolD);
        Boolean boolF = this.f4185a.f();
        if (boolF == null) {
            boolF = jSONObject.has("hasPause") ? Boolean.valueOf(jSONObject.optBoolean("hasPause")) : null;
        }
        sVarB.c(boolF);
        Boolean boolH = this.f4185a.h();
        if (boolH == null) {
            boolH = jSONObject.has("allowSeek") ? Boolean.valueOf(jSONObject.optBoolean("allowSeek")) : null;
        }
        sVarB.e(boolH);
        Boolean boolI = this.f4185a.i();
        if (boolI == null) {
            boolI = jSONObject.has("allowSkip") ? Boolean.valueOf(jSONObject.optBoolean("allowSkip")) : null;
        }
        sVarB.f(boolI);
        Boolean boolJ = this.f4185a.j();
        if (boolJ == null) {
            boolJ = jSONObject.has("allowTrackChange") ? Boolean.valueOf(jSONObject.optBoolean("allowTrackChange")) : null;
        }
        sVarB.g(boolJ);
        Boolean boolX = this.f4185a.x();
        if (boolX == null) {
            boolX = jSONObject.has("openInBrowser") ? Boolean.valueOf(jSONObject.optBoolean("openInBrowser")) : null;
        }
        sVarB.l(boolX);
        Boolean boolQ = this.f4185a.q();
        if (boolQ == null) {
            boolQ = jSONObject.has("directLink") ? Boolean.valueOf(jSONObject.optBoolean("directLink")) : null;
        }
        sVarB.j(boolQ);
        Boolean boolG = this.f4185a.g();
        if (boolG == null) {
            boolG = jSONObject.has("allowReplay") ? Boolean.valueOf(jSONObject.optBoolean("allowReplay")) : null;
        }
        sVarB.d(boolG);
        Boolean boolC = this.f4185a.c();
        if (boolC == null) {
            boolC = jSONObject.has("allowBackButton") ? Boolean.valueOf(jSONObject.optBoolean("allowBackButton")) : null;
        }
        sVarB.a(boolC);
        Boolean boolK = this.f4185a.k();
        if (boolK == null) {
            boolK = jSONObject.has("automute") ? Boolean.valueOf(jSONObject.optBoolean("automute")) : null;
        }
        sVarB.h(boolK);
        Boolean boolL = this.f4185a.l();
        if (boolL == null) {
            boolL = jSONObject.has("autoplay") ? Boolean.valueOf(jSONObject.optBoolean("autoplay")) : null;
        }
        sVarB.i(boolL);
        int iC = this.f4185a.C();
        if (iC < 0) {
            iC = jSONObject.optInt("style", sVarB.C());
        }
        sVarB.f(iC);
        int iN = this.f4185a.n();
        if (iN < 0) {
            iN = jSONObject.optInt("clickArea", sVarB.n());
        }
        sVarB.a(iN);
        Boolean boolG2 = this.f4185a.G();
        if (boolG2 != null) {
            boolValueOf = boolG2;
        } else if (jSONObject.has("logErrors")) {
            boolValueOf = Boolean.valueOf(jSONObject.optBoolean("logErrors"));
        }
        sVarB.k(boolValueOf);
        float fY = this.f4185a.y();
        if (fY < 0.0f && jSONObject.has("point")) {
            fY = (float) jSONObject.optDouble("point");
            if (fY < 0.0f) {
                a("Bad value", "Wrong value -1.0 for point in additionalData object");
                fY = -1.0f;
            }
        }
        sVarB.b(fY);
        float fZ = this.f4185a.z();
        if (fZ < 0.0f && jSONObject.has("pointP")) {
            fZ = (float) jSONObject.optDouble("pointP");
            if (fZ < 0.0f || fZ > 100.0f) {
                a("Bad value", "Wrong value -1.0 for pointP in additionalData object");
                fZ = -1.0f;
            }
        }
        sVarB.c(fZ);
        sVarB.a(this.f4185a.t());
        sVarB.a(a(this.f4185a.v(), jSONObject.optJSONObject("omdata")));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("serviceStatistics");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null && (u9VarA = this.d.a(jSONObjectOptJSONObject2, -1.0f)) != null) {
                    sVarB.a(u9VarA);
                }
            }
        }
        this.d.a(sVarB.m(), jSONObject, String.valueOf(sVarB.s()), -1.0f);
        c cVarA = this.f4185a.a();
        if (cVarA == null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("adChoices")) != null) {
            cVarA = h.a().a(jSONObjectOptJSONObject, null, sVarB.f4116a, this.b.getSlotId(), boolValueOf != null ? boolValueOf.booleanValue() : true, this.c);
        }
        sVarB.a(cVarA);
        String strB = this.f4185a.b();
        if (strB == null && jSONObject.has("advertisingLabel")) {
            strB = jSONObject.optString("advertisingLabel");
        }
        sVarB.c(strB);
        return sVarB;
    }

    public final void a(String str, String str2) {
        String str3 = this.f4185a.f4116a;
        z4 z4VarA = z4.a(str).e(str2).a(this.b.getSlotId());
        if (str3 == null) {
            str3 = this.f4185a.b;
        }
        z4VarA.b(str3).b(this.c);
    }
}
