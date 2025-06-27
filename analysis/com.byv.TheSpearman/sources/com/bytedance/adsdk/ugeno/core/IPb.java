package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGNodeTree.java */
/* loaded from: classes2.dex */
public class IPb {
    private JSONObject EYQ;
    private JSONObject Pm;
    private String Td;
    private JSONObject mZx;

    public IPb(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            this.EYQ = jSONObject.optJSONObject("main_template");
            this.mZx = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                this.Td = jSONObjectOptJSONObject.optString("sdk_version");
            }
            this.Pm = jSONObject2;
        }
    }

    public EYQ EYQ() {
        return EYQ(this.EYQ, null);
    }

    public String mZx() {
        return this.Td;
    }

    public List<EYQ> Td() throws JSONException {
        if (this.mZx == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.mZx.keys();
        while (itKeys.hasNext()) {
            EYQ EYQ2 = EYQ(this.mZx.optJSONObject(itKeys.next()), null);
            if (EYQ2 != null) {
                arrayList.add(EYQ2);
            }
        }
        return arrayList;
    }

    private EYQ EYQ(JSONObject jSONObject, EYQ eyq) throws JSONException {
        EYQ EYQ2;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("name");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        EYQ eyq2 = new EYQ();
        eyq2.EYQ = strOptString2;
        eyq2.mZx = strOptString;
        eyq2.Td = jSONObject2;
        eyq2.Kbd = eyq;
        eyq2.IPb = this.Td;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString3 = jSONObjectOptJSONObject.optString("name");
                String strEYQ = com.bytedance.adsdk.ugeno.EYQ.Td.EYQ(jSONObjectOptJSONObject.optString("id"), this.Pm);
                if (TextUtils.equals(strOptString3, "Template")) {
                    JSONObject jSONObject3 = this.mZx;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strEYQ);
                        EYQ2 = EYQ(jSONObjectOptJSONObject, eyq2);
                    } else {
                        EYQ2 = null;
                    }
                } else {
                    EYQ2 = EYQ(jSONObjectOptJSONObject, eyq2);
                }
                if (EYQ2 != null) {
                    eyq2.EYQ(EYQ2);
                }
            }
        }
        return eyq2;
    }

    public static boolean EYQ(EYQ eyq) {
        return (eyq == null || eyq.Td == null) ? false : true;
    }

    /* compiled from: UGNodeTree.java */
    public static class EYQ {
        private String EYQ;
        private String IPb;
        private EYQ Kbd;
        private List<EYQ> Pm;
        private JSONObject Td;
        private String mZx;

        public String EYQ() {
            return this.EYQ;
        }

        public String mZx() {
            return this.IPb;
        }

        public String Td() {
            return this.mZx;
        }

        public JSONObject Pm() {
            return this.Td;
        }

        public List<EYQ> Kbd() {
            return this.Pm;
        }

        public void EYQ(EYQ eyq) {
            if (this.Pm == null) {
                this.Pm = new ArrayList();
            }
            this.Pm.add(eyq);
        }

        public String toString() {
            return "UGNode{id='" + this.EYQ + "', name='" + this.mZx + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
