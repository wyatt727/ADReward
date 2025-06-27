package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* compiled from: InitLifecycleHelper.java */
/* loaded from: classes2.dex */
public class nWX {
    private final com.bytedance.sdk.openadsdk.utils.EYQ EYQ = new com.bytedance.sdk.openadsdk.utils.EYQ();
    private boolean mZx;

    public static nWX EYQ() {
        return EYQ.EYQ;
    }

    /* compiled from: InitLifecycleHelper.java */
    private static class EYQ {
        private static final nWX EYQ = new nWX();
    }

    public void mZx() {
        try {
            Context contextEYQ = hu.EYQ();
            if (contextEYQ instanceof Application) {
                ((Application) contextEYQ).registerActivityLifecycleCallbacks(this.EYQ);
                this.mZx = true;
            } else {
                if (contextEYQ == null || contextEYQ.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextEYQ.getApplicationContext()).registerActivityLifecycleCallbacks(this.EYQ);
                this.mZx = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public boolean Td() {
        return this.mZx;
    }

    public boolean Pm() {
        return this.EYQ.EYQ();
    }

    public boolean EYQ(boolean z) {
        return this.EYQ.EYQ(z);
    }

    public com.bytedance.sdk.openadsdk.utils.EYQ Kbd() {
        return this.EYQ;
    }
}
