package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeiq implements zzegp {
    private final Context zza;
    private final zzdim zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzeiq(Context context, VersionInfoParcel versionInfoParcel, zzdim zzdimVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdimVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, zzffn zzffnVar, final zzegm zzegmVar) throws zzekh, zzfgp {
        zzdhm zzdhmVarZze = this.zzb.zze(new zzcul(zzffzVar, zzffnVar, zzegmVar.zza), new zzdhp(new zzdiu() { // from class: com.google.android.gms.internal.ads.zzeip
            @Override // com.google.android.gms.internal.ads.zzdiu
            public final void zza(boolean z, Context context, zzczd zzczdVar) throws zzdit {
                this.zza.zzc(zzegmVar, z, context, zzczdVar);
            }
        }, null));
        zzdhmVarZze.zzd().zzo(new zzcpa((zzfhg) zzegmVar.zzb), this.zzd);
        ((zzeif) zzegmVar.zzc).zzc(zzdhmVarZze.zzj());
        return zzdhmVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws JSONException, zzfgp, IOException {
        zzfhg zzfhgVar = (zzfhg) zzegmVar.zzb;
        zzfgi zzfgiVar = zzffzVar.zza.zza;
        zzfhgVar.zzo(this.zza, zzfgiVar.zzd, zzffnVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzl(zzffnVar.zzt), (zzbqu) zzegmVar.zzc);
    }

    final /* synthetic */ void zzc(zzegm zzegmVar, boolean z, Context context, zzczd zzczdVar) throws zzdit {
        try {
            ((zzfhg) zzegmVar.zzb).zzv(z);
            if (this.zzc.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaH)).intValue()) {
                ((zzfhg) zzegmVar.zzb).zzx();
            } else {
                ((zzfhg) zzegmVar.zzb).zzy(context);
            }
        } catch (zzfgp e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Cannot show interstitial.");
            throw new zzdit(e.getCause());
        }
    }
}
