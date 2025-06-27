package com.bytedance.sdk.component.adexpress.mZx;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.mZx.tp;

/* compiled from: NativeRenderInterceptor.java */
/* loaded from: classes2.dex */
public class IPb implements tp {
    private Context EYQ;
    private pi Td;
    private EYQ mZx;

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp
    public void EYQ() {
    }

    public IPb(Context context, pi piVar, EYQ eyq) {
        this.EYQ = context;
        this.mZx = eyq;
        this.Td = piVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp
    public boolean EYQ(final tp.EYQ eyq) {
        this.Td.Kbd().IPb();
        this.mZx.EYQ(new VwS() { // from class: com.bytedance.sdk.component.adexpress.mZx.IPb.1
            @Override // com.bytedance.sdk.component.adexpress.mZx.VwS
            public void EYQ(View view, nWX nwx) {
                if (eyq.Td()) {
                    return;
                }
                KO koMZx = eyq.mZx();
                if (koMZx != null) {
                    koMZx.EYQ(IPb.this.mZx, nwx);
                }
                eyq.EYQ(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.mZx.VwS
            public void EYQ(int i, String str) {
                KO koMZx = eyq.mZx();
                if (koMZx != null) {
                    koMZx.a_(i);
                }
            }
        });
        return true;
    }

    public void EYQ(Td td) {
        this.mZx.EYQ(td);
    }
}
