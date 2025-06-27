package com.bytedance.sdk.openadsdk.QQ.EYQ;

import com.bytedance.sdk.component.EYQ.UB;
import com.bytedance.sdk.component.widget.SSWebView;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: PreventTouchEventMethod.java */
/* loaded from: classes2.dex */
public class VwS extends com.bytedance.sdk.component.EYQ.Kbd<JSONObject, JSONObject> {
    private WeakReference<SSWebView> EYQ;

    public static void EYQ(UB ub, SSWebView sSWebView) {
        ub.EYQ("preventTouchEvent", new VwS(sSWebView));
    }

    public VwS(SSWebView sSWebView) {
        this.EYQ = new WeakReference<>(sSWebView);
    }

    @Override // com.bytedance.sdk.component.EYQ.Kbd
    public JSONObject EYQ(JSONObject jSONObject, com.bytedance.sdk.component.EYQ.IPb iPb) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            SSWebView sSWebView = this.EYQ.get();
            if (sSWebView != null) {
                sSWebView.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("success", false);
            }
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
        }
        return jSONObject2;
    }
}
