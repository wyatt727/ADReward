package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzue implements zztf {
    private final MediaCodec zza;

    /* synthetic */ zzue(MediaCodec mediaCodec, zzud zzudVar) {
        this.zza = mediaCodec;
        int i = zzfx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                int i = zzfx.zza;
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final ByteBuffer zzf(int i) {
        int i2 = zzfx.zza;
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final ByteBuffer zzg(int i) {
        int i2 = zzfx.zza;
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzi() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzj(int i, int i2, int i3, long j, int i4) throws MediaCodec.CryptoException {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzk(int i, int i2, zzie zzieVar, long j, int i3) throws MediaCodec.CryptoException {
        this.zza.queueSecureInputBuffer(i, 0, zzieVar.zza(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzl() {
        this.zza.release();
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzm(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzn(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }
}
