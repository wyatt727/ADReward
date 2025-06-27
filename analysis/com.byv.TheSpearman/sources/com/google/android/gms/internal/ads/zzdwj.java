package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdwj extends zzbmz {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfkw zzd;
    final /* synthetic */ zzcbw zze;
    final /* synthetic */ zzdwk zzf;

    zzdwj(zzdwk zzdwkVar, Object obj, String str, long j, zzfkw zzfkwVar, zzcbw zzcbwVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfkwVar;
        this.zze = zzcbwVar;
        this.zzf = zzdwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzflk zzflkVar = this.zzf.zzp;
            zzfkw zzfkwVar = this.zzd;
            zzfkwVar.zzc(str);
            zzfkwVar.zzg(false);
            zzflkVar.zzb(zzfkwVar.zzm());
            this.zze.zzc(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzflk zzflkVar = this.zzf.zzp;
            zzfkw zzfkwVar = this.zzd;
            zzfkwVar.zzg(true);
            zzflkVar.zzb(zzfkwVar.zzm());
            this.zze.zzc(true);
        }
    }
}
