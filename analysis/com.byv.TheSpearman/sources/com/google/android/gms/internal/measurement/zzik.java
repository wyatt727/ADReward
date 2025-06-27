package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzik implements Comparator<zzii> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzii zziiVar, zzii zziiVar2) {
        zzii zziiVar3 = zziiVar;
        zzii zziiVar4 = zziiVar2;
        zzio zzioVar = (zzio) zziiVar3.iterator();
        zzio zzioVar2 = (zzio) zziiVar4.iterator();
        while (zzioVar.hasNext() && zzioVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzii.zza(zzioVar.zza())).compareTo(Integer.valueOf(zzii.zza(zzioVar2.zza())));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zziiVar3.zzb()).compareTo(Integer.valueOf(zziiVar4.zzb()));
    }

    zzik() {
    }
}
