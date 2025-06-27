package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgik extends zzggt {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgii zzd;

    /* synthetic */ zzgik(int i, int i2, int i3, zzgii zzgiiVar, zzgij zzgijVar) {
        this.zza = i;
        this.zzd = zzgiiVar;
    }

    public static zzgih zzc() {
        return new zzgih(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgik)) {
            return false;
        }
        zzgik zzgikVar = (zzgik) obj;
        if (zzgikVar.zza == this.zza) {
            int i = zzgikVar.zzb;
            int i2 = zzgikVar.zzc;
            if (zzgikVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzgik.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.zzd) + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    public final boolean zza() {
        return this.zzd != zzgii.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgii zzd() {
        return this.zzd;
    }
}
