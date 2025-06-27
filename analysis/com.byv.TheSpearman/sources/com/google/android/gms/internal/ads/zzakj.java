package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakj implements zzakp {
    private final zzads zza;
    private final zzadr zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzakj(zzads zzadsVar, zzadr zzadrVar) {
        this.zza = zzadsVar;
        this.zzb = zzadrVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzakp
    public final long zzd(zzadg zzadgVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzakp
    public final zzaef zze() {
        zzek.zzf(this.zzc != -1);
        return new zzadq(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzakp
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfx.zzc(jArr, j, true, true)];
    }
}
