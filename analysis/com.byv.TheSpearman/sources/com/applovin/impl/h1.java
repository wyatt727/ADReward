package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class h1 extends MediaCodec.Callback {
    private final HandlerThread b;
    private Handler c;
    private MediaFormat h;
    private MediaFormat i;
    private MediaCodec.CodecException j;
    private long k;
    private boolean l;
    private IllegalStateException m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f481a = new Object();
    private final kb d = new kb();
    private final kb e = new kb();
    private final ArrayDeque f = new ArrayDeque();
    private final ArrayDeque g = new ArrayDeque();

    h1(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public void h() {
        synchronized (this.f481a) {
            this.l = true;
            this.b.quit();
            b();
        }
    }

    public MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f481a) {
            mediaFormat = this.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f481a) {
            this.d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f481a) {
            MediaFormat mediaFormat = this.i;
            if (mediaFormat != null) {
                a(mediaFormat);
                this.i = null;
            }
            this.e.a(i);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f481a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f481a) {
            a(mediaFormat);
            this.i = null;
        }
    }

    private void b() {
        if (!this.g.isEmpty()) {
            this.i = (MediaFormat) this.g.getLast();
        }
        this.d.a();
        this.e.a();
        this.f.clear();
        this.g.clear();
        this.j = null;
    }

    private boolean d() {
        return this.k > 0 || this.l;
    }

    private void a(MediaFormat mediaFormat) {
        this.e.a(-2);
        this.g.add(mediaFormat);
    }

    private void e() {
        f();
        g();
    }

    private void f() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException == null) {
            return;
        }
        this.m = null;
        throw illegalStateException;
    }

    private void g() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    public int a() {
        synchronized (this.f481a) {
            int iD = -1;
            if (d()) {
                return -1;
            }
            e();
            if (!this.d.c()) {
                iD = this.d.d();
            }
            return iD;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Runnable runnable) {
        synchronized (this.f481a) {
            d(runnable);
        }
    }

    private void d(Runnable runnable) {
        if (this.l) {
            return;
        }
        long j = this.k - 1;
        this.k = j;
        if (j > 0) {
            return;
        }
        if (j < 0) {
            a(new IllegalStateException());
            return;
        }
        b();
        try {
            runnable.run();
        } catch (IllegalStateException e) {
            a(e);
        } catch (Exception e2) {
            a(new IllegalStateException(e2));
        }
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f481a) {
            if (d()) {
                return -1;
            }
            e();
            if (this.e.c()) {
                return -1;
            }
            int iD = this.e.d();
            if (iD >= 0) {
                a1.b(this.h);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iD == -2) {
                this.h = (MediaFormat) this.g.remove();
            }
            return iD;
        }
    }

    public void a(final Runnable runnable) {
        synchronized (this.f481a) {
            this.k++;
            ((Handler) yp.a(this.c)).post(new Runnable() { // from class: com.applovin.impl.h1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(runnable);
                }
            });
        }
    }

    public void a(MediaCodec mediaCodec) {
        a1.b(this.c == null);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.f481a) {
            this.m = illegalStateException;
        }
    }
}
