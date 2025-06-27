package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhbo<T> implements zzhcg<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhdh.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhbl zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhaz zzm;
    private final zzhcx zzn;
    private final zzgzg zzo;
    private final zzhbr zzp;
    private final zzhbg zzq;

    private zzhbo(int[] iArr, Object[] objArr, int i, int i2, zzhbl zzhblVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzhbr zzhbrVar, zzhaz zzhazVar, zzhcx zzhcxVar, zzgzg zzgzgVar, zzhbg zzhbgVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzhblVar instanceof zzgzv;
        boolean z2 = false;
        if (zzgzgVar != null && zzgzgVar.zzi(zzhblVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzhbrVar;
        this.zzm = zzhazVar;
        this.zzn = zzhcxVar;
        this.zzo = zzgzgVar;
        this.zzg = zzhblVar;
        this.zzq = zzhbgVar;
    }

    private final Object zzA(Object obj, int i) {
        zzhcg zzhcgVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzhcgVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzhcgVarZzx.zze();
        if (object != null) {
            zzhcgVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzhcg zzhcgVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzhcgVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzhcgVarZzx.zze();
        if (object != null) {
            zzhcgVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhcg zzhcgVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzhcgVarZzx.zze();
                    zzhcgVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzhcgVarZzx.zze();
                zzhcgVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzhcgVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhcg zzhcgVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzhcgVarZzx.zze();
                    zzhcgVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzhcgVarZzx.zze();
                zzhcgVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzhcgVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzhby zzhbyVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzhdh.zzv(obj, j, zzhbyVar.zzu());
        } else if (this.zzi) {
            zzhdh.zzv(obj, j, zzhbyVar.zzt());
        } else {
            zzhdh.zzv(obj, j, zzhbyVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzhdh.zzt(obj, j, (1 << (iZzr >>> 20)) | zzhdh.zzd(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzhdh.zzt(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (zzhdh.zzd(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhdh.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhdh.zzc(obj, j2)) != 0;
            case 2:
                return zzhdh.zzf(obj, j2) != 0;
            case 3:
                return zzhdh.zzf(obj, j2) != 0;
            case 4:
                return zzhdh.zzd(obj, j2) != 0;
            case 5:
                return zzhdh.zzf(obj, j2) != 0;
            case 6:
                return zzhdh.zzd(obj, j2) != 0;
            case 7:
                return zzhdh.zzz(obj, j2);
            case 8:
                Object objZzh = zzhdh.zzh(obj, j2);
                if (objZzh instanceof String) {
                    return !((String) objZzh).isEmpty();
                }
                if (objZzh instanceof zzgyj) {
                    return !zzgyj.zzb.equals(objZzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhdh.zzh(obj, j2) != null;
            case 10:
                return !zzgyj.zzb.equals(zzhdh.zzh(obj, j2));
            case 11:
                return zzhdh.zzd(obj, j2) != 0;
            case 12:
                return zzhdh.zzd(obj, j2) != 0;
            case 13:
                return zzhdh.zzd(obj, j2) != 0;
            case 14:
                return zzhdh.zzf(obj, j2) != 0;
            case 15:
                return zzhdh.zzd(obj, j2) != 0;
            case 16:
                return zzhdh.zzf(obj, j2) != 0;
            case 17:
                return zzhdh.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzhcg zzhcgVar) {
        return zzhcgVar.zzk(zzhdh.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgzv) {
            return ((zzgzv) obj).zzce();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzhdh.zzd(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzhdh.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzgzb zzgzbVar) throws IOException {
        if (obj instanceof String) {
            zzgzbVar.zzG(i, (String) obj);
        } else {
            zzgzbVar.zzd(i, (zzgyj) obj);
        }
    }

    static zzhcy zzd(Object obj) {
        zzgzv zzgzvVar = (zzgzv) obj;
        zzhcy zzhcyVar = zzgzvVar.zzt;
        if (zzhcyVar != zzhcy.zzc()) {
            return zzhcyVar;
        }
        zzhcy zzhcyVarZzf = zzhcy.zzf();
        zzgzvVar.zzt = zzhcyVarZzf;
        return zzhcyVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.ads.zzhbo zzl(java.lang.Class r33, com.google.android.gms.internal.ads.zzhbi r34, com.google.android.gms.internal.ads.zzhbr r35, com.google.android.gms.internal.ads.zzhaz r36, com.google.android.gms.internal.ads.zzhcx r37, com.google.android.gms.internal.ads.zzgzg r38, com.google.android.gms.internal.ads.zzhbg r39) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbo.zzl(java.lang.Class, com.google.android.gms.internal.ads.zzhbi, com.google.android.gms.internal.ads.zzhbr, com.google.android.gms.internal.ads.zzhaz, com.google.android.gms.internal.ads.zzhcx, com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzhbg):com.google.android.gms.internal.ads.zzhbo");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzhdh.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzhdh.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzhdh.zzh(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzhdh.zzh(obj, j)).longValue();
    }

    private final zzhab zzw(int i) {
        int i2 = i / 3;
        return (zzhab) this.zzd[i2 + i2 + 1];
    }

    private final zzhcg zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzhcg zzhcgVar = (zzhcg) objArr[i3];
        if (zzhcgVar != null) {
            return zzhcgVar;
        }
        zzhcg zzhcgVarZzb = zzhbv.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzhcgVarZzb;
        return zzhcgVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzhcx zzhcxVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzh = zzhdh.zzh(obj, zzu(i) & 1048575);
        if (objZzh == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x054e  */
    @Override // com.google.android.gms.internal.ads.zzhcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbo.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int iZzu = zzu(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhdh.zzb(obj, j));
                    byte[] bArr = zzhai.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhdh.zzc(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzhdh.zzf(obj, j);
                    byte[] bArr2 = zzhai.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzhdh.zzf(obj, j);
                    byte[] bArr3 = zzhai.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = zzhdh.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzhdh.zzf(obj, j);
                    byte[] bArr4 = zzhai.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = zzhdh.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = zzhai.zza(zzhdh.zzz(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) zzhdh.zzh(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objZzh = zzhdh.zzh(obj, j);
                    if (objZzh != null) {
                        iHashCode = objZzh.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = zzhdh.zzh(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = zzhdh.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = zzhdh.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = zzhdh.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzhdh.zzf(obj, j);
                    byte[] bArr5 = zzhai.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = zzhdh.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzhdh.zzf(obj, j);
                    byte[] bArr6 = zzhai.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objZzh2 = zzhdh.zzh(obj, j);
                    if (objZzh2 != null) {
                        iHashCode = objZzh2.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iFloatToIntBits = zzhdh.zzh(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = zzhdh.zzh(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzhai.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzhai.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzhai.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzhai.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzhai.zza(zzS(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) zzhdh.zzh(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzhdh.zzh(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzhdh.zzh(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzhai.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzhai.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzhdh.zzh(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + this.zzn.zzd(obj).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:484:0x0b6d, code lost:
    
        if (r5 == r0) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0b6f, code lost:
    
        r14.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0b73, code lost:
    
        r11 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0b78, code lost:
    
        if (r11 >= r12.zzl) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0b7a, code lost:
    
        zzy(r34, r12.zzj[r11], null, r12.zzn, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0b8d, code lost:
    
        if (r9 != 0) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0b8f, code lost:
    
        if (r6 != r10) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0b96, code lost:
    
        throw com.google.android.gms.internal.ads.zzhak.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b97, code lost:
    
        if (r6 > r10) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b99, code lost:
    
        if (r8 != r9) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0b9b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0ba0, code lost:
    
        throw com.google.android.gms.internal.ads.zzhak.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0836 A[PHI: r7 r8 r9 r10 r11 r14
      0x0836: PHI (r7v24 int) = (r7v6 int), (r7v8 int), (r7v9 int), (r7v14 int), (r7v18 int), (r7v22 int), (r7v28 int) binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]
      0x0836: PHI (r8v98 int) = (r8v41 int), (r8v43 int), (r8v44 int), (r8v73 int), (r8v89 int), (r8v96 int), (r8v101 int) binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]
      0x0836: PHI (r9v63 int) = (r9v35 int), (r9v37 int), (r9v38 int), (r9v51 int), (r9v59 int), (r9v61 int), (r9v66 int) binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]
      0x0836: PHI (r10v72 int) = (r10v40 int), (r10v42 int), (r10v43 int), (r10v45 int), (r10v57 int), (r10v64 int), (r10v76 int) binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]
      0x0836: PHI (r11v42 int) = (r11v20 int), (r11v22 int), (r11v23 int), (r11v25 int), (r11v34 int), (r11v40 int), (r11v46 int) binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]
      0x0836: PHI (r14v44 sun.misc.Unsafe) = 
      (r14v23 sun.misc.Unsafe)
      (r14v25 sun.misc.Unsafe)
      (r14v26 sun.misc.Unsafe)
      (r14v28 sun.misc.Unsafe)
      (r14v36 sun.misc.Unsafe)
      (r14v42 sun.misc.Unsafe)
      (r14v47 sun.misc.Unsafe)
     binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0ae3 A[PHI: r8 r10 r11 r12 r36
      0x0ae3: PHI (r8v123 com.google.android.gms.internal.ads.zzgxv) = 
      (r8v104 com.google.android.gms.internal.ads.zzgxv)
      (r8v105 com.google.android.gms.internal.ads.zzgxv)
      (r8v106 com.google.android.gms.internal.ads.zzgxv)
      (r8v107 com.google.android.gms.internal.ads.zzgxv)
      (r8v108 com.google.android.gms.internal.ads.zzgxv)
      (r8v109 com.google.android.gms.internal.ads.zzgxv)
      (r8v110 com.google.android.gms.internal.ads.zzgxv)
      (r8v111 com.google.android.gms.internal.ads.zzgxv)
      (r8v112 com.google.android.gms.internal.ads.zzgxv)
      (r8v116 com.google.android.gms.internal.ads.zzgxv)
      (r8v124 com.google.android.gms.internal.ads.zzgxv)
     binds: [B:463:0x0acc, B:460:0x0aaa, B:457:0x0a8c, B:454:0x0a6e, B:451:0x0a50, B:448:0x0a31, B:441:0x0a09, B:439:0x09fb, B:424:0x09b0, B:420:0x097d, B:396:0x08a8] A[DONT_GENERATE, DONT_INLINE]
      0x0ae3: PHI (r10v101 int) = 
      (r10v80 int)
      (r10v81 int)
      (r10v82 int)
      (r10v83 int)
      (r10v84 int)
      (r10v85 int)
      (r10v86 int)
      (r10v87 int)
      (r10v88 int)
      (r10v94 int)
      (r10v102 int)
     binds: [B:463:0x0acc, B:460:0x0aaa, B:457:0x0a8c, B:454:0x0a6e, B:451:0x0a50, B:448:0x0a31, B:441:0x0a09, B:439:0x09fb, B:424:0x09b0, B:420:0x097d, B:396:0x08a8] A[DONT_GENERATE, DONT_INLINE]
      0x0ae3: PHI (r11v64 int) = 
      (r11v48 int)
      (r11v49 int)
      (r11v50 int)
      (r11v51 int)
      (r11v52 int)
      (r11v53 int)
      (r11v54 int)
      (r11v55 int)
      (r11v56 int)
      (r11v59 int)
      (r11v65 int)
     binds: [B:463:0x0acc, B:460:0x0aaa, B:457:0x0a8c, B:454:0x0a6e, B:451:0x0a50, B:448:0x0a31, B:441:0x0a09, B:439:0x09fb, B:424:0x09b0, B:420:0x097d, B:396:0x08a8] A[DONT_GENERATE, DONT_INLINE]
      0x0ae3: PHI (r12v34 int) = 
      (r12v15 int)
      (r12v16 int)
      (r12v17 int)
      (r12v18 int)
      (r12v19 int)
      (r12v20 int)
      (r12v21 int)
      (r12v22 int)
      (r12v23 int)
      (r12v27 int)
      (r12v35 int)
     binds: [B:463:0x0acc, B:460:0x0aaa, B:457:0x0a8c, B:454:0x0a6e, B:451:0x0a50, B:448:0x0a31, B:441:0x0a09, B:439:0x09fb, B:424:0x09b0, B:420:0x097d, B:396:0x08a8] A[DONT_GENERATE, DONT_INLINE]
      0x0ae3: PHI (r36v21 int) = 
      (r36v3 int)
      (r36v4 int)
      (r36v5 int)
      (r36v6 int)
      (r36v7 int)
      (r36v8 int)
      (r36v9 int)
      (r36v10 int)
      (r36v14 int)
      (r36v16 int)
      (r36v22 int)
     binds: [B:463:0x0acc, B:460:0x0aaa, B:457:0x0a8c, B:454:0x0a6e, B:451:0x0a50, B:448:0x0a31, B:441:0x0a09, B:439:0x09fb, B:424:0x09b0, B:420:0x097d, B:396:0x08a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0839 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0ae6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:580:0x084a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0af9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzgxv r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbo.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgxv):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final Object zze() {
        return ((zzgzv) this.zzg).zzbj();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // com.google.android.gms.internal.ads.zzhcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzQ(r8)
            if (r0 != 0) goto L8
            goto L8f
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgzv
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.zzgzv r0 = (com.google.android.gms.internal.ads.zzgzv) r0
            r0.zzbU()
            r0.zzbT()
            r0.zzbW()
        L18:
            int[] r0 = r7.zzc
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L81
            int r2 = r7.zzu(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzt(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6b
            r5 = 60
            if (r2 == r5) goto L53
            r5 = 68
            if (r2 == r5) goto L53
            switch(r2) {
                case 17: goto L6b;
                case 18: goto L4d;
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                case 26: goto L4d;
                case 27: goto L4d;
                case 28: goto L4d;
                case 29: goto L4d;
                case 30: goto L4d;
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L7e
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.zzhbo.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7e
            r6 = r5
            com.google.android.gms.internal.ads.zzhbf r6 = (com.google.android.gms.internal.ads.zzhbf) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L7e
        L4d:
            com.google.android.gms.internal.ads.zzhaz r2 = r7.zzm
            r2.zzb(r8, r3)
            goto L7e
        L53:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzR(r8, r2, r1)
            if (r2 == 0) goto L7e
            com.google.android.gms.internal.ads.zzhcg r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzhbo.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L7e
        L6b:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L7e
            com.google.android.gms.internal.ads.zzhcg r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzhbo.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L7e:
            int r1 = r1 + 3
            goto L1b
        L81:
            com.google.android.gms.internal.ads.zzhcx r0 = r7.zzn
            r0.zzm(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L8f
            com.google.android.gms.internal.ads.zzgzg r0 = r7.zzo
            r0.zzf(r8)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbo.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i2 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzhdh.zzr(obj, j, zzhdh.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzhdh.zzs(obj, j, zzhdh.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzhdh.zzu(obj, j, zzhdh.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzhdh.zzu(obj, j, zzhdh.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzhdh.zzu(obj, j, zzhdh.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzhdh.zzp(obj, j, zzhdh.zzz(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzhdh.zzv(obj, j, zzhdh.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzhdh.zzv(obj, j, zzhdh.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzhdh.zzu(obj, j, zzhdh.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzhdh.zzt(obj, j, zzhdh.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzhdh.zzu(obj, j, zzhdh.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzhci.zza;
                    zzhdh.zzv(obj, j, zzhbg.zzb(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i3, i)) {
                        zzhdh.zzv(obj, j, zzhdh.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzhdh.zzv(obj, j, zzhdh.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzhci.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzhci.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x063e A[LOOP:3: B:169:0x063a->B:171:0x063e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.zzhby r19, com.google.android.gms.internal.ads.zzgzf r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbo.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzhby, com.google.android.gms.internal.ads.zzgzf):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgxv zzgxvVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzgxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzt;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzhdh.zzb(obj, j)) != Double.doubleToLongBits(zzhdh.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzhdh.zzc(obj, j)) != Float.floatToIntBits(zzhdh.zzc(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzhdh.zzf(obj, j) != zzhdh.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzhdh.zzf(obj, j) != zzhdh.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzhdh.zzd(obj, j) != zzhdh.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzhdh.zzf(obj, j) != zzhdh.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzhdh.zzd(obj, j) != zzhdh.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzhdh.zzz(obj, j) != zzhdh.zzz(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzhdh.zzd(obj, j) != zzhdh.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzhdh.zzd(obj, j) != zzhdh.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzhdh.zzd(obj, j) != zzhdh.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzhdh.zzf(obj, j) != zzhdh.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzhdh.zzd(obj, j) != zzhdh.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzhdh.zzf(obj, j) != zzhdh.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzt = zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j));
                    break;
                case 50:
                    zZzt = zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzr = zzr(i) & 1048575;
                    if (zzhdh.zzd(obj, jZzr) != zzhdh.zzd(obj2, jZzr) || !zzhci.zzt(zzhdh.zzh(obj, j), zzhdh.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzt) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.gms.internal.ads.zzhcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbo.zzk(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.ads.zzhcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzm(java.lang.Object r24, com.google.android.gms.internal.ads.zzgzb r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbo.zzm(java.lang.Object, com.google.android.gms.internal.ads.zzgzb):void");
    }
}
