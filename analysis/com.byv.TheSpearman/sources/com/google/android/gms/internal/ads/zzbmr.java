package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbmr implements zzgdl {
    final /* synthetic */ zzbmj zza;

    zzbmr(zzbmv zzbmvVar, zzbmj zzbmjVar) {
        this.zza = zzbmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzcbw zzcbwVar = new zzcbw();
        ((zzbmp) obj).zze(this.zza, new zzbmq(this, zzcbwVar));
        return zzcbwVar;
    }
}
