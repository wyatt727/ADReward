package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgl {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzek.zzf(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zzf(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zzf(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zzf(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    zzf(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static zzgi zzc(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iZzb;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        zzgm zzgmVar = new zzgm(bArr, i, i2);
        int i11 = 4;
        zzgmVar.zze(4);
        int iZza = zzgmVar.zza(3);
        zzgmVar.zzd();
        int iZza2 = zzgmVar.zza(2);
        boolean zZzf = zzgmVar.zzf();
        int iZza3 = zzgmVar.zza(5);
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (zzgmVar.zzf()) {
                i12 |= 1 << i13;
            }
        }
        int i14 = 6;
        int[] iArr2 = new int[6];
        for (int i15 = 0; i15 < 6; i15++) {
            iArr2[i15] = zzgmVar.zza(8);
        }
        int iZza4 = zzgmVar.zza(8);
        int i16 = 0;
        for (int i17 = 0; i17 < iZza; i17++) {
            if (zzgmVar.zzf()) {
                i16 += 89;
            }
            if (zzgmVar.zzf()) {
                i16 += 8;
            }
        }
        zzgmVar.zze(i16);
        if (iZza > 0) {
            int i18 = 8 - iZza;
            zzgmVar.zze(i18 + i18);
        }
        int iZzc = zzgmVar.zzc();
        int iZzc2 = zzgmVar.zzc();
        if (iZzc2 == 3) {
            zzgmVar.zzd();
            iZzc2 = 3;
        }
        int iZzc3 = zzgmVar.zzc();
        int iZzc4 = zzgmVar.zzc();
        if (zzgmVar.zzf()) {
            int iZzc5 = zzgmVar.zzc();
            int iZzc6 = zzgmVar.zzc();
            int iZzc7 = zzgmVar.zzc();
            int iZzc8 = zzgmVar.zzc();
            if (iZzc2 == 1) {
                i10 = 2;
            } else if (iZzc2 == 2) {
                iZzc2 = 2;
                i10 = 2;
            } else {
                i10 = 1;
            }
            iZzc3 -= i10 * (iZzc5 + iZzc6);
            iZzc4 -= (iZzc2 == 1 ? 2 : 1) * (iZzc7 + iZzc8);
        }
        int i19 = iZzc3;
        int i20 = iZzc2;
        int i21 = iZzc4;
        int iZzc9 = zzgmVar.zzc();
        int iZzc10 = zzgmVar.zzc();
        int iZzc11 = zzgmVar.zzc();
        for (int i22 = true != zzgmVar.zzf() ? iZza : 0; i22 <= iZza; i22++) {
            zzgmVar.zzc();
            zzgmVar.zzc();
            zzgmVar.zzc();
        }
        zzgmVar.zzc();
        zzgmVar.zzc();
        zzgmVar.zzc();
        zzgmVar.zzc();
        zzgmVar.zzc();
        zzgmVar.zzc();
        if (zzgmVar.zzf() && zzgmVar.zzf()) {
            int i23 = 0;
            while (i23 < i11) {
                int i24 = 0;
                while (i24 < i14) {
                    if (zzgmVar.zzf()) {
                        int iMin = Math.min(64, 1 << ((i23 + i23) + 4));
                        if (i23 > 1) {
                            zzgmVar.zzb();
                        }
                        for (int i25 = 0; i25 < iMin; i25++) {
                            zzgmVar.zzb();
                        }
                    } else {
                        zzgmVar.zzc();
                    }
                    i24 += i23 == 3 ? 3 : 1;
                    i14 = 6;
                }
                i23++;
                i11 = 4;
                i14 = 6;
            }
        }
        zzgmVar.zze(2);
        if (zzgmVar.zzf()) {
            zzgmVar.zze(8);
            zzgmVar.zzc();
            zzgmVar.zzc();
            zzgmVar.zzd();
        }
        int iZzc12 = zzgmVar.zzc();
        int i26 = 0;
        int[] iArr3 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        while (i26 < iZzc12) {
            if (i26 == 0 || !zzgmVar.zzf()) {
                i6 = iZzc12;
                i7 = i12;
                i8 = i20;
                iArr = iArr2;
                int iZzc13 = zzgmVar.zzc();
                int iZzc14 = zzgmVar.zzc();
                int[] iArr4 = new int[iZzc13];
                int i30 = 0;
                while (i30 < iZzc13) {
                    iArr4[i30] = (i30 > 0 ? iArr4[i30 - 1] : 0) - (zzgmVar.zzc() + 1);
                    zzgmVar.zzd();
                    i30++;
                }
                int[] iArr5 = new int[iZzc14];
                int i31 = 0;
                while (i31 < iZzc14) {
                    iArr5[i31] = (i31 > 0 ? iArr5[i31 - 1] : 0) + zzgmVar.zzc() + 1;
                    zzgmVar.zzd();
                    i31++;
                }
                i29 = iZzc14;
                iArrCopyOf = iArr5;
                i28 = iZzc13;
                iArr3 = iArr4;
            } else {
                int i32 = i28 + i29;
                boolean zZzf2 = zzgmVar.zzf();
                int iZzc15 = zzgmVar.zzc() + 1;
                int i33 = 1 - ((zZzf2 ? 1 : 0) + (zZzf2 ? 1 : 0));
                int i34 = i32 + 1;
                i6 = iZzc12;
                boolean[] zArr = new boolean[i34];
                iArr = iArr2;
                for (int i35 = 0; i35 <= i32; i35++) {
                    if (zzgmVar.zzf()) {
                        zArr[i35] = true;
                    } else {
                        zArr[i35] = zzgmVar.zzf();
                    }
                }
                int i36 = i29 - 1;
                int[] iArr6 = new int[i34];
                int[] iArr7 = new int[i34];
                int i37 = 0;
                while (true) {
                    i9 = i33 * iZzc15;
                    if (i36 < 0) {
                        break;
                    }
                    int i38 = iArrCopyOf[i36] + i9;
                    if (i38 < 0 && zArr[i28 + i36]) {
                        iArr6[i37] = i38;
                        i37++;
                    }
                    i36--;
                }
                if (i9 < 0 && zArr[i32]) {
                    iArr6[i37] = i9;
                    i37++;
                }
                i7 = i12;
                i8 = i20;
                int i39 = i37;
                for (int i40 = 0; i40 < i28; i40++) {
                    int i41 = iArr3[i40] + i9;
                    if (i41 < 0 && zArr[i40]) {
                        iArr6[i39] = i41;
                        i39++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr6, i39);
                int i42 = 0;
                for (int i43 = i28 - 1; i43 >= 0; i43--) {
                    int i44 = iArr3[i43] + i9;
                    if (i44 > 0 && zArr[i43]) {
                        iArr7[i42] = i44;
                        i42++;
                    }
                }
                if (i9 > 0 && zArr[i32]) {
                    iArr7[i42] = i9;
                    i42++;
                }
                int i45 = i42;
                for (int i46 = 0; i46 < i29; i46++) {
                    int i47 = iArrCopyOf[i46] + i9;
                    if (i47 > 0 && zArr[i28 + i46]) {
                        iArr7[i45] = i47;
                        i45++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr7, i45);
                i29 = i45;
                iArr3 = iArrCopyOf2;
                i28 = i39;
            }
            i26++;
            i20 = i8;
            i12 = i7;
            iZzc12 = i6;
            iArr2 = iArr;
        }
        int i48 = i12;
        int i49 = i20;
        int[] iArr8 = iArr2;
        if (zzgmVar.zzf()) {
            int iZzc16 = zzgmVar.zzc();
            for (int i50 = 0; i50 < iZzc16; i50++) {
                zzgmVar.zze(iZzc11 + 5);
            }
        }
        zzgmVar.zze(2);
        float f = 1.0f;
        if (zzgmVar.zzf()) {
            if (zzgmVar.zzf()) {
                int iZza5 = zzgmVar.zza(8);
                if (iZza5 == 255) {
                    int iZza6 = zzgmVar.zza(16);
                    int iZza7 = zzgmVar.zza(16);
                    if (iZza6 != 0 && iZza7 != 0) {
                        f = iZza6 / iZza7;
                    }
                } else if (iZza5 < 17) {
                    f = zzb[iZza5];
                } else {
                    zzfe.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza5);
                }
            }
            if (zzgmVar.zzf()) {
                zzgmVar.zzd();
            }
            if (zzgmVar.zzf()) {
                zzgmVar.zze(3);
                int i51 = true != zzgmVar.zzf() ? 2 : 1;
                if (zzgmVar.zzf()) {
                    int iZza8 = zzgmVar.zza(8);
                    int iZza9 = zzgmVar.zza(8);
                    zzgmVar.zze(8);
                    int iZza10 = zzt.zza(iZza8);
                    iZzb = zzt.zzb(iZza9);
                    i4 = iZza10;
                } else {
                    i4 = -1;
                    iZzb = -1;
                }
                i27 = i51;
            } else {
                i4 = -1;
                iZzb = -1;
            }
            if (zzgmVar.zzf()) {
                zzgmVar.zzc();
                zzgmVar.zzc();
            }
            zzgmVar.zzd();
            if (zzgmVar.zzf()) {
                i21 += i21;
            }
            i5 = iZzb;
            i3 = i21;
        } else {
            i3 = i21;
            i4 = -1;
            i5 = -1;
        }
        return new zzgi(iZza2, zZzf, iZza3, i48, i49, iZzc9, iZzc10, iArr8, iZza4, iZzc, i19, i3, f, i4, i27, i5);
    }

    public static zzgj zzd(byte[] bArr, int i, int i2) {
        zzgm zzgmVar = new zzgm(bArr, 4, i2);
        int iZzc = zzgmVar.zzc();
        int iZzc2 = zzgmVar.zzc();
        zzgmVar.zzd();
        return new zzgj(iZzc, iZzc2, zzgmVar.zzf());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgk zze(byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgl.zze(byte[], int, int):com.google.android.gms.internal.ads.zzgk");
    }

    public static void zzf(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = zzd[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i11 + 1;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }
}
