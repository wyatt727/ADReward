package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcmd implements zzffh {
    private final zzckh zza;
    private final zzcmd zzb = this;
    private final zzhje zzc;
    private final zzhje zzd;
    private final zzhje zze;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;
    private final zzhje zzi;
    private final zzhje zzj;

    /* synthetic */ zzcmd(zzckh zzckhVar, Context context, String str, zzcmc zzcmcVar) {
        this.zza = zzckhVar;
        zzhiv zzhivVarZza = zzhiw.zza(context);
        this.zzc = zzhivVarZza;
        zzfdh zzfdhVar = new zzfdh(zzhivVarZza, zzckhVar.zzaD, zzckhVar.zzaE);
        this.zzd = zzfdhVar;
        zzhje zzhjeVarZzc = zzhiu.zzc(new zzfer(zzckhVar.zzaD));
        this.zze = zzhjeVarZzc;
        zzhje zzhjeVarZzc2 = zzhiu.zzc(zzfgf.zza());
        this.zzf = zzhjeVarZzc2;
        zzhje zzhjeVarZzc3 = zzhiu.zzc(new zzffb(zzhivVarZza, zzckhVar.zzc, zzckhVar.zzO, zzfdhVar, zzhjeVarZzc, zzfgk.zza(), zzhjeVarZzc2));
        this.zzg = zzhjeVarZzc3;
        this.zzh = zzhiu.zzc(new zzffl(zzhjeVarZzc3, zzhjeVarZzc, zzhjeVarZzc2));
        zzhiv zzhivVarZzc = zzhiw.zzc(str);
        this.zzi = zzhivVarZzc;
        this.zzj = zzhiu.zzc(new zzfff(zzhivVarZzc, zzhjeVarZzc3, zzhivVarZza, zzhjeVarZzc, zzhjeVarZzc2, zzckhVar.zzl, zzckhVar.zzQ, zzckhVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final zzffe zza() {
        return (zzffe) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final zzffk zzb() {
        return (zzffk) this.zzh.zzb();
    }
}
