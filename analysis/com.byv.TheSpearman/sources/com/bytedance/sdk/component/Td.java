package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: TTQueuedWork.java */
/* loaded from: classes2.dex */
public class Td {
    private static volatile Handler mZx;
    private static final Object EYQ = new Object();
    private static final LinkedList<Runnable> Td = new LinkedList<>();
    private static Object Pm = new Object();

    public static void EYQ(Runnable runnable, boolean z) {
        try {
            Handler handlerMZx = mZx();
            synchronized (EYQ) {
                Td.add(runnable);
                if (z) {
                    handlerMZx.sendEmptyMessageDelayed(1, 100L);
                } else {
                    handlerMZx.sendEmptyMessage(1);
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }

    private static Handler mZx() {
        Handler handler;
        if (mZx == null) {
            synchronized (EYQ) {
                if (mZx == null) {
                    HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    mZx = new EYQ(handlerThread.getLooper());
                }
                handler = mZx;
            }
            return handler;
        }
        return mZx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Td() {
        LinkedList linkedList;
        synchronized (Pm) {
            synchronized (EYQ) {
                LinkedList<Runnable> linkedList2 = Td;
                linkedList = (LinkedList) linkedList2.clone();
                linkedList2.clear();
                mZx().removeMessages(1);
            }
            if (linkedList.size() > 0) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    /* compiled from: TTQueuedWork.java */
    private static class EYQ extends Handler {
        EYQ(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    Td.Td();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }
}
