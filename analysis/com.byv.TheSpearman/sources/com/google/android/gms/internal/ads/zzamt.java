package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzamt {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzamr
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((zzamt) obj).zzb.zzb, ((zzamt) obj2).zzb.zzb);
        }
    };
    private final zzamu zzb;
    private final int zzc;

    /* synthetic */ zzamt(zzamu zzamuVar, int i, zzams zzamsVar) {
        this.zzb = zzamuVar;
        this.zzc = i;
    }
}
