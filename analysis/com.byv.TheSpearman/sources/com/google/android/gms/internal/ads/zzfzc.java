package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfzc {
    private static final zzfzc zza = new zzfyz();
    private static final zzfzc zzb = new zzfza(-1);
    private static final zzfzc zzc = new zzfza(1);

    /* synthetic */ zzfzc(zzfzb zzfzbVar) {
    }

    public static zzfzc zzk() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfzc zzb(int i, int i2);

    public abstract zzfzc zzc(long j, long j2);

    public abstract zzfzc zzd(Object obj, Object obj2, Comparator comparator);

    public abstract zzfzc zze(boolean z, boolean z2);

    public abstract zzfzc zzf(boolean z, boolean z2);
}
