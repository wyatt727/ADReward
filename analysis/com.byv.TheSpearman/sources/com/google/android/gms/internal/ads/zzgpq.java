package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgpq {
    private static final zzgnj zza = new zzgnj() { // from class: com.google.android.gms.internal.ads.zzgpn
        @Override // com.google.android.gms.internal.ads.zzgnj
        public final zzgft zza(zzggi zzggiVar, Integer num) {
            return zzgpq.zzb((zzgpv) zzggiVar, num);
        }
    };
    private static final zzgog zzb = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzgpo
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            return zzgpq.zzc((zzgpm) zzgftVar);
        }
    }, zzgpm.class, zzgpw.class);
    private static final zzgog zzc = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzgpp
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            return zzgpq.zza((zzgpm) zzgftVar);
        }
    }, zzgpm.class, zzggh.class);
    private static final zzgfu zzd = zzgnb.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzggh.class, zzguo.SYMMETRIC, zzgsd.zzh());

    public static /* synthetic */ zzggh zza(zzgpm zzgpmVar) throws GeneralSecurityException {
        zze(zzgpmVar.zzb());
        return zzgxj.zza(zzgpmVar);
    }

    public static /* synthetic */ zzgpm zzb(zzgpv zzgpvVar, Integer num) throws GeneralSecurityException {
        zze(zzgpvVar);
        zzgpk zzgpkVar = new zzgpk(null);
        zzgpkVar.zzc(zzgpvVar);
        zzgpkVar.zza(zzgxn.zzc(zzgpvVar.zzc()));
        zzgpkVar.zzb(num);
        return zzgpkVar.zzd();
    }

    public static /* synthetic */ zzgpw zzc(zzgpm zzgpmVar) throws GeneralSecurityException {
        zze(zzgpmVar.zzb());
        return new zzgri(zzgpmVar);
    }

    public static void zzd(boolean z) throws GeneralSecurityException {
        if (!zzgml.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i = zzgrg.zza;
        zzgrg.zze(zzgnu.zzc());
        zzgnk.zzb().zzc(zza, zzgpv.class);
        zzgnr.zza().zze(zzb);
        zzgnr.zza().zze(zzc);
        zzgnq zzgnqVarZzb = zzgnq.zzb();
        HashMap map = new HashMap();
        map.put("AES_CMAC", zzgrb.zze);
        map.put("AES256_CMAC", zzgrb.zze);
        zzgps zzgpsVar = new zzgps(null);
        zzgpsVar.zza(32);
        zzgpsVar.zzb(16);
        zzgpsVar.zzc(zzgpt.zzd);
        map.put("AES256_CMAC_RAW", zzgpsVar.zzd());
        zzgnqVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgms.zzc().zzd(zzd, true);
    }

    private static void zze(zzgpv zzgpvVar) throws GeneralSecurityException {
        if (zzgpvVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
