package com.bytedance.sdk.openadsdk.IPb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.Pm.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import org.json.JSONObject;

/* compiled from: ImageLoaderLogListenerWrapper.java */
/* loaded from: classes2.dex */
public class mZx<T> implements hu<T> {
    private final long EYQ = SystemClock.elapsedRealtime();
    private final UB Pm;
    private final hu<T> Td;
    private final String mZx;

    public mZx(UB ub, String str, hu<T> huVar) {
        this.Td = huVar;
        this.Pm = ub;
        this.mZx = str;
    }

    @Override // com.bytedance.sdk.component.Pm.hu
    public void EYQ(MxO<T> mxO) {
        hu<T> huVar = this.Td;
        if (huVar != null) {
            huVar.EYQ(mxO);
        }
        if (this.Pm != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.EYQ;
            final int iVwS = mxO.VwS() / 1024;
            final int i = mxO.IPb() ? 1 : 0;
            com.bytedance.sdk.openadsdk.tp.Td.EYQ("load_image_success", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.IPb.mZx.1
                @Override // com.bytedance.sdk.openadsdk.tp.mZx
                public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", jElapsedRealtime);
                    jSONObject.put("url", mZx.this.mZx);
                    jSONObject.put("preload_size", iVwS);
                    jSONObject.put("local_cache", i);
                    jSONObject.put("image_mode", mZx.this.Pm.by());
                    return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("load_image_success").EYQ(mZx.this.Pm.Yd()).mZx(jSONObject.toString());
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.Pm.hu
    public void EYQ(final int i, final String str, Throwable th) {
        hu<T> huVar = this.Td;
        if (huVar != null) {
            huVar.EYQ(i, str, th);
        }
        UB ub = this.Pm;
        if (ub == null || TextUtils.isEmpty(FH.EYQ(ub))) {
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.EYQ;
        com.bytedance.sdk.openadsdk.tp.Td.EYQ("load_image_error", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.IPb.mZx.2
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", jElapsedRealtime);
                jSONObject.put("url", mZx.this.mZx);
                jSONObject.put(AndroidBridgeConstants.ERROR_CODE, i);
                jSONObject.put("error_message", str);
                jSONObject.put("image_mode", mZx.this.Pm.by());
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("load_image_error").EYQ(mZx.this.Pm.Yd()).mZx(jSONObject.toString());
            }
        });
    }
}
