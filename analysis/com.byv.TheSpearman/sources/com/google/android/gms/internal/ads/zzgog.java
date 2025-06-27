package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzgog {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgog(Class cls, Class cls2, zzgof zzgofVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgog zzb(zzgoe zzgoeVar, Class cls, Class cls2) {
        return new zzgod(cls, cls2, zzgoeVar);
    }

    public abstract Object zza(zzgft zzgftVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
