package com.bytedance.sdk.openadsdk.mZx.EYQ;

import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.hYh;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: StatsLogAdLogImpl.java */
/* loaded from: classes2.dex */
class tsL implements com.bytedance.sdk.openadsdk.tp.Td.EYQ {
    public static final tsL EYQ = new tsL();

    private tsL() {
    }

    @Override // com.bytedance.sdk.openadsdk.tp.Td.EYQ
    public void EYQ(com.bytedance.sdk.openadsdk.tp.mZx mzx) {
        EYQ(mzx, false);
    }

    @Override // com.bytedance.sdk.openadsdk.tp.Td.EYQ
    public void EYQ(final com.bytedance.sdk.openadsdk.tp.mZx mzx, final boolean z) {
        EYQ(new com.bytedance.sdk.component.VwS.QQ("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.mZx.EYQ.tsL.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.tp.EYQ.mZx logStats = mzx.getLogStats();
                    if (logStats == null) {
                        return;
                    }
                    com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.EYQ eyq = new com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ.EYQ(hYh.EYQ(), logStats.EYQ());
                    eyq.Td((byte) 0);
                    eyq.mZx(z ? (byte) 2 : (byte) 3);
                    eyq.EYQ((byte) 1);
                    if (com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx()) {
                        Pm.EYQ(hu.EYQ(), com.bytedance.sdk.openadsdk.multipro.mZx.Td());
                    }
                    com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ(eyq);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void EYQ(com.bytedance.sdk.component.VwS.QQ qq) {
        if (qq == null) {
            return;
        }
        if (!xt.IPb()) {
            xt.mZx(qq, 5);
        } else {
            qq.run();
        }
    }
}
