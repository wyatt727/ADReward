package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgyr extends zzgyt {
    private final ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzgyr(ByteBuffer byteBuffer, boolean z, zzgyq zzgyqVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zze = byteBuffer;
        long jZze = zzhdh.zze(byteBuffer);
        this.zzf = jZze;
        this.zzg = byteBuffer.limit() + jZze;
        long jPosition = jZze + byteBuffer.position();
        this.zzh = jPosition;
        this.zzi = jPosition;
    }

    private final int zzK() {
        return (int) (this.zzg - this.zzh);
    }

    private final void zzL() {
        long j = this.zzg + this.zzj;
        this.zzg = j;
        int i = (int) (j - this.zzi);
        int i2 = this.zzl;
        if (i <= i2) {
            this.zzj = 0;
            return;
        }
        int i3 = i - i2;
        this.zzj = i3;
        this.zzg = j - i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzA(int i) {
        this.zzl = i;
        zzL();
    }

    public final void zzB(int i) throws IOException {
        if (i >= 0 && i <= zzK()) {
            this.zzh += i;
        } else {
            if (i >= 0) {
                throw zzhak.zzj();
            }
            throw zzhak.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final byte zza() throws IOException {
        long j = this.zzh;
        if (j == this.zzg) {
            throw zzhak.zzj();
        }
        this.zzh = 1 + j;
        return zzhdh.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzd() {
        return (int) (this.zzh - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zze(int i) throws zzhak {
        if (i < 0) {
            throw zzhak.zzf();
        }
        int iZzd = i + zzd();
        int i2 = this.zzl;
        if (iZzd > i2) {
            throw zzhak.zzj();
        }
        this.zzl = iZzd;
        zzL();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        long j = this.zzh;
        if (this.zzg - j < 4) {
            throw zzhak.zzj();
        }
        this.zzh = 4 + j;
        int iZza = zzhdh.zza(j) & 255;
        int iZza2 = zzhdh.zza(1 + j) & 255;
        int iZza3 = zzhdh.zza(2 + j) & 255;
        return ((zzhdh.zza(j + 3) & 255) << 24) | (iZza2 << 8) | iZza | (iZza3 << 16);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzl() throws IOException {
        return zzF(zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzk = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzk = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zzhak.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        long j = this.zzh;
        if (this.zzg - j < 8) {
            throw zzhak.zzj();
        }
        this.zzh = 8 + j;
        long jZza = zzhdh.zza(j);
        long jZza2 = zzhdh.zza(1 + j);
        long jZza3 = zzhdh.zza(2 + j);
        long jZza4 = zzhdh.zza(3 + j);
        long jZza5 = zzhdh.zza(4 + j);
        return ((zzhdh.zza(j + 7) & 255) << 56) | (jZza & 255) | ((jZza2 & 255) << 8) | ((jZza3 & 255) << 16) | ((jZza4 & 255) << 24) | ((jZza5 & 255) << 32) | ((zzhdh.zza(5 + j) & 255) << 40) | ((zzhdh.zza(6 + j) & 255) << 48);
    }

    final long zzs() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zza() & 128) == 0) {
                return j;
            }
        }
        throw zzhak.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzu() throws IOException {
        return zzH(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final zzgyj zzw() throws IOException {
        int iZzj = zzj();
        if (iZzj <= 0 || iZzj > zzK()) {
            if (iZzj == 0) {
                return zzgyj.zzb;
            }
            if (iZzj < 0) {
                throw zzhak.zzf();
            }
            throw zzhak.zzj();
        }
        byte[] bArr = new byte[iZzj];
        long j = iZzj;
        zzhdh.zzo(this.zzh, bArr, 0L, j);
        this.zzh += j;
        return new zzgyf(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj <= 0 || iZzj > zzK()) {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj < 0) {
                throw zzhak.zzf();
            }
            throw zzhak.zzj();
        }
        byte[] bArr = new byte[iZzj];
        long j = iZzj;
        zzhdh.zzo(this.zzh, bArr, 0L, j);
        String str = new String(bArr, zzhai.zzb);
        this.zzh += j;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0 && iZzj <= zzK()) {
            String strZzg = zzhdm.zzg(this.zze, (int) (this.zzh - this.zzf), iZzj);
            this.zzh += iZzj;
            return strZzg;
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw zzhak.zzf();
        }
        throw zzhak.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzz(int i) throws zzhak {
        if (this.zzk != i) {
            throw zzhak.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzE(int i) throws IOException {
        int iZzm;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (zzK() < 10) {
                while (i3 < 10) {
                    if (zza() < 0) {
                        i3++;
                    }
                }
                throw zzhak.zze();
            }
            while (i3 < 10) {
                long j = this.zzh;
                this.zzh = 1 + j;
                if (zzhdh.zza(j) < 0) {
                    i3++;
                }
            }
            throw zzhak.zze();
            return true;
        }
        if (i2 == 1) {
            zzB(8);
            return true;
        }
        if (i2 == 2) {
            zzB(zzj());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhak.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i >>> 3) << 3) | 4);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (com.google.android.gms.internal.ads.zzhdh.zza(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzj() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzh
            long r2 = r10.zzg
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L87
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhdh.zza(r0)
            if (r0 < 0) goto L17
            r10.zzh = r4
            return r0
        L17:
            long r6 = r10.zzg
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L87
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2e
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L84
        L2e:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3d
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3b:
            r6 = r4
            goto L84
        L3d:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4d
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L84
        L4d:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            if (r1 < 0) goto L87
        L84:
            r10.zzh = r6
            return r0
        L87:
            long r0 = r10.zzs()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyr.zzj():int");
    }

    public final long zzr() throws IOException {
        long jZza;
        long j;
        long j2;
        int i;
        long j3 = this.zzh;
        if (this.zzg != j3) {
            long j4 = j3 + 1;
            byte bZza = zzhdh.zza(j3);
            if (bZza >= 0) {
                this.zzh = j4;
                return bZza;
            }
            if (this.zzg - j4 >= 9) {
                long j5 = j4 + 1;
                int iZza = bZza ^ (zzhdh.zza(j4) << 7);
                if (iZza >= 0) {
                    long j6 = j5 + 1;
                    int iZza2 = iZza ^ (zzhdh.zza(j5) << 14);
                    if (iZza2 >= 0) {
                        jZza = iZza2 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int iZza3 = iZza2 ^ (zzhdh.zza(j6) << 21);
                        if (iZza3 < 0) {
                            i = iZza3 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long jZza2 = iZza3 ^ (zzhdh.zza(j5) << 28);
                            if (jZza2 < 0) {
                                long j7 = j6 + 1;
                                long jZza3 = jZza2 ^ (zzhdh.zza(j6) << 35);
                                if (jZza3 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    jZza2 = jZza3 ^ (zzhdh.zza(j7) << 42);
                                    if (jZza2 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        jZza3 = jZza2 ^ (zzhdh.zza(j6) << 49);
                                        if (jZza3 >= 0) {
                                            j6 = j7 + 1;
                                            jZza = (jZza3 ^ (zzhdh.zza(j7) << 56)) ^ 71499008037633920L;
                                            if (jZza < 0) {
                                                long j8 = 1 + j6;
                                                if (zzhdh.zza(j6) >= 0) {
                                                    j5 = j8;
                                                }
                                            }
                                            this.zzh = j5;
                                            return jZza;
                                        }
                                        j = -558586000294016L;
                                    }
                                }
                                jZza = jZza3 ^ j;
                                j5 = j7;
                                this.zzh = j5;
                                return jZza;
                            }
                            j2 = 266354560;
                            jZza = jZza2 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.zzh = j5;
                    return jZza;
                }
                i = iZza ^ (-128);
                jZza = i;
                this.zzh = j5;
                return jZza;
            }
        }
        return zzs();
    }
}
