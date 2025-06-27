package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhav extends zzhaz {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzhav() {
        super(null);
    }

    /* synthetic */ zzhav(zzhau zzhauVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzhas zzhasVar;
        List list = (List) zzhdh.zzh(obj, j);
        if (list.isEmpty()) {
            List zzhasVar2 = list instanceof zzhat ? new zzhas(i) : ((list instanceof zzhbu) && (list instanceof zzhah)) ? ((zzhah) list).zzf(i) : new ArrayList(i);
            zzhdh.zzv(obj, j, zzhasVar2);
            return zzhasVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzhdh.zzv(obj, j, arrayList);
            zzhasVar = arrayList;
        } else {
            if (!(list instanceof zzhdc)) {
                if (!(list instanceof zzhbu) || !(list instanceof zzhah)) {
                    return list;
                }
                zzhah zzhahVar = (zzhah) list;
                if (zzhahVar.zzc()) {
                    return list;
                }
                zzhah zzhahVarZzf = zzhahVar.zzf(list.size() + i);
                zzhdh.zzv(obj, j, zzhahVarZzf);
                return zzhahVarZzf;
            }
            zzhas zzhasVar3 = new zzhas(list.size() + i);
            zzhasVar3.addAll(zzhasVar3.size(), (zzhdc) list);
            zzhdh.zzv(obj, j, zzhasVar3);
            zzhasVar = zzhasVar3;
        }
        return zzhasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzhdh.zzh(obj, j);
        if (list instanceof zzhat) {
            objUnmodifiableList = ((zzhat) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzhbu) && (list instanceof zzhah)) {
                zzhah zzhahVar = (zzhah) list;
                if (zzhahVar.zzc()) {
                    zzhahVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzhdh.zzv(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzhdh.zzh(obj2, j);
        List listZzf = zzf(obj, j, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzhdh.zzv(obj, j, list);
    }
}
