package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcgt implements com.google.android.gms.ads.internal.overlay.zzp {
    private final zzcgm zza;
    private final com.google.android.gms.ads.internal.overlay.zzp zzb;

    public zzcgt(zzcgm zzcgmVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar) {
        this.zza = zzcgmVar;
        this.zzb = zzpVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdq();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdr();
        }
        this.zza.zzY();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i) {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzb;
        if (zzpVar != null) {
            zzpVar.zzdu(i);
        }
        this.zza.zzW();
    }
}
