package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzzl {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzzm zzzmVar) {
        zzc(zzzmVar);
        this.zza.add(new zzzk(handler, zzzmVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzzk zzzkVar = (zzzk) it.next();
            if (!zzzkVar.zzc) {
                zzzkVar.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzzkVar.zzb.zzX(i, j, j2);
                    }
                });
            }
        }
    }

    public final void zzc(zzzm zzzmVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzzk zzzkVar = (zzzk) it.next();
            if (zzzkVar.zzb == zzzmVar) {
                zzzkVar.zzc();
                this.zza.remove(zzzkVar);
            }
        }
    }
}
