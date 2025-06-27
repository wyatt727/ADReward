package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgif {
    public static final /* synthetic */ int zza = 0;
    private static final zzgog zzb = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzgic
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            return zzgwk.zzb((zzgib) zzgftVar);
        }
    }, zzgib.class, zzgfj.class);
    private static final zzgfu zzc = zzgnb.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgfj.class, zzguo.SYMMETRIC, zzgtk.zzg());
    private static final zzgnl zzd = new zzgnl() { // from class: com.google.android.gms.internal.ads.zzgid
    };
    private static final zzgnj zze = new zzgnj() { // from class: com.google.android.gms.internal.ads.zzgie
        @Override // com.google.android.gms.internal.ads.zzgnj
        public final zzgft zza(zzggi zzggiVar, Integer num) throws GeneralSecurityException {
            zzgik zzgikVar = (zzgik) zzggiVar;
            int i = zzgif.zza;
            if (zzgikVar.zzb() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzghz zzghzVar = new zzghz(null);
            zzghzVar.zzc(zzgikVar);
            zzghzVar.zza(num);
            zzghzVar.zzb(zzgxn.zzc(zzgikVar.zzb()));
            return zzghzVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzgml.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzglk.zza;
        zzglk.zze(zzgnu.zzc());
        zzgnr.zza().zze(zzb);
        zzgnq zzgnqVarZzb = zzgnq.zzb();
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzgko.zza);
        zzgih zzgihVar = new zzgih(null);
        zzgihVar.zza(12);
        zzgihVar.zzb(16);
        zzgihVar.zzc(16);
        zzgihVar.zzd(zzgii.zzc);
        map.put("AES128_GCM_RAW", zzgihVar.zze());
        map.put("AES256_GCM", zzgko.zzb);
        zzgih zzgihVar2 = new zzgih(null);
        zzgihVar2.zza(12);
        zzgihVar2.zzb(32);
        zzgihVar2.zzc(16);
        zzgihVar2.zzd(zzgii.zzc);
        map.put("AES256_GCM_RAW", zzgihVar2.zze());
        zzgnqVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnm.zza().zzb(zzd, zzgik.class);
        zzgnk.zzb().zzc(zze, zzgik.class);
        zzgms.zzc().zzf(zzc, i, true);
    }
}
