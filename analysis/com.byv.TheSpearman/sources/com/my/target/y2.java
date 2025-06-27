package com.my.target;

import android.content.Context;
import com.my.target.common.models.AudioData;
import com.my.target.o5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class y2 extends o<a3> {
    public static a3 a(String str, s sVar, a3 a3Var, j jVar, n nVar) throws NumberFormatException {
        fa faVarA = fa.a(jVar, sVar);
        faVarA.c(str);
        String strU = sVar.u();
        if (strU == null) {
            strU = "preroll";
        }
        if (a3Var == null) {
            a3Var = a3.e();
        }
        c5<AudioData> c5VarA = a3Var.a(strU);
        if (c5VarA == null) {
            return a3Var;
        }
        if (faVarA.c().isEmpty()) {
            nVar.a(m.l);
            s sVarD = faVarA.d();
            if (sVarD != null) {
                sVarD.e(c5VarA.h());
                int iA = sVar.A();
                if (iA < 0) {
                    iA = c5VarA.a();
                }
                sVarD.d(iA);
                c5VarA.a(sVarD);
            }
        } else {
            a(faVarA, c5VarA, sVar);
        }
        return a3Var;
    }

    public static a3 a(String str, s sVar, a3 a3Var, j jVar, o5.a aVar, o5 o5Var, List<String> list, n nVar, Context context) {
        m mVar;
        JSONObject jSONObjectA = o.a(str, aVar, o5Var, list, nVar);
        if (jSONObjectA == null) {
            mVar = m.j;
        } else {
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(jVar.getFormat());
            if (jSONObjectOptJSONObject == null) {
                mVar = m.m;
            } else {
                if (a3Var == null) {
                    a3Var = a3.e();
                }
                b3.a().a(jSONObjectOptJSONObject, a3Var);
                y yVarA = y.a(sVar, jVar, context);
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("sections");
                if (jSONObjectOptJSONObject2 != null) {
                    String strU = sVar.u();
                    if (strU != null) {
                        c5<AudioData> c5VarA = a3Var.a(strU);
                        if (c5VarA != null) {
                            a(jSONObjectOptJSONObject2, yVarA, c5VarA, d0.a(sVar, jVar, context), sVar, nVar);
                        }
                    } else {
                        Iterator<c5<AudioData>> it = a3Var.c().iterator();
                        while (it.hasNext()) {
                            a(jSONObjectOptJSONObject2, yVarA, it.next(), d0.a(sVar, jVar, context), sVar, nVar);
                        }
                    }
                    return a3Var;
                }
                mVar = m.i;
            }
        }
        nVar.a(mVar);
        return a3Var;
    }

    public static o<a3> a() {
        return new y2();
    }

    public static void a(fa<AudioData> faVar, c5<AudioData> c5Var, s sVar) {
        int iA = sVar.A();
        Iterator it = faVar.c().iterator();
        while (it.hasNext()) {
            b5<T> b5Var = (b5) it.next();
            float fE = sVar.e();
            if (fE >= 0.0f) {
                b5Var.setAllowCloseDelay(fE);
            }
            c cVarA = sVar.a();
            if (cVarA != null) {
                b5Var.setAdChoices(cVarA);
            }
            String strB = sVar.b();
            if (strB != null) {
                b5Var.setAdvertisingLabel(strB);
            }
            Boolean boolD = sVar.d();
            if (boolD != null) {
                b5Var.setAllowClose(boolD.booleanValue());
            }
            Boolean boolF = sVar.f();
            if (boolF != null) {
                b5Var.setAllowPause(boolF.booleanValue());
            }
            Boolean boolH = sVar.h();
            if (boolH != null) {
                b5Var.setAllowSeek(boolH.booleanValue());
            }
            Boolean boolI = sVar.i();
            if (boolI != null) {
                b5Var.setAllowSkip(boolI.booleanValue());
            }
            Boolean boolJ = sVar.j();
            if (boolJ != null) {
                b5Var.setAllowTrackChange(boolJ.booleanValue());
            }
            Boolean boolQ = sVar.q();
            if (boolQ != null) {
                b5Var.setDirectLink(boolQ.booleanValue());
            }
            Boolean boolX = sVar.x();
            if (boolX != null) {
                b5Var.setOpenInBrowser(boolX.booleanValue());
            }
            Boolean boolG = sVar.g();
            if (boolG != null) {
                b5Var.setAllowReplay(boolG.booleanValue());
            }
            b5Var.setCloseActionText("Close");
            float fY = sVar.y();
            if (fY >= 0.0f) {
                b5Var.setPoint(fY);
            }
            float fZ = sVar.z();
            if (fZ >= 0.0f) {
                b5Var.setPointP(fZ);
            }
            if (iA >= 0) {
                c5Var.a(b5Var, iA);
                iA++;
            } else {
                c5Var.a(b5Var);
            }
        }
    }

    public static void a(s sVar, y yVar, JSONObject jSONObject, c5 c5Var, ArrayList<s> arrayList, ArrayList<s> arrayList2, n nVar) {
        s sVarA = yVar.a(jSONObject, nVar);
        if (sVarA == null) {
            return;
        }
        sVarA.e(c5Var.h());
        if (sVarA.r() != -1) {
            arrayList2.add(sVarA);
            return;
        }
        arrayList.add(sVarA);
        if (!sVarA.H() && !sVarA.F()) {
            sVar.a(sVarA);
            int iA = sVar.A();
            if (iA < 0) {
                iA = c5Var.a();
            }
            sVarA.d(iA);
        }
        c5Var.a(sVarA);
    }

    public static void a(ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        Iterator<s> it = arrayList2.iterator();
        while (it.hasNext()) {
            s next = it.next();
            Iterator<s> it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    s next2 = it2.next();
                    if (next.r() == next2.s()) {
                        next2.b(next);
                        break;
                    }
                }
            }
        }
    }

    public static void a(JSONObject jSONObject, y yVar, c5<AudioData> c5Var, d0 d0Var, s sVar, n nVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(c5Var.h());
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int iA = sVar.A();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = iA;
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                if ("additionalData".equals(jSONObjectOptJSONObject.optString("type"))) {
                    a(sVar, yVar, jSONObjectOptJSONObject, c5Var, arrayList2, arrayList, nVar);
                } else {
                    b5<AudioData> b5VarNewAudioBanner = b5.newAudioBanner();
                    if (d0Var.b(jSONObjectOptJSONObject, b5VarNewAudioBanner)) {
                        if (sVar.H()) {
                            b5VarNewAudioBanner.setPoint(sVar.y());
                            b5VarNewAudioBanner.setPointP(sVar.z());
                        }
                        if (i >= 0) {
                            c5Var.a(b5VarNewAudioBanner, i);
                            i++;
                        } else {
                            c5Var.a(b5VarNewAudioBanner);
                        }
                    }
                }
            }
        }
        a((ArrayList<s>) arrayList2, (ArrayList<s>) arrayList);
    }

    @Override // com.my.target.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a3 a(String str, s sVar, a3 a3Var, j jVar, o5.a aVar, o5 o5Var, List<String> list, n nVar, Context context) {
        return o.isVast(str) ? a(str, sVar, a3Var, jVar, nVar) : a(str, sVar, a3Var, jVar, aVar, o5Var, list, nVar, context);
    }
}
