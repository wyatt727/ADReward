package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdlh {
    zzbif zza;
    zzbic zzb;
    zzbis zzc;
    zzbip zzd;
    zzbnr zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdlh zza(zzbic zzbicVar) {
        this.zzb = zzbicVar;
        return this;
    }

    public final zzdlh zzb(zzbif zzbifVar) {
        this.zza = zzbifVar;
        return this;
    }

    public final zzdlh zzc(String str, zzbil zzbilVar, zzbii zzbiiVar) {
        this.zzf.put(str, zzbilVar);
        if (zzbiiVar != null) {
            this.zzg.put(str, zzbiiVar);
        }
        return this;
    }

    public final zzdlh zzd(zzbnr zzbnrVar) {
        this.zze = zzbnrVar;
        return this;
    }

    public final zzdlh zze(zzbip zzbipVar) {
        this.zzd = zzbipVar;
        return this;
    }

    public final zzdlh zzf(zzbis zzbisVar) {
        this.zzc = zzbisVar;
        return this;
    }

    public final zzdlj zzg() {
        return new zzdlj(this);
    }
}
