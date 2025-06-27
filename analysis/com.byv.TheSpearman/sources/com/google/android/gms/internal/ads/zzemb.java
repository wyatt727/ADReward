package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzemb implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcyo zzb;
    private final zzczi zzc;
    private final zzdgp zzd;
    private final zzdgh zze;
    private final zzcqh zzf;

    zzemb(zzcyo zzcyoVar, zzczi zzcziVar, zzdgp zzdgpVar, zzdgh zzdghVar, zzcqh zzcqhVar) {
        this.zzb = zzcyoVar;
        this.zzc = zzcziVar;
        this.zzd = zzdgpVar;
        this.zze = zzdghVar;
        this.zzf = zzcqhVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzr();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
