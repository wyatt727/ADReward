package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgjp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgfu zzb = zzgnb.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgfj.class, zzguo.SYMMETRIC, zzgvq.zzg());
    private static final zzgnj zzc = new zzgnj() { // from class: com.google.android.gms.internal.ads.zzgjn
        @Override // com.google.android.gms.internal.ads.zzgnj
        public final zzgft zza(zzggi zzggiVar, Integer num) throws GeneralSecurityException {
            zzgkc zzgkcVar = (zzgkc) zzggiVar;
            int i = zzgjp.zza;
            if (num == null) {
                return zzgjx.zza(zzgkcVar);
            }
            throw new GeneralSecurityException("Id Requirement is not supported for LegacyKmsEnvelopeAeadKey");
        }
    };
    private static final zzgog zzd = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzgjo
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) throws GeneralSecurityException {
            zzgjx zzgjxVar = (zzgjx) zzgftVar;
            int i = zzgjp.zza;
            try {
                return new zzgjm(zzguu.zzf(zzggp.zzb(zzgjxVar.zzb().zzb()), zzgzf.zza()), zzggg.zza(zzgjxVar.zzb().zzc()).zzb());
            } catch (zzhak e) {
                throw new GeneralSecurityException("Parsing of DEK key template failed: ", e);
            }
        }
    }, zzgjx.class, zzgfj.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgml.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i = zzgkh.zza;
        zzgkh.zze(zzgnu.zzc());
        zzgnk.zzb().zzc(zzc, zzgkc.class);
        zzgnr.zza().zze(zzd);
        zzgms.zzc().zzd(zzb, true);
    }
}
