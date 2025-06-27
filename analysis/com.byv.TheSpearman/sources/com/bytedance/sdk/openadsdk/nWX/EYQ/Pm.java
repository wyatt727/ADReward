package com.bytedance.sdk.openadsdk.nWX.EYQ;

import com.bytedance.sdk.openadsdk.core.VwS.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.xt;
import org.json.JSONObject;

/* compiled from: PAGMRCEventManager.java */
/* loaded from: classes2.dex */
public class Pm {
    public static void EYQ(final UB ub, final EYQ eyq, final int i) {
        ub.VQ();
        xt.Td(new com.bytedance.sdk.component.VwS.QQ("mrc_report") { // from class: com.bytedance.sdk.openadsdk.nWX.EYQ.Pm.1
            @Override // java.lang.Runnable
            public void run() {
                if (ub.Jpu()) {
                    if (ub.HG()) {
                        com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(ub.wa(), new Td.mZx("show_urls", ub));
                    } else {
                        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub);
                    }
                }
                String strEYQ = FH.EYQ(ub);
                JSONObject jSONObject = new JSONObject();
                EYQ eyq2 = eyq;
                if (eyq2 != null) {
                    try {
                        jSONObject.put("root_view", EYQ.EYQ(eyq2));
                        int i2 = i;
                        if (i2 != -1) {
                            jSONObject.put("dynamic_show_type", i2);
                        }
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, strEYQ, "mrc_show", jSONObject);
            }
        });
    }
}
