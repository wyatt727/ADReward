package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaqt {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaqa zze;
    private final zzaqj zzf;
    private final zzaqk[] zzg;
    private zzaqc zzh;
    private final List zzi;
    private final List zzj;
    private final zzaqh zzk;

    public zzaqt(zzaqa zzaqaVar, zzaqj zzaqjVar, int i) {
        zzaqh zzaqhVar = new zzaqh(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaqaVar;
        this.zzf = zzaqjVar;
        this.zzg = new zzaqk[4];
        this.zzk = zzaqhVar;
    }

    public final zzaqq zza(zzaqq zzaqqVar) {
        zzaqqVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzaqqVar);
        }
        zzaqqVar.zzg(this.zza.incrementAndGet());
        zzaqqVar.zzm("add-to-queue");
        zzc(zzaqqVar, 0);
        this.zzc.add(zzaqqVar);
        return zzaqqVar;
    }

    final void zzb(zzaqq zzaqqVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzaqqVar);
        }
        synchronized (this.zzi) {
            Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((zzaqs) it.next()).zza();
            }
        }
        zzc(zzaqqVar, 5);
    }

    final void zzc(zzaqq zzaqqVar, int i) {
        synchronized (this.zzj) {
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((zzaqr) it.next()).zza();
            }
        }
    }

    public final void zzd() {
        zzaqc zzaqcVar = this.zzh;
        if (zzaqcVar != null) {
            zzaqcVar.zzb();
        }
        zzaqk[] zzaqkVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzaqk zzaqkVar = zzaqkVarArr[i];
            if (zzaqkVar != null) {
                zzaqkVar.zza();
            }
        }
        zzaqc zzaqcVar2 = new zzaqc(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzaqcVar2;
        zzaqcVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzaqk zzaqkVar2 = new zzaqk(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i2] = zzaqkVar2;
            zzaqkVar2.start();
        }
    }
}
