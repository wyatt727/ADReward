package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzks extends zzkn {
    private static <E> zzke<E> zzc(Object obj, long j) {
        return (zzke) zznb.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    final <L> List<L> zza(Object obj, long j) {
        zzke zzkeVarZzc = zzc(obj, j);
        if (zzkeVarZzc.zzc()) {
            return zzkeVarZzc;
        }
        int size = zzkeVarZzc.size();
        zzke zzkeVarZza = zzkeVarZzc.zza(size == 0 ? 10 : size << 1);
        zznb.zza(obj, j, zzkeVarZza);
        return zzkeVarZza;
    }

    private zzks() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    final <E> void zza(Object obj, Object obj2, long j) {
        zzke zzkeVarZzc = zzc(obj, j);
        zzke zzkeVarZzc2 = zzc(obj2, j);
        int size = zzkeVarZzc.size();
        int size2 = zzkeVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkeVarZzc.zzc()) {
                zzkeVarZzc = zzkeVarZzc.zza(size2 + size);
            }
            zzkeVarZzc.addAll(zzkeVarZzc2);
        }
        if (size > 0) {
            zzkeVarZzc2 = zzkeVarZzc;
        }
        zznb.zza(obj, j, zzkeVarZzc2);
    }
}
