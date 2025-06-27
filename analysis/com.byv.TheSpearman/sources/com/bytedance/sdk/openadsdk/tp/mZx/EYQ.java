package com.bytedance.sdk.openadsdk.tp.mZx;

import com.bytedance.sdk.component.VwS.Td;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.tp.mZx;

/* compiled from: ReportThreadLogServiceImp.java */
/* loaded from: classes2.dex */
public class EYQ implements Td {
    @Override // com.bytedance.sdk.component.VwS.Td
    public void EYQ(final com.bytedance.sdk.component.VwS.mZx.EYQ eyq) {
        com.bytedance.sdk.openadsdk.tp.Td.EYQ();
        com.bytedance.sdk.openadsdk.tp.Td.EYQ("stats_sdk_thread_num", false, new mZx() { // from class: com.bytedance.sdk.openadsdk.tp.mZx.EYQ.1
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                com.bytedance.sdk.component.VwS.mZx.EYQ eyq2;
                if (!hu.Pm().TZn() || (eyq2 = eyq) == null || eyq2.EYQ() == null) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("stats_sdk_thread_num").mZx(eyq.EYQ().toString());
            }
        });
    }
}
