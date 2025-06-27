package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzckd extends zzeyg {
    private final zzexu zza;
    private final zzckh zzb;
    private final zzckd zzc = this;
    private final zzhje zzd;
    private final zzhje zze;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;
    private final zzhje zzi;
    private final zzhje zzj;
    private final zzhje zzk;
    private final zzhje zzl;
    private final zzhje zzm;
    private final zzhje zzn;

    /* synthetic */ zzckd(zzckh zzckhVar, zzexu zzexuVar, zzckc zzckcVar) {
        this.zzb = zzckhVar;
        this.zza = zzexuVar;
        this.zzd = zzhiu.zzc(new zzfli(zzckhVar.zzz));
        zzeyc zzeycVar = new zzeyc(zzexuVar);
        this.zze = zzeycVar;
        zzhje zzhjeVarZzc = zzhiu.zzc(zzdtc.zza());
        this.zzf = zzhjeVarZzc;
        zzhje zzhjeVarZzc2 = zzhiu.zzc(zzdta.zza());
        this.zzg = zzhjeVarZzc2;
        zzhje zzhjeVarZzc3 = zzhiu.zzc(zzdte.zza());
        this.zzh = zzhjeVarZzc3;
        zzhje zzhjeVarZzc4 = zzhiu.zzc(zzdtg.zza());
        this.zzi = zzhjeVarZzc4;
        zzhiy zzhiyVarZzc = zzhiz.zzc(4);
        zzhiyVarZzc.zzb(zzfkh.GMS_SIGNALS, zzhjeVarZzc);
        zzhiyVarZzc.zzb(zzfkh.BUILD_URL, zzhjeVarZzc2);
        zzhiyVarZzc.zzb(zzfkh.HTTP, zzhjeVarZzc3);
        zzhiyVarZzc.zzb(zzfkh.PRE_PROCESS, zzhjeVarZzc4);
        zzhiz zzhizVarZzc = zzhiyVarZzc.zzc();
        this.zzj = zzhizVarZzc;
        zzhje zzhjeVarZzc5 = zzhiu.zzc(new zzdth(zzeycVar, zzckhVar.zzh, zzfji.zza(), zzhizVarZzc));
        this.zzk = zzhjeVarZzc5;
        zzhji zzhjiVarZza = zzhjj.zza(0, 1);
        zzhjiVarZza.zza(zzhjeVarZzc5);
        zzhjj zzhjjVarZzc = zzhjiVarZza.zzc();
        this.zzl = zzhjjVarZzc;
        zzfkq zzfkqVar = new zzfkq(zzhjjVarZzc);
        this.zzm = zzfkqVar;
        this.zzn = zzhiu.zzc(new zzfkp(zzfji.zza(), zzckhVar.zze, zzfkqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeyg
    public final zzewu zza() {
        Context contextZzb = this.zzb.zza.zzb();
        zzhjd.zzb(contextZzb);
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        zzcav zzcavVar = new zzcav();
        zzgep zzgepVar2 = zzcbr.zza;
        zzhjd.zzb(zzgepVar2);
        zzewr zzewrVarZza = zzfab.zza(new zzezf(zzcavVar, zzgepVar2, zzexv.zza(this.zza)), zzeut.zza(), (ScheduledExecutorService) this.zzb.zze.zzb(), 0);
        zzbut zzbutVar = new zzbut();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zze.zzb();
        Context contextZzb2 = this.zzb.zza.zzb();
        zzhjd.zzb(contextZzb2);
        zzewr zzewrVarZzb = zzfab.zzb(new zzezp(zzbutVar, scheduledExecutorService, contextZzb2), (ScheduledExecutorService) this.zzb.zze.zzb());
        zzcay zzcayVar = new zzcay();
        Context contextZzb3 = this.zzb.zza.zzb();
        zzhjd.zzb(contextZzb3);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.zzb.zze.zzb();
        zzgep zzgepVar3 = zzcbr.zza;
        zzhjd.zzb(zzgepVar3);
        zzexu zzexuVar = this.zza;
        zzewr zzewrVarZza2 = zzfac.zza(zzexo.zza(zzcayVar, contextZzb3, scheduledExecutorService2, zzgepVar3, zzexw.zza(zzexuVar), zzexy.zza(zzexuVar), zzexz.zza(zzexuVar)), (ScheduledExecutorService) this.zzb.zze.zzb());
        zzgep zzgepVar4 = zzcbr.zza;
        zzhjd.zzb(zzgepVar4);
        zzewr zzewrVarZzc = zzfab.zzc(new zzfak(zzgepVar4), (ScheduledExecutorService) this.zzb.zze.zzb());
        zzezz zzezzVar = zzezz.zza;
        Context contextZzb4 = this.zzb.zza.zzb();
        zzhjd.zzb(contextZzb4);
        String strZza = zzexv.zza(this.zza);
        zzgep zzgepVar5 = zzcbr.zza;
        zzhjd.zzb(zzgepVar5);
        zzeyi zzeyiVar = new zzeyi(null, contextZzb4, strZza, zzgepVar5);
        zzbcm zzbcmVar = new zzbcm();
        zzgep zzgepVar6 = zzcbr.zza;
        zzhjd.zzb(zzgepVar6);
        Context contextZzb5 = this.zzb.zza.zzb();
        zzhjd.zzb(contextZzb5);
        zzbdj zzbdjVar = new zzbdj();
        zzgep zzgepVar7 = zzcbr.zza;
        zzhjd.zzb(zzgepVar7);
        zzcay zzcayVar2 = new zzcay();
        zzgep zzgepVar8 = zzcbr.zza;
        zzhjd.zzb(zzgepVar8);
        zzexu zzexuVar2 = this.zza;
        zzcay zzcayVar3 = new zzcay();
        zzexu zzexuVar3 = this.zza;
        zzckh zzckhVar = this.zzb;
        int iZza = zzexw.zza(zzexuVar3);
        Context contextZzb6 = zzckhVar.zza.zzb();
        zzhjd.zzb(contextZzb6);
        zzcbh zzcbhVar = (zzcbh) this.zzb.zzad.zzb();
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.zzb.zze.zzb();
        zzgep zzgepVar9 = zzcbr.zza;
        zzhjd.zzb(zzgepVar9);
        String strZza2 = zzexv.zza(this.zza);
        zzbca zzbcaVar = new zzbca();
        zzcbh zzcbhVar2 = (zzcbh) this.zzb.zzad.zzb();
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.zzb.zze.zzb();
        zzgep zzgepVar10 = zzcbr.zza;
        zzhjd.zzb(zzgepVar10);
        return new zzewu(contextZzb, zzgepVar, zzfzs.zzs(zzewrVarZza, zzewrVarZzb, zzewrVarZza2, zzewrVarZzc, zzezzVar, zzeyiVar, new zzeyx(zzbcmVar, zzgepVar6, contextZzb5), new zzezj(zzbdjVar, zzgepVar7, zzexx.zza(this.zza)), new zzexs(zzcayVar2, zzgepVar8, zzeya.zza(zzexuVar2), zzeyb.zza(zzexuVar2), zzexw.zza(zzexuVar2)), new zzeyt(zzcayVar3, iZza, contextZzb6, zzcbhVar, scheduledExecutorService3, zzgepVar9, zzexv.zza(this.zza)), (zzewr) this.zzb.zzaH.zzb(), zzeyp.zza(strZza2, zzbcaVar, zzcbhVar2, scheduledExecutorService4, zzgepVar10)), (zzflh) this.zzd.zzb(), (zzduh) this.zzb.zzM.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzeyg
    public final zzfkn zzb() {
        return (zzfkn) this.zzn.zzb();
    }
}
