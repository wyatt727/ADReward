package com.bytedance.sdk.openadsdk.component.IPb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: TTAppOpenAdTopLayoutHelper.java */
/* loaded from: classes2.dex */
public class mZx implements Handler.Callback {
    private EYQ Td;
    private boolean VwS;
    private final com.bytedance.sdk.openadsdk.component.QQ.EYQ mZx;
    private Handler EYQ = new Handler(Looper.myLooper(), this);
    private int Pm = 0;
    private int Kbd = 5;
    private int IPb = 0;

    public mZx(com.bytedance.sdk.openadsdk.component.QQ.EYQ eyq) {
        this.mZx = eyq;
    }

    public void EYQ(int i) {
        this.Pm = i;
        int i2 = this.Kbd - i;
        this.mZx.EYQ(i2);
        if (i <= 0) {
            EYQ eyq = this.Td;
            if (eyq != null && !this.VwS) {
                eyq.mZx();
                this.VwS = true;
            }
            i = 0;
        }
        boolean z = i2 >= this.IPb;
        EYQ eyq2 = this.Td;
        if (eyq2 != null) {
            eyq2.EYQ(i, i2, z);
        }
    }

    public void EYQ(float f) {
        int i = (int) f;
        this.Kbd = i;
        if (i <= 0) {
            this.Kbd = 5;
        }
    }

    public void EYQ(EYQ eyq) {
        this.Td = eyq;
    }

    public int EYQ() {
        return this.IPb;
    }

    public void mZx(int i) {
        this.IPb = i;
    }

    public void mZx() {
        Handler handler = this.EYQ;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.Kbd, 0));
        }
    }

    public void Td() {
        if (this.EYQ != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.Pm;
            this.EYQ.sendMessage(messageObtain);
        }
    }

    public void Pm() {
        Handler handler = this.EYQ;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void Kbd() {
        this.EYQ.removeCallbacksAndMessages(null);
        this.EYQ = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100 && this.EYQ != null) {
            int i = message.arg1;
            EYQ(i);
            if (i > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i - 1;
                this.EYQ.sendMessageDelayed(messageObtain, 1000L);
            }
        }
        return true;
    }
}
