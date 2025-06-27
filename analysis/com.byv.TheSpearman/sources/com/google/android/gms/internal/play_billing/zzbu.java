package com.google.android.gms.internal.play_billing;

import java.util.Comparator;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzbu implements Comparator {
    zzbu() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzcc zzccVar = (zzcc) obj;
        zzcc zzccVar2 = (zzcc) obj2;
        zzbt zzbtVar = new zzbt(zzccVar);
        zzbt zzbtVar2 = new zzbt(zzccVar2);
        while (zzbtVar.hasNext() && zzbtVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzbtVar.zza() & 255).compareTo(Integer.valueOf(zzbtVar2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzccVar.zzd()).compareTo(Integer.valueOf(zzccVar2.zzd()));
    }
}
