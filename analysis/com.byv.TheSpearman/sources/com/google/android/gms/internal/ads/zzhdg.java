package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzhdg {
    final Unsafe zza;

    zzhdg(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long j);

    public abstract double zzb(Object obj, long j);

    public abstract float zzc(Object obj, long j);

    public abstract void zzd(long j, byte[] bArr, long j2, long j3);

    public abstract void zze(Object obj, long j, boolean z);

    public abstract void zzf(Object obj, long j, byte b);

    public abstract void zzg(Object obj, long j, double d);

    public abstract void zzh(Object obj, long j, float f);

    public abstract boolean zzi(Object obj, long j);
}
