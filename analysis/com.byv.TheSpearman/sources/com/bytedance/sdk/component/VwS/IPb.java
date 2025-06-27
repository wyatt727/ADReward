package com.bytedance.sdk.component.VwS;

import com.bytedance.sdk.component.VwS.EYQ;
import com.json.t2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: TTExecutor.java */
/* loaded from: classes2.dex */
public class IPb extends Kbd {
    private static volatile ThreadPoolExecutor HX;
    private static volatile ThreadPoolExecutor IPb;
    private static volatile ThreadPoolExecutor Kbd;
    private static volatile ScheduledExecutorService MxO;
    private static volatile ThreadPoolExecutor QQ;
    private static volatile ThreadPoolExecutor VwS;
    public static Td mZx;
    private static volatile ThreadPoolExecutor tp;
    public static final int EYQ = Runtime.getRuntime().availableProcessors();
    public static int Td = 120;
    public static boolean Pm = true;

    public static ExecutorService mZx() {
        if (Kbd == null) {
            synchronized (IPb.class) {
                if (Kbd == null) {
                    Kbd = new EYQ.C0087EYQ().EYQ(t2.a.e).EYQ(0).mZx(10).EYQ(5L).EYQ(TimeUnit.SECONDS).EYQ(new SynchronousQueue()).EYQ(QQ()).EYQ(EYQ().createThreadFactory(10, t2.a.e)).EYQ();
                }
            }
        }
        return Kbd;
    }

    public static void EYQ(QQ qq) {
        if (Kbd == null) {
            mZx();
        }
        if (qq == null || Kbd == null) {
            return;
        }
        Kbd.execute(qq);
    }

    public static ExecutorService Td() {
        return EYQ(10);
    }

    public static ExecutorService EYQ(int i) {
        if (IPb == null) {
            synchronized (IPb.class) {
                if (IPb == null) {
                    EYQ EYQ2 = new EYQ.C0087EYQ().EYQ("io").EYQ(2).mZx(i).EYQ(20L).EYQ(TimeUnit.SECONDS).EYQ(new LinkedBlockingQueue()).EYQ(QQ()).EYQ(EYQ().createThreadFactory(i, "io")).EYQ();
                    IPb = EYQ2;
                    EYQ2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return IPb;
    }

    public static void mZx(QQ qq) {
        if (IPb == null) {
            Td();
        }
        if (IPb != null) {
            IPb.execute(qq);
        }
    }

    public static void EYQ(QQ qq, int i) {
        mZx(qq);
    }

    public static void EYQ(QQ qq, int i, int i2) {
        if (IPb == null) {
            EYQ(i2);
        }
        if (qq == null || IPb == null) {
            return;
        }
        qq.setPriority(i);
        IPb.execute(qq);
    }

    public static ExecutorService Pm() {
        if (QQ == null) {
            synchronized (IPb.class) {
                if (QQ == null) {
                    EYQ EYQ2 = new EYQ.C0087EYQ().EYQ("log").mZx(10).EYQ(4).EYQ(20L).EYQ(TimeUnit.SECONDS).EYQ(new PriorityBlockingQueue()).EYQ(QQ()).EYQ(EYQ().createThreadFactory(10, "log")).EYQ();
                    QQ = EYQ2;
                    EYQ2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return QQ;
    }

    public static void Td(QQ qq) {
        if (QQ == null) {
            Pm();
        }
        if (qq == null || QQ == null) {
            return;
        }
        QQ.execute(qq);
    }

    public static void mZx(QQ qq, int i) {
        if (qq != null) {
            qq.setPriority(i);
        }
        Td(qq);
    }

    public static ExecutorService Kbd() {
        if (tp == null) {
            synchronized (IPb.class) {
                if (tp == null) {
                    EYQ EYQ2 = new EYQ.C0087EYQ().EYQ("aidl").mZx(10).EYQ(2).EYQ(30L).EYQ(TimeUnit.SECONDS).EYQ(new PriorityBlockingQueue()).EYQ(QQ()).EYQ(EYQ().createThreadFactory(10, "aidl")).EYQ();
                    tp = EYQ2;
                    EYQ2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return tp;
    }

    public static void Pm(QQ qq) {
        if (tp == null) {
            Kbd();
        }
        if (qq == null || tp == null) {
            return;
        }
        tp.execute(qq);
    }

    public static void Td(QQ qq, int i) {
        if (qq != null) {
            qq.setPriority(i);
        }
        Pm(qq);
    }

    public static ScheduledExecutorService IPb() {
        if (MxO == null) {
            synchronized (IPb.class) {
                if (MxO == null) {
                    MxO = Executors.newSingleThreadScheduledExecutor(EYQ().createThreadFactory(5, "scheduled"));
                }
            }
        }
        return MxO;
    }

    public static boolean VwS() {
        return Pm;
    }

    public static void EYQ(boolean z) {
        Pm = z;
    }

    public static RejectedExecutionHandler QQ() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.VwS.IPb.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static Td HX() {
        return mZx;
    }

    public static void EYQ(Td td) {
        mZx = td;
    }

    public static ExecutorService mZx(int i) {
        if (VwS == null) {
            synchronized (IPb.class) {
                if (VwS == null) {
                    EYQ EYQ2 = new EYQ.C0087EYQ().EYQ("ad").EYQ(2).mZx(i).EYQ(20L).EYQ(TimeUnit.SECONDS).EYQ(new LinkedBlockingQueue()).EYQ(QQ()).EYQ(EYQ().createThreadFactory(i, "ad")).EYQ();
                    VwS = EYQ2;
                    EYQ2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return VwS;
    }

    public static void Kbd(QQ qq) {
        if (VwS == null) {
            mZx(5);
        }
        if (qq == null || VwS == null) {
            return;
        }
        VwS.execute(qq);
    }

    public static ExecutorService tp() {
        if (HX == null) {
            synchronized (IPb.class) {
                if (HX == null) {
                    EYQ EYQ2 = new EYQ.C0087EYQ().EYQ("computation").EYQ(3).mZx(10).EYQ(20L).EYQ(TimeUnit.SECONDS).EYQ(new PriorityBlockingQueue()).EYQ(QQ()).EYQ(EYQ().createThreadFactory(10, "computation")).EYQ();
                    HX = EYQ2;
                    EYQ2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return HX;
    }

    public static void Td(int i) {
        Td = i;
    }
}
