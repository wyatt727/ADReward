package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler.java */
/* loaded from: classes2.dex */
public class wBa extends Handler {
    protected WeakReference<EYQ> EYQ;

    /* compiled from: WeakHandler.java */
    public interface EYQ {
        void EYQ(Message message);
    }

    public wBa(EYQ eyq) {
        if (eyq != null) {
            this.EYQ = new WeakReference<>(eyq);
        }
    }

    public wBa(Looper looper, EYQ eyq) {
        super(looper);
        if (eyq != null) {
            this.EYQ = new WeakReference<>(eyq);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        EYQ eyq;
        WeakReference<EYQ> weakReference = this.EYQ;
        if (weakReference == null || (eyq = weakReference.get()) == null || message == null) {
            return;
        }
        eyq.EYQ(message);
    }
}
