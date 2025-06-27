package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzedv {
    private final zzedr zza;
    private final zzgep zzb;

    public zzedv(zzedr zzedrVar, zzgep zzgepVar) {
        this.zza = zzedrVar;
        this.zzb = zzgepVar;
    }

    public final void zza(zzfjq zzfjqVar) {
        final zzedr zzedrVar = this.zza;
        Objects.requireNonNull(zzedrVar);
        zzgee.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzedt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzedrVar.getWritableDatabase();
            }
        }), new zzedu(this, zzfjqVar), this.zzb);
    }
}
