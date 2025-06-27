package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzmc {
    private static final Class<?> zza = zzd();
    private static final zzmv<?, ?> zzb = zzc();
    private static final zzmv<?, ?> zzc = new zzmx();

    static int zza(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zza(i, true);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zza(int i, List<zzii> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzf = size * zzjc.zzf(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZzf += zzjc.zza(list.get(i2));
        }
        return iZzf;
    }

    static int zzb(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzjc.zzf(i));
    }

    static int zzb(List<Integer> list) {
        int iZza;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            iZza = 0;
            while (i < size) {
                iZza += zzjc.zza(zzjwVar.zzb(i));
                i++;
            }
        } else {
            iZza = 0;
            while (i < size) {
                iZza += zzjc.zza(list.get(i).intValue());
                i++;
            }
        }
        return iZza;
    }

    static int zzc(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zzb(i, 0);
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zza(i, 0L);
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zza(int i, List<zzli> list, zzma zzmaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZza = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iZza += zzjc.zza(i, list.get(i2), zzmaVar);
        }
        return iZza;
    }

    static int zze(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjc.zzf(i));
    }

    static int zze(List<Integer> list) {
        int iZzc;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            iZzc = 0;
            while (i < size) {
                iZzc += zzjc.zzc(zzjwVar.zzb(i));
                i++;
            }
        } else {
            iZzc = 0;
            while (i < size) {
                iZzc += zzjc.zzc(list.get(i).intValue());
                i++;
            }
        }
        return iZzc;
    }

    static int zzf(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzjc.zzf(i));
    }

    static int zzf(List<Long> list) {
        int iZzb;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            iZzb = 0;
            while (i < size) {
                iZzb += zzjc.zzb(zzktVar.zzb(i));
                i++;
            }
        } else {
            iZzb = 0;
            while (i < size) {
                iZzb += zzjc.zzb(list.get(i).longValue());
                i++;
            }
        }
        return iZzb;
    }

    static int zza(int i, Object obj, zzma zzmaVar) {
        if (obj instanceof zzkm) {
            return zzjc.zzb(i, (zzkm) obj);
        }
        return zzjc.zzb(i, (zzli) obj, zzmaVar);
    }

    static int zzb(int i, List<?> list, zzma zzmaVar) {
        int iZza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzf = zzjc.zzf(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzkm) {
                iZza = zzjc.zza((zzkm) obj);
            } else {
                iZza = zzjc.zza((zzli) obj, zzmaVar);
            }
            iZzf += iZza;
        }
        return iZzf;
    }

    static int zzg(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzjc.zzf(i));
    }

    static int zzg(List<Integer> list) {
        int iZze;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            iZze = 0;
            while (i < size) {
                iZze += zzjc.zze(zzjwVar.zzb(i));
                i++;
            }
        } else {
            iZze = 0;
            while (i < size) {
                iZze += zzjc.zze(list.get(i).intValue());
                i++;
            }
        }
        return iZze;
    }

    static int zzh(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzjc.zzf(i));
    }

    static int zzh(List<Long> list) {
        int iZzd;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            iZzd = 0;
            while (i < size) {
                iZzd += zzjc.zzd(zzktVar.zzb(i));
                i++;
            }
        } else {
            iZzd = 0;
            while (i < size) {
                iZzd += zzjc.zzd(list.get(i).longValue());
                i++;
            }
        }
        return iZzd;
    }

    static int zzb(int i, List<?> list) {
        int iZza;
        int iZza2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzf = zzjc.zzf(i) * size;
        if (list instanceof zzko) {
            zzko zzkoVar = (zzko) list;
            while (i2 < size) {
                Object objZzb = zzkoVar.zzb(i2);
                if (objZzb instanceof zzii) {
                    iZza2 = zzjc.zza((zzii) objZzb);
                } else {
                    iZza2 = zzjc.zza((String) objZzb);
                }
                iZzf += iZza2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzii) {
                    iZza = zzjc.zza((zzii) obj);
                } else {
                    iZza = zzjc.zza((String) obj);
                }
                iZzf += iZza;
                i2++;
            }
        }
        return iZzf;
    }

    static int zzi(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzjc.zzf(i));
    }

    static int zzi(List<Integer> list) {
        int iZzg;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            iZzg = 0;
            while (i < size) {
                iZzg += zzjc.zzg(zzjwVar.zzb(i));
                i++;
            }
        } else {
            iZzg = 0;
            while (i < size) {
                iZzg += zzjc.zzg(list.get(i).intValue());
                i++;
            }
        }
        return iZzg;
    }

    static int zzj(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzjc.zzf(i));
    }

    static int zzj(List<Long> list) {
        int iZze;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            iZze = 0;
            while (i < size) {
                iZze += zzjc.zze(zzktVar.zzb(i));
                i++;
            }
        } else {
            iZze = 0;
            while (i < size) {
                iZze += zzjc.zze(list.get(i).longValue());
                i++;
            }
        }
        return iZze;
    }

    private static zzmv<?, ?> zzc() {
        try {
            Class<?> clsZze = zze();
            if (clsZze == null) {
                return null;
            }
            return (zzmv) clsZze.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static zzmv<?, ?> zza() {
        return zzb;
    }

    public static zzmv<?, ?> zzb() {
        return zzc;
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB zza(Object obj, int i, List<Integer> list, zzjz zzjzVar, UB ub, zzmv<UT, UB> zzmvVar) {
        if (zzjzVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (zzjzVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(obj, i, iIntValue, ub, zzmvVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzjzVar.zza(iIntValue2)) {
                    ub = (UB) zza(obj, i, iIntValue2, ub, zzmvVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB zza(Object obj, int i, int i2, UB ub, zzmv<UT, UB> zzmvVar) {
        if (ub == null) {
            ub = zzmvVar.zzc(obj);
        }
        zzmvVar.zzb(ub, i, i2);
        return ub;
    }

    static <T, FT extends zzjn<FT>> void zza(zzjk<FT> zzjkVar, T t, T t2) {
        zzjl<T> zzjlVarZza = zzjkVar.zza(t2);
        if (zzjlVarZza.zza.isEmpty()) {
            return;
        }
        zzjkVar.zzb(t).zza((zzjl) zzjlVarZza);
    }

    static <T> void zza(zzlb zzlbVar, T t, T t2, long j) {
        zznb.zza(t, j, zzlbVar.zza(zznb.zze(t, j), zznb.zze(t2, j)));
    }

    static <T, UT, UB> void zza(zzmv<UT, UB> zzmvVar, T t, T t2) {
        zzmvVar.zzc(t, zzmvVar.zza(zzmvVar.zzd(t), zzmvVar.zzd(t2)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzjv.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Boolean> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zza(i, list, z);
    }

    public static void zza(int i, List<zzii> list, zznv zznvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zza(i, list);
    }

    public static void zzb(int i, List<Double> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzb(i, list, z);
    }

    public static void zzc(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zze(i, list, z);
    }

    public static void zzf(int i, List<Float> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzf(i, list, z);
    }

    public static void zza(int i, List<?> list, zznv zznvVar, zzma zzmaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zza(i, list, zzmaVar);
    }

    public static void zzg(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzg(i, list, z);
    }

    public static void zzh(int i, List<Long> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzh(i, list, z);
    }

    public static void zzb(int i, List<?> list, zznv zznvVar, zzma zzmaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzb(i, list, zzmaVar);
    }

    public static void zzi(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzi(i, list, z);
    }

    public static void zzj(int i, List<Long> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzj(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzk(i, list, z);
    }

    public static void zzl(int i, List<Long> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzl(i, list, z);
    }

    public static void zzb(int i, List<String> list, zznv zznvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzb(i, list);
    }

    public static void zzm(int i, List<Integer> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzm(i, list, z);
    }

    public static void zzn(int i, List<Long> list, zznv zznvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznvVar.zzn(i, list, z);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
