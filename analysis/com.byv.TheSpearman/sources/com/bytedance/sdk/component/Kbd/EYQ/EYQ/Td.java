package com.bytedance.sdk.component.Kbd.EYQ.EYQ;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.VwS;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.util.Iterator;
import java.util.List;

/* compiled from: DBCacheStrategy.java */
/* loaded from: classes2.dex */
public class Td implements Pm {
    private com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Pm EYQ;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ HX;
    private com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Kbd IPb;
    private com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.IPb Kbd;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ MxO;
    private VwS Pm;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ QQ;
    private com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.mZx Td;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ VwS;
    private com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.EYQ mZx;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ tp;
    private com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ tsL;

    public Td() {
        Context contextIPb = QQ.VwS().IPb();
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ()) {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyqTsL = QQ.VwS().tsL();
            this.VwS = eyqTsL;
            this.EYQ = new com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Pm(contextIPb, eyqTsL);
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Kbd()) {
            if (QQ.VwS().tp() != null) {
                this.HX = QQ.VwS().tp();
            } else {
                this.HX = QQ.VwS().pi();
            }
            this.Td = new com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.mZx(contextIPb, this.HX);
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.mZx()) {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyqPi = QQ.VwS().pi();
            this.QQ = eyqPi;
            this.mZx = new com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.EYQ(contextIPb, eyqPi);
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Td()) {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyqPi2 = QQ.VwS().pi();
            this.tp = eyqPi2;
            this.Pm = new VwS(contextIPb, eyqPi2);
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Pm()) {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyqNWX = QQ.VwS().nWX();
            this.MxO = eyqNWX;
            this.Kbd = new com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.IPb(contextIPb, eyqNWX);
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.IPb()) {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx.EYQ eyqKO = QQ.VwS().KO();
            this.tsL = eyqKO;
            this.IPb = new com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Kbd(contextIPb, eyqKO);
        }
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq, int i) {
        if (eyq == null) {
            return;
        }
        try {
            eyq.mZx(System.currentTimeMillis());
            if (eyq.Pm() == 0 && eyq.Kbd() == 1) {
                if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ()) {
                    this.EYQ.EYQ(eyq);
                    return;
                }
                return;
            }
            if (eyq.Pm() == 3 && eyq.Kbd() == 2) {
                if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Kbd()) {
                    this.Td.EYQ(eyq);
                    return;
                }
                return;
            }
            if (eyq.Pm() == 0 && eyq.Kbd() == 2) {
                if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.mZx()) {
                    this.mZx.EYQ(eyq);
                    return;
                }
                return;
            }
            if (eyq.Pm() == 1 && eyq.Kbd() == 2) {
                if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Td()) {
                    this.Pm.EYQ(eyq);
                }
            } else if (eyq.Pm() == 1 && eyq.Kbd() == 3) {
                if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Pm()) {
                    this.Kbd.EYQ(eyq);
                }
            } else if (eyq.Pm() == 2 && eyq.Kbd() == 3 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.IPb()) {
                this.IPb.EYQ(eyq);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.FtN(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public void EYQ(int i, List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq = list.get(0);
        if (i == 200 || i == -1) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.VOV(), list.size());
            if (i != 200) {
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.xh(), list.size());
            }
            if (eyq.Pm() == 0 && eyq.Kbd() == 1) {
                if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ()) {
                    this.EYQ.mZx(list);
                    return;
                }
                return;
            }
            if (eyq.Pm() == 3 && eyq.Kbd() == 2) {
                if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Kbd()) {
                    this.Td.mZx(list);
                    return;
                }
                return;
            }
            if (eyq.Pm() == 0 && eyq.Kbd() == 2) {
                if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.mZx()) {
                    this.mZx.mZx(list);
                    return;
                }
                return;
            }
            if (eyq.Pm() == 1 && eyq.Kbd() == 2) {
                if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Td()) {
                    this.Pm.mZx(list);
                }
            } else if (eyq.Pm() == 1 && eyq.Kbd() == 3) {
                if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Pm()) {
                    this.Kbd.mZx(list);
                }
            } else if (eyq.Pm() == 2 && eyq.Kbd() == 3 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.IPb()) {
                this.IPb.mZx(list);
            }
        }
    }

    public List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> mZx(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq, int i) {
        if (eyq.Pm() == 0 && eyq.Kbd() == 1 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ()) {
            if (this.VwS.mZx() <= i) {
                return null;
            }
            List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ = this.EYQ.EYQ(this.VwS.mZx() - i, "_id");
            if (listEYQ != null && listEYQ.size() != 0) {
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.lEs(), 1);
            }
            return listEYQ;
        }
        if (eyq.Pm() == 3 && eyq.Kbd() == 2 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Kbd()) {
            if (this.HX.mZx() > i) {
                return this.Td.EYQ(this.HX.mZx() - i, "_id");
            }
        } else if (eyq.Pm() == 0 && eyq.Kbd() == 2 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.mZx()) {
            if (this.QQ.mZx() > i) {
                List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ2 = this.mZx.EYQ(this.QQ.mZx() - i, "_id");
                if (listEYQ2 != null && listEYQ2.size() != 0) {
                    com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.xt(), 1);
                }
                return listEYQ2;
            }
        } else if (eyq.Pm() == 1 && eyq.Kbd() == 2 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Td()) {
            if (this.tp.mZx() > i) {
                List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ3 = this.Pm.EYQ(this.tp.mZx() - i, "_id");
                if (listEYQ3 != null && listEYQ3.size() != 0) {
                    com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.Nvm(), 1);
                }
                return listEYQ3;
            }
        } else if (eyq.Pm() == 1 && eyq.Kbd() == 3 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Pm()) {
            if (this.MxO.mZx() > i) {
                List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ4 = this.Kbd.EYQ(this.MxO.mZx() - i, "_id");
                if (listEYQ4 != null && listEYQ4.size() != 0) {
                    com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.FH(), 1);
                }
                return listEYQ4;
            }
        } else if (eyq.Pm() == 2 && eyq.Kbd() == 3 && com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.IPb() && this.tsL.mZx() > i) {
            return this.IPb.EYQ(this.tsL.mZx() - i, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> EYQ(int i, int i2, List<String> list) {
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ()) {
            List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ = this.EYQ.EYQ("_id");
            if (EYQ(listEYQ, list)) {
                listEYQ.size();
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.NZ(), 1);
                return listEYQ;
            }
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Kbd()) {
            List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ2 = this.Td.EYQ("_id");
            if (EYQ(listEYQ2, list)) {
                listEYQ2.size();
                return listEYQ2;
            }
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.mZx()) {
            List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ3 = this.mZx.EYQ("_id");
            if (EYQ(listEYQ3, list)) {
                listEYQ3.size();
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.tPj(), 1);
                return listEYQ3;
            }
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Td()) {
            List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listMZx = this.Pm.mZx("_id");
            if (EYQ(listMZx, list)) {
                listMZx.size();
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.wBa(), 1);
                return listMZx;
            }
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Pm()) {
            List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listMZx2 = this.Kbd.mZx("_id");
            if (EYQ(listMZx2, list)) {
                listMZx2.size();
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.rfB(), 1);
                return listMZx2;
            }
        }
        if (!com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.IPb()) {
            return null;
        }
        List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listMZx3 = this.IPb.mZx("_id");
        if (!EYQ(listMZx3, list)) {
            return null;
        }
        listMZx3.size();
        return listMZx3;
    }

    private boolean EYQ(List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ next = it.next();
                    if (next != null) {
                        String strTd = next.Td();
                        if (!TextUtils.isEmpty(strTd) && list2.contains(strTd)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public boolean EYQ(int i, boolean z) {
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Kbd kbd;
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.IPb iPb;
        VwS vwS;
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.EYQ eyq;
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.mZx mzx;
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Pm pm;
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.EYQ() && (pm = this.EYQ) != null && pm.EYQ(i)) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.nWX(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Kbd() && (mzx = this.Td) != null && mzx.EYQ(i)) {
            return true;
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.mZx() && (eyq = this.mZx) != null && eyq.EYQ(i)) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.KO(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Td() && (vwS = this.Pm) != null && vwS.EYQ(i)) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.hu(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.Pm() || (iPb = this.Kbd) == null || !iPb.EYQ(i)) {
            return com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ.IPb() && (kbd = this.IPb) != null && kbd.EYQ(i);
        }
        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.UB(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm
    public void EYQ(int i, long j) {
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Pm pm = this.EYQ;
        if (pm != null) {
            pm.EYQ(i, j);
        }
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.mZx mzx = this.Td;
        if (mzx != null) {
            mzx.EYQ(i, j);
        }
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.EYQ eyq = this.mZx;
        if (eyq != null) {
            eyq.EYQ(i, j);
        }
        VwS vwS = this.Pm;
        if (vwS != null) {
            vwS.EYQ(i, j);
        }
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.IPb iPb = this.Kbd;
        if (iPb != null) {
            iPb.EYQ(i, j);
        }
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Kbd kbd = this.IPb;
        if (kbd != null) {
            kbd.EYQ(i, j);
        }
    }
}
