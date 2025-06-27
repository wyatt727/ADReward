package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgww implements zzgxd {
    @Override // com.google.android.gms.internal.ads.zzgxd
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
