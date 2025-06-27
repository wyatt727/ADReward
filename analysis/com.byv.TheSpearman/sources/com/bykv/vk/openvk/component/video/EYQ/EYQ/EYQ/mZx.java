package com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.component.mZx.EYQ.KO;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import com.bytedance.sdk.component.mZx.EYQ.hu;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* compiled from: MediaDownloadPlayCacheImpl.java */
/* loaded from: classes.dex */
public class mZx implements Td {
    private RandomAccessFile HX;
    private long Kbd;
    private File Pm;
    private File Td;
    private final com.bykv.vk.openvk.component.video.api.Td.Td tp;
    private volatile long EYQ = -2147483648L;
    private final Object mZx = new Object();
    private volatile long IPb = -1;
    private volatile boolean VwS = false;
    private volatile boolean QQ = false;

    public mZx(Context context, com.bykv.vk.openvk.component.video.api.Td.Td td) {
        this.Kbd = 0L;
        this.HX = null;
        this.tp = td;
        try {
            this.Td = com.bykv.vk.openvk.component.video.EYQ.Kbd.mZx.mZx(td.mZx(), td.nWX());
            this.Pm = com.bykv.vk.openvk.component.video.EYQ.Kbd.mZx.Td(td.mZx(), td.nWX());
            if (Pm()) {
                this.HX = new RandomAccessFile(this.Pm, "r");
            } else {
                this.HX = new RandomAccessFile(this.Td, "rw");
            }
            if (Pm()) {
                return;
            }
            this.Kbd = this.Td.length();
            EYQ();
        } catch (Throwable unused) {
            td.pi();
        }
    }

    private boolean Pm() {
        return this.Pm.exists();
    }

