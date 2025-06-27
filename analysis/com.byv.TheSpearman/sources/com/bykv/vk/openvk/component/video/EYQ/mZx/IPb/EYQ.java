package com.bykv.vk.openvk.component.video.EYQ.mZx.IPb;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.EYQ.mZx.IPb;
import com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd;
import com.bykv.vk.openvk.component.video.EYQ.mZx.Pm;
import com.bykv.vk.openvk.component.video.api.IPb.Td;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: VideoCachePreloader.java */
/* loaded from: classes.dex */
public class EYQ {
    public static final boolean EYQ = Td.Td();
    private C0060EYQ Td;
    private HashMap<String, Boolean> mZx;

    private EYQ() {
        this.mZx = new HashMap<>();
        mZx();
    }

    public static EYQ EYQ() {
        return mZx.EYQ;
    }

    /* compiled from: VideoCachePreloader.java */
    private static class mZx {
        private static final EYQ EYQ = new EYQ();
    }

    public boolean mZx() {
        if (this.Td != null) {
            return true;
        }
        com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td Td = Td();
        if (Td == null) {
            return false;
        }
        Kbd.EYQ(true);
        Kbd.mZx(true);
        Kbd.EYQ(1);
        IPb.EYQ().Pm();
        try {
            C0060EYQ c0060eyq = new C0060EYQ();
            this.Td = c0060eyq;
            c0060eyq.setName("csj_video_cache_preloader");
            this.Td.start();
            Kbd.EYQ(Td, com.bykv.vk.openvk.component.video.api.Td.EYQ());
            Pm.Td();
            Pm.Td().EYQ(10485759);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        if (!mZx()) {
            return false;
        }
        this.Td.EYQ(td);
        return true;
    }

    public String mZx(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        if (td == null) {
            return null;
        }
        boolean z = !TextUtils.isEmpty(td.nWX());
        return IPb.EYQ().EYQ(false, z, z ? td.nWX() : td.pi(), td.pi());
    }

    private static com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td Td() {
        File file = new File(com.bykv.vk.openvk.component.video.api.Td.EYQ().getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td td = new com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td(file);
            try {
                td.EYQ(104857600L);
                return td;
            } catch (IOException unused) {
                return td;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* compiled from: VideoCachePreloader.java */
    /* renamed from: com.bykv.vk.openvk.component.video.EYQ.mZx.IPb.EYQ$EYQ, reason: collision with other inner class name */
    class C0060EYQ extends Thread {
        private final Queue<C0061EYQ> Pm = new ArrayBlockingQueue(10);
        private Queue<C0061EYQ> mZx = new LinkedBlockingQueue();
        private boolean Td = true;
        private Queue<C0061EYQ> Kbd = new LinkedBlockingQueue();

        public C0060EYQ() {
        }

        private C0061EYQ EYQ(int i, com.bykv.vk.openvk.component.video.api.Td.Td td) {
            this.Pm.size();
            C0061EYQ c0061eyqPoll = this.Pm.poll();
            if (c0061eyqPoll == null) {
                c0061eyqPoll = new C0061EYQ();
            }
            c0061eyqPoll.EYQ = i;
            c0061eyqPoll.IPb = td;
            return c0061eyqPoll;
        }

        private void EYQ(C0061EYQ c0061eyq) {
            c0061eyq.Td = null;
            c0061eyq.mZx = null;
            c0061eyq.EYQ = -1;
            c0061eyq.IPb = null;
            this.Pm.offer(c0061eyq);
        }

        private synchronized void mZx(C0061EYQ c0061eyq) {
            this.Kbd.add(c0061eyq);
            notify();
        }

        private void Td(C0061EYQ c0061eyq) {
            if (c0061eyq == null) {
                return;
            }
            this.mZx.offer(c0061eyq);
            notify();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.Td) {
                synchronized (this) {
                    if (!this.Kbd.isEmpty()) {
                        EYQ();
                    }
                    while (!this.mZx.isEmpty()) {
                        C0061EYQ c0061eyqPoll = this.mZx.poll();
                        if (c0061eyqPoll != null) {
                            int i = c0061eyqPoll.EYQ;
                            if (i != 0) {
                                if (i == 1) {
                                    Pm.Td().EYQ(c0061eyqPoll.mZx);
                                } else if (i == 2) {
                                    Pm.Td().Pm();
                                } else if (i == 3) {
                                    Pm.Td().Pm();
                                    if (Kbd.Td() != null) {
                                        Kbd.Td();
                                        throw null;
                                    }
                                    if (Kbd.mZx() != null) {
                                        Kbd.mZx().EYQ();
                                    }
                                } else if (i == 4) {
                                    Pm.Td().Pm();
                                    this.Td = false;
                                }
                            } else if (c0061eyqPoll.Td != null && c0061eyqPoll.Td.length > 0) {
                                ArrayList arrayList = new ArrayList();
                                for (String str : c0061eyqPoll.Td) {
                                    if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(str)) {
                                        arrayList.add(str);
                                    }
                                }
                                Pm.Td().EYQ(false, !TextUtils.isEmpty(c0061eyqPoll.Kbd), c0061eyqPoll.Pm, c0061eyqPoll.mZx, (String[]) arrayList.toArray(new String[arrayList.size()]));
                            }
                            EYQ(c0061eyqPoll);
                        }
                    }
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        private void EYQ() {
            while (true) {
                C0061EYQ c0061eyqPoll = this.Kbd.poll();
                if (c0061eyqPoll == null) {
                    return;
                }
                c0061eyqPoll.mZx = c0061eyqPoll.IPb.pi();
                c0061eyqPoll.Td = new String[]{c0061eyqPoll.IPb.pi()};
                int iEYQ = c0061eyqPoll.IPb.EYQ();
                if (iEYQ <= 0) {
                    iEYQ = c0061eyqPoll.IPb.Td();
                }
                c0061eyqPoll.Pm = iEYQ;
                c0061eyqPoll.Kbd = c0061eyqPoll.IPb.nWX();
                if (!TextUtils.isEmpty(c0061eyqPoll.IPb.nWX())) {
                    c0061eyqPoll.mZx = c0061eyqPoll.IPb.nWX();
                }
                c0061eyqPoll.IPb = null;
                Td(c0061eyqPoll);
            }
        }

        public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td) {
            mZx(EYQ(0, td));
        }

        /* compiled from: VideoCachePreloader.java */
        /* renamed from: com.bykv.vk.openvk.component.video.EYQ.mZx.IPb.EYQ$EYQ$EYQ, reason: collision with other inner class name */
        private class C0061EYQ {
            public int EYQ;
            public com.bykv.vk.openvk.component.video.api.Td.Td IPb;
            public String Kbd;
            public int Pm;
            public String[] Td;
            public String mZx;

            public C0061EYQ() {
            }
        }
    }
}
