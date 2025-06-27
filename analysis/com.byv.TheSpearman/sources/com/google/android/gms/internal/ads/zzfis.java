package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfis {
    private final zzfhw zza;
    private final zzfiq zzb;
    private final zzfhs zzc;
    private zzfiy zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfis(zzfhw zzfhwVar, zzfhs zzfhsVar, zzfiq zzfiqVar) {
        this.zza = zzfhwVar;
        this.zzc = zzfhsVar;
        this.zzb = zzfiqVar;
        zzfhsVar.zzb(new zzfin(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgs)).booleanValue() && !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfir zzfirVar = (zzfir) this.zzd.pollFirst();
                if (zzfirVar == null || (zzfirVar.zza() != null && this.zza.zze(zzfirVar.zza()))) {
                    zzfiy zzfiyVar = new zzfiy(this.zza, this.zzb, zzfirVar);
                    this.zze = zzfiyVar;
                    zzfiyVar.zzd(new zzfio(this, zzfirVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized ListenableFuture zza(zzfir zzfirVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfirVar);
    }

    public final synchronized void zze(zzfir zzfirVar) {
        this.zzd.add(zzfirVar);
    }

    final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
