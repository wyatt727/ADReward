package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeku implements zzegp {
    private final Context zza;
    private final zzdqr zzb;

    public zzeku(Context context, zzdqr zzdqrVar) {
        this.zza = context;
        this.zzb = zzdqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzekh, zzfgp {
        zzeio zzeioVar = new zzeio(zzffnVar, (zzbsn) zzegmVar.zzb, AdFormat.REWARDED);
        zzdqn zzdqnVarZze = this.zzb.zze(new zzcul(zzffzVar, zzffnVar, zzegmVar.zza), new zzdqo(zzeioVar));
        zzeioVar.zzb(zzdqnVarZze.zzc());
        ((zzeif) zzegmVar.zzc).zzc(zzdqnVarZze.zzn());
        return zzdqnVarZze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp {
        try {
            ((zzbsn) zzegmVar.zzb).zzq(zzffnVar.zzaa);
            if (zzffzVar.zza.zza.zzo.zza == 3) {
                ((zzbsn) zzegmVar.zzb).zzo(zzffnVar.zzV, zzffnVar.zzw.toString(), zzffzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzekt(this, zzegmVar, null), (zzbqu) zzegmVar.zzc);
            } else {
                ((zzbsn) zzegmVar.zzb).zzp(zzffnVar.zzV, zzffnVar.zzw.toString(), zzffzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzekt(this, zzegmVar, null), (zzbqu) zzegmVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
