package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzctn {
    private final zzdbf zza;
    private final zzddm zzb;

    public zzctn(zzdbf zzdbfVar, zzddm zzddmVar) {
        this.zza = zzdbfVar;
        this.zzb = zzddmVar;
    }

    public final zzdbf zza() {
        return this.zza;
    }

    final zzddm zzb() {
        return this.zzb;
    }

    final zzdgf zzc() {
        zzddm zzddmVar = this.zzb;
        return zzddmVar != null ? new zzdgf(zzddmVar, zzcbr.zzf) : new zzdgf(new zzctm(this), zzcbr.zzf);
    }
}
