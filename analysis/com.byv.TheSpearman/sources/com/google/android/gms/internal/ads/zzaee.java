package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzaee implements zzaef {
    private final long zza;
    private final zzaed zzb;

    public zzaee(long j, long j2) {
        this.zza = j;
        zzaeg zzaegVar = j2 == 0 ? zzaeg.zza : new zzaeg(0L, j2);
        this.zzb = new zzaed(zzaegVar, zzaegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return false;
    }
}
