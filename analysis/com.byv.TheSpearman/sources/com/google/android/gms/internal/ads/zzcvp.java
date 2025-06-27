package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbdg;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcvp implements zzdae, com.google.android.gms.ads.internal.client.zza, zzdbl, zzczk, zzcyq, zzddx {
    private final Clock zza;
    private final zzcba zzb;

    public zzcvp(Clock clock, zzcba zzcbaVar) {
        this.zza = clock;
        this.zzb = zzcbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdn(zzbxd zzbxdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdo(zzffz zzffzVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzds(zzbxq zzbxqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzi(zzbdg.zzb zzbVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzj(zzbdg.zzb zzbVar) {
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzl(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzm(zzbdg.zzb zzbVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzn(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzr() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final void zzs() {
        this.zzb.zzh(true);
    }
}
