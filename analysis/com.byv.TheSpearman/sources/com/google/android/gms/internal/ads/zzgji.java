package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgji {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zzgxmVarZza = zzgpi.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzgxmVarZza;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgje
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzgji.zzd((zzgjd) zzggiVar);
            }
        }, zzgjd.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgjf
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzgji.zzb((zzgou) zzgoyVar);
            }
        }, zzgxmVarZza, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgjg
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzgji.zzc((zzgiy) zzgftVar, zzggnVar);
            }
        }, zzgiy.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgjh
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzgji.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zzgxmVarZza, zzgot.class);
    }

    public static /* synthetic */ zzgiy zza(zzgot zzgotVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgtw zzgtwVarZze = zzgtw.zze(zzgotVar.zze(), zzgzf.zza());
            if (zzgtwVarZze.zza() == 0) {
                return zzgiy.zza(zzf(zzgotVar.zzc()), zzgxn.zzb(zzgtwVarZze.zzf().zzB(), zzggnVar), zzgotVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgjd zzb(zzgou zzgouVar) throws GeneralSecurityException {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzgtz.zzd(zzgouVar.zzc().zzh(), zzgzf.zza());
            return zzgjd.zzc(zzf(zzgouVar.zzc().zzg()));
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzgiy zzgiyVar, zzggn zzggnVar) {
        zzgtv zzgtvVarZzc = zzgtw.zzc();
        byte[] bArrZzd = zzgiyVar.zzd().zzd(zzggnVar);
        zzgtvVarZzc.zza(zzgyj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgtw) zzgtvVarZzc.zzbr()).zzaN(), zzguo.SYMMETRIC, zzg(zzgiyVar.zzb().zzb()), zzgiyVar.zze());
    }

    public static /* synthetic */ zzgou zzd(zzgjd zzgjdVar) {
        zzgut zzgutVarZza = zzguu.zza();
        zzgutVarZza.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzgutVarZza.zzc(zzgtz.zzc().zzaN());
        zzgutVarZza.zza(zzg(zzgjdVar.zzb()));
        return zzgou.zzb((zzguu) zzgutVarZza.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzgjc zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgvvVar.ordinal();
        if (iOrdinal == 1) {
            return zzgjc.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgjc.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvvVar.zza());
            }
        }
        return zzgjc.zzb;
    }

    private static zzgvv zzg(zzgjc zzgjcVar) throws GeneralSecurityException {
        if (zzgjc.zza.equals(zzgjcVar)) {
            return zzgvv.TINK;
        }
        if (zzgjc.zzb.equals(zzgjcVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzgjc.zzc.equals(zzgjcVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgjcVar.toString()));
    }
}
