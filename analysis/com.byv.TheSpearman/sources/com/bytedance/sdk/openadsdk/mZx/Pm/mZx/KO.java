package com.bytedance.sdk.openadsdk.mZx.Pm.mZx;

import com.bytedance.sdk.openadsdk.core.model.UB;

/* compiled from: VideoLogHelperModel.java */
/* loaded from: classes2.dex */
public class KO {
    private long EYQ;
    private UB Kbd;
    private com.bykv.vk.openvk.component.video.api.Td.Td Pm;
    private int Td;
    private String mZx;

    public KO(long j, String str, int i, com.bykv.vk.openvk.component.video.api.Td.Td td, UB ub) {
        this.EYQ = j;
        this.mZx = str;
        this.Td = i;
        this.Pm = td;
        this.Kbd = ub;
    }

    public long EYQ() {
        return this.EYQ;
    }

    public String mZx() {
        return this.mZx;
    }

    public int Td() {
        return this.Td;
    }

    public com.bykv.vk.openvk.component.video.api.Td.Td Pm() {
        return this.Pm;
    }

    public UB Kbd() {
        return this.Kbd;
    }

    /* compiled from: VideoLogHelperModel.java */
    public static class EYQ {
        private int HX;
        private int IPb;
        private int Kbd;
        private com.bykv.vk.openvk.component.video.api.Td.EYQ MxO;
        private int QQ;
        private int VwS;
        private long EYQ = 0;
        private long mZx = 0;
        private long Td = 0;
        private boolean Pm = false;
        private boolean tp = false;

        public long EYQ() {
            return this.EYQ;
        }

        public void EYQ(long j) {
            this.EYQ = j;
            pi();
        }

        private void pi() {
            long j = this.Td;
            if (j > 0) {
                long j2 = this.EYQ;
                if (j2 > j) {
                    this.EYQ = j2 % j;
                }
            }
        }

        public long mZx() {
            return this.mZx;
        }

        public void mZx(long j) {
            this.mZx = j;
        }

        public long Td() {
            return this.Td;
        }

        public void Td(long j) {
            this.Td = j;
            pi();
        }

        public int Pm() {
            return this.Kbd;
        }

        public void EYQ(int i) {
            this.Kbd = i;
        }

        public int Kbd() {
            return this.IPb;
        }

        public void mZx(int i) {
            this.IPb = i;
        }

        public int IPb() {
            long j = this.Td;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.EYQ * 100) / j), 100);
        }

        public int VwS() {
            return this.VwS;
        }

        public void Td(int i) {
            this.VwS = i;
        }

        public int QQ() {
            return this.QQ;
        }

        public int HX() {
            return this.HX;
        }

        public void Pm(int i) {
            this.HX = i;
        }

        public boolean tp() {
            return this.tp;
        }

        public boolean MxO() {
            return this.Pm;
        }

        public void EYQ(boolean z) {
            this.Pm = z;
        }

        public void EYQ(com.bykv.vk.openvk.component.video.api.Td.EYQ eyq) {
            this.MxO = eyq;
        }

        public com.bykv.vk.openvk.component.video.api.Td.EYQ tsL() {
            return this.MxO;
        }
    }
}
