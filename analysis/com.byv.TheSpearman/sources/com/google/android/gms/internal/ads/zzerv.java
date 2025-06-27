package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzerv implements zzewr {
    private final zzgep zza;
    private final zzdsd zzb;
    private final String zzc;
    private final zzfgi zzd;

    public zzerv(zzgep zzgepVar, zzdsd zzdsdVar, zzfgi zzfgiVar, String str) {
        this.zza = zzgepVar;
        this.zzb = zzdsdVar;
        this.zzd = zzfgiVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeru
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzerw zzc() throws Exception {
        zzfgi zzfgiVar = this.zzd;
        zzdsd zzdsdVar = this.zzb;
        return new zzerw(zzdsdVar.zzb(zzfgiVar.zzf, this.zzc), zzdsdVar.zza());
    }
}
