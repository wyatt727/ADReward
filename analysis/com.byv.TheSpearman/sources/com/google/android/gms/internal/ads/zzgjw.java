package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgjw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgoc zzc;
    private static final zzgny zzd;
    private static final zzgna zze;
    private static final zzgmw zzf;

    static {
        zzgxm zzgxmVarZza = zzgpi.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzgxmVarZza;
        zzc = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                int i = zzgjw.zza;
                zzgut zzgutVarZza = zzguu.zza();
                zzgutVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                zzgvm zzgvmVarZza = zzgvn.zza();
                zzgvmVarZza.zza(((zzgjr) zzggiVar).zzc());
                zzgutVarZza.zzc(((zzgvn) zzgvmVarZza.zzbr()).zzaN());
                zzgutVarZza.zza(zzgvv.RAW);
                return zzgou.zzb((zzguu) zzgutVarZza.zzbr());
            }
        }, zzgjr.class, zzgou.class);
        zzd = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) throws GeneralSecurityException {
                int i = zzgjw.zza;
                zzgou zzgouVar = (zzgou) zzgoyVar;
                if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
                }
                try {
                    zzgvn zzgvnVarZze = zzgvn.zze(((zzgou) zzgoyVar).zzc().zzh(), zzgzf.zza());
                    if (zzgouVar.zzc().zzg() == zzgvv.RAW) {
                        return zzgjr.zzb(zzgvnVarZze.zzf());
                    }
                    throw new GeneralSecurityException("Only key templates with RAW are accepted, but got " + String.valueOf(zzgouVar.zzc().zzg()) + " with format " + String.valueOf(zzgvnVarZze));
                } catch (zzhak e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            }
        }, zzgxmVarZza, zzgou.class);
        zze = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgju
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                int i = zzgjw.zza;
                zzgvj zzgvjVarZzc = zzgvk.zzc();
                zzgvm zzgvmVarZza = zzgvn.zza();
                zzgvmVarZza.zza(((zzgjq) zzgftVar).zzb().zzc());
                zzgvjVarZzc.zza((zzgvn) zzgvmVarZza.zzbr());
                return zzgot.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzgvk) zzgvjVarZzc.zzbr()).zzaN(), zzguo.REMOTE, zzgvv.RAW, null);
            }
        }, zzgjq.class, zzgot.class);
        zzf = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgjv
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) throws GeneralSecurityException {
                int i = zzgjw.zza;
                zzgot zzgotVar = (zzgot) zzgoyVar;
                if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                if (zzgotVar.zzc() != zzgvv.RAW) {
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got ".concat(String.valueOf(String.valueOf(zzgotVar.zzc()))));
                }
                try {
                    zzgvk zzgvkVarZze = zzgvk.zze(((zzgot) zzgoyVar).zze(), zzgzf.zza());
                    if (zzgvkVarZze.zza() == 0) {
                        return zzgjq.zza(zzgjr.zzb(zzgvkVarZze.zzf().zzf()));
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zzgvkVarZze));
                } catch (zzhak e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            }
        }, zzgxmVarZza, zzgot.class);
    }

    public static void zza(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zzc);
        zzgnuVar.zzh(zzd);
        zzgnuVar.zzg(zze);
        zzgnuVar.zzf(zzf);
    }
}
