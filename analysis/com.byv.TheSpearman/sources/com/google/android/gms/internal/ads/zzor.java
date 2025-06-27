package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzor {
    private final zzcu zza;
    private zzfzn zzb = zzfzn.zzm();
    private zzfzq zzc = zzfzq.zzd();
    private zzvh zzd;
    private zzvh zze;
    private zzvh zzf;

    public zzor(zzcu zzcuVar) {
        this.zza = zzcuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzvh zzj(zzco zzcoVar, zzfzn zzfznVar, zzvh zzvhVar, zzcu zzcuVar) {
        zzcx zzcxVarZzn = zzcoVar.zzn();
        int iZze = zzcoVar.zze();
        Object objZzf = zzcxVarZzn.zzo() ? null : zzcxVarZzn.zzf(iZze);
        int iZzc = (zzcoVar.zzx() || zzcxVarZzn.zzo()) ? -1 : zzcxVarZzn.zzd(iZze, zzcuVar, false).zzc(zzfx.zzr(zzcoVar.zzk()));
        for (int i = 0; i < zzfznVar.size(); i++) {
            zzvh zzvhVar2 = (zzvh) zzfznVar.get(i);
            if (zzm(zzvhVar2, objZzf, zzcoVar.zzx(), zzcoVar.zzb(), zzcoVar.zzc(), iZzc)) {
                return zzvhVar2;
            }
        }
        if (zzfznVar.isEmpty() && zzvhVar != null) {
            if (zzm(zzvhVar, objZzf, zzcoVar.zzx(), zzcoVar.zzb(), zzcoVar.zzc(), iZzc)) {
                return zzvhVar;
            }
        }
        return null;
    }

    private final void zzk(zzfzp zzfzpVar, zzvh zzvhVar, zzcx zzcxVar) {
        if (zzvhVar == null) {
            return;
        }
        if (zzcxVar.zza(zzvhVar.zza) != -1) {
            zzfzpVar.zza(zzvhVar, zzcxVar);
            return;
        }
        zzcx zzcxVar2 = (zzcx) this.zzc.get(zzvhVar);
        if (zzcxVar2 != null) {
            zzfzpVar.zza(zzvhVar, zzcxVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzl(zzcx zzcxVar) {
        zzfzp zzfzpVar = new zzfzp();
        if (this.zzb.isEmpty()) {
            zzk(zzfzpVar, this.zze, zzcxVar);
            if (!zzfwl.zza(this.zzf, this.zze)) {
                zzk(zzfzpVar, this.zzf, zzcxVar);
            }
            if (!zzfwl.zza(this.zzd, this.zze) && !zzfwl.zza(this.zzd, this.zzf)) {
                zzk(zzfzpVar, this.zzd, zzcxVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfzpVar, (zzvh) this.zzb.get(i), zzcxVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfzpVar, this.zzd, zzcxVar);
            }
        }
        this.zzc = zzfzpVar.zzc();
    }

    private static boolean zzm(zzvh zzvhVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzvhVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzvhVar.zzb != i || zzvhVar.zzc != i2) {
                return false;
            }
        } else if (zzvhVar.zzb != -1 || zzvhVar.zze != i3) {
            return false;
        }
        return true;
    }

    public final zzcx zza(zzvh zzvhVar) {
        return (zzcx) this.zzc.get(zzvhVar);
    }

    public final zzvh zzb() {
        return this.zzd;
    }

    public final zzvh zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfzn zzfznVar = this.zzb;
        if (!(zzfznVar instanceof List)) {
            Iterator<E> it = zzfznVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzfznVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzfznVar.get(zzfznVar.size() - 1);
        }
        return (zzvh) obj;
    }

    public final zzvh zzd() {
        return this.zze;
    }

    public final zzvh zze() {
        return this.zzf;
    }

    public final void zzg(zzco zzcoVar) {
        this.zzd = zzj(zzcoVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzvh zzvhVar, zzco zzcoVar) {
        this.zzb = zzfzn.zzk(list);
        if (!list.isEmpty()) {
            this.zze = (zzvh) list.get(0);
            Objects.requireNonNull(zzvhVar);
            this.zzf = zzvhVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcoVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcoVar.zzn());
    }

    public final void zzi(zzco zzcoVar) {
        this.zzd = zzj(zzcoVar, this.zzb, this.zze, this.zza);
        zzl(zzcoVar.zzn());
    }
}
