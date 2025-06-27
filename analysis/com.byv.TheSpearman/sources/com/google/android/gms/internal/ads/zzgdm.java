package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgdm extends zzgdo {
    zzgdm(zzfzi zzfziVar, boolean z) {
        super(zzfziVar, z);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgdo
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList arrayListZza = zzgad.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgdn zzgdnVar = (zzgdn) it.next();
            arrayListZza.add(zzgdnVar != null ? zzgdnVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZza);
    }
}
