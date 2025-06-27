package com.bytedance.sdk.component.adexpress.dynamic.Td;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DynamicLayoutUnit.java */
/* loaded from: classes2.dex */
public class QQ {
    private String EYQ;
    private Kbd HX;
    private float IPb;
    private float Kbd;
    private QQ MxO;
    private float Pm;
    private float QQ;
    private float Td;
    private float VwS;
    private float mZx;
    private boolean nWX;
    private String pi;
    private List<QQ> tp;
    private List<List<QQ>> tsL;
    private Map<String, String> KO = new HashMap();
    private Map<Integer, String> hu = new HashMap();

    public String EYQ() {
        return this.pi;
    }

    public void EYQ(String str) {
        this.pi = str;
    }

    public Map<Integer, String> mZx() {
        return this.hu;
    }

    public void EYQ(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    this.hu.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public String Td() {
        return this.EYQ;
    }

    public void mZx(String str) {
        this.EYQ = str;
    }

    public float Pm() {
        return this.Pm;
    }

    public void EYQ(float f) {
        this.Pm = f;
    }

    public float Kbd() {
        return this.Kbd;
    }

    public void mZx(float f) {
        this.Kbd = f;
    }

    public float IPb() {
        return this.mZx;
    }

    public void Td(float f) {
        this.mZx = f;
    }

    public float VwS() {
        return this.Td;
    }

    public void Pm(float f) {
        this.Td = f;
    }

    public float QQ() {
        return this.IPb;
    }

    public void Kbd(float f) {
        this.IPb = f;
    }

    public float HX() {
        return this.VwS;
    }

    public void IPb(float f) {
        this.VwS = f;
    }

    public void VwS(float f) {
        this.QQ = f;
    }

    public Kbd tp() {
        return this.HX;
    }

    public void EYQ(Kbd kbd) {
        this.HX = kbd;
    }

    public List<QQ> MxO() {
        return this.tp;
    }

    public void EYQ(List<QQ> list) {
        this.tp = list;
    }

    public void EYQ(QQ qq) {
        this.MxO = qq;
    }

    public QQ tsL() {
        return this.MxO;
    }

    public int pi() {
        IPb iPbKbd = this.HX.Kbd();
        return iPbKbd.wa() + iPbKbd.KR();
    }

    public int nWX() {
        IPb iPbKbd = this.HX.Kbd();
        return iPbKbd.Dal() + iPbKbd.wJ();
    }

    public float KO() {
        IPb iPbKbd = this.HX.Kbd();
        return pi() + iPbKbd.KO() + iPbKbd.hu() + (iPbKbd.tsL() * 2.0f);
    }

    public float hu() {
        IPb iPbKbd = this.HX.Kbd();
        return nWX() + iPbKbd.UB() + iPbKbd.nWX() + (iPbKbd.tsL() * 2.0f);
    }

    public void mZx(List<List<QQ>> list) {
        this.tsL = list;
    }

    public List<List<QQ>> UB() {
        return this.tsL;
    }

    public boolean Uc() {
        List<QQ> list = this.tp;
        return list == null || list.size() <= 0;
    }

    public boolean hYh() {
        return this.nWX;
    }

    public void EYQ(boolean z) {
        this.nWX = z;
    }

    public Map<String, String> zF() {
        return this.KO;
    }

    public void EYQ(String str, String str2) {
        this.KO.put(str, str2);
    }

    public void WU() {
        List<List<QQ>> list = this.tsL;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<QQ> list2 : this.tsL) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.tsL = arrayList;
    }

    public boolean XN() {
        return TextUtils.equals(this.HX.Kbd().lEs(), "flex");
    }

    public String NZ() {
        return this.HX.Kbd().NZ();
    }

    public void Td(String str) {
        this.HX.Kbd().IPb(str);
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.EYQ + "', x=" + this.mZx + ", y=" + this.Td + ", width=" + this.IPb + ", height=" + this.VwS + ", remainWidth=" + this.QQ + ", rootBrick=" + this.HX + ", childrenBrickUnits=" + this.tp + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean tPj() {
        return this.HX.Kbd().BQ() < 0 || this.HX.Kbd().aEX() < 0 || this.HX.Kbd().CsQ() < 0 || this.HX.Kbd().wG() < 0;
    }

    public String EYQ(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.HX.mZx());
        sb.append(":");
        sb.append(this.EYQ);
        if (this.HX.Kbd() != null) {
            sb.append(":");
            sb.append(this.HX.Kbd().rM());
        }
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }
}
