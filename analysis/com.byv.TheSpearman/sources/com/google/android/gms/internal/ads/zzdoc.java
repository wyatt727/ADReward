package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdoc implements zzhiv {
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
    private final zzhjm zzm;
    private final zzhjm zzn;
    private final zzhjm zzo;
    private final zzhjm zzp;
    private final zzhjm zzq;

    public zzdoc(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5, zzhjm zzhjmVar6, zzhjm zzhjmVar7, zzhjm zzhjmVar8, zzhjm zzhjmVar9, zzhjm zzhjmVar10, zzhjm zzhjmVar11, zzhjm zzhjmVar12, zzhjm zzhjmVar13, zzhjm zzhjmVar14, zzhjm zzhjmVar15, zzhjm zzhjmVar16, zzhjm zzhjmVar17) {
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
        this.zzm = zzhjmVar13;
        this.zzn = zzhjmVar14;
        this.zzo = zzhjmVar15;
        this.zzp = zzhjmVar16;
        this.zzq = zzhjmVar17;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdob zzb() {
        Context context = (Context) this.zza.zzb();
        zzdnk zzdnkVar = (zzdnk) this.zzb.zzb();
        zzawo zzawoVar = (zzawo) this.zzc.zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzcjc) this.zzd).zza();
        zzhjm zzhjmVar = this.zzf;
        com.google.android.gms.ads.internal.zza zzaVarZza = com.google.android.gms.ads.internal.zza.zza();
        zzbcx zzbcxVar = (zzbcx) zzhjmVar.zzb();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        return new zzdob(context, zzdnkVar, zzawoVar, versionInfoParcelZza, zzaVarZza, zzbcxVar, zzgepVar, ((zzcyh) this.zzh).zza(), (zzdot) this.zzi.zzb(), (zzdri) this.zzj.zzb(), (ScheduledExecutorService) this.zzk.zzb(), (zzduh) this.zzl.zzb(), (zzfmt) this.zzm.zzb(), (zzefd) this.zzn.zzb(), (zzdqd) this.zzo.zzb(), (zzefo) this.zzp.zzb(), (zzfgm) this.zzq.zzb());
    }
}
