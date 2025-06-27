package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzggp {
    public static zzggi zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzguu zzguuVarZzf = zzguu.zzf(bArr, zzgzf.zza());
            zzgnu zzgnuVarZzc = zzgnu.zzc();
            zzgou zzgouVarZza = zzgou.zza(zzguuVarZzf);
            return !zzgnuVarZzc.zzk(zzgouVarZza) ? new zzgne(zzgouVarZza) : zzgnuVarZzc.zzb(zzgouVarZza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(zzggi zzggiVar) throws GeneralSecurityException {
        return ((zzgou) zzgnu.zzc().zze(zzggiVar, zzgou.class)).zzc().zzaV();
    }
}
