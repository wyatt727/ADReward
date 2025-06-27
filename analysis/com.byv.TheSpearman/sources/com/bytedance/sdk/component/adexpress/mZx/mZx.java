package com.bytedance.sdk.component.adexpress.mZx;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.mZx.tp;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* compiled from: DynamicRenderInterceptor.java */
/* loaded from: classes2.dex */
public class mZx implements tp {
    private Context EYQ;
    private int IPb;
    private pi Kbd;
    private QQ Pm;
    private ThemeStatusBroadcastReceiver Td;
    private com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ mZx;

    public mZx(Context context, pi piVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.Pm.QQ qq, QQ qq2, com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ eyq, com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ eyq2) {
        this.EYQ = context;
        this.Kbd = piVar;
        this.Td = themeStatusBroadcastReceiver;
        this.Pm = qq2;
        if (eyq2 != null) {
            this.mZx = eyq2;
        } else {
            this.mZx = new com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ(context, themeStatusBroadcastReceiver, z, qq, piVar, eyq);
        }
        this.mZx.EYQ(this.Pm);
        if (qq instanceof com.bytedance.sdk.component.adexpress.dynamic.Pm.VwS) {
            this.IPb = 3;
        } else {
            this.IPb = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp
    public boolean EYQ(final tp.EYQ eyq) {
        this.Kbd.Kbd().EYQ(this.IPb);
        this.mZx.EYQ(new VwS() { // from class: com.bytedance.sdk.component.adexpress.mZx.mZx.1
            @Override // com.bytedance.sdk.component.adexpress.mZx.VwS
            public void EYQ(View view, nWX nwx) {
                if (eyq.Td()) {
                    return;
                }
                mZx.this.Kbd.Kbd().Kbd(mZx.this.IPb);
                mZx.this.Kbd.Kbd().IPb(mZx.this.IPb);
                mZx.this.Kbd.Kbd().tp();
                KO koMZx = eyq.mZx();
                if (koMZx == null) {
                    return;
                }
                koMZx.EYQ(mZx.this.mZx, nwx);
                eyq.EYQ(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.mZx.VwS
            public void EYQ(int i, String str) {
                mZx.this.Kbd.Kbd().EYQ(mZx.this.IPb, i, str, eyq.mZx(mZx.this));
                if (eyq.mZx(mZx.this)) {
                    eyq.EYQ(mZx.this);
                    return;
                }
                KO koMZx = eyq.mZx();
                if (koMZx == null) {
                    return;
                }
                koMZx.a_(i);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp
    public void EYQ() {
        com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ eyq = this.mZx;
        if (eyq != null) {
            eyq.mZx();
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.Pm mZx() {
        com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ eyq = this.mZx;
        if (eyq != null) {
            return eyq.Pm();
        }
        return null;
    }
}
