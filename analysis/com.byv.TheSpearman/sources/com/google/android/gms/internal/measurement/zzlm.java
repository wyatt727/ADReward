package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzlm<T> implements zzma<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznb.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzli zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final zzlt zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzlq zzo;
    private final zzkn zzp;
    private final zzmv<?, ?> zzq;
    private final zzjk<?> zzr;
    private final zzlb zzs;

    private static <T> double zza(T t, long j) {
        return ((Double) zznb.zze(t, j)).doubleValue();
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zznb.zze(t, j)).floatValue();
    }

    private static int zza(byte[] bArr, int i, int i2, zzni zzniVar, Class<?> cls, zzih zzihVar) throws IOException {
        switch (zzll.zza[zzniVar.ordinal()]) {
            case 1:
                int iZzd = zzie.zzd(bArr, i, zzihVar);
                zzihVar.zzc = Boolean.valueOf(zzihVar.zzb != 0);
                return iZzd;
            case 2:
                return zzie.zza(bArr, i, zzihVar);
            case 3:
                zzihVar.zzc = Double.valueOf(zzie.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzihVar.zzc = Integer.valueOf(zzie.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzihVar.zzc = Long.valueOf(zzie.zzd(bArr, i));
                return i + 8;
            case 8:
                zzihVar.zzc = Float.valueOf(zzie.zzb(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZzc = zzie.zzc(bArr, i, zzihVar);
                zzihVar.zzc = Integer.valueOf(zzihVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzie.zzd(bArr, i, zzihVar);
                zzihVar.zzc = Long.valueOf(zzihVar.zzb);
                return iZzd2;
            case 14:
                return zzie.zza(zzlw.zza().zza((Class) cls), bArr, i, i2, zzihVar);
            case 15:
                int iZzc2 = zzie.zzc(bArr, i, zzihVar);
                zzihVar.zzc = Integer.valueOf(zziw.zza(zzihVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzie.zzd(bArr, i, zzihVar);
                zzihVar.zzc = Long.valueOf(zziw.zza(zzihVar.zzb));
                return iZzd3;
            case 17:
                return zzie.zzb(bArr, i, zzihVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // com.google.android.gms.internal.measurement.zzma
    public final int zza(T t) {
        int i;
        int i2;
        int i3;
        boolean z;
        int iZza;
        int iZza2;
        int iZzd;
        int iZzd2;
        int iZzf;
        int iZzg;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        ?? r10 = 0;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iZzd3 = 0;
        while (i7 < this.zzc.length) {
            int iZzc = zzc(i7);
            int i8 = (267386880 & iZzc) >>> 20;
            int[] iArr = this.zzc;
            int i9 = iArr[i7];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & i4;
            if (i8 <= 17) {
                if (i11 != i5) {
                    i6 = i11 == i4 ? r10 : unsafe.getInt(t, i11);
                    i5 = i11;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i10 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = r10;
            }
            long j = iZzc & i4;
            if (i8 >= zzjq.DOUBLE_LIST_PACKED.zza()) {
                zzjq.SINT64_LIST_PACKED.zza();
            }
            int i12 = i3;
            switch (i8) {
                case 0:
                    z = r10;
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza = zzjc.zza(i9, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    z = r10;
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza = zzjc.zza(i9, 0.0f);
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    z = r10;
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza = zzjc.zzb(i9, unsafe.getLong(t, j));
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    z = r10;
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza = zzjc.zze(i9, unsafe.getLong(t, j));
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    z = r10;
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza = zzjc.zzc(i9, unsafe.getInt(t, j));
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    z = r10;
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza = zzjc.zza(i9, 0L);
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        z = false;
                        iZza = zzjc.zzb(i9, 0);
                        iZzd3 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzjc.zza(i9, true);
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 8:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzii) {
                            iZza2 = zzjc.zza(i9, (zzii) object);
                        } else {
                            iZza2 = zzjc.zza(i9, (String) object);
                        }
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 9:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzmc.zza(i9, unsafe.getObject(t, j), zze(i7));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 10:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzjc.zza(i9, (zzii) unsafe.getObject(t, j));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 11:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzjc.zzf(i9, unsafe.getInt(t, j));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 12:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzjc.zza(i9, unsafe.getInt(t, j));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 13:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZzd3 += zzjc.zzd(i9, 0);
                    }
                    z = false;
                    break;
                case 14:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzjc.zzc(i9, 0L);
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 15:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzjc.zze(i9, unsafe.getInt(t, j));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 16:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzjc.zzd(i9, unsafe.getLong(t, j));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 17:
                    if (zza((zzlm<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzjc.zza(i9, (zzli) unsafe.getObject(t, j), zze(i7));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 18:
                    iZzd = zzmc.zzd(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 19:
                    iZzd = zzmc.zzc(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 20:
                    iZzd = zzmc.zzf(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 21:
                    iZzd = zzmc.zzj(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 22:
                    iZzd = zzmc.zze(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 23:
                    iZzd = zzmc.zzd(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 24:
                    iZzd = zzmc.zzc(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 25:
                    iZzd = zzmc.zza(i9, (List<?>) unsafe.getObject(t, j), (boolean) r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 26:
                    iZzd = zzmc.zzb(i9, (List) unsafe.getObject(t, j));
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 27:
                    iZzd = zzmc.zzb(i9, (List<?>) unsafe.getObject(t, j), zze(i7));
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 28:
                    iZzd = zzmc.zza(i9, (List<zzii>) unsafe.getObject(t, j));
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 29:
                    iZzd = zzmc.zzi(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 30:
                    iZzd = zzmc.zzb(i9, (List<Integer>) unsafe.getObject(t, j), (boolean) r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 31:
                    iZzd = zzmc.zzc(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 32:
                    iZzd = zzmc.zzd(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 33:
                    iZzd = zzmc.zzg(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 34:
                    iZzd = zzmc.zzh(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 35:
                    iZzd2 = zzmc.zzd((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 36:
                    iZzd2 = zzmc.zzc((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 37:
                    iZzd2 = zzmc.zzf((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 38:
                    iZzd2 = zzmc.zzj((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 39:
                    iZzd2 = zzmc.zze((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 40:
                    iZzd2 = zzmc.zzd((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 41:
                    iZzd2 = zzmc.zzc((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 42:
                    iZzd2 = zzmc.zza((List<?>) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 43:
                    iZzd2 = zzmc.zzi((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 44:
                    iZzd2 = zzmc.zzb((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 45:
                    iZzd2 = zzmc.zzc((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 46:
                    iZzd2 = zzmc.zzd((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 47:
                    iZzd2 = zzmc.zzg((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 48:
                    iZzd2 = zzmc.zzh((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzf = zzjc.zzf(i9);
                        iZzg = zzjc.zzg(iZzd2);
                        iZzd3 += iZzf + iZzg + iZzd2;
                    }
                    z = r10;
                    break;
                case 49:
                    iZzd = zzmc.zza(i9, (List<zzli>) unsafe.getObject(t, j), zze(i7));
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 50:
                    iZzd = this.zzs.zza(i9, unsafe.getObject(t, j), zzf(i7));
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 51:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zza(i9, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 52:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zza(i9, 0.0f);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 53:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zzb(i9, zzd(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 54:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zze(i9, zzd(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 55:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zzc(i9, zzc(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 56:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zza(i9, 0L);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 57:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zzb(i9, (int) r10);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 58:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zza(i9, true);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 59:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzii) {
                            iZzd = zzjc.zza(i9, (zzii) object2);
                        } else {
                            iZzd = zzjc.zza(i9, (String) object2);
                        }
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 60:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzmc.zza(i9, unsafe.getObject(t, j), zze(i7));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 61:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zza(i9, (zzii) unsafe.getObject(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 62:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zzf(i9, zzc(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 63:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zza(i9, zzc(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 64:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zzd(i9, (int) r10);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 65:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zzc(i9, 0L);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 66:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zze(i9, zzc(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 67:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zzd(i9, zzd(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 68:
                    if (zzc((zzlm<T>) t, i9, i7)) {
                        iZzd = zzjc.zza(i9, (zzli) unsafe.getObject(t, j), zze(i7));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                default:
                    z = r10;
                    break;
            }
            i7 += 3;
            i5 = i;
            r10 = z;
            i6 = i2;
            i4 = 1048575;
        }
        int iZza3 = r10;
        zzmv<?, ?> zzmvVar = this.zzq;
        int iZza4 = iZzd3 + zzmvVar.zza((zzmv<?, ?>) zzmvVar.zzd(t));
        if (!this.zzh) {
            return iZza4;
        }
        zzjl<T> zzjlVarZza = this.zzr.zza(t);
        for (int i13 = iZza3; i13 < zzjlVarZza.zza.zza(); i13++) {
            Map.Entry entryZzb = zzjlVarZza.zza.zzb(i13);
            iZza3 += zzjl.zza((zzjn<?>) entryZzb.getKey(), entryZzb.getValue());
        }
        for (Map.Entry entry : zzjlVarZza.zza.zzb()) {
            iZza3 += zzjl.zza((zzjn<?>) entry.getKey(), entry.getValue());
        }
        return iZza4 + iZza3;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final int zzb(T t) {
        int i;
        int iZza;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzc = zzc(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzc;
            int iHashCode = 37;
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iZza = zzjy.zza(Double.doubleToLongBits(zznb.zza(t, j)));
                    i2 = i + iZza;
                    break;
                case 1:
                    i = i2 * 53;
                    iZza = Float.floatToIntBits(zznb.zzb(t, j));
                    i2 = i + iZza;
                    break;
                case 2:
                    i = i2 * 53;
                    iZza = zzjy.zza(zznb.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 3:
                    i = i2 * 53;
                    iZza = zzjy.zza(zznb.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 4:
                    i = i2 * 53;
                    iZza = zznb.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 5:
                    i = i2 * 53;
                    iZza = zzjy.zza(zznb.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 6:
                    i = i2 * 53;
                    iZza = zznb.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 7:
                    i = i2 * 53;
                    iZza = zzjy.zza(zznb.zzh(t, j));
                    i2 = i + iZza;
                    break;
                case 8:
                    i = i2 * 53;
                    iZza = ((String) zznb.zze(t, j)).hashCode();
                    i2 = i + iZza;
                    break;
                case 9:
                    Object objZze = zznb.zze(t, j);
                    if (objZze != null) {
                        iHashCode = objZze.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZza = zznb.zze(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 11:
                    i = i2 * 53;
                    iZza = zznb.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 12:
                    i = i2 * 53;
                    iZza = zznb.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 13:
                    i = i2 * 53;
                    iZza = zznb.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 14:
                    i = i2 * 53;
                    iZza = zzjy.zza(zznb.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 15:
                    i = i2 * 53;
                    iZza = zznb.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 16:
                    i = i2 * 53;
                    iZza = zzjy.zza(zznb.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 17:
                    Object objZze2 = zznb.zze(t, j);
                    if (objZze2 != null) {
                        iHashCode = objZze2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                    i = i2 * 53;
                    iZza = zznb.zze(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 50:
                    i = i2 * 53;
                    iZza = zznb.zze(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 51:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjy.zza(Double.doubleToLongBits(zza(t, j)));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = Float.floatToIntBits(zzb(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjy.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjy.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjy.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjy.zza(zze(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = ((String) zznb.zze(t, j)).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zznb.zze(t, j).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zznb.zze(t, j).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjy.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzjy.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzlm<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zznb.zze(t, j).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzq.zzd(t).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzr.zza(t).hashCode() : iHashCode2;
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zznb.zze(t, j)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:425:0x0a7c, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkd.zzh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0d8a, code lost:
    
        if (r14 == 1048575) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0d8c, code lost:
    
        r15.putInt(r10, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0d90, code lost:
    
        r3 = null;
        r7 = r9.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0d97, code lost:
    
        if (r7 >= r9.zzn) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0d99, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzmy) zza((java.lang.Object) r33, r9.zzl[r7], (int) r3, (com.google.android.gms.internal.measurement.zzmv<UT, int>) r9.zzq, (java.lang.Object) r33);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0daf, code lost:
    
        if (r3 == null) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0db1, code lost:
    
        r9.zzq.zzb((java.lang.Object) r10, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0db6, code lost:
    
        if (r6 != 0) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0dba, code lost:
    
        if (r8 != r36) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0dc1, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkd.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0dc4, code lost:
    
        if (r8 > r36) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0dc6, code lost:
    
        if (r11 != r6) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0dc8, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0dcd, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkd.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0934 A[PHI: r6 r8 r9 r10 r11 r13 r14 r15
      0x0934: PHI (r6v61 com.google.android.gms.internal.measurement.zzlm<T>) = 
      (r6v41 com.google.android.gms.internal.measurement.zzlm<T>)
      (r6v42 com.google.android.gms.internal.measurement.zzlm<T>)
      (r6v43 com.google.android.gms.internal.measurement.zzlm<T>)
      (r6v48 com.google.android.gms.internal.measurement.zzlm<T>)
      (r6v62 com.google.android.gms.internal.measurement.zzlm<T>)
     binds: [B:373:0x0913, B:357:0x08c5, B:341:0x0876, B:266:0x070a, B:138:0x0486] A[DONT_GENERATE, DONT_INLINE]
      0x0934: PHI (r8v73 int) = (r8v46 int), (r8v47 int), (r8v48 int), (r8v56 int), (r8v74 int) binds: [B:373:0x0913, B:357:0x08c5, B:341:0x0876, B:266:0x070a, B:138:0x0486] A[DONT_GENERATE, DONT_INLINE]
      0x0934: PHI (r9v60 int) = (r9v42 int), (r9v43 int), (r9v44 int), (r9v46 int), (r9v61 int) binds: [B:373:0x0913, B:357:0x08c5, B:341:0x0876, B:266:0x070a, B:138:0x0486] A[DONT_GENERATE, DONT_INLINE]
      0x0934: PHI (r10v57 int) = (r10v33 int), (r10v34 int), (r10v35 int), (r10v37 int), (r10v58 int) binds: [B:373:0x0913, B:357:0x08c5, B:341:0x0876, B:266:0x070a, B:138:0x0486] A[DONT_GENERATE, DONT_INLINE]
      0x0934: PHI (r11v37 sun.misc.Unsafe) = 
      (r11v22 sun.misc.Unsafe)
      (r11v23 sun.misc.Unsafe)
      (r11v24 sun.misc.Unsafe)
      (r11v29 sun.misc.Unsafe)
      (r11v38 sun.misc.Unsafe)
     binds: [B:373:0x0913, B:357:0x08c5, B:341:0x0876, B:266:0x070a, B:138:0x0486] A[DONT_GENERATE, DONT_INLINE]
      0x0934: PHI (r13v58 int) = (r13v42 int), (r13v43 int), (r13v44 int), (r13v49 int), (r13v59 int) binds: [B:373:0x0913, B:357:0x08c5, B:341:0x0876, B:266:0x070a, B:138:0x0486] A[DONT_GENERATE, DONT_INLINE]
      0x0934: PHI (r14v70 byte[]) = (r14v44 byte[]), (r14v45 byte[]), (r14v46 byte[]), (r14v51 byte[]), (r14v71 byte[]) binds: [B:373:0x0913, B:357:0x08c5, B:341:0x0876, B:266:0x070a, B:138:0x0486] A[DONT_GENERATE, DONT_INLINE]
      0x0934: PHI (r15v31 int) = (r15v11 int), (r15v12 int), (r15v13 int), (r15v18 int), (r15v32 int) binds: [B:373:0x0913, B:357:0x08c5, B:341:0x0876, B:266:0x070a, B:138:0x0486] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0943 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0d69 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0937 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0cf2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v63, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zza(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.measurement.zzih r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzih):int");
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    private final int zza(int i, int i2) {
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

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zznb.zze(t, j)).longValue();
    }

    private final zzjz zzd(int i) {
        return (zzjz) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.android.gms.internal.measurement.zzlm<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.measurement.zzlg r33, com.google.android.gms.internal.measurement.zzlq r34, com.google.android.gms.internal.measurement.zzkn r35, com.google.android.gms.internal.measurement.zzmv<?, ?> r36, com.google.android.gms.internal.measurement.zzjk<?> r37, com.google.android.gms.internal.measurement.zzlb r38) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zza(java.lang.Class, com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlq, com.google.android.gms.internal.measurement.zzkn, com.google.android.gms.internal.measurement.zzmv, com.google.android.gms.internal.measurement.zzjk, com.google.android.gms.internal.measurement.zzlb):com.google.android.gms.internal.measurement.zzlm");
    }

    private final zzma zze(int i) {
        int i2 = (i / 3) << 1;
        zzma zzmaVar = (zzma) this.zzd[i2];
        if (zzmaVar != null) {
            return zzmaVar;
        }
        zzma<T> zzmaVarZza = zzlw.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zzmaVarZza;
        return zzmaVarZza;
    }

    private static zzmy zze(Object obj) {
        zzjv zzjvVar = (zzjv) obj;
        zzmy zzmyVar = zzjvVar.zzb;
        if (zzmyVar != zzmy.zzc()) {
            return zzmyVar;
        }
        zzmy zzmyVarZzd = zzmy.zzd();
        zzjvVar.zzb = zzmyVarZzd;
        return zzmyVarZzd;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzmv<UT, UB> zzmvVar, Object obj2) {
        zzjz zzjzVarZzd;
        int i2 = this.zzc[i];
        Object objZze = zznb.zze(obj, zzc(i) & 1048575);
        return (objZze == null || (zzjzVarZzd = zzd(i)) == null) ? ub : (UB) zza(i, i2, this.zzs.zze(objZze), zzjzVarZzd, (zzjz) ub, (zzmv<UT, zzjz>) zzmvVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzjz zzjzVar, UB ub, zzmv<UT, UB> zzmvVar, Object obj) {
        zzkz<?, ?> zzkzVarZza = this.zzs.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjzVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmvVar.zzc(obj);
                }
                zzir zzirVarZzc = zzii.zzc(zzla.zza(zzkzVarZza, next.getKey(), next.getValue()));
                try {
                    zzla.zza(zzirVarZzc.zzb(), zzkzVarZza, next.getKey(), next.getValue());
                    zzmvVar.zza((zzmv<UT, UB>) ub, i2, zzirVarZzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i) {
        zzma zzmaVarZze = zze(i);
        long jZzc = zzc(i) & 1048575;
        if (!zzc((zzlm<T>) t, i)) {
            return zzmaVarZze.zza();
        }
        Object object = zzb.getObject(t, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzmaVarZze.zza();
        if (object != null) {
            zzmaVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i, int i2) {
        zzma zzmaVarZze = zze(i2);
        if (!zzc((zzlm<T>) t, i, i2)) {
            return zzmaVarZze.zza();
        }
        Object object = zzb.getObject(t, zzc(i2) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzmaVarZze.zza();
        if (object != null) {
            zzmaVarZze.zza(objZza, object);
        }
        return objZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
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

    private zzlm(int[] iArr, Object[] objArr, int i, int i2, zzli zzliVar, zzlt zzltVar, boolean z, int[] iArr2, int i3, int i4, zzlq zzlqVar, zzkn zzknVar, zzmv<?, ?> zzmvVar, zzjk<?> zzjkVar, zzlb zzlbVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzliVar instanceof zzjv;
        this.zzj = zzltVar;
        this.zzh = zzjkVar != null && zzjkVar.zza(zzliVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzlqVar;
        this.zzp = zzknVar;
        this.zzq = zzmvVar;
        this.zzr = zzjkVar;
        this.zzg = zzliVar;
        this.zzs = zzlbVar;
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // com.google.android.gms.internal.measurement.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(T r8) {
        /*
            r7 = this;
            boolean r0 = zzg(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.zzjv
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.measurement.zzjv r0 = (com.google.android.gms.internal.measurement.zzjv) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzc(r2)
            r0.zza = r1
            r0.zzci()
        L1a:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L83
            int r2 = r7.zzc(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.zzlm.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            com.google.android.gms.internal.measurement.zzlb r6 = r7.zzs
            java.lang.Object r5 = r6.zzc(r5)
            r2.putObject(r8, r3, r5)
            goto L80
        L4f:
            com.google.android.gms.internal.measurement.zzkn r2 = r7.zzp
            r2.zzb(r8, r3)
            goto L80
        L55:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzc(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.measurement.zzma r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.zzlm.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzc(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzc(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.measurement.zzma r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.zzlm.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzc(r3)
        L80:
            int r1 = r1 + 3
            goto L1d
        L83:
            com.google.android.gms.internal.measurement.zzmv<?, ?> r0 = r7.zzq
            r0.zzf(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.measurement.zzjk<?> r0 = r7.zzr
            r0.zzc(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzc(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final void zza(T t, T t2) {
        zzf(t);
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzc = zzc(i);
            long j = 1048575 & iZzc;
            int i2 = this.zzc[i];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza(t, j, zznb.zza(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzb(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzd(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzd(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzd(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zzc(t, j, zznb.zzh(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza(t, j, zznb.zze(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza(t, j, zznb.zze(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzd(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzc(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzlm<T>) t2, i)) {
                        zznb.zza((Object) t, j, zznb.zzd(t2, j));
                        zzb((zzlm<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
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
                    this.zzp.zza(t, t2, j);
                    break;
                case 50:
                    zzmc.zza(this.zzs, t, t2, j);
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
                    if (zzc((zzlm<T>) t2, i2, i)) {
                        zznb.zza(t, j, zznb.zze(t2, j));
                        zzb((zzlm<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzlm<T>) t2, i2, i)) {
                        zznb.zza(t, j, zznb.zze(t2, j));
                        zzb((zzlm<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzmc.zza(this.zzq, t, t2);
        if (this.zzh) {
            zzmc.zza(this.zzr, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0620 A[Catch: all -> 0x0295, TryCatch #1 {all -> 0x0295, blocks: (B:153:0x05f4, B:163:0x061b, B:165:0x0620, B:166:0x0625, B:49:0x00c9, B:50:0x00db, B:51:0x00ed, B:52:0x00ff, B:53:0x0110, B:54:0x0121, B:56:0x012b, B:59:0x0132, B:60:0x0139, B:61:0x0146, B:62:0x0157, B:63:0x0164, B:64:0x0175, B:66:0x0180, B:67:0x0191, B:68:0x01a2, B:69:0x01b3, B:70:0x01c4, B:71:0x01d5, B:72:0x01e6, B:73:0x01f7, B:74:0x0209, B:76:0x0219, B:80:0x023a, B:77:0x0223, B:79:0x022b, B:81:0x024b, B:82:0x025d, B:83:0x026b, B:84:0x0279, B:85:0x0287), top: B:189:0x05f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0657 A[LOOP:2: B:181:0x0653->B:183:0x0657, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x062b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.measurement.zzlx] */
    @Override // com.google.android.gms.internal.measurement.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r18, com.google.android.gms.internal.measurement.zzlx r19, com.google.android.gms.internal.measurement.zzji r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlx, com.google.android.gms.internal.measurement.zzji):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final void zza(T t, byte[] bArr, int i, int i2, zzih zzihVar) throws IOException {
        zza((zzlm<T>) t, bArr, i, i2, 0, zzihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i) {
        if (zzc((zzlm<T>) t2, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzma zzmaVarZze = zze(i);
            if (!zzc((zzlm<T>) t, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, jZzc, object);
                } else {
                    Object objZza = zzmaVarZze.zza();
                    zzmaVarZze.zza(objZza, object);
                    unsafe.putObject(t, jZzc, objZza);
                }
                zzb((zzlm<T>) t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzmaVarZze.zza();
                zzmaVarZze.zza(objZza2, object2);
                unsafe.putObject(t, jZzc, objZza2);
                object2 = objZza2;
            }
            zzmaVarZze.zza(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i) {
        int i2 = this.zzc[i];
        if (zzc((zzlm<T>) t2, i2, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzma zzmaVarZze = zze(i);
            if (!zzc((zzlm<T>) t, i2, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, jZzc, object);
                } else {
                    Object objZza = zzmaVarZze.zza();
                    zzmaVarZze.zza(objZza, object);
                    unsafe.putObject(t, jZzc, objZza);
                }
                zzb((zzlm<T>) t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzmaVarZze.zza();
                zzmaVarZze.zza(objZza2, object2);
                unsafe.putObject(t, jZzc, objZza2);
                object2 = objZza2;
            }
            zzmaVarZze.zza(object2, object);
        }
    }

    private final void zza(Object obj, int i, zzlx zzlxVar) throws IOException {
        if (zzg(i)) {
            zznb.zza(obj, i & 1048575, zzlxVar.zzr());
        } else if (this.zzi) {
            zznb.zza(obj, i & 1048575, zzlxVar.zzq());
        } else {
            zznb.zza(obj, i & 1048575, zzlxVar.zzp());
        }
    }

    private final void zzb(T t, int i) {
        int iZzb = zzb(i);
        long j = 1048575 & iZzb;
        if (j == 1048575) {
            return;
        }
        zznb.zza((Object) t, j, (1 << (iZzb >>> 20)) | zznb.zzc(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zznb.zza((Object) t, zzb(i2) & 1048575, i);
    }

    private final void zza(T t, int i, Object obj) {
        zzb.putObject(t, zzc(i) & 1048575, obj);
        zzb((zzlm<T>) t, i);
    }

    private final void zza(T t, int i, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzlm<T>) t, i, i2);
    }

    private final <K, V> void zza(zznv zznvVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zznvVar.zza(i, this.zzs.zza(zzf(i2)), this.zzs.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zznv zznvVar) throws IOException {
        if (obj instanceof String) {
            zznvVar.zza(i, (String) obj);
        } else {
            zznvVar.zza(i, (zzii) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // com.google.android.gms.internal.measurement.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r24, com.google.android.gms.internal.measurement.zznv r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zza(java.lang.Object, com.google.android.gms.internal.measurement.zznv):void");
    }

    private static <UT, UB> void zza(zzmv<UT, UB> zzmvVar, T t, zznv zznvVar) throws IOException {
        zzmvVar.zzb((zzmv<UT, UB>) zzmvVar.zzd(t), zznvVar);
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzc((zzlm<T>) t, i) == zzc((zzlm<T>) t2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.measurement.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    private final boolean zzc(T t, int i) {
        int iZzb = zzb(i);
        long j = iZzb & 1048575;
        if (j != 1048575) {
            return (zznb.zzc(t, j) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i);
        long j2 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zznb.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznb.zzb(t, j2)) != 0;
            case 2:
                return zznb.zzd(t, j2) != 0;
            case 3:
                return zznb.zzd(t, j2) != 0;
            case 4:
                return zznb.zzc(t, j2) != 0;
            case 5:
                return zznb.zzd(t, j2) != 0;
            case 6:
                return zznb.zzc(t, j2) != 0;
            case 7:
                return zznb.zzh(t, j2);
            case 8:
                Object objZze = zznb.zze(t, j2);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzii) {
                    return !zzii.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zznb.zze(t, j2) != null;
            case 10:
                return !zzii.zza.equals(zznb.zze(t, j2));
            case 11:
                return zznb.zzc(t, j2) != 0;
            case 12:
                return zznb.zzc(t, j2) != 0;
            case 13:
                return zznb.zzc(t, j2) != 0;
            case 14:
                return zznb.zzd(t, j2) != 0;
            case 15:
                return zznb.zzc(t, j2) != 0;
            case 16:
                return zznb.zzd(t, j2) != 0;
            case 17:
                return zznb.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzc((zzlm<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.measurement.zzma] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.zzma] */
    @Override // com.google.android.gms.internal.measurement.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(T r19) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzd(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzma zzmaVar) {
        return zzmaVar.zzd(zznb.zze(obj, i & 1048575));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzjv) {
            return ((zzjv) obj).zzcj();
        }
        return true;
    }

    private final boolean zzc(T t, int i, int i2) {
        return zznb.zzc(t, (long) (zzb(i2) & 1048575)) == i;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zznb.zze(t, j)).booleanValue();
    }
}
