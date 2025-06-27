package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzgyv extends zzgza {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    zzgyv(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void zzc(byte b) {
        int i = this.zzc;
        this.zzc = i + 1;
        this.zza[i] = b;
        this.zzd++;
    }

    final void zzd(int i) {
        int i2 = this.zzc;
        int i3 = i2 + 1;
        this.zzc = i3;
        byte[] bArr = this.zza;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.zzc = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.zzc = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.zzc = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.zzd += 4;
    }

    final void zze(long j) {
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        byte[] bArr = this.zza;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        this.zzc = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        this.zzc = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        this.zzc = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        this.zzc = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.zzc = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.zzc = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.zzc = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.zzd += 8;
    }

    final void zzf(int i) {
        if (!zzgza.zzb) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                bArr[i2] = (byte) ((i | 128) & 255);
                this.zzd++;
                i >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            bArr2[i3] = (byte) i;
            this.zzd++;
            return;
        }
        long j = this.zzc;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            zzhdh.zzq(bArr3, i4, (byte) ((i | 128) & 255));
            i >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        zzhdh.zzq(bArr4, i5, (byte) i);
        this.zzd += (int) (this.zzc - j);
    }

    final void zzg(long j) {
        if (zzgza.zzb) {
            long j2 = this.zzc;
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i2 = this.zzc;
                    this.zzc = i2 + 1;
                    zzhdh.zzq(bArr, i2, (byte) i);
                    this.zzd += (int) (this.zzc - j2);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                zzhdh.zzq(bArr2, i3, (byte) ((i | 128) & 255));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i5 = this.zzc;
                    this.zzc = i5 + 1;
                    bArr3[i5] = (byte) i4;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i6 = this.zzc;
                this.zzc = i6 + 1;
                bArr4[i6] = (byte) ((i4 | 128) & 255);
                this.zzd++;
                j >>>= 7;
            }
        }
    }
}
