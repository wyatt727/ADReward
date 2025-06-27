package com.bytedance.sdk.component.Kbd.EYQ.EYQ;

import com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.VwS;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.util.List;
import java.util.Queue;

/* compiled from: RealTimeMemoryCacheStrategy.java */
/* loaded from: classes2.dex */
public class IPb implements Pm {
    Kbd EYQ = QQ.VwS().Pm();
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ HX;
    private com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.Td IPb;
    private VwS Kbd;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ MxO;
    private com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.mZx Pm;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ QQ;
    private com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.EYQ Td;
    private com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.IPb VwS;
    private com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.Kbd mZx;
    private Queue<String> nWX;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ pi;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ tp;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ tsL;

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public void EYQ(int i, long j) {
    }

    public IPb(Queue<String> queue) {
        this.nWX = queue;
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ()) {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyqTsL = QQ.VwS().tsL();
            this.QQ = eyqTsL;
            this.mZx = new com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.Kbd(eyqTsL, queue);
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Kbd()) {
            if (QQ.VwS().tp() != null) {
                this.tp = QQ.VwS().tp();
            } else {
                this.tp = QQ.VwS().pi();
            }
            this.Pm = new com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.mZx(this.tp, queue);
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.mZx()) {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyqPi = QQ.VwS().pi();
            this.HX = eyqPi;
            this.Td = new com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.EYQ(eyqPi, queue);
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Td()) {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyqPi2 = QQ.VwS().pi();
            this.MxO = eyqPi2;
            this.Kbd = new VwS(eyqPi2, queue);
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Pm()) {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyqNWX = QQ.VwS().nWX();
            this.tsL = eyqNWX;
            this.IPb = new com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.Td(eyqNWX, queue);
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.IPb()) {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyqKO = QQ.VwS().KO();
            this.pi = eyqKO;
            this.VwS = new com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.IPb(eyqKO, queue);
        }
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq, int i) {
        try {
            byte bPm = eyq.Pm();
            byte bKbd = eyq.Kbd();
            if (bPm == 0 && bKbd == 1 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ()) {
                this.mZx.EYQ(eyq);
                return;
            }
            if (bPm == 3 && bKbd == 2 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Kbd()) {
                this.Pm.EYQ(eyq);
                return;
            }
            if (bPm == 0 && bKbd == 2 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.mZx()) {
                this.Td.EYQ(eyq);
                return;
            }
            if (bPm == 1 && bKbd == 2 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Td()) {
                this.Kbd.EYQ(eyq);
                return;
            }
            if (bPm == 1 && bKbd == 3 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Pm()) {
                this.IPb.EYQ(eyq);
            } else if (bPm == 2 && bKbd == 3 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.IPb()) {
                this.VwS.EYQ(eyq);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public void EYQ(int i, List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq = list.get(0);
        byte bKbd = eyq.Kbd();
        byte bPm = eyq.Pm();
        if (bPm == 0 && bKbd == 1 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ()) {
            this.mZx.EYQ(i, list);
            return;
        }
        if (bPm == 3 && bKbd == 2 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Kbd()) {
            this.Pm.EYQ(i, list);
            return;
        }
        if (bPm == 0 && bKbd == 2 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.mZx()) {
            this.Td.EYQ(i, list);
            return;
        }
        if (bPm == 1 && bKbd == 2 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Td()) {
            this.Kbd.EYQ(i, list);
            return;
        }
        if (bPm == 1 && bKbd == 3 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Pm()) {
            this.IPb.EYQ(i, list);
        } else if (bPm == 2 && bKbd == 3 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.IPb()) {
            this.VwS.EYQ(i, list);
        }
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> EYQ(int i, int i2, List<String> list) {
        List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ;
        List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ2;
        List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ3;
        List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ4;
        List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ5;
        List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ6;
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ() && this.mZx.mZx(i, i2) && (listEYQ6 = this.mZx.EYQ(i, i2)) != null && listEYQ6.size() != 0) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.Uc(), 1);
            return listEYQ6;
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Kbd() && this.Pm.mZx(i, i2) && (listEYQ5 = this.Pm.EYQ(i, i2)) != null && listEYQ5.size() != 0) {
            return listEYQ5;
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.mZx() && this.Td.mZx(i, i2) && (listEYQ4 = this.Td.EYQ(i, i2)) != null && listEYQ4.size() != 0) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.hYh(), 1);
            return listEYQ4;
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Td() && this.Kbd.mZx(i, i2) && (listEYQ3 = this.Kbd.EYQ(i, i2)) != null && listEYQ3.size() != 0) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.zF(), 1);
            return listEYQ3;
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Pm() && this.IPb.mZx(i, i2) && (listEYQ2 = this.IPb.EYQ(i, i2)) != null && listEYQ2.size() != 0) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.WU(), 1);
            return listEYQ2;
        }
        if (!com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.IPb() || !this.VwS.mZx(i, i2) || (listEYQ = this.VwS.EYQ(i, i2)) == null || listEYQ.size() == 0) {
            return null;
        }
        return listEYQ;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public boolean EYQ(int i, boolean z) {
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.IPb iPb;
        com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq;
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.Td td;
        com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq2;
        VwS vwS;
        com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq3;
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.EYQ eyq4;
        com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq5;
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.mZx mzx;
        com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq6;
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx.Kbd kbd;
        com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyq7;
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ() && (kbd = this.mZx) != null && (eyq7 = this.QQ) != null && kbd.mZx(i, eyq7.EYQ())) {
            return true;
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Kbd() && (mzx = this.Pm) != null && (eyq6 = this.tp) != null && mzx.mZx(i, eyq6.EYQ())) {
            return true;
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.mZx() && (eyq4 = this.Td) != null && (eyq5 = this.HX) != null && eyq4.mZx(i, eyq5.EYQ())) {
            return true;
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Td() && (vwS = this.Kbd) != null && (eyq3 = this.MxO) != null && vwS.mZx(i, eyq3.EYQ())) {
            return true;
        }
        if (!com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Pm() || (td = this.IPb) == null || (eyq2 = this.tsL) == null || !td.mZx(i, eyq2.EYQ())) {
            return com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.IPb() && (iPb = this.VwS) != null && (eyq = this.pi) != null && iPb.mZx(i, eyq.EYQ());
        }
        return true;
    }
}
