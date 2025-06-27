package com.google.android.gms.internal.ads;

import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcz {
    public final int zzb;
    public final String zzc;
    public final int zzd;
    private final zzam[] zzg;
    private int zzh;
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcy
    };

    public zzcz(String str, zzam... zzamVarArr) {
        int length = zzamVarArr.length;
        int i = 1;
        zzek.zzd(length > 0);
        this.zzc = str;
        this.zzg = zzamVarArr;
        this.zzb = length;
        int iZzb = zzcb.zzb(zzamVarArr[0].zzm);
        this.zzd = iZzb == -1 ? zzcb.zzb(zzamVarArr[0].zzl) : iZzb;
        String strZzc = zzc(zzamVarArr[0].zzd);
        int i2 = zzamVarArr[0].zzf | 16384;
        while (true) {
            zzam[] zzamVarArr2 = this.zzg;
            if (i >= zzamVarArr2.length) {
                return;
            }
            if (!strZzc.equals(zzc(zzamVarArr2[i].zzd))) {
                zzam[] zzamVarArr3 = this.zzg;
                zzd("languages", zzamVarArr3[0].zzd, zzamVarArr3[i].zzd, i);
                return;
            } else {
                zzam[] zzamVarArr4 = this.zzg;
                if (i2 != (zzamVarArr4[i].zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzamVarArr4[0].zzf), Integer.toBinaryString(this.zzg[i].zzf), i);
                    return;
                }
                i++;
            }
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(String str, String str2, String str3, int i) {
        zzfe.zzd("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcz zzczVar = (zzcz) obj;
            if (this.zzc.equals(zzczVar.zzc) && Arrays.equals(this.zzg, zzczVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.zzc.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzg);
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final int zza(zzam zzamVar) {
        int i = 0;
        while (true) {
            zzam[] zzamVarArr = this.zzg;
            if (i >= zzamVarArr.length) {
                return -1;
            }
            if (zzamVar == zzamVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final zzam zzb(int i) {
        return this.zzg[i];
    }
}
