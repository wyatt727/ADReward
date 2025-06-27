package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgyy extends zzgyv {
    private final OutputStream zzg;

    zzgyy(OutputStream outputStream, int i) {
        super(i);
        Objects.requireNonNull(outputStream, "out");
        this.zzg = outputStream;
    }

    private final void zzJ() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzK(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzL() throws IOException {
        if (this.zzc > 0) {
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzM(byte b) throws IOException {
        if (this.zzc == this.zzb) {
            zzJ();
        }
        zzc(b);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzN(int i, boolean z) throws IOException {
        zzK(11);
        zzf(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzO(int i, zzgyj zzgyjVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(zzgyjVar.zzd());
        zzgyjVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgza, com.google.android.gms.internal.ads.zzgxy
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzr(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzh(int i, int i2) throws IOException {
        zzK(14);
        zzf((i << 3) | 5);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzi(int i) throws IOException {
        zzK(4);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzj(int i, long j) throws IOException {
        zzK(18);
        zzf((i << 3) | 1);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzk(long j) throws IOException {
        zzK(8);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzl(int i, int i2) throws IOException {
        zzK(20);
        zzf(i << 3);
        if (i2 >= 0) {
            zzf(i2);
        } else {
            zzg(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzu(i);
        } else {
            zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    final void zzn(int i, zzhbl zzhblVar, zzhcg zzhcgVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(((zzgxq) zzhblVar).zzaM(zzhcgVar));
        zzhcgVar.zzm(zzhblVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzo(int i, zzhbl zzhblVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzu(26);
        zzu(zzhblVar.zzaY());
        zzhblVar.zzda(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzp(int i, zzgyj zzgyjVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzO(3, zzgyjVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzq(int i, String str) throws IOException {
        zzu((i << 3) | 2);
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        System.arraycopy(bArr, i, this.zza, i4, i5);
        int i6 = i + i5;
        this.zzc = this.zzb;
        this.zzd += i5;
        zzJ();
        int i7 = i2 - i5;
        if (i7 <= this.zzb) {
            System.arraycopy(bArr, i6, this.zza, 0, i7);
            this.zzc = i7;
        } else {
            this.zzg.write(bArr, i6, i7);
        }
        this.zzd += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzs(int i, int i2) throws IOException {
        zzu((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzt(int i, int i2) throws IOException {
        zzK(20);
        zzf(i << 3);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzu(int i) throws IOException {
        zzK(5);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzv(int i, long j) throws IOException {
        zzK(20);
        zzf(i << 3);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzw(long j) throws IOException {
        zzK(10);
        zzg(j);
    }

    public final void zzx(String str) throws IOException {
        int iZze;
        try {
            int length = str.length() * 3;
            int iZzD = zzD(length);
            int i = iZzD + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iZzd = zzhdm.zzd(str, bArr, 0, length);
                zzu(iZzd);
                zzr(bArr, 0, iZzd);
                return;
            }
            if (i > i2 - this.zzc) {
                zzJ();
            }
            int iZzD2 = zzD(str.length());
            int i3 = this.zzc;
            try {
                if (iZzD2 == iZzD) {
                    int i4 = i3 + iZzD2;
                    this.zzc = i4;
                    int iZzd2 = zzhdm.zzd(str, this.zza, i4, this.zzb - i4);
                    this.zzc = i3;
                    iZze = (iZzd2 - i3) - iZzD2;
                    zzf(iZze);
                    this.zzc = iZzd2;
                } else {
                    iZze = zzhdm.zze(str);
                    zzf(iZze);
                    this.zzc = zzhdm.zzd(str, this.zza, this.zzc, iZze);
                }
                this.zzd += iZze;
            } catch (zzhdl e) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzgyx(e2);
            }
        } catch (zzhdl e3) {
            zzH(str, e3);
        }
    }
}
