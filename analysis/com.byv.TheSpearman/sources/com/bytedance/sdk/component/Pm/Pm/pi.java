package com.bytedance.sdk.component.Pm.Pm;

import com.bytedance.sdk.component.Pm.hu;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: SuccessVisitor.java */
/* loaded from: classes2.dex */
public class pi<T> extends EYQ {
    private T EYQ;
    private boolean Td;
    private com.bytedance.sdk.component.Pm.IPb mZx;

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public String EYQ() {
        return "success";
    }

    public pi(T t, com.bytedance.sdk.component.Pm.IPb iPb, boolean z) {
        this.EYQ = t;
        this.mZx = iPb;
        this.Td = z;
    }

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public void EYQ(com.bytedance.sdk.component.Pm.Td.Td td) {
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

    private Map<String, String> mZx() {
        com.bytedance.sdk.component.Pm.IPb iPb = this.mZx;
        if (iPb != null) {
            return iPb.Kbd();
        }
        return null;
    }

    private void mZx(com.bytedance.sdk.component.Pm.Td.Td td) {
        hu huVarHX = td.HX();
        if (huVarHX != null) {
            huVarHX.EYQ(new com.bytedance.sdk.component.Pm.Td.Pm().EYQ(td, this.EYQ, mZx(), this.Td));
        }
    }
}
