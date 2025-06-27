package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzclj implements zzdvi {
    private final zzckh zza;
    private final zzclp zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzclj(zzckh zzckhVar, zzclp zzclpVar, zzcli zzcliVar) {
        this.zza = zzckhVar;
        this.zzb = zzclpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ zzdvi zza(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* bridge */ /* synthetic */ zzdvi zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final zzdvj zzc() {
        zzhjd.zzc(this.zzc, Long.class);
        zzhjd.zzc(this.zzd, String.class);
        return new zzcll(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
