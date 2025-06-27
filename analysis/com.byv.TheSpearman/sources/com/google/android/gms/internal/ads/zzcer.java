package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcer implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    final zzceq zza(zzcdn zzcdnVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzceq zzceqVar = (zzceq) it.next();
            if (zzceqVar.zza == zzcdnVar) {
                return zzceqVar;
            }
        }
        return null;
    }

    public final void zzb(zzceq zzceqVar) {
        this.zza.add(zzceqVar);
    }

    public final void zzc(zzceq zzceqVar) {
        this.zza.remove(zzceqVar);
    }

    public final boolean zzd(zzcdn zzcdnVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzceq zzceqVar = (zzceq) it.next();
            if (zzceqVar.zza == zzcdnVar) {
                arrayList.add(zzceqVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzceq) it2.next()).zzb.zzf();
        }
        return true;
    }
}
