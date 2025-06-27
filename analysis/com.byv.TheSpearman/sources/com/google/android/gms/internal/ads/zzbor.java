package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbor implements zzcca {
    final /* synthetic */ zzbpb zza;
    final /* synthetic */ zzfkw zzb;
    final /* synthetic */ zzbpc zzc;

    zzbor(zzbpc zzbpcVar, zzbpb zzbpbVar, zzfkw zzfkwVar) {
        this.zza = zzbpbVar;
        this.zzb = zzfkwVar;
        this.zzc = zzbpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            this.zzc.zzi = 0;
            zzbpc zzbpcVar = this.zzc;
            if (zzbpcVar.zzh != null && this.zza != zzbpcVar.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbfm.zzd.zze()).booleanValue()) {
                zzbpc zzbpcVar2 = this.zzc;
                if (zzbpcVar2.zze != null) {
                    zzflk zzflkVar = zzbpcVar2.zze;
                    zzfkw zzfkwVar = this.zzb;
                    zzfkwVar.zzg(true);
                    zzflkVar.zzb(zzfkwVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
