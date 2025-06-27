package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzckr implements zzfao {
    private final zzckh zza;
    private final zzckr zzb = this;
    private final zzhje zzc;
    private final zzhje zzd;
    private final zzhje zze;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;

    /* synthetic */ zzckr(zzckh zzckhVar, Context context, String str, zzckq zzckqVar) {
        this.zza = zzckhVar;
        zzhiv zzhivVarZza = zzhiw.zza(context);
        this.zzc = zzhivVarZza;
        zzhiv zzhivVarZza2 = zzhiw.zza(str);
        this.zzd = zzhivVarZza2;
        zzfdg zzfdgVar = new zzfdg(zzhivVarZza, zzckhVar.zzaD, zzckhVar.zzaE);
        this.zze = zzfdgVar;
        zzhje zzhjeVarZzc = zzhiu.zzc(new zzfbm(zzckhVar.zzaD));
        this.zzf = zzhjeVarZzc;
        zzhje zzhjeVarZzc2 = zzhiu.zzc(new zzfbo(zzhivVarZza, zzckhVar.zzc, zzckhVar.zzO, zzfdgVar, zzhjeVarZzc, zzfgk.zza(), zzckhVar.zzl));
        this.zzg = zzhjeVarZzc2;
        this.zzh = zzhiu.zzc(new zzfbu(zzckhVar.zzO, zzhivVarZza, zzhivVarZza2, zzhjeVarZzc2, zzhjeVarZzc, zzckhVar.zzl, zzckhVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzfao
    public final zzfbt zza() {
        return (zzfbt) this.zzh.zzb();
    }
}
