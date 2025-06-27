package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbos implements zzcby {
    final /* synthetic */ zzbpb zza;
    final /* synthetic */ zzfkw zzb;
    final /* synthetic */ zzbpc zzc;

    zzbos(zzbpc zzbpcVar, zzbpb zzbpbVar, zzfkw zzfkwVar) {
        this.zza = zzbpbVar;
        this.zzb = zzfkwVar;
        this.zzc = zzbpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbfm.zzd.zze()).booleanValue()) {
                zzbpc zzbpcVar = this.zzc;
                if (zzbpcVar.zze != null) {
                    zzflk zzflkVar = zzbpcVar.zze;
                    zzfkw zzfkwVar = this.zzb;
                    zzfkwVar.zzc("Failed loading new engine");
                    zzfkwVar.zzg(false);
                    zzflkVar.zzb(zzfkwVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
