package com.google.android.gms.internal.ads;

import com.json.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzvv implements zzyz {
    private final zzyz zza;
    private final zzcz zzb;

    public zzvv(zzyz zzyzVar, zzcz zzczVar) {
        this.zza = zzyzVar;
        this.zzb = zzczVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvv)) {
            return false;
        }
        zzvv zzvvVar = (zzvv) obj;
        return this.zza.equals(zzvvVar.zza) && this.zzb.equals(zzvvVar.zzb);
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final int zza(int i) {
        return this.zza.zza(i);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final int zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final zzam zzd(int i) {
        return this.zzb.zzb(this.zza.zza(i));
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final zzcz zze() {
        return this.zzb;
    }
}
