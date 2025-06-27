package com.bytedance.sdk.component.adexpress.mZx;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.mZx.tp;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WebViewRenderInterceptor.java */
/* loaded from: classes2.dex */
public class hu implements tp {
    private Context EYQ;
    private AtomicBoolean IPb = new AtomicBoolean(false);
    private ScheduledFuture<?> Kbd;
    private pi Pm;
    private QQ Td;
    private com.bytedance.sdk.component.adexpress.Kbd.EYQ mZx;

    public hu(Context context, pi piVar, com.bytedance.sdk.component.adexpress.Kbd.EYQ eyq, QQ qq) {
        this.EYQ = context;
        this.Pm = piVar;
        this.Td = qq;
        this.mZx = eyq;
        eyq.EYQ(this.Td);
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp
    public boolean EYQ(final tp.EYQ eyq) {
        int iIPb = this.Pm.IPb();
        if (iIPb < 0) {
            EYQ(eyq, 107, "time is ".concat(String.valueOf(iIPb)));
        } else {
            this.Kbd = com.bytedance.sdk.component.VwS.IPb.IPb().schedule(new EYQ(1, eyq), iIPb, TimeUnit.MILLISECONDS);
            this.mZx.EYQ(new VwS() { // from class: com.bytedance.sdk.component.adexpress.mZx.hu.1
                @Override // com.bytedance.sdk.component.adexpress.mZx.VwS
                public void EYQ(View view, nWX nwx) {
                    KO koMZx;
                    hu.this.Td();
                    if (eyq.Td() || (koMZx = eyq.mZx()) == null) {
                        return;
                    }
                    koMZx.EYQ(hu.this.mZx, nwx);
                    eyq.EYQ(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.mZx.VwS
                public void EYQ(int i, String str) {
                    hu.this.EYQ(eyq, i, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.tp
    public void EYQ() {
        this.mZx.Pm();
        Td();
    }

    public com.bytedance.sdk.component.adexpress.Kbd.EYQ mZx() {
        return this.mZx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td() {
        try {
            ScheduledFuture<?> scheduledFuture = this.Kbd;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.Kbd.cancel(false);
            this.Kbd = null;
        } catch (Throwable unused) {
        }
    }

    /* compiled from: WebViewRenderInterceptor.java */
    private class EYQ implements Runnable {
        tp.EYQ EYQ;
        private int Td;

        public EYQ(int i, tp.EYQ eyq) {
            this.Td = i;
            this.EYQ = eyq;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.Td == 1) {
                hu.this.mZx.EYQ(true);
                hu.this.EYQ(this.EYQ, 107, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(tp.EYQ eyq, int i, String str) {
        KO koMZx;
        if (eyq.Td() || this.IPb.get()) {
            return;
        }
        Td();
        this.Pm.Kbd().EYQ(i, str);
        if (eyq.mZx(this)) {
            eyq.EYQ(this);
        } else {
            if (eyq.Td() || (koMZx = eyq.mZx()) == null) {
                return;
            }
            eyq.EYQ(true);
            koMZx.a_(i);
        }
        this.IPb.getAndSet(true);
    }
}
