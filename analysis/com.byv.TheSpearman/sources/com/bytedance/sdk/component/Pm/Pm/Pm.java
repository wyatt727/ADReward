package com.bytedance.sdk.component.Pm.Pm;

/* compiled from: CachePolicyVisitor.java */
/* loaded from: classes2.dex */
public class Pm extends EYQ {
    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public String EYQ() {
        return "cache_policy";
    }

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public void EYQ(com.bytedance.sdk.component.Pm.Td.Td td) {
        com.bytedance.sdk.component.Pm.mZx mzxZF = td.zF();
        if (mzxZF != null) {
            if (mzxZF.Td()) {
                td.EYQ(new tp());
                return;
            } else if (mzxZF.Pm()) {
                td.EYQ(new IPb());
                return;
            }
        }
        td.EYQ(new MxO());
    }
}
