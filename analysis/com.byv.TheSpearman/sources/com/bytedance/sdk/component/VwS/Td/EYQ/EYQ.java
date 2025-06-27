package com.bytedance.sdk.component.VwS.Td.EYQ;

import android.text.TextUtils;

/* compiled from: PAGRunnableLogModel.java */
/* loaded from: classes2.dex */
public class EYQ {
    private String EYQ;
    private long IPb;
    private long Kbd;
    private long Pm;
    private long Td;
    private int mZx = 0;

    public String EYQ() {
        return this.EYQ;
    }

    public int mZx() {
        return this.mZx;
    }

    public long Td() {
        return this.Td;
    }

    public long Pm() {
        return this.Pm;
    }

    public long Kbd() {
        return this.Kbd;
    }

    public long IPb() {
        return this.IPb;
    }

    public void EYQ(com.bytedance.sdk.component.VwS.Td.EYQ eyq) {
        synchronized (this) {
            if (TextUtils.isEmpty(this.EYQ)) {
                this.EYQ = eyq.mZx();
            }
            this.Td += eyq.Td();
            this.Pm += eyq.Pm();
            this.Kbd = Math.max(this.Kbd, eyq.Td());
            this.IPb = Math.max(this.IPb, eyq.Pm());
            this.mZx++;
        }
        Long.valueOf(eyq.Td());
        Long.valueOf(eyq.Pm());
        toString();
    }

    public String toString() {
        return this.EYQ + " times=" + this.mZx + ",waitMaxTime=" + this.Kbd + ",runMaxTime=" + this.IPb + ",runTotalTime=" + this.Pm + ",waitTotalTime=" + this.Td;
    }
}
