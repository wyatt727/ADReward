package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeiu implements zzegp {
    private final Context zza;
    private final zzdim zzb;

    public zzeiu(Context context, zzdim zzdimVar) {
        this.zza = context;
        this.zzb = zzdimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzekh, zzfgp {
        zzeio zzeioVar = new zzeio(zzffnVar, (zzbsn) zzegmVar.zzb, AdFormat.INTERSTITIAL);
        zzdhm zzdhmVarZze = this.zzb.zze(new zzcul(zzffzVar, zzffnVar, zzegmVar.zza), new zzdhp(zzeioVar, null));
        zzeioVar.zzb(zzdhmVarZze.zzc());
        ((zzeif) zzegmVar.zzc).zzc(zzdhmVarZze.zzi());
        return zzdhmVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp {
        try {
            ((zzbsn) zzegmVar.zzb).zzq(zzffnVar.zzaa);
            ((zzbsn) zzegmVar.zzb).zzl(zzffnVar.zzV, zzffnVar.zzw.toString(), zzffzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeit(this, zzegmVar, null), (zzbqu) zzegmVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfgp(e);
        }
    }
}
