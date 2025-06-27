package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejf implements zzegp {
    private final Context zza;
    private final zzdji zzb;
    private final Executor zzc;

    public zzejf(Context context, zzdji zzdjiVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdjiVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzffz zzffzVar, int i) {
        return zzffzVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzekh, zzfgp {
        zzdky zzdkyVarZzah;
        zzbqz zzbqzVarZzD = ((zzfhg) zzegmVar.zzb).zzD();
        zzbra zzbraVarZzE = ((zzfhg) zzegmVar.zzb).zzE();
        zzbrd zzbrdVarZzd = ((zzfhg) zzegmVar.zzb).zzd();
        if (zzbrdVarZzd != null && zzc(zzffzVar, 6)) {
            zzdkyVarZzah = zzdky.zzt(zzbrdVarZzd);
        } else if (zzbqzVarZzD != null && zzc(zzffzVar, 6)) {
            zzdkyVarZzah = zzdky.zzai(zzbqzVarZzD);
        } else if (zzbqzVarZzD != null && zzc(zzffzVar, 2)) {
            zzdkyVarZzah = zzdky.zzag(zzbqzVarZzD);
        } else if (zzbraVarZzE != null && zzc(zzffzVar, 6)) {
            zzdkyVarZzah = zzdky.zzaj(zzbraVarZzE);
        } else {
            if (zzbraVarZzE == null || !zzc(zzffzVar, 1)) {
                throw new zzekh(1, "No native ad mappers");
            }
            zzdkyVarZzah = zzdky.zzah(zzbraVarZzE);
        }
        zzfgi zzfgiVar = zzffzVar.zza.zza;
        if (!zzfgiVar.zzg.contains(Integer.toString(zzdkyVarZzah.zzc()))) {
            throw new zzekh(1, "No corresponding native ad listener");
        }
        zzdla zzdlaVarZze = this.zzb.zze(new zzcul(zzffzVar, zzffnVar, zzegmVar.zza), new zzdlk(zzdkyVarZzah), new zzdnb(zzbraVarZzE, zzbqzVarZzD, zzbrdVarZzd));
        ((zzeif) zzegmVar.zzc).zzc(zzdlaVarZze.zzj());
        zzdlaVarZze.zzd().zzo(new zzcpa((zzfhg) zzegmVar.zzb), this.zzc);
        return zzdlaVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws JSONException, zzfgp, IOException {
        zzfhg zzfhgVar = (zzfhg) zzegmVar.zzb;
        zzfgi zzfgiVar = zzffzVar.zza.zza;
        String string = zzffnVar.zzw.toString();
        String strZzl = com.google.android.gms.ads.internal.util.zzbw.zzl(zzffnVar.zzt);
        zzbqu zzbquVar = (zzbqu) zzegmVar.zzc;
        zzfgi zzfgiVar2 = zzffzVar.zza.zza;
        zzfhgVar.zzp(this.zza, zzfgiVar.zzd, string, strZzl, zzbquVar, zzfgiVar2.zzi, zzfgiVar2.zzg);
    }
}
