package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgwp implements zzgwu {
    private final zzgxd zza;

    /* synthetic */ zzgwp(zzgxd zzgxdVar, zzgwo zzgwoVar) {
        this.zza = zzgxdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwu
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzgwv.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
