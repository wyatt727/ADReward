package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzepk implements zzewr {
    private final zzgep zza;
    private final zzfgi zzb;
    private final zzfgx zzc;

    zzepk(zzgep zzgepVar, zzfgi zzfgiVar, zzfgx zzfgxVar) {
        this.zza = zzgepVar;
        this.zzb = zzfgiVar;
        this.zzc = zzfgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzepl zzc() throws Exception {
        String strZza = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhl)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzh.zzb(this.zzb.zzd))) {
            strZza = zzfgx.zza();
        }
        return new zzepl(strZza);
    }
}
