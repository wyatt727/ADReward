package com.bytedance.sdk.component.Pm.Pm;

import android.text.TextUtils;

/* compiled from: CacheKeyVisitor.java */
/* loaded from: classes2.dex */
public class Td extends EYQ {
    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public String EYQ() {
        return "generate_key";
    }

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public void EYQ(com.bytedance.sdk.component.Pm.Td.Td td) {
        if (TextUtils.isEmpty(td.Kbd())) {
            com.bytedance.sdk.component.Pm.tsL tslKbd = td.hYh().Kbd();
            td.mZx(tslKbd.EYQ(td));
            td.EYQ(tslKbd.mZx(td));
        }
        td.EYQ(new VwS());
    }
}
