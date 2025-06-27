package com.bytedance.sdk.component.adexpress.mZx;

import com.bytedance.sdk.component.adexpress.mZx.tp;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RenderRealChain.java */
/* loaded from: classes2.dex */
public class tsL implements tp.EYQ {
    KO EYQ;
    private AtomicBoolean Pm = new AtomicBoolean(false);
    private HX Td;
    private List<tp> mZx;

    public tsL(List<tp> list, HX hx) {
        this.mZx = list;
        this.Td = hx;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp.EYQ
    public void EYQ() {
        this.Td.Pm();
        Iterator<tp> it = this.mZx.iterator();
        while (it.hasNext() && !it.next().EYQ(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp.EYQ
    public void EYQ(tp tpVar) {
        int iIndexOf = this.mZx.indexOf(tpVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.mZx.size()) {
                return;
            }
        } while (!this.mZx.get(iIndexOf).EYQ(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp.EYQ
    public boolean mZx(tp tpVar) {
        int iIndexOf = this.mZx.indexOf(tpVar);
        return iIndexOf < this.mZx.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp.EYQ
    public KO mZx() {
        return this.EYQ;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp.EYQ
    public void EYQ(KO ko) {
        this.EYQ = ko;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp.EYQ
    public void EYQ(boolean z) {
        this.Pm.getAndSet(z);
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp.EYQ
    public boolean Td() {
        return this.Pm.get();
    }
}
