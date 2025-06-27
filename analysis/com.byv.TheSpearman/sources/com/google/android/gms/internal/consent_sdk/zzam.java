package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.2.0 */
/* loaded from: classes3.dex */
final class zzam implements zzaw {
    private final zzag zza;
    private final zzam zzb = this;
    private final zzdq zzc;
    private final zzdq zzd;
    private final zzdq zze;
    private final zzdq zzf;
    private final zzdq zzg;

    /* synthetic */ zzam(zzag zzagVar, zzbp zzbpVar, zzal zzalVar) {
        this.zza = zzagVar;
        zzdq zzdqVarZzb = zzdm.zzb(new zzbx(zzagVar.zzb));
        this.zzc = zzdqVarZzb;
        zzdn zzdnVarZzb = zzdo.zzb(zzbpVar);
        this.zzd = zzdnVarZzb;
        zzdl zzdlVar = new zzdl();
        this.zze = zzdlVar;
        zzcb zzcbVar = new zzcb(zzagVar.zzb, zzdqVarZzb, zzar.zza, zzat.zza, zzagVar.zzh, zzagVar.zzi, zzdlVar, zzagVar.zzc);
        this.zzf = zzcbVar;
        zzbv zzbvVar = new zzbv(zzdqVarZzb, zzar.zza, zzcbVar);
        this.zzg = zzbvVar;
        zzdl.zzb(zzdlVar, zzdm.zzb(new zzbc(zzagVar.zzb, zzagVar.zzd, zzdqVarZzb, zzagVar.zzc, zzdnVarZzb, zzbvVar)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzaw
    public final zzbb zza() {
        return (zzbb) this.zze.zza();
    }
}
