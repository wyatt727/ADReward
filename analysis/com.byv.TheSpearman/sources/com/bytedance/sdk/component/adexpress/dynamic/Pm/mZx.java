package com.bytedance.sdk.component.adexpress.dynamic.Pm;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ComputeRuler.java */
/* loaded from: classes2.dex */
public class mZx {
    private pi HX;
    private int IPb;
    private double Kbd;
    private String QQ;
    private double VwS;
    public Map<String, Td> EYQ = new HashMap();
    public Map<String, Td> mZx = new HashMap();
    public Map<String, Td> Td = new HashMap();
    private double Pm = Math.random();

    public mZx(double d, int i, double d2, String str, pi piVar) {
        this.Kbd = d;
        this.IPb = i;
        this.VwS = d2;
        this.QQ = str;
        this.HX = piVar;
    }

    public Td EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq, float f, float f2) {
        float f3;
        if (TextUtils.isEmpty(qq.tp().Td()) && qq.tp().Kbd().Dd() == null && (qq.tp().Kbd().OnO() == null || TextUtils.isEmpty(qq.tp().Kbd().OnO().optString(com.bytedance.sdk.component.adexpress.Pm.IPb.Td(com.bytedance.sdk.component.adexpress.Pm.EYQ()))))) {
            return new Td(0.0f, 0.0f);
        }
        if (TextUtils.equals(qq.tp().mZx(), "creative-playable-bait")) {
            return new Td(0.0f, 0.0f);
        }
        float fQQ = qq.QQ();
        float fHX = qq.HX();
        com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbKbd = qq.tp().Kbd();
        String strLEs = iPbKbd.lEs();
        String strRfB = iPbKbd.rfB();
        float fPi = qq.pi();
        float fNWX = qq.nWX();
        float fKO = qq.KO();
        float fHu = qq.hu();
        if (TextUtils.equals(strLEs, "fixed")) {
            f = Math.min(fQQ, f);
            if (TextUtils.equals(strRfB, "auto")) {
                f3 = mZx(qq, f - fKO, f2 - fHu).mZx;
                fHX = f3 + fHu;
            }
        } else if (TextUtils.equals(strLEs, "auto")) {
            Td tdMZx = mZx(qq, f - fKO, f2 - fHu);
            f = tdMZx.EYQ + fKO;
            if (TextUtils.equals(strRfB, "auto")) {
                f3 = tdMZx.mZx;
                fHX = f3 + fHu;
            }
        } else if (!TextUtils.equals(strLEs, "flex")) {
            f = fQQ;
        } else if (TextUtils.equals(strRfB, "auto")) {
            f3 = mZx(qq, f - fKO, f2 - fHu).mZx;
            fHX = f3 + fHu;
        }
        if (TextUtils.equals(strRfB, "scale")) {
            float fRound = Math.round((f - fPi) / fHX) + fNWX;
            if (fRound > f2) {
                f = Math.round((f2 - fNWX) * fHX) + fPi;
            } else {
                f2 = fRound;
            }
        } else if (TextUtils.equals(strRfB, "fixed")) {
            f2 = Math.min(fHX + fNWX, f2);
        } else if (!TextUtils.equals(strRfB, "flex")) {
            f2 = fHX;
        }
        Td td = new Td();
        td.EYQ = f;
        td.mZx = f2;
        return td;
    }

    public Td mZx(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq, float f, float f2) {
        Td td = new Td();
        if (qq.tp().Kbd() == null) {
            return td;
        }
        Td tdKbd = Kbd(qq, f, f2);
        float f3 = tdKbd.EYQ;
        float f4 = tdKbd.mZx;
        td.EYQ = Math.min(f3, f);
        td.mZx = Math.min(f4, f2);
        return td;
    }

    private Td Kbd(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq, float f, float f2) {
        String str = qq.Td() + "_" + f + "_" + f2;
        if (this.Td.containsKey(str)) {
            return this.Td.get(str);
        }
        Td tdIPb = IPb(qq, f, f2);
        this.Td.put(str, tdIPb);
        return tdIPb;
    }

    private Td IPb(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq, float f, float f2) {
        new Td();
        com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbKbd = qq.tp().Kbd();
        qq.tp().Td();
        iPbKbd.OtA();
        float fUc = iPbKbd.Uc();
        int iTQF = iPbKbd.TQF();
        double dNa = iPbKbd.na();
        int iTZn = iPbKbd.TZn();
        boolean zLRN = iPbKbd.lRN();
        boolean zVOV = iPbKbd.VOV();
        int iXPd = iPbKbd.XPd();
        C0092mZx c0092mZx = new C0092mZx();
        c0092mZx.EYQ = fUc;
        c0092mZx.mZx = iTQF;
        c0092mZx.Td = iTZn;
        c0092mZx.Pm = dNa;
        c0092mZx.Kbd = f;
        if (!TextUtils.isEmpty(qq.tp().Td())) {
            return EYQ(qq.tp().Td(), c0092mZx, zLRN, zVOV, iXPd, qq);
        }
        JSONObject jSONObjectOnO = iPbKbd.OnO();
        return EYQ(jSONObjectOnO != null ? jSONObjectOnO.optString(com.bytedance.sdk.component.adexpress.Pm.IPb.Td(com.bytedance.sdk.component.adexpress.Pm.EYQ())) : "", c0092mZx, zLRN, zVOV, iXPd, qq);
    }

    private Td EYQ(String str, C0092mZx c0092mZx, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) throws JSONException {
        return MxO.EYQ(str, qq.tp().mZx(), C0092mZx.EYQ(c0092mZx).toString(), z, z2, i, qq, this.Kbd, this.IPb, this.VwS, this.QQ, this.HX);
    }

    public Td Td(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq, float f, float f2) {
        if (qq == null) {
            return null;
        }
        Td tdEYQ = EYQ(qq);
        if (tdEYQ != null && (tdEYQ.EYQ != 0.0f || tdEYQ.mZx != 0.0f)) {
            return tdEYQ;
        }
        Td tdPm = Pm(qq, f, f2);
        EYQ(qq, tdPm);
        return tdPm;
    }

    public Td Pm(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq, float f, float f2) {
        float fMin;
        Td td = new Td();
        float f3 = 0.0f;
        if (f2 <= 0.0f || f <= 0.0f) {
            td.EYQ = 0.0f;
            td.mZx = 0.0f;
            return td;
        }
        if (qq.Uc()) {
            return EYQ(qq, f, f2);
        }
        float fQQ = qq.QQ();
        float fHX = qq.HX();
        float fKO = qq.KO();
        float fHu = qq.hu();
        com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbKbd = qq.tp().Kbd();
        String strLEs = iPbKbd.lEs();
        String strRfB = iPbKbd.rfB();
        float fMin2 = ((TextUtils.equals(strLEs, "flex") || TextUtils.equals(strLEs, "auto")) ? f : Math.min(fQQ, f)) - fKO;
        if (TextUtils.equals(strRfB, "scale")) {
            fMin = Math.round(fMin2 / fHX) + fHu;
            if (fMin > f2) {
                fMin2 = Math.round((f2 - fHu) * fHX);
            }
        } else {
            fMin = (TextUtils.equals(strRfB, "auto") || TextUtils.equals(strRfB, "flex")) ? f2 : Math.min(fHX, f2);
        }
        float f4 = fMin - fHu;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> listUB = qq.UB();
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> it = listUB.iterator();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        while (it.hasNext()) {
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> it2 = it;
            List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> next = it.next();
            Td td2 = td;
            Td tdMZx = mZx(next, fMin2, f4);
            if (mZx(next)) {
                f3 += 1.0f;
            } else {
                fMax = Math.max(fMax, tdMZx.EYQ);
            }
            float f5 = f3;
            if (qq.tp().mZx().equals("carousel")) {
                fMax2 = Math.max(qq.HX(), tdMZx.mZx);
            } else {
                fMax2 += tdMZx.mZx;
            }
            td = td2;
            it = it2;
            f3 = f5;
        }
        Td td3 = td;
        if (TextUtils.equals(strLEs, "auto")) {
            if (f3 == listUB.size()) {
                fMin2 = f;
            } else {
                for (List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list : listUB) {
                    Td(list);
                    mZx(list, fMax, f4);
                }
                fMin2 = fMax;
            }
        }
        if (TextUtils.equals(strRfB, "auto")) {
            if (fMax2 <= f2) {
                f4 = fMax2;
            } else {
                EYQ(listUB, fMin2, f4);
            }
        } else if ((TextUtils.equals(strRfB, "fixed") || TextUtils.equals(strRfB, "flex")) && f4 < fMax2) {
            EYQ(listUB, fMin2, f4);
        }
        td3.EYQ = Math.min(fMin2 + fKO, f);
        td3.mZx = Math.min(f4 + fHu, f2);
        return td3;
    }

    private void EYQ(List<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (EYQ(it.next(), false)) {
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list2 : list) {
            EYQ eyq = new EYQ();
            boolean zEYQ = EYQ(list2, !z);
            eyq.EYQ = zEYQ ? 1.0f : mZx(list2, f, f2).mZx;
            eyq.mZx = !zEYQ;
            arrayList.add(eyq);
        }
        List<EYQ> listEYQ = tp.EYQ(f2, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((EYQ) arrayList.get(i)).EYQ != listEYQ.get(i).EYQ) {
                List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list3 = list.get(i);
                Td(list3);
                mZx(list3, f, listEYQ.get(i).EYQ);
            }
        }
    }

    private boolean mZx(List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list) {
        boolean z;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> listUB;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (TextUtils.equals(it.next().tp().Kbd().lEs(), "flex")) {
                z = true;
                break;
            }
        }
        if (z) {
            return true;
        }
        while (true) {
            boolean z2 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq : list) {
                if (TextUtils.equals(qq.tp().Kbd().lEs(), "auto") && (listUB = qq.UB()) != null) {
                    int i = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list2 : listUB) {
                        i++;
                        if (!mZx(list2)) {
                            break;
                        }
                        if (i == list2.size()) {
                            z2 = true;
                        }
                    }
                }
            }
            return z2;
        }
    }

    private Td mZx(List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list, float f, float f2) {
        Td tdEYQ = EYQ(list);
        if (tdEYQ != null && (tdEYQ.EYQ != 0.0f || tdEYQ.mZx != 0.0f)) {
            return tdEYQ;
        }
        Td Td2 = Td(list, f, f2);
        EYQ(list, Td2);
        return Td2;
    }

    private Td Td(List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list, float f, float f2) {
        float fMax;
        Pm(list);
        Td td = new Td();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq : list) {
            com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbKbd = qq.tp().Kbd();
            if (iPbKbd.Nuq() == 1 || iPbKbd.Nuq() == 2) {
                arrayList.add(qq);
            }
            if (iPbKbd.Nuq() != 1 && iPbKbd.Nuq() != 2) {
                arrayList2.add(qq);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Td((com.bytedance.sdk.component.adexpress.dynamic.Td.QQ) it.next(), f, f2);
        }
        if (arrayList2.size() <= 0) {
            return td;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(Td(it2.next(), f, f2).EYQ));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq2 = arrayList2.get(i);
            String strLEs = qq2.tp().Kbd().lEs();
            float fQQ = qq2.QQ();
            boolean zEquals = TextUtils.equals(strLEs, "flex");
            if (TextUtils.equals(strLEs, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> listUB = qq2.UB();
                if (listUB == null || listUB.size() <= 0) {
                    zEquals = false;
                } else {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> it3 = listUB.iterator();
                    while (it3.hasNext()) {
                        if (mZx(it3.next())) {
                            zEquals = true;
                            break;
                        }
                    }
                    zEquals = false;
                }
            }
            EYQ eyq = new EYQ();
            if (!zEquals) {
                fQQ = ((Float) arrayList3.get(i)).floatValue();
            }
            eyq.EYQ = fQQ;
            eyq.mZx = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i)).floatValue();
            }
            eyq.Td = fMax;
            arrayList4.add(eyq);
            i++;
        }
        EYQ(arrayList4, f, arrayList2);
        List<EYQ> listEYQ = tp.EYQ(f, arrayList4);
        float f3 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f3 += listEYQ.get(i2).EYQ;
            if (((Float) arrayList3.get(i2)).floatValue() != listEYQ.get(i2).EYQ) {
                Pm(arrayList2.get(i2));
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> it4 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            i3++;
            if (!mZx(it4.next())) {
                z = false;
                break;
            }
            if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        fMax = z ? f2 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq3 = arrayList2.get(i4);
            Td Td2 = Td(qq3, listEYQ.get(i4).EYQ, f2);
            if (!mZx(qq3)) {
                fMax = Math.max(fMax, Td2.mZx);
            }
            arrayList5.add(Td2);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((Td) it5.next()).mZx));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq4 = arrayList2.get(i5);
                if (mZx(qq4) && ((Float) arrayList6.get(i5)).floatValue() != fMax) {
                    Pm(qq4);
                    Td(qq4, listEYQ.get(i5).EYQ, fMax);
                }
            }
        }
        td.EYQ = f3;
        td.mZx = fMax;
        return td;
    }

    private boolean mZx(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) {
        if (qq == null) {
            return false;
        }
        if (TextUtils.equals(qq.tp().Kbd().rfB(), "flex")) {
            return true;
        }
        return Td(qq);
    }

    private boolean Td(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> listUB;
        if (!qq.Uc() && TextUtils.equals(qq.tp().Kbd().rfB(), "auto") && (listUB = qq.UB()) != null && listUB.size() > 0) {
            if (listUB.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> it = listUB.get(0).iterator();
                while (it.hasNext()) {
                    if (!mZx(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> it2 = listUB.iterator();
            while (it2.hasNext()) {
                if (EYQ(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean EYQ(List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list, boolean z) {
        boolean z2;
        for (com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq : list) {
            com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbKbd = qq.tp().Kbd();
            String strRfB = iPbKbd.rfB();
            if (TextUtils.equals(strRfB, "flex") || (z && ((TextUtils.equals(iPbKbd.lEs(), "flex") && TextUtils.equals(iPbKbd.rfB(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.Td.Kbd.EYQ.get(qq.tp().mZx()).intValue() == 7) || TextUtils.equals(strRfB, "flex")))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (z2) {
            return true;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> it = list.iterator();
        while (it.hasNext()) {
            if (Td(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void EYQ(List<EYQ> list, float f, List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list2) {
        float f2 = 0.0f;
        for (EYQ eyq : list) {
            if (eyq.mZx) {
                f2 += eyq.EYQ;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).mZx && list2.get(i2).XN()) {
                    i++;
                }
            }
            if (i > 0) {
                float fCeil = (float) (Math.ceil(((f2 - f) / i) * 1000.0f) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    EYQ eyq2 = list.get(i3);
                    if (eyq2.mZx && list2.get(i3).XN()) {
                        eyq2.EYQ -= fCeil;
                    }
                }
            }
        }
    }

    public void EYQ() {
        this.Td.clear();
        this.EYQ.clear();
        this.mZx.clear();
    }

    public Td EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) {
        return this.EYQ.get(Kbd(qq));
    }

    public Td EYQ(List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list) {
        return this.mZx.get(Pm(list));
    }

    private void Pm(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) {
        this.EYQ.remove(Kbd(qq));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> listUB = qq.UB();
        if (listUB == null || listUB.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>> it = listUB.iterator();
        while (it.hasNext()) {
            Td(it.next());
        }
    }

    private void Td(List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.mZx.remove(Pm(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> it = list.iterator();
        while (it.hasNext()) {
            Pm(it.next());
        }
    }

    private String Kbd(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) {
        return qq.Td();
    }

    private String Pm(List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String strTd = list.get(i).Td();
            if (i < list.size() - 1) {
                sb.append(strTd);
                sb.append("-");
            } else {
                sb.append(strTd);
            }
        }
        return sb.toString();
    }

    private void EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq, Td td) {
        this.EYQ.put(Kbd(qq), td);
    }

    private void EYQ(List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> list, Td td) {
        this.mZx.put(Pm(list), td);
    }

    /* compiled from: ComputeRuler.java */
    static class Td {
        float EYQ;
        float mZx;

        public Td() {
        }

        public Td(float f, float f2) {
            this.EYQ = f;
            this.mZx = f2;
        }

        public String toString() {
            return "UnitSize{width=" + this.EYQ + ", height=" + this.mZx + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* compiled from: ComputeRuler.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.Pm.mZx$mZx, reason: collision with other inner class name */
    static class C0092mZx {
        float EYQ;
        float Kbd;
        double Pm;
        int Td;
        int mZx;

        C0092mZx() {
        }

        static JSONObject EYQ(C0092mZx c0092mZx) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0092mZx.EYQ);
                jSONObject.put("letterSpacing", c0092mZx.mZx);
                jSONObject.put("lineHeight", c0092mZx.Pm);
                jSONObject.put("maxWidth", c0092mZx.Kbd);
                jSONObject.put("fontWeight", c0092mZx.Td);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* compiled from: ComputeRuler.java */
    static class EYQ implements Cloneable {
        float EYQ;
        float Td;
        boolean mZx;

        EYQ() {
        }

        public Object clone() {
            try {
                return (EYQ) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }
}
