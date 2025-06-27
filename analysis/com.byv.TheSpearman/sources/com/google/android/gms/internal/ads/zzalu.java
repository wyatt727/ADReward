package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzalu {
    private final zzfo zza = new zzfo();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static /* bridge */ /* synthetic */ void zzb(zzalu zzaluVar, zzfo zzfoVar, int i) {
        int iZzo;
        if (i < 4) {
            return;
        }
        zzfoVar.zzL(3);
        int i2 = i - 4;
        if ((zzfoVar.zzm() & 128) != 0) {
            if (i2 < 7 || (iZzo = zzfoVar.zzo()) < 4) {
                return;
            }
            zzaluVar.zzh = zzfoVar.zzq();
            zzaluVar.zzi = zzfoVar.zzq();
            zzaluVar.zza.zzH(iZzo - 4);
            i2 -= 7;
        }
        zzfo zzfoVar2 = zzaluVar.zza;
        int iZzd = zzfoVar2.zzd();
        int iZze = zzfoVar2.zze();
        if (iZzd >= iZze || i2 <= 0) {
            return;
        }
        int iMin = Math.min(i2, iZze - iZzd);
        zzfoVar.zzG(zzfoVar2.zzM(), iZzd, iMin);
        zzaluVar.zza.zzK(iZzd + iMin);
    }

    static /* bridge */ /* synthetic */ void zzc(zzalu zzaluVar, zzfo zzfoVar, int i) {
        if (i < 19) {
            return;
        }
        zzaluVar.zzd = zzfoVar.zzq();
        zzaluVar.zze = zzfoVar.zzq();
        zzfoVar.zzL(11);
        zzaluVar.zzf = zzfoVar.zzq();
        zzaluVar.zzg = zzfoVar.zzq();
    }

    static /* bridge */ /* synthetic */ void zzd(zzalu zzaluVar, zzfo zzfoVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzfoVar.zzL(2);
        int i2 = 0;
        Arrays.fill(zzaluVar.zzb, 0);
        int i3 = i / 5;
        int i4 = 0;
        while (i4 < i3) {
            int iZzm = zzfoVar.zzm();
            int iZzm2 = zzfoVar.zzm();
            int iZzm3 = zzfoVar.zzm();
            int iZzm4 = zzfoVar.zzm();
            int iZzm5 = zzfoVar.zzm();
            double d = iZzm2;
            int[] iArr = zzaluVar.zzb;
            double d2 = iZzm3 - 128;
            int iMax = Math.max(i2, Math.min((int) ((1.402d * d2) + d), 255)) << 16;
            double d3 = iZzm4 - 128;
            iArr[iZzm] = Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)) | (iZzm5 << 24) | iMax | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
            i4++;
            i2 = 0;
        }
        zzaluVar.zzc = true;
    }

    public final zzec zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzfo zzfoVar = this.zza;
        if (zzfoVar.zze() == 0 || zzfoVar.zzd() != zzfoVar.zze() || !this.zzc) {
            return null;
        }
        zzfoVar.zzK(0);
        int i2 = this.zzh * this.zzi;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int iZzm = this.zza.zzm();
            if (iZzm != 0) {
                i = i3 + 1;
                iArr[i3] = this.zzb[iZzm];
            } else {
                int iZzm2 = this.zza.zzm();
                if (iZzm2 != 0) {
                    int iZzm3 = iZzm2 & 63;
                    if ((iZzm2 & 64) != 0) {
                        iZzm3 = (iZzm3 << 8) | this.zza.zzm();
                    }
                    i = iZzm3 + i3;
                    Arrays.fill(iArr, i3, i, (iZzm2 & 128) == 0 ? 0 : this.zzb[this.zza.zzm()]);
                }
            }
            i3 = i;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzea zzeaVar = new zzea();
        zzeaVar.zzc(bitmapCreateBitmap);
        zzeaVar.zzh(this.zzf / this.zzd);
        zzeaVar.zzi(0);
        zzeaVar.zze(this.zzg / this.zze, 0);
        zzeaVar.zzf(0);
        zzeaVar.zzk(this.zzh / this.zzd);
        zzeaVar.zzd(this.zzi / this.zze);
        return zzeaVar.zzp();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzH(0);
        this.zzc = false;
    }
}
