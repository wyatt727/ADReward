package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgrz {
    private final zzgrs zza;
    private final List zzb;

    @Nullable
    private final Integer zzc;

    /* synthetic */ zzgrz(zzgrs zzgrsVar, List list, Integer num, zzgry zzgryVar) {
        this.zza = zzgrsVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgrz)) {
            return false;
        }
        zzgrz zzgrzVar = (zzgrz) obj;
        return this.zza.equals(zzgrzVar.zza) && this.zzb.equals(zzgrzVar.zzb) && Objects.equals(this.zzc, zzgrzVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
