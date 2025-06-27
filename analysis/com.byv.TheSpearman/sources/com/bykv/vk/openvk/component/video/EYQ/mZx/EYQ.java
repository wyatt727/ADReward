package com.bykv.vk.openvk.component.video.EYQ.mZx;

import com.bykv.vk.openvk.component.video.EYQ.mZx.HX;
import com.bykv.vk.openvk.component.video.EYQ.mZx.tsL;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AbsTask.java */
/* loaded from: classes.dex */
abstract class EYQ implements MxO {
    private static final AtomicLong pi = new AtomicLong();
    protected volatile com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ EYQ;
    protected volatile HX HX;
    protected volatile List<HX.mZx> IPb;
    protected com.bykv.vk.openvk.component.video.EYQ.mZx.Pm.EYQ Kbd;
    protected volatile String QQ;
    protected volatile String VwS;
    protected final com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td mZx;
    protected volatile tsL tp;
    protected final AtomicInteger Td = new AtomicInteger();
    protected final AtomicLong Pm = new AtomicLong();
    protected volatile boolean MxO = false;
    public final long tsL = pi.incrementAndGet();
    private final AtomicInteger nWX = new AtomicInteger(0);
    private int KO = -1;

    public EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ eyq, com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td td) {
        this.EYQ = eyq;
        this.mZx = td;
    }

    public void EYQ() {
        this.nWX.compareAndSet(0, 1);
    }

    public boolean mZx() {
        return this.nWX.get() == 1;
    }

    protected void Td() {
        this.nWX.compareAndSet(0, 2);
    }

    public boolean Pm() {
        return this.nWX.get() == 2;
    }

    protected void Kbd() throws com.bykv.vk.openvk.component.video.EYQ.mZx.Td.EYQ {
        if (mZx()) {
            throw new com.bykv.vk.openvk.component.video.EYQ.mZx.Td.EYQ();
        }
    }

    protected com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ EYQ(tsL.EYQ eyq, int i, int i2, String str) throws IOException {
        com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.mZx mZx = com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.Td.EYQ().mZx();
        com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.Kbd kbd = new com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.Kbd();
        HashMap map = new HashMap();
        kbd.mZx = eyq.EYQ;
        kbd.EYQ = 0;
        if ("HEAD".equalsIgnoreCase(str)) {
            kbd.EYQ = 4;
        }
        List<HX.mZx> list = this.IPb;
        if (list != null && !list.isEmpty()) {
            for (HX.mZx mzx : list) {
                if (!"Range".equalsIgnoreCase(mzx.EYQ) && !"Connection".equalsIgnoreCase(mzx.EYQ) && !"Proxy-Connection".equalsIgnoreCase(mzx.EYQ) && !HttpHeaders.HOST.equalsIgnoreCase(mzx.EYQ)) {
                    map.put(mzx.EYQ, mzx.mZx);
                }
            }
        }
        String strEYQ = com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(i, i2);
        if (strEYQ != null) {
            map.put("Range", strEYQ);
        }
        if (Kbd.IPb) {
            map.put("Cache-Control", "no-cache");
        }
        Pm pmTd = Pm.Td();
        IPb iPbEYQ = IPb.EYQ();
        boolean z = this.HX == null;
        Td tdEYQ = z ? pmTd.EYQ() : iPbEYQ.mZx();
        Td tdMZx = z ? pmTd.mZx() : iPbEYQ.Td();
        if ((tdEYQ != null || tdMZx != null) && (tdEYQ != null || tdMZx != null)) {
            throw null;
        }
        kbd.Kbd = map;
        if (this.MxO) {
            this.MxO = false;
            return null;
        }
        return mZx.EYQ(kbd);
    }

    protected int IPb() {
        if (this.HX != null) {
            return this.HX.Td.EYQ;
        }
        return this.EYQ instanceof com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.mZx ? 1 : 0;
    }

    protected boolean VwS() {
        return IPb() == 1;
    }

    protected void EYQ(int i, int i2) {
        if (i <= 0 || i2 < 0) {
            return;
        }
        int i3 = Kbd.VwS;
        int iIPb = IPb();
        if (i3 == 1 || (i3 == 2 && iIPb == 1)) {
            int i4 = (int) ((i2 / i) * 100.0f);
            if (i4 > 100) {
                i4 = 100;
            }
            synchronized (this) {
                if (i4 <= this.KO) {
                    return;
                }
                this.KO = i4;
                com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EYQ.this.Kbd != null) {
                            tsL tsl = EYQ.this.tp;
                            int unused = EYQ.this.KO;
                        }
                    }
                });
            }
        }
    }
}
