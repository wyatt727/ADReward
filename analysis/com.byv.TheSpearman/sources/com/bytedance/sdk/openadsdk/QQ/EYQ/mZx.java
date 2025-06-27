package com.bytedance.sdk.openadsdk.QQ.EYQ;

import com.bytedance.sdk.component.EYQ.Pm;
import com.bytedance.sdk.component.EYQ.UB;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.wBa;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: DoInterstitialWebViewCloseMethod.java */
/* loaded from: classes2.dex */
public class mZx extends com.bytedance.sdk.component.EYQ.Pm<JSONObject, JSONObject> {
    private final WeakReference<wBa> EYQ;

    public static void EYQ(UB ub, final wBa wba) {
        ub.EYQ("interstitial_webview_close", new Pm.mZx() { // from class: com.bytedance.sdk.openadsdk.QQ.EYQ.mZx.1
            @Override // com.bytedance.sdk.component.EYQ.Pm.mZx
            public com.bytedance.sdk.component.EYQ.Pm EYQ() {
                return new mZx(wba);
            }
        });
    }

    public mZx(wBa wba) {
        this.EYQ = new WeakReference<>(wba);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.EYQ.Pm
    public void EYQ(JSONObject jSONObject, com.bytedance.sdk.component.EYQ.IPb iPb) throws Exception {
        com.bytedance.sdk.openadsdk.core.QQ.mZx().UB();
        wBa wba = this.EYQ.get();
        if (wba == null) {
            pi.EYQ("DoInterstitialWebViewCloseMethod", "invoke error");
            Td();
        } else {
            wba.VwS();
        }
    }
}
