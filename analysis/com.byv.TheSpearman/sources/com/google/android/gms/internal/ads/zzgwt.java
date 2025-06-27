package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgwt implements zzgwu {
    private final zzgxd zza;

    /* synthetic */ zzgwt(zzgxd zzgxdVar, zzgws zzgwsVar) {
        this.zza = zzgxdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwu
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzgwv.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
