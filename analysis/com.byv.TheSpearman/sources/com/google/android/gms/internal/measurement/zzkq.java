package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzkq extends zzkn {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zznb.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzkl zzklVar;
        List<L> arrayList;
        List<L> listZzc = zzc(obj, j);
        if (listZzc.isEmpty()) {
            if (listZzc instanceof zzko) {
                arrayList = new zzkl(i);
            } else if ((listZzc instanceof zzlu) && (listZzc instanceof zzke)) {
                arrayList = ((zzke) listZzc).zza(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zznb.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(listZzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(listZzc.size() + i);
            arrayList2.addAll(listZzc);
            zznb.zza(obj, j, arrayList2);
            zzklVar = arrayList2;
        } else if (listZzc instanceof zzna) {
            zzkl zzklVar2 = new zzkl(listZzc.size() + i);
            zzklVar2.addAll((zzna) listZzc);
            zznb.zza(obj, j, zzklVar2);
            zzklVar = zzklVar2;
        } else {
            if (!(listZzc instanceof zzlu) || !(listZzc instanceof zzke)) {
                return listZzc;
            }
            zzke zzkeVar = (zzke) listZzc;
            if (zzkeVar.zzc()) {
                return listZzc;
            }
            zzke zzkeVarZza = zzkeVar.zza(listZzc.size() + i);
            zznb.zza(obj, j, zzkeVarZza);
            return zzkeVarZza;
        }
        return zzklVar;
    }

    private zzkq() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zznb.zze(obj, j);
        if (list instanceof zzko) {
            objUnmodifiableList = ((zzko) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzlu) && (list instanceof zzke)) {
                zzke zzkeVar = (zzke) list;
                if (zzkeVar.zzc()) {
                    zzkeVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zznb.zza(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    final <E> void zza(Object obj, Object obj2, long j) {
        List listZzc = zzc(obj2, j);
        List listZza = zza(obj, j, listZzc.size());
        int size = listZza.size();
        int size2 = listZzc.size();
        if (size > 0 && size2 > 0) {
            listZza.addAll(listZzc);
        }
        if (size > 0) {
            listZzc = listZza;
        }
        zznb.zza(obj, j, listZzc);
    }
}
