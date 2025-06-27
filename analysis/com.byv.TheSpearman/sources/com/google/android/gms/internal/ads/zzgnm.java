package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgnm {
    private static final zzgnm zza = new zzgnm();
    private final Map zzb = new HashMap();

    public static zzgnm zza() {
        return zza;
    }

    public final synchronized void zzb(zzgnl zzgnlVar, Class cls) throws GeneralSecurityException {
        zzgnl zzgnlVar2 = (zzgnl) this.zzb.get(cls);
        if (zzgnlVar2 != null && !zzgnlVar2.equals(zzgnlVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.zzb.put(cls, zzgnlVar);
    }
}
