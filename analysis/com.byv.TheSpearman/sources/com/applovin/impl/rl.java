package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.impl.cd;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class rl implements cd {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f865a;
    private final Surface b;
    private ByteBuffer[] c;
    private ByteBuffer[] d;

    @Override // com.applovin.impl.cd
    public boolean c() {
        return false;
    }

    public static class c implements cd.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.impl.rl$a] */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // com.applovin.impl.cd.b
        public cd a(cd.a aVar) throws Throwable {
            MediaCodec mediaCodecB;
            Surface surfaceA;
            ?? r0 = 0;
            r0 = 0;
            r0 = 0;
            try {
                mediaCodecB = b(aVar);
                try {
                    lo.a("configureCodec");
                    mediaCodecB.configure(aVar.b, aVar.d, aVar.e, aVar.f);
                    lo.a();
                    if (!aVar.g) {
                        surfaceA = null;
                    } else if (yp.f1214a >= 18) {
                        surfaceA = b.a(mediaCodecB);
                    } else {
                        throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                    }
                } catch (IOException e) {
                    e = e;
                } catch (RuntimeException e2) {
                    e = e2;
                }
                try {
                    lo.a("startCodec");
                    mediaCodecB.start();
                    lo.a();
                    return new rl(mediaCodecB, surfaceA);
                } catch (IOException | RuntimeException e3) {
                    r0 = surfaceA;
                    e = e3;
                    if (r0 != 0) {
                        r0.release();
                    }
                    if (mediaCodecB != null) {
                        mediaCodecB.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e4) {
                e = e4;
                mediaCodecB = null;
            }
        }

        protected MediaCodec b(cd.a aVar) throws IOException {
            a1.a(aVar.f328a);
            String str = aVar.f328a.f425a;
            lo.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            lo.a();
            return mediaCodecCreateByCodecName;
        }
    }

    private rl(MediaCodec mediaCodec, Surface surface) {
        this.f865a = mediaCodec;
        this.b = surface;
        if (yp.f1214a < 21) {
            this.c = mediaCodec.getInputBuffers();
            this.d = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.applovin.impl.cd
    public int d() {
        return this.f865a.dequeueInputBuffer(0L);
    }

    @Override // com.applovin.impl.cd
    public int a(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f865a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && yp.f1214a < 21) {
                this.d = this.f865a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.applovin.impl.cd
    public MediaFormat e() {
        return this.f865a.getOutputFormat();
    }

    @Override // com.applovin.impl.cd
    public void b() {
        this.f865a.flush();
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer b(int i) {
        if (yp.f1214a >= 21) {
            return this.f865a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) yp.a((Object) this.d))[i];
    }

    @Override // com.applovin.impl.cd
    public void c(int i) {
        this.f865a.setVideoScalingMode(i);
    }

    private static final class b {
        public static Surface a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(cd.c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.a(this, j, j2);
    }

    @Override // com.applovin.impl.cd
    public void a(int i, int i2, int i3, long j, int i4) throws MediaCodec.CryptoException {
        this.f865a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // com.applovin.impl.cd
    public void a(int i, int i2, y4 y4Var, long j, int i3) throws MediaCodec.CryptoException {
        this.f865a.queueSecureInputBuffer(i, i2, y4Var.a(), j, i3);
    }

    @Override // com.applovin.impl.cd
    public void a() {
        this.c = null;
        this.d = null;
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
        }
        this.f865a.release();
    }

    @Override // com.applovin.impl.cd
    public void a(int i, long j) {
        this.f865a.releaseOutputBuffer(i, j);
    }

    @Override // com.applovin.impl.cd
    public void a(int i, boolean z) {
        this.f865a.releaseOutputBuffer(i, z);
    }

    @Override // com.applovin.impl.cd
    public void a(final cd.c cVar, Handler handler) {
        this.f865a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.applovin.impl.rl$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f$0.a(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.applovin.impl.cd
    public void a(Surface surface) {
        this.f865a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.cd
    public void a(Bundle bundle) {
        this.f865a.setParameters(bundle);
    }

    @Override // com.applovin.impl.cd
    public ByteBuffer a(int i) {
        if (yp.f1214a >= 21) {
            return this.f865a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) yp.a((Object) this.c))[i];
    }
}
