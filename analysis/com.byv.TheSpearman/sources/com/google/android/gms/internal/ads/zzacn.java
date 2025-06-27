package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzacn {
    public static final zzacn zza = new zzacn(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzacn(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzacn zzd(long j, long j2) {
        return new zzacn(-1, j, j2);
    }

    public static zzacn zze(long j) {
        return new zzacn(0, -9223372036854775807L, j);
    }

    public static zzacn zzf(long j, long j2) {
        return new zzacn(-2, j, j2);
    }
}
