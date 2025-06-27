package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbzy extends zzcae {
    private final Clock zzb;
    private final zzbzy zzc = this;
    private final zzhje zzd;
    private final zzhje zze;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;
    private final zzhje zzi;
    private final zzhje zzj;
    private final zzhje zzk;

    /* synthetic */ zzbzy(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcad zzcadVar, zzbzx zzbzxVar) {
        this.zzb = clock;
        zzhiv zzhivVarZza = zzhiw.zza(context);
        this.zzd = zzhivVarZza;
        zzhiv zzhivVarZza2 = zzhiw.zza(zzgVar);
        this.zze = zzhivVarZza2;
        zzhiv zzhivVarZza3 = zzhiw.zza(zzcadVar);
        this.zzf = zzhivVarZza3;
        this.zzg = zzhiu.zzc(new zzbzq(zzhivVarZza, zzhivVarZza2, zzhivVarZza3));
        zzhiv zzhivVarZza4 = zzhiw.zza(clock);
        this.zzh = zzhivVarZza4;
        zzhje zzhjeVarZzc = zzhiu.zzc(new zzbzs(zzhivVarZza4, zzhivVarZza2, zzhivVarZza3));
        this.zzi = zzhjeVarZzc;
        zzbzu zzbzuVar = new zzbzu(zzhivVarZza4, zzhjeVarZzc);
        this.zzj = zzbzuVar;
        this.zzk = zzhiu.zzc(new zzcaj(zzhivVarZza, zzbzuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    final zzbzp zza() {
        return (zzbzp) this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    final zzbzt zzb() {
        return new zzbzt(this.zzb, (zzbzr) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    final zzcai zzc() {
        return (zzcai) this.zzk.zzb();
    }
}
