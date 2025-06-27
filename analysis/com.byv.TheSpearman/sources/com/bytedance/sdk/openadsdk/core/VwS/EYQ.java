package com.bytedance.sdk.openadsdk.core.VwS;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.UB;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastAdConfig.java */
/* loaded from: classes2.dex */
public class EYQ {
    private int HX;
    private String IPb;
    private String KO;
    private String Kbd;
    private String MxO;
    private String Pm;
    private double QQ;
    Td Td;
    private String VwS;
    mZx mZx;
    private int tp;
    Pm EYQ = new Pm(this);
    private final Set<tp> tsL = new HashSet();
    private String pi = "VAST_ACTION_BUTTON";
    private boolean nWX = false;

    public Pm EYQ() {
        return this.EYQ;
    }

    public mZx mZx() {
        return this.mZx;
    }

    public Td Td() {
        return this.Td;
    }

    public String Pm() {
        return this.Pm;
    }

    public String Kbd() {
        return this.Kbd;
    }

    public String IPb() {
        return this.IPb;
    }

    public String VwS() {
        return this.VwS;
    }

    public void EYQ(mZx mzx) {
        if (mzx != null) {
            mzx.EYQ(this.VwS);
        }
        this.mZx = mzx;
    }

    public void EYQ(Td td) {
        if (td != null) {
            td.EYQ(this.VwS);
        }
        this.Td = td;
    }

    public void EYQ(String str) {
        this.Pm = str;
    }

    public void mZx(String str) {
        this.Kbd = str;
    }

    public void Td(String str) {
        this.IPb = str;
    }

    public void Pm(String str) {
        this.VwS = str;
    }

    public double QQ() {
        return this.QQ;
    }

    public void EYQ(double d) {
        this.QQ = d;
    }

    public String HX() {
        Td td;
        String str = this.IPb;
        if (!TextUtils.isEmpty(this.KO)) {
            String str2 = this.KO;
            this.KO = null;
            return str2;
        }
        String str3 = this.pi;
        str3.hashCode();
        if (str3.equals("VAST_ICON")) {
            mZx mzx = this.mZx;
            if (mzx != null && !TextUtils.isEmpty(mzx.QQ)) {
                str = this.mZx.QQ;
            }
        } else if (str3.equals("VAST_END_CARD") && (td = this.Td) != null && !TextUtils.isEmpty(td.QQ)) {
            str = this.Td.QQ;
        }
        this.pi = "VAST_ACTION_BUTTON";
        return str;
    }

    public void Kbd(String str) {
        this.pi = str;
    }

    public JSONObject tp() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.EYQ.EYQ());
        mZx mzx = this.mZx;
        if (mzx != null) {
            jSONObject.put("vastIcon", mzx.EYQ());
        }
        Td td = this.Td;
        if (td != null) {
            jSONObject.put("endCard", td.EYQ());
        }
        jSONObject.put("title", this.Pm);
        jSONObject.put("description", this.Kbd);
        jSONObject.put("clickThroughUrl", this.IPb);
        jSONObject.put("videoUrl", this.VwS);
        jSONObject.put("videDuration", this.QQ);
        jSONObject.put("tag", this.MxO);
        jSONObject.put("videoWidth", this.HX);
        jSONObject.put("videoHeight", this.tp);
        jSONObject.put("viewabilityVendor", hu());
        return jSONObject;
    }

    private JSONArray hu() {
        JSONArray jSONArray = new JSONArray();
        for (tp tpVar : this.tsL) {
            if (tpVar != null) {
                jSONArray.put(tpVar.Pm());
            }
        }
        return jSONArray;
    }

    public static EYQ EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        EYQ eyq = new EYQ();
        eyq.EYQ.EYQ(jSONObject.optJSONObject("videoTrackers"));
        eyq.mZx = mZx.EYQ(jSONObject.optJSONObject("vastIcon"));
        eyq.Td = Td.mZx(jSONObject.optJSONObject("endCard"));
        eyq.Pm = jSONObject.optString("title");
        eyq.Kbd = jSONObject.optString("description");
        eyq.IPb = jSONObject.optString("clickThroughUrl");
        eyq.VwS = jSONObject.optString("videoUrl");
        eyq.QQ = jSONObject.optDouble("videDuration");
        eyq.MxO = jSONObject.optString("tag");
        eyq.HX = jSONObject.optInt("videoWidth");
        eyq.HX = jSONObject.optInt("videoHeight");
        eyq.tsL.addAll(tp.EYQ(jSONObject.optJSONArray("viewabilityVendor")));
        return eyq;
    }

    public void EYQ(UB ub) {
        this.EYQ.EYQ(ub);
        mZx mzx = this.mZx;
        if (mzx != null) {
            mzx.EYQ(ub);
        }
        Td td = this.Td;
        if (td != null) {
            td.EYQ(ub);
        }
    }

    public String MxO() {
        return this.MxO;
    }

    public void IPb(String str) {
        this.MxO = str;
        this.EYQ.EYQ(str);
    }

    public void EYQ(int i) {
        this.HX = i;
    }

    public void mZx(int i) {
        this.tp = i;
    }

    public int tsL() {
        return this.HX;
    }

    public int pi() {
        return this.tp;
    }

    public void EYQ(Set<tp> set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        this.tsL.addAll(set);
    }

    public Set<tp> nWX() {
        return this.tsL;
    }

    public void VwS(String str) {
        this.KO = str;
    }

    public void KO() {
        this.nWX = true;
    }
}
