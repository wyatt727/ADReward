package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzzc extends zzzf {
    private zzzb zza;

    protected abstract Pair zzd(zzzb zzzbVar, int[][][] iArr, int[] iArr2, zzvh zzvhVar, zzcx zzcxVar) throws zziz;

    @Override // com.google.android.gms.internal.ads.zzzf
    public final zzzg zzp(zzmh[] zzmhVarArr, zzxk zzxkVar, zzvh zzvhVar, zzcx zzcxVar) throws zziz {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcz[][] zzczVarArr = new zzcz[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzxkVar.zzc;
            zzczVarArr[i] = new zzcz[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzmhVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzxkVar.zzc) {
            zzcz zzczVarZzb = zzxkVar.zzb(i5);
            int i6 = zzczVarZzb.zzd;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzmh zzmhVar = zzmhVarArr[i8];
                int iMax = 0;
                for (int i10 = 0; i10 < zzczVarZzb.zzb; i10++) {
                    iMax = Math.max(iMax, zzmhVar.zzY(zzczVarZzb.zzb(i10)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (iMax > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = iMax;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zzczVarZzb.zzb];
            } else {
                zzmh zzmhVar2 = zzmhVarArr[i7];
                int[] iArr5 = new int[zzczVarZzb.zzb];
                for (int i11 = 0; i11 < zzczVarZzb.zzb; i11++) {
                    iArr5[i11] = zzmhVar2.zzY(zzczVarZzb.zzb(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i7];
            zzczVarArr[i7][i12] = zzczVarZzb;
            iArr3[i7][i12] = iArr;
            iArr2[i7] = i12 + 1;
            i5++;
            i3 = 2;
        }
        int i13 = i3;
        boolean z4 = true;
        zzxk[] zzxkVarArr = new zzxk[i13];
        String[] strArr = new String[i13];
        int[] iArr6 = new int[i13];
        int i14 = 0;
        while (i14 < i13) {
            int i15 = iArr2[i14];
            zzxkVarArr[i14] = new zzxk((zzcz[]) zzfx.zzO(zzczVarArr[i14], i15));
            iArr3[i14] = (int[][]) zzfx.zzO(iArr3[i14], i15);
            strArr[i14] = zzmhVarArr[i14].zzU();
            iArr6[i14] = zzmhVarArr[i14].zzb();
            i14++;
            i13 = 2;
        }
        int i16 = i13;
        zzzb zzzbVar = new zzzb(strArr, iArr6, zzxkVarArr, iArr4, iArr3, new zzxk((zzcz[]) zzfx.zzO(zzczVarArr[i16], iArr2[i16])));
        Pair pairZzd = zzd(zzzbVar, iArr3, iArr4, zzvhVar, zzcxVar);
        zzzd[] zzzdVarArr = (zzzd[]) pairZzd.second;
        List[] listArr = new List[zzzdVarArr.length];
        for (int i17 = 0; i17 < zzzdVarArr.length; i17++) {
            zzzd zzzdVar = zzzdVarArr[i17];
            listArr[i17] = zzzdVar != null ? zzfzn.zzn(zzzdVar) : zzfzn.zzm();
        }
        zzfzk zzfzkVar = new zzfzk();
        int i18 = 0;
        while (i18 < 2) {
            zzxk zzxkVarZzd = zzzbVar.zzd(i18);
            List list = listArr[i18];
            int i19 = 0;
            while (i19 < zzxkVarZzd.zzc) {
                zzcz zzczVarZzb2 = zzxkVarZzd.zzb(i19);
                boolean z5 = zzzbVar.zza(i18, i19, false) != 0 ? z4 : false;
                int i20 = zzczVarZzb2.zzb;
                int[] iArr7 = new int[i20];
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 < zzczVarZzb2.zzb; i21++) {
                    iArr7[i21] = zzzbVar.zzb(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzzd zzzdVar2 = (zzzd) list.get(i22);
                        if (zzzdVar2.zze().equals(zzczVarZzb2) && zzzdVar2.zzb(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                zzfzkVar.zzf(new zzdj(zzczVarZzb2, z5, iArr7, zArr));
                i19++;
                z4 = true;
            }
            i18++;
            z4 = true;
        }
        zzxk zzxkVarZze = zzzbVar.zze();
        for (int i23 = 0; i23 < zzxkVarZze.zzc; i23++) {
            zzcz zzczVarZzb3 = zzxkVarZze.zzb(i23);
            int[] iArr8 = new int[zzczVarZzb3.zzb];
            Arrays.fill(iArr8, 0);
            zzfzkVar.zzf(new zzdj(zzczVarZzb3, false, iArr8, new boolean[zzczVarZzb3.zzb]));
        }
        return new zzzg((zzmi[]) pairZzd.first, (zzyz[]) pairZzd.second, new zzdk(zzfzkVar.zzi()), zzzbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzq(Object obj) {
        this.zza = (zzzb) obj;
    }
}
