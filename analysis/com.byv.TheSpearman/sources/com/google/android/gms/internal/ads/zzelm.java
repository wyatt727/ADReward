package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzelm implements zzegp {
    private final Context zza;
    private final Executor zzb;
    private final zzdqr zzc;

    public zzelm(Context context, Executor executor, zzdqr zzdqrVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdqrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) {
        try {
            ((zzfhg) zzegmVar.zzb).zzk(zzffzVar.zza.zza.zzd, zzffnVar.zzw.toString());
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzegmVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, zzffn zzffnVar, final zzegm zzegmVar) throws zzekh, zzfgp {
        zzdqn zzdqnVarZze = this.zzc.zze(new zzcul(zzffzVar, zzffnVar, zzegmVar.zza), new zzdqo(new zzdiu() { // from class: com.google.android.gms.internal.ads.zzeli
            @Override // com.google.android.gms.internal.ads.zzdiu
            public final void zza(boolean z, Context context, zzczd zzczdVar) throws zzdit {
                zzegm zzegmVar2 = zzegmVar;
                try {
                    ((zzfhg) zzegmVar2.zzb).zzv(z);
                    ((zzfhg) zzegmVar2.zzb).zzA();
                } catch (zzfgp e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot show rewarded video.", e);
                    throw new zzdit(e.getCause());
                }
            }
        }));
        zzdqnVarZze.zzd().zzo(new zzcpa((zzfhg) zzegmVar.zzb), this.zzb);
        zzczx zzczxVarZze = zzdqnVarZze.zze();
        zzcyo zzcyoVarZzb = zzdqnVarZze.zzb();
        ((zzeig) zzegmVar.zzc).zzc(new zzell(this, zzdqnVarZze.zza(), zzcyoVarZzb, zzczxVarZze, zzdqnVarZze.zzg()));
        return zzdqnVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp {
        if (((zzfhg) zzegmVar.zzb).zzC()) {
            zze(zzffzVar, zzffnVar, zzegmVar);
            return;
        }
        ((zzeig) zzegmVar.zzc).zzd(new zzelk(this, zzffzVar, zzffnVar, zzegmVar));
        Object obj = zzegmVar.zzb;
        Context context = this.zza;
        zzfgi zzfgiVar = zzffzVar.zza.zza;
        ((zzfhg) obj).zzh(context, zzfgiVar.zzd, null, (zzbyb) zzegmVar.zzc, zzffnVar.zzw.toString());
    }
}
