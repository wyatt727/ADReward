package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcdh {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzD)).longValue());
    private boolean zzc = true;

    zzcdh() {
    }

    public final void zza(SurfaceTexture surfaceTexture, final zzccs zzccsVar) {
        if (zzccsVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = timestamp - this.zzb;
            if (Math.abs(j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        zzftg zzftgVar = com.google.android.gms.ads.internal.util.zzt.zza;
        Objects.requireNonNull(zzccsVar);
        zzftgVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdg
            @Override // java.lang.Runnable
            public final void run() {
                zzccsVar.zzk();
            }
        });
    }

    public final void zzb() {
        this.zzc = true;
    }
}
