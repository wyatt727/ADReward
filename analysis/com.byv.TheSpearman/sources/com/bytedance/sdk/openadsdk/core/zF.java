package com.bytedance.sdk.openadsdk.core;

/* compiled from: SingleAppData.java */
/* loaded from: classes2.dex */
public class zF {
    private static zF EYQ;
    private com.bytedance.sdk.openadsdk.apiImpl.Td.mZx IPb;
    private com.bytedance.sdk.openadsdk.apiImpl.mZx.mZx Kbd;
    private com.bytedance.sdk.openadsdk.apiImpl.Pm.EYQ Pm;
    private com.bytedance.sdk.openadsdk.core.model.UB Td;
    private com.bytedance.sdk.openadsdk.core.model.EYQ mZx;

    private zF() {
    }

    public static zF EYQ() {
        if (EYQ == null) {
            EYQ = new zF();
        }
        return EYQ;
    }

    public com.bytedance.sdk.openadsdk.core.model.UB mZx() {
        return this.Td;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        this.Td = ub;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.Pm.EYQ Td() {
        return this.Pm;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.mZx.mZx Pm() {
        return this.Kbd;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.Td.mZx Kbd() {
        return this.IPb;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.apiImpl.mZx.mZx mzx) {
        this.Kbd = mzx;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.apiImpl.Pm.EYQ eyq) {
        this.Pm = eyq;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.apiImpl.Td.mZx mzx) {
        this.IPb = mzx;
    }

    public void IPb() {
        this.Td = null;
        this.mZx = null;
        this.Pm = null;
        this.Kbd = null;
        this.IPb = null;
    }

    public com.bytedance.sdk.openadsdk.core.model.EYQ VwS() {
        return this.mZx;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.model.EYQ eyq) {
        this.mZx = eyq;
    }
}
