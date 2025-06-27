package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgnp {
    private static final zzgnp zza = new zzgnp();
    private static final zzgno zzb = new zzgno(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgnp zza() {
        return zza;
    }

    public final zzgru zzb() {
        zzgru zzgruVar = (zzgru) this.zzc.get();
        return zzgruVar == null ? zzb : zzgruVar;
    }
}
