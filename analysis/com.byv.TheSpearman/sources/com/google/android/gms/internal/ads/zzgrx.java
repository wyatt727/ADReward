package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgrx {
    private final zzgfv zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzgrx(zzgfv zzgfvVar, int i, String str, String str2, zzgrw zzgrwVar) {
        this.zza = zzgfvVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgrx)) {
            return false;
        }
        zzgrx zzgrxVar = (zzgrx) obj;
        return this.zza == zzgrxVar.zza && this.zzb == zzgrxVar.zzb && this.zzc.equals(zzgrxVar.zzc) && this.zzd.equals(zzgrxVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
