package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzezp implements zzewr {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbut zzc;

    public zzezp(zzbut zzbutVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzc = zzbutVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return zzgee.zzm(zzgee.zzo(zzgee.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeb)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzezo
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return new zzezq((Bundle) obj);
            }
        }, zzcbr.zza);
    }
}
