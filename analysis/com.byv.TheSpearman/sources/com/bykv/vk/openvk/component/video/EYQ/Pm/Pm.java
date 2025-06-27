package com.bykv.vk.openvk.component.video.EYQ.Pm;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.component.video.EYQ.Pm.Td;
import com.bykv.vk.openvk.component.video.api.EYQ;
import com.bytedance.sdk.component.VwS.HX;
import com.bytedance.sdk.component.utils.wBa;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SSMediaPlayerWrapper.java */
/* loaded from: classes.dex */
public class Pm implements Td.EYQ, Td.IPb, Td.Kbd, Td.Pm, Td.InterfaceC0058Td, Td.VwS, Td.mZx, com.bykv.vk.openvk.component.video.api.EYQ, wBa.EYQ {
    private static final SparseIntArray tPj = new SparseIntArray();
    private SurfaceTexture EYQ;
    private boolean HX;
    private volatile boolean PI;
    private int Pm;
    private ArrayList<Runnable> WU;
    private SurfaceHolder mZx;
    private wBa pi;
    private boolean tp;
    private boolean wBa;
    private boolean zF;
    private int Td = 0;
    private boolean Kbd = false;
    private volatile Td IPb = null;
    private final boolean VwS = false;
    private boolean QQ = false;
    private volatile int MxO = 201;
    private long tsL = -1;
    private boolean nWX = false;
    private long KO = 0;
    private long hu = Long.MIN_VALUE;
    private long UB = 0;
    private long Uc = 0;
    private long hYh = 0;
    private int XN = 0;
    private String NZ = "0";
    private final List<WeakReference<EYQ.InterfaceC0063EYQ>> rfB = new CopyOnWriteArrayList();
    private com.bykv.vk.openvk.component.video.api.Td.Td lEs = null;
    private boolean xt = false;
    private volatile int Nvm = 200;
    private AtomicBoolean FH = new AtomicBoolean(false);
    private Surface tr = null;
    private final Runnable Tnp = new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.1
        @Override // java.lang.Runnable
        public void run() {
            if (Pm.this.IPb == null) {
                return;
            }
            long jUB = Pm.this.UB();
            if (jUB > 0 && Build.VERSION.SDK_INT >= 23 && Pm.this.IPb() && Pm.this.hu != Long.MIN_VALUE) {
                try {
                    if (Pm.this.hu == jUB) {
                        if (!Pm.this.nWX && Pm.this.UB >= 400) {
                            Pm.this.mZx(701, 800);
                            Pm.this.nWX = true;
                        }
                        Pm.this.UB += Pm.this.Nvm;
                    } else {
                        if (Pm.this.nWX) {
                            Pm.this.KO += Pm.this.UB;
                            Pm.this.mZx(702, 800);
                            Long.valueOf(Pm.this.KO);
                            Integer.valueOf(Pm.this.Td);
                        }
                        Pm.this.UB = 0L;
                        Pm.this.nWX = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (Pm.this.hu() > 0) {
                if (Pm.this.hu != jUB) {
                    if (com.bykv.vk.openvk.component.video.api.Td.Kbd()) {
                        Long.valueOf(Pm.this.hu);
                        Long.valueOf(jUB);
                    }
                    Pm pm = Pm.this;
                    pm.EYQ(jUB, pm.hu());
                }
                Pm.this.hu = jUB;
            }
            if (!Pm.this.mZx()) {
                if (Pm.this.pi != null) {
                    Pm.this.pi.postDelayed(this, Pm.this.Nvm);
                }
            } else {
                Pm pm2 = Pm.this;
                pm2.EYQ(pm2.hu(), Pm.this.hu());
            }
        }
    };
    private final EYQ FtN = new EYQ();
    private long kf = 0;
    private long mN = 0;
    private boolean Kbc = false;

    private boolean EYQ(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(long j, long j2) {
        for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference : this.rfB) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().EYQ(this, j, j2);
            }
        }
    }

    public Pm() {
        EYQ("SSMediaPlayerWrapper");
    }

    private void EYQ(String str) {
        this.XN = 0;
        this.pi = com.bytedance.sdk.component.VwS.EYQ.EYQ.EYQ().EYQ(this, HX.THREAD_NAME_PRE.concat(String.valueOf(str)));
        this.Kbc = Build.VERSION.SDK_INT >= 17;
        WU();
    }

