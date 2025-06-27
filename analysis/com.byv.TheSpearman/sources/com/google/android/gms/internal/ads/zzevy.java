package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzevy implements zzewr {
    private final String zza;
    private final zzgep zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfgi zze;
    private final zzcik zzf;

    zzevy(zzgep zzgepVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfgi zzfgiVar, zzcik zzcikVar) {
        this.zzb = zzgepVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfgiVar;
        this.zzf = zzcikVar;
    }

    public static /* synthetic */ ListenableFuture zzc(zzevy zzevyVar) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzi zziVarZzp = zzevyVar.zzf.zzp();
        zzcxy zzcxyVar = new zzcxy();
        zzcxyVar.zze(zzevyVar.zzd);
        zzfgg zzfggVar = new zzfgg();
        zzfggVar.zzt("adUnitId");
        zzfggVar.zzG(zzevyVar.zze.zzd);
        zzfggVar.zzs(new com.google.android.gms.ads.internal.client.zzq());
        zzfggVar.zzy(true);
        zzcxyVar.zzi(zzfggVar.zzI());
        zziVarZzp.zza(zzcxyVar.zzj());
        com.google.android.gms.ads.nonagon.signalgeneration.zzae zzaeVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzae();
        zzaeVar.zza(zzevyVar.zza);
        zziVarZzp.zzb(zzaeVar.zzb());
        new zzdef();
        return zzgee.zze(zzgee.zzm((zzgdv) zzgee.zzo(zzgdv.zzu(zziVarZzp.zzc().zzb()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhj)).longValue(), TimeUnit.MILLISECONDS, zzevyVar.zzc), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzevv
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzap) obj;
                return zzapVar != null ? new zzevz(zzapVar.zza) : new zzevz(null);
            }
        }, zzevyVar.zzb), Exception.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzevw
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", (Exception) obj);
                return new zzevz(null);
            }
        }, zzevyVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhi)).booleanValue() || this.zze.zzq) ? zzgee.zzh(new zzevz(null)) : zzgee.zzk(new zzgdk() { // from class: com.google.android.gms.internal.ads.zzevx
            @Override // com.google.android.gms.internal.ads.zzgdk
            public final ListenableFuture zza() {
                return zzevy.zzc(this.zza);
            }
        }, this.zzb);
    }
}
