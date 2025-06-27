package com.bytedance.sdk.component.mZx.EYQ.EYQ.EYQ;

import com.bytedance.sdk.component.mZx.EYQ.KO;
import com.bytedance.sdk.component.mZx.EYQ.QQ;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import java.io.IOException;
import java.util.List;

/* compiled from: NetChain.java */
/* loaded from: classes2.dex */
public class mZx implements QQ.EYQ {
    List<QQ> EYQ;
    int Td = 0;
    pi mZx;

    mZx(List<QQ> list, pi piVar) {
        this.EYQ = list;
        this.mZx = piVar;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.QQ.EYQ
    public pi EYQ() {
        return this.mZx;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.QQ.EYQ
    public KO EYQ(pi piVar) throws IOException {
        this.mZx = piVar;
        int i = this.Td + 1;
        this.Td = i;
        if (i >= this.EYQ.size()) {
            return null;
        }
        return this.EYQ.get(this.Td).EYQ(this);
    }
}
