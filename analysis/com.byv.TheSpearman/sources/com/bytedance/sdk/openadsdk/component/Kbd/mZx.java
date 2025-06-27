package com.bytedance.sdk.openadsdk.component.Kbd;

import com.bytedance.sdk.openadsdk.core.model.UB;

/* compiled from: TTAppOpenAdCallBackResult.java */
/* loaded from: classes2.dex */
public class mZx {
    private int EYQ;
    private boolean IPb;
    private String Kbd;
    private int Pm;
    private UB Td;
    private int mZx;

    public mZx(int i, int i2, UB ub) {
        this.EYQ = i;
        this.mZx = i2;
        this.Td = ub;
    }

    public mZx(int i, int i2, int i3, String str) {
        this.EYQ = i;
        this.mZx = i2;
        this.Pm = i3;
        this.Kbd = str;
    }

    public void EYQ(boolean z) {
        this.IPb = z;
    }

    public boolean EYQ() {
        return this.IPb;
    }

    public int mZx() {
        return this.EYQ;
    }

    public int Td() {
        return this.mZx;
    }

    public UB Pm() {
        return this.Td;
    }

    public int Kbd() {
        return this.Pm;
    }

    public String IPb() {
        return this.Kbd;
    }
}
