package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.impl.cd;
import com.applovin.impl.f1;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
final class f1 implements cd {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f408a;
    private final h1 b;
    private final g1 c;
    private final boolean d;
    private boolean e;
    private int f;
    private Surface g;

    @Override // com.applovin.impl.cd
    public boolean c() {
        return false;
    }

    public static final class b implements cd.b {
        private final Supplier b;
        private final Supplier c;
        private final boolean d;
        private final boolean e;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread a(int i) {
            return new HandlerThread(f1.f(i));
        }

        public b(final int i, boolean z, boolean z2) {
            this(new Supplier() { // from class: com.applovin.impl.f1$b$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    return f1.b.a(i);
                }
            }, new Supplier() { // from class: com.applovin.impl.f1$b$$ExternalSyntheticLambda1
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    return f1.b.b(i);
                }
            }, z, z2);
        }

        @Override // com.applovin.impl.cd.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f1 a(cd.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            f1 f1Var;
            String str = aVar.f328a.f425a;
            f1 f1Var2 = null;
            try {
                lo.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    f1Var = new f1(mediaCodecCreateByCodecName, (HandlerThread) this.b.get(), (HandlerThread) this.c.get(), this.d, this.e);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    lo.a();
                    f1Var.a(aVar.b, aVar.d, aVar.e, aVar.f, aVar.g);
                    return f1Var;
                } catch (Exception e2) {
                    e = e2;
                    f1Var2 = f1Var;
                    if (f1Var2 != null) {
                        f1Var2.a();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread b(int i) {
            return new HandlerThread(f1.g(i));
        }

        b(Supplier supplier, Supplier supplier2, boolean z, boolean z2) {
            this.b = supplier;
            this.c = supplier2;
            this.d = z;
            this.e = z2;
        }
    }

    private f1(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f408a = mediaCodec;
        this.b = new h1(handlerThread);
        this.c = new g1(mediaCodec, handlerThread2, z);
        this.d = z2;
        this.f = 0;
    }

    @Override // com.applovin.impl.cd
    public void b() {
        this.c.b();
        this.f408a.flush();
        h1 h1Var = this.b;
        final MediaCodec mediaCodec = this.f408a;
        Objects.requireNonNull(mediaCodec);
        h1Var.a(new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // com.applovin.impl.cd
    public int d() {
        return this.b.a();
    }

    @Override // com.applovin.impl.cd
    public MediaFormat e() {
        return this.b.c();
    }

    @Override // com.applovin.impl.cd
    public void c(int i) {
        f();
        this.f408a.setVideoScalingMode(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(int i) {
        return a(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(int i) {
        return a(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String a(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer b(int i) {
        return this.f408a.getOutputBuffer(i);
    }

    @Override // com.applovin.impl.cd
    public int a(MediaCodec.BufferInfo bufferInfo) {
        return this.b.a(bufferInfo);
    }

    private void f() {
        if (this.d) {
            try {
                this.c.i();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer a(int i) {
        return this.f408a.getInputBuffer(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        this.b.a(this.f408a);
        lo.a("configureCodec");
        this.f408a.configure(mediaFormat, surface, mediaCrypto, i);
        lo.a();
        if (z) {
            this.g = this.f408a.createInputSurface();
        }
        this.c.h();
        lo.a("startCodec");
        this.f408a.start();
        lo.a();
        this.f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(cd.c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.a(this, j, j2);
    }

    @Override // com.applovin.impl.cd
    public void a(int i, int i2, int i3, long j, int i4) {
        this.c.b(i, i2, i3, j, i4);
    }

    @Override // com.applovin.impl.cd
    public void a(int i, int i2, y4 y4Var, long j, int i3) {
        this.c.a(i, i2, y4Var, j, i3);
    }

    @Override // com.applovin.impl.cd
    public void a() {
        try {
            if (this.f == 1) {
                this.c.g();
                this.b.h();
            }
            this.f = 2;
        } finally {
            Surface surface = this.g;
            if (surface != null) {
                surface.release();
            }
            if (!this.e) {
                this.f408a.release();
                this.e = true;
            }
        }
    }

    @Override // com.applovin.impl.cd
    public void a(int i, long j) {
        this.f408a.releaseOutputBuffer(i, j);
    }

    @Override // com.applovin.impl.cd
    public void a(int i, boolean z) {
        this.f408a.releaseOutputBuffer(i, z);
    }

    @Override // com.applovin.impl.cd
    public void a(final cd.c cVar, Handler handler) {
        f();
        this.f408a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f$0.a(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.applovin.impl.cd
    public void a(Surface surface) {
        f();
        this.f408a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.cd
    public void a(Bundle bundle) {
        f();
        this.f408a.setParameters(bundle);
    }
}
