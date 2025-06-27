package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejn {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcty zzc;
    private final zzekd zzd;
    private final zzfmp zze;
    private final zzgex zzf = zzgex.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzejo zzh;
    private zzffz zzi;

    zzejn(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcty zzctyVar, zzekd zzekdVar, zzfmp zzfmpVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzctyVar;
        this.zzd = zzekdVar;
        this.zze = zzfmpVar;
    }

    private final synchronized ListenableFuture zzd(zzffn zzffnVar) {
        Iterator it = zzffnVar.zza.iterator();
        while (it.hasNext()) {
            zzegj zzegjVarZza = this.zzc.zza(zzffnVar.zzb, (String) it.next());
            if (zzegjVarZza != null && zzegjVarZza.zzb(this.zzi, zzffnVar)) {
                return zzgee.zzo(zzegjVarZza.zza(this.zzi, zzffnVar), zzffnVar.zzS, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgee.zzg(new zzdyi(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(zzffn zzffnVar) {
        if (zzffnVar == null) {
            return;
        }
        ListenableFuture listenableFutureZzd = zzd(zzffnVar);
        this.zzd.zzf(this.zzi, zzffnVar, listenableFutureZzd, this.zze);
        zzgee.zzr(listenableFutureZzd, new zzejm(this, zzffnVar), this.zza);
    }

    public final synchronized ListenableFuture zzb(zzffz zzffzVar) {
        if (!this.zzg.getAndSet(true)) {
            if (zzffzVar.zzb.zza.isEmpty()) {
                this.zzf.zzd(new zzekh(3, zzekk.zzc(zzffzVar)));
            } else {
                this.zzi = zzffzVar;
                this.zzh = new zzejo(zzffzVar, this.zzd, this.zzf);
                this.zzd.zzk(zzffzVar.zzb.zza);
                while (this.zzh.zze()) {
                    zze(this.zzh.zza());
                }
            }
        }
        return this.zzf;
    }
}
