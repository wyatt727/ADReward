package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfuc extends zzfuo {
    private String zza;
    private String zzb;

    zzfuc() {
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public final zzfuo zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public final zzfuo zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public final zzfup zzc() {
        return new zzfue(this.zza, this.zzb, null);
    }
}
