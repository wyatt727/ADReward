package com.bytedance.sdk.component.Kbd.EYQ;

/* compiled from: AdLogConfig.java */
/* loaded from: classes2.dex */
public class EYQ {
    private com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd EYQ;
    private Kbd HX;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ IPb;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ Kbd;
    private int MxO;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ Pm;
    private boolean QQ;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ Td;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ VwS;
    private com.bytedance.sdk.component.Kbd.EYQ.mZx.Td mZx;
    private long pi;
    private boolean tp;
    private int tsL;

    private EYQ() {
        this.MxO = 200;
        this.tsL = 10;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd EYQ() {
        return this.EYQ;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ mZx() {
        return this.IPb;
    }

    public boolean Td() {
        return this.tp;
    }

    public Kbd Pm() {
        return this.HX;
    }

    public long Kbd() {
        return this.pi;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ IPb() {
        return this.VwS;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ VwS() {
        return this.Td;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ QQ() {
        return this.Pm;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ HX() {
        return this.Kbd;
    }

    public com.bytedance.sdk.component.Kbd.EYQ.mZx.Td tp() {
        return this.mZx;
    }

    public boolean MxO() {
        return this.QQ;
    }

    public int tsL() {
        return this.MxO;
    }

    public int pi() {
        return this.tsL;
    }

    /* compiled from: AdLogConfig.java */
    /* renamed from: com.bytedance.sdk.component.Kbd.EYQ.EYQ$EYQ, reason: collision with other inner class name */
    public static class C0082EYQ {
        private com.bytedance.sdk.component.Kbd.EYQ.mZx.Td EYQ;
        private boolean HX;
        private boolean IPb;
        private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ Kbd;
        private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ Pm;
        private com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd QQ;
        private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ Td;
        private Kbd VwS;
        private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ mZx;
        private long tsL;
        private int tp = 5000;
        private int MxO = 10;

        public C0082EYQ EYQ(long j) {
            this.tsL = j;
            return this;
        }

        public C0082EYQ EYQ(com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd kbd) {
            this.QQ = kbd;
            return this;
        }

        public C0082EYQ EYQ(Kbd kbd) {
            this.VwS = kbd;
            return this;
        }

        public C0082EYQ EYQ(boolean z) {
            this.IPb = z;
            return this;
        }

        public C0082EYQ EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
            this.mZx = eyq;
            return this;
        }

        public C0082EYQ mZx(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
            this.Td = eyq;
            return this;
        }

        public C0082EYQ Td(com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq) {
            this.Pm = eyq;
            return this;
        }

        public C0082EYQ EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Td td) {
            this.EYQ = td;
            return this;
        }

        public C0082EYQ EYQ(int i) {
            this.tp = i;
            return this;
        }

        public C0082EYQ mZx(int i) {
            this.MxO = i;
            return this;
        }

        public EYQ EYQ() {
            EYQ eyq = new EYQ();
            eyq.mZx = this.EYQ;
            eyq.Td = this.mZx;
            eyq.Pm = this.Td;
            eyq.Kbd = this.Pm;
            eyq.IPb = this.Kbd;
            eyq.QQ = this.IPb;
            eyq.HX = this.VwS;
            eyq.EYQ = this.QQ;
            eyq.tp = this.HX;
            eyq.tsL = this.MxO;
            eyq.MxO = this.tp;
            eyq.pi = this.tsL;
            return eyq;
        }
    }
}
