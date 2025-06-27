package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final s f3926a;
    public final j b;
    public final Context c;
    public final a1 d;
    public boolean e = true;

    public b1(s sVar, j jVar, Context context) {
        this.f3926a = sVar;
        this.b = jVar;
        this.c = context;
        this.d = a1.a(sVar, jVar, context);
    }

    public e1 a(JSONObject jSONObject, String str) {
        e1 e1VarNewBanner = e1.newBanner();
        this.d.a(jSONObject, e1VarNewBanner);
        if (e1VarNewBanner.getWidth() == 0 || e1VarNewBanner.getHeight() == 0) {
            a("Required field", "Unable to add companion banner with width " + e1VarNewBanner.getWidth() + " and height " + e1VarNewBanner.getHeight(), str);
            return null;
        }
        e1VarNewBanner.setAssetWidth(jSONObject.optInt("assetWidth"));
        e1VarNewBanner.setAssetHeight(jSONObject.optInt("assetHeight"));
        e1VarNewBanner.setExpandedWidth(jSONObject.optInt("expandedWidth"));
        e1VarNewBanner.setExpandedHeight(jSONObject.optInt("expandedHeight"));
        e1VarNewBanner.setStaticResource(jSONObject.optString("staticResource"));
        e1VarNewBanner.setIframeResource(jSONObject.optString("iframeResource"));
        e1VarNewBanner.setHtmlResource(jSONObject.optString("htmlResource"));
        e1VarNewBanner.setApiFramework(jSONObject.optString("apiFramework"));
        e1VarNewBanner.setAdSlotID(jSONObject.optString("adSlotID"));
        String strOptString = jSONObject.optString("required");
        if (!TextUtils.isEmpty(strOptString)) {
            if (TtmlNode.COMBINE_ALL.equals(strOptString) || "any".equals(strOptString) || "none".equals(strOptString)) {
                e1VarNewBanner.setRequired(strOptString);
            } else {
                a("Bad value", "Wrong companion required attribute:" + strOptString, str);
            }
        }
        return e1VarNewBanner;
    }

    public void a(String str, String str2, String str3) {
        if (this.e) {
            String str4 = this.f3926a.f4116a;
            z4 z4VarC = z4.a(str).e(str2).a(this.b.getSlotId()).c(str3);
            if (str4 == null) {
                str4 = this.f3926a.b;
            }
            z4VarC.b(str4).b(this.c);
        }
    }

    public void a(JSONObject jSONObject, f0 f0Var) {
        b(jSONObject, f0Var);
        Boolean boolD = this.f3926a.d();
        f0Var.setAllowClose(boolD != null ? boolD.booleanValue() : jSONObject.optBoolean("allowClose", f0Var.isAllowClose()));
        Boolean boolF = this.f3926a.f();
        f0Var.setAllowPause(boolF != null ? boolF.booleanValue() : jSONObject.optBoolean("hasPause", f0Var.isAllowPause()));
        Boolean boolG = this.f3926a.g();
        f0Var.setAllowReplay(boolG != null ? boolG.booleanValue() : jSONObject.optBoolean("allowReplay", f0Var.isAllowReplay()));
        float fE = this.f3926a.e();
        if (fE < 0.0f) {
            fE = (float) jSONObject.optDouble("allowCloseDelay", f0Var.getAllowCloseDelay());
        }
        f0Var.setAllowCloseDelay(fE);
    }

    public void b(JSONObject jSONObject, f0 f0Var) {
        float fY = this.f3926a.y();
        if (fY < 0.0f && jSONObject.has("point")) {
            fY = (float) jSONObject.optDouble("point");
            if (fY < 0.0f) {
                a("Bad value", "Wrong value " + fY + " for point", f0Var.getId());
            }
        }
        float fZ = this.f3926a.z();
        if (fZ < 0.0f && jSONObject.has("pointP")) {
            fZ = (float) jSONObject.optDouble("pointP");
            if (fZ < 0.0f) {
                a("Bad value", "Wrong value " + fZ + " for pointP", f0Var.getId());
            }
        }
        if (fY < 0.0f && fZ < 0.0f) {
            fY = -1.0f;
            fZ = -1.0f;
        }
        f0Var.setPoint(fY);
        f0Var.setPointP(fZ);
    }

    public void c(JSONObject jSONObject, f0 f0Var) {
        e1 e1VarA;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("companionAds");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (e1VarA = a(jSONObjectOptJSONObject, f0Var.getId())) != null) {
                f0Var.addCompanion(e1VarA);
            }
        }
    }

    public boolean d(JSONObject jSONObject, f0 f0Var) {
        this.d.a(jSONObject, f0Var);
        this.e = f0Var.isLogErrors();
        if (!"statistics".equals(f0Var.getType())) {
            return false;
        }
        b(jSONObject, f0Var);
        return true;
    }

    public b9 e(JSONObject jSONObject, f0 f0Var) {
        int iOptInt;
        String strOptString = jSONObject.optString("src");
        if (TextUtils.isEmpty(strOptString)) {
            ba.a("CommonVideoParser: encoded shoppable source is empty or null");
            return null;
        }
        try {
            String str = new String(Base64.decode(strOptString, 0));
            int i = 2;
            if (jSONObject.has("interactionTimeout")) {
                iOptInt = jSONObject.optInt("interactionTimeout");
            } else {
                a("Bad value", "Shoppable banner hasn't interactionTimeout", f0Var.getId());
                iOptInt = 2;
            }
            if (iOptInt < 0) {
                a("Bad value", "Shoppable banner has invalid interactionTimeout", f0Var.getId());
            } else {
                i = iOptInt;
            }
            b9 b9VarNewBanner = b9.newBanner(str, (long) (Math.min(i, f0Var.getDuration()) * 1000.0f));
            this.d.a(jSONObject, b9VarNewBanner);
            return b9VarNewBanner;
        } catch (Throwable th) {
            ba.a("CommonVideoParser: shoppable source parsing is ended with exception - " + th);
            a("Bad value", "Shoppable banner has invalid or empty source", f0Var.getId());
            return null;
        }
    }
}
