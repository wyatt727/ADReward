package com.bytedance.adsdk.EYQ.mZx.mZx.EYQ;

import android.text.TextUtils;
import com.json.t2;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VariableNode.java */
/* loaded from: classes2.dex */
public class XN implements com.bytedance.adsdk.EYQ.mZx.mZx.EYQ {
    private final String EYQ;

    public XN(String str) {
        this.EYQ = str;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public Object EYQ(Map<String, JSONObject> map) {
        Object objEYQ;
        if (map == null || map.size() <= 0 || (objEYQ = EYQ(this.EYQ, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objEYQ;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public com.bytedance.adsdk.EYQ.mZx.Pm.Kbd EYQ() {
        return com.bytedance.adsdk.EYQ.mZx.Pm.IPb.VARIABLE;
    }

    public String toString() {
        return "VariableNode [literals=" + this.EYQ + t2.i.e;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public String mZx() {
        return this.EYQ;
    }

    public Object EYQ(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return EYQ(str.split("\\."), 0, jSONObject);
    }

    private Object EYQ(String[] strArr, int i, JSONObject jSONObject) throws NumberFormatException {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i < strArr.length && jSONObject != null) {
            String str = strArr[i];
            int iIndexOf = str.indexOf(t2.i.d);
            int iIndexOf2 = str.indexOf(t2.i.e);
            if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf > iIndexOf2) {
                objOpt = jSONObject.opt(str);
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i2 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i2) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            if (i == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return EYQ(strArr, i + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return EYQ(strArr, i + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
