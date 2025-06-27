package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgwv {
    public static final zzgwv zza = new zzgwv(new zzgww());
    public static final zzgwv zzb = new zzgwv(new zzgxa());
    public static final zzgwv zzc = new zzgwv(new zzgxc());
    public static final zzgwv zzd = new zzgwv(new zzgxb());
    public static final zzgwv zze = new zzgwv(new zzgwx());
    public static final zzgwv zzf = new zzgwv(new zzgwz());
    public static final zzgwv zzg = new zzgwv(new zzgwy());
    private final zzgwu zzh;

    /* JADX WARN: Multi-variable type inference failed */
    public zzgwv(zzgxd zzgxdVar) {
        this.zzh = !zzgmm.zzb() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzgwp(zzgxdVar, null) : new zzgwr(zzgxdVar, 0 == true ? 1 : 0) : new zzgwt(zzgxdVar, 0 == true ? 1 : 0);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }
}
