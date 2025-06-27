package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
abstract class zzkn {
    private static final zzkn zza = new zzkq();
    private static final zzkn zzb = new zzks();

    static zzkn zza() {
        return zza;
    }

    abstract <L> List<L> zza(Object obj, long j);

    abstract <L> void zza(Object obj, Object obj2, long j);

    abstract void zzb(Object obj, long j);

    static zzkn zzb() {
        return zzb;
    }

    private zzkn() {
    }
}
