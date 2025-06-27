package com.bytedance.sdk.component.mZx.EYQ.EYQ.EYQ;

import android.text.TextUtils;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import com.bytedance.sdk.component.mZx.EYQ.pi;

/* compiled from: NetClient.java */
/* loaded from: classes2.dex */
public class Td extends MxO {
    public Pm QQ;

    public Td(MxO.EYQ eyq) {
        super(eyq);
        this.QQ = new Pm();
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.MxO
    public com.bytedance.sdk.component.mZx.EYQ.Pm EYQ() {
        return this.QQ;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.MxO
    public com.bytedance.sdk.component.mZx.EYQ.mZx EYQ(pi piVar) {
        piVar.EYQ(this);
        if (piVar == null || piVar.mZx() == null || piVar.mZx().EYQ() == null || TextUtils.isEmpty(piVar.mZx().EYQ().toString())) {
            return null;
        }
        EYQ eyq = new EYQ(piVar, this.QQ);
        this.QQ.Td().add(eyq);
        return eyq;
    }
}
