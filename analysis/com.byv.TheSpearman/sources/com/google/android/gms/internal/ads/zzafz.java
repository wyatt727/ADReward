package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafz extends zzadt {
    private final long zza;

    public zzafz(zzadg zzadgVar, long j) {
        super(zzadgVar);
        zzek.zzd(zzadgVar.zzf() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadt, com.google.android.gms.internal.ads.zzadg
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadt, com.google.android.gms.internal.ads.zzadg
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadt, com.google.android.gms.internal.ads.zzadg
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
