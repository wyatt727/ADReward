package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgrj implements zzgpw {
    private final zzgqd zza;

    public zzgrj(zzgqd zzgqdVar) throws GeneralSecurityException {
        if (!zzgml.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzgqdVar;
    }
}
