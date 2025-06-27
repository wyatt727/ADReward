package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzcae {
    static zzcae zza;

    public static synchronized zzcae zzd(Context context) {
        zzcae zzcaeVar = zza;
        if (zzcaeVar != null) {
            return zzcaeVar;
        }
        Context applicationContext = context.getApplicationContext();
        zzbdz.zza(applicationContext);
        com.google.android.gms.ads.internal.util.zzg zzgVarZzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
        zzgVarZzi.zzq(applicationContext);
        zzbzw zzbzwVar = new zzbzw(null);
        zzbzwVar.zzb(applicationContext);
        zzbzwVar.zzc(com.google.android.gms.ads.internal.zzu.zzB());
        zzbzwVar.zza(zzgVarZzi);
        zzbzwVar.zzd(com.google.android.gms.ads.internal.zzu.zzn());
        zzcae zzcaeVarZze = zzbzwVar.zze();
        zza = zzcaeVarZze;
        zzcaeVarZze.zza().zza();
        zzcai zzcaiVarZzc = zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaq)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            Map mapZzv = com.google.android.gms.ads.internal.util.zzt.zzv((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzas));
            Iterator it = mapZzv.keySet().iterator();
            while (it.hasNext()) {
                zzcaiVarZzc.zzc((String) it.next());
            }
            zzcaiVarZzc.zzd(new zzcag(zzcaiVarZzc, mapZzv));
        }
        return zza;
    }

    abstract zzbzp zza();

    abstract zzbzt zzb();

    abstract zzcai zzc();
}
