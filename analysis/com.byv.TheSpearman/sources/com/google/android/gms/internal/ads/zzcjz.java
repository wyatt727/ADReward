package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcjz extends zzeye {
    private final zzezl zza;
    private final zzckh zzb;
    private final zzcjz zzc = this;
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

    /* synthetic */ zzcjz(zzckh zzckhVar, zzezl zzezlVar, zzcjy zzcjyVar) {
        this.zzb = zzckhVar;
        this.zza = zzezlVar;
        zzezn zzeznVar = new zzezn(zzezlVar);
        this.zzd = zzeznVar;
        zzhje zzhjeVarZzc = zzhiu.zzc(zzdtc.zza());
        this.zze = zzhjeVarZzc;
        zzhje zzhjeVarZzc2 = zzhiu.zzc(zzdta.zza());
        this.zzf = zzhjeVarZzc2;
        zzhje zzhjeVarZzc3 = zzhiu.zzc(zzdte.zza());
        this.zzg = zzhjeVarZzc3;
        zzhje zzhjeVarZzc4 = zzhiu.zzc(zzdtg.zza());
        this.zzh = zzhjeVarZzc4;
        zzhiy zzhiyVarZzc = zzhiz.zzc(4);
        zzhiyVarZzc.zzb(zzfkh.GMS_SIGNALS, zzhjeVarZzc);
        zzhiyVarZzc.zzb(zzfkh.BUILD_URL, zzhjeVarZzc2);
        zzhiyVarZzc.zzb(zzfkh.HTTP, zzhjeVarZzc3);
        zzhiyVarZzc.zzb(zzfkh.PRE_PROCESS, zzhjeVarZzc4);
        zzhiz zzhizVarZzc = zzhiyVarZzc.zzc();
        this.zzi = zzhizVarZzc;
        zzhje zzhjeVarZzc5 = zzhiu.zzc(new zzdth(zzeznVar, zzckhVar.zzh, zzfji.zza(), zzhizVarZzc));
        this.zzj = zzhjeVarZzc5;
        zzhji zzhjiVarZza = zzhjj.zza(0, 1);
        zzhjiVarZza.zza(zzhjeVarZzc5);
        zzhjj zzhjjVarZzc = zzhjiVarZza.zzc();
        this.zzk = zzhjjVarZzc;
        zzfkq zzfkqVar = new zzfkq(zzhjjVarZzc);
        this.zzl = zzfkqVar;
        this.zzm = zzhiu.zzc(new zzfkp(zzfji.zza(), zzckhVar.zze, zzfkqVar));
        this.zzn = zzhiu.zzc(new zzfli(zzckhVar.zzz));
    }

    @Override // com.google.android.gms.internal.ads.zzeye
    public final zzewu zza() {
        Context contextZzb = this.zzb.zza.zzb();
        zzhjd.zzb(contextZzb);
        zzcav zzcavVar = new zzcav();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        zzezf zzezfVar = new zzezf(zzcavVar, zzgepVar, zzezm.zza(this.zza));
        zzgep zzgepVar2 = zzcbr.zza;
        zzhjd.zzb(zzgepVar2);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zze.zzb();
        zzflh zzflhVar = (zzflh) this.zzn.zzb();
        zzduh zzduhVar = (zzduh) this.zzb.zzM.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzeuz(zzezfVar, 0L, scheduledExecutorService));
        return new zzewu(contextZzb, zzgepVar2, hashSet, zzflhVar, zzduhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeye
    public final zzfkn zzb() {
        return (zzfkn) this.zzm.zzb();
    }
}
