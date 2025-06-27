package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgou implements zzgoy {
    private final zzgxm zza;
    private final zzguu zzb;

    private zzgou(zzguu zzguuVar, zzgxm zzgxmVar) {
        this.zzb = zzguuVar;
        this.zza = zzgxmVar;
    }

    public static zzgou zza(zzguu zzguuVar) throws GeneralSecurityException {
        String strZzi = zzguuVar.zzi();
        Charset charset = zzgpi.zza;
        byte[] bArr = new byte[strZzi.length()];
        for (int i = 0; i < strZzi.length(); i++) {
            char cCharAt = strZzi.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return new zzgou(zzguuVar, zzgxm.zzb(bArr));
    }

    public static zzgou zzb(zzguu zzguuVar) {
        return new zzgou(zzguuVar, zzgpi.zza(zzguuVar.zzi()));
    }

    public final zzguu zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgoy
    public final zzgxm zzd() {
        return this.zza;
    }
}
