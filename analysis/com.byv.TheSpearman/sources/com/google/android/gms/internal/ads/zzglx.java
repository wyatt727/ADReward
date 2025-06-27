package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzglx extends zzgly {
    public zzglx(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    final zzglw zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzglv(bArr, i);
    }
}
