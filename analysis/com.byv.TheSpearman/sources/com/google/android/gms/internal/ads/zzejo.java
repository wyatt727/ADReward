package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzejo {
    private final zzgex zzc;
    private zzeke zzf;
    private final String zzh;
    private final int zzi;
    private final zzekd zzj;
    private zzffn zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Integer.MAX_VALUE;

    zzejo(zzffz zzffzVar, zzekd zzekdVar, zzgex zzgexVar) {
        this.zzi = zzffzVar.zzb.zzb.zzq;
        this.zzj = zzekdVar;
        this.zzc = zzgexVar;
        this.zzh = zzekk.zzc(zzffzVar);
        List list = zzffzVar.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((zzffn) list.get(i), Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zzf() {
        this.zzj.zzi(this.zzk);
        zzeke zzekeVar = this.zzf;
        if (zzekeVar != null) {
            this.zzc.zzc(zzekeVar);
        } else {
            this.zzc.zzd(new zzekh(3, this.zzh));
        }
    }

    private final synchronized boolean zzg(boolean z) {
        for (zzffn zzffnVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzffnVar);
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            if (z || !this.zze.contains(zzffnVar.zzat)) {
                if (numValueOf.intValue() < this.zzg) {
                    return true;
                }
                if (numValueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        boolean z;
        Iterator it = this.zzd.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Integer num = (Integer) this.zza.get((zzffn) it.next());
            if (Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE).intValue() < this.zzg) {
                z = true;
                break;
            }
        }
        return z;
    }

    private final synchronized boolean zzi() {
        if (!zzg(true)) {
            if (!zzh()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    final synchronized zzffn zza() {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzffn zzffnVar = (zzffn) this.zzb.get(i);
            String str = zzffnVar.zzat;
            if (!this.zze.contains(str)) {
                if (!TextUtils.isEmpty(str)) {
                    this.zze.add(str);
                }
                this.zzd.add(zzffnVar);
                return (zzffn) this.zzb.remove(i);
            }
        }
        return null;
    }

    final synchronized void zzb(Throwable th, zzffn zzffnVar) {
        this.zzd.remove(zzffnVar);
        this.zze.remove(zzffnVar.zzat);
        if (zzd() || zzi()) {
            return;
        }
        zzf();
    }

    final synchronized void zzc(zzeke zzekeVar, zzffn zzffnVar) {
        this.zzd.remove(zzffnVar);
        if (zzd()) {
            zzekeVar.zzq();
            return;
        }
        Integer num = (Integer) this.zza.get(zzffnVar);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        if (numValueOf.intValue() > this.zzg) {
            this.zzj.zzm(zzffnVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = numValueOf.intValue();
        this.zzf = zzekeVar;
        this.zzk = zzffnVar;
        if (zzi()) {
            return;
        }
        zzf();
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }

    final synchronized boolean zze() {
        if (!zzd()) {
            List list = this.zzd;
            if (list.size() < this.zzi) {
                if (zzg(false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
