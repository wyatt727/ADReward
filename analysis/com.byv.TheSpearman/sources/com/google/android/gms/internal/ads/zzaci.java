package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaci {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final String zzk;

    private zzaci(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = f;
        this.zzk = str;
    }

    public static zzaci zza(zzfo zzfoVar) throws zzcc {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String strZza;
        float f;
        try {
            zzfoVar.zzL(4);
            int iZzm = (zzfoVar.zzm() & 3) + 1;
            if (iZzm == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzm2 = zzfoVar.zzm() & 31;
            for (int i8 = 0; i8 < iZzm2; i8++) {
                arrayList.add(zzb(zzfoVar));
            }
            int iZzm3 = zzfoVar.zzm();
            for (int i9 = 0; i9 < iZzm3; i9++) {
                arrayList.add(zzb(zzfoVar));
            }
            if (iZzm2 > 0) {
                zzgk zzgkVarZze = zzgl.zze((byte[]) arrayList.get(0), iZzm + 1, ((byte[]) arrayList.get(0)).length);
                int i10 = zzgkVarZze.zze;
                int i11 = zzgkVarZze.zzf;
                int i12 = zzgkVarZze.zzh + 8;
                int i13 = zzgkVarZze.zzi + 8;
                int i14 = zzgkVarZze.zzj;
                int i15 = zzgkVarZze.zzk;
                int i16 = zzgkVarZze.zzl;
                float f2 = zzgkVarZze.zzg;
                strZza = zzem.zza(zzgkVarZze.zza, zzgkVarZze.zzb, zzgkVarZze.zzc);
                i6 = i15;
                i7 = i16;
                f = f2;
                i3 = i12;
                i4 = i13;
                i5 = i14;
                i = i10;
                i2 = i11;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                strZza = null;
                f = 1.0f;
            }
            return new zzaci(arrayList, iZzm, i, i2, i3, i4, i5, i6, i7, f, strZza);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzfo zzfoVar) {
        int iZzq = zzfoVar.zzq();
        int iZzd = zzfoVar.zzd();
        zzfoVar.zzL(iZzq);
        return zzem.zzc(zzfoVar.zzM(), iZzd, iZzq);
    }
}
