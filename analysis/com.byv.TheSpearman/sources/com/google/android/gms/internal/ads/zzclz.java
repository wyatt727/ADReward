package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzclz implements zzfdt {
    private final zzckh zza;
    private final zzclz zzb = this;
    private final zzhje zzc;
    private final zzhje zzd;
    private final zzhje zze;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;
    private final zzhje zzi;

    /* synthetic */ zzclz(zzckh zzckhVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcly zzclyVar) {
        this.zza = zzckhVar;
        zzhiv zzhivVarZza = zzhiw.zza(context);
        this.zzc = zzhivVarZza;
        zzhiv zzhivVarZza2 = zzhiw.zza(zzqVar);
        this.zzd = zzhivVarZza2;
        zzhiv zzhivVarZza3 = zzhiw.zza(str);
        this.zze = zzhivVarZza3;
        zzhje zzhjeVarZzc = zzhiu.zzc(new zzeob(zzckhVar.zzM));
        this.zzf = zzhjeVarZzc;
        zzhje zzhjeVarZzc2 = zzhiu.zzc(new zzfer(zzckhVar.zzaD));
        this.zzg = zzhjeVarZzc2;
        zzhje zzhjeVarZzc3 = zzhiu.zzc(new zzfdr(zzhivVarZza, zzckhVar.zzc, zzckhVar.zzO, zzhjeVarZzc, zzhjeVarZzc2, zzfgk.zza()));
        this.zzh = zzhjeVarZzc3;
        this.zzi = zzhiu.zzc(new zzeoj(zzhivVarZza, zzhivVarZza2, zzhivVarZza3, zzhjeVarZzc3, zzhjeVarZzc, zzhjeVarZzc2, zzckhVar.zzl, zzckhVar.zzQ, zzckhVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final zzeoi zza() {
        return (zzeoi) this.zzi.zzb();
    }
}
