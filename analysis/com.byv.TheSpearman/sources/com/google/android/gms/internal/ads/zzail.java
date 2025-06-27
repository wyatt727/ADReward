package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzail {
    private final zzfo zza = new zzfo(8);
    private int zzb;

    private final long zzb(zzadg zzadgVar) throws IOException {
        int i;
        zzact zzactVar = (zzact) zzadgVar;
        int i2 = 0;
        zzactVar.zzm(this.zza.zzM(), 0, 1, false);
        int i3 = this.zza.zzM()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        zzactVar.zzm(this.zza.zzM(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (this.zza.zzM()[i2] & 255) + (i6 << 8);
        }
        this.zzb += i;
        return i6;
    }

    public final boolean zza(zzadg zzadgVar) throws IOException {
        long jZzd = zzadgVar.zzd();
        long j = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j = jZzd;
        }
        zzact zzactVar = (zzact) zzadgVar;
        zzactVar.zzm(this.zza.zzM(), 0, 4, false);
        long jZzu = this.zza.zzu();
        this.zzb = 4;
        while (jZzu != 440786851) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzactVar.zzm(this.zza.zzM(), 0, 1, false);
            jZzu = ((jZzu << 8) & (-256)) | (this.zza.zzM()[0] & 255);
        }
        long jZzb = zzb(zzadgVar);
        long j2 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j3 = j2 + jZzb;
            if (jZzd == -1 || j3 < jZzd) {
                while (true) {
                    long j4 = this.zzb;
                    if (j4 < j3) {
                        if (zzb(zzadgVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzadgVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i3 = (int) jZzb2;
                            zzactVar.zzl(i3, false);
                            this.zzb += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
