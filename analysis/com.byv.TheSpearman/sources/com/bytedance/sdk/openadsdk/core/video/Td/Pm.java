package com.bytedance.sdk.openadsdk.core.video.Td;

import com.bykv.vk.openvk.component.video.api.EYQ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: SupportReplayMediaPlayer.java */
/* loaded from: classes2.dex */
public class Pm extends com.bykv.vk.openvk.component.video.EYQ.Pm.Pm {
    private final EYQ Pm;
    private final List<mZx> EYQ = Collections.synchronizedList(new ArrayList());
    private int mZx = 1;
    private int Td = 1;

    /* compiled from: SupportReplayMediaPlayer.java */
    public interface mZx extends EYQ.InterfaceC0063EYQ {
        void EYQ(int i, int i2);
    }

    static /* synthetic */ int EYQ(Pm pm) {
        int i = pm.Td;
        pm.Td = i + 1;
        return i;
    }

    public Pm() {
        EYQ eyq = new EYQ();
        this.Pm = eyq;
        super.EYQ(eyq);
        EYQ(500);
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Pm
    public long hu() {
        return super.hu() * this.mZx;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Pm
    public long UB() {
        return super.UB() + ((this.Td - 1) * super.hu());
    }

    public void Td(int i) {
        this.mZx = Math.max(1, i);
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Pm
    public void EYQ(EYQ.InterfaceC0063EYQ interfaceC0063EYQ) {
        if (interfaceC0063EYQ instanceof mZx) {
            if (this.EYQ.contains(interfaceC0063EYQ)) {
                return;
            }
            this.EYQ.add((mZx) interfaceC0063EYQ);
            return;
        }
        super.EYQ(interfaceC0063EYQ);
    }

    public int zF() {
        return this.Td;
    }

    /* compiled from: SupportReplayMediaPlayer.java */
    private class EYQ implements EYQ.InterfaceC0063EYQ {
        private EYQ() {
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
            Pm.EYQ(Pm.this);
            if (Pm.this.Td <= Pm.this.mZx) {
                Iterator it = Pm.this.EYQ.iterator();
                while (it.hasNext()) {
                    ((mZx) it.next()).EYQ(Pm.this.Td, Pm.this.mZx);
                }
                Pm.this.HX();
                return;
            }
            Iterator it2 = Pm.this.EYQ.iterator();
            while (it2.hasNext()) {
                ((mZx) it2.next()).EYQ(eyq);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, long j) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).EYQ(eyq, j);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void mZx(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).mZx(eyq);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, com.bykv.vk.openvk.component.video.api.Td.EYQ eyq2) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).EYQ(eyq, eyq2);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, boolean z) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).EYQ(eyq, z);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void Td(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).Td(eyq);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i, int i2) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).EYQ(eyq, i, i2);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i, int i2, int i3) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).EYQ(eyq, i, i2, i3);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).EYQ(eyq, i);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void mZx(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).mZx(eyq, i);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, long j, long j2) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).EYQ(eyq, j, j2);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void Pm(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).Pm(eyq);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
        public void Kbd(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
            Iterator it = Pm.this.EYQ.iterator();
            while (it.hasNext()) {
                ((mZx) it.next()).Kbd(eyq);
            }
        }
    }
}
