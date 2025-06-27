package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzwn implements zzvt {
    private final zzgu zzc;
    private int zzd;
    private final zzwm zze;
    private final zzzs zzf;
    private final zzsd zzg;

    public zzwn(zzgu zzguVar, zzwm zzwmVar) {
        zzsd zzsdVar = new zzsd();
        zzzs zzzsVar = new zzzs();
        this.zzc = zzguVar;
        this.zze = zzwmVar;
        this.zzg = zzsdVar;
        this.zzf = zzzsVar;
        this.zzd = 1048576;
    }

    public final zzwn zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzwp zzb(zzbp zzbpVar) {
        Objects.requireNonNull(zzbpVar.zzd);
        return new zzwp(zzbpVar, this.zzc, this.zze, zzsm.zza, this.zzf, this.zzd, null);
    }
}
