package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeox implements zzeoq {
    private final zzfgg zza;
    private final zzcik zzb;
    private final Context zzc;
    private final zzeon zzd;
    private final zzflk zze;
    private zzcuk zzf;

    public zzeox(zzcik zzcikVar, Context context, zzeon zzeonVar, zzfgg zzfggVar) {
        this.zzb = zzcikVar;
        this.zzc = context;
        this.zzd = zzeonVar;
        this.zza = zzfggVar;
        this.zze = zzcikVar.zzz();
        zzfggVar.zzv(zzeonVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zza() {
        zzcuk zzcukVar = this.zzf;
        return zzcukVar != null && zzcukVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoo zzeooVar, zzeop zzeopVar) throws JSONException, RemoteException {
        zzflh zzflhVar;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzH(this.zzc) && zzlVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeos
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeot
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg();
                }
            });
            return false;
        }
        zzfhf.zza(this.zzc, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziO)).booleanValue() && zzlVar.zzf) {
            this.zzb.zzl().zzo(true);
        }
        int i = ((zzeor) zzeooVar).zza;
        Bundle bundleZza = zzdts.zza(new Pair(zzdtq.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdtq.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzfgg zzfggVar = this.zza;
        zzfggVar.zzG(zzlVar);
        zzfggVar.zzz(bundleZza);
        zzfggVar.zzB(i);
        Context context = this.zzc;
        zzfgi zzfgiVarZzI = zzfggVar.zzI();
        zzfkw zzfkwVarZzb = zzfkv.zzb(context, zzflg.zza(zzfgiVarZzI), zzflq.FORMAT_NATIVE, zzlVar);
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzfgiVarZzI.zzn;
        if (zzcbVar != null) {
            this.zzd.zzd().zzm(zzcbVar);
        }
        zzdjh zzdjhVarZzh = this.zzb.zzh();
        zzcxy zzcxyVar = new zzcxy();
        zzcxyVar.zze(this.zzc);
        zzcxyVar.zzi(zzfgiVarZzI);
        zzdjhVarZzh.zzf(zzcxyVar.zzj());
        zzdef zzdefVar = new zzdef();
        zzdefVar.zzk(this.zzd.zzd(), this.zzb.zzB());
        zzdjhVarZzh.zze(zzdefVar.zzn());
        zzdjhVarZzh.zzd(this.zzd.zzc());
        zzdjhVarZzh.zzc(new zzcrj(null));
        zzdji zzdjiVarZzg = zzdjhVarZzh.zzh();
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            zzflh zzflhVarZzf = zzdjiVarZzg.zzf();
            zzflhVarZzf.zzd(zzflq.FORMAT_NATIVE);
            zzflhVarZzf.zzb(zzlVar.zzp);
            zzflhVar = zzflhVarZzf;
        } else {
            zzflhVar = null;
        }
        this.zzb.zzy().zzc(1);
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        ScheduledExecutorService scheduledExecutorServiceZzC = this.zzb.zzC();
        zzcvd zzcvdVarZza = zzdjiVarZzg.zza();
        zzcuk zzcukVar = new zzcuk(zzgepVar, scheduledExecutorServiceZzC, zzcvdVarZza.zzi(zzcvdVarZza.zzj()));
        this.zzf = zzcukVar;
        zzcukVar.zze(new zzeow(this, zzeopVar, zzflhVar, zzfkwVarZzb, zzdjiVarZzg));
        return true;
    }

    final /* synthetic */ void zzf() {
        this.zzd.zza().zzdB(zzfhk.zzd(4, null, null));
    }

    final /* synthetic */ void zzg() {
        this.zzd.zza().zzdB(zzfhk.zzd(6, null, null));
    }
}
