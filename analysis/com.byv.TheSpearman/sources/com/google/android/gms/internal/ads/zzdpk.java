package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzdpk implements com.google.android.gms.ads.internal.client.zza, zzbjo, com.google.android.gms.ads.internal.overlay.zzp, zzbjq, com.google.android.gms.ads.internal.overlay.zzaa {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbjo zzb;
    private com.google.android.gms.ads.internal.overlay.zzp zzc;
    private zzbjq zzd;
    private com.google.android.gms.ads.internal.overlay.zzaa zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjo
    public final synchronized void zza(String str, Bundle bundle) {
        zzbjo zzbjoVar = this.zzb;
        if (zzbjoVar != null) {
            zzbjoVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final synchronized void zzb(String str, String str2) {
        zzbjq zzbjqVar = this.zzd;
        if (zzbjqVar != null) {
            zzbjqVar.zzb(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdH() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdH();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdq() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdq();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdr() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdt() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdu(int i) {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdu(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zze;
        if (zzaaVar != null) {
            zzaaVar.zzg();
        }
    }

    protected final synchronized void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, zzbjo zzbjoVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbjq zzbjqVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar) {
        this.zza = zzaVar;
        this.zzb = zzbjoVar;
        this.zzc = zzpVar;
        this.zzd = zzbjqVar;
        this.zze = zzaaVar;
    }
}
