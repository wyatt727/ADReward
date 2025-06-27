package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeua implements zzewr {
    private final zzgep zza;
    private final zzdxf zzb;

    zzeua(zzgep zzgepVar, zzdxf zzdxfVar) {
        this.zza = zzgepVar;
        this.zzb = zzdxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzeub zzc() throws Exception {
        zzdxf zzdxfVar = this.zzb;
        String strZzc = zzdxfVar.zzc();
        boolean zZzr = zzdxfVar.zzr();
        boolean zZzl = com.google.android.gms.ads.internal.zzu.zzs().zzl();
        zzdxf zzdxfVar2 = this.zzb;
        return new zzeub(strZzc, zZzr, zZzl, zzdxfVar2.zzp(), zzdxfVar2.zzs());
    }
}
