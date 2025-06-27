package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcsx implements zzazy {
    private final zzcgm zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    zzcsx(zzcgm zzcgmVar, Executor executor) {
        this.zza = zzcgmVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final synchronized void zzdp(zzazx zzazxVar) {
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzmi)).booleanValue()) {
                if (zzazxVar.zzj) {
                    if (!Boolean.TRUE.equals(this.zzc.getAndSet(true))) {
                        Executor executor = this.zzb;
                        final zzcgm zzcgmVar = this.zza;
                        Objects.requireNonNull(zzcgmVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsv
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcgmVar.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzazxVar.zzj) {
                    if (!Boolean.FALSE.equals(this.zzc.getAndSet(false))) {
                        Executor executor2 = this.zzb;
                        final zzcgm zzcgmVar2 = this.zza;
                        Objects.requireNonNull(zzcgmVar2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsw
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcgmVar2.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
