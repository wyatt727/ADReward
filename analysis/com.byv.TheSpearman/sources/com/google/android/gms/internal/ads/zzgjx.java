package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgjx extends zzggs {
    private final zzgkc zza;

    private zzgjx(zzgkc zzgkcVar) {
        this.zza = zzgkcVar;
    }

    public static zzgjx zza(zzgkc zzgkcVar) throws GeneralSecurityException {
        return new zzgjx(zzgkcVar);
    }

    public final zzgkc zzb() {
        return this.zza;
    }
}
