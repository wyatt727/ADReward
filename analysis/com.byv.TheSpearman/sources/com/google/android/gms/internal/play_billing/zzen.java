package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzen<T> implements zzev<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzek zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdy zzl;
    private final zzfm zzm;
    private final zzcq zzn;
    private final zzep zzo;
    private final zzef zzp;

    private zzen(int[] iArr, Object[] objArr, int i, int i2, zzek zzekVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzep zzepVar, zzdy zzdyVar, zzfm zzfmVar, zzcq zzcqVar, zzef zzefVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzcqVar != null && zzcqVar.zzc(zzekVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzo = zzepVar;
        this.zzl = zzdyVar;
        this.zzm = zzfmVar;
        this.zzn = zzcqVar;
        this.zzg = zzekVar;
        this.zzp = zzefVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzev zzevVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zzevVarZzv.zze();
                    zzevVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzevVarZzv.zze();
                zzevVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzevVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzev zzevVarZzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object objZze = zzevVarZzv.zze();
                    zzevVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzevVarZzv.zze();
                zzevVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzevVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j = 1048575 & iZzp;
        if (j == 1048575) {
            return;
        }
        zzfw.zzq(obj, j, (1 << (iZzp >>> 20)) | zzfw.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzfw.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int iZzp = zzp(i);
        long j = iZzp & 1048575;
        if (j != 1048575) {
            return (zzfw.zzc(obj, j) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j2 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzfw.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfw.zzb(obj, j2)) != 0;
            case 2:
                return zzfw.zzd(obj, j2) != 0;
            case 3:
                return zzfw.zzd(obj, j2) != 0;
            case 4:
                return zzfw.zzc(obj, j2) != 0;
            case 5:
                return zzfw.zzd(obj, j2) != 0;
            case 6:
                return zzfw.zzc(obj, j2) != 0;
            case 7:
                return zzfw.zzw(obj, j2);
            case 8:
                Object objZzf = zzfw.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzcc) {
                    return !zzcc.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfw.zzf(obj, j2) != null;
            case 10:
                return !zzcc.zzb.equals(zzfw.zzf(obj, j2));
            case 11:
                return zzfw.zzc(obj, j2) != 0;
            case 12:
                return zzfw.zzc(obj, j2) != 0;
            case 13:
                return zzfw.zzc(obj, j2) != 0;
            case 14:
                return zzfw.zzd(obj, j2) != 0;
            case 15:
                return zzfw.zzc(obj, j2) != 0;
            case 16:
                return zzfw.zzd(obj, j2) != 0;
            case 17:
                return zzfw.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzev zzevVar) {
        return zzevVar.zzk(zzfw.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzdd) {
            return ((zzdd) obj).zzx();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzfw.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzfw.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzge zzgeVar) throws IOException {
        if (obj instanceof String) {
            zzgeVar.zzF(i, (String) obj);
        } else {
            zzgeVar.zzd(i, (zzcc) obj);
        }
    }

    static zzfn zzd(Object obj) {
        zzdd zzddVar = (zzdd) obj;
        zzfn zzfnVar = zzddVar.zzc;
        if (zzfnVar != zzfn.zzc()) {
            return zzfnVar;
        }
        zzfn zzfnVarZzf = zzfn.zzf();
        zzddVar.zzc = zzfnVarZzf;
        return zzfnVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.play_billing.zzen zzl(java.lang.Class r33, com.google.android.gms.internal.play_billing.zzeh r34, com.google.android.gms.internal.play_billing.zzep r35, com.google.android.gms.internal.play_billing.zzdy r36, com.google.android.gms.internal.play_billing.zzfm r37, com.google.android.gms.internal.play_billing.zzcq r38, com.google.android.gms.internal.play_billing.zzef r39) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzeh, com.google.android.gms.internal.play_billing.zzep, com.google.android.gms.internal.play_billing.zzdy, com.google.android.gms.internal.play_billing.zzfm, com.google.android.gms.internal.play_billing.zzcq, com.google.android.gms.internal.play_billing.zzef):com.google.android.gms.internal.play_billing.zzen");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzfw.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzfw.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzfw.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
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

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzfw.zzf(obj, j)).longValue();
    }

    private final zzdh zzu(int i) {
        int i2 = i / 3;
        return (zzdh) this.zzd[i2 + i2 + 1];
    }

    private final zzev zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzev zzevVar = (zzev) objArr[i3];
        if (zzevVar != null) {
            return zzevVar;
        }
        zzev zzevVarZzb = zzes.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzevVarZzb;
        return zzevVarZzb;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzev zzevVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzevVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzevVarZzv.zze();
        if (object != null) {
            zzevVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzev zzevVarZzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzevVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzevVarZzv.zze();
        if (object != null) {
            zzevVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x054d  */
    @Override // com.google.android.gms.internal.play_billing.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 2098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int iZzs = zzs(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzfw.zza(obj, j));
                    byte[] bArr = zzdl.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzfw.zzb(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr2 = zzdl.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr3 = zzdl.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr4 = zzdl.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = zzdl.zza(zzfw.zzw(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) zzfw.zzf(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objZzf = zzfw.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr5 = zzdl.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = zzfw.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfw.zzd(obj, j);
                    byte[] bArr6 = zzdl.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objZzf2 = zzfw.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
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
                    iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzdl.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzdl.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzdl.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzdl.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzdl.zza(zzN(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) zzfw.zzf(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzdl.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzdl.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfw.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + this.zzm.zzd(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzn.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:558:0x0cee, code lost:
    
        if (r6 == 1048575) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0cf0, code lost:
    
        r33.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0cf6, code lost:
    
        r2 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0cfa, code lost:
    
        if (r2 >= r0.zzk) goto L679;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0cfc, code lost:
    
        r3 = r0.zzi;
        r5 = r0.zzc;
        r3 = r3[r2];
        r5 = r5[r3];
        r5 = com.google.android.gms.internal.play_billing.zzfw.zzf(r7, r0.zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0d0e, code lost:
    
        if (r5 != null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0d15, code lost:
    
        if (r0.zzu(r3) != null) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0d17, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0d1a, code lost:
    
        r5 = (com.google.android.gms.internal.play_billing.zzee) r5;
        r1 = (com.google.android.gms.internal.play_billing.zzed) r0.zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0d22, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d23, code lost:
    
        if (r8 != 0) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0d27, code lost:
    
        if (r1 != r39) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0d2e, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdn.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0d31, code lost:
    
        if (r1 > r39) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0d33, code lost:
    
        if (r4 != r8) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0d35, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0d3a, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdn.zze();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a15 A[PHI: r0 r7 r8 r9 r11 r14 r33
      0x0a15: PHI (r0v32 com.google.android.gms.internal.play_billing.zzen<T>) = 
      (r0v1 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v29 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v30 com.google.android.gms.internal.play_billing.zzen<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzen<T>)
     binds: [B:444:0x09ce, B:428:0x0974, B:412:0x0921, B:337:0x07b9, B:254:0x064b, B:288:0x06f0, B:187:0x04ad] A[DONT_GENERATE, DONT_INLINE]
      0x0a15: PHI (r7v29 int) = (r7v6 int), (r7v7 int), (r7v8 int), (r7v13 int), (r7v22 int), (r7v24 int), (r7v33 int) binds: [B:444:0x09ce, B:428:0x0974, B:412:0x0921, B:337:0x07b9, B:254:0x064b, B:288:0x06f0, B:187:0x04ad] A[DONT_GENERATE, DONT_INLINE]
      0x0a15: PHI (r8v116 int) = (r8v53 int), (r8v54 int), (r8v55 int), (r8v84 int), (r8v107 int), (r8v109 int), (r8v120 int) binds: [B:444:0x09ce, B:428:0x0974, B:412:0x0921, B:337:0x07b9, B:254:0x064b, B:288:0x06f0, B:187:0x04ad] A[DONT_GENERATE, DONT_INLINE]
      0x0a15: PHI (r9v79 com.google.android.gms.internal.play_billing.zzbp) = 
      (r9v37 com.google.android.gms.internal.play_billing.zzbp)
      (r9v38 com.google.android.gms.internal.play_billing.zzbp)
      (r9v39 com.google.android.gms.internal.play_billing.zzbp)
      (r9v52 com.google.android.gms.internal.play_billing.zzbp)
      (r9v72 com.google.android.gms.internal.play_billing.zzbp)
      (r9v74 com.google.android.gms.internal.play_billing.zzbp)
      (r9v81 com.google.android.gms.internal.play_billing.zzbp)
     binds: [B:444:0x09ce, B:428:0x0974, B:412:0x0921, B:337:0x07b9, B:254:0x064b, B:288:0x06f0, B:187:0x04ad] A[DONT_GENERATE, DONT_INLINE]
      0x0a15: PHI (r11v34 int) = (r11v13 int), (r11v14 int), (r11v15 int), (r11v17 int), (r11v27 int), (r11v29 int), (r11v37 int) binds: [B:444:0x09ce, B:428:0x0974, B:412:0x0921, B:337:0x07b9, B:254:0x064b, B:288:0x06f0, B:187:0x04ad] A[DONT_GENERATE, DONT_INLINE]
      0x0a15: PHI (r14v44 int) = (r14v18 int), (r14v19 int), (r14v20 int), (r14v22 int), (r14v34 int), (r14v36 int), (r14v46 int) binds: [B:444:0x09ce, B:428:0x0974, B:412:0x0921, B:337:0x07b9, B:254:0x064b, B:288:0x06f0, B:187:0x04ad] A[DONT_GENERATE, DONT_INLINE]
      0x0a15: PHI (r33v32 sun.misc.Unsafe) = 
      (r33v7 sun.misc.Unsafe)
      (r33v8 sun.misc.Unsafe)
      (r33v9 sun.misc.Unsafe)
      (r33v14 sun.misc.Unsafe)
      (r33v25 sun.misc.Unsafe)
      (r33v27 sun.misc.Unsafe)
      (r33v34 sun.misc.Unsafe)
     binds: [B:444:0x09ce, B:428:0x0974, B:412:0x0921, B:337:0x07b9, B:254:0x064b, B:288:0x06f0, B:187:0x04ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0c70 A[PHI: r4 r10 r12 r30
      0x0c70: PHI (r4v99 int) = 
      (r4v80 int)
      (r4v81 int)
      (r4v82 int)
      (r4v83 int)
      (r4v84 int)
      (r4v85 int)
      (r4v86 int)
      (r4v87 int)
      (r4v92 int)
      (r4v100 int)
     binds: [B:536:0x0c59, B:533:0x0c3b, B:530:0x0c21, B:527:0x0c08, B:524:0x0bee, B:521:0x0bd3, B:514:0x0baf, B:512:0x0ba5, B:497:0x0b62, B:471:0x0a8f] A[DONT_GENERATE, DONT_INLINE]
      0x0c70: PHI (r10v75 int) = 
      (r10v57 int)
      (r10v58 int)
      (r10v59 int)
      (r10v60 int)
      (r10v61 int)
      (r10v62 int)
      (r10v63 int)
      (r10v64 int)
      (r10v69 int)
      (r10v76 int)
     binds: [B:536:0x0c59, B:533:0x0c3b, B:530:0x0c21, B:527:0x0c08, B:524:0x0bee, B:521:0x0bd3, B:514:0x0baf, B:512:0x0ba5, B:497:0x0b62, B:471:0x0a8f] A[DONT_GENERATE, DONT_INLINE]
      0x0c70: PHI (r12v36 int) = 
      (r12v19 int)
      (r12v20 int)
      (r12v21 int)
      (r12v22 int)
      (r12v23 int)
      (r12v24 int)
      (r12v25 int)
      (r12v26 int)
      (r12v30 int)
      (r12v37 int)
     binds: [B:536:0x0c59, B:533:0x0c3b, B:530:0x0c21, B:527:0x0c08, B:524:0x0bee, B:521:0x0bd3, B:514:0x0baf, B:512:0x0ba5, B:497:0x0b62, B:471:0x0a8f] A[DONT_GENERATE, DONT_INLINE]
      0x0c70: PHI (r30v21 int) = 
      (r30v5 int)
      (r30v6 int)
      (r30v7 int)
      (r30v8 int)
      (r30v9 int)
      (r30v10 int)
      (r30v11 int)
      (r30v12 int)
      (r30v17 int)
      (r30v22 int)
     binds: [B:536:0x0c59, B:533:0x0c3b, B:530:0x0c21, B:527:0x0c08, B:524:0x0bee, B:521:0x0bd3, B:514:0x0baf, B:512:0x0ba5, B:497:0x0b62, B:471:0x0a8f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0a18 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0c73 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0a2a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0c86 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zzc(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.play_billing.zzbp r41) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzbp):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final Object zze() {
        return ((zzdd) this.zzg).zzj();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.gms.internal.play_billing.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzL(r8)
            if (r0 != 0) goto L8
            goto L91
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.play_billing.zzdd
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.play_billing.zzdd r0 = (com.google.android.gms.internal.play_billing.zzdd) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzu(r2)
            r0.zza = r1
            r0.zzs()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            int r2 = r7.zzs(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzr(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L80
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.play_billing.zzen.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            r6 = r5
            com.google.android.gms.internal.play_billing.zzee r6 = (com.google.android.gms.internal.play_billing.zzee) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L80
        L4f:
            com.google.android.gms.internal.play_billing.zzdy r2 = r7.zzl
            r2.zza(r8, r3)
            goto L80
        L55:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzM(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.play_billing.zzev r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.play_billing.zzen.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzI(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.play_billing.zzev r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.play_billing.zzen.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L80:
            int r1 = r1 + 3
            goto L1d
        L83:
            com.google.android.gms.internal.play_billing.zzfm r0 = r7.zzm
            r0.zzg(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.play_billing.zzcq r0 = r7.zzn
            r0.zzb(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            int i2 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzfw.zzo(obj, j, zzfw.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzfw.zzp(obj, j, zzfw.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzfw.zzm(obj, j, zzfw.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzfw.zzq(obj, j, zzfw.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzfw.zzr(obj, j, zzfw.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
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
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzex.zza;
                    zzfw.zzs(obj, j, zzef.zza(zzfw.zzf(obj, j), zzfw.zzf(obj2, j)));
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
                    if (zzM(obj2, i3, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzfw.zzs(obj, j, zzfw.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzex.zzp(this.zzm, obj, obj2);
        if (this.zzh) {
            this.zzn.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzbp zzbpVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzbpVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final void zzi(Object obj, zzge zzgeVar) throws IOException {
        int i;
        int i2;
        int i3;
        if (this.zzh) {
            this.zzn.zza(obj);
            throw null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < iArr.length) {
            int iZzs = zzs(i7);
            int[] iArr2 = this.zzc;
            int iZzr = zzr(iZzs);
            int i8 = iArr2[i7];
            if (iZzr <= 17) {
                int i9 = iArr2[i7 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = iZzs & i4;
            switch (iZzr) {
                case 0:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzf(i8, zzfw.zza(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzo(i8, zzfw.zzb(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzt(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzJ(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzr(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzm(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzk(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzb(i8, zzfw.zzw(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzO(i8, unsafe.getObject(obj, j), zzgeVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzv(i8, unsafe.getObject(obj, j), zzv(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzd(i8, (zzcc) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzH(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzi(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzw(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzy(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzA(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzC(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzgeVar.zzq(i8, unsafe.getObject(obj, j), zzv(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzex.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 19:
                    zzex.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 20:
                    zzex.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 21:
                    zzex.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 22:
                    zzex.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 23:
                    zzex.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 24:
                    zzex.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 25:
                    zzex.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 26:
                    int i11 = this.zzc[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzex.zza;
                    if (list != null && !list.isEmpty()) {
                        zzgeVar.zzG(i11, list);
                        break;
                    } else {
                        break;
                    }
                case 27:
                    int i13 = this.zzc[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzev zzevVarZzv = zzv(i7);
                    int i14 = zzex.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ((zzcl) zzgeVar).zzv(i13, list2.get(i15), zzevVarZzv);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 28:
                    int i16 = this.zzc[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzex.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzgeVar.zze(i16, list3);
                        break;
                    } else {
                        break;
                    }
                    break;
                case 29:
                    zzex.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 30:
                    zzex.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 31:
                    zzex.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 32:
                    zzex.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 33:
                    zzex.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 34:
                    zzex.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, false);
                    break;
                case 35:
                    zzex.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 36:
                    zzex.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 37:
                    zzex.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 38:
                    zzex.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 39:
                    zzex.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 40:
                    zzex.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 41:
                    zzex.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 42:
                    zzex.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 43:
                    zzex.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 44:
                    zzex.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 45:
                    zzex.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 46:
                    zzex.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 47:
                    zzex.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 48:
                    zzex.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgeVar, true);
                    break;
                case 49:
                    int i18 = this.zzc[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzev zzevVarZzv2 = zzv(i7);
                    int i19 = zzex.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            ((zzcl) zzgeVar).zzq(i18, list4.get(i20), zzevVarZzv2);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzf(i8, zzm(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzo(i8, zzn(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzt(i8, zzt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzJ(i8, zzt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzr(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzm(i8, zzt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzk(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzb(i8, zzN(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i8, i7)) {
                        zzO(i8, unsafe.getObject(obj, j), zzgeVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzv(i8, unsafe.getObject(obj, j), zzv(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzd(i8, (zzcc) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzH(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzi(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzw(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzy(i8, zzt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzA(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzC(i8, zzt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i8, i7)) {
                        zzgeVar.zzq(i8, unsafe.getObject(obj, j), zzv(i7));
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        zzfm zzfmVar = this.zzm;
        zzfmVar.zzi(zzfmVar.zzd(obj), zzgeVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzfw.zza(obj, j)) != Double.doubleToLongBits(zzfw.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzfw.zzb(obj, j)) != Float.floatToIntBits(zzfw.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzfw.zzd(obj, j) != zzfw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzfw.zzd(obj, j) != zzfw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzfw.zzd(obj, j) != zzfw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzfw.zzw(obj, j) != zzfw.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzfw.zzd(obj, j) != zzfw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzfw.zzc(obj, j) != zzfw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzfw.zzd(obj, j) != zzfw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
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
                    zZzF = zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j));
                    break;
                case 50:
                    zZzF = zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j));
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
                    long jZzp = zzp(i) & 1048575;
                    if (zzfw.zzc(obj, jZzp) != zzfw.zzc(obj2, jZzp) || !zzex.zzF(zzfw.zzf(obj, j), zzfw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj);
        this.zzn.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    @Override // com.google.android.gms.internal.play_billing.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzen.zzk(java.lang.Object):boolean");
    }
}
