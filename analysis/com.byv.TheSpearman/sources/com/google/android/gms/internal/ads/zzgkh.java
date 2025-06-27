package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgkh {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zzgxmVarZza = zzgpi.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzgxmVarZza;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgkd
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzgkh.zzd((zzgkc) zzggiVar);
            }
        }, zzgkc.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgke
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzgkh.zzb((zzgou) zzgoyVar);
            }
        }, zzgxmVarZza, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgkf
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzgkh.zzc((zzgjx) zzgftVar, zzggnVar);
            }
        }, zzgjx.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgkg
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzgkh.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zzgxmVarZza, zzgot.class);
    }

    public static /* synthetic */ zzgjx zza(zzgot zzgotVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzgvq zzgvqVarZze = zzgvq.zze(zzgotVar.zze(), zzgzf.zza());
            if (zzgotVar.zzc() != zzgvv.RAW) {
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with OutputPrefixType RAW, got " + String.valueOf(zzgvqVarZze));
            }
            if (zzgvqVarZze.zza() == 0) {
                return zzgjx.zza(zzf(zzgvqVarZze.zzf()));
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(zzgvqVarZze));
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzgkc zzb(zzgou zzgouVar) throws GeneralSecurityException {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            return zzf(zzgvt.zzf(zzgouVar.zzc().zzh(), zzgzf.zza()));
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzgjx zzgjxVar, zzggn zzggnVar) {
        zzgvp zzgvpVarZzc = zzgvq.zzc();
        zzgvpVarZzc.zza(zzg(zzgjxVar.zzb()));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgvq) zzgvpVarZzc.zzbr()).zzaN(), zzguo.REMOTE, zzgvv.RAW, null);
    }

    public static /* synthetic */ zzgou zzd(zzgkc zzgkcVar) {
        zzgut zzgutVarZza = zzguu.zza();
        zzgutVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzgutVarZza.zzc(zzg(zzgkcVar).zzaN());
        zzgutVarZza.zza(zzgvv.RAW);
        return zzgou.zzb((zzguu) zzgutVarZza.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzgkc zzf(zzgvt zzgvtVar) throws GeneralSecurityException {
        zzgka zzgkaVar;
        zzgut zzgutVarZza = zzguu.zza();
        zzgutVarZza.zzb(zzgvtVar.zza().zzi());
        zzgutVarZza.zzc(zzgvtVar.zza().zzh());
        zzgutVarZza.zza(zzgvv.RAW);
        zzggi zzggiVarZza = zzggp.zza(((zzguu) zzgutVarZza.zzbr()).zzaV());
        if (zzggiVarZza instanceof zzgik) {
            zzgkaVar = zzgka.zza;
        } else if (zzggiVarZza instanceof zzgjd) {
            zzgkaVar = zzgka.zzc;
        } else if (zzggiVarZza instanceof zzgkv) {
            zzgkaVar = zzgka.zzb;
        } else if (zzggiVarZza instanceof zzghl) {
            zzgkaVar = zzgka.zzd;
        } else if (zzggiVarZza instanceof zzghx) {
            zzgkaVar = zzgka.zze;
        } else {
            if (!(zzggiVarZza instanceof zzgix)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzggiVarZza.toString()));
            }
            zzgkaVar = zzgka.zzf;
        }
        zzgjz zzgjzVar = new zzgjz(null);
        zzgjzVar.zzc(zzgvtVar.zzg());
        zzgjzVar.zza((zzggt) zzggiVarZza);
        zzgjzVar.zzb(zzgkaVar);
        return zzgjzVar.zzd();
    }

    private static zzgvt zzg(zzgkc zzgkcVar) throws GeneralSecurityException {
        try {
            zzguu zzguuVarZzf = zzguu.zzf(zzggp.zzb(zzgkcVar.zzb()), zzgzf.zza());
            zzgvs zzgvsVarZzc = zzgvt.zzc();
            zzgvsVarZzc.zzb(zzgkcVar.zzc());
            zzgvsVarZzc.zza(zzguuVarZzf);
            return (zzgvt) zzgvsVarZzc.zzbr();
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }
}
