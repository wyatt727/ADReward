package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzgna {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgna(Class cls, Class cls2, zzgmz zzgmzVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgna zzb(zzgmy zzgmyVar, Class cls, Class cls2) {
        return new zzgmx(cls, cls2, zzgmyVar);
    }

    public abstract zzgoy zza(zzgft zzgftVar, @Nullable zzggn zzggnVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
