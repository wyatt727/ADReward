package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzglp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zzgxmVarZza = zzgpi.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzgxmVarZza;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgll
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzglp.zzd((zzgix) zzggiVar);
            }
        }, zzgix.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzglm
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzglp.zzb((zzgou) zzgoyVar);
            }
        }, zzgxmVarZza, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgln
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzglp.zzc((zzgio) zzgftVar, zzggnVar);
            }
        }, zzgio.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzglo
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzglp.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zzgxmVarZza, zzgot.class);
    }

    public static /* synthetic */ zzgio zza(zzgot zzgotVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzgtq zzgtqVarZze = zzgtq.zze(zzgotVar.zze(), zzgzf.zza());
            if (zzgtqVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgiu zzgiuVarZzc = zzgix.zzc();
            zzgiuVarZzc.zza(zzgtqVarZze.zzf().zzd());
            zzgiuVarZzc.zzb(zzf(zzgotVar.zzc()));
            zzgix zzgixVarZzc = zzgiuVarZzc.zzc();
            zzgim zzgimVarZza = zzgio.zza();
            zzgimVarZza.zzc(zzgixVarZzc);
            zzgimVarZza.zzb(zzgxn.zzb(zzgtqVarZze.zzf().zzB(), zzggnVar));
            zzgimVarZza.zza(zzgotVar.zzf());
            return zzgimVarZza.zzd();
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzgix zzb(zzgou zzgouVar) throws GeneralSecurityException {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgtt zzgttVarZzf = zzgtt.zzf(zzgouVar.zzc().zzh(), zzgzf.zza());
            if (zzgttVarZzf.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgiu zzgiuVarZzc = zzgix.zzc();
            zzgiuVarZzc.zza(zzgttVarZzf.zza());
            zzgiuVarZzc.zzb(zzf(zzgouVar.zzc().zzg()));
            return zzgiuVarZzc.zzc();
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzgio zzgioVar, zzggn zzggnVar) {
        zzgtp zzgtpVarZzc = zzgtq.zzc();
        byte[] bArrZzd = zzgioVar.zzd().zzd(zzggnVar);
        zzgtpVarZzc.zza(zzgyj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgtq) zzgtpVarZzc.zzbr()).zzaN(), zzguo.SYMMETRIC, zzg(zzgioVar.zzb().zzd()), zzgioVar.zze());
    }

    public static /* synthetic */ zzgou zzd(zzgix zzgixVar) {
        zzgut zzgutVarZza = zzguu.zza();
        zzgutVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgts zzgtsVarZzd = zzgtt.zzd();
        zzgtsVarZzd.zza(zzgixVar.zzb());
        zzgutVarZza.zzc(((zzgtt) zzgtsVarZzd.zzbr()).zzaN());
        zzgutVarZza.zza(zzg(zzgixVar.zzd()));
        return zzgou.zzb((zzguu) zzgutVarZza.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzgiv zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgvvVar.ordinal();
        if (iOrdinal == 1) {
            return zzgiv.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgiv.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvvVar.zza());
            }
        }
        return zzgiv.zzb;
    }

    private static zzgvv zzg(zzgiv zzgivVar) throws GeneralSecurityException {
        if (zzgiv.zza.equals(zzgivVar)) {
            return zzgvv.TINK;
        }
        if (zzgiv.zzb.equals(zzgivVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzgiv.zzc.equals(zzgivVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgivVar))));
    }
}
