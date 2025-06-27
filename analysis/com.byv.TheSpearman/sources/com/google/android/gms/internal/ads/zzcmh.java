package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcmh implements zzdqq {
    private final zzckh zza;
    private zzfdi zzb;
    private zzfcl zzc;
    private zzdeh zzd;
    private zzcya zze;

    /* synthetic */ zzcmh(zzckh zzckhVar, zzcmg zzcmgVar) {
        this.zza = zzckhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final /* synthetic */ zzcxw zza(zzfcl zzfclVar) {
        this.zzc = zzfclVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final /* synthetic */ zzcxw zzb(zzfdi zzfdiVar) {
        this.zzb = zzfdiVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqq
    public final /* synthetic */ zzdqq zzc(zzdeh zzdehVar) {
        this.zzd = zzdehVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqq
    public final /* synthetic */ zzdqq zzd(zzcya zzcyaVar) {
        this.zze = zzcyaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzdqr zzh() {
        zzhjd.zzc(this.zzd, zzdeh.class);
        zzhjd.zzc(this.zze, zzcya.class);
        return new zzcmj(this.zza, new zzcvf(), new zzfho(), new zzcxd(), new zzduv(), this.zzd, this.zze, zzeko.zza(), null, this.zzb, this.zzc, null);
    }
}
