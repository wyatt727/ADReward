package com.bykv.vk.openvk.component.video.EYQ.mZx;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.component.video.EYQ.mZx.HX;
import com.bykv.vk.openvk.component.video.EYQ.mZx.mZx;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Preloader.java */
/* loaded from: classes.dex */
public class Pm {
    private static volatile Pm Kbd;
    private volatile int EYQ = 163840;
    private final HashSet<EYQ> HX;
    private volatile com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td IPb;
    private volatile Td MxO;
    private final ExecutorService Pm;
    private volatile com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.mZx QQ;
    private final mZx<Runnable> Td;
    private volatile com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td VwS;
    private final SparseArray<Map<String, com.bykv.vk.openvk.component.video.EYQ.mZx.mZx>> mZx;
    private volatile boolean nWX;
    private volatile String pi;
    private final mZx.InterfaceC0062mZx tp;
    private volatile Td tsL;

    void EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td td) {
        this.VwS = td;
    }

    void EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td td) {
        this.IPb = td;
    }

    public void EYQ(int i) {
        if (i > 0) {
            this.EYQ = i;
        }
        if (Kbd.Td) {
            Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: ".concat(String.valueOf(i)));
        }
    }

    private Pm() {
        SparseArray<Map<String, com.bykv.vk.openvk.component.video.EYQ.mZx.mZx>> sparseArray = new SparseArray<>(2);
        this.mZx = sparseArray;
        this.HX = new HashSet<>();
        this.tp = new mZx.InterfaceC0062mZx() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.Pm.1
            @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.InterfaceC0062mZx
            public void EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx mzx) {
                int iIPb = mzx.IPb();
                synchronized (Pm.this.mZx) {
                    Map map = (Map) Pm.this.mZx.get(iIPb);
                    if (map != null) {
                        map.remove(mzx.QQ);
                    }
                }
                if (Kbd.Td) {
                    Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + mzx.QQ);
                }
            }
        };
        mZx<Runnable> mzx = new mZx<>();
        this.Td = mzx;
        ExecutorService executorServiceEYQ = EYQ(mzx);
        this.Pm = executorServiceEYQ;
        mzx.EYQ((ThreadPoolExecutor) executorServiceEYQ);
        sparseArray.put(0, new HashMap());
        sparseArray.put(1, new HashMap());
    }

    Td EYQ() {
        return this.MxO;
    }

    Td mZx() {
        return this.tsL;
    }

    public static Pm Td() {
        if (Kbd == null) {
            synchronized (Pm.class) {
                if (Kbd == null) {
                    Kbd = new Pm();
                }
            }
        }
        return Kbd;
    }

    void EYQ(boolean z, String str) {
        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx mzxRemove;
        this.pi = str;
        this.nWX = z;
        if (Kbd.Td) {
            Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, ".concat(String.valueOf(str)));
        }
        HashSet hashSet = null;
        HashSet hashSet2 = null;
        if (str == null) {
            synchronized (this.HX) {
                if (!this.HX.isEmpty()) {
                    hashSet2 = new HashSet(this.HX);
                    this.HX.clear();
                }
            }
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    EYQ eyq = (EYQ) it.next();
                    EYQ(eyq.EYQ, eyq.mZx, eyq.Td, eyq.Pm, eyq.Kbd, eyq.IPb);
                    if (Kbd.Td) {
                        Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, resume preload: " + eyq.Pm);
                    }
                }
                return;
            }
            return;
        }
        int i = Kbd.QQ;
        if (i != 3 && i != 2) {
            if (i == 1) {
                synchronized (this.mZx) {
                    Map<String, com.bykv.vk.openvk.component.video.EYQ.mZx.mZx> map = this.mZx.get(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.mZx.EYQ(z));
                    mzxRemove = map != null ? map.remove(str) : null;
                }
                if (mzxRemove != null) {
                    mzxRemove.EYQ();
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.mZx) {
            int size = this.mZx.size();
            for (int i2 = 0; i2 < size; i2++) {
                SparseArray<Map<String, com.bykv.vk.openvk.component.video.EYQ.mZx.mZx>> sparseArray = this.mZx;
                Map<String, com.bykv.vk.openvk.component.video.EYQ.mZx.mZx> map2 = sparseArray.get(sparseArray.keyAt(i2));
                if (map2 != null) {
                    Collection<com.bykv.vk.openvk.component.video.EYQ.mZx.mZx> collectionValues = map2.values();
                    if (collectionValues != null && !collectionValues.isEmpty()) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.addAll(collectionValues);
                    }
                    map2.clear();
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            com.bykv.vk.openvk.component.video.EYQ.mZx.mZx mzx = (com.bykv.vk.openvk.component.video.EYQ.mZx.mZx) it2.next();
            mzx.EYQ();
            if (Kbd.Td) {
                Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, cancel preload: " + mzx.VwS);
            }
        }
        if (i == 3) {
            synchronized (this.HX) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    EYQ eyq2 = (EYQ) ((com.bykv.vk.openvk.component.video.EYQ.mZx.mZx) it3.next()).nWX;
                    if (eyq2 != null) {
                        this.HX.add(eyq2);
                    }
                }
            }
        }
    }

    public void EYQ(boolean z, boolean z2, int i, String str, String... strArr) {
        EYQ(z, z2, i, str, null, strArr);
    }

    public void EYQ(boolean z, boolean z2, int i, String str, Map<String, String> map, String... strArr) {
        if (Kbd.Td) {
            Log.d("TAG_PROXY_Preloader", "preload start ！！！！");
        }
        com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ eyq = z ? this.QQ : this.VwS;
        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td td = this.IPb;
        if (eyq == null || td == null) {
            if (Kbd.Td) {
                Log.e("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return;
        }
        int i2 = i <= 0 ? this.EYQ : i;
        String strEYQ = z2 ? str : com.bykv.vk.openvk.component.video.api.IPb.mZx.EYQ(str);
        File filePm = eyq.Pm(strEYQ);
        if (filePm != null && filePm.length() >= i2) {
            if (Kbd.Td) {
                Log.i("TAG_PROXY_Preloader", "no need preload, file size: " + filePm.length() + ", need preload size: " + i2);
                return;
            }
            return;
        }
        if (IPb.EYQ().EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.mZx.EYQ(z), strEYQ)) {
            if (Kbd.Td) {
                Log.w("TAG_PROXY_Preloader", "has running proxy task, skip preload for key: ".concat(String.valueOf(str)));
                return;
            }
            return;
        }
        synchronized (this.mZx) {
            Map<String, com.bykv.vk.openvk.component.video.EYQ.mZx.mZx> map2 = this.mZx.get(z ? 1 : 0);
            if (map2.containsKey(strEYQ)) {
                return;
            }
            int i3 = i2;
            EYQ eyq2 = new EYQ(z, z2, i2, str, map, strArr);
            String str2 = this.pi;
            if (str2 != null) {
                int i4 = Kbd.QQ;
                if (i4 == 3) {
                    synchronized (this.HX) {
                        this.HX.add(eyq2);
                    }
                    if (Kbd.Td) {
                        Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", add to pending queue");
                    }
                    return;
                }
                if (i4 == 2) {
                    if (Kbd.Td) {
                        Log.w("TAG_PROXY_Preloader", "cancel preload: ".concat(String.valueOf(str)));
                    }
                    return;
                } else if (i4 == 1 && this.nWX == z && str2.equals(strEYQ)) {
                    if (Kbd.Td) {
                        Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", it is playing");
                    }
                    return;
                }
            }
            ArrayList arrayList = null;
            List<HX.mZx> listEYQ = com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(map));
            if (listEYQ != null) {
                arrayList = new ArrayList(listEYQ.size());
                int size = listEYQ.size();
                for (int i5 = 0; i5 < size; i5++) {
                    HX.mZx mzx = listEYQ.get(i5);
                    if (mzx != null) {
                        arrayList.add(new HX.mZx(mzx.EYQ, mzx.mZx));
                    }
                }
            }
            com.bykv.vk.openvk.component.video.EYQ.mZx.mZx mzxEYQ = new mZx.EYQ().EYQ(eyq).EYQ(td).EYQ(str).mZx(strEYQ).EYQ(new tsL(com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(strArr))).EYQ((List<HX.mZx>) arrayList).EYQ(i3).EYQ(this.tp).EYQ(eyq2).EYQ();
            map2.put(strEYQ, mzxEYQ);
            this.Pm.execute(mzxEYQ);
        }
    }

    public void EYQ(String str) {
        EYQ(false, false, str);
    }

    public void EYQ(final boolean z, final boolean z2, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(new com.bytedance.sdk.component.VwS.QQ("cancel b b S") { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.Pm.2
            @Override // java.lang.Runnable
            public void run() {
                com.bykv.vk.openvk.component.video.EYQ.mZx.mZx mzx;
                synchronized (Pm.this.mZx) {
                    Map map = (Map) Pm.this.mZx.get(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.mZx.EYQ(z));
                    if (map != null) {
                        mzx = (com.bykv.vk.openvk.component.video.EYQ.mZx.mZx) map.remove(z2 ? str : com.bykv.vk.openvk.component.video.api.IPb.mZx.EYQ(str));
                    } else {
                        mzx = null;
                    }
                }
                if (mzx != null) {
                    mzx.EYQ();
                }
            }
        });
    }

    public void Pm() {
        com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(new com.bytedance.sdk.component.VwS.QQ("cancelAll") { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.Pm.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList<com.bykv.vk.openvk.component.video.EYQ.mZx.mZx> arrayList = new ArrayList();
                synchronized (Pm.this.mZx) {
                    int size = Pm.this.mZx.size();
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) Pm.this.mZx.get(Pm.this.mZx.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    Pm.this.Td.clear();
                }
                for (com.bykv.vk.openvk.component.video.EYQ.mZx.mZx mzx : arrayList) {
                    mzx.EYQ();
                    if (Kbd.Td) {
                        Log.w("TAG_PROXY_Preloader", "PreloadTask: " + mzx + ", canceled!!!");
                    }
                }
            }
        });
    }

    /* compiled from: Preloader.java */
    private static final class EYQ {
        final boolean EYQ;
        final String[] IPb;
        final Map<String, String> Kbd;
        final String Pm;
        final int Td;
        final boolean mZx;

        EYQ(boolean z, boolean z2, int i, String str, Map<String, String> map, String[] strArr) {
            this.EYQ = z;
            this.mZx = z2;
            this.Td = i;
            this.Pm = str;
            this.Kbd = map;
            this.IPb = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EYQ eyq = (EYQ) obj;
            if (this.EYQ == eyq.EYQ && this.mZx == eyq.mZx && this.Td == eyq.Td) {
                return this.Pm.equals(eyq.Pm);
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.EYQ ? 1 : 0) * 31) + (this.mZx ? 1 : 0)) * 31) + this.Td) * 31) + this.Pm.hashCode();
        }
    }

    /* compiled from: Preloader.java */
    private static final class mZx<T> extends LinkedBlockingDeque<T> {
        private ThreadPoolExecutor EYQ;

        private mZx() {
        }

        public void EYQ(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.EYQ != null) {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                }
                if (threadPoolExecutor == null) {
                    throw new NullPointerException("executor argument can't be null!");
                }
                this.EYQ = threadPoolExecutor;
            }
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public boolean offer(T t) {
            synchronized (this) {
                int poolSize = this.EYQ.getPoolSize();
                int activeCount = this.EYQ.getActiveCount();
                int maximumPoolSize = this.EYQ.getMaximumPoolSize();
                if (activeCount >= poolSize && poolSize < maximumPoolSize) {
                    if (Kbd.Td) {
                        Log.i("TAG_PROXY_TT", "create new preloader thread");
                    }
                    return false;
                }
                return offerFirst(t);
            }
        }
    }

    private static ExecutorService EYQ(final mZx<Runnable> mzx) {
        int i;
        int iEYQ = com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ();
        if (iEYQ > 0) {
            if (iEYQ > 4) {
                i = 4;
            }
            return new ThreadPoolExecutor(0, i, 60L, TimeUnit.SECONDS, mzx, new ThreadFactory() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.Pm.4
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.Pm.4.1
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            try {
                                Process.setThreadPriority(10);
                            } catch (Throwable unused) {
                            }
                            super.run();
                        }
                    };
                    thread.setName("csj_video_preload_" + thread.getId());
                    thread.setDaemon(true);
                    if (Kbd.Td) {
                        Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                    }
                    return thread;
                }
            }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.Pm.5
                @Override // java.util.concurrent.RejectedExecutionHandler
                public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    try {
                        mzx.offerFirst(runnable);
                        if (Kbd.Td) {
                            Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
        iEYQ = 1;
        i = iEYQ;
        return new ThreadPoolExecutor(0, i, 60L, TimeUnit.SECONDS, mzx, new ThreadFactory() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.Pm.4
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.Pm.4.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable unused) {
                        }
                        super.run();
                    }
                };
                thread.setName("csj_video_preload_" + thread.getId());
                thread.setDaemon(true);
                if (Kbd.Td) {
                    Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                }
                return thread;
            }
        }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.Pm.5
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    mzx.offerFirst(runnable);
                    if (Kbd.Td) {
                        Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
