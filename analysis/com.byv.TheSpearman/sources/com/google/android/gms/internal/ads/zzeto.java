package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeto implements zzewr {
    private final Context zza;
    private final zzgep zzb;

    zzeto(zzgep zzgepVar, Context context) {
        this.zzb = zzgepVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzetp zzc() throws Exception {
        com.google.android.gms.ads.internal.zzu.zzp();
        return new zzetp(com.google.android.gms.ads.internal.util.zzt.zzs(this.zza));
    }
}
