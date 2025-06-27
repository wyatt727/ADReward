package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfdq implements zzeoq {
    private final Context zza;
    private final Executor zzb;
    private final zzcik zzc;
    private final zzeoa zzd;
    private final zzfeq zze;
    private zzbeu zzf;
    private final zzflk zzg;
    private final zzfgg zzh;
    private ListenableFuture zzi;

    public zzfdq(Context context, Executor executor, zzcik zzcikVar, zzeoa zzeoaVar, zzfeq zzfeqVar, zzfgg zzfggVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcikVar;
        this.zzd = zzeoaVar;
        this.zzh = zzfggVar;
        this.zze = zzfeqVar;
        this.zzg = zzcikVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoo zzeooVar, zzeop zzeopVar) throws JSONException {
        zzdim zzdimVarZzf;
        zzflh zzflhVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziO)).booleanValue() && zzlVar.zzf) {
            this.zzc.zzl().zzo(true);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzfdj) zzeooVar).zza;
        Bundle bundleZza = zzdts.zza(new Pair(zzdtq.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdtq.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzfgg zzfggVar = this.zzh;
        zzfggVar.zzt(str);
        zzfggVar.zzs(zzqVar);
        zzfggVar.zzG(zzlVar);
        zzfggVar.zzz(bundleZza);
        Context context = this.zza;
        zzfgi zzfgiVarZzI = zzfggVar.zzI();
        zzfkw zzfkwVarZzb = zzfkv.zzb(context, zzflg.zza(zzfgiVarZzI), zzflq.FORMAT_INTERSTITIAL, zzlVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzig)).booleanValue()) {
            zzdil zzdilVarZzg = this.zzc.zzg();
            zzcxy zzcxyVar = new zzcxy();
            zzcxyVar.zze(this.zza);
            zzcxyVar.zzi(zzfgiVarZzI);
            zzdilVarZzg.zze(zzcxyVar.zzj());
            zzdef zzdefVar = new zzdef();
            zzdefVar.zzj(this.zzd, this.zzb);
            zzdefVar.zzk(this.zzd, this.zzb);
            zzdilVarZzg.zzd(zzdefVar.zzn());
            zzdilVarZzg.zzc(new zzemj(this.zzf));
            zzdimVarZzf = zzdilVarZzg.zzh();
        } else {
            zzdef zzdefVar2 = new zzdef();
            zzfeq zzfeqVar = this.zze;
            if (zzfeqVar != null) {
                zzdefVar2.zze(zzfeqVar, this.zzb);
                zzdefVar2.zzf(this.zze, this.zzb);
                zzdefVar2.zzb(this.zze, this.zzb);
            }
            zzdil zzdilVarZzg2 = this.zzc.zzg();
            zzcxy zzcxyVar2 = new zzcxy();
            zzcxyVar2.zze(this.zza);
            zzcxyVar2.zzi(zzfgiVarZzI);
            zzdilVarZzg2.zze(zzcxyVar2.zzj());
            zzdefVar2.zzj(this.zzd, this.zzb);
            zzdefVar2.zze(this.zzd, this.zzb);
            zzdefVar2.zzf(this.zzd, this.zzb);
            zzdefVar2.zzb(this.zzd, this.zzb);
            zzdefVar2.zza(this.zzd, this.zzb);
            zzdefVar2.zzl(this.zzd, this.zzb);
            zzdefVar2.zzk(this.zzd, this.zzb);
            zzdefVar2.zzi(this.zzd, this.zzb);
            zzdefVar2.zzc(this.zzd, this.zzb);
            zzdilVarZzg2.zzd(zzdefVar2.zzn());
            zzdilVarZzg2.zzc(new zzemj(this.zzf));
            zzdimVarZzf = zzdilVarZzg2.zzh();
        }
        zzdim zzdimVar = zzdimVarZzf;
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            zzflh zzflhVarZzf = zzdimVar.zzf();
            zzflhVarZzf.zzd(zzflq.FORMAT_INTERSTITIAL);
            zzflhVarZzf.zzb(zzlVar.zzp);
            zzflhVar = zzflhVarZzf;
        } else {
            zzflhVar = null;
        }
        zzcvd zzcvdVarZza = zzdimVar.zza();
        ListenableFuture listenableFutureZzi = zzcvdVarZza.zzi(zzcvdVarZza.zzj());
        this.zzi = listenableFutureZzi;
        zzgee.zzr(listenableFutureZzi, new zzfdp(this, zzeopVar, zzflhVar, zzfkwVarZzb, zzdimVar), this.zzb);
        return true;
    }

    final /* synthetic */ void zzh() {
        this.zzd.zzdB(zzfhk.zzd(6, null, null));
    }

    public final void zzi(zzbeu zzbeuVar) {
        this.zzf = zzbeuVar;
    }
}
