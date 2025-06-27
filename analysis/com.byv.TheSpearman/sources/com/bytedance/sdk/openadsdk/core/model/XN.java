package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.Nvm;

/* compiled from: TTAppOpenAdReportModel.java */
/* loaded from: classes2.dex */
public class XN {
    public boolean EYQ;
    private long HX;
    private long IPb;
    private long Kbd;
    private int MxO;
    private long QQ;
    private long VwS;
    public long mZx;
    private long tp;
    private Nvm Td = Nvm.mZx();
    private Nvm Pm = Nvm.mZx();

    public void EYQ(Nvm nvm, Nvm nvm2, int i, Nvm nvm3) {
        this.Kbd = nvm.EYQ(this.Td);
        this.IPb = nvm2.EYQ(nvm);
        this.VwS = i;
        this.QQ = nvm3.EYQ(nvm2);
    }

    public void EYQ(Nvm nvm) {
        this.Td = nvm;
    }

    public void mZx(Nvm nvm) {
        this.Pm = nvm;
        this.HX = nvm.EYQ(this.Td);
    }

    public Nvm EYQ() {
        return this.Td;
    }

    public long mZx() {
        return this.Kbd;
    }

    public long Td() {
        return this.IPb;
    }

    public long Pm() {
        return this.VwS;
    }

    public long Kbd() {
        return this.QQ;
    }

    public long IPb() {
        return this.HX;
    }

    public long VwS() {
        return this.tp;
    }

    public void EYQ(long j) {
        this.tp = j;
    }

    public int QQ() {
        return this.MxO;
    }

    public void EYQ(int i) {
        this.MxO = i;
    }
}
