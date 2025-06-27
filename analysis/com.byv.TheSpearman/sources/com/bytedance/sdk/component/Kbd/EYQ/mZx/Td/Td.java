package com.bytedance.sdk.component.Kbd.EYQ.mZx.Td;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.Kbd.EYQ.EYQ.Pm;
import com.bytedance.sdk.component.Kbd.EYQ.Kbd;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdPriorityLogThread.java */
/* loaded from: classes2.dex */
public class Td extends HandlerThread implements Handler.Callback {
    private static int UB = 10;
    private static int Uc = 200;
    protected Pm EYQ;
    private final AtomicInteger HX;
    private volatile int IPb;
    private final AtomicInteger KO;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> Kbd;
    private final long MxO;
    private com.bytedance.sdk.component.Kbd.EYQ.mZx.Td Pm;
    private volatile long QQ;
    private final Object Td;
    private volatile long VwS;
    private final int WU;
    private final int hYh;
    private final AtomicInteger hu;
    private volatile boolean mZx;
    private final List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> nWX;
    private volatile Handler pi;
    private final long tp;
    private final AtomicInteger tsL;
    private final int zF;

    public static void EYQ(int i) {
        UB = i;
    }

    public static void mZx(int i) {
        Uc = i;
    }

    public Td(PriorityBlockingQueue<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> priorityBlockingQueue) {
        super("csj_log");
        this.mZx = true;
        this.Td = new Object();
        this.VwS = 0L;
        this.QQ = 0L;
        this.HX = new AtomicInteger(0);
        this.tp = 5000L;
        this.MxO = 5000000000L;
        this.tsL = new AtomicInteger(0);
        this.nWX = new ArrayList();
        this.KO = new AtomicInteger(0);
        this.hu = new AtomicInteger(0);
        this.hYh = 1;
        this.zF = 2;
        this.WU = 3;
        this.Kbd = priorityBlockingQueue;
        this.EYQ = new com.bytedance.sdk.component.Kbd.EYQ.EYQ.mZx();
    }

    public void EYQ(boolean z) {
        this.mZx = z;
    }

