package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzba {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final zzbc zze;
    private final String zzf;

    final zzba zza(zzhm zzhmVar, long j) {
        return new zzba(zzhmVar, this.zzf, this.zza, this.zzb, this.zzc, j, this.zze);
    }

    public final String toString() {
        return "Event{appId='" + this.zza + "', name='" + this.zzb + "', params=" + String.valueOf(this.zze) + "}";
    }

    zzba(zzhm zzhmVar, String str, String str2, String str3, long j, long j2, Bundle bundle) throws IllegalStateException {
        zzbc zzbcVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzf = TextUtils.isEmpty(str) ? null : str;
        this.zzc = j;
        this.zzd = j2;
        if (j2 != 0 && j2 > j) {
            zzhmVar.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId", zzfz.zza(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzhmVar.zzj().zzg().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object objZzb = zzhmVar.zzt().zzb(next, bundle2.get(next));
                    if (objZzb == null) {
                        zzhmVar.zzj().zzu().zza("Param value can't be null", zzhmVar.zzk().zzb(next));
                        it.remove();
                    } else {
                        zzhmVar.zzt().zza(bundle2, next, objZzb);
                    }
                }
            }
            zzbcVar = new zzbc(bundle2);
        } else {
            zzbcVar = new zzbc(new Bundle());
        }
        this.zze = zzbcVar;
    }

    private zzba(zzhm zzhmVar, String str, String str2, String str3, long j, long j2, zzbc zzbcVar) throws IllegalStateException {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbcVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzf = TextUtils.isEmpty(str) ? null : str;
        this.zzc = j;
        this.zzd = j2;
        if (j2 != 0 && j2 > j) {
            zzhmVar.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId, name", zzfz.zza(str2), zzfz.zza(str3));
        }
        this.zze = zzbcVar;
    }
}
