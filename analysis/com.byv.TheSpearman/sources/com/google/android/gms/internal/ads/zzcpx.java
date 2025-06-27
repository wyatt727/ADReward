package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcpx implements zzhiv {
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

    public zzcpx(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5, zzhjm zzhjmVar6, zzhjm zzhjmVar7, zzhjm zzhjmVar8, zzhjm zzhjmVar9, zzhjm zzhjmVar10, zzhjm zzhjmVar11, zzhjm zzhjmVar12, zzhjm zzhjmVar13, zzhjm zzhjmVar14, zzhjm zzhjmVar15) {
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
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* synthetic */ Object zzb() {
        Context contextZza = ((zzciq) this.zza).zza();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        return new zzcpw(contextZza, zzgepVar, (Executor) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), ((zzcup) this.zze).zza(), ((zzcum) this.zzf).zza(), (zzfmp) this.zzg.zzb(), (zzfgu) this.zzh.zzb(), (View) this.zzi.zzb(), (zzcgm) this.zzj.zzb(), (zzawo) this.zzk.zzb(), (zzbfc) this.zzl.zzb(), new zzbfe(), (zzflh) this.zzn.zzb(), ((zzcye) this.zzo).zza());
    }
}
