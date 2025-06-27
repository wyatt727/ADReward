package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgla {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zzgxmVarZza = zzgpi.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzgxmVarZza;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgkw
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzgla.zzd((zzghl) zzggiVar);
            }
        }, zzghl.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgkx
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzgla.zzb((zzgou) zzgoyVar);
            }
        }, zzgxmVarZza, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgky
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzgla.zzc((zzghb) zzgftVar, zzggnVar);
            }
        }, zzghb.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgkz
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzgla.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zzgxmVarZza, zzgot.class);
    }

    public static /* synthetic */ zzghb zza(zzgot zzgotVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgsm zzgsmVarZze = zzgsm.zze(zzgotVar.zze(), zzgzf.zza());
            if (zzgsmVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzgsmVarZze.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzgsmVarZze.zzg().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzghh zzghhVarZzf = zzghl.zzf();
            zzghhVarZzf.zza(zzgsmVarZze.zzf().zzg().zzd());
            zzghhVarZzf.zzc(zzgsmVarZze.zzg().zzh().zzd());
            zzghhVarZzf.zzd(zzgsmVarZze.zzf().zzf().zza());
            zzghhVarZzf.zze(zzgsmVarZze.zzg().zzg().zza());
            zzghhVarZzf.zzb(zzf(zzgsmVarZze.zzg().zzg().zzc()));
            zzghhVarZzf.zzf(zzg(zzgotVar.zzc()));
            zzghl zzghlVarZzg = zzghhVarZzf.zzg();
            zzggz zzggzVarZza = zzghb.zza();
            zzggzVarZza.zzd(zzghlVarZzg);
            zzggzVarZza.zza(zzgxn.zzb(zzgsmVarZze.zzf().zzg().zzB(), zzggnVar));
            zzggzVarZza.zzb(zzgxn.zzb(zzgsmVarZze.zzg().zzh().zzB(), zzggnVar));
            zzggzVarZza.zzc(zzgotVar.zzf());
            return zzggzVarZza.zze();
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzghl zzb(zzgou zzgouVar) throws GeneralSecurityException {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgsp zzgspVarZzd = zzgsp.zzd(zzgouVar.zzc().zzh(), zzgzf.zza());
            if (zzgspVarZzd.zzf().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzghh zzghhVarZzf = zzghl.zzf();
            zzghhVarZzf.zza(zzgspVarZzd.zze().zza());
            zzghhVarZzf.zzc(zzgspVarZzd.zzf().zza());
            zzghhVarZzf.zzd(zzgspVarZzd.zze().zzf().zza());
            zzghhVarZzf.zze(zzgspVarZzd.zzf().zzh().zza());
            zzghhVarZzf.zzb(zzf(zzgspVarZzd.zzf().zzh().zzc()));
            zzghhVarZzf.zzf(zzg(zzgouVar.zzc().zzg()));
            return zzghhVarZzf.zzg();
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzghb zzghbVar, zzggn zzggnVar) {
        zzgsl zzgslVarZzc = zzgsm.zzc();
        zzgsr zzgsrVarZzc = zzgss.zzc();
        zzgsx zzgsxVarZzc = zzgsy.zzc();
        zzgsxVarZzc.zza(zzghbVar.zzb().zzd());
        zzgsrVarZzc.zzb((zzgsy) zzgsxVarZzc.zzbr());
        byte[] bArrZzd = zzghbVar.zzd().zzd(zzggnVar);
        zzgsrVarZzc.zza(zzgyj.zzv(bArrZzd, 0, bArrZzd.length));
        zzgslVarZzc.zza((zzgss) zzgsrVarZzc.zzbr());
        zzgud zzgudVarZzc = zzgue.zzc();
        zzgudVarZzc.zzb(zzh(zzghbVar.zzb()));
        byte[] bArrZzd2 = zzghbVar.zze().zzd(zzggnVar);
        zzgudVarZzc.zza(zzgyj.zzv(bArrZzd2, 0, bArrZzd2.length));
        zzgslVarZzc.zzb((zzgue) zzgudVarZzc.zzbr());
        return zzgot.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgsm) zzgslVarZzc.zzbr()).zzaN(), zzguo.SYMMETRIC, zzi(zzghbVar.zzb().zzh()), zzghbVar.zzf());
    }

    public static /* synthetic */ zzgou zzd(zzghl zzghlVar) {
        zzgut zzgutVarZza = zzguu.zza();
        zzgutVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgso zzgsoVarZza = zzgsp.zza();
        zzgsu zzgsuVarZzc = zzgsv.zzc();
        zzgsx zzgsxVarZzc = zzgsy.zzc();
        zzgsxVarZzc.zza(zzghlVar.zzd());
        zzgsuVarZzc.zzb((zzgsy) zzgsxVarZzc.zzbr());
        zzgsuVarZzc.zza(zzghlVar.zzb());
        zzgsoVarZza.zza((zzgsv) zzgsuVarZzc.zzbr());
        zzgug zzgugVarZzd = zzguh.zzd();
        zzgugVarZzd.zzb(zzh(zzghlVar));
        zzgugVarZzd.zza(zzghlVar.zzc());
        zzgsoVarZza.zzb((zzguh) zzgugVarZzd.zzbr());
        zzgutVarZza.zzc(((zzgsp) zzgsoVarZza.zzbr()).zzaN());
        zzgutVarZza.zza(zzi(zzghlVar.zzh()));
        return zzgou.zzb((zzguu) zzgutVarZza.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzghi zzf(zzgub zzgubVar) throws GeneralSecurityException {
        zzgub zzgubVar2 = zzgub.UNKNOWN_HASH;
        zzgvv zzgvvVar = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgubVar.ordinal();
        if (iOrdinal == 1) {
            return zzghi.zza;
        }
        if (iOrdinal == 2) {
            return zzghi.zzd;
        }
        if (iOrdinal == 3) {
            return zzghi.zzc;
        }
        if (iOrdinal == 4) {
            return zzghi.zze;
        }
        if (iOrdinal == 5) {
            return zzghi.zzb;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzgubVar.zza());
    }

    private static zzghj zzg(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgub zzgubVar = zzgub.UNKNOWN_HASH;
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgvvVar.ordinal();
        if (iOrdinal == 1) {
            return zzghj.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzghj.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvvVar.zza());
            }
        }
        return zzghj.zzb;
    }

    private static zzguk zzh(zzghl zzghlVar) throws GeneralSecurityException {
        zzgub zzgubVar;
        zzguj zzgujVarZzd = zzguk.zzd();
        zzgujVarZzd.zzb(zzghlVar.zze());
        zzghi zzghiVarZzg = zzghlVar.zzg();
        if (zzghi.zza.equals(zzghiVarZzg)) {
            zzgubVar = zzgub.SHA1;
        } else if (zzghi.zzb.equals(zzghiVarZzg)) {
            zzgubVar = zzgub.SHA224;
        } else if (zzghi.zzc.equals(zzghiVarZzg)) {
            zzgubVar = zzgub.SHA256;
        } else if (zzghi.zzd.equals(zzghiVarZzg)) {
            zzgubVar = zzgub.SHA384;
        } else {
            if (!zzghi.zze.equals(zzghiVarZzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(zzghiVarZzg))));
            }
            zzgubVar = zzgub.SHA512;
        }
        zzgujVarZzd.zza(zzgubVar);
        return (zzguk) zzgujVarZzd.zzbr();
    }

    private static zzgvv zzi(zzghj zzghjVar) throws GeneralSecurityException {
        if (zzghj.zza.equals(zzghjVar)) {
            return zzgvv.TINK;
        }
        if (zzghj.zzb.equals(zzghjVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzghj.zzc.equals(zzghjVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzghjVar))));
    }
}
