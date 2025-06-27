package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgix extends zzggt {
    private final int zza;
    private final zzgiv zzb;

    /* synthetic */ zzgix(int i, zzgiv zzgivVar, zzgiw zzgiwVar) {
        this.zza = i;
        this.zzb = zzgivVar;
    }

    public static zzgiu zzc() {
        return new zzgiu(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgix)) {
            return false;
        }
        zzgix zzgixVar = (zzgix) obj;
        return zzgixVar.zza == this.zza && zzgixVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgix.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    public final boolean zza() {
        return this.zzb != zzgiv.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgiv zzd() {
        return this.zzb;
    }
}
