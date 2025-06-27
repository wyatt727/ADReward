package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzwx implements zzaem {
    private boolean zzB;
    private zzsn zzC;
    private final zzwr zza;
    private final zzsm zzd;
    private final zzsg zze;
    private zzww zzf;
    private zzam zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzam zzy;
    private zzam zzz;
    private final zzwt zzb = new zzwt();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzael[] zzn = new zzael[1000];
    private final zzxe zzc = new zzxe(new zzep() { // from class: com.google.android.gms.internal.ads.zzws
        @Override // com.google.android.gms.internal.ads.zzep
        public final void zza(Object obj) {
            zzsl zzslVar = ((zzwv) obj).zzb;
            int i = zzsk.zza;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzA = true;

    protected zzwx(zzzo zzzoVar, zzsm zzsmVar, zzsg zzsgVar) {
        this.zzd = zzsmVar;
        this.zze = zzsgVar;
        this.zza = new zzwr(zzzoVar);
    }

    private final int zzA(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzm[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzl[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i3;
    }

    private final int zzB(int i) {
        int i2 = this.zzq + i;
        int i3 = this.zzh;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int zzC(zzlb zzlbVar, zzih zzihVar, boolean z, boolean z2, zzwt zzwtVar) {
        zzihVar.zzd = false;
        if (!zzK()) {
            if (!z2 && !this.zzv) {
                zzam zzamVar = this.zzz;
                if (zzamVar == null || (!z && zzamVar == this.zzg)) {
                    return -3;
                }
                zzH(zzamVar, zzlbVar);
                return -5;
            }
            zzihVar.zzc(4);
            zzihVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzam zzamVar2 = ((zzwv) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z && zzamVar2 == this.zzg) {
            int iZzB = zzB(this.zzr);
            if (!zzL(iZzB)) {
                zzihVar.zzd = true;
                return -3;
            }
            zzihVar.zzc(this.zzl[iZzB]);
            if (this.zzr == this.zzo - 1 && (z2 || this.zzv)) {
                zzihVar.zza(536870912);
            }
            long j = this.zzm[iZzB];
            zzihVar.zze = j;
            if (j < this.zzs) {
                zzihVar.zza(Integer.MIN_VALUE);
            }
            zzwtVar.zza = this.zzk[iZzB];
            zzwtVar.zzb = this.zzj[iZzB];
            zzwtVar.zzc = this.zzn[iZzB];
            return -4;
        }
        zzH(zzamVar2, zzlbVar);
        return -5;
    }

    private final synchronized long zzD(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzo;
        if (i2 != 0) {
            long[] jArr = this.zzm;
            int i3 = this.zzq;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzr) != i2) {
                    i2 = i + 1;
                }
                int iZzA = zzA(i3, i2, j, false);
                if (iZzA != -1) {
                    return zzF(iZzA);
                }
            }
        }
        return -1L;
    }

    private final synchronized long zzE() {
        int i = this.zzo;
        if (i == 0) {
            return -1L;
        }
        return zzF(i);
    }

    private final synchronized void zzG(long j, int i, long j2, int i2, zzael zzaelVar) {
        int i3 = this.zzo;
        if (i3 > 0) {
            int iZzB = zzB(i3 - 1);
            zzek.zzd(this.zzj[iZzB] + ((long) this.zzk[iZzB]) <= j2);
        }
        this.zzv = (536870912 & i) != 0;
        this.zzu = Math.max(this.zzu, j);
        int iZzB2 = zzB(this.zzo);
        this.zzm[iZzB2] = j;
        this.zzj[iZzB2] = j2;
        this.zzk[iZzB2] = i2;
        this.zzl[iZzB2] = i;
        this.zzn[iZzB2] = zzaelVar;
        this.zzi[iZzB2] = 0;
        if (this.zzc.zzf() || !((zzwv) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzam zzamVar = this.zzz;
            Objects.requireNonNull(zzamVar);
            this.zzc.zzc(this.zzp + this.zzo, new zzwv(zzamVar, zzsl.zzb, null));
        }
        int i4 = this.zzo + 1;
        this.zzo = i4;
        int i5 = this.zzh;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            zzael[] zzaelVarArr = new zzael[i6];
            int i7 = this.zzq;
            int i8 = i5 - i7;
            System.arraycopy(this.zzj, i7, jArr2, 0, i8);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i8);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i8);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i8);
            System.arraycopy(this.zzn, this.zzq, zzaelVarArr, 0, i8);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i8);
            int i9 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i8, i9);
            System.arraycopy(this.zzm, 0, jArr3, i8, i9);
            System.arraycopy(this.zzl, 0, iArr, i8, i9);
            System.arraycopy(this.zzk, 0, iArr2, i8, i9);
            System.arraycopy(this.zzn, 0, zzaelVarArr, i8, i9);
            System.arraycopy(this.zzi, 0, jArr, i8, i9);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzaelVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i6;
        }
    }

    private final void zzH(zzam zzamVar, zzlb zzlbVar) {
        zzam zzamVar2 = this.zzg;
        zzae zzaeVar = zzamVar2 == null ? null : zzamVar2.zzp;
        this.zzg = zzamVar;
        zzae zzaeVar2 = zzamVar.zzp;
        zzlbVar.zza = zzamVar.zzc(this.zzd.zza(zzamVar));
        zzlbVar.zzb = this.zzC;
        if (zzamVar2 == null || !zzfx.zzG(zzaeVar, zzaeVar2)) {
            zzsn zzsnVar = zzamVar.zzp != null ? new zzsn(new zzse(new zzsp(1), 6001)) : null;
            this.zzC = zzsnVar;
            zzlbVar.zzb = zzsnVar;
        }
    }

    private final void zzI() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzJ() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzK() {
        return this.zzr != this.zzo;
    }

    private final boolean zzL(int i) {
        if (this.zzC != null) {
            return (this.zzl[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzM(zzam zzamVar) {
        this.zzx = false;
        if (zzfx.zzG(zzamVar, this.zzz)) {
            return false;
        }
        if (this.zzc.zzf() || !((zzwv) this.zzc.zzb()).zza.equals(zzamVar)) {
            this.zzz = zzamVar;
        } else {
            this.zzz = ((zzwv) this.zzc.zzb()).zza;
        }
        boolean z = this.zzA;
        zzam zzamVar2 = this.zzz;
        this.zzA = z & zzcb.zzf(zzamVar2.zzm, zzamVar2.zzj);
        this.zzB = false;
        return true;
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j, boolean z) {
        int i = this.zzr;
        int iZzB = zzB(i);
        if (zzK() && j >= this.zzm[iZzB]) {
            if (j > this.zzu && z) {
                return this.zzo - i;
            }
            int iZzA = zzA(iZzB, this.zzo - i, j, true);
            if (iZzA == -1) {
                return 0;
            }
            return iZzA;
        }
        return 0;
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zze(com.google.android.gms.internal.ads.zzlb r9, com.google.android.gms.internal.ads.zzih r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.zzwt r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzC(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzf()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzwr r9 = r8.zza
            com.google.android.gms.internal.ads.zzwt r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzwr r9 = r8.zza
            com.google.android.gms.internal.ads.zzwt r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.zze(com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzih, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final /* synthetic */ int zzf(zzu zzuVar, int i, boolean z) {
        return zzaek.zza(this, zzuVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final int zzg(zzu zzuVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zza(zzuVar, i, z);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized zzam zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzj(long j, boolean z, boolean z2) {
        this.zza.zzc(zzD(j, false, z2));
    }

    public final void zzk() {
        this.zza.zzc(zzE());
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzl(zzam zzamVar) {
        this.zzy = zzamVar;
        boolean zZzM = zzM(zzamVar);
        zzww zzwwVar = this.zzf;
        if (zzwwVar == null || !zZzM) {
            return;
        }
        zzwwVar.zzM(zzamVar);
    }

    public final void zzm() throws IOException {
        zzsn zzsnVar = this.zzC;
        if (zzsnVar != null) {
            throw zzsnVar.zza();
        }
    }

    public final void zzn() {
        zzk();
        zzI();
    }

    public final void zzo() {
        zzp(true);
        zzI();
    }

    public final void zzp(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
            this.zzA = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final /* synthetic */ void zzq(zzfo zzfoVar, int i) {
        zzaek.zzb(this, zzfoVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzr(zzfo zzfoVar, int i, int i2) {
        this.zza.zzh(zzfoVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzs(long j, int i, int i2, int i3, zzael zzaelVar) {
        if (this.zzw) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzA) {
            if (j < this.zzs) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzB) {
                    zzfe.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.zzz))));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzG(j, i, (this.zza.zzb() - i2) - i3, i2, zzaelVar);
    }

    public final void zzt(long j) {
        this.zzs = j;
    }

    public final void zzu(zzww zzwwVar) {
        this.zzf = zzwwVar;
    }

    public final synchronized void zzv(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzek.zzd(z);
        this.zzr += i;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    public final synchronized boolean zzx(boolean z) {
        boolean z2 = true;
        if (zzK()) {
            if (((zzwv) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzL(zzB(this.zzr));
        }
        if (!z && !this.zzv) {
            zzam zzamVar = this.zzz;
            if (zzamVar == null) {
                z2 = false;
            } else if (zzamVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean zzy(int i) {
        boolean z;
        zzJ();
        int i2 = this.zzp;
        if (i < i2 || i > this.zzo + i2) {
            z = false;
        } else {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i - i2;
            z = true;
        }
        return z;
    }

    public final synchronized boolean zzz(long j, boolean z) {
        int iZzA;
        zzJ();
        int i = this.zzr;
        int iZzB = zzB(i);
        if (zzK() && j >= this.zzm[iZzB]) {
            if (j > this.zzu) {
                if (z) {
                    z = true;
                }
            }
            if (this.zzA) {
                iZzA = this.zzo - i;
                int i2 = 0;
                while (true) {
                    if (i2 < iZzA) {
                        if (this.zzm[iZzB] >= j) {
                            iZzA = i2;
                            break;
                        }
                        iZzB++;
                        if (iZzB == this.zzh) {
                            iZzB = 0;
                        }
                        i2++;
                    } else if (!z) {
                        iZzA = -1;
                    }
                }
            } else {
                iZzA = zzA(iZzB, this.zzo - i, j, true);
            }
            if (iZzA != -1) {
                this.zzs = j;
                this.zzr += iZzA;
                return true;
            }
        }
        return false;
    }

    private final long zzF(int i) {
        long j = this.zzt;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iZzB = zzB(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                jMax = Math.max(jMax, this.zzm[iZzB]);
                if ((this.zzl[iZzB] & 1) != 0) {
                    break;
                }
                iZzB--;
                if (iZzB == -1) {
                    iZzB = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j, jMax);
        this.zzo -= i;
        int i3 = this.zzp + i;
        this.zzp = i3;
        int i4 = this.zzq + i;
        this.zzq = i4;
        int i5 = this.zzh;
        if (i4 >= i5) {
            this.zzq = i4 - i5;
        }
        int i6 = this.zzr - i;
        this.zzr = i6;
        if (i6 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i3);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i7 = this.zzq;
        if (i7 == 0) {
            i7 = this.zzh;
        }
        return this.zzj[i7 - 1] + this.zzk[r12];
    }
}
