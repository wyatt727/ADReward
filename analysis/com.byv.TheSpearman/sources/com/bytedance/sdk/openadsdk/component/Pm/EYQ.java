package com.bytedance.sdk.openadsdk.component.Pm;

import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.XN;
import com.bytedance.sdk.openadsdk.tp.Td;
import com.bytedance.sdk.openadsdk.tp.mZx;
import com.bytedance.sdk.openadsdk.utils.Nvm;
import com.json.i1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAppOpenAdReport.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static void EYQ(final int i, final int i2) {
        Td.EYQ("openad_load_ad_timeout", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.component.Pm.EYQ.1
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i);
                jSONObject.put("user_timeout_time", i2);
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("openad_load_ad_timeout").mZx(jSONObject.toString());
            }
        });
    }

    public static void EYQ(UB ub, int i, int i2, float f) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            EYQ(jSONObject, ub);
            jSONObject.put("openad_creative_type", UB.Kbd(ub) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("skip_time", i);
            jSONObject.put("skip_show_time", i2);
            jSONObject.put("total_time", f);
        } catch (JSONException e) {
            pi.EYQ("TTAppOpenAdReport", "reportSkip json error", e);
        }
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, "skip", i, jSONObject);
    }

    public static void EYQ(UB ub, long j, float f, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            EYQ(jSONObject, ub);
            jSONObject.put("openad_creative_type", UB.Kbd(ub) ? "video_normal_ad" : "image_normal_ad");
            if (z) {
                double d = f;
                jSONObject.put("video_duration", d);
                jSONObject.put("video_percent", (int) (((j * 1.0d) / 10.0d) / d));
            } else {
                jSONObject.put("image_duration", f);
            }
        } catch (JSONException e) {
            pi.EYQ("TTAppOpenAdReport", "reportDestroy json error", e);
        }
        com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, "destroy", jSONObject);
    }

    public static void EYQ(UB ub) {
        com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, "cache_expire", (JSONObject) null);
    }

    public static void mZx(UB ub) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", UB.Kbd(ub) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e) {
            pi.EYQ("TTAppOpenAdReport", "reportCacheLoss json error", e);
        }
        com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, "cache_loss", jSONObject);
    }

    public static void EYQ(UB ub, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(i1.t, z ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, "download_image_duration", j, jSONObject);
    }

    public static void mZx(UB ub, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", ub.mN().Kbd());
            jSONObject.put("video_duration", ub.mN().IPb());
            jSONObject.put(i1.t, z ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, "download_video_duration", j, jSONObject);
    }

    public static void EYQ(UB ub, int i, XN xn) {
        JSONObject jSONObject = new JSONObject();
        long jIPb = 0;
        try {
            jSONObject.put("openad_creative_type", UB.Kbd(ub) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i);
            if (xn != null) {
                xn.mZx(Nvm.EYQ());
                EYQ(jSONObject, ub);
                jSONObject.put("client_start_time", xn.mZx());
                jSONObject.put("sever_time", xn.Pm());
                jSONObject.put("network_time", xn.Td());
                jSONObject.put("client_end_time", xn.Kbd());
                jSONObject.put("download_resource_duration", xn.VwS());
                jSONObject.put("resource_source", xn.QQ());
                jSONObject.put("is_bidding", xn.EYQ ? 1 : 0);
                if (xn.EYQ) {
                    jSONObject.put("load_wait_time", xn.mZx);
                }
                jIPb = xn.IPb();
            }
        } catch (JSONException e) {
            pi.EYQ("TTAppOpenAdReport", "reportLoadNetDuration json error", e);
        }
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, "load_net_duration", jIPb, jSONObject);
    }

    public static void EYQ(UB ub, long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            EYQ(jSONObject, ub);
            jSONObject.put("openad_creative_type", UB.Kbd(ub) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            pi.EYQ("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, "load_cache_duration", j, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void EYQ(org.json.JSONObject r1, com.bytedance.sdk.openadsdk.core.model.UB r2) throws org.json.JSONException {
        /*
            java.lang.String r0 = "is_icon_only"
            if (r2 == 0) goto Lc
            boolean r2 = r2.BEC()     // Catch: org.json.JSONException -> L11
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L11
            return
        L11:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "TTAppOpenAdReport"
            com.bytedance.sdk.component.utils.pi.EYQ(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.model.UB):void");
    }
}
