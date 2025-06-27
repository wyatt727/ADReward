package com.bytedance.sdk.openadsdk.core.Pm;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.settings.Kbd;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: FrequentCallController.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static volatile EYQ EYQ;
    private static volatile long Td;
    private static volatile boolean mZx;
    private Handler Kbd;
    private final Queue<C0110EYQ> Pm = new LinkedList();
    private final Kbd IPb = hu.Pm();

    private EYQ() {
    }

    public static EYQ EYQ() {
        if (EYQ == null) {
            synchronized (EYQ.class) {
                if (EYQ == null) {
                    EYQ = new EYQ();
                }
            }
        }
        return EYQ;
    }

    private synchronized boolean mZx(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iWBa = this.IPb.wBa();
        long jTPj = this.IPb.tPj();
        if (this.Pm.size() > 0 && this.Pm.size() >= iWBa) {
            long jAbs = Math.abs(jCurrentTimeMillis - this.Pm.peek().EYQ);
            if (jAbs <= jTPj) {
                mZx(jTPj - jAbs);
                return true;
            }
            this.Pm.poll();
            this.Pm.offer(new C0110EYQ(jCurrentTimeMillis, str));
        } else {
            this.Pm.offer(new C0110EYQ(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized boolean EYQ(String str) {
        if (mZx(str)) {
            EYQ(true);
            EYQ(Td);
        } else {
            EYQ(false);
        }
        return mZx;
    }

    private synchronized void EYQ(long j) {
        if (this.Kbd == null) {
            this.Kbd = new Handler(Looper.getMainLooper());
        }
        this.Kbd.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Pm.EYQ.1
            @Override // java.lang.Runnable
            public void run() {
                EYQ.this.EYQ(false);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void EYQ(boolean z) {
        mZx = z;
    }

    public synchronized boolean mZx() {
        return mZx;
    }

    private synchronized void mZx(long j) {
        Td = j;
    }

    public synchronized String Td() {
        String str;
        HashMap map = new HashMap();
        for (C0110EYQ c0110eyq : this.Pm) {
            if (map.containsKey(c0110eyq.mZx)) {
                map.put(c0110eyq.mZx, Integer.valueOf(((Integer) map.get(c0110eyq.mZx)).intValue() + 1));
            } else {
                map.put(c0110eyq.mZx, 1);
            }
        }
        int i = Integer.MIN_VALUE;
        str = "";
        for (String str2 : map.keySet()) {
            int iIntValue = ((Integer) map.get(str2)).intValue();
            if (i < iIntValue) {
                str = str2;
                i = iIntValue;
            }
        }
        return str;
    }

    /* compiled from: FrequentCallController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.Pm.EYQ$EYQ, reason: collision with other inner class name */
    private static class C0110EYQ {
        private final long EYQ;
        private final String mZx;

        private C0110EYQ(long j, String str) {
            this.EYQ = j;
            this.mZx = str;
        }
    }
}
