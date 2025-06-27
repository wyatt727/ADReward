package com.bytedance.sdk.component.VwS.EYQ;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.wBa;

/* compiled from: HandlerPool.java */
/* loaded from: classes2.dex */
public class EYQ {
    private final Pm<mZx> EYQ;
    private Handler mZx;

    private EYQ() {
        this.EYQ = Pm.EYQ(2);
    }

    public static EYQ EYQ() {
        return C0088EYQ.EYQ;
    }

    /* compiled from: HandlerPool.java */
    /* renamed from: com.bytedance.sdk.component.VwS.EYQ.EYQ$EYQ, reason: collision with other inner class name */
    private static class C0088EYQ {
        private static final EYQ EYQ = new EYQ();
    }

    public Handler mZx() {
        if (this.mZx == null) {
            synchronized (EYQ.class) {
                if (this.mZx == null) {
                    this.mZx = EYQ("csj_io_handler");
                }
            }
        }
        return this.mZx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final Handler handler, final Handler handler2) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (handler.getLooper().getQueue().isIdle()) {
                handler.removeCallbacksAndMessages(null);
                handler.getLooper().quit();
            } else {
                handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.VwS.EYQ.EYQ.1
                    @Override // java.lang.Runnable
                    public void run() {
                        EYQ.this.EYQ(handler, handler2);
                    }
                }, 1000L);
            }
        }
    }

    public wBa EYQ(wBa.EYQ eyq, final String str) {
        mZx mzx = (mZx) this.EYQ.EYQ();
        if (mzx != null) {
            mzx.EYQ(eyq);
            mzx.post(new Runnable() { // from class: com.bytedance.sdk.component.VwS.EYQ.EYQ.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return mzx;
        }
        return mZx(eyq, str);
    }

    public wBa EYQ(String str) {
        return EYQ((wBa.EYQ) null, str);
    }

    private mZx mZx(wBa.EYQ eyq, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new mZx(handlerThread, eyq);
    }

    public boolean EYQ(wBa wba) {
        if (!(wba instanceof mZx)) {
            return false;
        }
        mZx mzx = (mZx) wba;
        if (this.EYQ.EYQ((Pm<mZx>) mzx)) {
            return true;
        }
        mzx.mZx();
        return true;
    }
}
