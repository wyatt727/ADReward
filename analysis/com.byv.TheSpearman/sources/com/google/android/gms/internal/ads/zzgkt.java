package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgkt {
    public static final /* synthetic */ int zza = 0;
    private static final zzgog zzb = zzgog.zzb(new zzgoe() { // from class: com.google.android.gms.internal.ads.zzgkq
        @Override // com.google.android.gms.internal.ads.zzgoe
        public final Object zza(zzgft zzgftVar) {
            zzgkp zzgkpVar = (zzgkp) zzgftVar;
            int i = zzgkt.zza;
            return zzgmd.zzc() ? zzgmd.zzb(zzgkpVar) : zzgxl.zzb(zzgkpVar);
        }
    }, zzgkp.class, zzgfj.class);
    private static final zzgfu zzc = zzgnb.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgfj.class, zzguo.SYMMETRIC, zzgwb.zzg());
    private static final zzgnl zzd = new zzgnl() { // from class: com.google.android.gms.internal.ads.zzgkr
    };
    private static final zzgnj zze = new zzgnj() { // from class: com.google.android.gms.internal.ads.zzgks
        @Override // com.google.android.gms.internal.ads.zzgnj
        public final zzgft zza(zzggi zzggiVar, Integer num) {
            int i = zzgkt.zza;
            return zzgkp.zza(((zzgkv) zzggiVar).zzb(), zzgxn.zzc(32), num);
        }
    };

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgml.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzgmi.zza;
        zzgmi.zze(zzgnu.zzc());
        zzgnr.zza().zze(zzb);
        zzgnq zzgnqVarZzb = zzgnq.zzb();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzgkv.zzc(zzgku.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzgkv.zzc(zzgku.zzc));
        zzgnqVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnk.zzb().zzc(zze, zzgkv.class);
        zzgnm.zza().zzb(zzd, zzgkv.class);
        zzgms.zzc().zzd(zzc, true);
    }
}