    public void EYQ() {
        MxO.EYQ eyq;
        if (com.bykv.vk.openvk.component.video.api.Td.Pm() != null) {
            eyq = com.bykv.vk.openvk.component.video.api.Td.Pm().mZx();
        } else {
            eyq = new MxO.EYQ("v_cache");
        }
        eyq.EYQ(this.tp.hu(), TimeUnit.MILLISECONDS).mZx(this.tp.UB(), TimeUnit.MILLISECONDS).Td(this.tp.Uc(), TimeUnit.MILLISECONDS);
        MxO mxOEYQ = eyq.EYQ();
        Long.valueOf(this.Kbd);
        this.tp.nWX();
        mxOEYQ.EYQ(new pi.EYQ().EYQ("RANGE", "bytes=" + this.Kbd + "-").EYQ(this.tp.pi()).EYQ().mZx()).EYQ(new com.bytedance.sdk.component.mZx.EYQ.Td() { // from class: com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ.mZx.1
            @Override // com.bytedance.sdk.component.mZx.EYQ.Td
            public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx mzx, IOException iOException) {
                mZx.this.QQ = false;
                mZx.this.EYQ = -1L;
            }

            @Override // com.bytedance.sdk.component.mZx.EYQ.Td
            public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx mzx, KO ko) throws IOException {
                hu huVarIPb;
                InputStream inputStream;
                boolean z;
                boolean z2;
                long length;
                long j;
                if (ko == null) {
                    mZx.this.QQ = false;
                    mZx mzx2 = mZx.this;
                    mzx2.EYQ = mzx2.IPb;
                    return;
                }
                InputStream inputStreamTd = null;
                try {
                    mZx.this.QQ = ko.Pm();
                    if (mZx.this.QQ) {
                        huVarIPb = ko.IPb();
                        try {
                            if (mZx.this.QQ && huVarIPb != null) {
                                mZx.this.EYQ = huVarIPb.EYQ() + mZx.this.Kbd;
                                inputStreamTd = huVarIPb.Td();
                            }
                            inputStream = inputStreamTd;
                            if (inputStream == null) {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable unused) {
                                        return;
                                    }
                                }
                                if (z2) {
                                    if (length == j) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            }
                            try {
                                byte[] bArr = new byte[8192];
                                long j2 = mZx.this.Kbd;
                                int i = 0;
                                long j3 = 0;
                                while (true) {
                                    int i2 = inputStream.read(bArr, i, 8192 - i);
                                    z = true;
                                    if (i2 == -1) {
                                        break;
                                    }
                                    i += i2;
                                    j3 += i2;
                                    if (j3 % PlaybackStateCompat.ACTION_PLAY_FROM_URI != 0 && j3 != mZx.this.EYQ - mZx.this.Kbd) {
                                        z = false;
                                    }
                                    Boolean.valueOf(z);
                                    Integer.valueOf(i);
                                    Long.valueOf(mZx.this.EYQ);
                                    Long.valueOf(j3);
                                    Long.valueOf(mZx.this.Kbd);
                                    mZx.this.tp.nWX();
                                    mZx.this.tp.pi();
                                    if (z) {
                                        synchronized (mZx.this.mZx) {
                                            com.bykv.vk.openvk.component.video.EYQ.Kbd.mZx.EYQ(mZx.this.HX, bArr, Long.valueOf(j2).intValue(), i, mZx.this.tp.nWX());
                                        }
                                        j2 += i;
                                        i = 0;
                                    }
                                }
                                Long.valueOf(mZx.this.Kbd);
                                Long.valueOf(mZx.this.EYQ);
                                Long.valueOf(j3);
                                if (j3 != mZx.this.EYQ - mZx.this.Kbd) {
                                    z = false;
                                }
                                Boolean.valueOf(z);
                                mZx.this.tp.pi();
                                inputStreamTd = inputStream;
                            } catch (Throwable unused2) {
                                try {
                                    mZx.this.QQ = false;
                                    mZx mzx3 = mZx.this;
                                    mzx3.EYQ = mzx3.IPb;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused3) {
                                            return;
                                        }
                                    }
                                    if (huVarIPb != null) {
                                        huVarIPb.close();
                                    }
                                    if (ko != null) {
                                        ko.close();
                                    }
                                    if (mZx.this.QQ && mZx.this.Td.length() == mZx.this.EYQ) {
                                        mZx.this.IPb();
                                        return;
                                    }
                                    return;
                                } finally {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    if (huVarIPb != null) {
                                        huVarIPb.close();
                                    }
                                    if (ko != null) {
                                        ko.close();
                                    }
                                    if (mZx.this.QQ && mZx.this.Td.length() == mZx.this.EYQ) {
                                        mZx.this.IPb();
                                    }
                                }
                            }
                        } catch (Throwable unused5) {
                            inputStream = null;
                        }
                    } else {
                        mZx.this.QQ = false;
                        mZx mzx4 = mZx.this;
                        mzx4.EYQ = mzx4.IPb;
                        huVarIPb = null;
                    }
                    if (inputStreamTd != null) {
                        try {
                            inputStreamTd.close();
                        } catch (Throwable unused6) {
                            return;
                        }
                    }
                    if (huVarIPb != null) {
                        huVarIPb.close();
                    }
                    if (ko != null) {
                        ko.close();
                    }
                    if (mZx.this.QQ && mZx.this.Td.length() == mZx.this.EYQ) {
                        mZx.this.IPb();
                    }
                } catch (Throwable unused7) {
                    huVarIPb = null;
                    inputStream = null;
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ.Td
    public int EYQ(long j, byte[] bArr, int i, int i2) throws IOException {
        try {
            if (j == this.EYQ) {
                return -1;
            }
            int i3 = 0;
            int i4 = 0;
            while (!this.VwS) {
                synchronized (this.mZx) {
                    long jKbd = Kbd();
                    if (j < jKbd) {
                        this.HX.seek(j);
                        i4 = this.HX.read(bArr, i, i2);
                    } else {
                        Long.valueOf(j);
                        Long.valueOf(jKbd);
                        i3 += 33;
                        this.mZx.wait(33L);
                    }
                }
                if (i4 > 0) {
                    return i4;
                }
                if (i3 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ.Td
    public void mZx() {
        try {
            if (!this.VwS) {
                this.HX.close();
            }
            File file = this.Td;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.Pm;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.VwS = true;
    }

    private long Kbd() {
        if (Pm()) {
            return this.Pm.length();
        }
        return this.Td.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IPb() throws IOException {
        synchronized (this.mZx) {
            if (Pm()) {
                this.tp.pi();
                this.tp.nWX();
                return;
            }
            try {
            } finally {
            }
            if (!this.Td.renameTo(this.Pm)) {
                throw new IOException("Error renaming file " + this.Td + " to " + this.Pm + " for completion!");
            }
            RandomAccessFile randomAccessFile = this.HX;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.HX = new RandomAccessFile(this.Pm, "rw");
            this.tp.nWX();
            this.tp.pi();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ.Td
    public long Td() throws IOException {
        if (Pm()) {
            this.EYQ = this.Pm.length();
        } else {
            synchronized (this.mZx) {
                int i = 0;
                while (this.EYQ == -2147483648L) {
                    i += 15;
                    try {
                        this.mZx.wait(5L);
                        if (i > 20000) {
                            return -1L;
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("total length InterruptException");
                    }
                }
            }
        }
        Long.valueOf(this.EYQ);
        return this.EYQ;
    }
}
