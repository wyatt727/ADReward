package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdij implements com.google.android.gms.ads.internal.overlay.zzp {
    private final zzdaw zza;
    private final zzdfz zzb;

    public zzdij(zzdaw zzdawVar, zzdfz zzdfzVar) {
        this.zza = zzdawVar;
        this.zzb = zzdfzVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
        this.zza.zzdH();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
        this.zza.zzdk();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        this.zza.zzdq();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        this.zza.zzdr();
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        this.zza.zzdt();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i) {
        this.zza.zzdu(i);
        this.zzb.zza();
    }
}
