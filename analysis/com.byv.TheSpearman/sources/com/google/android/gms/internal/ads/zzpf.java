package com.google.android.gms.internal.ads;

import com.json.t2;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzpf {
    public static final zzpf zza;
    public final int zzb;
    public final int zzc;
    private final zzfzs zzd;

    static {
        zzpf zzpfVar;
        if (zzfx.zza >= 33) {
            zzfzr zzfzrVar = new zzfzr();
            for (int i = 1; i <= 10; i++) {
                zzfzrVar.zzf(Integer.valueOf(zzfx.zzh(i)));
            }
            zzpfVar = new zzpf(2, zzfzrVar.zzi());
        } else {
            zzpfVar = new zzpf(2, 10);
        }
        zza = zzpfVar;
    }

    public zzpf(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public zzpf(int i, Set set) {
        this.zzb = i;
        zzfzs zzfzsVarZzl = zzfzs.zzl(set);
        this.zzd = zzfzsVarZzl;
        zzgbt it = zzfzsVarZzl.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpf)) {
            return false;
        }
        zzpf zzpfVar = (zzpf) obj;
        return this.zzb == zzpfVar.zzb && this.zzc == zzpfVar.zzc && zzfx.zzG(this.zzd, zzpfVar.zzd);
    }

    public final int hashCode() {
        zzfzs zzfzsVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfzsVar == null ? 0 : zzfzsVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + String.valueOf(this.zzd) + t2.i.e;
    }

    public final int zza(int i, zzk zzkVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzfx.zza >= 29) {
            return zzpd.zza(this.zzb, i, zzkVar);
        }
        Integer num = (Integer) zzph.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final boolean zzb(int i) {
        if (this.zzd == null) {
            return i <= this.zzc;
        }
        int iZzh = zzfx.zzh(i);
        if (iZzh == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(iZzh));
    }
}
