package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbap implements Runnable {
    final /* synthetic */ zzbaq zza;

    zzbap(zzbaq zzbaqVar) {
        this.zza = zzbaqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzc) {
            zzbaq zzbaqVar = this.zza;
            if (zzbaqVar.zzd && zzbaqVar.zze) {
                zzbaqVar.zzd = false;
                com.google.android.gms.ads.internal.util.client.zzm.zze("App went background");
                Iterator it = this.zza.zzf.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbar) it.next()).zza(false);
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                    }
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zze("App is still foreground");
            }
        }
    }
}
