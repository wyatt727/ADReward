package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgqi {
    private static final zzgog zza = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzgqe
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            return new zzgrj((zzgqd) zzgftVar);
        }
    }, zzgqd.class, zzgpw.class);
    private static final zzgog zzb = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzgqf
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            return zzgxj.zzb((zzgqd) zzgftVar);
        }
    }, zzgqd.class, zzggh.class);
    private static final zzgfu zzc = zzgnb.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzggh.class, zzguo.SYMMETRIC, zzgue.zzi());
    private static final zzgnl zzd = new zzgnl() { // from class: com.google.android.gms.internal.ads.zzgqg
    };
    private static final zzgnj zze = new zzgnj() { // from class: com.google.android.gms.internal.ads.zzgqh
        @Override // com.google.android.gms.internal.ads.zzgnj
        public final zzgft zza(zzggi zzggiVar, Integer num) {
            zzgqo zzgqoVar = (zzgqo) zzggiVar;
            zzgqb zzgqbVar = new zzgqb(null);
            zzgqbVar.zzc(zzgqoVar);
            zzgqbVar.zzb(zzgxn.zzc(zzgqoVar.zzc()));
            zzgqbVar.zza(num);
            return zzgqbVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzgml.zza(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzgro.zza;
        zzgro.zze(zzgnu.zzc());
        zzgnr.zza().zze(zza);
        zzgnr.zza().zze(zzb);
        zzgnq zzgnqVarZzb = zzgnq.zzb();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzgrb.zza);
        zzgqk zzgqkVar = new zzgqk(null);
        zzgqkVar.zzb(32);
        zzgqkVar.zzc(16);
        zzgqkVar.zzd(zzgqm.zzd);
        zzgqkVar.zza(zzgql.zzc);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzgqkVar.zze());
        zzgqk zzgqkVar2 = new zzgqk(null);
        zzgqkVar2.zzb(32);
        zzgqkVar2.zzc(32);
        zzgqkVar2.zzd(zzgqm.zza);
        zzgqkVar2.zza(zzgql.zzc);
        map.put("HMAC_SHA256_256BITTAG", zzgqkVar2.zze());
        zzgqk zzgqkVar3 = new zzgqk(null);
        zzgqkVar3.zzb(32);
        zzgqkVar3.zzc(32);
        zzgqkVar3.zzd(zzgqm.zzd);
        zzgqkVar3.zza(zzgql.zzc);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzgqkVar3.zze());
        zzgqk zzgqkVar4 = new zzgqk(null);
        zzgqkVar4.zzb(64);
        zzgqkVar4.zzc(16);
        zzgqkVar4.zzd(zzgqm.zza);
        zzgqkVar4.zza(zzgql.zze);
        map.put("HMAC_SHA512_128BITTAG", zzgqkVar4.zze());
        zzgqk zzgqkVar5 = new zzgqk(null);
        zzgqkVar5.zzb(64);
        zzgqkVar5.zzc(16);
        zzgqkVar5.zzd(zzgqm.zzd);
        zzgqkVar5.zza(zzgql.zze);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzgqkVar5.zze());
        zzgqk zzgqkVar6 = new zzgqk(null);
        zzgqkVar6.zzb(64);
        zzgqkVar6.zzc(32);
        zzgqkVar6.zzd(zzgqm.zza);
        zzgqkVar6.zza(zzgql.zze);
        map.put("HMAC_SHA512_256BITTAG", zzgqkVar6.zze());
        zzgqk zzgqkVar7 = new zzgqk(null);
        zzgqkVar7.zzb(64);
        zzgqkVar7.zzc(32);
        zzgqkVar7.zzd(zzgqm.zzd);
        zzgqkVar7.zza(zzgql.zze);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzgqkVar7.zze());
        map.put("HMAC_SHA512_512BITTAG", zzgrb.zzd);
        zzgqk zzgqkVar8 = new zzgqk(null);
        zzgqkVar8.zzb(64);
        zzgqkVar8.zzc(64);
        zzgqkVar8.zzd(zzgqm.zzd);
        zzgqkVar8.zza(zzgql.zze);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzgqkVar8.zze());
        zzgnqVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnk.zzb().zzc(zze, zzgqo.class);
        zzgnm.zza().zzb(zzd, zzgqo.class);
        zzgms.zzc().zzf(zzc, i, true);
    }
}
