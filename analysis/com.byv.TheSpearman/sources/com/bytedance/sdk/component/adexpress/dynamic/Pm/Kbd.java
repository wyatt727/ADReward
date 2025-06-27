package com.bytedance.sdk.component.adexpress.dynamic.Pm;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.Pm.mZx;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import com.json.td;
import java.util.Iterator;
import java.util.List;

/* compiled from: DynamicCanvas.java */
/* loaded from: classes2.dex */
public class Kbd {
    public com.bytedance.sdk.component.adexpress.dynamic.Td.mZx EYQ;
    private EYQ Pm;
    private com.bytedance.sdk.component.adexpress.dynamic.Td.QQ Td;
    protected mZx mZx;

    /* compiled from: DynamicCanvas.java */
    static class EYQ {
        float EYQ;
        float Td;
        float mZx;

        EYQ() {
        }
    }

    public Kbd(double d, int i, double d2, String str, pi piVar) {
        this.mZx = new mZx(d, i, d2, str, piVar);
    }

    public void EYQ(EYQ eyq) {
        this.Pm = eyq;
    }

    public void EYQ() {
        this.mZx.EYQ();
    }

    public void EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq, float f, float f2) {
        if (qq != null) {
            this.Td = qq;
        }
        com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq2 = this.Td;
        float fQQ = qq2.QQ();
        float fHX = qq2.HX();
        float f3 = TextUtils.equals(qq2.tp().Kbd().rfB(), "fixed") ? fHX : 65536.0f;
        this.mZx.EYQ();
        this.mZx.Td(qq2, fQQ, f3);
        mZx.Td tdEYQ = this.mZx.EYQ(qq2);
        com.bytedance.sdk.component.adexpress.dynamic.Td.mZx mzx = new com.bytedance.sdk.component.adexpress.dynamic.Td.mZx();
        mzx.EYQ = f;
        mzx.mZx = f2;
        if (tdEYQ != null) {
            fQQ = tdEYQ.EYQ;
        }
        mzx.Td = fQQ;
        if (tdEYQ != null) {
            fHX = tdEYQ.mZx;
        }
        mzx.Pm = fHX;
        mzx.Kbd = td.y;
        mzx.HX = 1280.0f;
        mzx.IPb = qq2;
        mzx.IPb.Td(mzx.EYQ);
        mzx.IPb.Pm(mzx.mZx);
        mzx.IPb.Kbd(mzx.Td);
        mzx.IPb.IPb(mzx.Pm);
        com.bytedance.sdk.component.adexpress.dynamic.Td.mZx mzxEYQ = EYQ(mzx, 0.0f);
        this.EYQ = mzxEYQ;
        EYQ(mzxEYQ);
    }

    public void EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.mZx mzx) {
        if (mzx == null) {
            return;
        }
        mzx.IPb.tp().mZx();
        float f = mzx.Td;
        float f2 = mzx.Pm;
        float f3 = mzx.EYQ;
        float f4 = mzx.mZx;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.Td.mZx>> list = mzx.VwS;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.Td.mZx> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.Td.mZx> it = list2.iterator();
                while (it.hasNext()) {
                    EYQ(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.component.adexpress.dynamic.Td.mZx EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.mZx r37, float r38) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.Pm.Kbd.EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.mZx, float):com.bytedance.sdk.component.adexpress.dynamic.Td.mZx");
    }

    private com.bytedance.sdk.component.adexpress.dynamic.Td.HX EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPb, mZx.Td td, mZx.Td td2) {
        float fCsQ = iPb.CsQ();
        float fBQ = iPb.BQ();
        float fWG = iPb.wG();
        float fAEX = iPb.aEX();
        boolean zDVQ = iPb.dVQ();
        boolean zGfQ = iPb.GfQ();
        boolean zBy = iPb.by();
        boolean zVEW = iPb.VEW();
        if (!zDVQ) {
            if (zGfQ) {
                fCsQ = ((this.Pm.EYQ != 0.0f ? Math.min(this.Pm.EYQ, td.EYQ) : td.EYQ) - fWG) - td2.EYQ;
            } else {
                fCsQ = 0.0f;
            }
        }
        if (!zBy) {
            if (zVEW) {
                fBQ = ((this.Pm.mZx != 0.0f ? this.Pm.mZx : td.mZx) - fAEX) - td2.mZx;
            } else {
                fBQ = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.Td.HX(fCsQ, fBQ);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.Td.HX EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.mZx mzx, com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPb, float f, float f2) {
        float f3;
        float f4;
        float f5 = mzx.EYQ;
        float f6 = mzx.mZx;
        float fCsQ = iPb.CsQ();
        float fBQ = iPb.BQ();
        float fWG = iPb.wG();
        float fAEX = iPb.aEX();
        boolean zDVQ = iPb.dVQ();
        boolean zGfQ = iPb.GfQ();
        boolean zBy = iPb.by();
        boolean zVEW = iPb.VEW();
        String strXh = iPb.xh();
        float f7 = mzx.Td;
        float f8 = mzx.Pm;
        if (TextUtils.equals(strXh, "0")) {
            if (zDVQ) {
                f5 = mzx.EYQ + fCsQ;
            } else if (zGfQ) {
                f5 = ((mzx.EYQ + f7) - fWG) - f;
            }
            if (zBy) {
                f4 = mzx.mZx;
                f6 = f4 + fBQ;
            } else if (zVEW) {
                f3 = mzx.mZx;
                f6 = ((f3 + f8) - fAEX) - f2;
            }
        } else if (TextUtils.equals(strXh, "1")) {
            f5 = mzx.EYQ + ((f7 - f) / 2.0f);
            if (zBy) {
                f4 = mzx.mZx;
                f6 = f4 + fBQ;
            } else if (zVEW) {
                f3 = mzx.mZx;
                f6 = ((f3 + f8) - fAEX) - f2;
            }
        } else if (TextUtils.equals(strXh, "2")) {
            f6 = mzx.mZx + ((f8 - f2) / 2.0f);
            if (zDVQ) {
                f5 = mzx.EYQ + fCsQ;
            } else if (zGfQ) {
                f5 = ((mzx.EYQ + f7) - fWG) - f;
            }
        } else if (TextUtils.equals(strXh, "3")) {
            f5 = mzx.EYQ + ((f7 - f) / 2.0f);
            f6 = mzx.mZx + ((f8 - f2) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.Td.HX(f5, f6);
    }
}