    private void zF() {
        this.KO = 0L;
        this.Td = 0;
        this.UB = 0L;
        this.nWX = false;
        this.hu = Long.MIN_VALUE;
    }

    public void EYQ(final boolean z) {
        if (QQ()) {
            return;
        }
        this.wBa = z;
        if (this.IPb != null) {
            this.IPb.EYQ(z);
            return;
        }
        wBa wba = this.pi;
        if (wba != null) {
            wba.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.9
                @Override // java.lang.Runnable
                public void run() {
                    if (Pm.this.IPb != null) {
                        Pm.this.IPb.EYQ(z);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void WU() {
        wBa wba = this.pi;
        if (wba != null) {
            wba.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.10
                @Override // java.lang.Runnable
                public void run() {
                    if (Pm.this.IPb == null) {
                        try {
                            Pm.this.IPb = new mZx();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        if (Pm.this.IPb == null) {
                            return;
                        }
                        Td unused = Pm.this.IPb;
                        Pm.this.NZ = "0";
                        Pm.this.IPb.EYQ((Td.Kbd) Pm.this);
                        Pm.this.IPb.EYQ((Td.mZx) Pm.this);
                        Pm.this.IPb.EYQ((Td.InterfaceC0058Td) Pm.this);
                        Pm.this.IPb.EYQ((Td.EYQ) Pm.this);
                        Pm.this.IPb.EYQ((Td.IPb) Pm.this);
                        Pm.this.IPb.EYQ((Td.Pm) Pm.this);
                        Pm.this.IPb.EYQ((Td.VwS) Pm.this);
                        try {
                            Pm.this.IPb.Td(false);
                        } catch (Throwable unused2) {
                        }
                        Pm.this.QQ = false;
                    }
                }
            });
        }
    }

    public void HX() {
        if (QQ() || this.IPb == null) {
            return;
        }
        this.FH.set(true);
        if (this.MxO != 206) {
            zF();
            this.PI = false;
            this.FtN.EYQ(true);
            mZx(0L);
            wBa wba = this.pi;
            if (wba != null) {
                wba.removeCallbacks(this.Tnp);
                this.pi.postDelayed(this.Tnp, this.Nvm);
            }
        }
    }

    public void EYQ(boolean z, long j, boolean z2) {
        if (QQ()) {
            return;
        }
        WU();
        this.xt = z2;
        this.FH.set(true);
        this.PI = false;
        mZx(z2);
        if (z) {
            this.tsL = j;
            XN();
        } else {
            mZx(j);
        }
        wBa wba = this.pi;
        if (wba != null) {
            wba.removeCallbacks(this.Tnp);
            this.pi.postDelayed(this.Tnp, this.Nvm);
        }
    }

    private void mZx(long j) {
        this.FtN.EYQ(j);
        if (this.wBa) {
            mZx(this.FtN);
        } else if (mZx(this.lEs)) {
            mZx(this.FtN);
        } else {
            EYQ(this.FtN);
        }
    }

    private boolean mZx(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        return td != null && td.Pm();
    }

    public void tp() {
        if (QQ() || this.pi == null) {
            return;
        }
        this.FH.set(true);
        this.pi.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.11
            @Override // java.lang.Runnable
            public void run() {
                if (!Pm.this.VwS() || Pm.this.IPb == null) {
                    return;
                }
                try {
                    Pm.this.IPb.Kbd();
                    for (WeakReference weakReference : Pm.this.rfB) {
                        if (weakReference != null && weakReference.get() != null) {
                            ((EYQ.InterfaceC0063EYQ) weakReference.get()).Kbd(Pm.this);
                        }
                    }
                    Pm.this.MxO = 206;
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        });
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    class EYQ implements Runnable {
        private boolean Td;
        private long mZx;

        EYQ() {
        }

        public void EYQ(boolean z) {
            this.Td = z;
        }

        public void EYQ(long j) {
            this.mZx = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Pm.this.IPb != null) {
                try {
                    if (!this.Td) {
                        long jHX = Pm.this.IPb.HX();
                        Pm.this.tsL = Math.max(this.mZx, jHX);
                    }
                    long unused = Pm.this.tsL;
                } catch (Throwable th) {
                    th.toString();
                }
            }
            if (Pm.this.pi != null) {
                Pm.this.pi.sendEmptyMessageDelayed(100, 0L);
            }
        }
    }

    public void MxO() {
        wBa wba;
        if (QQ() || (wba = this.pi) == null) {
            return;
        }
        wba.removeMessages(100);
        this.PI = true;
        if (!this.Kbc) {
            if (this.zF || mZx(this.lEs)) {
                wBa wba2 = this.pi;
                if (wba2 != null) {
                    wba2.sendEmptyMessage(101);
                    return;
                }
                return;
            }
            EYQ(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.12
                @Override // java.lang.Runnable
                public void run() {
                    if (Pm.this.pi != null) {
                        Pm.this.pi.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        if (this.Kbd || mZx(this.lEs)) {
            wBa wba3 = this.pi;
            if (wba3 != null) {
                wba3.sendEmptyMessage(101);
                return;
            }
            return;
        }
        EYQ(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.13
            @Override // java.lang.Runnable
            public void run() {
                if (Pm.this.pi != null) {
                    Pm.this.pi.sendEmptyMessage(101);
                }
            }
        });
    }

    public void tsL() {
        if (QQ()) {
            return;
        }
        this.tp = true;
        FH();
        wBa wba = this.pi;
        if (wba != null) {
            try {
                wba.removeCallbacksAndMessages(null);
                if (this.IPb != null) {
                    this.pi.sendEmptyMessage(103);
                }
                tPj();
            } catch (Throwable unused) {
                tPj();
            }
        }
    }

    private void XN() {
        mZx(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.14
            @Override // java.lang.Runnable
            public void run() {
                if (Pm.this.pi != null) {
                    Pm.this.pi.sendEmptyMessage(104);
                }
            }
        });
    }

    public void EYQ(final long j) {
        if (QQ()) {
            return;
        }
        if (this.MxO == 207 || this.MxO == 206 || this.MxO == 209) {
            mZx(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.2
                @Override // java.lang.Runnable
                public void run() {
                    if (Pm.this.pi != null) {
                        Pm.this.pi.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ
    public boolean EYQ() {
        return this.Kbd;
    }

    public void EYQ(final SurfaceTexture surfaceTexture) {
        if (QQ()) {
            return;
        }
        this.EYQ = surfaceTexture;
        EYQ(true);
        mZx(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.3
            @Override // java.lang.Runnable
            public void run() {
                Pm.this.WU();
                if (Pm.this.pi != null) {
                    Pm.this.pi.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void EYQ(final SurfaceHolder surfaceHolder) {
        if (QQ()) {
            return;
        }
        this.mZx = surfaceHolder;
        EYQ(true);
        mZx(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.4
            @Override // java.lang.Runnable
            public void run() {
                Pm.this.WU();
                if (Pm.this.pi != null) {
                    Pm.this.pi.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void EYQ(final com.bykv.vk.openvk.component.video.api.Td.Td td) {
        if (QQ()) {
            return;
        }
        this.lEs = td;
        if (td != null) {
            this.Kbc = this.Kbc && !td.Pm();
        }
        mZx(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.5
            @Override // java.lang.Runnable
            public void run() {
                Pm.this.WU();
                if (Pm.this.pi != null) {
                    Pm.this.pi.obtainMessage(107, td).sendToTarget();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ
    public boolean IPb() {
        wBa wba;
        return (this.MxO == 206 || ((wba = this.pi) != null && wba.hasMessages(100))) && !this.PI;
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ
    public boolean Td() {
        return pi() || IPb() || VwS();
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ
    public boolean VwS() {
        wBa wba;
        return ((this.MxO != 207 && !this.PI) || (wba = this.pi) == null || wba.hasMessages(100)) ? false : true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ
    public boolean QQ() {
        return this.tp;
    }

    public boolean pi() {
        return this.MxO == 205;
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ
    public boolean mZx() {
        return this.MxO == 209;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ(android.os.Message r17) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.EYQ(android.os.Message):void");
    }

    private void mZx(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.IPb.EYQ(fileInputStream.getFD());
        fileInputStream.close();
    }

    private void NZ() {
        if (this.IPb == null) {
            return;
        }
        try {
            this.IPb.tsL();
        } catch (Throwable unused) {
        }
        this.IPb.EYQ((Td.mZx) null);
        this.IPb.EYQ((Td.VwS) null);
        this.IPb.EYQ((Td.EYQ) null);
        this.IPb.EYQ((Td.Pm) null);
        this.IPb.EYQ((Td.InterfaceC0058Td) null);
        this.IPb.EYQ((Td.Kbd) null);
        this.IPb.EYQ((Td.IPb) null);
        try {
            this.IPb.MxO();
        } catch (Throwable unused2) {
        }
    }

    private void tPj() {
        wBa wba = this.pi;
        if (wba == null || wba.getLooper() == null) {
            return;
        }
        this.pi.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.6
            @Override // java.lang.Runnable
            public void run() {
                if (Pm.this.pi == null || Pm.this.pi.getLooper() == null) {
                    return;
                }
                try {
                    com.bytedance.sdk.component.VwS.EYQ.EYQ.EYQ().EYQ(Pm.this.pi);
                    Pm.this.pi = null;
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td.EYQ
    public void EYQ(Td td, int i) {
        if (this.IPb != td) {
            return;
        }
        for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference : this.rfB) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mZx(this, i);
            }
        }
    }

    private void wBa() {
        SparseIntArray sparseIntArray = tPj;
        Integer numValueOf = Integer.valueOf(sparseIntArray.get(this.XN));
        if (numValueOf == null) {
            sparseIntArray.put(this.XN, 1);
        } else {
            sparseIntArray.put(this.XN, numValueOf.intValue() + 1);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td.mZx
    public void EYQ(Td td) {
        this.MxO = 209;
        tPj.delete(this.XN);
        wBa wba = this.pi;
        if (wba != null) {
            wba.removeCallbacks(this.Tnp);
        }
        for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference : this.rfB) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().EYQ(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td.InterfaceC0058Td
    public boolean EYQ(Td td, int i, int i2) {
        wBa();
        this.MxO = 200;
        wBa wba = this.pi;
        if (wba != null) {
            wba.removeCallbacks(this.Tnp);
        }
        if (EYQ(i, i2)) {
            tPj();
        }
        if (!this.FH.get()) {
            return true;
        }
        this.FH.set(false);
        com.bykv.vk.openvk.component.video.api.Td.EYQ eyq = new com.bykv.vk.openvk.component.video.api.Td.EYQ(i, i2);
        for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference : this.rfB) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().EYQ(this, eyq);
            }
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td.Pm
    public boolean mZx(Td td, int i, int i2) {
        if (this.IPb != td) {
            return false;
        }
        if (i2 == -1004) {
            com.bykv.vk.openvk.component.video.api.Td.EYQ eyq = new com.bykv.vk.openvk.component.video.api.Td.EYQ(i, i2);
            for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference : this.rfB) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().EYQ(this, eyq);
                }
            }
        }
        mZx(i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(int i, int i2) {
        if (i == 701) {
            this.kf = SystemClock.elapsedRealtime();
            this.Td++;
            for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference : this.rfB) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().EYQ(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            Integer.valueOf(this.Td);
            return;
        }
        if (i == 702) {
            if (this.kf > 0) {
                this.mN += SystemClock.elapsedRealtime() - this.kf;
                this.kf = 0L;
            }
            for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference2 : this.rfB) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().EYQ((com.bykv.vk.openvk.component.video.api.EYQ) this, Integer.MAX_VALUE);
                }
            }
            Integer.valueOf(this.Td);
            Long.valueOf(this.mN);
            return;
        }
        if (this.Kbc && i == 3) {
            Nvm();
            rfB();
            mZx(this.xt);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td.Kbd
    public void mZx(Td td) {
        if (QQ()) {
            return;
        }
        this.MxO = 205;
        try {
            com.bykv.vk.openvk.component.video.api.Td.Td td2 = this.lEs;
            if (td2 != null) {
                float fTsL = td2.tsL();
                if (fTsL > 0.0f) {
                    com.bykv.vk.openvk.component.video.api.mZx mzx = new com.bykv.vk.openvk.component.video.api.mZx();
                    mzx.EYQ(fTsL);
                    this.IPb.EYQ(mzx);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.pi != null) {
            if (this.PI) {
                lEs();
            } else {
                wBa wba = this.pi;
                wba.sendMessage(wba.obtainMessage(100, -1, -1));
            }
        }
        tPj.delete(this.XN);
        boolean z = this.Kbc;
        boolean z2 = this.zF;
        if (!z && !z2) {
            rfB();
            this.zF = true;
        }
        for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference : this.rfB) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mZx(this);
            }
        }
    }

    private void rfB() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.hYh;
        for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference : this.rfB) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().EYQ(this, jElapsedRealtime);
            }
        }
        this.Kbd = true;
    }

    private void lEs() {
        wBa wba = this.pi;
        if (wba != null) {
            wba.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Pm.this.IPb.VwS();
                        Pm.this.MxO = 207;
                        Pm.this.PI = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td.IPb
    public void Td(Td td) {
        for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference : this.rfB) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().EYQ((com.bykv.vk.openvk.component.video.api.EYQ) this, true);
            }
        }
    }

    private void EYQ(Runnable runnable) {
        try {
            if (this.WU == null) {
                this.WU = new ArrayList<>();
            }
            this.WU.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void xt() {
        if (this.HX) {
            return;
        }
        this.HX = true;
        Iterator it = new ArrayList(this.WU).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.WU.clear();
        this.HX = false;
    }

    private void Nvm() {
        ArrayList<Runnable> arrayList = this.WU;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        xt();
    }

    private void FH() {
        ArrayList<Runnable> arrayList = this.WU;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.WU.clear();
    }

    private void mZx(Runnable runnable) {
        if (runnable == null || QQ()) {
            return;
        }
        if (!this.tp) {
            runnable.run();
        } else {
            EYQ(runnable);
        }
    }

    public void mZx(final boolean z) {
        wBa wba;
        if (QQ() || (wba = this.pi) == null) {
            return;
        }
        wba.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.Pm.Pm.8
            @Override // java.lang.Runnable
            public void run() {
                if (Pm.this.QQ() || Pm.this.IPb == null) {
                    return;
                }
                try {
                    Pm.this.xt = z;
                    Pm.this.IPb.Pm(z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public long nWX() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.nWX) {
                long j = this.UB;
                if (j > 0) {
                    return this.KO + j;
                }
            }
            return this.KO;
        }
        return this.mN;
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ
    public int Pm() {
        if (this.IPb == null || QQ()) {
            return 0;
        }
        return this.IPb.pi();
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ
    public int Kbd() {
        if (this.IPb == null || QQ()) {
            return 0;
        }
        return this.IPb.nWX();
    }

    public int KO() {
        return this.Td;
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.Pm.Td.VwS
    public void EYQ(Td td, int i, int i2, int i3, int i4) {
        for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference : this.rfB) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().EYQ((com.bykv.vk.openvk.component.video.api.EYQ) this, i, i2);
            }
        }
    }

    public long hu() {
        long j = this.Uc;
        if (j != 0) {
            return j;
        }
        if (this.MxO == 206 || this.MxO == 207) {
            try {
                this.Uc = this.IPb.tp();
            } catch (Throwable unused) {
            }
        }
        return this.Uc;
    }

    public long UB() {
        if (QQ()) {
            return 0L;
        }
        if (this.MxO == 206 || this.MxO == 207) {
            try {
                return this.IPb.HX();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public void EYQ(EYQ.InterfaceC0063EYQ interfaceC0063EYQ) {
        if (interfaceC0063EYQ == null) {
            return;
        }
        for (WeakReference<EYQ.InterfaceC0063EYQ> weakReference : this.rfB) {
            if (weakReference != null && weakReference.get() == interfaceC0063EYQ) {
                return;
            }
        }
        this.rfB.add(new WeakReference<>(interfaceC0063EYQ));
    }

    public void EYQ(int i) {
        if (QQ()) {
            return;
        }
        this.Nvm = i;
    }

    public SurfaceHolder Uc() {
        return this.mZx;
    }

    public SurfaceTexture hYh() {
        return this.EYQ;
    }

    public void mZx(int i) {
        this.Pm = i;
    }
}
