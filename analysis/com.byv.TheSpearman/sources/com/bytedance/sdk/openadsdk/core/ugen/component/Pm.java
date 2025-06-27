package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.KO;
import com.bytedance.sdk.component.adexpress.mZx.QQ;
import com.bytedance.sdk.component.adexpress.mZx.VwS;
import com.bytedance.sdk.component.adexpress.mZx.nWX;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import com.bytedance.sdk.component.adexpress.mZx.tp;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: UGenRenderInterceptor.java */
/* loaded from: classes2.dex */
public class Pm implements tp {
    private Context EYQ;
    private AtomicBoolean Kbd = new AtomicBoolean(false);
    private ScheduledFuture<?> Pm;
    private pi Td;
    private com.bytedance.sdk.openadsdk.core.ugen.Td.Td mZx;

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp
    public void EYQ() {
    }

    public Pm(Context context, com.bytedance.sdk.openadsdk.core.ugen.Td.Td td, QQ qq, pi piVar) {
        this.EYQ = context;
        this.mZx = td;
        this.Td = piVar;
        this.mZx.EYQ(qq);
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp
    public boolean EYQ(final tp.EYQ eyq) {
        int iIPb = this.Td.IPb();
        if (iIPb < 0) {
            EYQ(eyq, 137, "time is ".concat(String.valueOf(iIPb)));
        } else {
            this.Pm = xt.EYQ().schedule(new EYQ(1, eyq), iIPb, TimeUnit.MILLISECONDS);
            this.mZx.EYQ(new VwS() { // from class: com.bytedance.sdk.openadsdk.core.ugen.component.Pm.1
                @Override // com.bytedance.sdk.component.adexpress.mZx.VwS
                public void EYQ(View view, nWX nwx) {
                    Pm.this.mZx();
                    if (eyq.Td()) {
                        return;
                    }
                    KO ko = new KO();
                    ko.EYQ(0);
                    ((com.bytedance.sdk.openadsdk.core.ugen.Td.EYQ) Pm.this.Td).rfB().EYQ(ko);
                    Pm.this.Td.Kbd().tp();
                    com.bytedance.sdk.component.adexpress.mZx.KO koMZx = eyq.mZx();
                    if (koMZx == null) {
                        return;
                    }
                    koMZx.EYQ(Pm.this.mZx, nwx);
                    eyq.EYQ(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.mZx.VwS
                public void EYQ(int i, String str) {
                    Pm.this.EYQ(eyq, i, str);
                }
            });
        }
        return true;
    }

    /* compiled from: UGenRenderInterceptor.java */
    private class EYQ implements Runnable {
        tp.EYQ EYQ;
        private int Td;

        EYQ(int i, tp.EYQ eyq) {
            this.Td = i;
            this.EYQ = eyq;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.Td == 1) {
                Pm.this.mZx.EYQ(true);
                Pm.this.EYQ(this.EYQ, 137, "time out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(tp.EYQ eyq, int i, String str) {
        com.bytedance.sdk.component.adexpress.mZx.KO koMZx;
        if (eyq.Td() || this.Kbd.get()) {
            return;
        }
        mZx();
        KO ko = new KO();
        ko.EYQ(i);
        ko.EYQ(str);
        ((com.bytedance.sdk.openadsdk.core.ugen.Td.EYQ) this.Td).rfB().EYQ(ko);
        if (eyq.mZx(this)) {
            eyq.EYQ(this);
        } else {
            if (eyq.Td() || (koMZx = eyq.mZx()) == null) {
                return;
            }
            eyq.EYQ(true);
            koMZx.a_(i);
        }
        this.Kbd.getAndSet(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx() {
        try {
            ScheduledFuture<?> scheduledFuture = this.Pm;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.Pm.cancel(false);
            this.Pm = null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }
}
