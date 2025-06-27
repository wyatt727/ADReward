package com.google.android.gms.internal.ads;

import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzadz {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!zzaea.zzm(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i6 = i4 - 1;
        this.zza = i2;
        this.zzb = zzaea.zza[3 - i3];
        int i7 = zzaea.zzb[i5];
        this.zzd = i7;
        if (i2 == 2) {
            i7 /= 2;
            this.zzd = i7;
        } else if (i2 == 0) {
            i7 /= 4;
            this.zzd = i7;
        }
        int i8 = (i >>> 9) & 1;
        this.zzg = zzaea.zzl(i2, i3);
        if (i3 == 3) {
            int i9 = i2 == 3 ? zzaea.zzc[i6] : zzaea.zzd[i6];
            this.zzf = i9;
            this.zzc = (((i9 * 12) / i7) + i8) * 4;
        } else {
            int i10 = Opcodes.D2F;
            if (i2 == 3) {
                int i11 = i3 == 2 ? zzaea.zze[i6] : zzaea.zzf[i6];
                this.zzf = i11;
                this.zzc = ((i11 * Opcodes.D2F) / i7) + i8;
            } else {
                int i12 = zzaea.zzg[i6];
                this.zzf = i12;
                if (i3 == 1) {
                    i10 = 72;
                }
                this.zzc = ((i10 * i12) / i7) + i8;
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
