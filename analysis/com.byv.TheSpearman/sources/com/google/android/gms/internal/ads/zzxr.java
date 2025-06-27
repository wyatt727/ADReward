package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzxr extends zzxt {
    private final zzzn zzd;
    private final zzfzn zze;
    private final zzel zzf;

    protected zzxr(zzcz zzczVar, int[] iArr, int i, zzzn zzznVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzel zzelVar) {
        super(zzczVar, iArr, 0);
        this.zzd = zzznVar;
        this.zze = zzfzn.zzk(list);
        this.zzf = zzelVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ zzfzn zzf(zzyy[] zzyyVarArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= 2) {
                break;
            }
            zzyy zzyyVar = zzyyVarArr[i4];
            if (zzyyVar == null || zzyyVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfzk zzfzkVar = new zzfzk();
                zzfzkVar.zzf(new zzxp(0L, 0L));
                arrayList.add(zzfzkVar);
            }
            i4++;
        }
        long[][] jArr = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            zzyy zzyyVar2 = zzyyVarArr[i5];
            if (zzyyVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                jArr[i5] = new long[zzyyVar2.zzb.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = zzyyVar2.zzb;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    long j = zzyyVar2.zza.zzb(iArr[i6]).zzi;
                    long[] jArr2 = jArr[i5];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i6] = j;
                    i6++;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr4 = jArr[i7];
            jArr3[i7] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzg(arrayList, jArr3);
        zzfzy zzfzyVarZza = zzgat.zzc(zzgay.zzc()).zzb(2).zza();
        int i8 = 0;
        while (i8 < i) {
            int length = jArr[i8].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i9 = i3;
                while (true) {
                    long[] jArr5 = jArr[i8];
                    int length2 = jArr5.length;
                    double dLog = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i9 >= length2) {
                        break;
                    }
                    long j2 = jArr5[i9];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i9] = dLog;
                    i9++;
                }
                int i10 = length - 1;
                double d = dArr[i10] - dArr[i3];
                int i11 = i3;
                while (i11 < i10) {
                    double d2 = dArr[i11];
                    i11++;
                    zzfzyVarZza.zzq(Double.valueOf(d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((d2 + dArr[i11]) * 0.5d) - dArr[i3]) / d), Integer.valueOf(i8));
                    i3 = 0;
                }
            }
            i8++;
            i3 = 0;
            i = 2;
            i2 = 1;
        }
        zzfzn zzfznVarZzk = zzfzn.zzk(zzfzyVarZza.zzr());
        for (int i12 = 0; i12 < zzfznVarZzk.size(); i12++) {
            int iIntValue = ((Integer) zzfznVarZzk.get(i12)).intValue();
            int i13 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i13;
            jArr3[iIntValue] = jArr[iIntValue][i13];
            zzg(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j3 = jArr3[i14];
                jArr3[i14] = j3 + j3;
            }
        }
        zzg(arrayList, jArr3);
        zzfzk zzfzkVar2 = new zzfzk();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zzfzk zzfzkVar3 = (zzfzk) arrayList.get(i15);
            zzfzkVar2.zzf(zzfzkVar3 == null ? zzfzn.zzm() : zzfzkVar3.zzi());
        }
        return zzfzkVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfzk zzfzkVar = (zzfzk) list.get(i2);
            if (zzfzkVar != null) {
                zzfzkVar.zzf(new zzxp(j, jArr[i2]));
            }
        }
    }
}
