package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdbe implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdbf zzdbfVar = (zzdbf) this.zza.get();
        if (zzdbfVar != null) {
            zzdbfVar.zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzdbc
                @Override // com.google.android.gms.internal.ads.zzded
                public final void zza(Object obj) {
                    ((zzdbg) obj).zza();
                }
            });
        }
    }
}
