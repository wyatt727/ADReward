package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzell extends zzbya {
    final /* synthetic */ zzdaw zza;
    final /* synthetic */ zzcyo zzb;
    final /* synthetic */ zzczx zzc;
    final /* synthetic */ zzdgw zzd;

    zzell(zzelm zzelmVar, zzdaw zzdawVar, zzcyo zzcyoVar, zzczx zzczxVar, zzdgw zzdgwVar) {
        this.zza = zzdawVar;
        this.zzb = zzcyoVar;
        this.zzc = zzczxVar;
        this.zzd = zzdgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzdu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdr();
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzm(IObjectWrapper iObjectWrapper, zzbyc zzbycVar) {
        this.zzd.zza(zzbycVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
