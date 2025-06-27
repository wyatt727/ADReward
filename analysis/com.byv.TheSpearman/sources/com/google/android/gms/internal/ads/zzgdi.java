package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgdi extends zzgdf {
    private zzgdi() {
        super(null);
    }

    /* synthetic */ zzgdi(zzgdh zzgdhVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    final int zza(zzgdj zzgdjVar) {
        int i;
        synchronized (zzgdjVar) {
            i = zzgdjVar.remaining - 1;
            zzgdjVar.remaining = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    final void zzb(zzgdj zzgdjVar, @CheckForNull Set set, Set set2) {
        synchronized (zzgdjVar) {
            if (zzgdjVar.seenExceptions == null) {
                zzgdjVar.seenExceptions = set2;
            }
        }
    }
}
