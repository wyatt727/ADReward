package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzbe {
    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar, Boolean bool, Boolean bool2) {
        zzaf zzafVar2 = new zzaf();
        Iterator<Integer> itZzg = zzafVar.zzg();
        while (itZzg.hasNext()) {
            int iIntValue = itZzg.next().intValue();
            if (zzafVar.zzc(iIntValue)) {
                zzaq zzaqVarZza = zzalVar.zza(zzhVar, Arrays.asList(zzafVar.zza(iIntValue), new zzai(Double.valueOf(iIntValue)), zzafVar));
                if (zzaqVarZza.zzd().equals(bool)) {
                    return zzafVar2;
                }
                if (bool2 == null || zzaqVarZza.zzd().equals(bool2)) {
                    zzafVar2.zzb(iIntValue, zzaqVarZza);
                }
            }
        }
        return zzafVar2;
    }

    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar) {
        return zza(zzafVar, zzhVar, zzalVar, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0035 A[PHI: r16
      0x0035: PHI (r16v22 char) = 
      (r16v0 char)
      (r16v0 char)
      (r16v2 char)
      (r16v0 char)
      (r16v0 char)
      (r16v0 char)
      (r16v5 char)
      (r16v0 char)
      (r16v6 char)
      (r16v0 char)
      (r16v7 char)
      (r16v0 char)
      (r16v8 char)
      (r16v0 char)
      (r16v9 char)
      (r16v0 char)
      (r16v10 char)
      (r16v0 char)
      (r16v11 char)
      (r16v0 char)
      (r16v12 char)
      (r16v0 char)
      (r16v13 char)
      (r16v0 char)
      (r16v14 char)
      (r16v0 char)
      (r16v15 char)
      (r16v0 char)
      (r16v16 char)
      (r16v0 char)
      (r16v17 char)
      (r16v0 char)
      (r16v18 char)
      (r16v0 char)
      (r16v19 char)
      (r16v0 char)
      (r16v20 char)
     binds: [B:3:0x0032, B:78:0x010e, B:80:0x0112, B:74:0x00ff, B:70:0x00f2, B:66:0x00e4, B:68:0x00e8, B:62:0x00d6, B:64:0x00da, B:58:0x00ca, B:60:0x00ce, B:54:0x00be, B:56:0x00c2, B:50:0x00b1, B:52:0x00b4, B:46:0x00a7, B:48:0x00aa, B:42:0x009d, B:44:0x00a0, B:38:0x0093, B:40:0x0096, B:34:0x0087, B:36:0x008a, B:30:0x007d, B:32:0x0080, B:26:0x0073, B:28:0x0076, B:22:0x0069, B:24:0x006c, B:18:0x005f, B:20:0x0062, B:14:0x0055, B:16:0x0058, B:10:0x0049, B:12:0x004c, B:6:0x003f, B:8:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.zzaq zza(java.lang.String r20, com.google.android.gms.internal.measurement.zzaf r21, com.google.android.gms.internal.measurement.zzh r22, java.util.List<com.google.android.gms.internal.measurement.zzaq> r23) {
        /*
            Method dump skipped, instructions count: 2030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbe.zza(java.lang.String, com.google.android.gms.internal.measurement.zzaf, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }

    private static zzaq zza(zzaf zzafVar, zzh zzhVar, List<zzaq> list, boolean z) {
        zzaq zzaqVarZza;
        zzg.zzb("reduce", 1, list);
        zzg.zzc("reduce", 2, list);
        zzaq zzaqVarZza2 = zzhVar.zza(list.get(0));
        if (!(zzaqVarZza2 instanceof zzal)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzaqVarZza = zzhVar.zza(list.get(1));
            if (zzaqVarZza instanceof zzaj) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            zzaqVarZza = null;
            if (zzafVar.zzb() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
        }
        zzal zzalVar = (zzal) zzaqVarZza2;
        int iZzb = zzafVar.zzb();
        int i = z ? 0 : iZzb - 1;
        int i2 = z ? iZzb - 1 : 0;
        int i3 = z ? 1 : -1;
        if (zzaqVarZza == null) {
            zzaqVarZza = zzafVar.zza(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (zzafVar.zzc(i)) {
                zzaqVarZza = zzalVar.zza(zzhVar, Arrays.asList(zzaqVarZza, zzafVar.zza(i), new zzai(Double.valueOf(i)), zzafVar));
                if (zzaqVarZza instanceof zzaj) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return zzaqVarZza;
    }
}
