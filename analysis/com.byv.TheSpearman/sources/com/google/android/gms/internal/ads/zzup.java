package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzup extends zzuh {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhy zzc;

    protected zzup() {
    }

    protected abstract void zzA(Object obj, zzvj zzvjVar, zzcx zzcxVar);

    protected final void zzB(final Object obj, zzvj zzvjVar) {
        zzek.zzd(!this.zza.containsKey(obj));
        zzvi zzviVar = new zzvi() { // from class: com.google.android.gms.internal.ads.zzum
            @Override // com.google.android.gms.internal.ads.zzvi
            public final void zza(zzvj zzvjVar2, zzcx zzcxVar) {
                this.zza.zzA(obj, zzvjVar2, zzcxVar);
            }
        };
        zzun zzunVar = new zzun(this, obj);
        this.zza.put(obj, new zzuo(zzvjVar, zzviVar, zzunVar));
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        zzvjVar.zzh(handler, zzunVar);
        Handler handler2 = this.zzb;
        Objects.requireNonNull(handler2);
        zzvjVar.zzg(handler2, zzunVar);
        zzvjVar.zzm(zzviVar, this.zzc, zzb());
        if (zzu()) {
            return;
        }
        zzvjVar.zzi(zzviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    protected final void zzj() {
        for (zzuo zzuoVar : this.zza.values()) {
            zzuoVar.zza.zzi(zzuoVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    protected final void zzl() {
        for (zzuo zzuoVar : this.zza.values()) {
            zzuoVar.zza.zzk(zzuoVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    protected void zzn(zzhy zzhyVar) {
        this.zzc = zzhyVar;
        this.zzb = zzfx.zzx(null);
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    protected void zzq() {
        for (zzuo zzuoVar : this.zza.values()) {
            zzuoVar.zza.zzp(zzuoVar.zzb);
            zzuoVar.zza.zzs(zzuoVar.zzc);
            zzuoVar.zza.zzr(zzuoVar.zzc);
        }
        this.zza.clear();
    }

    protected int zzw(Object obj, int i) {
        return 0;
    }

    protected long zzx(Object obj, long j, zzvh zzvhVar) {
        return j;
    }

    protected zzvh zzy(Object obj, zzvh zzvhVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public void zzz() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzuo) it.next()).zza.zzz();
        }
    }
}
