package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzglk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zzgxmVarZza = zzgpi.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzgxmVarZza;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzglg
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzglk.zzd((zzgik) zzggiVar);
            }
        }, zzgik.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzglh
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzglk.zzb((zzgou) zzgoyVar);
            }
        }, zzgxmVarZza, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgli
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzglk.zzc((zzgib) zzgftVar, zzggnVar);
            }
        }, zzgib.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzglj
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzglk.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zzgxmVarZza, zzgot.class);
    }

    public static /* synthetic */ zzgib zza(zzgot zzgotVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzgtk zzgtkVarZze = zzgtk.zze(zzgotVar.zze(), zzgzf.zza());
            if (zzgtkVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgih zzgihVarZzc = zzgik.zzc();
            zzgihVarZzc.zzb(zzgtkVarZze.zzf().zzd());
            zzgihVarZzc.zza(12);
            zzgihVarZzc.zzc(16);
            zzgihVarZzc.zzd(zzf(zzgotVar.zzc()));
            zzgik zzgikVarZze = zzgihVarZzc.zze();
            zzghz zzghzVarZza = zzgib.zza();
            zzghzVarZza.zzc(zzgikVarZze);
            zzghzVarZza.zzb(zzgxn.zzb(zzgtkVarZze.zzf().zzB(), zzggnVar));
            zzghzVarZza.zza(zzgotVar.zzf());
            return zzghzVarZza.zzd();
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgik zzb(zzgou zzgouVar) throws GeneralSecurityException {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgtn zzgtnVarZzf = zzgtn.zzf(zzgouVar.zzc().zzh(), zzgzf.zza());
            if (zzgtnVarZzf.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgih zzgihVarZzc = zzgik.zzc();
            zzgihVarZzc.zzb(zzgtnVarZzf.zza());
            zzgihVarZzc.zza(12);
            zzgihVarZzc.zzc(16);
            zzgihVarZzc.zzd(zzf(zzgouVar.zzc().zzg()));
            return zzgihVarZzc.zze();
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzgib zzgibVar, zzggn zzggnVar) {
        zzgtj zzgtjVarZzc = zzgtk.zzc();
        byte[] bArrZzd = zzgibVar.zzd().zzd(zzggnVar);
        zzgtjVarZzc.zza(zzgyj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgtk) zzgtjVarZzc.zzbr()).zzaN(), zzguo.SYMMETRIC, zzg(zzgibVar.zzb().zzd()), zzgibVar.zze());
    }

    public static /* synthetic */ zzgou zzd(zzgik zzgikVar) {
        zzgut zzgutVarZza = zzguu.zza();
        zzgutVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgtm zzgtmVarZzd = zzgtn.zzd();
        zzgtmVarZzd.zza(zzgikVar.zzb());
        zzgutVarZza.zzc(((zzgtn) zzgtmVarZzd.zzbr()).zzaN());
        zzgutVarZza.zza(zzg(zzgikVar.zzd()));
        return zzgou.zzb((zzguu) zzgutVarZza.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzgii zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgvvVar.ordinal();
        if (iOrdinal == 1) {
            return zzgii.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgii.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvvVar.zza());
            }
        }
        return zzgii.zzb;
    }

    private static zzgvv zzg(zzgii zzgiiVar) throws GeneralSecurityException {
        if (zzgii.zza.equals(zzgiiVar)) {
            return zzgvv.TINK;
        }
        if (zzgii.zzb.equals(zzgiiVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzgii.zzc.equals(zzgiiVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgiiVar))));
    }
}
