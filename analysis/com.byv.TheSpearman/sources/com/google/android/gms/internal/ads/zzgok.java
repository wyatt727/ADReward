package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgok {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgok(Class cls, Class cls2, zzgoj zzgojVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgok)) {
            return false;
        }
        zzgok zzgokVar = (zzgok) obj;
        return zzgokVar.zza.equals(this.zza) && zzgokVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Class cls = this.zzb;
        return this.zza.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
