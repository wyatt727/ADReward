package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzehc implements zzegp {
    private final Context zza;
    private final zzcra zzb;

    zzehc(Context context, zzcra zzcraVar) {
        this.zza = context;
        this.zzb = zzcraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzekh, zzfgp {
        zzeio zzeioVar = new zzeio(zzffnVar, (zzbsn) zzegmVar.zzb, AdFormat.APP_OPEN_AD);
        zzcqx zzcqxVarZza = this.zzb.zza(new zzcul(zzffzVar, zzffnVar, zzegmVar.zza), new zzdhp(zzeioVar, null), new zzcqy(zzffnVar.zzab));
        zzeioVar.zzb(zzcqxVarZza.zzc());
        ((zzeif) zzegmVar.zzc).zzc(zzcqxVarZza.zzi());
        return zzcqxVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp {
        try {
            ((zzbsn) zzegmVar.zzb).zzq(zzffnVar.zzaa);
            ((zzbsn) zzegmVar.zzb).zzi(zzffnVar.zzV, zzffnVar.zzw.toString(), zzffzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehb(zzegmVar, null), (zzbqu) zzegmVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfgp(e);
        }
    }
}
