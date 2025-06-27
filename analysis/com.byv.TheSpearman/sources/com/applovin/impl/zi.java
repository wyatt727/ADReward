package com.applovin.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class zi implements vq, t2 {
    private int j;
    private SurfaceTexture k;
    private byte[] n;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f1247a = new AtomicBoolean();
    private final AtomicBoolean b = new AtomicBoolean(true);
    private final bi c = new bi();
    private final i9 d = new i9();
    private final fo f = new fo();
    private final fo g = new fo();
    private final float[] h = new float[16];
    private final float[] i = new float[16];
    private volatile int l = 0;
    private int m = -1;

    public SurfaceTexture b() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        z9.a();
        this.c.a();
        z9.a();
        this.j = z9.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.j);
        this.k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.applovin.impl.zi$$ExternalSyntheticLambda0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f$0.a(surfaceTexture2);
            }
        });
        return this.k;
    }

    public void a(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        z9.a();
        if (this.f1247a.compareAndSet(true, false)) {
            ((SurfaceTexture) a1.a(this.k)).updateTexImage();
            z9.a();
            if (this.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.h, 0);
            }
            long timestamp = this.k.getTimestamp();
            Long l = (Long) this.f.b(timestamp);
            if (l != null) {
                this.d.a(this.h, l.longValue());
            }
            zh zhVar = (zh) this.g.c(timestamp);
            if (zhVar != null) {
                this.c.b(zhVar);
            }
        }
        Matrix.multiplyMM(this.i, 0, fArr, 0, this.h, 0);
        this.c.a(this.j, this.i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.f1247a.set(true);
    }

    @Override // com.applovin.impl.t2
    public void a(long j, float[] fArr) {
        this.d.a(j, fArr);
    }

    @Override // com.applovin.impl.t2
    public void a() {
        this.f.a();
        this.d.a();
        this.b.set(true);
    }

    @Override // com.applovin.impl.vq
    public void a(long j, long j2, d9 d9Var, MediaFormat mediaFormat) {
        this.f.a(j2, Long.valueOf(j));
        a(d9Var.w, d9Var.x, j2);
    }

    public void a(int i) {
        this.l = i;
    }

    private void a(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.n;
        int i2 = this.m;
        this.n = bArr;
        if (i == -1) {
            i = this.l;
        }
        this.m = i;
        if (i2 == i && Arrays.equals(bArr2, this.n)) {
            return;
        }
        byte[] bArr3 = this.n;
        zh zhVarA = bArr3 != null ? ai.a(bArr3, this.m) : null;
        if (zhVarA == null || !bi.a(zhVarA)) {
            zhVarA = zh.a(this.m);
        }
        this.g.a(j, zhVarA);
    }
}
