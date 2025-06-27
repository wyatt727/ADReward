package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzrz extends zzdu {
    private int zze;
    private boolean zzf;
    private int zzg;
    private long zzh;
    private int zzi = 0;
    private int zzk = 0;
    private int zzl = 0;
    private zzdr zzd = zzdr.zza;
    private byte[] zzj = zzfx.zzf;
    private byte[] zzm = zzfx.zzf;

    private final int zzq(int i) {
        int iZzr = ((zzr(2000000L) - this.zzi) * this.zze) - (this.zzj.length >> 1);
        zzek.zzf(iZzr >= 0);
        int iMin = (int) Math.min((i * 0.2f) + 0.5f, iZzr);
        int i2 = this.zze;
        return (iMin / i2) * i2;
    }

    private final int zzr(long j) {
        return (int) ((j * this.zzd.zzb) / 1000000);
    }

    private static int zzs(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private final void zzt(boolean z) {
        int i;
        int length;
        int i2 = this.zzl;
        int length2 = this.zzj.length;
        if (i2 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.zzi == 0) {
            if (z) {
                zzu(i2, 3);
                length = i2;
            } else {
                zzek.zzf(i2 >= (length2 >> 1));
                length = this.zzj.length >> 1;
                zzu(length, 0);
            }
            i = length;
        } else {
            int i3 = length2 >> 1;
            int i4 = i2 - i3;
            if (z) {
                int iZzq = zzq(i4) + (this.zzj.length >> 1);
                zzu(iZzq, 2);
                int i5 = i3 + i4;
                i = iZzq;
                length = i5;
            } else {
                int iZzq2 = zzq(i4);
                zzu(iZzq2, 1);
                i = iZzq2;
                length = i4;
            }
        }
        zzek.zzg(length % this.zze == 0, "bytesConsumed is not aligned to frame size: %s" + length);
        zzek.zzf(i2 >= i);
        this.zzl -= length;
        int i6 = this.zzk + length;
        this.zzk = i6;
        this.zzk = i6 % this.zzj.length;
        this.zzi = this.zzi + (i / this.zze);
        this.zzh += (length - i) / r2;
    }

    private final void zzu(int i, int i2) {
        if (i == 0) {
            return;
        }
        zzek.zzd(this.zzl >= i);
        if (i2 == 2) {
            int i3 = this.zzk;
            int i4 = this.zzl;
            int i5 = i3 + i4;
            byte[] bArr = this.zzj;
            int length = bArr.length;
            if (i5 <= length) {
                System.arraycopy(bArr, i5 - i, this.zzm, 0, i);
            } else {
                int i6 = i4 - (length - i3);
                if (i6 >= i) {
                    System.arraycopy(bArr, i6 - i, this.zzm, 0, i);
                } else {
                    int i7 = i - i6;
                    System.arraycopy(bArr, length - i7, this.zzm, 0, i7);
                    System.arraycopy(this.zzj, 0, this.zzm, i7, i6);
                }
            }
        } else {
            int i8 = this.zzk;
            int i9 = i8 + i;
            byte[] bArr2 = this.zzj;
            int length2 = bArr2.length;
            if (i9 <= length2) {
                System.arraycopy(bArr2, i8, this.zzm, 0, i);
            } else {
                int i10 = length2 - i8;
                System.arraycopy(bArr2, i8, this.zzm, 0, i10);
                System.arraycopy(this.zzj, 0, this.zzm, i10, i - i10);
            }
        }
        zzek.zze(i % this.zze == 0, "sizeToOutput is not aligned to frame size: " + i);
        zzek.zzf(this.zzk < this.zzj.length);
        byte[] bArr3 = this.zzm;
        zzek.zze(i % this.zze == 0, "byteOutput size is not aligned to frame size " + i);
        if (i2 != 3) {
            for (int i11 = 0; i11 < i; i11 += 2) {
                int i12 = i11 + 1;
                int iZzs = zzs(bArr3[i12], bArr3[i11]);
                int i13 = 10;
                if (i2 == 0) {
                    i13 = ((((i11 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else if (i2 == 2) {
                    i13 = 10 + (((90000 * i11) / (i - 1)) / 1000);
                }
                int i14 = (iZzs * i13) / 100;
                if (i14 >= 32767) {
                    bArr3[i11] = -1;
                    bArr3[i12] = Byte.MAX_VALUE;
                } else if (i14 <= -32768) {
                    bArr3[i11] = 0;
                    bArr3[i12] = Byte.MIN_VALUE;
                } else {
                    bArr3[i11] = (byte) (i14 & 255);
                    bArr3[i12] = (byte) (i14 >> 8);
                }
            }
        }
        zzj(i).put(bArr3, 0, i).flip();
    }

    private static final boolean zzv(byte b, byte b2) {
        return Math.abs(zzs(b, b2)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zze(ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzn()) {
            if (this.zzg != 0) {
                zzek.zzf(this.zzk < this.zzj.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i2 = this.zze;
                            iLimit = i2 * (iPosition2 / i2);
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i3 = this.zzk;
                int i4 = this.zzl;
                int i5 = i3 + i4;
                int length = this.zzj.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzj, i5, iMin);
                int i6 = this.zzl + iMin;
                this.zzl = i6;
                zzek.zzf(i6 <= this.zzj.length);
                boolean z = iLimit < iLimit2 && iPosition3 < i;
                zzt(z);
                if (z) {
                    this.zzg = 0;
                    this.zzi = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.zzj.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i7 = this.zze;
                            iPosition = ((iLimit4 / i7) * i7) + i7;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzg = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdu, com.google.android.gms.internal.ads.zzdt
    public final boolean zzg() {
        return this.zzd.zzb != -1 && this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    protected final zzdr zzi(zzdr zzdrVar) throws zzds {
        if (zzdrVar.zzd != 2) {
            throw new zzds("Unhandled input format:", zzdrVar);
        }
        this.zzd = zzdrVar;
        int i = zzdrVar.zzc;
        this.zze = i + i;
        return zzdrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final void zzk() {
        if (zzg()) {
            int iZzr = zzr(100000L) / 2;
            int i = this.zze;
            int i2 = (iZzr / i) * i;
            int i3 = i2 + i2;
            if (this.zzj.length != i3) {
                this.zzj = new byte[i3];
                this.zzm = new byte[i3];
            }
        }
        this.zzg = 0;
        this.zzh = 0L;
        this.zzi = 0;
        this.zzk = 0;
        this.zzl = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final void zzl() {
        if (this.zzl > 0) {
            zzt(true);
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final void zzm() {
        this.zzf = false;
        this.zzd = zzdr.zza;
        this.zzj = zzfx.zzf;
        this.zzm = zzfx.zzf;
    }

    public final long zzo() {
        return this.zzh;
    }

    public final void zzp(boolean z) {
        this.zzf = z;
    }
}
