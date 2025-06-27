package com.bytedance.sdk.openadsdk.component.reward;

import android.os.CountDownTimer;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.KO;
import org.json.JSONException;

/* compiled from: FakeVideoController.java */
/* loaded from: classes2.dex */
public class Td implements com.bykv.vk.openvk.component.video.api.Pm.Td {
    private final EYQ EYQ;
    private final UB IPb;
    private boolean Kbd;
    private final com.bykv.vk.openvk.component.video.api.mZx.EYQ VwS;
    private boolean mZx = true;
    private long Td = 0;
    private boolean Pm = false;

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(Td.Pm pm) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(Td.mZx mzx) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public long IPb() {
        return 0L;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Kbd(boolean z) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean MxO() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Pm(boolean z) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Td(long j) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean UB() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public int VwS() {
        return 0;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean hu() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void mZx(com.bykv.vk.openvk.component.video.api.Td.Td td) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public com.bykv.vk.openvk.component.video.api.Pm.mZx pi() {
        return null;
    }

    public Td(UB ub, com.bytedance.sdk.openadsdk.mZx.VwS vwS) {
        com.bykv.vk.openvk.component.video.api.mZx.EYQ eyq = new com.bykv.vk.openvk.component.video.api.mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Td.1
        };
        this.VwS = eyq;
        this.IPb = ub;
        com.bykv.vk.openvk.component.video.api.Td.mZx mzxMN = ub.mN();
        long j = 10;
        long jIPb = mzxMN != null ? (long) mzxMN.IPb() : 10L;
        if (jIPb <= 0) {
            mzxMN.EYQ(10.0d);
        } else {
            j = jIPb;
        }
        this.EYQ = new EYQ(j * 1000, eyq, vwS);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ() throws JSONException {
        this.EYQ.tp();
        KO.EYQ eyq = new KO.EYQ();
        eyq.EYQ(Kbd());
        eyq.Td(QQ());
        eyq.mZx(IPb());
        com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(this.VwS, eyq);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void mZx() throws JSONException {
        this.EYQ.HX();
        KO.EYQ eyq = new KO.EYQ();
        eyq.EYQ(Kbd());
        eyq.Td(QQ());
        eyq.mZx(IPb());
        com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.mZx(this.VwS, eyq);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Td() {
        this.EYQ.MxO();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(boolean z, int i) {
        Td();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Pm() {
        Td();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td) throws JSONException {
        this.Pm = td.QQ();
        if (td.VwS() > 0) {
            this.EYQ.EYQ(td.VwS());
        }
        com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(this.IPb, this.VwS, td);
        this.EYQ.HX();
        return true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public long Kbd() {
        return this.EYQ.KO();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(long j) {
        this.EYQ.EYQ(j);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(boolean z) {
        this.mZx = z;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public long QQ() {
        return this.EYQ.nWX();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public long HX() {
        return Kbd();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public int tp() {
        return com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(this.EYQ.IPb, this.EYQ.EYQ);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void mZx(long j) {
        this.Td = j;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public com.bykv.vk.openvk.component.video.api.EYQ tsL() {
        return this.EYQ;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean nWX() {
        return this.Pm;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void mZx(boolean z) {
        this.Pm = z;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean KO() {
        return this.Kbd;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Td(boolean z) {
        this.Kbd = z;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(Td.EYQ eyq) {
        this.EYQ.EYQ(eyq);
    }

    public com.bykv.vk.openvk.component.video.api.mZx.EYQ Uc() {
        return this.VwS;
    }

    /* compiled from: FakeVideoController.java */
    private static class EYQ implements com.bykv.vk.openvk.component.video.api.EYQ {
        private final long EYQ;
        private long IPb;
        private Td.EYQ Kbd;
        private CountDownTimer Pm;
        private final com.bytedance.sdk.openadsdk.mZx.VwS QQ;
        private int Td = 0;
        private final com.bykv.vk.openvk.component.video.api.mZx.EYQ VwS;
        private long mZx;

        @Override // com.bykv.vk.openvk.component.video.api.EYQ
        public boolean EYQ() {
            return false;
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ
        public int Kbd() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ
        public int Pm() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ
        public boolean Td() {
            return false;
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ
        public boolean mZx() {
            return false;
        }

        public int pi() {
            return 0;
        }

        public long tsL() {
            return 0L;
        }

        public EYQ(long j, com.bykv.vk.openvk.component.video.api.mZx.EYQ eyq, com.bytedance.sdk.openadsdk.mZx.VwS vwS) {
            this.EYQ = j;
            this.VwS = eyq;
            this.QQ = vwS;
        }

        public void HX() {
            if (this.Td == 1) {
                return;
            }
            this.Td = 1;
            final long jNWX = nWX();
            final long j = jNWX - this.mZx;
            CountDownTimer countDownTimer = new CountDownTimer(j, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.Td.EYQ.1
                @Override // android.os.CountDownTimer
                public void onTick(long j2) {
                    long j3 = (j - j2) + EYQ.this.mZx;
                    EYQ.this.IPb = j3;
                    if (EYQ.this.Kbd != null) {
                        EYQ.this.Kbd.EYQ(j3, jNWX);
                    }
                }

                @Override // android.os.CountDownTimer
                public void onFinish() throws JSONException {
                    EYQ.this.Td = 4;
                    if (EYQ.this.Kbd != null) {
                        EYQ.this.Kbd.EYQ(EYQ.this.KO(), 100);
                    }
                    KO.EYQ eyq = new KO.EYQ();
                    eyq.EYQ(jNWX);
                    eyq.Td(jNWX);
                    eyq.mZx(EYQ.this.tsL());
                    eyq.Pm(EYQ.this.pi());
                    com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.mZx(EYQ.this.VwS, eyq, EYQ.this.QQ);
                }
            };
            this.Pm = countDownTimer;
            countDownTimer.start();
        }

        public void tp() {
            this.Td = 2;
            this.mZx = this.IPb;
            CountDownTimer countDownTimer = this.Pm;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.Pm = null;
            }
        }

        public void MxO() {
            this.Td = 0;
            CountDownTimer countDownTimer = this.Pm;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.Pm = null;
            }
            if (this.Kbd != null) {
                this.Kbd = null;
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ
        public boolean IPb() {
            return this.Td == 1;
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ
        public boolean VwS() {
            return this.Td == 2;
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ
        public boolean QQ() {
            return this.Td == 0;
        }

        public long nWX() {
            return this.EYQ;
        }

        public long KO() {
            return this.IPb;
        }

        public void EYQ(long j) {
            this.mZx = j;
        }

        public void EYQ(Td.EYQ eyq) {
            this.Kbd = eyq;
        }
    }
}
