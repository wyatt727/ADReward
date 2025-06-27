package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgqo extends zzgqr {
    private final int zza;
    private final int zzb;
    private final zzgqm zzc;
    private final zzgql zzd;

    /* synthetic */ zzgqo(int i, int i2, zzgqm zzgqmVar, zzgql zzgqlVar, zzgqn zzgqnVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgqmVar;
        this.zzd = zzgqlVar;
    }

    public static zzgqk zze() {
        return new zzgqk(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgqo)) {
            return false;
        }
        zzgqo zzgqoVar = (zzgqo) obj;
        return zzgqoVar.zza == this.zza && zzgqoVar.zzd() == zzd() && zzgqoVar.zzc == this.zzc && zzgqoVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgqo.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzgql zzgqlVar = this.zzd;
        return "HMAC Parameters (variant: " + String.valueOf(this.zzc) + ", hashType: " + String.valueOf(zzgqlVar) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    public final boolean zza() {
        return this.zzc != zzgqm.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgqm zzgqmVar = this.zzc;
        if (zzgqmVar == zzgqm.zzd) {
            return this.zzb;
        }
        if (zzgqmVar == zzgqm.zza || zzgqmVar == zzgqm.zzb || zzgqmVar == zzgqm.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgql zzf() {
        return this.zzd;
    }

    public final zzgqm zzg() {
        return this.zzc;
    }
}
