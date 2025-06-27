package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhci {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzhcx zzc;
    private static final zzhcx zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzhcx zzhcxVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzhcxVar = (zzhcx) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzhcxVar;
        zzd = new zzhcz();
    }

    public static void zzA(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzp(i, list, z);
    }

    public static void zzB(int i, List list, zzgzb zzgzbVar, zzhcg zzhcgVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgzbVar.zzq(i, list.get(i2), zzhcgVar);
        }
    }

    public static void zzC(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzs(i, list, z);
    }

    public static void zzD(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzu(i, list, z);
    }

    public static void zzE(int i, List list, zzgzb zzgzbVar, zzhcg zzhcgVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgzbVar.zzv(i, list.get(i2), zzhcgVar);
        }
    }

    public static void zzF(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzy(i, list, z);
    }

    public static void zzG(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzA(i, list, z);
    }

    public static void zzH(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzC(i, list, z);
    }

    public static void zzI(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzE(i, list, z);
    }

    public static void zzJ(int i, List list, zzgzb zzgzbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzH(i, list);
    }

    public static void zzK(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzJ(i, list, z);
    }

    public static void zzL(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzL(i, list, z);
    }

    static int zza(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzgza.zzE(zzgzwVar.zzd(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzgza.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzE;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgza.zzD(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgza.zzD(i << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzgza.zzE(zzgzwVar.zzd(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzgza.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzE;
    }

    static int zzg(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzgza.zzE(zzhbaVar.zza(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzgza.zzE(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzE;
    }

    static int zzh(int i, Object obj, zzhcg zzhcgVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzhar)) {
            return zzgza.zzD(i2) + zzgza.zzA((zzhbl) obj, zzhcgVar);
        }
        int iZzD = zzgza.zzD(i2);
        int iZza = ((zzhar) obj).zza();
        return iZzD + zzgza.zzD(iZza) + iZza;
    }

    static int zzi(List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            iZzD = 0;
            while (i < size) {
                int iZzd = zzgzwVar.zzd(i);
                iZzD += zzgza.zzD((iZzd >> 31) ^ (iZzd + iZzd));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzD += zzgza.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzD;
    }

    static int zzj(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) list;
            iZzE = 0;
            while (i < size) {
                long jZza = zzhbaVar.zza(i);
                iZzE += zzgza.zzE((jZza >> 63) ^ (jZza + jZza));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzE += zzgza.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzE;
    }

    static int zzk(List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzw) {
            zzgzw zzgzwVar = (zzgzw) list;
            iZzD = 0;
            while (i < size) {
                iZzD += zzgza.zzD(zzgzwVar.zzd(i));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                iZzD += zzgza.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzD;
    }

    static int zzl(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhba) {
            zzhba zzhbaVar = (zzhba) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzgza.zzE(zzhbaVar.zza(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzgza.zzE(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzE;
    }

    public static zzhcx zzm() {
        return zzc;
    }

    public static zzhcx zzn() {
        return zzd;
    }

    static Object zzo(Object obj, int i, List list, zzhab zzhabVar, Object obj2, zzhcx zzhcxVar) {
        if (zzhabVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (zzhabVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj2 = zzp(obj, i, iIntValue, obj2, zzhcxVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzhabVar.zza(iIntValue2)) {
                    obj2 = zzp(obj, i, iIntValue2, obj2, zzhcxVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzp(Object obj, int i, int i2, Object obj2, zzhcx zzhcxVar) {
        if (obj2 == null) {
            obj2 = zzhcxVar.zzc(obj);
        }
        zzhcxVar.zzl(obj2, i, i2);
        return obj2;
    }

    static void zzq(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzgzk zzgzkVarZzb = zzgzgVar.zzb(obj2);
        if (zzgzkVarZzb.zza.isEmpty()) {
            return;
        }
        zzgzgVar.zzc(obj).zzj(zzgzkVarZzb);
    }

    static void zzr(zzhcx zzhcxVar, Object obj, Object obj2) {
        zzhcxVar.zzo(obj, zzhcxVar.zze(zzhcxVar.zzd(obj), zzhcxVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzgzv.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzt(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void zzu(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzc(i, list, z);
    }

    public static void zzv(int i, List list, zzgzb zzgzbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zze(i, list);
    }

    public static void zzw(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzg(i, list, z);
    }

    public static void zzx(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzj(i, list, z);
    }

    public static void zzy(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzl(i, list, z);
    }

    public static void zzz(int i, List list, zzgzb zzgzbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzbVar.zzn(i, list, z);
    }
}
