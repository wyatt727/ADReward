package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdri {
    private final zzcgz zza;
    private final Context zzb;
    private final zzawo zzc;
    private final zzbfc zzd;
    private final VersionInfoParcel zze;
    private final com.google.android.gms.ads.internal.zza zzf;
    private final zzbcx zzg;
    private final zzdbf zzh;
    private final zzefo zzi;
    private final zzfgm zzj;

    public zzdri(zzcgz zzcgzVar, Context context, zzawo zzawoVar, zzbfc zzbfcVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbcx zzbcxVar, zzdbf zzdbfVar, zzefo zzefoVar, zzfgm zzfgmVar) {
        this.zza = zzcgzVar;
        this.zzb = context;
        this.zzc = zzawoVar;
        this.zzd = zzbfcVar;
        this.zze = versionInfoParcel;
        this.zzf = zzaVar;
        this.zzg = zzbcxVar;
        this.zzh = zzdbfVar;
        this.zzi = zzefoVar;
        this.zzj = zzfgmVar;
    }

    public final zzcgm zza(com.google.android.gms.ads.internal.client.zzq zzqVar, zzffn zzffnVar, zzffq zzffqVar) throws zzcgy {
        zzcie zzcieVarZzc = zzcie.zzc(zzqVar);
        String str = zzqVar.zza;
        zzdqx zzdqxVar = new zzdqx(this);
        zzefo zzefoVar = this.zzi;
        zzfgm zzfgmVar = this.zzj;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzf;
        zzbcx zzbcxVar = this.zzg;
        return zzcgz.zza(this.zzb, zzcieVarZzc, str, false, false, this.zzc, this.zzd, this.zze, null, zzdqxVar, zzaVar, zzbcxVar, zzffnVar, zzffqVar, zzefoVar, zzfgmVar);
    }
}
