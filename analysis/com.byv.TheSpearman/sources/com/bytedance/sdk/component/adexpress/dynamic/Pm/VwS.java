package com.bytedance.sdk.component.adexpress.dynamic.Pm;

import com.bytedance.sdk.component.adexpress.mZx.pi;
import org.json.JSONObject;

/* compiled from: DynamicNativeParser.java */
/* loaded from: classes2.dex */
public class VwS implements QQ {
    private com.bytedance.sdk.component.adexpress.dynamic.Kbd.mZx EYQ;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm.QQ
    public void EYQ(com.bytedance.sdk.component.adexpress.dynamic.Kbd.mZx mzx) {
        this.EYQ = mzx;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm.QQ
    public void EYQ(final pi piVar) {
        if (piVar.tsL() == 1) {
            mZx(piVar);
        } else {
            com.bytedance.sdk.component.VwS.IPb.Td().execute(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.Pm.VwS.1
                @Override // java.lang.Runnable
                public void run() {
                    VwS.this.mZx(piVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(pi piVar) {
        try {
            JSONObject jSONObjectTd = piVar.Td();
            JSONObject jSONObject = new JSONObject(jSONObjectTd.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectTd.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qqEYQ = new IPb(jSONObject, jSONObjectOptJSONObject, jSONObjectTd.optJSONObject("AdSize"), new JSONObject(jSONObjectTd.optString("diff_template_Plugin"))).EYQ(piVar.mZx(), piVar.tp(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), piVar);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                qqEYQ.EYQ(jSONObject2.optString("color"));
                qqEYQ.EYQ(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.EYQ.EYQ(qqEYQ);
        } catch (Exception unused2) {
        }
    }
}
