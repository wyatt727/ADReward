package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzghf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgog zzb = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzghc
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            return zzgwn.zzb((zzghb) zzgftVar);
        }
    }, zzghb.class, zzgfj.class);
    private static final zzgfu zzc = zzgnb.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgfj.class, zzguo.SYMMETRIC, zzgsm.zzh());
    private static final zzgnl zzd = new zzgnl() { // from class: com.google.android.gms.internal.ads.zzghd
    };
    private static final zzgnj zze = new zzgnj() { // from class: com.google.android.gms.internal.ads.zzghe
        @Override // com.google.android.gms.internal.ads.zzgnj
        public final zzgft zza(zzggi zzggiVar, Integer num) throws GeneralSecurityException {
            zzghl zzghlVar = (zzghl) zzggiVar;
            int i = zzghf.zza;
            if (zzghlVar.zzb() != 16 && zzghlVar.zzb() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            zzggz zzggzVar = new zzggz(null);
            zzggzVar.zzd(zzghlVar);
            zzggzVar.zzc(num);
            zzggzVar.zza(zzgxn.zzc(zzghlVar.zzb()));
            zzggzVar.zzb(zzgxn.zzc(zzghlVar.zzc()));
            return zzggzVar.zze();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzgml.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzgla.zza;
        zzgla.zze(zzgnu.zzc());
        zzgnr.zza().zze(zzb);
        zzgnq zzgnqVarZzb = zzgnq.zzb();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzgko.zze);
        zzghh zzghhVar = new zzghh(null);
        zzghhVar.zza(16);
        zzghhVar.zzc(32);
        zzghhVar.zze(16);
        zzghhVar.zzd(16);
        zzghhVar.zzb(zzghi.zzc);
        zzghhVar.zzf(zzghj.zzc);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzghhVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzgko.zzf);
        zzghh zzghhVar2 = new zzghh(null);
        zzghhVar2.zza(32);
        zzghhVar2.zzc(32);
        zzghhVar2.zze(32);
        zzghhVar2.zzd(16);
        zzghhVar2.zzb(zzghi.zzc);
        zzghhVar2.zzf(zzghj.zzc);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzghhVar2.zzg());
        zzgnqVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnm.zza().zzb(zzd, zzghl.class);
        zzgnk.zzb().zzc(zze, zzghl.class);
        zzgms.zzc().zzf(zzc, i, true);
    }
}
