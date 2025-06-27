package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzghx extends zzggt {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzghv zzd;

    /* synthetic */ zzghx(int i, int i2, int i3, zzghv zzghvVar, zzghw zzghwVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzghvVar;
    }

    public static zzghu zzd() {
        return new zzghu(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghx)) {
            return false;
        }
        zzghx zzghxVar = (zzghx) obj;
        if (zzghxVar.zza == this.zza && zzghxVar.zzb == this.zzb) {
            int i = zzghxVar.zzc;
            if (zzghxVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzghx.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    public final boolean zza() {
        return this.zzd != zzghv.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzghv zze() {
        return this.zzd;
    }
}
