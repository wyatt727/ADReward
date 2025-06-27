package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzsy implements zztg {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzeo zzg;
    private boolean zzh;

    public zzsy(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzeo zzeoVar = new zzeo(zzel.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzeoVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzsy r9, android.os.Message r10) throws android.media.MediaCodec.CryptoException {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L59
            r2 = 1
            if (r0 == r2) goto L36
            r2 = 2
            if (r0 == r2) goto L30
            r2 = 3
            if (r0 == r2) goto L1f
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.zzsv.zza(r9, r1, r0)
            goto L75
        L1f:
            java.lang.Object r10 = r10.obj
            android.os.Bundle r10 = (android.os.Bundle) r10
            android.media.MediaCodec r0 = r9.zzc     // Catch: java.lang.RuntimeException -> L29
            r0.setParameters(r10)     // Catch: java.lang.RuntimeException -> L29
            goto L75
        L29:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzsv.zza(r9, r1, r10)
            goto L75
        L30:
            com.google.android.gms.internal.ads.zzeo r9 = r9.zzg
            r9.zze()
            goto L75
        L36:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzsx r10 = (com.google.android.gms.internal.ads.zzsx) r10
            int r3 = r10.zza
            int r0 = r10.zzb
            android.media.MediaCodec$CryptoInfo r5 = r10.zzd
            long r6 = r10.zze
            int r8 = r10.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzsy.zzb     // Catch: java.lang.RuntimeException -> L52
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L52
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.Throwable -> L4f
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            goto L74
        L4f:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r2     // Catch: java.lang.RuntimeException -> L52
        L52:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzsv.zza(r9, r1, r0)
            goto L74
        L59:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzsx r10 = (com.google.android.gms.internal.ads.zzsx) r10
            int r3 = r10.zza
            int r0 = r10.zzb
            int r5 = r10.zzc
            long r6 = r10.zze
            int r8 = r10.zzf
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.RuntimeException -> L6e
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L6e
            goto L74
        L6e:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzsv.zza(r9, r1, r0)
        L74:
            r1 = r10
        L75:
            if (r1 == 0) goto L82
            java.util.ArrayDeque r9 = com.google.android.gms.internal.ads.zzsy.zza
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7f
            return
        L7f:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7f
            throw r10
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsy.zza(com.google.android.gms.internal.ads.zzsy, android.os.Message):void");
    }

    private static zzsx zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzsx();
            }
            return (zzsx) arrayDeque.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzd(int i, int i2, int i3, long j, int i4) {
        zzc();
        zzsx zzsxVarZzi = zzi();
        zzsxVarZzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzfx.zza;
        handler.obtainMessage(0, zzsxVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zze(int i, int i2, zzie zzieVar, long j, int i3) {
        zzc();
        zzsx zzsxVarZzi = zzi();
        zzsxVarZzi.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzsxVarZzi.zzd;
        cryptoInfo.numSubSamples = zzieVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzieVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzieVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzj = zzj(zzieVar.zzb, cryptoInfo.key);
        Objects.requireNonNull(bArrZzj);
        cryptoInfo.key = bArrZzj;
        byte[] bArrZzj2 = zzj(zzieVar.zza, cryptoInfo.iv);
        Objects.requireNonNull(bArrZzj2);
        cryptoInfo.iv = bArrZzj2;
        cryptoInfo.mode = zzieVar.zzc;
        if (zzfx.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzieVar.zzg, zzieVar.zzh));
        }
        this.zze.obtainMessage(1, zzsxVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        int i = zzfx.zza;
        handler.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzh() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzsw(this, this.zzd.getLooper());
        this.zzh = true;
    }

    private static byte[] zzj(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzk(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }
}
