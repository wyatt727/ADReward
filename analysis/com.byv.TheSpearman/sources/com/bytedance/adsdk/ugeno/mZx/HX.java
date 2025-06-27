package com.bytedance.adsdk.ugeno.mZx;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler.java */
/* loaded from: classes2.dex */
public class HX extends Handler {
    private final WeakReference<EYQ> EYQ;

    /* compiled from: WeakHandler.java */
    public interface EYQ {
        void EYQ(Message message);
    }

    public HX(Looper looper, EYQ eyq) {
        super(looper);
        this.EYQ = new WeakReference<>(eyq);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        EYQ eyq = this.EYQ.get();
        if (eyq == null || message == null) {
            return;
        }
        eyq.EYQ(message);
    }
}
