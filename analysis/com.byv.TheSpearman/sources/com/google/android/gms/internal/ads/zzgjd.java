package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgjd extends zzggt {
    private final zzgjc zza;

    private zzgjd(zzgjc zzgjcVar) {
        this.zza = zzgjcVar;
    }

    public static zzgjd zzc(zzgjc zzgjcVar) {
        return new zzgjd(zzgjcVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgjd) && ((zzgjd) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgjd.class, this.zza);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    public final boolean zza() {
        return this.zza != zzgjc.zzc;
    }

    public final zzgjc zzb() {
        return this.zza;
    }
}
