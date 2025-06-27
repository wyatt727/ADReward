package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzful extends zzfve {
    private String zza;
    private String zzb;

    zzful() {
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfve zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfve zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final zzfvf zzc() {
        return new zzfun(this.zza, this.zzb, null);
    }
}
