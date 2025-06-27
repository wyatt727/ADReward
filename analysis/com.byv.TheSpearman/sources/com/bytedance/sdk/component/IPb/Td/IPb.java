package com.bytedance.sdk.component.IPb.Td;

import com.bytedance.sdk.component.mZx.EYQ.KO;
import com.bytedance.sdk.component.mZx.EYQ.QQ;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import java.io.IOException;

/* compiled from: TncHostInterceptor.java */
/* loaded from: classes2.dex */
public class IPb implements QQ {
    private int EYQ;

    public void EYQ(int i) {
        this.EYQ = i;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.QQ
    public KO EYQ(QQ.EYQ eyq) throws IOException {
        IOException iOException;
        pi piVarEYQ = eyq.EYQ();
        if (VwS.EYQ().EYQ(this.EYQ).mZx() != null) {
            VwS.EYQ().EYQ(this.EYQ).mZx().Kbd();
        }
        String string = piVarEYQ.mZx().toString();
        String strEYQ = VwS.EYQ().EYQ(this.EYQ).EYQ(string);
        if (!string.equals(strEYQ)) {
            piVarEYQ = piVarEYQ.VwS().EYQ(strEYQ).mZx();
        }
        KO koEYQ = null;
        try {
            iOException = null;
            koEYQ = eyq.EYQ(piVarEYQ);
        } catch (Exception e) {
            iOException = new IOException(e.getMessage());
            VwS.EYQ().EYQ(this.EYQ).EYQ(piVarEYQ, e);
        }
        VwS.EYQ().EYQ(this.EYQ).EYQ(piVarEYQ, koEYQ);
        if (iOException == null) {
            return koEYQ == null ? eyq.EYQ(piVarEYQ) : koEYQ;
        }
        throw iOException;
    }
}
