package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgnd extends zzgft {
    private final zzgot zza;

    public zzgnd(zzgot zzgotVar, @Nullable zzggn zzggnVar) throws GeneralSecurityException {
        zzc(zzgotVar, zzggnVar);
        this.zza = zzgotVar;
    }

    private static void zzc(zzgot zzgotVar, @Nullable zzggn zzggnVar) throws GeneralSecurityException {
        int i = zzgnc.zzb[zzgotVar.zzb().ordinal()];
    }

    public final zzgot zza(@Nullable zzggn zzggnVar) throws GeneralSecurityException {
        zzc(this.zza, zzggnVar);
        return this.zza;
    }

    @Nullable
    public final Integer zzb() {
        return this.zza.zzf();
    }
}
