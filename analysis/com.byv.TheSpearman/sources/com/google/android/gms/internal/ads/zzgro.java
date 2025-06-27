package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgro {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxm zzb;
    private static final zzgmq zzc;
    private static final zzgmq zzd;
    private static final zzgoc zze;
    private static final zzgny zzf;
    private static final zzgna zzg;
    private static final zzgmw zzh;

    static {
        zzgxm zzgxmVarZza = zzgpi.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzgxmVarZza;
        zzgmo zzgmoVarZza = zzgmq.zza();
        zzgmoVarZza.zza(zzgvv.RAW, zzgqm.zzd);
        zzgmoVarZza.zza(zzgvv.TINK, zzgqm.zza);
        zzgmoVarZza.zza(zzgvv.LEGACY, zzgqm.zzc);
        zzgmoVarZza.zza(zzgvv.CRUNCHY, zzgqm.zzb);
        zzc = zzgmoVarZza.zzb();
        zzgmo zzgmoVarZza2 = zzgmq.zza();
        zzgmoVarZza2.zza(zzgub.SHA1, zzgql.zza);
        zzgmoVarZza2.zza(zzgub.SHA224, zzgql.zzb);
        zzgmoVarZza2.zza(zzgub.SHA256, zzgql.zzc);
        zzgmoVarZza2.zza(zzgub.SHA384, zzgql.zzd);
        zzgmoVarZza2.zza(zzgub.SHA512, zzgql.zze);
        zzd = zzgmoVarZza2.zzb();
        zze = zzgoc.zzb(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzgrk
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final zzgoy zza(zzggi zzggiVar) {
                return zzgro.zzb((zzgqo) zzggiVar);
            }
        }, zzgqo.class, zzgou.class);
        zzf = zzgny.zzb(new zzgnw() { // from class: com.google.android.gms.internal.ads.zzgrl
            @Override // com.google.android.gms.internal.ads.zzgnw
            public final zzggi zza(zzgoy zzgoyVar) {
                return zzgro.zzd((zzgou) zzgoyVar);
            }
        }, zzgxmVarZza, zzgou.class);
        zzg = zzgna.zzb(new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgrm
            @Override // com.google.android.gms.internal.ads.zzgmy
            public final zzgoy zza(zzgft zzgftVar, zzggn zzggnVar) {
                return zzgro.zza((zzgqd) zzgftVar, zzggnVar);
            }
        }, zzgqd.class, zzgot.class);
        zzh = zzgmw.zzb(new zzgmu() { // from class: com.google.android.gms.internal.ads.zzgrn
            @Override // com.google.android.gms.internal.ads.zzgmu
            public final zzgft zza(zzgoy zzgoyVar, zzggn zzggnVar) {
                return zzgro.zzc((zzgot) zzgoyVar, zzggnVar);
            }
        }, zzgxmVarZza, zzgot.class);
    }

    public static /* synthetic */ zzgot zza(zzgqd zzgqdVar, zzggn zzggnVar) {
        zzgud zzgudVarZzc = zzgue.zzc();
        zzgudVarZzc.zzb(zzf(zzgqdVar.zzb()));
        byte[] bArrZzd = zzgqdVar.zzd().zzd(zzggnVar);
        zzgudVarZzc.zza(zzgyj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgot.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgue) zzgudVarZzc.zzbr()).zzaN(), zzguo.SYMMETRIC, (zzgvv) zzc.zzb(zzgqdVar.zzb().zzg()), zzgqdVar.zze());
    }

    public static /* synthetic */ zzgou zzb(zzgqo zzgqoVar) {
        zzgut zzgutVarZza = zzguu.zza();
        zzgutVarZza.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgug zzgugVarZzd = zzguh.zzd();
        zzgugVarZzd.zzb(zzf(zzgqoVar));
        zzgugVarZzd.zza(zzgqoVar.zzc());
        zzgutVarZza.zzc(((zzguh) zzgugVarZzd.zzbr()).zzaN());
        zzgutVarZza.zza((zzgvv) zzc.zzb(zzgqoVar.zzg()));
        return zzgou.zzb((zzguu) zzgutVarZza.zzbr());
    }

    public static /* synthetic */ zzgqd zzc(zzgot zzgotVar, zzggn zzggnVar) throws GeneralSecurityException {
        if (!zzgotVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgue zzgueVarZzf = zzgue.zzf(zzgotVar.zze(), zzgzf.zza());
            if (zzgueVarZzf.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgqk zzgqkVarZze = zzgqo.zze();
            zzgqkVarZze.zzb(zzgueVarZzf.zzh().zzd());
            zzgqkVarZze.zzc(zzgueVarZzf.zzg().zza());
            zzgqkVarZze.zza((zzgql) zzd.zzc(zzgueVarZzf.zzg().zzc()));
            zzgqkVarZze.zzd((zzgqm) zzc.zzc(zzgotVar.zzc()));
            zzgqo zzgqoVarZze = zzgqkVarZze.zze();
            zzgqb zzgqbVarZza = zzgqd.zza();
            zzgqbVarZza.zzc(zzgqoVarZze);
            zzgqbVarZza.zzb(zzgxn.zzb(zzgueVarZzf.zzh().zzB(), zzggnVar));
            zzgqbVarZza.zza(zzgotVar.zzf());
            return zzgqbVarZza.zzd();
        } catch (zzhak | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzgqo zzd(zzgou zzgouVar) throws GeneralSecurityException {
        if (!zzgouVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgouVar.zzc().zzi())));
        }
        try {
            zzguh zzguhVarZzg = zzguh.zzg(zzgouVar.zzc().zzh(), zzgzf.zza());
            if (zzguhVarZzg.zzc() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzguhVarZzg.zzc());
            }
            zzgqk zzgqkVarZze = zzgqo.zze();
            zzgqkVarZze.zzb(zzguhVarZzg.zza());
            zzgqkVarZze.zzc(zzguhVarZzg.zzh().zza());
            zzgqkVarZze.zza((zzgql) zzd.zzc(zzguhVarZzg.zzh().zzc()));
            zzgqkVarZze.zzd((zzgqm) zzc.zzc(zzgouVar.zzc().zzg()));
            return zzgqkVarZze.zze();
        } catch (zzhak e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    public static void zze(zzgnu zzgnuVar) throws GeneralSecurityException {
        zzgnuVar.zzi(zze);
        zzgnuVar.zzh(zzf);
        zzgnuVar.zzg(zzg);
        zzgnuVar.zzf(zzh);
    }

    private static zzguk zzf(zzgqo zzgqoVar) throws GeneralSecurityException {
        zzguj zzgujVarZzd = zzguk.zzd();
        zzgujVarZzd.zzb(zzgqoVar.zzb());
        zzgujVarZzd.zza((zzgub) zzd.zzb(zzgqoVar.zzf()));
        return (zzguk) zzgujVarZzd.zzbr();
    }
}
