package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.UB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdInfo.java */
/* loaded from: classes2.dex */
public class EYQ {
    private String EYQ;
    private long HX;
    private boolean Kbd;
    private C0119EYQ Pm;
    private String QQ;
    private String Td;
    private int mZx;
    private boolean tp;
    private List<UB> IPb = new ArrayList();
    private List<VwS> VwS = new ArrayList();
    private volatile boolean MxO = false;

    public String EYQ() {
        UB ubKbd = Kbd();
        return ubKbd != null ? ubKbd.ZFP() : "";
    }

    public void EYQ(String str) {
        this.EYQ = str;
    }

    public int mZx() {
        return this.mZx;
    }

    public void EYQ(int i) {
        this.mZx = i;
    }

    public void mZx(String str) {
        this.Td = str;
    }

    public List<UB> Td() {
        return this.IPb;
    }

    public void EYQ(UB ub) {
        this.IPb.add(ub);
    }

    public void EYQ(List<UB> list) {
        this.IPb = list;
    }

    public void EYQ(VwS vwS) {
        this.VwS.add(vwS);
    }

    public void Td(String str) {
        this.QQ = str;
    }

    public void EYQ(long j) {
        this.HX = j;
    }

    public static Map<String, UB> EYQ(EYQ eyq) {
        if (eyq == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (UB ub : eyq.Td()) {
            if (!TextUtils.isEmpty(ub.Dd())) {
                map.put(ub.Dd(), ub);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public boolean Pm() {
        List<UB> list = this.IPb;
        return list != null && list.size() > 0;
    }

    public UB Kbd() {
        if (this.IPb.size() > 0) {
            return this.IPb.get(0);
        }
        return null;
    }

    public boolean IPb() {
        if (QQ() != null && Td() != null && Td().size() > 1) {
            this.Kbd = true;
        } else {
            this.Kbd = false;
            EYQ((C0119EYQ) null);
        }
        return this.Kbd;
    }

    public boolean VwS() {
        return this.tp;
    }

    public void EYQ(boolean z) {
        this.tp = z;
    }

    public C0119EYQ QQ() {
        return this.Pm;
    }

    public void EYQ(C0119EYQ c0119eyq) {
        this.Pm = c0119eyq;
        if (c0119eyq == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.EYQ(UB.EYQ.EYQ(c0119eyq, ""));
    }

    public boolean HX() {
        return this.MxO;
    }

    public void tp() {
        this.MxO = false;
    }

    public void EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        EYQ(C0119EYQ.EYQ(jSONObject.optJSONObject("tpl_info")));
    }

    /* compiled from: AdInfo.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.model.EYQ$EYQ, reason: collision with other inner class name */
    public static class C0119EYQ extends UB.EYQ {
        private int EYQ;

        public void EYQ(int i) {
            this.EYQ = i;
        }

        public int EYQ() {
            return this.EYQ;
        }

        public JSONObject mZx() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", Kbd());
                jSONObject.put("md5", IPb());
                jSONObject.put("url", VwS());
                jSONObject.put("data", QQ());
                jSONObject.put("diff_data", HX());
                jSONObject.put("version", Pm());
                jSONObject.put("dynamic_creative", tp());
                jSONObject.put("count_down_time", EYQ());
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        }

        public static C0119EYQ EYQ(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0119EYQ c0119eyq = new C0119EYQ();
            c0119eyq.mZx(jSONObject.optString("id"));
            c0119eyq.Td(jSONObject.optString("md5"));
            c0119eyq.Pm(jSONObject.optString("url"));
            c0119eyq.Kbd(jSONObject.optString("data"));
            c0119eyq.IPb(jSONObject.optString("diff_data"));
            c0119eyq.EYQ(jSONObject.optString("version"));
            c0119eyq.VwS(jSONObject.optString("dynamic_creative"));
            c0119eyq.EYQ(jSONObject.optInt("count_down_time"));
            if (EYQ(c0119eyq)) {
                return c0119eyq;
            }
            return null;
        }

        private static boolean EYQ(C0119EYQ c0119eyq) {
            return (c0119eyq == null || TextUtils.isEmpty(c0119eyq.Kbd()) || TextUtils.isEmpty(c0119eyq.VwS())) ? false : true;
        }
    }

    public JSONObject MxO() {
        try {
            JSONObject jSONObject = new JSONObject();
            C0119EYQ c0119eyqQQ = QQ();
            if (c0119eyqQQ != null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObjectMZx = c0119eyqQQ.mZx();
                if (jSONObjectMZx != null) {
                    jSONObject2.put("tpl_info", jSONObjectMZx);
                    jSONObject.put("choose_ui_data", jSONObject2);
                }
            }
            List<UB> list = this.IPb;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.IPb.size(); i++) {
                    jSONArray.put(this.IPb.get(i).aEX());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("is_choose_ad_original", this.tp);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("AdInfo", "toJsonObj: ", th);
            return null;
        }
    }

    public static EYQ mZx(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            EYQ eyq = new EYQ();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("choose_ui_data");
            if (jSONObjectOptJSONObject != null) {
                eyq.EYQ(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(com.bytedance.sdk.openadsdk.core.mZx.EYQ(jSONArrayOptJSONArray.optJSONObject(i)));
                }
                eyq.EYQ(arrayList);
            }
            eyq.EYQ(jSONObject.optBoolean("is_choose_ad_original", false));
            return eyq;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("AdInfo", "fromJson: ", th);
            return null;
        }
    }
}
