package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdv {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzdv(int i, int i2, float f, float f2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i / i3;
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        int i5 = i4 + i4;
        this.zzh = i5;
        this.zzi = new short[i5];
        int i6 = i5 * i2;
        this.zzj = new short[i6];
        this.zzl = new short[i6];
        this.zzn = new short[i6];
    }

    private final int zzg(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = this.zzb * i;
                iAbs += Math.abs(sArr[i9 + i8] - sArr[(i9 + i2) + i8]);
            }
            int i10 = iAbs * i6;
            int i11 = i4 * i2;
            if (i10 < i11) {
                i4 = iAbs;
            }
            if (i10 < i11) {
                i6 = i2;
            }
            int i12 = iAbs * i5;
            int i13 = i7 * i2;
            if (i12 > i13) {
                i7 = iAbs;
            }
            if (i12 > i13) {
                i5 = i2;
            }
            i2++;
        }
        this.zzu = i4 / i6;
        this.zzv = i7 / i5;
        return i6;
    }

    private final void zzh(short[] sArr, int i, int i2) {
        short[] sArrZzl = zzl(this.zzl, this.zzm, i2);
        this.zzl = sArrZzl;
        int i3 = this.zzm;
        int i4 = this.zzb;
        System.arraycopy(sArr, i * i4, sArrZzl, i3 * i4, i2 * i4);
        this.zzm += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.zzh / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.zzb;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.zzi[i4] = (short) (i6 / i3);
        }
    }

    private static void zzj(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    private final short[] zzl(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.zzb;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int zza() {
        int i = this.zzm * this.zzb;
        return i + i;
    }

    public final int zzb() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * iMin);
        int i = this.zzm - iMin;
        this.zzm = i;
        int i2 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    public final void zze() {
        int i;
        int i2 = this.zzk;
        int i3 = this.zzm;
        float f = this.zzo;
        float f2 = this.zzc;
        float f3 = this.zze;
        float f4 = this.zzd;
        int i4 = i3 + ((int) ((((i2 / (f2 / f4)) + f) / (f3 * f4)) + 0.5f));
        int i5 = this.zzh;
        this.zzj = zzl(this.zzj, i2, i5 + i5 + i2);
        int i6 = 0;
        while (true) {
            int i7 = this.zzh;
            int i8 = this.zzb;
            i = i7 + i7;
            if (i6 >= i * i8) {
                break;
            }
            this.zzj[(i8 * i2) + i6] = 0;
            i6++;
        }
        this.zzk += i;
        zzk();
        if (this.zzm > i4) {
            this.zzm = i4;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = iRemaining / i;
        int i3 = i * i2;
        short[] sArrZzl = zzl(this.zzj, this.zzk, i2);
        this.zzj = sArrZzl;
        shortBuffer.get(sArrZzl, this.zzk * this.zzb, (i3 + i3) / 2);
        this.zzk += i2;
        zzk();
    }

    private final void zzk() {
        int iZzg;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f = this.zzc / this.zzd;
        double d = f;
        int i8 = this.zzm;
        if (d > 1.00001d || d < 0.99999d) {
            int i9 = this.zzk;
            if (i9 >= this.zzh) {
                int i10 = 0;
                do {
                    int i11 = this.zzr;
                    if (i11 > 0) {
                        int iMin = Math.min(this.zzh, i11);
                        zzh(this.zzj, i10, iMin);
                        this.zzr -= iMin;
                        i10 += iMin;
                    } else {
                        short[] sArr = this.zzj;
                        int i12 = this.zza;
                        int i13 = i12 > 4000 ? i12 / 4000 : 1;
                        if (this.zzb == 1 && i13 == 1) {
                            iZzg = zzg(sArr, i10, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i10, i13);
                            int iZzg2 = zzg(this.zzi, 0, this.zzf / i13, this.zzg / i13);
                            if (i13 != 1) {
                                int i14 = iZzg2 * i13;
                                int i15 = i13 * 4;
                                int i16 = this.zzf;
                                int i17 = i14 - i15;
                                if (i17 >= i16) {
                                    i16 = i17;
                                }
                                int i18 = i14 + i15;
                                int i19 = this.zzg;
                                if (i18 > i19) {
                                    i18 = i19;
                                }
                                if (this.zzb == 1) {
                                    iZzg = zzg(sArr, i10, i16, i18);
                                } else {
                                    zzi(sArr, i10, 1);
                                    iZzg = zzg(this.zzi, 0, i16, i18);
                                }
                            } else {
                                iZzg = iZzg2;
                            }
                        }
                        int i20 = this.zzu;
                        int i21 = (i20 == 0 || (i3 = this.zzs) == 0 || this.zzv > i20 * 3 || i20 + i20 <= this.zzt * 3) ? iZzg : i3;
                        int i22 = i10 + i21;
                        this.zzt = i20;
                        this.zzs = iZzg;
                        float f2 = i21;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzj;
                            float f3 = (-1.0f) + f;
                            if (f >= 2.0f) {
                                i2 = (int) (f2 / f3);
                            } else {
                                this.zzr = (int) ((f2 * (2.0f - f)) / f3);
                                i2 = i21;
                            }
                            short[] sArrZzl = zzl(this.zzl, this.zzm, i2);
                            this.zzl = sArrZzl;
                            int i23 = i2;
                            zzj(i2, this.zzb, sArrZzl, this.zzm, sArr2, i10, sArr2, i22);
                            this.zzm += i23;
                            i10 += i21 + i23;
                        } else {
                            int i24 = i21;
                            short[] sArr3 = this.zzj;
                            float f4 = 1.0f - f;
                            if (f < 0.5f) {
                                i = (int) ((f2 * f) / f4);
                            } else {
                                this.zzr = (int) ((f2 * ((f + f) - 1.0f)) / f4);
                                i = i24;
                            }
                            int i25 = i24 + i;
                            short[] sArrZzl2 = zzl(this.zzl, this.zzm, i25);
                            this.zzl = sArrZzl2;
                            int i26 = this.zzb;
                            System.arraycopy(sArr3, i10 * i26, sArrZzl2, this.zzm * i26, i26 * i24);
                            zzj(i, this.zzb, this.zzl, this.zzm + i24, sArr3, i22, sArr3, i10);
                            this.zzm += i25;
                            i10 += i;
                        }
                    }
                } while (this.zzh + i10 <= i9);
                int i27 = this.zzk - i10;
                short[] sArr4 = this.zzj;
                int i28 = this.zzb;
                System.arraycopy(sArr4, i10 * i28, sArr4, 0, i28 * i27);
                this.zzk = i27;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        float f5 = this.zze * this.zzd;
        if (f5 == 1.0f || this.zzm == i8) {
            return;
        }
        int i29 = this.zza;
        int i30 = (int) (i29 / f5);
        while (true) {
            if (i30 <= 16384 && i29 <= 16384) {
                break;
            }
            i30 /= 2;
            i29 /= 2;
        }
        int i31 = this.zzm - i8;
        short[] sArrZzl3 = zzl(this.zzn, this.zzo, i31);
        this.zzn = sArrZzl3;
        short[] sArr5 = this.zzl;
        int i32 = this.zzb;
        System.arraycopy(sArr5, i8 * i32, sArrZzl3, this.zzo * i32, i32 * i31);
        this.zzm = i8;
        this.zzo += i31;
        int i33 = 0;
        while (true) {
            i4 = this.zzo;
            i5 = i4 - 1;
            if (i33 >= i5) {
                break;
            }
            while (true) {
                i6 = this.zzp + 1;
                int i34 = i6 * i30;
                i7 = this.zzq;
                if (i34 <= i7 * i29) {
                    break;
                }
                this.zzl = zzl(this.zzl, this.zzm, 1);
                int i35 = 0;
                while (true) {
                    int i36 = this.zzb;
                    if (i35 < i36) {
                        short[] sArr6 = this.zzl;
                        int i37 = this.zzm * i36;
                        short[] sArr7 = this.zzn;
                        int i38 = (i33 * i36) + i35;
                        short s = sArr7[i38];
                        short s2 = sArr7[i38 + i36];
                        int i39 = this.zzq * i29;
                        int i40 = this.zzp;
                        int i41 = i40 * i30;
                        int i42 = (i40 + 1) * i30;
                        int i43 = i42 - i39;
                        int i44 = i42 - i41;
                        sArr6[i37 + i35] = (short) (((s * i43) + ((i44 - i43) * s2)) / i44);
                        i35++;
                    }
                }
                this.zzq++;
                this.zzm++;
            }
            this.zzp = i6;
            if (i6 == i29) {
                this.zzp = 0;
                zzek.zzf(i7 == i30);
                this.zzq = 0;
            }
            i33++;
        }
        if (i5 != 0) {
            short[] sArr8 = this.zzn;
            int i45 = this.zzb;
            System.arraycopy(sArr8, i5 * i45, sArr8, 0, (i4 - i5) * i45);
            this.zzo -= i5;
        }
    }
}
