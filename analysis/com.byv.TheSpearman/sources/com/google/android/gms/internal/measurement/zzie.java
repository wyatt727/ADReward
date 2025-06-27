package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzie {
    static double zza(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzd(bArr, i));
    }

    static float zzb(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzc(bArr, i));
    }

    static int zza(byte[] bArr, int i, zzih zzihVar) throws zzkd {
        int iZzc = zzc(bArr, i, zzihVar);
        int i2 = zzihVar.zza;
        if (i2 < 0) {
            throw zzkd.zzf();
        }
        if (i2 > bArr.length - iZzc) {
            throw zzkd.zzh();
        }
        if (i2 == 0) {
            zzihVar.zzc = zzii.zza;
            return iZzc;
        }
        zzihVar.zzc = zzii.zza(bArr, iZzc, i2);
        return iZzc + i2;
    }

    static int zzc(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int zza(zzma zzmaVar, byte[] bArr, int i, int i2, int i3, zzih zzihVar) throws IOException {
        Object objZza = zzmaVar.zza();
        int iZza = zza(objZza, zzmaVar, bArr, i, i2, i3, zzihVar);
        zzmaVar.zzc(objZza);
        zzihVar.zzc = objZza;
        return iZza;
    }

    static int zza(zzma zzmaVar, byte[] bArr, int i, int i2, zzih zzihVar) throws IOException {
        Object objZza = zzmaVar.zza();
        int iZza = zza(objZza, zzmaVar, bArr, i, i2, zzihVar);
        zzmaVar.zzc(objZza);
        zzihVar.zzc = objZza;
        return iZza;
    }

    static int zza(zzma<?> zzmaVar, int i, byte[] bArr, int i2, int i3, zzke<?> zzkeVar, zzih zzihVar) throws IOException {
        int iZza = zza(zzmaVar, bArr, i2, i3, zzihVar);
        zzkeVar.add(zzihVar.zzc);
        while (iZza < i3) {
            int iZzc = zzc(bArr, iZza, zzihVar);
            if (i != zzihVar.zza) {
                break;
            }
            iZza = zza(zzmaVar, bArr, iZzc, i3, zzihVar);
            zzkeVar.add(zzihVar.zzc);
        }
        return iZza;
    }

    static int zza(byte[] bArr, int i, zzke<?> zzkeVar, zzih zzihVar) throws IOException {
        zzjw zzjwVar = (zzjw) zzkeVar;
        int iZzc = zzc(bArr, i, zzihVar);
        int i2 = zzihVar.zza + iZzc;
        while (iZzc < i2) {
            iZzc = zzc(bArr, iZzc, zzihVar);
            zzjwVar.zzd(zzihVar.zza);
        }
        if (iZzc == i2) {
            return iZzc;
        }
        throw zzkd.zzh();
    }

    static int zzb(byte[] bArr, int i, zzih zzihVar) throws zzkd {
        int iZzc = zzc(bArr, i, zzihVar);
        int i2 = zzihVar.zza;
        if (i2 < 0) {
            throw zzkd.zzf();
        }
        if (i2 == 0) {
            zzihVar.zzc = "";
            return iZzc;
        }
        zzihVar.zzc = zznf.zzb(bArr, iZzc, i2);
        return iZzc + i2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzmy zzmyVar, zzih zzihVar) throws zzkd {
        if ((i >>> 3) == 0) {
            throw zzkd.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzd = zzd(bArr, i2, zzihVar);
            zzmyVar.zza(i, Long.valueOf(zzihVar.zzb));
            return iZzd;
        }
        if (i4 == 1) {
            zzmyVar.zza(i, Long.valueOf(zzd(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzc = zzc(bArr, i2, zzihVar);
            int i5 = zzihVar.zza;
            if (i5 < 0) {
                throw zzkd.zzf();
            }
            if (i5 > bArr.length - iZzc) {
                throw zzkd.zzh();
            }
            if (i5 == 0) {
                zzmyVar.zza(i, zzii.zza);
            } else {
                zzmyVar.zza(i, zzii.zza(bArr, iZzc, i5));
            }
            return iZzc + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzmyVar.zza(i, Integer.valueOf(zzc(bArr, i2)));
                return i2 + 4;
            }
            throw zzkd.zzc();
        }
        zzmy zzmyVarZzd = zzmy.zzd();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iZzc2 = zzc(bArr, i2, zzihVar);
            int i8 = zzihVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = iZzc2;
                break;
            }
            int iZza = zza(i7, bArr, iZzc2, i3, zzmyVarZzd, zzihVar);
            i7 = i8;
            i2 = iZza;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzkd.zzg();
        }
        zzmyVar.zza(i, zzmyVarZzd);
        return i2;
    }

    static int zzc(byte[] bArr, int i, zzih zzihVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzihVar.zza = b;
            return i2;
        }
        return zza(b, bArr, i2, zzihVar);
    }

    static int zza(int i, byte[] bArr, int i2, zzih zzihVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzihVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzihVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzihVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzihVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzihVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzke<?> zzkeVar, zzih zzihVar) {
        zzjw zzjwVar = (zzjw) zzkeVar;
        int iZzc = zzc(bArr, i2, zzihVar);
        zzjwVar.zzd(zzihVar.zza);
        while (iZzc < i3) {
            int iZzc2 = zzc(bArr, iZzc, zzihVar);
            if (i != zzihVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzihVar);
            zzjwVar.zzd(zzihVar.zza);
        }
        return iZzc;
    }

    static int zzd(byte[] bArr, int i, zzih zzihVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzihVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzihVar.zzb = j2;
        return i3;
    }

    static int zza(Object obj, zzma zzmaVar, byte[] bArr, int i, int i2, int i3, zzih zzihVar) throws IOException {
        int iZza = ((zzlm) zzmaVar).zza((zzlm) obj, bArr, i, i2, i3, zzihVar);
        zzihVar.zzc = obj;
        return iZza;
    }

    static int zza(Object obj, zzma zzmaVar, byte[] bArr, int i, int i2, zzih zzihVar) throws IOException {
        int iZza = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZza = zza(i3, bArr, iZza, zzihVar);
            i3 = zzihVar.zza;
        }
        int i4 = iZza;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzkd.zzh();
        }
        int i5 = i3 + i4;
        zzmaVar.zza(obj, bArr, i4, i5, zzihVar);
        zzihVar.zzc = obj;
        return i5;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzih zzihVar) throws zzkd {
        if ((i >>> 3) == 0) {
            throw zzkd.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzd(bArr, i2, zzihVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzc(bArr, i2, zzihVar) + zzihVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzkd.zzc();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzc(bArr, i2, zzihVar);
            i6 = zzihVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zza(i6, bArr, i2, i3, zzihVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzkd.zzg();
        }
        return i2;
    }

    static long zzd(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
