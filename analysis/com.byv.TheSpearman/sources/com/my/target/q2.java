package com.my.target;

import android.content.Context;
import com.my.target.common.models.VideoData;
import com.my.target.o5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class q2 extends o<s2> {
    public static o<s2> a() {
        return new q2();
    }

    public static s2 a(String str, s sVar, s2 s2Var, j jVar, n nVar) throws NumberFormatException {
        fa faVarA = fa.a(jVar, sVar);
        faVarA.c(str);
        String strU = sVar.u();
        if (strU == null) {
            strU = "preroll";
        }
        if (s2Var == null) {
            s2Var = s2.e();
        }
        h3 h3VarA = s2Var.a(strU);
        if (h3VarA == null) {
            return s2Var;
        }
        if (faVarA.c().isEmpty()) {
            nVar.a(m.l);
            s sVarD = faVarA.d();
            if (sVarD != null) {
                sVarD.e(h3VarA.h());
                int iA = sVar.A();
                if (iA < 0) {
                    iA = h3VarA.a();
                }
                sVarD.d(iA);
                h3VarA.a(sVarD);
            }
        } else {
            a(faVarA, h3VarA, sVar);
        }
        return s2Var;
    }

    public static s2 a(String str, s sVar, s2 s2Var, j jVar, o5.a aVar, o5 o5Var, List<String> list, n nVar, Context context) {
        m mVar;
        JSONObject jSONObjectA = o.a(str, aVar, o5Var, list, nVar);
        if (jSONObjectA == null) {
            mVar = m.j;
        } else {
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(jVar.getFormat());
            if (jSONObjectOptJSONObject == null) {
                mVar = m.m;
            } else {
                if (s2Var == null) {
                    s2Var = s2.e();
                }
                t2.a().a(jSONObjectOptJSONObject, s2Var);
                y yVarA = y.a(sVar, jVar, context);
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("sections");
                if (jSONObjectOptJSONObject2 != null) {
                    String strU = sVar.u();
                    if (strU != null) {
                        h3 h3VarA = s2Var.a(strU);
                        if (h3VarA != null) {
                            a(jSONObjectOptJSONObject2, yVarA, h3VarA, d1.a(sVar, jVar, context), c1.a(sVar, jVar, context), sVar, nVar);
                        }
                    } else {
                        Iterator<h3> it = s2Var.c().iterator();
                        while (it.hasNext()) {
                            a(jSONObjectOptJSONObject2, yVarA, it.next(), d1.a(sVar, jVar, context), c1.a(sVar, jVar, context), sVar, nVar);
                        }
                    }
                    return s2Var;
                }
                mVar = m.i;
            }
        }
        nVar.a(mVar);
        return s2Var;
    }

    public static void a(fa<VideoData> faVar, h3 h3Var, s sVar) {
        int iA = sVar.A();
        Iterator it = faVar.c().iterator();
        while (it.hasNext()) {
            b5 b5Var = (b5) it.next();
            Boolean boolD = sVar.d();
            if (boolD != null) {
                b5Var.setAllowClose(boolD.booleanValue());
            }
            Boolean boolF = sVar.f();
            if (boolF != null) {
                b5Var.setAllowPause(boolF.booleanValue());
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
            float fE = sVar.e();
            if (fE >= 0.0f) {
                b5Var.setAllowCloseDelay(fE);
            }
            b5Var.setCloseActionText("Close");
            b5Var.setPoint(sVar.y());
            b5Var.setPointP(sVar.z());
            if (iA >= 0) {
                h3Var.a(b5Var, iA);
                iA++;
            } else {
                h3Var.a(b5Var);
            }
        }
    }

    public static void a(s sVar, y yVar, JSONObject jSONObject, h3 h3Var, ArrayList<s> arrayList, ArrayList<s> arrayList2, n nVar) {
        s sVarA = yVar.a(jSONObject, nVar);
        if (sVarA == null) {
            return;
        }
        sVarA.e(h3Var.h());
        sVarA.a(sVar.a());
        if (sVarA.r() != -1) {
            arrayList2.add(sVarA);
            return;
        }
        arrayList.add(sVarA);
        if (!sVarA.H() && !sVarA.F()) {
            sVar.a(sVarA);
            int iA = sVar.A();
            if (iA < 0) {
                iA = h3Var.a();
            }
            sVarA.d(iA);
        }
        h3Var.a(sVarA);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[PHI: r0
      0x00a3: PHI (r0v7 ??) = (r0v6 ??), (r0v9 ??) binds: [B:36:0x00a1, B:25:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[PHI: r0
      0x00aa: PHI (r0v8 ??) = (r0v6 ??), (r0v9 ??) binds: [B:36:0x00a1, B:25:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.my.target.b5, com.my.target.f0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.my.target.f0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.my.target.f0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.my.target.f0, com.my.target.ja] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.my.target.h3] */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.my.target.d1] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.my.target.c1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(org.json.JSONObject r13, com.my.target.y r14, com.my.target.h3 r15, com.my.target.d1 r16, com.my.target.c1 r17, com.my.target.s r18, com.my.target.n r19) {
        /*
            r7 = r15
            java.lang.String r0 = r15.h()
            r1 = r13
            org.json.JSONArray r8 = r13.optJSONArray(r0)
            if (r8 != 0) goto Ld
            return
        Ld:
            int r0 = r18.A()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r1 = 0
            r11 = r0
            r12 = r1
        L1e:
            int r0 = r8.length()
            if (r12 >= r0) goto Lb1
            org.json.JSONObject r2 = r8.optJSONObject(r12)
            if (r2 != 0) goto L30
        L2a:
            r4 = r16
            r3 = r17
            goto Lad
        L30:
            java.lang.String r0 = "type"
            java.lang.String r0 = r2.optString(r0)
            java.lang.String r1 = "additionalData"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4a
            r0 = r18
            r1 = r14
            r3 = r15
            r4 = r10
            r5 = r9
            r6 = r19
            a(r0, r1, r2, r3, r4, r5, r6)
            goto L2a
        L4a:
            java.lang.String r1 = "video-motion"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L7d
            com.my.target.ja r0 = com.my.target.ja.newBanner()
            r3 = r17
            boolean r2 = r3.a(r2, r0)
            if (r2 == 0) goto L7a
            float r2 = r18.y()
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 < 0) goto L6a
            r0.setPoint(r2)
        L6a:
            float r2 = r18.z()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L75
            r0.setPointP(r2)
        L75:
            r4 = r16
            if (r11 < 0) goto Laa
            goto La3
        L7a:
            r4 = r16
            goto Lad
        L7d:
            r3 = r17
            com.my.target.b5 r0 = com.my.target.b5.newVideoBanner()
            r4 = r16
            boolean r2 = r4.a(r2, r0)
            if (r2 == 0) goto Lad
            float r2 = r18.y()
            int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r5 < 0) goto L96
            r0.setPoint(r2)
        L96:
            float r2 = r18.z()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto La1
            r0.setPointP(r2)
        La1:
            if (r11 < 0) goto Laa
        La3:
            int r1 = r11 + 1
            r15.a(r0, r11)
            r11 = r1
            goto Lad
        Laa:
            r15.a(r0)
        Lad:
            int r12 = r12 + 1
            goto L1e
        Lb1:
            a(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.q2.a(org.json.JSONObject, com.my.target.y, com.my.target.h3, com.my.target.d1, com.my.target.c1, com.my.target.s, com.my.target.n):void");
    }

    @Override // com.my.target.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s2 a(String str, s sVar, s2 s2Var, j jVar, o5.a aVar, o5 o5Var, List<String> list, n nVar, Context context) {
        return o.isVast(str) ? a(str, sVar, s2Var, jVar, nVar) : a(str, sVar, s2Var, jVar, aVar, o5Var, list, nVar, context);
    }
}
