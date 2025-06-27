package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgqv implements zzggj {
    private static final zzgqv zza = new zzgqv();
    private static final zzgog zzb = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzgqs
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            return zzgrp.zza((zzgnd) zzgftVar);
        }
    }, zzgnd.class, zzggh.class);

    zzgqv() {
    }

    static void zzd() throws GeneralSecurityException {
        zzgnr.zza().zzf(zza);
        zzgnr.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final Class zza() {
        return zzggh.class;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final Class zzb() {
        return zzggh.class;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final /* synthetic */ Object zzc(zzgos zzgosVar) throws GeneralSecurityException {
        return new zzgqu(zzgosVar, null);
    }
}
