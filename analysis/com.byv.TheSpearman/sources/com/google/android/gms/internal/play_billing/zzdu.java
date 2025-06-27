package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzdu extends zzdy {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzdu() {
        super(null);
    }

    /* synthetic */ zzdu(zzdt zzdtVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    final void zza(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzfw.zzf(obj, j);
        if (list instanceof zzds) {
            objUnmodifiableList = ((zzds) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzer) && (list instanceof zzdk)) {
                zzdk zzdkVar = (zzdk) list;
                if (zzdkVar.zzc()) {
                    zzdkVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzfw.zzs(obj, j, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzdy
    final void zzb(Object obj, Object obj2, long j) {
        zzdr zzdrVar;
        List list = (List) zzfw.zzf(obj2, j);
        int size = list.size();
        List listZzd = (List) zzfw.zzf(obj, j);
        if (listZzd.isEmpty()) {
            listZzd = listZzd instanceof zzds ? new zzdr(size) : ((listZzd instanceof zzer) && (listZzd instanceof zzdk)) ? ((zzdk) listZzd).zzd(size) : new ArrayList(size);
            zzfw.zzs(obj, j, listZzd);
        } else {
            if (zza.isAssignableFrom(listZzd.getClass())) {
                ArrayList arrayList = new ArrayList(listZzd.size() + size);
                arrayList.addAll(listZzd);
                zzfw.zzs(obj, j, arrayList);
                zzdrVar = arrayList;
            } else if (listZzd instanceof zzfr) {
                zzdr zzdrVar2 = new zzdr(listZzd.size() + size);
                zzdrVar2.addAll(zzdrVar2.size(), (zzfr) listZzd);
                zzfw.zzs(obj, j, zzdrVar2);
                zzdrVar = zzdrVar2;
            } else if ((listZzd instanceof zzer) && (listZzd instanceof zzdk)) {
                zzdk zzdkVar = (zzdk) listZzd;
                if (!zzdkVar.zzc()) {
                    listZzd = zzdkVar.zzd(listZzd.size() + size);
                    zzfw.zzs(obj, j, listZzd);
                }
            }
            listZzd = zzdrVar;
        }
        int size2 = listZzd.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listZzd.addAll(list);
        }
        if (size2 > 0) {
            list = listZzd;
        }
        zzfw.zzs(obj, j, list);
    }
}
