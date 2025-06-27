package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzur implements zzxa {
    private final zzfzn zza;
    private long zzb;

    public zzur(List list, List list2) {
        zzfzk zzfzkVar = new zzfzk();
        zzek.zzd(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            zzfzkVar.zzf(new zzuq((zzxa) list.get(i), (List) list2.get(i)));
        }
        this.zza = zzfzkVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            zzuq zzuqVar = (zzuq) this.zza.get(i);
            long jZzb = zzuqVar.zzb();
            if ((zzuqVar.zza().contains(1) || zzuqVar.zza().contains(2) || zzuqVar.zza().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.zzb;
        return j != -9223372036854775807L ? j : jMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            long jZzc = ((zzuq) this.zza.get(i)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzm(long j) {
        for (int i = 0; i < this.zza.size(); i++) {
            ((zzuq) this.zza.get(i)).zzm(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxa
    public final boolean zzo(zzlg zzlgVar) {
        boolean zZzo;
        boolean z = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            zZzo = false;
            for (int i = 0; i < this.zza.size(); i++) {
                long jZzc2 = ((zzuq) this.zza.get(i)).zzc();
                boolean z2 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzlgVar.zza;
                if (jZzc2 == jZzc || z2) {
                    zZzo |= ((zzuq) this.zza.get(i)).zzo(zzlgVar);
                }
            }
            z |= zZzo;
        } while (zZzo);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxa
    public final boolean zzp() {
        for (int i = 0; i < this.zza.size(); i++) {
            if (((zzuq) this.zza.get(i)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
