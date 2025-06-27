package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzsg {
    public final int zza;
    public final zzvh zzb;
    private final CopyOnWriteArrayList zzc;

    public zzsg() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzsg(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzvh zzvhVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzvhVar;
    }

    public final zzsg zza(int i, zzvh zzvhVar) {
        return new zzsg(this.zzc, 0, zzvhVar);
    }

    public final void zzb(Handler handler, zzsh zzshVar) {
        this.zzc.add(new zzsf(handler, zzshVar));
    }

    public final void zzc(zzsh zzshVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsf zzsfVar = (zzsf) it.next();
            if (zzsfVar.zzb == zzshVar) {
                this.zzc.remove(zzsfVar);
            }
        }
    }
}
