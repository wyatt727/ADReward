package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgjl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgog zzb = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzgjj
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            int i = zzgjl.zza;
            return zzggg.zza(((zzgjq) zzgftVar).zzb().zzc()).zzb();
        }
    }, zzgjq.class, zzgfj.class);
    private static final zzgfu zzc = zzgnb.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgfj.class, zzguo.REMOTE, zzgvk.zzg());
    private static final zzgnj zzd = new zzgnj() { // from class: com.google.android.gms.internal.ads.zzgjk
        @Override // com.google.android.gms.internal.ads.zzgnj
        public final zzgft zza(zzggi zzggiVar, Integer num) throws GeneralSecurityException {
            zzgjr zzgjrVar = (zzgjr) zzggiVar;
            int i = zzgjl.zza;
            if (num == null) {
                return zzgjq.zza(zzgjrVar);
            }
            throw new GeneralSecurityException("Id Requirement is not supported for LegacyKmsEnvelopeAeadKey");
        }
    };

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgml.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i = zzgjw.zza;
        zzgjw.zza(zzgnu.zzc());
        zzgnr.zza().zze(zzb);
        zzgnk.zzb().zzc(zzd, zzgjr.class);
        zzgms.zzc().zzd(zzc, true);
    }
}
