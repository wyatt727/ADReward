package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgyn extends zzgyt {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* synthetic */ zzgyn(Iterable iterable, int i, boolean z, zzgym zzgymVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = i;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i != 0) {
            zzO();
            return;
        }
        this.zzg = zzhai.zze;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzK() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzL() throws zzhak {
        if (!this.zzf.hasNext()) {
            throw zzhak.zzj();
        }
        zzO();
    }

    private final void zzM(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > zzK()) {
            if (i2 > 0) {
                throw zzhak.zzj();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzL();
            }
            int iMin = Math.min(i3, (int) (this.zzo - this.zzm));
            long j = iMin;
            zzhdh.zzo(this.zzm, bArr, i2 - i3, j);
            i3 -= iMin;
            this.zzm += j;
        }
    }

    private final void zzN() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzj;
        if (i <= i2) {
            this.zzi = 0;
            return;
        }
        int i3 = i - i2;
        this.zzi = i3;
        this.zzh = i - i3;
    }

    private final void zzO() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long jPosition = byteBuffer.position();
        this.zzm = jPosition;
        this.zzn = jPosition;
        this.zzo = this.zzg.limit();
        long jZze = zzhdh.zze(this.zzg);
        this.zzm += jZze;
        this.zzn += jZze;
        this.zzo += jZze;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzA(int i) {
        this.zzj = i;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzC() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final byte zza() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzL();
        }
        long j = this.zzm;
        this.zzm = 1 + j;
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
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zze(int i) throws zzhak {
        if (i < 0) {
            throw zzhak.zzf();
        }
        int iZzd = i + zzd();
        int i2 = this.zzj;
        if (iZzd > i2) {
            throw zzhak.zzj();
        }
        this.zzj = iZzd;
        zzN();
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
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 4) {
            int iZza = zza() & 255;
            int iZza2 = (zza() & 255) << 8;
            return iZza | iZza2 | ((zza() & 255) << 16) | ((zza() & 255) << 24);
        }
        this.zzm = 4 + j2;
        int iZza3 = zzhdh.zza(j2) & 255;
        int iZza4 = (zzhdh.zza(1 + j2) & 255) << 8;
        return iZza3 | iZza4 | ((zzhdh.zza(2 + j2) & 255) << 16) | ((zzhdh.zza(j2 + 3) & 255) << 24);
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
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 8) {
            return (zza() & 255) | ((zza() & 255) << 8) | ((zza() & 255) << 16) | ((zza() & 255) << 24) | ((zza() & 255) << 32) | ((zza() & 255) << 40) | ((zza() & 255) << 48) | ((zza() & 255) << 56);
        }
        this.zzm = 8 + j2;
        long jZza = zzhdh.zza(j2) & 255;
        long jZza2 = (zzhdh.zza(1 + j2) & 255) << 8;
        long jZza3 = (zzhdh.zza(j2 + 2) & 255) << 16;
        long jZza4 = (zzhdh.zza(3 + j2) & 255) << 24;
        long jZza5 = (zzhdh.zza(j2 + 4) & 255) << 32;
        return jZza5 | jZza | jZza2 | jZza3 | jZza4 | ((zzhdh.zza(j2 + 5) & 255) << 40) | ((zzhdh.zza(j2 + 6) & 255) << 48) | ((zzhdh.zza(j2 + 7) & 255) << 56);
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
        if (iZzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzj;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iZzj];
                zzhdh.zzo(j2, bArr, 0L, j3);
                this.zzm += j3;
                return new zzgyf(bArr);
            }
        }
        if (iZzj > 0 && iZzj <= zzK()) {
            byte[] bArr2 = new byte[iZzj];
            zzM(bArr2, 0, iZzj);
            return new zzgyf(bArr2);
        }
        if (iZzj == 0) {
            return zzgyj.zzb;
        }
        if (iZzj < 0) {
            throw zzhak.zzf();
        }
        throw zzhak.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzj;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iZzj];
                zzhdh.zzo(j2, bArr, 0L, j3);
                String str = new String(bArr, zzhai.zzb);
                this.zzm += j3;
                return str;
            }
        }
        if (iZzj > 0 && iZzj <= zzK()) {
            byte[] bArr2 = new byte[iZzj];
            zzM(bArr2, 0, iZzj);
            return new String(bArr2, zzhai.zzb);
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzhak.zzf();
        }
        throw zzhak.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzj;
            if (j3 <= j - j2) {
                String strZzg = zzhdm.zzg(this.zzg, (int) (j2 - this.zzn), iZzj);
                this.zzm += j3;
                return strZzg;
            }
        }
        if (iZzj >= 0 && iZzj <= zzK()) {
            byte[] bArr = new byte[iZzj];
            zzM(bArr, 0, iZzj);
            return zzhdm.zzh(bArr, 0, iZzj);
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

    public final void zzB(int i) throws IOException {
        if (i >= 0) {
            if (i <= ((this.zzh - this.zzl) - this.zzm) + this.zzn) {
                while (i > 0) {
                    if (this.zzo - this.zzm == 0) {
                        zzL();
                    }
                    int iMin = Math.min(i, (int) (this.zzo - this.zzm));
                    i -= iMin;
                    this.zzm += iMin;
                }
                return;
            }
        }
        if (i >= 0) {
            throw zzhak.zzj();
        }
        throw zzhak.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzE(int i) throws IOException {
        int iZzm;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (zza() >= 0) {
                    return true;
                }
            }
            throw zzhak.zze();
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (com.google.android.gms.internal.ads.zzhdh.zza(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzj() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzm
            long r2 = r10.zzo
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhdh.zza(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.zzm
            long r4 = r4 + r2
            r10.zzm = r4
            return r0
        L1a:
            long r6 = r10.zzo
            long r8 = r10.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhdh.zza(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.zzm = r6
            return r0
        L8c:
            long r0 = r10.zzs()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyn.zzj():int");
    }

    public final long zzr() throws IOException {
        long jZza;
        long j;
        long j2;
        int i;
        long j3 = this.zzm;
        if (this.zzo != j3) {
            long j4 = j3 + 1;
            byte bZza = zzhdh.zza(j3);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
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
                                            this.zzm = j5;
                                            return jZza;
                                        }
                                        j = -558586000294016L;
                                    }
                                }
                                jZza = jZza3 ^ j;
                                j5 = j7;
                                this.zzm = j5;
                                return jZza;
                            }
                            j2 = 266354560;
                            jZza = jZza2 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.zzm = j5;
                    return jZza;
                }
                i = iZza ^ (-128);
                jZza = i;
                this.zzm = j5;
                return jZza;
            }
        }
        return zzs();
    }
}
