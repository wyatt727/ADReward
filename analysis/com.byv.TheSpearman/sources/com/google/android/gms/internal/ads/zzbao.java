package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbao {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzban zza(boolean z) {
        synchronized (this.zzb) {
            zzban zzbanVar = null;
            if (this.zzc.isEmpty()) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzc.size() < 2) {
                zzban zzbanVar2 = (zzban) this.zzc.get(0);
                if (z) {
                    this.zzc.remove(0);
                } else {
                    zzbanVar2.zzi();
                }
                return zzbanVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzban zzbanVar3 : this.zzc) {
                int iZzb = zzbanVar3.zzb();
                if (iZzb > i2) {
                    i = i3;
                }
                int i4 = iZzb > i2 ? iZzb : i2;
                if (iZzb > i2) {
                    zzbanVar = zzbanVar3;
                }
                i3++;
                i2 = i4;
            }
            this.zzc.remove(i);
            return zzbanVar;
        }
    }

    public final void zzb(zzban zzbanVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzbanVar.zzj(i);
            zzbanVar.zzn();
            this.zzc.add(zzbanVar);
        }
    }

    public final boolean zzc(zzban zzbanVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzban zzbanVar2 = (zzban) it.next();
                if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzL()) {
                    if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzM() && !zzbanVar.equals(zzbanVar2) && zzbanVar2.zzf().equals(zzbanVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzbanVar.equals(zzbanVar2) && zzbanVar2.zzd().equals(zzbanVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzban zzbanVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbanVar);
        }
    }
}
