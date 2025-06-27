package com.bytedance.sdk.openadsdk.nWX.EYQ;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.pi;

/* compiled from: PAGTimerManager.java */
/* loaded from: classes2.dex */
public class VwS {
    private static EYQ EYQ;
    private static HandlerThread mZx;

    public static void EYQ() {
    }

    public static void EYQ(mZx mzx) {
        if (mzx == null) {
            return;
        }
        mZx();
        EYQ eyq = EYQ;
        if (eyq != null) {
            eyq.EYQ(mzx);
        }
    }

    public static void mZx(mZx mzx) {
        if (mzx == null || EYQ == null) {
            return;
        }
        try {
            int iIntValue = mzx.MxO().intValue();
            if (EYQ.hasMessages(iIntValue)) {
                EYQ.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void mZx() {
        if (EYQ != null) {
            return;
        }
        try {
            HandlerThread handlerThread = mZx;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (VwS.class) {
                HandlerThread handlerThread2 = mZx;
                if (handlerThread2 == null || !handlerThread2.isAlive()) {
                    HandlerThread handlerThread3 = new HandlerThread("csj_MRC");
                    mZx = handlerThread3;
                    handlerThread3.start();
                    EYQ = new EYQ(mZx.getLooper());
                }
            }
        } catch (Throwable th) {
            pi.EYQ("MRC", th.getMessage());
        }
    }

    /* compiled from: PAGTimerManager.java */
    private static class EYQ extends Handler {
        public EYQ(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            mZx mzx = (mZx) message.obj;
            if (mzx == null) {
                return;
            }
            int iMZx = mzx.mZx();
            if (iMZx == 1) {
                mzx.VwS();
            } else if (iMZx == 2) {
                mzx.QQ();
            } else {
                Kbd.mZx(mzx.MxO());
                return;
            }
            if (mzx.HX()) {
                Kbd.mZx(mzx.MxO());
            } else if (mzx.tsL()) {
                EYQ(mzx);
            }
        }

        public void EYQ(mZx mzx) {
            if (mzx == null) {
                return;
            }
            int iIntValue = mzx.MxO().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = mzx;
            sendMessageDelayed(messageObtain, mzx.IPb());
        }
    }
}
