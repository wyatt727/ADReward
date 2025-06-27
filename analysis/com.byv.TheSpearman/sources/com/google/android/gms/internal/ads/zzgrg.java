package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgrg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zzgxmVarZza = zzgpi.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzgxmVarZza;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgrc
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzgrg.zzb((zzgpv) zzggiVar);
            }
        }, zzgpv.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgrd
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzgrg.zzd((zzgou) zzgoyVar);
            }
        }, zzgxmVarZza, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgre
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzgrg.zza((zzgpm) zzgftVar, zzggnVar);
            }
        }, zzgpm.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgrf
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzgrg.zzc((zzgot) zzgoyVar, zzggnVar);
            }
        }, zzgxmVarZza, zzgot.class);
    }

    public static /* synthetic */ zzgot zza(zzgpm zzgpmVar, zzggn zzggnVar) {
        zzgsc zzgscVarZzc = zzgsd.zzc();
        zzgscVarZzc.zzb(zzg(zzgpmVar.zzb()));
        byte[] bArrZzd = zzgpmVar.zzd().zzd(zzggnVar);
        zzgscVarZzc.zza(zzgyj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgsd) zzgscVarZzc.zzbr()).zzaN(), zzguo.SYMMETRIC, zzh(zzgpmVar.zzb().zzf()), zzgpmVar.zze());
    }

    public static /* synthetic */ zzgou zzb(zzgpv zzgpvVar) {
        zzgut zzgutVarZza = zzguu.zza();
        zzgutVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgsf zzgsfVarZzc = zzgsg.zzc();
        zzgsfVarZzc.zzb(zzg(zzgpvVar));
        zzgsfVarZzc.zza(zzgpvVar.zzc());
        zzgutVarZza.zzc(((zzgsg) zzgsfVarZzc.zzbr()).zzaN());
        zzgutVarZza.zza(zzh(zzgpvVar.zzf()));
        return zzgou.zzb((zzguu) zzgutVarZza.zzbr());
    }

    public static /* synthetic */ zzgpm zzc(zzgot zzgotVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzgsd zzgsdVarZze = zzgsd.zze(zzgotVar.zze(), zzgzf.zza());
            if (zzgsdVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgps zzgpsVarZze = zzgpv.zze();
            zzgpsVarZze.zza(zzgsdVarZze.zzg().zzd());
            zzgpsVarZze.zzb(zzgsdVarZze.zzf().zza());
            zzgpsVarZze.zzc(zzf(zzgotVar.zzc()));
            zzgpv zzgpvVarZzd = zzgpsVarZze.zzd();
            zzgpk zzgpkVarZza = zzgpm.zza();
            zzgpkVarZza.zzc(zzgpvVarZzd);
            zzgpkVarZza.zza(zzgxn.zzb(zzgsdVarZze.zzg().zzB(), zzggnVar));
            zzgpkVarZza.zzb(zzgotVar.zzf());
            return zzgpkVarZza.zzd();
        } catch (zzhak | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgpv zzd(zzgou zzgouVar) throws GeneralSecurityException {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgsg zzgsgVarZze = zzgsg.zze(zzgouVar.zzc().zzh(), zzgzf.zza());
            zzgps zzgpsVarZze = zzgpv.zze();
            zzgpsVarZze.zza(zzgsgVarZze.zza());
            zzgpsVarZze.zzb(zzgsgVarZze.zzf().zza());
            zzgpsVarZze.zzc(zzf(zzgouVar.zzc().zzg()));
            return zzgpsVarZze.zzd();
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzgpt zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgvvVar.ordinal();
        if (iOrdinal == 1) {
            return zzgpt.zza;
        }
        if (iOrdinal == 2) {
            return zzgpt.zzc;
        }
        if (iOrdinal == 3) {
            return zzgpt.zzd;
        }
        if (iOrdinal == 4) {
            return zzgpt.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvvVar.zza());
    }

    private static zzgsj zzg(zzgpv zzgpvVar) {
        zzgsi zzgsiVarZzc = zzgsj.zzc();
        zzgsiVarZzc.zza(zzgpvVar.zzb());
        return (zzgsj) zzgsiVarZzc.zzbr();
    }

    private static zzgvv zzh(zzgpt zzgptVar) throws GeneralSecurityException {
        if (zzgpt.zza.equals(zzgptVar)) {
            return zzgvv.TINK;
        }
        if (zzgpt.zzb.equals(zzgptVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzgpt.zzd.equals(zzgptVar)) {
            return zzgvv.RAW;
        }
        if (zzgpt.zzc.equals(zzgptVar)) {
            return zzgvv.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgptVar))));
    }
}
