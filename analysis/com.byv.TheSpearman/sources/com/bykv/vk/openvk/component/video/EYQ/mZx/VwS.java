package com.bykv.vk.openvk.component.video.EYQ.mZx;

import android.os.SystemClock;
import android.util.Log;
import com.bykv.vk.openvk.component.video.EYQ.mZx.HX;
import com.bykv.vk.openvk.component.video.EYQ.mZx.QQ;
import com.bykv.vk.openvk.component.video.EYQ.mZx.mZx;
import com.bykv.vk.openvk.component.video.EYQ.mZx.tsL;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* compiled from: ProxyTask.java */
/* loaded from: classes.dex */
class VwS extends com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ {
    private final Pm KO;
    private volatile boolean UB;
    private volatile com.bykv.vk.openvk.component.video.EYQ.mZx.mZx hu;
    private final Td nWX;
    private final Socket pi;

    /* compiled from: ProxyTask.java */
    public interface Td {
        void EYQ(VwS vwS);

        void mZx(VwS vwS);
    }

    VwS(EYQ eyq) {
        super(eyq.EYQ, eyq.mZx);
        this.UB = true;
        this.pi = eyq.Td;
        this.nWX = eyq.Pm;
        this.KO = Pm.Td();
    }

    private mZx QQ() throws IOException {
        try {
            this.HX = HX.EYQ(this.pi.getInputStream());
            OutputStream outputStream = this.pi.getOutputStream();
            com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ eyq = this.HX.Td.EYQ == 1 ? Kbd.EYQ : Kbd.mZx;
            if (eyq == null) {
                if (Kbd.Td) {
                    Log.e("TAG_PROXY_ProxyTask", "cache is null");
                }
                return null;
            }
            this.EYQ = eyq;
            this.VwS = this.HX.Td.mZx;
            this.QQ = this.HX.Td.Td;
            this.tp = new tsL(this.HX.Td.VwS);
            this.IPb = this.HX.mZx;
            if (Kbd.Td) {
                Log.i("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.HX.toString());
            }
            return new mZx(outputStream, this.HX.Td.Pm);
        } catch (HX.Pm e) {
            com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(this.pi);
            if (Kbd.Td) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
            }
            if (this.EYQ != null) {
                Boolean.valueOf(VwS());
            }
            String str = this.VwS;
            return null;
        } catch (IOException e2) {
            com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(this.pi);
            if (Kbd.Td) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
            }
            if (this.EYQ != null) {
                Boolean.valueOf(VwS());
            }
            String str2 = this.VwS;
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ EYQ2;
        mZx mzxQQ = QQ();
        if (mzxQQ == null) {
            return;
        }
        Td td = this.nWX;
        if (td != null) {
            td.EYQ(this);
        }
        this.EYQ.EYQ(this.QQ);
        if (Kbd.QQ != 0 && ((EYQ2 = this.mZx.EYQ(this.QQ, this.HX.Td.EYQ)) == null || this.EYQ.Td(this.QQ).length() < EYQ2.Td)) {
            this.KO.EYQ(VwS(), this.QQ);
        }
        try {
            EYQ(mzxQQ);
        } catch (com.bykv.vk.openvk.component.video.EYQ.mZx.Td.EYQ e) {
            if (Kbd.Td) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
            }
        } catch (Throwable th) {
            if (Kbd.Td) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(th));
            }
        }
        this.EYQ.mZx(this.QQ);
        this.KO.EYQ(VwS(), null);
        EYQ();
        com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(this.pi);
        Td td2 = this.nWX;
        if (td2 != null) {
            td2.mZx(this);
        }
    }

    private boolean EYQ(mZx mzx) throws Throwable {
        while (this.tp.EYQ()) {
            Kbd();
            tsL.EYQ eyqMZx = this.tp.mZx();
            try {
                EYQ(mzx, eyqMZx);
                return true;
            } catch (QQ.EYQ e) {
                if (Kbd.Td) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
                }
                this.UB = false;
                Boolean.valueOf(VwS());
                String str = this.VwS;
            } catch (com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Pm e2) {
                if (Kbd.Td) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
                }
                return true;
            } catch (com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Td unused) {
                eyqMZx.EYQ();
                Boolean.valueOf(VwS());
                String str2 = this.VwS;
            } catch (com.bykv.vk.openvk.component.video.EYQ.mZx.Td.mZx e3) {
                if (Kbd.Td) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e3));
                }
                return false;
            } catch (IOException e4) {
                if (e4 instanceof SocketTimeoutException) {
                    eyqMZx.mZx();
                }
                if (mZx()) {
                    if (Kbd.Td) {
                        if ("Canceled".equalsIgnoreCase(e4.getMessage())) {
                            Log.w("TAG_PROXY_ProxyTask", "okhttp call canceled");
                        } else {
                            Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e4));
                        }
                    }
                } else {
                    Boolean.valueOf(VwS());
                    String str3 = this.VwS;
                }
            } catch (Exception e5) {
                if (Kbd.Td) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e5));
                }
            }
        }
        return false;
    }

    private void EYQ(mZx mzx, tsL.EYQ eyq) throws Throwable {
        if ("HEAD".equalsIgnoreCase(this.HX.EYQ.EYQ)) {
            mZx(mzx, eyq);
        } else {
            Td(mzx, eyq);
        }
    }

    private void mZx(mZx mzx, tsL.EYQ eyq) throws com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Pm, IOException {
        byte[] bArrEYQ = EYQ(this.mZx.EYQ(this.QQ, this.HX.Td.EYQ), mzx, eyq);
        if (bArrEYQ == null) {
            return;
        }
        mzx.EYQ(bArrEYQ, 0, bArrEYQ.length);
    }

    private void Td(mZx mzx, tsL.EYQ eyq) throws Throwable {
        if (this.UB) {
            File fileTd = this.EYQ.Td(this.QQ);
            long length = fileTd.length();
            com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ EYQ2 = this.mZx.EYQ(this.QQ, this.HX.Td.EYQ);
            int iMZx = mzx.mZx();
            if (length > mzx.mZx()) {
                if (Kbd.Td) {
                    Log.i("TAG_PROXY_ProxyTask", "cache hit, remainSize: " + (length - iMZx));
                }
                EYQ(EYQ2, fileTd, mzx, eyq);
                return;
            }
        } else {
            mzx.mZx();
        }
        Pm(mzx, eyq);
    }

    private byte[] EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ eyq, mZx mzx, tsL.EYQ eyq2) throws IOException {
        if (eyq != null) {
            if (Kbd.Td) {
                Log.i("TAG_PROXY_ProxyTask", "get header from db");
            }
            return com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(eyq, mzx.mZx()).getBytes(com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ);
        }
        com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ EYQ2 = EYQ(eyq2, 0, -1, "HEAD");
        if (EYQ2 == null) {
            return null;
        }
        try {
            String strEYQ = com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(EYQ2, false, false);
            if (strEYQ != null) {
                throw new com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Td(strEYQ + ", rawKey: " + this.VwS + ", url: " + eyq2);
            }
            com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ EYQ3 = com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(EYQ2, this.mZx, this.QQ, this.HX.Td.EYQ);
            if (Kbd.Td) {
                Log.w("TAG_PROXY_ProxyTask", "get header from network");
            }
            return com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(EYQ3, mzx.mZx()).getBytes(com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ);
        } finally {
            com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(EYQ2.Pm());
        }
    }

    private void EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ eyq, File file, mZx mzx, tsL.EYQ eyq2) throws Throwable {
        final com.bytedance.sdk.component.VwS.VwS vwS;
        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx mzx2;
        if (!mzx.EYQ()) {
            byte[] bArrEYQ = EYQ(eyq, mzx, eyq2);
            Kbd();
            if (bArrEYQ == null) {
                return;
            } else {
                mzx.EYQ(bArrEYQ, 0, bArrEYQ.length);
            }
        }
        QQ qq = null;
        if (eyq == null && (eyq = this.mZx.EYQ(this.QQ, this.HX.Td.EYQ)) == null) {
            if (Kbd.Td) {
                Log.e("TAG_PROXY_ProxyTask", "failed to get video header info from db");
            }
            EYQ(null, mzx, eyq2);
            eyq = this.mZx.EYQ(this.QQ, this.HX.Td.EYQ);
            if (eyq == null) {
                throw new com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Td("failed to get header, rawKey: " + this.VwS + ", url: " + eyq2);
            }
        }
        if (file.length() >= eyq.Td || !((mzx2 = this.hu) == null || mzx2.mZx() || mzx2.Pm())) {
            vwS = null;
        } else {
            com.bykv.vk.openvk.component.video.EYQ.mZx.mZx mzxEYQ = new mZx.EYQ().EYQ(this.EYQ).EYQ(this.mZx).EYQ(this.VwS).mZx(this.QQ).EYQ(new tsL(eyq2.EYQ)).EYQ(this.IPb).EYQ(this.HX).EYQ(new mZx.InterfaceC0062mZx() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.VwS.1
                @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.InterfaceC0062mZx
                public void EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx mzx3) {
                    VwS.this.Td.addAndGet(mzx3.Td.get());
                    VwS.this.Pm.addAndGet(mzx3.Pm.get());
                    synchronized (mzx3.pi) {
                        mzx3.pi.notifyAll();
                    }
                    if (mzx3.Pm()) {
                        VwS.this.KO.EYQ(VwS.this.VwS(), null);
                    }
                }
            }).EYQ();
            this.hu = mzxEYQ;
            vwS = new com.bytedance.sdk.component.VwS.VwS(mzxEYQ, null, 10, 1);
            com.bytedance.sdk.component.VwS.IPb.mZx(new com.bytedance.sdk.component.VwS.QQ("processCacheNetWorkConcurrent") { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.VwS.2
                @Override // java.lang.Runnable
                public void run() {
                    vwS.run();
                }
            });
            if (Kbd.Td) {
                Log.e("TAG_PROXY_ProxyTask", "fire download in process cache task");
            }
        }
        byte[] bArr = new byte[8192];
        try {
            QQ qq2 = new QQ(file, "r");
            try {
                qq2.EYQ(mzx.mZx());
                int iMin = this.HX.Td.Kbd > 0 ? Math.min(eyq.Td, this.HX.Td.Kbd) : eyq.Td;
                while (mzx.mZx() < iMin) {
                    Kbd();
                    int iEYQ = qq2.EYQ(bArr);
                    if (iEYQ <= 0) {
                        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx mzx3 = this.hu;
                        if (mzx3 != null) {
                            com.bykv.vk.openvk.component.video.EYQ.mZx.Td.mZx mzxHX = mzx3.HX();
                            if (mzxHX != null) {
                                throw mzxHX;
                            }
                            QQ.EYQ eyqQQ = mzx3.QQ();
                            if (eyqQQ != null) {
                                throw eyqQQ;
                            }
                        }
                        if (mzx3 != null && !mzx3.mZx() && !mzx3.Pm()) {
                            Kbd();
                            synchronized (mzx3.pi) {
                                try {
                                    mzx3.pi.wait(1000L);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                        if (Kbd.Td) {
                            Log.e("TAG_PROXY_ProxyTask", "download task has finished!!!");
                        }
                        throw new com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Td("illegal state download task has finished, rawKey: " + this.VwS + ", url: " + eyq2);
                    }
                    mzx.mZx(bArr, 0, iEYQ);
                    Kbd();
                }
                if (Kbd.Td) {
                    Log.i("TAG_PROXY_ProxyTask", "read cache file complete: " + mzx.mZx() + ", " + iMin);
                }
                Td();
                qq2.EYQ();
                if (vwS != null) {
                    try {
                        vwS.get();
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                qq = qq2;
                if (qq != null) {
                    qq.EYQ();
                }
                if (vwS != null) {
                    try {
                        vwS.get();
                    } catch (Throwable unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void Pm(mZx mzx, tsL.EYQ eyq) throws Throwable {
        String strEYQ;
        QQ qq;
        HX();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iMZx = mzx.mZx();
        com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.EYQ EYQ2 = EYQ(eyq, iMZx, this.HX.Td.Kbd, "GET");
        if (EYQ2 == null) {
            return;
        }
        QQ qq2 = null;
        int i = 0;
        try {
            strEYQ = com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(EYQ2, false, true);
        } catch (Throwable th) {
            th = th;
        }
        if (strEYQ != null) {
            throw new com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Td(strEYQ + ", rawKey: " + this.VwS + ", url: " + eyq);
        }
        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ EYQ3 = this.mZx.EYQ(this.QQ, IPb());
        int iEYQ = com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(EYQ2);
        if (EYQ3 != null && EYQ3.Td != iEYQ) {
            if (Kbd.Td) {
                Log.e("TAG_PROXY_ProxyTask", "Content-Length not match, old: " + EYQ3.Td + ", " + iEYQ + ", key: " + this.QQ);
            }
            throw new com.bykv.vk.openvk.component.video.EYQ.mZx.Td.mZx("Content-Length not match, old length: " + EYQ3.Td + ", new length: " + iEYQ + ", rawKey: " + this.VwS + ", currentUrl: " + eyq + ", previousInfo: " + EYQ3.Kbd);
        }
        if (!mzx.EYQ()) {
            String strEYQ2 = com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(EYQ2, iMZx);
            Kbd();
            byte[] bytes = strEYQ2.getBytes(com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ);
            mzx.EYQ(bytes, 0, bytes.length);
        }
        Kbd();
        File filePm = this.EYQ.Pm(this.QQ);
        if (this.UB && filePm != null && filePm.length() >= mzx.mZx()) {
            com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(EYQ2, this.mZx, this.QQ, this.HX.Td.EYQ);
            try {
                qq = new QQ(filePm, "rwd");
                try {
                    qq.EYQ(mzx.mZx());
                } catch (Throwable th2) {
                    th = th2;
                    qq2 = qq;
                }
            } catch (QQ.EYQ unused) {
                qq = null;
            }
            if (Kbd.Td) {
                Log.i("TAG_PROXY_ProxyTask", "can write to cache file in network task, cache file size: " + filePm.length() + ", from: " + mzx.mZx());
            }
        } else {
            if (Kbd.Td) {
                Log.w("TAG_PROXY_ProxyTask", "can't write to cache file in network task, cache file size: " + filePm.length() + ", from: " + mzx.mZx());
            }
            qq = null;
        }
        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ EYQ4 = this.mZx.EYQ(this.QQ, IPb());
        int i2 = EYQ4 == null ? 0 : EYQ4.Td;
        byte[] bArr = new byte[8192];
        InputStream inputStreamPm = EYQ2.Pm();
        int i3 = 0;
        while (true) {
            try {
                int i4 = inputStreamPm.read(bArr);
                if (i4 < 0) {
                    break;
                }
                Kbd();
                if (i4 > 0) {
                    mzx.mZx(bArr, 0, i4);
                    i3 += i4;
                    if (qq != null) {
                        try {
                            qq.EYQ(bArr, 0, i4);
                        } catch (Throwable th3) {
                            qq.EYQ();
                            try {
                                if (Kbd.Td) {
                                    Log.e("TAG_PROXY_ProxyTask", "append to cache file error in network task!!! " + Log.getStackTraceString(th3));
                                }
                                qq = null;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                    EYQ(i2, mzx.mZx());
                }
                Kbd();
            } catch (Throwable th5) {
                th = th5;
                qq2 = qq;
            }
            th = th5;
            qq2 = qq;
            i = i3;
            com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(EYQ2.Pm());
            if (qq2 != null) {
                qq2.EYQ();
            }
            this.Td.addAndGet(i);
            this.Pm.addAndGet(SystemClock.elapsedRealtime() - jElapsedRealtime);
            throw th;
        }
        if (Kbd.Td) {
            Log.i("TAG_PROXY_ProxyTask", "read from net complete!");
        }
        Td();
        com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(EYQ2.Pm());
        if (qq != null) {
            qq.EYQ();
        }
        this.Td.addAndGet(i3);
        this.Pm.addAndGet(SystemClock.elapsedRealtime() - jElapsedRealtime);
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ
    public void EYQ() {
        super.EYQ();
        HX();
    }

    private void HX() {
        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx mzx = this.hu;
        this.hu = null;
        if (mzx != null) {
            mzx.EYQ();
        }
    }

    /* compiled from: ProxyTask.java */
    private static class mZx {
        private final OutputStream EYQ;
        private boolean Td;
        private int mZx;

        mZx(OutputStream outputStream, int i) {
            this.EYQ = outputStream;
            this.mZx = i;
        }

        boolean EYQ() {
            return this.Td;
        }

        void EYQ(byte[] bArr, int i, int i2) throws com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Pm, IOException {
            if (this.Td) {
                return;
            }
            try {
                this.EYQ.write(bArr, i, i2);
                this.Td = true;
            } catch (IOException e) {
                throw new com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Pm(e);
            }
        }

        void mZx(byte[] bArr, int i, int i2) throws com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Pm, IOException {
            try {
                this.EYQ.write(bArr, i, i2);
                this.mZx += i2;
            } catch (IOException e) {
                throw new com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Pm(e);
            }
        }

        int mZx() {
            return this.mZx;
        }
    }

    /* compiled from: ProxyTask.java */
    static final class EYQ {
        com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ EYQ;
        Td Pm;
        Socket Td;
        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td mZx;

        EYQ() {
        }

        EYQ EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td td) {
            if (td == null) {
                throw new IllegalArgumentException("db == null");
            }
            this.mZx = td;
            return this;
        }

        EYQ EYQ(Socket socket) {
            if (socket == null) {
                throw new IllegalArgumentException("socket == null");
            }
            this.Td = socket;
            return this;
        }

        EYQ EYQ(Td td) {
            this.Pm = td;
            return this;
        }

        VwS EYQ() {
            if (this.mZx == null || this.Td == null) {
                throw new IllegalArgumentException();
            }
            return new VwS(this);
        }
    }
}
