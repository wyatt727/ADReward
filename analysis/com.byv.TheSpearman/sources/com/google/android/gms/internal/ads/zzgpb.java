package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgpb {
    private final Class zza;
    private final zzgxm zzb;

    /* synthetic */ zzgpb(Class cls, zzgxm zzgxmVar, zzgpa zzgpaVar) {
        this.zza = cls;
        this.zzb = zzgxmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpb)) {
            return false;
        }
        zzgpb zzgpbVar = (zzgpb) obj;
        return zzgpbVar.zza.equals(this.zza) && zzgpbVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzgxm zzgxmVar = this.zzb;
        return this.zza.getSimpleName() + ", object identifier: " + String.valueOf(zzgxmVar);
    }
}
