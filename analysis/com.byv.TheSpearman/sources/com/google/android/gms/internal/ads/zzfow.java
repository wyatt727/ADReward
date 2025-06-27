package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfow implements Runnable {
    zzfow() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzfoz.zzc != null) {
            zzfoz.zzc.post(zzfoz.zzd);
            zzfoz.zzc.postDelayed(zzfoz.zze, 200L);
        }
    }
}
