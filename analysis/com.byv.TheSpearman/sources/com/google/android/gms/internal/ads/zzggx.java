package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzggx implements zzggj {
    private static final zzggx zza = new zzggx();
    private static final zzgog zzb = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzggu
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            return zzgmb.zzb((zzgnd) zzgftVar);
        }
    }, zzgnd.class, zzgfj.class);

    zzggx() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzgnr.zza().zzf(zza);
        zzgnr.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final Class zza() {
        return zzgfj.class;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final Class zzb() {
        return zzgfj.class;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final /* synthetic */ Object zzc(zzgos zzgosVar) throws GeneralSecurityException {
        return new zzggw(zzgosVar, null);
    }
}
