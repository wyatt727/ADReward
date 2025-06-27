package com.bytedance.sdk.component.adexpress.dynamic.Pm;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.Pm.Kbd;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;
import com.json.td;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicLayoutInflater.java */
/* loaded from: classes2.dex */
public class IPb {
    private static HashMap<String, String> VwS;
    private JSONObject EYQ;
    private com.bytedance.sdk.component.adexpress.dynamic.Td.Pm IPb;
    private Td Kbd;
    private EYQ Pm;
    private com.bytedance.sdk.component.adexpress.dynamic.Td.Td Td;
    private JSONObject mZx;

    static {
        HashMap<String, String> map = new HashMap<>();
        VwS = map;
        map.put("subtitle", "description");
        VwS.put(FirebaseAnalytics.Param.SOURCE, "source|app.app_name");
        VwS.put("screenshot", "dynamic_creative.screenshot");
    }

    public IPb(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.EYQ = jSONObject;
        this.mZx = jSONObject2;
        this.Td = new com.bytedance.sdk.component.adexpress.dynamic.Td.Td(jSONObject2);
        this.Pm = EYQ.EYQ(jSONObject3);
        this.IPb = com.bytedance.sdk.component.adexpress.dynamic.Td.Pm.EYQ(jSONObject4);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.Td.QQ EYQ(double d, int i, double d2, String str, pi piVar) throws JSONException {
        JSONObject jSONObject;
        this.Td.EYQ();
        try {
            jSONObject = new JSONObject(this.IPb.mZx);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qqEYQ = EYQ(Pm.EYQ(this.EYQ, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.Td.QQ) null);
        EYQ(qqEYQ);
        Kbd kbd = new Kbd(d, i, d2, str, piVar);
        Kbd.EYQ eyq = new Kbd.EYQ();
        eyq.EYQ = this.Pm.EYQ;
        eyq.mZx = this.Pm.mZx;
        eyq.Td = 0.0f;
        kbd.EYQ(eyq);
        kbd.EYQ(qqEYQ, 0.0f, 0.0f);
        kbd.EYQ();
        if (kbd.EYQ.Pm == 65536.0f) {
            return null;
        }
        return kbd.EYQ.IPb;
    }

    private void EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) {
        if (qq == null) {
            return;
        }
        float fMin = this.Pm.Td ? this.Pm.EYQ : Math.min(this.Pm.EYQ, com.bytedance.sdk.component.adexpress.Pm.IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ(), com.bytedance.sdk.component.adexpress.Pm.IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ())));
        if (this.Pm.mZx == 0.0f) {
            qq.Kbd(fMin);
            qq.tp().Kbd().tp("auto");
            qq.IPb(0.0f);
        } else {
            qq.Kbd(fMin);
            qq.IPb(this.Pm.Td ? this.Pm.mZx : Math.min(this.Pm.mZx, com.bytedance.sdk.component.adexpress.Pm.IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ(), com.bytedance.sdk.component.adexpress.Pm.IPb.mZx(com.bytedance.sdk.component.adexpress.Pm.EYQ()))));
            qq.tp().Kbd().tp("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.Td.QQ EYQ(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) throws JSONException {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.IPb != null) {
                Td td = new Td();
                this.Kbd = td;
                JSONObject jSONObjectEYQ = td.EYQ(this.IPb.EYQ, iOptInt, jSONObject);
                if (jSONObjectEYQ != null) {
                    jSONObject = jSONObjectEYQ;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qqEYQ = EYQ(jSONObject);
        qqEYQ.EYQ(qq);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            qqEYQ.EYQ((List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>) null);
            return qqEYQ;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = qqEYQ.tp().Kbd().eFB();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i2 = 0; i2 < length; i2++) {
                    com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qqEYQ2 = EYQ(jSONArrayOptJSONArray2.optJSONObject(i2), qqEYQ);
                    if (com.bytedance.sdk.component.adexpress.Pm.mZx() && "skip-with-time".equals(qqEYQ.tp().mZx()) && !t2.h.T.equals(qqEYQ.NZ()) && !TextUtils.isEmpty(qqEYQ.NZ())) {
                        qqEYQ2.Td(qqEYQ.NZ());
                    }
                    arrayList.add(qqEYQ2);
                    arrayList3.add(qqEYQ2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            qqEYQ.EYQ(arrayList);
        }
        if (arrayList2.size() > 0) {
            qqEYQ.mZx(arrayList2);
        }
        return qqEYQ;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.Td.QQ EYQ(JSONObject jSONObject) throws JSONException {
        String strEYQ;
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        HX.EYQ(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectEYQ = HX.EYQ(strOptString, HX.EYQ(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq = new com.bytedance.sdk.component.adexpress.dynamic.Td.QQ();
        if (TextUtils.isEmpty(strOptString2)) {
            qq.mZx(String.valueOf(qq.hashCode()));
        } else {
            qq.mZx(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            mZx(qq);
            qq.Td((float) jSONObjectOptJSONObject.optDouble("x"));
            qq.Pm((float) jSONObjectOptJSONObject.optDouble("y"));
            qq.Kbd((float) jSONObjectOptJSONObject.optDouble("width"));
            qq.IPb((float) jSONObjectOptJSONObject.optDouble("height"));
            qq.VwS(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.Td.Kbd kbd = new com.bytedance.sdk.component.adexpress.dynamic.Td.Kbd();
            kbd.EYQ(strOptString);
            kbd.mZx(jSONObjectOptJSONObject.optString("data"));
            kbd.Td(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbEYQ = com.bytedance.sdk.component.adexpress.dynamic.Td.IPb.EYQ(jSONObjectOptJSONObject);
            kbd.EYQ(iPbEYQ);
            com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbEYQ2 = com.bytedance.sdk.component.adexpress.dynamic.Td.IPb.EYQ(jSONObjectEYQ);
            if (iPbEYQ2 == null) {
                kbd.mZx(iPbEYQ);
            } else {
                kbd.mZx(iPbEYQ2);
            }
            EYQ(iPbEYQ);
            EYQ(iPbEYQ2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.mZx) != null) {
                EYQ(kbd, jSONObject2.optInt("image_mode"));
            }
            String strMZx = kbd.mZx();
            com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbKbd = kbd.Kbd();
            if (VwS.containsKey(strMZx) && !iPbKbd.OtA()) {
                iPbKbd.zF(VwS.get(strMZx));
            }
            if (iPbKbd.OtA()) {
                strEYQ = kbd.Td();
            } else {
                strEYQ = EYQ(kbd.Td());
            }
            if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                if (TextUtils.equals(strMZx, "star") || TextUtils.equals(strMZx, "text_star")) {
                    strEYQ = EYQ("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strMZx, "score-count") || TextUtils.equals(strMZx, "score-count-type-1") || TextUtils.equals(strMZx, "score-count-type-2")) {
                    strEYQ = EYQ("dynamic_creative.comment_num_i18n|");
                }
                if (td.y.equals(strMZx) && iPbEYQ.JyA()) {
                    strEYQ = EYQ("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(EYQ()) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                kbd.mZx(strEYQ + "adx:" + EYQ());
            } else {
                kbd.mZx(strEYQ);
            }
            qq.EYQ(kbd);
        }
        return qq;
    }

    private void mZx(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) {
        com.bytedance.sdk.component.adexpress.dynamic.Td.Td td;
        Object objEYQ;
        Object objEYQ2;
        Object objEYQ3;
        Object objEYQ4;
        if (qq == null || (td = this.Td) == null || (objEYQ = td.EYQ("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objEYQ);
        if (TextUtils.isEmpty(strValueOf) || (objEYQ2 = this.Td.EYQ("title")) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objEYQ2);
        if (TextUtils.isEmpty(strValueOf2) || (objEYQ3 = this.Td.EYQ("description")) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objEYQ3);
        if (TextUtils.isEmpty(strValueOf3) || (objEYQ4 = this.Td.EYQ("icon")) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objEYQ4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objEYQ5 = this.Td.EYQ("app.app_name");
        Object objEYQ6 = this.Td.EYQ(FirebaseAnalytics.Param.SOURCE);
        if (objEYQ5 == null && objEYQ6 == null) {
            return;
        }
        if (objEYQ5 == null) {
            objEYQ5 = objEYQ6;
        }
        String strValueOf5 = String.valueOf(objEYQ5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        qq.EYQ("imageUrl", strValueOf);
        qq.EYQ("title", strValueOf2);
        qq.EYQ("description", strValueOf3);
        qq.EYQ("icon", strValueOf4);
        qq.EYQ("app_name", strValueOf5);
        qq.EYQ(true);
    }

    private void EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.Kbd kbd, int i) throws JSONException {
        int iLastIndexOf;
        if (i == 5 || i == 15 || i == 50 || i == 154) {
            kbd.EYQ("video");
            String strEYQ = HX.EYQ("video");
            kbd.Kbd().zF(strEYQ);
            String strEYQ2 = HX.EYQ("video", "clickArea");
            if (!TextUtils.isEmpty(strEYQ2)) {
                kbd.Kbd().KO(strEYQ2);
                kbd.VwS().KO(strEYQ2);
            }
            kbd.VwS().zF(strEYQ);
            kbd.mZx(strEYQ);
            kbd.Kbd().In();
            return;
        }
        kbd.EYQ("image");
        String strEYQ3 = HX.EYQ("image");
        com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbKbd = kbd.Kbd();
        iPbKbd.zF(strEYQ3);
        kbd.VwS().zF(strEYQ3);
        String strEYQ4 = HX.EYQ("image", "clickArea");
        if (!TextUtils.isEmpty(strEYQ4)) {
            iPbKbd.KO(strEYQ4);
            kbd.VwS().KO(strEYQ4);
        }
        JSONObject jSONObjectHR = iPbKbd.HR();
        if (jSONObjectHR != null) {
            iPbKbd.NZ(jSONObjectHR.optString("imageLottieTosPath"));
            iPbKbd.tsL(jSONObjectHR.optBoolean("animationsLoop"));
            iPbKbd.rfB(jSONObjectHR.optInt("lottieAppNameMaxLength"));
            iPbKbd.xt(jSONObjectHR.optInt("lottieAdDescMaxLength"));
            iPbKbd.lEs(jSONObjectHR.optInt("lottieAdTitleMaxLength"));
        }
        kbd.mZx(strEYQ3);
        if (strEYQ3 != null && (iLastIndexOf = strEYQ3.lastIndexOf(".")) > 0) {
            String strSubstring = strEYQ3.substring(0, iLastIndexOf);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", EYQ(strSubstring + ".width"));
                jSONObject.put("height", EYQ(strSubstring + ".height"));
            } catch (JSONException unused) {
            }
            kbd.Td(jSONObject.toString());
        }
        iPbKbd.Jy();
    }

    private String EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.Td.mZx(str2)) {
                String strValueOf = String.valueOf(this.Td.EYQ(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String EYQ() {
        com.bytedance.sdk.component.adexpress.dynamic.Td.Td td = this.Td;
        return td == null ? "" : String.valueOf(td.EYQ("adx_name"));
    }

    private void EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPb) {
        if (iPb == null) {
            return;
        }
        String strXt = iPb.xt();
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            String strTd = com.bytedance.sdk.component.adexpress.Pm.IPb.Td(com.bytedance.sdk.component.adexpress.Pm.EYQ());
            if ("zh".equals(strTd)) {
                strTd = "cn";
            }
            if (!TextUtils.isEmpty(strTd) && iPb.IPb() != null) {
                String strOptString = iPb.IPb().optString(strTd);
                if (!TextUtils.isEmpty(strOptString)) {
                    strXt = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strXt)) {
            return;
        }
        int iIndexOf = strXt.indexOf("{{");
        int iIndexOf2 = strXt.indexOf("}}");
        if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf2 < iIndexOf) {
            iPb.tsL(strXt);
            return;
        }
        String strEYQ = EYQ(strXt.substring(iIndexOf + 2, iIndexOf2));
        StringBuilder sb = new StringBuilder(strXt.substring(0, iIndexOf));
        if (!TextUtils.isEmpty(strEYQ)) {
            sb.append(strEYQ);
        }
        sb.append(strXt.substring(iIndexOf2 + 2));
        iPb.tsL(sb.toString());
    }

    /* compiled from: DynamicLayoutInflater.java */
    static class EYQ {
        float EYQ;
        boolean Td;
        float mZx;

        public static EYQ EYQ(JSONObject jSONObject) {
            EYQ eyq = new EYQ();
            if (jSONObject != null) {
                eyq.EYQ = (float) jSONObject.optDouble("width");
                eyq.mZx = (float) jSONObject.optDouble("height");
                eyq.Td = jSONObject.optBoolean("isLandscape");
            }
            return eyq;
        }
    }
}
