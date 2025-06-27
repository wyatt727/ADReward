package com.applovin.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class g1 {
    private static final ArrayDeque h = new ArrayDeque();
    private static final Object i = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f443a;
    private final HandlerThread b;
    private Handler c;
    private final AtomicReference d;
    private final a4 e;
    private final boolean f;
    private boolean g;

    private static b d() {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return (b) arrayDeque.removeFirst();
        }
    }

    private static boolean f() {
        String lowerCase = Ascii.toLowerCase(yp.c);
        return lowerCase.contains("samsung") || lowerCase.contains("motorola");
    }

    public g1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new a4());
    }

    public void h() {
        if (this.g) {
            return;
        }
        this.b.start();
        this.c = new a(this.b.getLooper());
        this.g = true;
    }

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws MediaCodec.CryptoException {
            g1.this.a(message);
        }
    }

    public void b() {
        if (this.g) {
            try {
                c();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    g1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z, a4 a4Var) {
        this.f443a = mediaCodec;
        this.b = handlerThread;
        this.e = a4Var;
        this.d = new AtomicReference();
        this.f = z || f();
    }

    public void g() {
        if (this.g) {
            b();
            this.b.quit();
        }
        this.g = false;
    }

    public void i() {
        a();
    }

    private void e() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    private void c() {
        ((Handler) yp.a(this.c)).removeCallbacksAndMessages(null);
        a();
        e();
    }

    private void a() {
        this.e.c();
        ((Handler) yp.a(this.c)).obtainMessage(2).sendToTarget();
        this.e.a();
    }

    public void b(int i2, int i3, int i4, long j, int i5) {
        e();
        b bVarD = d();
        bVarD.a(i2, i3, i4, j, i5);
        ((Handler) yp.a(this.c)).obtainMessage(0, bVarD).sendToTarget();
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f445a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        b() {
        }

        public void a(int i, int i2, int i3, long j, int i4) {
            this.f445a = i;
            this.b = i2;
            this.c = i3;
            this.e = j;
            this.f = i4;
        }
    }

    private static void a(y4 y4Var, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = y4Var.f;
        cryptoInfo.numBytesOfClearData = a(y4Var.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(y4Var.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) a1.a(a(y4Var.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) a1.a(a(y4Var.f1190a, cryptoInfo.iv));
        cryptoInfo.mode = y4Var.c;
        if (yp.f1214a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(y4Var.g, y4Var.h));
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) throws MediaCodec.CryptoException {
        b bVar;
        int i2 = message.what;
        if (i2 == 0) {
            bVar = (b) message.obj;
            a(bVar.f445a, bVar.b, bVar.c, bVar.e, bVar.f);
        } else if (i2 != 1) {
            if (i2 != 2) {
                a(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.e.e();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            a(bVar.f445a, bVar.b, bVar.d, bVar.e, bVar.f);
        }
        if (bVar != null) {
            a(bVar);
        }
    }

    private void a(int i2, int i3, int i4, long j, int i5) throws MediaCodec.CryptoException {
        try {
            this.f443a.queueInputBuffer(i2, i3, i4, j, i5);
        } catch (RuntimeException e) {
            a(e);
        }
    }

    private void a(int i2, int i3, MediaCodec.CryptoInfo cryptoInfo, long j, int i4) throws MediaCodec.CryptoException {
        try {
            if (this.f) {
                synchronized (i) {
                    this.f443a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                }
                return;
            }
            this.f443a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
        } catch (RuntimeException e) {
            a(e);
        }
    }

    public void a(int i2, int i3, y4 y4Var, long j, int i4) {
        e();
        b bVarD = d();
        bVarD.a(i2, i3, 0, j, i4);
        a(y4Var, bVarD.d);
        ((Handler) yp.a(this.c)).obtainMessage(1, bVarD).sendToTarget();
    }

    void a(RuntimeException runtimeException) {
        this.d.set(runtimeException);
    }

    private static void a(b bVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }
}
