package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbps implements zzcby {
    final /* synthetic */ zzcbw zza;
    final /* synthetic */ zzbow zzb;

    zzbps(zzbpu zzbpuVar, zzcbw zzcbwVar, zzbow zzbowVar) {
        this.zza = zzcbwVar;
        this.zzb = zzbowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbpf("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
