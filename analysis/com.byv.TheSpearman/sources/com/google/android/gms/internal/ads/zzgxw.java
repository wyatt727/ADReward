package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgxw {
    static int zza(byte[] bArr, int i, zzgxv zzgxvVar) throws zzhak {
        int iZzh = zzh(bArr, i, zzgxvVar);
        int i2 = zzgxvVar.zza;
        if (i2 < 0) {
            throw zzhak.zzf();
        }
        if (i2 > bArr.length - iZzh) {
            throw zzhak.zzj();
        }
        if (i2 == 0) {
            zzgxvVar.zzc = zzgyj.zzb;
            return iZzh;
        }
        zzgxvVar.zzc = zzgyj.zzv(bArr, iZzh, i2);
        return iZzh + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzhcg zzhcgVar, byte[] bArr, int i, int i2, int i3, zzgxv zzgxvVar) throws IOException {
        Object objZze = zzhcgVar.zze();
        int iZzl = zzl(objZze, zzhcgVar, bArr, i, i2, i3, zzgxvVar);
        zzhcgVar.zzf(objZze);
        zzgxvVar.zzc = objZze;
        return iZzl;
    }

    static int zzd(zzhcg zzhcgVar, byte[] bArr, int i, int i2, zzgxv zzgxvVar) throws IOException {
        Object objZze = zzhcgVar.zze();
        int iZzm = zzm(objZze, zzhcgVar, bArr, i, i2, zzgxvVar);
        zzhcgVar.zzf(objZze);
        zzgxvVar.zzc = objZze;
        return iZzm;
    }

    static int zze(zzhcg zzhcgVar, int i, byte[] bArr, int i2, int i3, zzhah zzhahVar, zzgxv zzgxvVar) throws IOException {
        int iZzd = zzd(zzhcgVar, bArr, i2, i3, zzgxvVar);
        zzhahVar.add(zzgxvVar.zzc);
        while (iZzd < i3) {
            int iZzh = zzh(bArr, iZzd, zzgxvVar);
            if (i != zzgxvVar.zza) {
                break;
            }
            iZzd = zzd(zzhcgVar, bArr, iZzh, i3, zzgxvVar);
            zzhahVar.add(zzgxvVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i, zzhah zzhahVar, zzgxv zzgxvVar) throws IOException {
        zzgzw zzgzwVar = (zzgzw) zzhahVar;
        int iZzh = zzh(bArr, i, zzgxvVar);
        int i2 = zzgxvVar.zza + iZzh;
        while (iZzh < i2) {
            iZzh = zzh(bArr, iZzh, zzgxvVar);
            zzgzwVar.zzi(zzgxvVar.zza);
        }
        if (iZzh == i2) {
            return iZzh;
        }
        throw zzhak.zzj();
    }

    static int zzg(int i, byte[] bArr, int i2, int i3, zzhcy zzhcyVar, zzgxv zzgxvVar) throws zzhak {
        if ((i >>> 3) == 0) {
            throw zzhak.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzk = zzk(bArr, i2, zzgxvVar);
            zzhcyVar.zzj(i, Long.valueOf(zzgxvVar.zzb));
            return iZzk;
        }
        if (i4 == 1) {
            zzhcyVar.zzj(i, Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzh = zzh(bArr, i2, zzgxvVar);
            int i5 = zzgxvVar.zza;
            if (i5 < 0) {
                throw zzhak.zzf();
            }
            if (i5 > bArr.length - iZzh) {
                throw zzhak.zzj();
            }
            if (i5 == 0) {
                zzhcyVar.zzj(i, zzgyj.zzb);
            } else {
                zzhcyVar.zzj(i, zzgyj.zzv(bArr, iZzh, i5));
            }
            return iZzh + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzhak.zzc();
            }
            zzhcyVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzhcy zzhcyVarZzf = zzhcy.zzf();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iZzh2 = zzh(bArr, i2, zzgxvVar);
            int i8 = zzgxvVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = iZzh2;
                break;
            }
            int iZzg = zzg(i7, bArr, iZzh2, i3, zzhcyVarZzf, zzgxvVar);
            i7 = i8;
            i2 = iZzg;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzhak.zzg();
        }
        zzhcyVar.zzj(i, zzhcyVarZzf);
        return i2;
    }

    static int zzh(byte[] bArr, int i, zzgxv zzgxvVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzi(b, bArr, i2, zzgxvVar);
        }
        zzgxvVar.zza = b;
        return i2;
    }

    static int zzi(int i, byte[] bArr, int i2, zzgxv zzgxvVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzgxvVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzgxvVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgxvVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgxvVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgxvVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzj(int i, byte[] bArr, int i2, int i3, zzhah zzhahVar, zzgxv zzgxvVar) {
        zzgzw zzgzwVar = (zzgzw) zzhahVar;
        int iZzh = zzh(bArr, i2, zzgxvVar);
        zzgzwVar.zzi(zzgxvVar.zza);
        while (iZzh < i3) {
            int iZzh2 = zzh(bArr, iZzh, zzgxvVar);
            if (i != zzgxvVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzgxvVar);
            zzgzwVar.zzi(zzgxvVar.zza);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i, zzgxv zzgxvVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgxvVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i4;
            i3 = i5;
            b = b2;
        }
        zzgxvVar.zzb = j2;
        return i3;
    }

    static int zzl(Object obj, zzhcg zzhcgVar, byte[] bArr, int i, int i2, int i3, zzgxv zzgxvVar) throws IOException {
        int iZzc = ((zzhbo) zzhcgVar).zzc(obj, bArr, i, i2, i3, zzgxvVar);
        zzgxvVar.zzc = obj;
        return iZzc;
    }

    static int zzm(Object obj, zzhcg zzhcgVar, byte[] bArr, int i, int i2, zzgxv zzgxvVar) throws IOException {
        int iZzi = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzi = zzi(i3, bArr, iZzi, zzgxvVar);
            i3 = zzgxvVar.zza;
        }
        int i4 = iZzi;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzhak.zzj();
        }
        int i5 = i3 + i4;
        zzhcgVar.zzi(obj, bArr, i4, i5, zzgxvVar);
        zzgxvVar.zzc = obj;
        return i5;
    }

    static long zzn(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
