package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdjo implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;
    private final zzhjm zzf;

    public zzdjo(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5, zzhjm zzhjmVar6) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
        this.zzf = zzhjmVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcik zzcikVar = (zzcik) this.zza.zzb();
        zzcxy zzcxyVarZza = ((zzcyi) this.zzb).zza();
        zzdeh zzdehVarZza = ((zzdfb) this.zzc).zza();
        zzdjd zzdjdVarZza = ((zzdjf) this.zzd).zza();
        zzdbf zzdbfVarZzb = ((zzcrl) this.zze).zzb();
        zzekd zzekdVar = (zzekd) this.zzf.zzb();
        zzcsl zzcslVarZze = zzcikVar.zze();
        zzcslVarZze.zzi(zzcxyVarZza.zzj());
        zzcslVarZze.zzf(zzdehVarZza);
        zzcslVarZze.zzd(zzdjdVarZza);
        zzcslVarZze.zze(new zzemj(null));
        zzcslVarZze.zzg(new zzctn(zzdbfVarZzb, null));
        zzcslVarZze.zzc(new zzcrj(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdy)).booleanValue()) {
            zzcslVarZze.zzj(zzekm.zzb(zzekdVar));
        }
        zzcty zzctyVarZzc = zzcslVarZze.zzh().zzc();
        zzhjd.zzb(zzctyVarZzc);
        return zzctyVarZzc;
    }
}
