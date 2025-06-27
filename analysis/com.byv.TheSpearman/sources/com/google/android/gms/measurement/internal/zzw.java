package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzow;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzw {
    private String zza;
    private boolean zzb;
    private zzfu.zzl zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map<Integer, Long> zzf;
    private Map<Integer, List<Long>> zzg;
    private final /* synthetic */ zzu zzh;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzfu$zzc$zza, com.google.android.gms.internal.measurement.zzjv$zza] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.measurement.zzfu$zzl$zza] */
    final zzfu.zzc zza(int i) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? Zzb = zzfu.zzc.zzb();
        Zzb.zza(i);
        Zzb.zza(this.zzb);
        zzfu.zzl zzlVar = this.zzc;
        if (zzlVar != null) {
            Zzb.zza(zzlVar);
        }
        ?? Zzd = zzfu.zzl.zze().zzb(zznr.zza(this.zzd)).zzd(zznr.zza(this.zze));
        if (this.zzf == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.zzf.size());
            Iterator<Integer> it = this.zzf.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                Long l = this.zzf.get(Integer.valueOf(iIntValue));
                if (l != null) {
                    arrayList.add((zzfu.zzd) ((com.google.android.gms.internal.measurement.zzjv) zzfu.zzd.zzc().zza(iIntValue).zza(l.longValue()).zzah()));
                }
            }
        }
        if (arrayList != null) {
            Zzd.zza(arrayList);
        }
        if (this.zzg == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.zzg.size());
            for (Integer num : this.zzg.keySet()) {
                zzfu.zzm.zza zzaVarZza = zzfu.zzm.zzc().zza(num.intValue());
                List<Long> list = this.zzg.get(num);
                if (list != null) {
                    Collections.sort(list);
                    zzaVarZza.zza(list);
                }
                arrayList2.add((zzfu.zzm) ((com.google.android.gms.internal.measurement.zzjv) zzaVarZza.zzah()));
            }
        }
        Zzd.zzc(arrayList2);
        Zzb.zza(Zzd);
        return (zzfu.zzc) ((com.google.android.gms.internal.measurement.zzjv) Zzb.zzah());
    }

    private zzw(zzu zzuVar, String str) {
        this.zzh = zzuVar;
        this.zza = str;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new ArrayMap();
        this.zzg = new ArrayMap();
    }

    private zzw(zzu zzuVar, String str, zzfu.zzl zzlVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.zzh = zzuVar;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new ArrayMap();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.zzg.put(num, arrayList);
            }
        }
        this.zzb = false;
        this.zzc = zzlVar;
    }

    final void zza(zzz zzzVar) {
        int iZza = zzzVar.zza();
        if (zzzVar.zzc != null) {
            this.zze.set(iZza, zzzVar.zzc.booleanValue());
        }
        if (zzzVar.zzd != null) {
            this.zzd.set(iZza, zzzVar.zzd.booleanValue());
        }
        if (zzzVar.zze != null) {
            Long l = this.zzf.get(Integer.valueOf(iZza));
            long jLongValue = zzzVar.zze.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.zzf.put(Integer.valueOf(iZza), Long.valueOf(jLongValue));
            }
        }
        if (zzzVar.zzf != null) {
            List<Long> arrayList = this.zzg.get(Integer.valueOf(iZza));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.zzg.put(Integer.valueOf(iZza), arrayList);
            }
            if (zzzVar.zzc()) {
                arrayList.clear();
            }
            if (zzow.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbj) && zzzVar.zzb()) {
                arrayList.clear();
            }
            if (zzow.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbj)) {
                long jLongValue2 = zzzVar.zzf.longValue() / 1000;
                if (arrayList.contains(Long.valueOf(jLongValue2))) {
                    return;
                }
                arrayList.add(Long.valueOf(jLongValue2));
                return;
            }
            arrayList.add(Long.valueOf(zzzVar.zzf.longValue() / 1000));
        }
    }
}
