package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgis {
    private static final zzgog zza = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzgip
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            return zzgmk.zzb((zzgio) zzgftVar);
        }
    }, zzgio.class, zzgfj.class);
    private static final zzgnj zzb = new zzgnj() { // from class: com.google.android.gms.internal.ads.zzgiq
        @Override // com.google.android.gms.internal.ads.zzgnj
        public final zzgft zza(zzggi zzggiVar, Integer num) {
            zzgix zzgixVar = (zzgix) zzggiVar;
            zzgim zzgimVar = new zzgim(null);
            zzgimVar.zzc(zzgixVar);
            zzgimVar.zza(num);
            zzgimVar.zzb(zzgxn.zzc(zzgixVar.zzb()));
            return zzgimVar.zzd();
        }
    };
    private static final zzgnl zzc = new zzgnl() { // from class: com.google.android.gms.internal.ads.zzgir
    };
    private static final zzgfu zzd = zzgnb.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgfj.class, zzguo.SYMMETRIC, zzgtq.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgml.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i = zzglp.zza;
        zzglp.zze(zzgnu.zzc());
        if (zzb()) {
            zzgnr.zza().zze(zza);
            zzgnq zzgnqVarZzb = zzgnq.zzb();
            HashMap map = new HashMap();
            zzgiu zzgiuVar = new zzgiu(null);
            zzgiuVar.zza(16);
            zzgiuVar.zzb(zzgiv.zza);
            map.put("AES128_GCM_SIV", zzgiuVar.zzc());
            zzgiu zzgiuVar2 = new zzgiu(null);
            zzgiuVar2.zza(16);
            zzgiuVar2.zzb(zzgiv.zzc);
            map.put("AES128_GCM_SIV_RAW", zzgiuVar2.zzc());
            zzgiu zzgiuVar3 = new zzgiu(null);
            zzgiuVar3.zza(32);
            zzgiuVar3.zzb(zzgiv.zza);
            map.put("AES256_GCM_SIV", zzgiuVar3.zzc());
            zzgiu zzgiuVar4 = new zzgiu(null);
            zzgiuVar4.zza(32);
            zzgiuVar4.zzb(zzgiv.zzc);
            map.put("AES256_GCM_SIV_RAW", zzgiuVar4.zzc());
            zzgnqVarZzb.zzd(Collections.unmodifiableMap(map));
            zzgnm.zza().zzb(zzc, zzgix.class);
            zzgnk.zzb().zzc(zzb, zzgix.class);
            zzgms.zzc().zzd(zzd, true);
        }
    }

    private static boolean zzb() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
