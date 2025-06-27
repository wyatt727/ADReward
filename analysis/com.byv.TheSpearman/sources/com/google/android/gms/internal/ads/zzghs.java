package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzghs {
    public static final /* synthetic */ int zza = 0;
    private static final zzgog zzb = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzghq
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            return zzgwj.zzb((zzghp) zzgftVar);
        }
    }, zzghp.class, zzgfj.class);
    private static final zzgfu zzc = zzgnb.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgfj.class, zzguo.SYMMETRIC, zzgtb.zzh());
    private static final zzgnj zzd = new zzgnj() { // from class: com.google.android.gms.internal.ads.zzghr
        @Override // com.google.android.gms.internal.ads.zzgnj
        public final zzgft zza(zzggi zzggiVar, Integer num) throws GeneralSecurityException {
            zzghx zzghxVar = (zzghx) zzggiVar;
            int i = zzghs.zza;
            if (zzghxVar.zzc() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzghn zzghnVar = new zzghn(null);
            zzghnVar.zzc(zzghxVar);
            zzghnVar.zza(num);
            zzghnVar.zzb(zzgxn.zzc(zzghxVar.zzc()));
            return zzghnVar.zzd();
        }
    };

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgml.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i = zzglf.zza;
        zzglf.zze(zzgnu.zzc());
        zzgnr.zza().zze(zzb);
        zzgnq zzgnqVarZzb = zzgnq.zzb();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzgko.zzc);
        zzghu zzghuVar = new zzghu(null);
        zzghuVar.zza(16);
        zzghuVar.zzb(16);
        zzghuVar.zzc(16);
        zzghuVar.zzd(zzghv.zzc);
        map.put("AES128_EAX_RAW", zzghuVar.zze());
        map.put("AES256_EAX", zzgko.zzd);
        zzghu zzghuVar2 = new zzghu(null);
        zzghuVar2.zza(16);
        zzghuVar2.zzb(32);
        zzghuVar2.zzc(16);
        zzghuVar2.zzd(zzghv.zzc);
        map.put("AES256_EAX_RAW", zzghuVar2.zze());
        zzgnqVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnk.zzb().zzc(zzd, zzghx.class);
        zzgms.zzc().zzd(zzc, true);
    }
}
