package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhcb {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhcb() {
    }

    static /* bridge */ /* synthetic */ zzgyj zza(zzhcb zzhcbVar, zzgyj zzgyjVar, zzgyj zzgyjVar2) {
        zzhcbVar.zzb(zzgyjVar);
        zzhcbVar.zzb(zzgyjVar2);
        zzgyj zzhcfVar = (zzgyj) zzhcbVar.zza.pop();
        while (!zzhcbVar.zza.isEmpty()) {
            zzhcfVar = new zzhcf((zzgyj) zzhcbVar.zza.pop(), zzhcfVar);
        }
        return zzhcfVar;
    }

    private final void zzb(zzgyj zzgyjVar) {
        zzhce zzhceVar;
        if (!zzgyjVar.zzh()) {
            if (!(zzgyjVar instanceof zzhcf)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgyjVar.getClass()))));
            }
            zzhcf zzhcfVar = (zzhcf) zzgyjVar;
            zzb(zzhcfVar.zzd);
            zzb(zzhcfVar.zze);
            return;
        }
        int iZzc = zzc(zzgyjVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int iZzc2 = zzhcf.zzc(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzgyj) this.zza.peek()).zzd() >= iZzc2) {
            this.zza.push(zzgyjVar);
            return;
        }
        int iZzc3 = zzhcf.zzc(iZzc);
        zzgyj zzhcfVar2 = (zzgyj) this.zza.pop();
        while (true) {
            zzhceVar = null;
            if (this.zza.isEmpty() || ((zzgyj) this.zza.peek()).zzd() >= iZzc3) {
                break;
            } else {
                zzhcfVar2 = new zzhcf((zzgyj) this.zza.pop(), zzhcfVar2);
            }
        }
        zzhcf zzhcfVar3 = new zzhcf(zzhcfVar2, zzgyjVar);
        while (!this.zza.isEmpty()) {
            int iZzc4 = zzc(zzhcfVar3.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.zza;
            if (((zzgyj) arrayDeque2.peek()).zzd() >= zzhcf.zzc(iZzc4)) {
                break;
            } else {
                zzhcfVar3 = new zzhcf((zzgyj) this.zza.pop(), zzhcfVar3);
            }
        }
        this.zza.push(zzhcfVar3);
    }

    private static final int zzc(int i) {
        int iBinarySearch = Arrays.binarySearch(zzhcf.zza, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* synthetic */ zzhcb(zzhca zzhcaVar) {
    }
}
