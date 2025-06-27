package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgkv extends zzggt {
    private final zzgku zza;

    private zzgkv(zzgku zzgkuVar) {
        this.zza = zzgkuVar;
    }

    public static zzgkv zzc(zzgku zzgkuVar) {
        return new zzgkv(zzgkuVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgkv) && ((zzgkv) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgkv.class, this.zza);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    public final boolean zza() {
        return this.zza != zzgku.zzc;
    }

    public final zzgku zzb() {
        return this.zza;
    }
}
