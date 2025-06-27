package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzegy implements zzegp {
    private final Context zza;
    private final zzcra zzb;
    private final Executor zzc;

    zzegy(Context context, zzcra zzcraVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcraVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, zzffn zzffnVar, final zzegm zzegmVar) throws zzekh, zzfgp {
        zzcqx zzcqxVarZza = this.zzb.zza(new zzcul(zzffzVar, zzffnVar, zzegmVar.zza), new zzdhp(new zzdiu() { // from class: com.google.android.gms.internal.ads.zzegx
            @Override // com.google.android.gms.internal.ads.zzdiu
            public final void zza(boolean z, Context context, zzczd zzczdVar) throws zzdit {
                zzegm zzegmVar2 = zzegmVar;
                try {
                    ((zzfhg) zzegmVar2.zzb).zzv(z);
                    ((zzfhg) zzegmVar2.zzb).zzw(context);
                } catch (zzfgp e) {
                    throw new zzdit(e.getCause());
                }
            }
        }, null), new zzcqy(zzffnVar.zzab));
        zzcqxVarZza.zzd().zzo(new zzcpa((zzfhg) zzegmVar.zzb), this.zzc);
        ((zzeif) zzegmVar.zzc).zzc(zzcqxVarZza.zzj());
        return zzcqxVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp {
        zzfhg zzfhgVar = (zzfhg) zzegmVar.zzb;
        zzfgi zzfgiVar = zzffzVar.zza.zza;
        zzfhgVar.zzl(this.zza, zzfgiVar.zzd, zzffnVar.zzw.toString(), (zzbqu) zzegmVar.zzc);
    }
}
