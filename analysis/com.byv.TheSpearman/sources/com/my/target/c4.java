package com.my.target;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.common.models.VideoData;
import com.my.target.l5;
import com.my.target.o5;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c4 extends o<e4> implements l5.a {

    /* renamed from: a, reason: collision with root package name */
    public String f3935a;

    public static o<e4> a() {
        return new c4();
    }

    public static void b(JSONObject jSONObject, s sVar, j jVar, n nVar, Context context) {
        s sVarA = y.a(sVar, jVar, context).a(jSONObject, nVar);
        if (sVarA != null) {
            sVar.a(sVarA);
        }
    }

    public final e4 a(e4 e4Var, fa<VideoData> faVar, s sVar) {
        if (e4Var == null) {
            e4Var = e4.d();
        }
        b5<VideoData> b5Var = (b5) faVar.c().get(0);
        z3 z3VarNewBanner = z3.newBanner();
        z3VarNewBanner.setCtaText(b5Var.getCtaText());
        z3VarNewBanner.setVideoBanner(b5Var);
        z3VarNewBanner.setStyle(1);
        z3VarNewBanner.setTrackingLink(b5Var.getTrackingLink());
        z3VarNewBanner.setAdChoices(sVar.a());
        Boolean boolD = sVar.d();
        if (boolD != null) {
            b5Var.setAllowClose(boolD.booleanValue());
        }
        Boolean boolF = sVar.f();
        if (boolF != null) {
            b5Var.setAllowPause(boolF.booleanValue());
        }
        Boolean boolG = sVar.g();
        if (boolG != null) {
            b5Var.setAllowReplay(boolG.booleanValue());
        }
        Boolean boolQ = sVar.q();
        if (boolQ != null) {
            z3VarNewBanner.setDirectLink(boolQ.booleanValue());
        }
        Boolean boolX = sVar.x();
        if (boolX != null) {
            z3VarNewBanner.setOpenInBrowser(boolX.booleanValue());
        }
        float fE = sVar.e();
        if (fE >= 0.0f) {
            b5Var.setAllowCloseDelay(fE);
        }
        Iterator<u9> it = b5Var.getStatHolder().b(CampaignEx.JSON_NATIVE_VIDEO_CLICK).iterator();
        while (it.hasNext()) {
            z3VarNewBanner.getStatHolder().a(it.next());
        }
        e4Var.a(z3VarNewBanner);
        if (z3VarNewBanner.getOmData() == null) {
            z3VarNewBanner.setOmData(b5Var.getOmData());
        }
        Iterator<e1> it2 = b5Var.getCompanionBanners().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            e1 next = it2.next();
            p3 p3VarFromCompanion = null;
            if (next.getHtmlResource() != null) {
                p3VarFromCompanion = u3.fromCompanion(next);
            } else if (next.getStaticResource() != null) {
                p3VarFromCompanion = w3.fromCompanion(next);
            }
            if (p3VarFromCompanion != null) {
                z3VarNewBanner.setEndCard(p3VarFromCompanion);
                break;
            }
        }
        return e4Var;
    }

    public final e4 a(String str, s sVar, e4 e4Var, j jVar, o5.a aVar, o5 o5Var, List<String> list, n nVar, Context context) {
        m mVar;
        JSONObject jSONObjectOptJSONObject;
        e5 e5VarB;
        JSONObject jSONObjectA = o.a(str, aVar, o5Var, list, nVar);
        if (jSONObjectA == null) {
            mVar = m.j;
        } else {
            if (e4Var == null) {
                e4Var = e4.d();
            }
            this.f3935a = jSONObjectA.optString("mraid.js");
            JSONObject jSONObjectA2 = a(jSONObjectA, jVar.getFormat());
            if (jSONObjectA2 == null) {
                if (jVar.isMediationEnabled() && (jSONObjectOptJSONObject = jSONObjectA.optJSONObject("mediation")) != null && (e5VarB = l5.a(this, sVar, jVar, context).b(jSONObjectOptJSONObject, nVar)) != null) {
                    e4Var.a(e5VarB);
                }
                mVar = m.m;
            } else {
                JSONArray jSONArrayOptJSONArray = jSONObjectA2.optJSONArray("banners");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0);
                    if (jSONObjectOptJSONObject2 != null) {
                        if ("additionalData".equals(jSONObjectOptJSONObject2.optString("type", ""))) {
                            b(jSONObjectOptJSONObject2, sVar, jVar, nVar, context);
                        } else {
                            p3 p3VarA = q3.a(sVar, jVar, context).a(jSONObjectOptJSONObject2, this.f3935a, nVar);
                            if (p3VarA != null) {
                                e4Var.a(p3VarA);
                            }
                        }
                    }
                    return e4Var;
                }
                mVar = m.r;
            }
        }
        nVar.a(mVar);
        return e4Var;
    }

    public final e4 a(String str, s sVar, j jVar, e4 e4Var, n nVar) throws NumberFormatException {
        fa<VideoData> faVarA = fa.a(jVar, sVar);
        faVarA.c(str);
        if (!faVarA.c().isEmpty()) {
            return a(e4Var, faVarA, sVar);
        }
        nVar.a(m.l);
        return e4Var;
    }

    @Override // com.my.target.l5.a
    public q a(JSONObject jSONObject, s sVar, j jVar, n nVar, Context context) {
        p3 p3VarA = q3.a(sVar, jVar, context).a(jSONObject, this.f3935a, nVar);
        if (p3VarA == null) {
            nVar.a(m.r);
            return null;
        }
        e4 e4VarD = e4.d();
        e4VarD.a(p3VarA);
        return e4VarD;
    }

    public final JSONObject a(JSONObject jSONObject, String str) {
        if (!"fullscreen".equals(str) && !"rewarded".equals(str)) {
            return jSONObject.optJSONObject(str);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("fullscreen");
        return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject : jSONObject.optJSONObject("rewarded");
    }

    @Override // com.my.target.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e4 a(String str, s sVar, e4 e4Var, j jVar, o5.a aVar, o5 o5Var, List<String> list, n nVar, Context context) {
        return o.isVast(str) ? a(str, sVar, jVar, e4Var, nVar) : a(str, sVar, e4Var, jVar, aVar, o5Var, list, nVar, context);
    }
}
