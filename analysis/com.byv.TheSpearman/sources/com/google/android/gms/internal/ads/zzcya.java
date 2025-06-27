package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcya {
    private final Context zza;
    private final zzfgi zzb;
    private final Bundle zzc;
    private final zzfga zzd;
    private final zzcxs zze;
    private final zzego zzf;

    /* synthetic */ zzcya(zzcxy zzcxyVar, zzcxz zzcxzVar) {
        this.zza = zzcxyVar.zza;
        this.zzb = zzcxyVar.zzb;
        this.zzc = zzcxyVar.zzc;
        this.zzd = zzcxyVar.zzd;
        this.zze = zzcxyVar.zze;
        this.zzf = zzcxyVar.zzf;
    }

    final Context zza(Context context) {
        return this.zza;
    }

    final Bundle zzb() {
        return this.zzc;
    }

    final zzcxs zzc() {
        return this.zze;
    }

    final zzcxy zzd() {
        zzcxy zzcxyVar = new zzcxy();
        zzcxyVar.zze(this.zza);
        zzcxyVar.zzi(this.zzb);
        zzcxyVar.zzf(this.zzc);
        zzcxyVar.zzg(this.zze);
        zzcxyVar.zzd(this.zzf);
        return zzcxyVar;
    }

    final zzego zze(String str) {
        zzego zzegoVar = this.zzf;
        return zzegoVar != null ? zzegoVar : new zzego(str);
    }

    final zzfga zzf() {
        return this.zzd;
    }

    final zzfgi zzg() {
        return this.zzb;
    }
}
