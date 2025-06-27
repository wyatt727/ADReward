package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzja {
    final Context zza;
    String zzb;
    String zzc;
    String zzd;
    Boolean zze;
    long zzf;
    com.google.android.gms.internal.measurement.zzdq zzg;
    boolean zzh;
    Long zzi;
    String zzj;

    public zzja(Context context, com.google.android.gms.internal.measurement.zzdq zzdqVar, Long l) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l;
        if (zzdqVar != null) {
            this.zzg = zzdqVar;
            this.zzb = zzdqVar.zzf;
            this.zzc = zzdqVar.zze;
            this.zzd = zzdqVar.zzd;
            this.zzh = zzdqVar.zzc;
            this.zzf = zzdqVar.zzb;
            this.zzj = zzdqVar.zzh;
            if (zzdqVar.zzg != null) {
                this.zze = Boolean.valueOf(zzdqVar.zzg.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
