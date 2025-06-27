package com.bytedance.sdk.openadsdk.core.EYQ;

import com.bytedance.sdk.openadsdk.core.UB;
import com.bytedance.sdk.openadsdk.core.model.mZx;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: AdCallBackAdapter.java */
/* loaded from: classes2.dex */
public class EYQ implements UB.EYQ {
    private final UB.EYQ EYQ;

    public EYQ(UB.EYQ eyq) {
        this.EYQ = eyq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
    public void EYQ(final int i, final String str) {
        if (this.EYQ != null) {
            if (xt.Kbd()) {
                this.EYQ.EYQ(i, str);
            } else {
                xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EYQ.EYQ.1
                    @Override // java.lang.Runnable
                    public void run() {
                        EYQ.this.EYQ.EYQ(i, str);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
    public void EYQ(final com.bytedance.sdk.openadsdk.core.model.EYQ eyq, final mZx mzx) {
        if (this.EYQ != null) {
            if (xt.Kbd()) {
                this.EYQ.EYQ(eyq, mzx);
            } else {
                xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EYQ.EYQ.2
                    @Override // java.lang.Runnable
                    public void run() {
                        EYQ.this.EYQ.EYQ(eyq, mzx);
                    }
                });
            }
        }
    }
}
