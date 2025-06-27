package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgjq extends zzggs {
    private final zzgjr zza;

    private zzgjq(zzgjr zzgjrVar) {
        this.zza = zzgjrVar;
    }

    public static zzgjq zza(zzgjr zzgjrVar) throws GeneralSecurityException {
        return new zzgjq(zzgjrVar);
    }

    public final zzgjr zzb() {
        return this.zza;
    }
}
