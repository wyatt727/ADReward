package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzekq implements zzegp {
    private final Context zza;
    private final Executor zzb;
    private final zzdqr zzc;

    public zzekq(Context context, Executor executor, zzdqr zzdqrVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, zzffn zzffnVar, final zzegm zzegmVar) throws zzekh, zzfgp {
        zzdqn zzdqnVarZze = this.zzc.zze(new zzcul(zzffzVar, zzffnVar, zzegmVar.zza), new zzdqo(new zzdiu() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // com.google.android.gms.internal.ads.zzdiu
            public final void zza(boolean z, Context context, zzczd zzczdVar) throws zzdit {
                zzegm zzegmVar2 = zzegmVar;
                try {
                    ((zzfhg) zzegmVar2.zzb).zzv(z);
                    ((zzfhg) zzegmVar2.zzb).zzz(context);
                } catch (zzfgp e) {
                    throw new zzdit(e.getCause());
                }
            }
        }));
        zzdqnVarZze.zzd().zzo(new zzcpa((zzfhg) zzegmVar.zzb), this.zzb);
        ((zzeif) zzegmVar.zzc).zzc(zzdqnVarZze.zzm());
        return zzdqnVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp {
        try {
            zzfgi zzfgiVar = zzffzVar.zza.zza;
            if (zzfgiVar.zzo.zza == 3) {
                ((zzfhg) zzegmVar.zzb).zzr(this.zza, zzfgiVar.zzd, zzffnVar.zzw.toString(), (zzbqu) zzegmVar.zzc);
            } else {
                ((zzfhg) zzegmVar.zzb).zzq(this.zza, zzfgiVar.zzd, zzffnVar.zzw.toString(), (zzbqu) zzegmVar.zzc);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzegmVar.zza)), e);
        }
    }
}
