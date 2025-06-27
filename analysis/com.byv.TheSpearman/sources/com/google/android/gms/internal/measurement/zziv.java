package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
class zziv extends zzit {
    protected final byte[] zzb;

    @Override // com.google.android.gms.internal.measurement.zzii
    public byte zza(int i) {
        return this.zzb[i];
    }

    protected int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    protected final int zzb(int i, int i2, int i3) {
        return zzjy.zza(i, this.zzb, zze(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final zzii zza(int i, int i2) {
        int iZza = zza(0, i2, zzb());
        if (iZza == 0) {
            return zzii.zza;
        }
        return new zzim(this.zzb, zze(), iZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    protected final String zza(Charset charset) {
        return new String(this.zzb, zze(), zzb(), charset);
    }

    zziv(byte[] bArr) {
        super();
        Objects.requireNonNull(bArr);
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    final void zza(zzij zzijVar) throws IOException {
        zzijVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzii) || zzb() != ((zzii) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (obj instanceof zziv) {
            zziv zzivVar = (zziv) obj;
            int iZza = zza();
            int iZza2 = zzivVar.zza();
            if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
                return zza(zzivVar, 0, zzb());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzit
    final boolean zza(zzii zziiVar, int i, int i2) {
        if (i2 > zziiVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzb());
        }
        if (i2 > zziiVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i2 + ", " + zziiVar.zzb());
        }
        if (zziiVar instanceof zziv) {
            zziv zzivVar = (zziv) zziiVar;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzivVar.zzb;
            int iZze = zze() + i2;
            int iZze2 = zze();
            int iZze3 = zzivVar.zze();
            while (iZze2 < iZze) {
                if (bArr[iZze2] != bArr2[iZze3]) {
                    return false;
                }
                iZze2++;
                iZze3++;
            }
            return true;
        }
        return zziiVar.zza(0, i2).equals(zza(0, i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final boolean zzd() {
        int iZze = zze();
        return zznf.zzc(this.zzb, iZze, zzb() + iZze);
    }
}
