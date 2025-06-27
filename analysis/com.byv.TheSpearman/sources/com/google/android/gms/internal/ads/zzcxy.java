package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcxy {
    private Context zza;
    private zzfgi zzb;
    private Bundle zzc;
    private zzfga zzd;
    private zzcxs zze;
    private zzego zzf;

    public final zzcxy zzd(zzego zzegoVar) {
        this.zzf = zzegoVar;
        return this;
    }

    public final zzcxy zze(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcxy zzf(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcxy zzg(zzcxs zzcxsVar) {
        this.zze = zzcxsVar;
        return this;
    }

    public final zzcxy zzh(zzfga zzfgaVar) {
        this.zzd = zzfgaVar;
        return this;
    }

    public final zzcxy zzi(zzfgi zzfgiVar) {
        this.zzb = zzfgiVar;
        return this;
    }

    public final zzcya zzj() {
        return new zzcya(this, null);
    }
}
