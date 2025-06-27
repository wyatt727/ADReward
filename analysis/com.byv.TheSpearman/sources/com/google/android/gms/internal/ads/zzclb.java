package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzclb implements zzfcc {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzckh zzd;
    private final zzclb zze = this;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;
    private final zzhje zzi;
    private final zzhje zzj;
    private final zzhje zzk;

    /* synthetic */ zzclb(zzckh zzckhVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcla zzclaVar) {
        this.zzd = zzckhVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzhiv zzhivVarZza = zzhiw.zza(context);
        this.zzf = zzhivVarZza;
        zzhiv zzhivVarZza2 = zzhiw.zza(zzqVar);
        this.zzg = zzhivVarZza2;
        zzhje zzhjeVarZzc = zzhiu.zzc(new zzeob(zzckhVar.zzM));
        this.zzh = zzhjeVarZzc;
        zzhje zzhjeVarZzc2 = zzhiu.zzc(zzeog.zza());
        this.zzi = zzhjeVarZzc2;
        zzhje zzhjeVarZzc3 = zzhiu.zzc(zzddo.zza());
        this.zzj = zzhjeVarZzc3;
        this.zzk = zzhiu.zzc(new zzfca(zzhivVarZza, zzckhVar.zzc, zzhivVarZza2, zzckhVar.zzO, zzhjeVarZzc, zzhjeVarZzc2, zzfgk.zza(), zzhjeVarZzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final zzeng zza() {
        zzfbz zzfbzVar = (zzfbz) this.zzk.zzb();
        zzeoa zzeoaVar = (zzeoa) this.zzh.zzb();
        VersionInfoParcel versionInfoParcelZze = this.zzd.zza.zze();
        zzhjd.zzb(versionInfoParcelZze);
        return new zzeng(this.zza, this.zzb, this.zzc, zzfbzVar, zzeoaVar, versionInfoParcelZze, (zzduh) this.zzd.zzM.zzb());
    }
}
