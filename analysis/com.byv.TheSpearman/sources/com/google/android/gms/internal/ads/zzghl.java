package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzghl extends zzggt {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzghj zze;
    private final zzghi zzf;

    /* synthetic */ zzghl(int i, int i2, int i3, int i4, zzghj zzghjVar, zzghi zzghiVar, zzghk zzghkVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzghjVar;
        this.zzf = zzghiVar;
    }

    public static zzghh zzf() {
        return new zzghh(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghl)) {
            return false;
        }
        zzghl zzghlVar = (zzghl) obj;
        return zzghlVar.zza == this.zza && zzghlVar.zzb == this.zzb && zzghlVar.zzc == this.zzc && zzghlVar.zzd == this.zzd && zzghlVar.zze == this.zze && zzghlVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzghl.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzghi zzghiVar = this.zzf;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.zze) + ", hashType: " + String.valueOf(zzghiVar) + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    public final boolean zza() {
        return this.zze != zzghj.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzghi zzg() {
        return this.zzf;
    }

    public final zzghj zzh() {
        return this.zze;
    }
}
