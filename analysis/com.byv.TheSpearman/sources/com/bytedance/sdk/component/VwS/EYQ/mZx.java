package com.bytedance.sdk.component.VwS.EYQ;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.wBa;
import java.lang.ref.WeakReference;

/* compiled from: HandlerWapper.java */
/* loaded from: classes2.dex */
public class mZx extends wBa implements Td {
    private final HandlerThread mZx;

    mZx(HandlerThread handlerThread, wBa.EYQ eyq) {
        super(handlerThread.getLooper(), eyq);
        this.mZx = handlerThread;
    }

    @Override // com.bytedance.sdk.component.VwS.EYQ.Td
    public void EYQ() {
        removeCallbacksAndMessages(null);
        if (this.EYQ != null) {
            this.EYQ.clear();
            this.EYQ = null;
        }
    }

    public void EYQ(wBa.EYQ eyq) {
        this.EYQ = new WeakReference<>(eyq);
    }

    public void mZx() {
        HandlerThread handlerThread = this.mZx;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }
}
