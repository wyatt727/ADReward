package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzerp implements zzewr {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzewr zzc;
    private final long zzd;

    public zzerp(zzewr zzewrVar, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzewrVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        zzero zzeroVar = (zzero) this.zza.get();
        if (zzeroVar == null || zzeroVar.zza()) {
            zzewr zzewrVar = this.zzc;
            zzero zzeroVar2 = new zzero(zzewrVar.zzb(), this.zzd, this.zzb);
            this.zza.set(zzeroVar2);
            zzeroVar = zzeroVar2;
        }
        return zzeroVar.zza;
    }
}
