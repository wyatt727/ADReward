package com.bytedance.sdk.component.Kbd.EYQ.Td;

import com.bytedance.sdk.component.Kbd.EYQ.Kbd;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: EventMonitorUtils.java */
/* loaded from: classes2.dex */
public class mZx {
    public static void EYQ(AtomicLong atomicLong, int i) {
        Kbd kbdHu = QQ.VwS().hu();
        if (kbdHu == null || !kbdHu.VwS() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i);
    }
}
