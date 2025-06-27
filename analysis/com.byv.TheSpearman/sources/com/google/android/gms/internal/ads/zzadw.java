package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzadw {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzadw(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = f;
        this.zzi = str;
    }

    public static zzadw zza(zzfo zzfoVar) throws zzcc {
        int i;
        int i2;
        int i3;
        try {
            zzfoVar.zzL(21);
            int iZzm = zzfoVar.zzm() & 3;
            int iZzm2 = zzfoVar.zzm();
            int iZzd = zzfoVar.zzd();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iZzm2; i6++) {
                zzfoVar.zzL(1);
                int iZzq = zzfoVar.zzq();
                for (int i7 = 0; i7 < iZzq; i7++) {
                    int iZzq2 = zzfoVar.zzq();
                    i5 += iZzq2 + 4;
                    zzfoVar.zzL(iZzq2);
                }
            }
            zzfoVar.zzK(iZzd);
            byte[] bArr = new byte[i5];
            String strZzb = null;
            float f = 1.0f;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            while (i15 < iZzm2) {
                int iZzm3 = zzfoVar.zzm() & 63;
                int iZzq3 = zzfoVar.zzq();
                int i17 = i4;
                while (i17 < iZzq3) {
                    int iZzq4 = zzfoVar.zzq();
                    int i18 = iZzm2;
                    System.arraycopy(zzgl.zza, i4, bArr, i16, 4);
                    int i19 = i16 + 4;
                    System.arraycopy(zzfoVar.zzM(), zzfoVar.zzd(), bArr, i19, iZzq4);
                    int i20 = i19 + iZzq4;
                    if (iZzm3 == 33 && i17 == 0) {
                        zzgi zzgiVarZzc = zzgl.zzc(bArr, i19 + 2, i20);
                        i8 = zzgiVarZzc.zzi;
                        i9 = zzgiVarZzc.zzj;
                        i10 = zzgiVarZzc.zze + 8;
                        i11 = zzgiVarZzc.zzf + 8;
                        int i21 = zzgiVarZzc.zzl;
                        int i22 = zzgiVarZzc.zzm;
                        int i23 = zzgiVarZzc.zzn;
                        i = i20;
                        float f2 = zzgiVarZzc.zzk;
                        i2 = iZzm3;
                        i3 = iZzq3;
                        strZzb = zzem.zzb(zzgiVarZzc.zza, zzgiVarZzc.zzb, zzgiVarZzc.zzc, zzgiVarZzc.zzd, zzgiVarZzc.zzg, zzgiVarZzc.zzh);
                        f = f2;
                        i12 = i21;
                        i14 = i23;
                        i13 = i22;
                        i17 = 0;
                    } else {
                        i = i20;
                        i2 = iZzm3;
                        i3 = iZzq3;
                    }
                    zzfoVar.zzL(iZzq4);
                    i17++;
                    iZzm2 = i18;
                    i16 = i;
                    iZzm3 = i2;
                    iZzq3 = i3;
                    i4 = 0;
                }
                i15++;
                i4 = 0;
            }
            return new zzadw(i5 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iZzm + 1, i8, i9, i10, i11, i12, i13, i14, f, strZzb);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing HEVC config", e);
        }
    }
}
