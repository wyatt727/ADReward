package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzuf implements zztg {
    private final MediaCodec zza;

    public zzuf(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzd(int i, int i2, int i3, long j, int i4) throws MediaCodec.CryptoException {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zze(int i, int i2, zzie zzieVar, long j, int i3) throws MediaCodec.CryptoException {
        this.zza.queueSecureInputBuffer(i, 0, zzieVar.zza(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzf(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzh() {
    }
}
