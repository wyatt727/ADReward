package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzba {
    private final String zza;
    private final long zzb;

    zzba(String str, long j) {
        this.zza = str;
        this.zzb = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (Objects.equal(this.zza, zzbaVar.zza) && Objects.equal(Long.valueOf(this.zzb), Long.valueOf(zzbaVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Long.valueOf(this.zzb));
    }

    public final String zza() {
        return this.zza;
    }
}
