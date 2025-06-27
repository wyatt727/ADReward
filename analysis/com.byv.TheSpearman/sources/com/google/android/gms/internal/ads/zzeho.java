package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeho implements zzegp {
    private final Context zza;
    private final zzcsm zzb;
    private final Executor zzc;

    public zzeho(Context context, zzcsm zzcsmVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcsmVar;
        this.zzc = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, final zzffn zzffnVar, zzegm zzegmVar) throws zzekh, zzfgp {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhN)).booleanValue() && zzffnVar.zzah) {
            zzbqx zzbqxVarZzc = ((zzfhg) zzegmVar.zzb).zzc();
            if (zzbqxVarZzc == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfgp(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbqxVarZzc.zze());
                boolean zZzf = zzbqxVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfgp(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzehm
                            @Override // com.google.android.gms.internal.ads.zzgdl
                            public final ListenableFuture zza(Object obj) {
                                return this.zza.zzc(viewZza, zzffnVar, obj);
                            }
                        }, zzcbr.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfgp(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfgp(e2);
            }
        } else {
            viewZza = ((zzfhg) zzegmVar.zzb).zza();
        }
        zzcsm zzcsmVar = this.zzb;
        zzcul zzculVar = new zzcul(zzffzVar, zzffnVar, zzegmVar.zza);
        final zzfhg zzfhgVar = (zzfhg) zzegmVar.zzb;
        Objects.requireNonNull(zzfhgVar);
        zzcrn zzcrnVarZza = zzcsmVar.zza(zzculVar, new zzcrt(viewZza, null, new zzctt() { // from class: com.google.android.gms.internal.ads.zzehn
            @Override // com.google.android.gms.internal.ads.zzctt
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzfhgVar.zzb();
            }
        }, (zzffo) zzffnVar.zzv.get(0)));
        zzcrnVarZza.zzg().zza(viewZza);
        zzcrnVarZza.zzd().zzo(new zzcpa((zzfhg) zzegmVar.zzb), this.zzc);
        ((zzeif) zzegmVar.zzc).zzc(zzcrnVarZza.zzj());
        return zzcrnVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzffzVar.zza.zza.zze;
        if (zzqVar2.zzn) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhN)).booleanValue() && zzffnVar.zzah) ? new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : zzfgo.zza(this.zza, zzffnVar.zzv);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = zzqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhN)).booleanValue() && zzffnVar.zzah) {
            Object obj = zzegmVar.zzb;
            ((zzfhg) obj).zzn(this.zza, zzqVar3, zzffzVar.zza.zza.zzd, zzffnVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzl(zzffnVar.zzt), (zzbqu) zzegmVar.zzc);
            return;
        }
        Object obj2 = zzegmVar.zzb;
        ((zzfhg) obj2).zzm(this.zza, zzqVar3, zzffzVar.zza.zza.zzd, zzffnVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzl(zzffnVar.zzt), (zzbqu) zzegmVar.zzc);
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzffn zzffnVar, Object obj) throws Exception {
        return zzgee.zzh(zzcth.zza(this.zza, view, zzffnVar));
    }
}
