package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcll implements zzdvj {
    private final Long zza;
    private final String zzb;
    private final zzckh zzc;
    private final zzclp zzd;
    private final zzcll zze = this;

    /* synthetic */ zzcll(zzckh zzckhVar, zzclp zzclpVar, Long l, String str, zzclk zzclkVar) {
        this.zzc = zzckhVar;
        this.zzd = zzclpVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdvj
    public final zzdvt zza() {
        zzclp zzclpVar = this.zzd;
        return zzdvu.zza(this.zza.longValue(), zzclpVar.zza, zzdvn.zzc(zzclpVar.zzb), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdvj
    public final zzdvx zzb() {
        zzclp zzclpVar = this.zzd;
        return zzdvy.zza(this.zza.longValue(), zzclpVar.zza, zzdvn.zzc(zzclpVar.zzb), this.zzc, this.zzb);
    }
}
