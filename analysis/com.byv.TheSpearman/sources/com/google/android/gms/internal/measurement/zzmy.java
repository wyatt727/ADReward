package com.google.android.gms.internal.measurement;

import com.json.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzmy {
    private static final zzmy zza = new zzmy(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    public final int zza() {
        int iZze;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iZze = zzjc.zze(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 1) {
                iZze = zzjc.zza(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 2) {
                iZze = zzjc.zza(i5, (zzii) this.zzd[i3]);
            } else if (i6 == 3) {
                iZze = (zzjc.zzf(i5) << 1) + ((zzmy) this.zzd[i3]).zza();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(zzkd.zza());
                }
                iZze = zzjc.zzb(i5, ((Integer) this.zzd[i3]).intValue());
            }
            i2 += iZze;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzb = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            iZzb += zzjc.zzb(this.zzc[i2] >>> 3, (zzii) this.zzd[i2]);
        }
        this.zze = iZzb;
        return iZzb;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public static zzmy zzc() {
        return zza;
    }

    final zzmy zza(zzmy zzmyVar) {
        if (zzmyVar.equals(zza)) {
            return this;
        }
        zzf();
        int i = this.zzb + zzmyVar.zzb;
        zza(i);
        System.arraycopy(zzmyVar.zzc, 0, this.zzc, this.zzb, zzmyVar.zzb);
        System.arraycopy(zzmyVar.zzd, 0, this.zzd, this.zzb, zzmyVar.zzb);
        this.zzb = i;
        return this;
    }

    static zzmy zza(zzmy zzmyVar, zzmy zzmyVar2) {
        int i = zzmyVar.zzb + zzmyVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzmyVar.zzc, i);
        System.arraycopy(zzmyVar2.zzc, 0, iArrCopyOf, zzmyVar.zzb, zzmyVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzmyVar.zzd, i);
        System.arraycopy(zzmyVar2.zzd, 0, objArrCopyOf, zzmyVar.zzb, zzmyVar2.zzb);
        return new zzmy(i, iArrCopyOf, objArrCopyOf, true);
    }

    static zzmy zzd() {
        return new zzmy();
    }

    private zzmy() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmy(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    private final void zza(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzlj.zza(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zza(int i, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final void zza(zznv zznvVar) throws IOException {
        if (zznvVar.zza() == zznu.zzb) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zznvVar.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zznvVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    private static void zza(int i, Object obj, zznv zznvVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zznvVar.zzb(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            zznvVar.zza(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            zznvVar.zza(i2, (zzii) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                zznvVar.zzb(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzkd.zza());
        }
        if (zznvVar.zza() == zznu.zza) {
            zznvVar.zzb(i2);
            ((zzmy) obj).zzb(zznvVar);
            zznvVar.zza(i2);
        } else {
            zznvVar.zza(i2);
            ((zzmy) obj).zzb(zznvVar);
            zznvVar.zzb(i2);
        }
    }

    public final void zzb(zznv zznvVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zznvVar.zza() == zznu.zza) {
            for (int i = 0; i < this.zzb; i++) {
                zza(this.zzc[i], this.zzd[i], zznvVar);
            }
            return;
        }
        for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
            zza(this.zzc[i2], this.zzd[i2], zznvVar);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmy)) {
            return false;
        }
        zzmy zzmyVar = (zzmy) obj;
        int i = this.zzb;
        if (i == zzmyVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmyVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                Object[] objArr = this.zzd;
                Object[] objArr2 = zzmyVar.zzd;
                int i3 = this.zzb;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    }
                    i4++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }
}
