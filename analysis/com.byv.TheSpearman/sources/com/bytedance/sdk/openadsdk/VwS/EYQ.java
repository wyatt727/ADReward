package com.bytedance.sdk.openadsdk.VwS;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.FH;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsAppAdDownloadManager.java */
/* loaded from: classes2.dex */
public class EYQ implements Td {
    private final UB EYQ;
    private final Map<String, com.com.bytedance.overseas.sdk.EYQ.Td> Td = new HashMap();
    private final mZx mZx;

    private EYQ(mZx mzx, UB ub) {
        this.mZx = mzx;
        this.EYQ = ub;
    }

    public static EYQ EYQ(mZx mzx, UB ub) {
        return new EYQ(mzx, ub);
    }

    @Override // com.bytedance.sdk.openadsdk.VwS.Td
    public void EYQ() {
        this.Td.clear();
    }

    private UB EYQ(JSONObject jSONObject, String str) throws JSONException {
        String strEYQ;
        if (jSONObject == null) {
            return null;
        }
        UB ubMZx = UB.mZx();
        ubMZx.Td(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            ubMZx.zF(str);
        }
        if (this.EYQ == null) {
            return ubMZx;
        }
        String strEYQ2 = ubMZx.xh() != null ? ubMZx.xh().EYQ() : null;
        if (TextUtils.isEmpty(strEYQ2)) {
            return this.EYQ;
        }
        com.bytedance.sdk.openadsdk.core.model.Td tdXh = this.EYQ.xh();
        if (tdXh != null && strEYQ2.equals(tdXh.EYQ())) {
            return this.EYQ;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (tdXh != null) {
            try {
                strEYQ = tdXh.EYQ();
            } catch (JSONException unused) {
            }
        } else {
            strEYQ = AbstractJsonLexerKt.NULL;
        }
        jSONObject2.put("lu", strEYQ);
        jSONObject2.put("ju", strEYQ2);
        UB ub = this.EYQ;
        com.bytedance.sdk.openadsdk.core.Pm.EYQ(ub, FH.EYQ(ub), -5, jSONObject2);
        if (tdXh != null && strEYQ2.contains("play.google.com/store") && !strEYQ2.contains("referrer")) {
            ubMZx.xh().EYQ(tdXh.EYQ());
        }
        return ubMZx;
    }

    @Override // com.bytedance.sdk.openadsdk.VwS.Td
    public void EYQ(Context context, JSONObject jSONObject, String str, int i, boolean z) {
        JSONObject jSONObjectOptJSONObject;
        if (context == null || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        EYQ(context, EYQ(jSONObjectOptJSONObject, str), jSONObjectOptJSONObject, i, z);
    }

    private void EYQ(Context context, UB ub, JSONObject jSONObject, int i, boolean z) {
        if (context == null || ub == null || ub.xh() == null || jSONObject == null || this.mZx == null || this.Td.get(ub.xh().EYQ()) != null) {
            return;
        }
        String strMZx = FH.mZx(i);
        if (TextUtils.isEmpty(strMZx)) {
            return;
        }
        this.Td.put(ub.xh().EYQ(), EYQ(context, ub, jSONObject, strMZx, z));
    }

    @Override // com.bytedance.sdk.openadsdk.VwS.Td
    public void EYQ(Context context, JSONObject jSONObject, String str) {
        EYQ(context, this.EYQ, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void EYQ(Context context, UB ub, String str) {
        if (context == 0 || ub == null) {
            return;
        }
        com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(context, ub, str).Pm();
        if (context instanceof com.bytedance.sdk.openadsdk.core.video.Td.mZx) {
            ((com.bytedance.sdk.openadsdk.core.video.Td.mZx) context).hYh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.VwS.Td
    public void EYQ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        EYQ(EYQ(jSONObjectOptJSONObject, (String) null), jSONObjectOptJSONObject);
    }

    private void EYQ(UB ub, JSONObject jSONObject) throws JSONException {
        if (this.mZx == null || ub == null || ub.xh() == null) {
            return;
        }
        String strEYQ = ub.xh().EYQ();
        if (this.Td.containsKey(strEYQ)) {
            this.Td.remove(strEYQ);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.mZx.EYQ("app_ad_event", jSONObject2);
            } catch (JSONException e) {
                pi.EYQ("JsAppAdDownloadManager", e.getMessage());
            }
        }
    }

    private com.com.bytedance.overseas.sdk.EYQ.Td EYQ(Context context, UB ub, JSONObject jSONObject, String str, boolean z) {
        com.com.bytedance.overseas.sdk.EYQ.Td tdEYQ = com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(context, ub, str);
        tdEYQ.EYQ(true);
        return tdEYQ;
    }
}
