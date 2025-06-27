package com.bytedance.sdk.component.Pm.Pm;

import com.bytedance.sdk.component.Pm.hu;
import com.json.t2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FailVisitor.java */
/* loaded from: classes2.dex */
public class QQ extends EYQ {
    private Throwable EYQ;
    private String Td;
    private int mZx;

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public String EYQ() {
        return t2.h.t;
    }

    public QQ(int i, String str, Throwable th) {
        this.mZx = i;
        this.Td = str;
        this.EYQ = th;
    }

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public void EYQ(com.bytedance.sdk.component.Pm.Td.Td td) {
        td.EYQ(new com.bytedance.sdk.component.Pm.Td.EYQ(this.mZx, this.Td, this.EYQ));
        String strNZ = td.NZ();
        Map<String, List<com.bytedance.sdk.component.Pm.Td.Td>> mapVwS = td.hYh().VwS();
        List<com.bytedance.sdk.component.Pm.Td.Td> list = mapVwS.get(strNZ);
        if (list == null) {
            mZx(td);
            return;
        }
        synchronized (list) {
            Iterator<com.bytedance.sdk.component.Pm.Td.Td> it = list.iterator();
            while (it.hasNext()) {
                mZx(it.next());
            }
            list.clear();
            mapVwS.remove(strNZ);
        }
    }

    private void mZx(com.bytedance.sdk.component.Pm.Td.Td td) {
        hu huVarHX = td.HX();
        if (huVarHX != null) {
            huVarHX.EYQ(this.mZx, this.Td, this.EYQ);
        }
    }
}
