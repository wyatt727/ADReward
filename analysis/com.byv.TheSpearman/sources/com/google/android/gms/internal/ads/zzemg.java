package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzemg implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcbw zza;
    final /* synthetic */ zzffz zzb;
    final /* synthetic */ zzffn zzc;
    final /* synthetic */ zzemm zzd;
    final /* synthetic */ zzemh zze;

    zzemg(zzemh zzemhVar, zzcbw zzcbwVar, zzffz zzffzVar, zzffn zzffnVar, zzemm zzemmVar) {
        this.zza = zzcbwVar;
        this.zzb = zzffzVar;
        this.zzc = zzffnVar;
        this.zzd = zzemmVar;
        this.zze = zzemhVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        this.zza.zzc(this.zze.zzd.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
