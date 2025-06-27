package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.xt;

/* compiled from: DynamicViewRender.java */
/* loaded from: classes2.dex */
public class Pm extends com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ {
    private final com.bytedance.sdk.component.adexpress.mZx.pi EYQ;
    private final Runnable Pm;
    private final com.bytedance.sdk.component.VwS.QQ Td;
    private com.bytedance.sdk.component.adexpress.mZx.VwS mZx;

    public Pm(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.Pm.QQ qq, com.bytedance.sdk.component.adexpress.mZx.pi piVar, com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ eyq) {
        super(context, themeStatusBroadcastReceiver, z, qq, piVar, eyq);
        this.Td = new com.bytedance.sdk.component.VwS.QQ("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Pm.1
            @Override // java.lang.Runnable
            public void run() {
                Pm.this.EYQ.Td();
                com.bytedance.sdk.openadsdk.core.pi.Td().post(Pm.this.Pm);
            }
        };
        this.Pm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Pm.2
            @Override // java.lang.Runnable
            public void run() {
                if (Pm.this.mZx != null) {
                    Pm pm = Pm.this;
                    Pm.super.EYQ(pm.mZx);
                }
            }
        };
        this.EYQ = piVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ, com.bytedance.sdk.component.adexpress.mZx.Pm
    public void EYQ(com.bytedance.sdk.component.adexpress.mZx.VwS vwS) {
        this.mZx = vwS;
        xt.mZx(this.Td);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ
    public void mZx() {
        super.mZx();
        com.bytedance.sdk.openadsdk.core.pi.Td().removeCallbacks(this.Pm);
    }
}
