package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgne extends zzggi {
    private final zzgou zza;

    public zzgne(zzgou zzgouVar) {
        this.zza = zzgouVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgne)) {
            return false;
        }
        zzgou zzgouVar = ((zzgne) obj).zza;
        return this.zza.zzc().zzg().equals(zzgouVar.zzc().zzg()) && this.zza.zzc().zzi().equals(zzgouVar.zzc().zzi()) && this.zza.zzc().zzh().equals(zzgouVar.zzc().zzh());
    }

    public final int hashCode() {
        zzgou zzgouVar = this.zza;
        return Objects.hash(zzgouVar.zzc(), zzgouVar.zzd());
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzc().zzi();
        zzgvv zzgvvVarZzg = this.zza.zzc().zzg();
        zzgvv zzgvvVar = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgvvVarZzg.ordinal();
        objArr[1] = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgvv.RAW;
    }

    public final zzgou zzb() {
        return this.zza;
    }
}
