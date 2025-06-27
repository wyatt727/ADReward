package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzanb implements zzalc {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzanb(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            zzamq zzamqVar = (zzamq) list.get(i);
            long[] jArr = this.zzb;
            int i2 = i + i;
            jArr[i2] = zzamqVar.zzb;
            jArr[i2 + 1] = zzamqVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzalc
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzalc
    public final long zzb(int i) {
        zzek.zzd(i >= 0);
        zzek.zzd(i < this.zzc.length);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzalc
    public final List zzc(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.zza.size(); i++) {
            long[] jArr = this.zzb;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                zzamq zzamqVar = (zzamq) this.zza.get(i);
                zzec zzecVar = zzamqVar.zza;
                if (zzecVar.zzg == -3.4028235E38f) {
                    arrayList2.add(zzamqVar);
                } else {
                    arrayList.add(zzecVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzana
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzamq) obj).zzb, ((zzamq) obj2).zzb);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            zzea zzeaVarZzb = ((zzamq) arrayList2.get(i3)).zza.zzb();
            zzeaVarZzb.zze((-1) - i3, 1);
            arrayList.add(zzeaVarZzb.zzp());
        }
        return arrayList;
    }
}
