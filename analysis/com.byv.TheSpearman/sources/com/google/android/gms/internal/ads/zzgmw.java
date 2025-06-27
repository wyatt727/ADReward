package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzgmw {
    private final zzgxm zza;
    private final Class zzb;

    /* synthetic */ zzgmw(zzgxm zzgxmVar, Class cls, zzgmv zzgmvVar) {
        this.zza = zzgxmVar;
        this.zzb = cls;
    }

    public static zzgmw zzb(zzgmu zzgmuVar, zzgxm zzgxmVar, Class cls) {
        return new zzgmt(zzgxmVar, cls, zzgmuVar);
    }

    public abstract zzgft zza(zzgoy zzgoyVar, @Nullable zzggn zzggnVar) throws GeneralSecurityException;

    public final zzgxm zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