    public boolean EYQ() {
        return this.mZx;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        try {
        } catch (Throwable th) {
            th.getMessage();
        }
        if (i == 1) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.HX(), 1);
            mZx();
            EYQ(true);
            Kbd();
        } else {
            if (i != 2 && i != 3) {
                if (i == 11) {
                    ArrayList arrayList = new ArrayList(this.nWX);
                    this.nWX.clear();
                    EYQ((List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ>) arrayList, false, "timeout_dispatch");
                    tp();
                }
                return true;
            }
            Td();
        }
        return true;
    }

    private void mZx() {
        long jUB = QQ.VwS().UB();
        if (jUB <= 0) {
            return;
        }
        this.EYQ.EYQ(Integer.MAX_VALUE, jUB);
    }

    private void Td() {
        Pm();
        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.kf(), 1);
        Td(1);
    }

    private void Pm() {
        if (!isAlive()) {
            com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.Pm();
        } else {
            if (EYQ()) {
                return;
            }
            Td(6);
        }
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.pi = new Handler(getLooper(), this);
        com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.EYQ(this.pi);
        this.pi.sendEmptyMessage(1);
    }

    public boolean EYQ(int i, boolean z) {
        Kbd kbdHu = QQ.VwS().hu();
        if (kbdHu == null || !kbdHu.EYQ(QQ.VwS().IPb())) {
            return false;
        }
        return this.EYQ.EYQ(i, z);
    }

    public void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq, boolean z) {
        if (eyq == null) {
            return;
        }
        eyq.Pm();
        if (z) {
            if (this.pi != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(eyq);
                EYQ((List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.Kbd.add(eyq);
        Kbd(2);
    }

    public void Td(int i) {
        try {
            boolean zEYQ = EYQ(i, com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.mZx);
            if (i == 6 || zEYQ) {
                com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx mzx = new com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx();
                mzx.mZx(i);
                this.Kbd.add(mzx);
                Kbd(3);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq, int i) throws JSONException {
        this.HX.set(0);
        if (i == 0) {
            this.IPb = ((com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx) eyq).MxO();
            if (this.IPb != 6) {
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.lRN(), 1);
                mZx(eyq);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx mzx = (com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx) eyq;
        if (mzx.MxO() == 1) {
            this.IPb = 1;
            mZx(eyq);
        } else if (mzx.MxO() == 2) {
            VwS();
            this.IPb = 2;
            mZx(eyq);
        }
    }

    private void Kbd() {
        while (EYQ()) {
            try {
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.QQ(), 1);
                com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyqPoll = this.Kbd.poll(60000L, TimeUnit.MILLISECONDS);
                int size = this.Kbd.size();
                if (eyqPoll instanceof com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx) {
                    EYQ(eyqPoll, size);
                } else if (eyqPoll == null) {
                    int iIncrementAndGet = this.HX.incrementAndGet();
                    com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.XPd(), 1);
                    if (Pm(iIncrementAndGet)) {
                        IPb();
                        return;
                    } else if (iIncrementAndGet < 4) {
                        this.IPb = 1;
                        mZx((com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ) null);
                    }
                } else {
                    EYQ(eyqPoll);
                    mZx(eyqPoll);
                }
            } catch (Throwable th) {
                th.getMessage();
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.Kbc(), 1);
            }
        }
    }

    private boolean Pm(int i) {
        return i >= 4 && this.tsL.get() == 0 && !com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.mZx && !com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.Td;
    }

    private void IPb() {
        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.XN(), 1);
        EYQ(false);
        com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.Td();
    }

    private void VwS() throws JSONException {
        if (this.Kbd.size() >= 100) {
            for (int i = 0; i < 100; i++) {
                com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyqPoll = this.Kbd.poll();
                if (!(eyqPoll instanceof com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx) && eyqPoll != null) {
                    EYQ(eyqPoll);
                }
            }
        }
    }

    private void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq) throws JSONException {
        this.HX.set(0);
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.mZx) {
            this.IPb = 5;
        } else if (com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.Td) {
            this.IPb = 7;
        } else {
            this.IPb = 4;
        }
        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.TQF(), 1);
        this.EYQ.EYQ(eyq, this.IPb);
        com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.VwS(eyq);
    }

    private boolean QQ() {
        if (com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.mZx) {
            return this.IPb == 4 || this.IPb == 7 || this.IPb == 6 || this.IPb == 5 || this.IPb == 2;
        }
        return false;
    }

    private void mZx(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq) {
        List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> listEYQ;
        if (com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.mZx() && QQ.VwS().EYQ()) {
            return;
        }
        int i = 0;
        if (QQ()) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.EYQ(this.IPb);
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.tsL(), 1);
            if (this.Kbd.size() != 0) {
                return;
            }
            if (!this.pi.hasMessages(2)) {
                com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.mZx = false;
                this.QQ = 0L;
                this.VwS = 0L;
                this.KO.set(0);
                this.hu.set(0);
            } else {
                EYQ(false);
                return;
            }
        }
        do {
            boolean zEYQ = EYQ(this.IPb, com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.mZx);
            com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.EYQ(zEYQ, this.IPb, eyq);
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.pi(), 1);
            if (zEYQ && (listEYQ = this.EYQ.EYQ(this.IPb, -1, null)) != null) {
                listEYQ.size();
                EYQ(listEYQ);
            } else {
                HX();
            }
            i++;
            if (!zEYQ) {
                return;
            }
        } while (i <= 6);
    }

    private void HX() {
        try {
            if (this.Kbd.size() == 0 && this.pi.hasMessages(11) && EYQ()) {
                EYQ(false);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void EYQ(List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list, String str) {
        EYQ(str);
        EYQ(list, false, str);
        tp();
    }

    private void EYQ(List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.EYQ(list, this.Kbd.size());
            if (list.size() > 1 || com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.Td()) {
                EYQ(list, "batchRead");
                return;
            }
            com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq = list.get(0);
            if (eyq != null) {
                if (eyq.Kbd() == 1) {
                    EYQ(list, "highPriority");
                    return;
                }
                if (eyq.Pm() == 0 && eyq.Kbd() == 2) {
                    if (eyq.mZx() == 3) {
                        EYQ(list, "version_v3");
                        return;
                    } else {
                        mZx(list);
                        return;
                    }
                }
                if (eyq.Pm() == 1) {
                    EYQ(list, "stats");
                    return;
                } else if (eyq.Pm() == 3) {
                    EYQ(list, "adType_v3");
                    return;
                } else {
                    if (eyq.Pm() == 2) {
                        EYQ(list, "other");
                        return;
                    }
                    return;
                }
            }
            return;
        }
        HX();
    }

    private void mZx(List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list) {
        this.nWX.addAll(list);
        this.nWX.size();
        Kbd kbdHu = QQ.VwS().hu();
        if (kbdHu != null && kbdHu.tsL() != null) {
            UB = kbdHu.tsL().mZx();
        }
        if (this.nWX.size() >= UB) {
            if (this.pi.hasMessages(11)) {
                this.pi.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.nWX);
            this.nWX.clear();
            EYQ((List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ>) arrayList, false, "max_size_dispatch");
            tp();
            return;
        }
        if (this.Kbd.size() == 0) {
            EYQ(false);
            if (this.pi.hasMessages(11)) {
                this.pi.removeMessages(11);
            }
            if (this.pi.hasMessages(1)) {
                this.pi.removeMessages(1);
            }
            long jEYQ = Uc;
            if (kbdHu != null && kbdHu.tsL() != null) {
                jEYQ = kbdHu.tsL().EYQ();
            }
            this.pi.sendEmptyMessageDelayed(11, jEYQ);
            return;
        }
        this.nWX.size();
    }

    private void EYQ(String str) {
        if (this.pi.hasMessages(11)) {
            this.pi.removeMessages(11);
        }
        if (this.nWX.size() != 0) {
            ArrayList arrayList = new ArrayList(this.nWX);
            this.nWX.clear();
            EYQ((List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ>) arrayList, false, "before_".concat(String.valueOf(str)));
            tp();
            arrayList.size();
        }
    }

    private void EYQ(List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list, boolean z, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.EYQ(list, this.IPb, str);
        com.bytedance.sdk.component.Kbd.EYQ.mZx.Td tdQQ = QQ.VwS().QQ();
        this.Pm = tdQQ;
        if (tdQQ != null) {
            mZx(list, z, jCurrentTimeMillis);
        } else {
            EYQ(list, z, jCurrentTimeMillis);
        }
    }

    private void EYQ(final List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list, final boolean z, final long j) {
        Kbd kbdHu = QQ.VwS().hu();
        if (kbdHu != null) {
            Executor executorKbd = kbdHu.Kbd();
            if (list.get(0).Kbd() == 1) {
                executorKbd = kbdHu.Pm();
            }
            if (executorKbd == null) {
                return;
            }
            this.tsL.incrementAndGet();
            executorKbd.execute(new com.bytedance.sdk.component.Kbd.EYQ.Kbd.Kbd("csj_log_upload") { // from class: com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td.1
                @Override // java.lang.Runnable
                public void run() {
                    Td td = Td.this;
                    td.EYQ((List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ>) list, z, j, td.IPb);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list, boolean z, long j, int i) {
        mZx mzxEYQ;
        try {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq = list.get(0);
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.VEW(), 1);
            if (eyq.Pm() == 0) {
                mzxEYQ = QQ.Kbd().EYQ(list);
                EYQ(mzxEYQ, list);
                if (mzxEYQ != null) {
                    com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.EYQ(list, mzxEYQ.Pm);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().VwS());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e) {
                    e.getMessage();
                }
                mzxEYQ = QQ.Kbd().EYQ(jSONObject);
            }
            mZx mzx = mzxEYQ;
            this.tsL.decrementAndGet();
            EYQ(z, mzx, list, j);
        } catch (Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.Kbc(), 1);
            this.tsL.decrementAndGet();
        }
    }

    private void mZx(List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list, final boolean z, final long j) {
        this.tsL.incrementAndGet();
        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.VEW(), 1);
        try {
            HashMap map = new HashMap();
            Iterator<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ next = it.next();
                int iTp = next == null ? 0 : next.tp();
                if (map.get(Integer.valueOf(iTp)) == null) {
                    map.put(Integer.valueOf(iTp), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iTp))).add(next);
            }
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Integer) it2.next()).intValue();
                if (iIntValue == 0 || QQ.VwS().Td() == null || QQ.VwS().Td().get(Integer.valueOf(iIntValue)) == null) {
                    this.Pm.EYQ(list, new com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx() { // from class: com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td.2
                        @Override // com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx
                        public void EYQ(List<EYQ> list2) {
                            try {
                                Td.this.tsL.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    EYQ eyq = list2.get(i);
                                    if (eyq != null) {
                                        Td.this.EYQ(z, eyq.EYQ(), eyq.mZx(), j);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                } else {
                    QQ.VwS().Td().get(Integer.valueOf(iIntValue)).EYQ(list, new com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx() { // from class: com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td.3
                        @Override // com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx
                        public void EYQ(List<EYQ> list2) {
                            try {
                                Td.this.tsL.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    EYQ eyq = list2.get(i);
                                    if (eyq != null) {
                                        Td.this.EYQ(z, eyq.EYQ(), eyq.mZx(), j);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        } catch (Exception e) {
            e.getMessage();
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.Kbc(), 1);
            this.tsL.decrementAndGet();
        }
    }

    private void Kbd(int i) {
        if (!EYQ()) {
            if (this.pi == null) {
                return;
            }
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.Td(), 1);
            if (this.pi.hasMessages(1)) {
                return;
            }
            if (i == 1) {
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.IPb(), 1);
            } else if (i == 2) {
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.Pm(), 1);
            } else if (i == 3) {
                com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.Kbd(), 1);
            }
            this.pi.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.EYQ(), 1);
    }

    private void EYQ(mZx mzx, List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list) {
        if (mzx == null || !mzx.EYQ) {
            return;
        }
        List<Object> listEYQ = com.bytedance.sdk.component.Kbd.EYQ.mZx.EYQ();
        if (list == null || listEYQ == null || listEYQ.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq : list) {
            if (eyq.Kbd() == 1) {
                com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.EYQ(eyq);
                com.bytedance.sdk.component.Kbd.EYQ.Td.EYQ.Kbd(eyq);
                Iterator<Object> it = listEYQ.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    private void tp() {
        long jNanoTime;
        if (this.pi.hasMessages(11)) {
            HX();
        } else {
            Kbd(1);
        }
        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.mZx(), 1);
        if (this.IPb == 2) {
            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.VwS(), 1);
            synchronized (this.Td) {
                try {
                    try {
                        long jNanoTime2 = System.nanoTime();
                        this.Td.wait(5000L);
                        jNanoTime = System.nanoTime() - jNanoTime2;
                        if (!com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.mZx) {
                            boolean z = com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.Td;
                        }
                    } catch (InterruptedException e) {
                        e.getMessage();
                    }
                    if (jNanoTime < 5000000000L && 5000000000L - jNanoTime >= 50000000) {
                        if (!com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.mZx && !com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.EYQ.Td) {
                            com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.mN(), 1);
                            Td(2);
                            return;
                        }
                        com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.MxO(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.Kbd.EYQ.Td.mZx.EYQ(com.bytedance.sdk.component.Kbd.EYQ.mZx.Pm.Pm.tp(), 1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(boolean z, mZx mzx, List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list, long j) {
        if (z || mzx == null) {
            return;
        }
        int i = mzx.mZx;
        int i2 = -2;
        if (mzx.Kbd) {
            i = -1;
        } else if (i < 0) {
            i = -2;
        }
        if (i == 510 || i == 511) {
            i = -2;
        }
        if (mzx.EYQ || ((i < 500 || i >= 509) && i <= 513)) {
            i2 = i;
        }
        if (list != null) {
            list.size();
            this.tsL.get();
        }
        EYQ(i2, list, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:53:0x00eb, B:55:0x00ef, B:56:0x00f4, B:18:0x0030, B:20:0x0040, B:22:0x0042, B:24:0x004f, B:26:0x0051, B:28:0x005f, B:29:0x0064, B:30:0x0069, B:32:0x006f, B:34:0x0075, B:36:0x0085, B:37:0x008a, B:39:0x0092, B:40:0x0097, B:41:0x00b4, B:43:0x00c4, B:45:0x00c6, B:47:0x00d3, B:49:0x00d5, B:51:0x00e3, B:52:0x00e8, B:59:0x00fb), top: B:64:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EYQ(int r6, java.util.List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> r7, long r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.Td.EYQ(int, java.util.List, long):void");
    }

    public void EYQ(int i, long j) {
        if (this.pi == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        if (i == 2) {
            this.pi.sendMessageDelayed(messageObtain, (((this.KO.incrementAndGet() - 1) % 4) + 1) * j);
        } else if (i == 3) {
            this.pi.sendMessageDelayed(messageObtain, (((this.hu.incrementAndGet() - 1) % 4) + 1) * j);
        }
    }
}
