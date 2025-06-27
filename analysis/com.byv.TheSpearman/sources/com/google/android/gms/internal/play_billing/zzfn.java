package com.google.android.gms.internal.play_billing;

import com.json.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public final class zzfn {
    private static final zzfn zza = new zzfn(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzfn() {
        this(0, new int[8], new Object[8], true);
    }

    private zzfn(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzfn zzc() {
        return zza;
    }

    static zzfn zze(zzfn zzfnVar, zzfn zzfnVar2) {
        int i = zzfnVar.zzb + zzfnVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzfnVar.zzc, i);
        System.arraycopy(zzfnVar2.zzc, 0, iArrCopyOf, zzfnVar.zzb, zzfnVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzfnVar.zzd, i);
        System.arraycopy(zzfnVar2.zzd, 0, objArrCopyOf, zzfnVar.zzb, zzfnVar2.zzb);
        return new zzfn(i, iArrCopyOf, objArrCopyOf, true);
    }

    static zzfn zzf() {
        return new zzfn(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzfn)) {
            return false;
        }
        zzfn zzfnVar = (zzfn) obj;
        int i = this.zzb;
        if (i == zzfnVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzfnVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzfnVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzw;
        int iZzx;
        int iZzw2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.zzd[i3]).longValue();
                    iZzw2 = zzck.zzw(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzcc zzccVar = (zzcc) this.zzd[i3];
                    int iZzw3 = zzck.zzw(i7);
                    int iZzd = zzccVar.zzd();
                    iZzw2 = iZzw3 + zzck.zzw(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int iZzw4 = zzck.zzw(i5 << 3);
                    iZzw = iZzw4 + iZzw4;
                    iZzx = ((zzfn) this.zzd[i3]).zza();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(zzdn.zza());
                    }
                    ((Integer) this.zzd[i3]).intValue();
                    iZzw2 = zzck.zzw(i5 << 3) + 4;
                }
                i2 += iZzw2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.zzd[i3]).longValue();
                iZzw = zzck.zzw(i8);
                iZzx = zzck.zzx(jLongValue);
            }
            iZzw2 = iZzw + iZzx;
            i2 += iZzw2;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzw = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzcc zzccVar = (zzcc) this.zzd[i2];
            int iZzw2 = zzck.zzw(8);
            int iZzw3 = zzck.zzw(16) + zzck.zzw(i3);
            int iZzw4 = zzck.zzw(24);
            int iZzd = zzccVar.zzd();
            iZzw += iZzw2 + iZzw2 + iZzw3 + iZzw4 + zzck.zzw(iZzd) + iZzd;
        }
        this.zze = iZzw;
        return iZzw;
    }

    final zzfn zzd(zzfn zzfnVar) {
        if (zzfnVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzfnVar.zzb;
        zzl(i);
        System.arraycopy(zzfnVar.zzc, 0, this.zzc, this.zzb, zzfnVar.zzb);
        System.arraycopy(zzfnVar.zzd, 0, this.zzd, this.zzb, zzfnVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzem.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzge zzgeVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzgeVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzgeVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzgeVar.zzd(i4, (zzcc) obj);
                } else if (i3 == 3) {
                    zzgeVar.zzE(i4);
                    ((zzfn) obj).zzk(zzgeVar);
                    zzgeVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzdn.zza());
                    }
                    zzgeVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
