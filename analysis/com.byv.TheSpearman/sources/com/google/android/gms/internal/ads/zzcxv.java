package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcxv implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;
    private final zzhjm zzf;
    private final zzhjm zzg;
    private final zzhjm zzh;
    private final zzhjm zzi;
    private final zzhjm zzj;
    private final zzhjm zzk;
    private final zzhjm zzl;

    public zzcxv(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5, zzhjm zzhjmVar6, zzhjm zzhjmVar7, zzhjm zzhjmVar8, zzhjm zzhjmVar9, zzhjm zzhjmVar10, zzhjm zzhjmVar11, zzhjm zzhjmVar12) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
        this.zzf = zzhjmVar6;
        this.zzg = zzhjmVar7;
        this.zzh = zzhjmVar8;
        this.zzi = zzhjmVar9;
        this.zzj = zzhjmVar10;
        this.zzk = zzhjmVar11;
        this.zzl = zzhjmVar12;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcxu zzb() {
        zzfkn zzfknVar = (zzfkn) this.zza.zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzcjc) this.zzb).zza();
        ApplicationInfo applicationInfoZzb = ((zzdyv) this.zzc).zzb();
        String strZzb = ((zzdza) this.zzd).zzb();
        zzbdq zzbdqVar = zzbdz.zza;
        return new zzcxu(zzfknVar, versionInfoParcelZza, applicationInfoZzb, strZzb, com.google.android.gms.ads.internal.client.zzba.zza().zza(), (PackageInfo) this.zzf.zzb(), zzhiu.zza(zzhjg.zza(this.zzg)), ((zzcio) this.zzh).zzb(), (String) this.zzi.zzb(), ((zzewv) this.zzj).zzb(), ((zzcyh) this.zzk).zza(), (zzddz) this.zzl.zzb());
    }
}
