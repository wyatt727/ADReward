package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeyp implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;

    public zzeyp(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
    }

    public static zzeyn zza(String str, zzbca zzbcaVar, zzcbh zzcbhVar, ScheduledExecutorService scheduledExecutorService, zzgep zzgepVar) {
        return new zzeyn(str, zzbcaVar, zzcbhVar, scheduledExecutorService, zzgepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strZza = ((zzezt) this.zza).zza();
        zzbca zzbcaVar = new zzbca();
        zzcbh zzcbhVar = (zzcbh) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        return new zzeyn(strZza, zzbcaVar, zzcbhVar, scheduledExecutorService, zzgepVar);
    }
}
