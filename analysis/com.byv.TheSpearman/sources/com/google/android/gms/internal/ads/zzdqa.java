package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdqa extends zzdpk implements zzdgn {
    private zzdgn zza;

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final synchronized void zzdG() {
        zzdgn zzdgnVar = this.zza;
        if (zzdgnVar != null) {
            zzdgnVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final synchronized void zzdf() {
        zzdgn zzdgnVar = this.zza;
        if (zzdgnVar != null) {
            zzdgnVar.zzdf();
        }
    }

    protected final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbjo zzbjoVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbjq zzbjqVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, zzdgn zzdgnVar) {
        super.zzh(zzaVar, zzbjoVar, zzpVar, zzbjqVar, zzaaVar);
        this.zza = zzdgnVar;
    }
}
