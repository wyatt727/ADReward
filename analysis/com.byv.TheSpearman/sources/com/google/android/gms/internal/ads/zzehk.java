package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzehk implements zzegj {
    private final zzcsm zza;
    private final Context zzb;
    private final zzdri zzc;
    private final zzfgi zzd;
    private final Executor zze;
    private final zzfwf zzf;

    public zzehk(zzcsm zzcsmVar, Context context, Executor executor, zzdri zzdriVar, zzfgi zzfgiVar, zzfwf zzfwfVar) {
        this.zzb = context;
        this.zza = zzcsmVar;
        this.zze = executor;
        this.zzc = zzdriVar;
        this.zzd = zzfgiVar;
        this.zzf = zzfwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(final zzffz zzffzVar, final zzffn zzffnVar) {
        return zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzehj
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzffzVar, zzffnVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final boolean zzb(zzffz zzffzVar, zzffn zzffnVar) {
        zzffs zzffsVar = zzffnVar.zzt;
        return (zzffsVar == null || zzffsVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzc(zzffz zzffzVar, zzffn zzffnVar, Object obj) throws Exception {
        View zzdrlVar;
        com.google.android.gms.ads.internal.client.zzq zzqVarZza = zzfgo.zza(this.zzb, zzffnVar.zzv);
        final zzcgm zzcgmVarZza = this.zzc.zza(zzqVarZza, zzffnVar, zzffzVar.zzb.zzb);
        zzcgmVarZza.zzaa(zzffnVar.zzX);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhN)).booleanValue() && zzffnVar.zzah) {
            zzdrlVar = zzcth.zza(this.zzb, (View) zzcgmVarZza, zzffnVar);
        } else {
            zzdrlVar = new zzdrl(this.zzb, (View) zzcgmVarZza, (com.google.android.gms.ads.internal.util.zzau) this.zzf.apply(zzffnVar));
        }
        zzcsm zzcsmVar = this.zza;
        zzcul zzculVar = new zzcul(zzffzVar, zzffnVar, null);
        Objects.requireNonNull(zzcgmVarZza);
        final zzcrn zzcrnVarZza = zzcsmVar.zza(zzculVar, new zzcrt(zzdrlVar, zzcgmVarZza, new zzctt() { // from class: com.google.android.gms.internal.ads.zzehe
            @Override // com.google.android.gms.internal.ads.zzctt
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzcgmVarZza.zzq();
            }
        }, zzfgo.zzb(zzqVarZza)));
        zzcrnVarZza.zzh().zzi(zzcgmVarZza, false, null);
        zzcrnVarZza.zzc().zzo(new zzczk() { // from class: com.google.android.gms.internal.ads.zzehf
            @Override // com.google.android.gms.internal.ads.zzczk
            public final void zzr() {
                zzcgm zzcgmVar = zzcgmVarZza;
                if (zzcgmVar.zzN() != null) {
                    zzcgmVar.zzN().zzr();
                }
            }
        }, zzcbr.zzf);
        zzcrnVarZza.zzh();
        zzffs zzffsVar = zzffnVar.zzt;
        ListenableFuture listenableFutureZzj = zzdrh.zzj(zzcgmVarZza, zzffsVar.zzb, zzffsVar.zza);
        if (zzffnVar.zzN) {
            Objects.requireNonNull(zzcgmVarZza);
            listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehg
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgmVarZza.zzaf();
                }
            }, this.zze);
        }
        listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzcgmVarZza);
            }
        }, this.zze);
        return zzgee.zzm(listenableFutureZzj, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzehi
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj2) {
                return zzcrnVarZza.zza();
            }
        }, zzcbr.zzf);
    }

    final /* synthetic */ void zzd(zzcgm zzcgmVar) {
        zzcgmVar.zzZ();
        zzchm zzchmVarZzq = zzcgmVar.zzq();
        com.google.android.gms.ads.internal.client.zzfk zzfkVar = this.zzd.zza;
        if (zzfkVar != null && zzchmVarZzq != null) {
            zzchmVarZzq.zzs(zzfkVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbi)).booleanValue() || zzcgmVar.isAttachedToWindow()) {
            return;
        }
        zzcgmVar.onPause();
        zzcgmVar.zzas(true);
    }
}
