package com.bykv.vk.openvk.component.video.EYQ.mZx;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.EYQ.mZx.HX;
import com.bykv.vk.openvk.component.video.EYQ.mZx.QQ;
import com.bykv.vk.openvk.component.video.EYQ.mZx.tsL;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

/* compiled from: DownloadTask.java */
/* loaded from: classes.dex */
class mZx extends com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ {
    private final int KO;
    private volatile QQ.EYQ UB;
    private volatile com.bykv.vk.openvk.component.video.EYQ.mZx.Td.mZx Uc;
    private final InterfaceC0062mZx hu;
    final Object nWX;
    final Object pi;

    /* compiled from: DownloadTask.java */
    /* renamed from: com.bykv.vk.openvk.component.video.EYQ.mZx.mZx$mZx, reason: collision with other inner class name */
    public interface InterfaceC0062mZx {
        void EYQ(mZx mzx);
    }

    mZx(EYQ eyq) {
        super(eyq.Pm, eyq.Kbd);
        this.KO = eyq.VwS;
        this.hu = eyq.HX;
        this.pi = this;
        this.VwS = eyq.EYQ;
        this.QQ = eyq.mZx;
        this.IPb = eyq.IPb;
        this.tp = eyq.Td;
        this.HX = eyq.QQ;
        this.nWX = eyq.tp;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.EYQ.EYQ(this.QQ);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            tp();
        } catch (Throwable unused) {
        }
        this.Pm.set(SystemClock.elapsedRealtime() - jElapsedRealtime);
        this.EYQ.mZx(this.QQ);
        InterfaceC0062mZx interfaceC0062mZx = this.hu;
        if (interfaceC0062mZx != null) {
            interfaceC0062mZx.EYQ(this);
        }
    }

    QQ.EYQ QQ() {
        return this.UB;
    }

    com.bykv.vk.openvk.component.video.EYQ.mZx.Td.mZx HX() {
        return this.Uc;
    }

    private boolean tp() throws com.bykv.vk.openvk.component.video.EYQ.mZx.Td.EYQ {
        while (this.tp.EYQ()) {
            Kbd();
            tsL.EYQ eyqMZx = this.tp.mZx();
            try {
                EYQ(eyqMZx);
                return true;
            } catch (QQ.EYQ e) {
                this.UB = e;
                Boolean.valueOf(VwS());
                String str = this.VwS;
                return false;
            } catch (com.bykv.vk.openvk.component.video.EYQ.mZx.Td.Td unused) {
                eyqMZx.EYQ();
                Boolean.valueOf(VwS());
                String str2 = this.VwS;
            } catch (com.bykv.vk.openvk.component.video.EYQ.mZx.Td.mZx e2) {
                this.Uc = e2;
                return false;
            } catch (IOException e3) {
                if (e3 instanceof SocketTimeoutException) {
                    eyqMZx.mZx();
                }
                if (!mZx()) {
                    Boolean.valueOf(VwS());
                    String str3 = this.VwS;
                }
            } catch (Throwable unused2) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b2, code lost:
    
        Td();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b7, code lost:
    
        if (com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd.Td == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b9, code lost:
    
        android.util.Log.i("TAG_PROXY_DownloadTask", "download succeed, no need to cancel call");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c0, code lost:
    
        com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(r6.Pm());
        r4.EYQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ca, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.tsL.EYQ r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.tsL$EYQ):void");
    }

    /* compiled from: DownloadTask.java */
    static final class EYQ {
        String EYQ;
        InterfaceC0062mZx HX;
        List<HX.mZx> IPb;
        com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td Kbd;
        com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ Pm;
        HX QQ;
        tsL Td;
        int VwS;
        String mZx;
        Object tp;

        EYQ() {
        }

        EYQ EYQ(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("rawKey == null");
            }
            this.EYQ = str;
            return this;
        }

        EYQ mZx(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("key == null");
            }
            this.mZx = str;
            return this;
        }

        EYQ EYQ(tsL tsl) {
            if (tsl == null) {
                throw new IllegalArgumentException("urls is empty");
            }
            this.Td = tsl;
            return this;
        }

        EYQ EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.EYQ eyq) {
            if (eyq == null) {
                throw new IllegalArgumentException("cache == null");
            }
            this.Pm = eyq;
            return this;
        }

        EYQ EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td td) {
            if (td == null) {
                throw new IllegalArgumentException("db == null");
            }
            this.Kbd = td;
            return this;
        }

        EYQ EYQ(List<HX.mZx> list) {
            this.IPb = list;
            return this;
        }

        EYQ EYQ(int i) {
            this.VwS = i;
            return this;
        }

        EYQ EYQ(InterfaceC0062mZx interfaceC0062mZx) {
            this.HX = interfaceC0062mZx;
            return this;
        }

        EYQ EYQ(HX hx) {
            this.QQ = hx;
            return this;
        }

        EYQ EYQ(Object obj) {
            this.tp = obj;
            return this;
        }

        mZx EYQ() {
            if (this.Pm == null || this.Kbd == null || TextUtils.isEmpty(this.EYQ) || TextUtils.isEmpty(this.mZx) || this.Td == null) {
                throw new IllegalArgumentException();
            }
            return new mZx(this);
        }
    }
}
