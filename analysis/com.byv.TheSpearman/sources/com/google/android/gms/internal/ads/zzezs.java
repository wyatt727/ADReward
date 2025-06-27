package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzezs {
    private final zzbxd zza;
    private final int zzb;

    public zzezs(zzbxd zzbxdVar, int i) {
        this.zza = zzbxdVar;
        this.zzb = i;
    }

    public final int zza() {
        return this.zzb;
    }

    public final PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final String zzc() {
        return this.zza.zzd;
    }

    public final String zzd() {
        return zzfxg.zzc(this.zza.zza.getString("ms"));
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final List zzf() {
        return this.zza.zze;
    }

    final boolean zzg() {
        return this.zza.zzl;
    }

    final boolean zzh() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    final boolean zzi() {
        return this.zza.zzk;
    }
}
