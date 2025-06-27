package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgmi {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zzgxmVarZza = zzgpi.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzgxmVarZza;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgme
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzgmi.zzd((zzgkv) zzggiVar);
            }
        }, zzgkv.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgmf
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzgmi.zzb((zzgou) zzgoyVar);
            }
        }, zzgxmVarZza, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgmg
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzgmi.zzc((zzgkp) zzgftVar, zzggnVar);
            }
        }, zzgkp.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzgmi.zza((zzgot) zzgoyVar, zzggnVar);
            }
        }, zzgxmVarZza, zzgot.class);
    }

    public static /* synthetic */ zzgkp zza(zzgot zzgotVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgwb zzgwbVarZze = zzgwb.zze(zzgotVar.zze(), zzgzf.zza());
            if (zzgwbVarZze.zza() == 0) {
                return zzgkp.zza(zzf(zzgotVar.zzc()), zzgxn.zzb(zzgwbVarZze.zzf().zzB(), zzggnVar), zzgotVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhak unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgkv zzb(zzgou zzgouVar) throws GeneralSecurityException {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            if (zzgwe.zze(zzgouVar.zzc().zzh(), zzgzf.zza()).zza() == 0) {
                return zzgkv.zzc(zzf(zzgouVar.zzc().zzg()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgot zzc(zzgkp zzgkpVar, zzggn zzggnVar) {
        zzgwa zzgwaVarZzc = zzgwb.zzc();
        byte[] bArrZzd = zzgkpVar.zzd().zzd(zzggnVar);
        zzgwaVarZzc.zza(zzgyj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgwb) zzgwaVarZzc.zzbr()).zzaN(), zzguo.SYMMETRIC, zzg(zzgkpVar.zzb().zzb()), zzgkpVar.zze());
    }

    public static /* synthetic */ zzgou zzd(zzgkv zzgkvVar) {
        zzgut zzgutVarZza = zzguu.zza();
        zzgutVarZza.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzgutVarZza.zzc(zzgwe.zzd().zzaN());
        zzgutVarZza.zza(zzg(zzgkvVar.zzb()));
        return zzgou.zzb((zzguu) zzgutVarZza.zzbr());
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }

    private static zzgku zzf(zzgvv zzgvvVar) throws GeneralSecurityException {
        zzgvv zzgvvVar2 = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgvvVar.ordinal();
        if (iOrdinal == 1) {
            return zzgku.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgku.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvvVar.zza());
            }
        }
        return zzgku.zzb;
    }

    private static zzgvv zzg(zzgku zzgkuVar) throws GeneralSecurityException {
        if (zzgku.zza.equals(zzgkuVar)) {
            return zzgvv.TINK;
        }
        if (zzgku.zzb.equals(zzgkuVar)) {
            return zzgvv.CRUNCHY;
        }
        if (zzgku.zzc.equals(zzgkuVar)) {
            return zzgvv.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgkuVar.toString()));
    }
}
