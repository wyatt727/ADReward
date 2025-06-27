package com.bytedance.sdk.component.Pm.Pm;

/* compiled from: RawCacheVisitor.java */
/* loaded from: classes2.dex */
public class tsL extends EYQ {
    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public String EYQ() {
        return "raw_cache";
    }

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public void EYQ(com.bytedance.sdk.component.Pm.Td.Td td) {
        byte[] bArrEYQ = td.hYh().mZx(td.zF()).EYQ(td.tp());
        if (bArrEYQ == null) {
            td.EYQ(new IPb());
        } else {
            td.EYQ(new mZx(bArrEYQ, null));
        }
    }
}
