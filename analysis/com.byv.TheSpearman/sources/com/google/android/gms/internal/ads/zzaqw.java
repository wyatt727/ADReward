package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaqw {
    public final Object zza;
    public final zzapz zzb;
    public final zzaqz zzc;
    public boolean zzd;

    private zzaqw(zzaqz zzaqzVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzaqzVar;
    }

    private zzaqw(Object obj, zzapz zzapzVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzapzVar;
        this.zzc = null;
    }

    public static zzaqw zza(zzaqz zzaqzVar) {
        return new zzaqw(zzaqzVar);
    }

    public static zzaqw zzb(Object obj, zzapz zzapzVar) {
        return new zzaqw(obj, zzapzVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
