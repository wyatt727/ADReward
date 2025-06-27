package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcml implements com.google.android.gms.ads.nonagon.signalgeneration.zzi {
    private final zzckh zza;
    private zzcya zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzag zzc;

    /* synthetic */ zzcml(zzckh zzckhVar, zzcmk zzcmkVar) {
        this.zza = zzckhVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzi
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzi zza(zzcya zzcyaVar) {
        this.zzb = zzcyaVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzi
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzi zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzag zzagVar) {
        this.zzc = zzagVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzi
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzc() {
        zzhjd.zzc(this.zzb, zzcya.class);
        zzhjd.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzag.class);
        return new zzcmn(this.zza, this.zzc, new zzcvf(), new zzcxd(), new zzduv(), this.zzb, null, null, null);
    }
}
