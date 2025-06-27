package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgqp {

    @Deprecated
    static final zzgvy zza;

    @Deprecated
    static final zzgvy zzb;

    @Deprecated
    static final zzgvy zzc;

    static {
        zzgvy zzgvyVarZzc = zzgvy.zzc();
        zza = zzgvyVarZzc;
        zzb = zzgvyVarZzc;
        zzc = zzgvyVarZzc;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgqv.zzd();
        zzgpz.zzd();
        zzgqi.zza(true);
        if (zzgmm.zzb()) {
            return;
        }
        zzgpq.zzd(true);
    }
}
