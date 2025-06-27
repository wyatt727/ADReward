package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzglf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zzgxmVarZza = zzgpi.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzgxmVarZza;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzglf.zzd((zzghx) zzggiVar);
            }
        }, zzghx.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzglc
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzglf.zzb((zzgou) zzgoyVar);
            }
        }, zzgxmVarZza, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgld
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzglf.zzc((zzghp) zzgftVar, zzggnVar);
            }
        }, zzghp.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgle
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzglf.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zzgxmVarZza, zzgot.class);
    }

    public static /* synthetic */ zzghp zza(zzgot zzgotVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzgtb zzgtbVarZze = zzgtb.zze(zzgotVar.zze(), zzgzf.zza());
            if (zzgtbVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzghu zzghuVarZzd = zzghx.zzd();
            zzghuVarZzd.zzb(zzgtbVarZze.zzg().zzd());
            zzghuVarZzd.zza(zzgtbVarZze.zzf().zza());
            zzghuVarZzd.zzc(16);
            zzghuVarZzd.zzd(zzf(zzgotVar.zzc()));
            zzghx zzghxVarZze = zzghuVarZzd.zze();
            zzghn zzghnVarZza = zzghp.zza();
            zzghnVarZza.zzc(zzghxVarZze);
            zzghnVarZza.zzb(zzgxn.zzb(zzgtbVarZze.zzg().zzB(), zzggnVar));
            zzghnVarZza.zza(zzgotVar.zzf());
            return zzghnVarZza.zzd();
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzghx zzb(zzgou zzgouVar) throws GeneralSecurityException {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgte zzgteVarZze = zzgte.zze(zzgouVar.zzc().zzh(), zzgzf.zza());
            zzghu zzghuVarZzd = zzghx.zzd();
            zzghuVarZzd.zzb(zzgteVarZze.zza());
            zzghuVarZzd.zza(zzgteVarZze.zzf().zza());
            zzghuVarZzd.zzc(16);
            zzghuVarZzd.zzd(zzf(zzgouVar.zzc().zzg()));
            return zzghuVarZzd.zze();
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzghp zzghpVar, zzggn zzggnVar) {
        zzgta zzgtaVarZzc = zzgtb.zzc();
        zzgtaVarZzc.zzb(zzg(zzghpVar.zzb()));
        byte[] bArrZzd = zzghpVar.zzd().zzd(zzggnVar);
        zzgtaVarZzc.zza(zzgyj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgtb) zzgtaVarZzc.zzbr()).zzaN(), zzguo.SYMMETRIC, zzh(zzghpVar.zzb().zze()), zzghpVar.zze());
    }

    public static /* synthetic */ zzgou zzd(zzghx zzghxVar) {
        zzgut zzgutVarZza = zzguu.zza();
        zzgutVarZza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgtd zzgtdVarZzc = zzgte.zzc();
        zzgtdVarZzc.zzb(zzg(zzghxVar));
        zzgtdVarZzc.zza(zzghxVar.zzc());
        zzgutVarZza.zzc(((zzgte) zzgtdVarZzc.zzbr()).zzaN());
        zzgutVarZza.zza(zzh(zzghxVar.zze()));
        return zzgou.zzb((zzguu) zzgutVarZza.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzghv zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgvvVar.ordinal();
        if (iOrdinal == 1) {
            return zzghv.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzghv.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvvVar.zza());
            }
        }
        return zzghv.zzb;
    }

    private static zzgth zzg(zzghx zzghxVar) throws GeneralSecurityException {
        zzgtg zzgtgVarZzc = zzgth.zzc();
        zzgtgVarZzc.zza(zzghxVar.zzb());
        return (zzgth) zzgtgVarZzc.zzbr();
    }

    private static zzgvv zzh(zzghv zzghvVar) throws GeneralSecurityException {
        if (zzghv.zza.equals(zzghvVar)) {
            return zzgvv.TINK;
        }
        if (zzghv.zzb.equals(zzghvVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzghv.zzc.equals(zzghvVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzghvVar))));
    }
}
