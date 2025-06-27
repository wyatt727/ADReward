package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbgk {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    static zzbgi zza() {
        return (zzbgi) zzb.get();
    }

    static zzbgj zzb() {
        return (zzbgj) zzc.get();
    }

    public static void zzc(zzbgi zzbgiVar) {
        zzb.set(zzbgiVar);
    }
}
