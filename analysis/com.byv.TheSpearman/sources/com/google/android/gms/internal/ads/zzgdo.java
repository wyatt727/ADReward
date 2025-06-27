package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzgdo extends zzgdd {

    @CheckForNull
    private List zza;

    zzgdo(zzfzi zzfziVar, boolean z) {
        super(zzfziVar, z, true);
        List listEmptyList = zzfziVar.isEmpty() ? Collections.emptyList() : zzgad.zza(zzfziVar.size());
        for (int i = 0; i < zzfziVar.size(); i++) {
            listEmptyList.add(null);
        }
        this.zza = listEmptyList;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgdd
    final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgdn(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
