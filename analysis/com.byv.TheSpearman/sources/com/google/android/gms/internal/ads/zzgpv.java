package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgpv extends zzgqr {
    private final int zza;
    private final int zzb;
    private final zzgpt zzc;

    /* synthetic */ zzgpv(int i, int i2, zzgpt zzgptVar, zzgpu zzgpuVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgptVar;
    }

    public static zzgps zze() {
        return new zzgps(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpv)) {
            return false;
        }
        zzgpv zzgpvVar = (zzgpv) obj;
        return zzgpvVar.zza == this.zza && zzgpvVar.zzd() == zzd() && zzgpvVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzgpv.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    public final boolean zza() {
        return this.zzc != zzgpt.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgpt zzgptVar = this.zzc;
        if (zzgptVar == zzgpt.zzd) {
            return this.zzb;
        }
        if (zzgptVar == zzgpt.zza || zzgptVar == zzgpt.zzb || zzgptVar == zzgpt.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgpt zzf() {
        return this.zzc;
    }
}
