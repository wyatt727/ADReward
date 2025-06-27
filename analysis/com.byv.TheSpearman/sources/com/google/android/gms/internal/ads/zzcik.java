package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzcik implements zzcnx {

    @Nullable
    private static zzcik zza;

    private static synchronized zzcik zzD(Context context, @Nullable zzbqo zzbqoVar, int i, boolean z, int i2, zzcjp zzcjpVar) {
        zzcik zzcikVar = zza;
        if (zzcikVar != null) {
            return zzcikVar;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        zzbdz.zza(context);
        zzfhe zzfheVarZzd = zzfhe.zzd(context);
        VersionInfoParcel versionInfoParcelZzc = zzfheVarZzd.zzc(241199000, false, i2);
        zzfheVarZzd.zzf(zzbqoVar);
        zzcld zzcldVar = new zzcld(null);
        zzcil zzcilVar = new zzcil();
        zzcilVar.zzf(versionInfoParcelZzc);
        zzcilVar.zze(context);
        zzcilVar.zzd(jCurrentTimeMillis);
        zzcldVar.zzb(new zzcin(zzcilVar, null));
        zzcldVar.zzc(new zzcmq(zzcjpVar));
        zzcik zzcikVarZza = zzcldVar.zza();
        com.google.android.gms.ads.internal.zzu.zzo().zzu(context, versionInfoParcelZzc);
        com.google.android.gms.ads.internal.zzu.zzc().zzi(context);
        com.google.android.gms.ads.internal.zzu.zzp().zzl(context);
        com.google.android.gms.ads.internal.zzu.zzp().zzk(context);
        com.google.android.gms.ads.internal.util.zzd.zza(context);
        com.google.android.gms.ads.internal.zzu.zzb().zzd(context);
        com.google.android.gms.ads.internal.zzu.zzv().zzb(context);
        zzcikVarZza.zza().zzc();
        zzcae.zzd(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgm)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzav)).booleanValue()) {
                new zzeeq(context, versionInfoParcelZzc, new zzbcx(new zzbdf(context)), new zzedv(new zzedr(context), zzcikVarZza.zzA())).zzb(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzO());
            }
        }
        zza = zzcikVarZza;
        return zzcikVarZza;
    }

    public static zzcik zzb(Context context, @Nullable zzbqo zzbqoVar, int i) {
        return zzD(context, zzbqoVar, 241199000, false, i, new zzcjp());
    }

    public abstract zzgep zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    public abstract com.google.android.gms.ads.internal.util.zzcf zza();

    public abstract zzcna zzc();

    public abstract zzcqz zzd();

    public abstract zzcsl zze();

    public abstract zzdbf zzf();

    public abstract zzdil zzg();

    public abstract zzdjh zzh();

    public abstract zzdqq zzi();

    public abstract zzduh zzj();

    public abstract zzdvq zzk();

    public abstract zzdxf zzl();

    public abstract zzdyc zzm();

    public abstract zzefo zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzc zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzi zzp();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab zzq();

    @Override // com.google.android.gms.internal.ads.zzcnx
    public final zzexp zzr(zzbxd zzbxdVar, int i) {
        return zzs(new zzezs(zzbxdVar, i));
    }

    protected abstract zzexp zzs(zzezs zzezsVar);

    public abstract zzfan zzt();

    public abstract zzfcb zzu();

    public abstract zzfds zzv();

    public abstract zzffg zzw();

    public abstract zzfgx zzx();

    public abstract zzfhh zzy();

    public abstract zzflk zzz();
}
