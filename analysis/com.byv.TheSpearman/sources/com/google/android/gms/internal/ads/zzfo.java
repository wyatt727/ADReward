package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfo {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzfzs zzc = zzfzs.zzr(zzfwd.zza, zzfwd.zzc, zzfwd.zzf, zzfwd.zzd, zzfwd.zze);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzfo() {
        this.zzd = zzfx.zzf;
    }

    public zzfo(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
    }

    private final char zzN(Charset charset, char[] cArr) {
        int iZzO = zzO(charset);
        if (iZzO != 0) {
            int i = iZzO >> 16;
            for (char c : cArr) {
                char c2 = (char) i;
                if (c == c2) {
                    this.zze += (char) iZzO;
                    return c2;
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzO(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzfwd.zzc
            boolean r0 = r5.equals(r0)
            r1 = 1
            r2 = 2
            if (r0 != 0) goto L12
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzfwd.zza
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L26
        L12:
            int r0 = r4.zzf
            int r3 = r4.zze
            int r0 = r0 - r3
            if (r0 <= 0) goto L26
            byte[] r5 = r4.zzd
            r5 = r5[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r2 = (long) r5
            char r5 = com.google.android.gms.internal.ads.zzgci.zza(r2)
            byte r5 = (byte) r5
            goto L67
        L26:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzfwd.zzf
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L36
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzfwd.zzd
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4b
        L36:
            int r0 = r4.zzf
            int r3 = r4.zze
            int r0 = r0 - r3
            if (r0 < r2) goto L4b
            byte[] r5 = r4.zzd
            r0 = r5[r3]
            int r3 = r3 + r1
            r5 = r5[r3]
            char r5 = com.google.android.gms.internal.ads.zzgci.zzb(r0, r5)
        L48:
            byte r5 = (byte) r5
            r1 = r2
            goto L67
        L4b:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzfwd.zze
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L70
            int r5 = r4.zzf
            int r0 = r4.zze
            int r5 = r5 - r0
            if (r5 < r2) goto L70
            byte[] r5 = r4.zzd
            int r1 = r0 + 1
            r1 = r5[r1]
            r5 = r5[r0]
            char r5 = com.google.android.gms.internal.ads.zzgci.zzb(r1, r5)
            goto L48
        L67:
            long r2 = (long) r5
            char r5 = com.google.android.gms.internal.ads.zzgci.zza(r2)
            int r5 = r5 << 16
            int r5 = r5 + r1
            return r5
        L70:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfo.zzO(java.nio.charset.Charset):int");
    }

    public final String zzA(int i, Charset charset) {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        String str = new String(bArr, i2, i, charset);
        this.zze = i2 + i;
        return str;
    }

    public final Charset zzB() {
        int i = this.zzf;
        int i2 = this.zze;
        int i3 = i - i2;
        if (i3 >= 3) {
            byte[] bArr = this.zzd;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.zze = i2 + 3;
                return zzfwd.zzc;
            }
        }
        if (i3 < 2) {
            return null;
        }
        byte[] bArr2 = this.zzd;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.zze = i2 + 2;
            return zzfwd.zzd;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.zze = i2 + 2;
        return zzfwd.zze;
    }

    public final short zzC() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        int i3 = bArr[i] & 255;
        this.zze = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        int i3 = bArr[i] & 255;
        this.zze = i2 + 1;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    public final void zzE(int i) {
        byte[] bArr = this.zzd;
        if (i > bArr.length) {
            this.zzd = Arrays.copyOf(bArr, i);
        }
    }

    public final void zzF(zzfn zzfnVar, int i) {
        zzG(zzfnVar.zza, 0, i);
        zzfnVar.zzk(0);
    }

    public final void zzG(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zzd, this.zze, bArr, i, i2);
        this.zze += i2;
    }

    public final void zzH(int i) {
        byte[] bArr = this.zzd;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzI(bArr, i);
    }

    public final void zzI(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
        this.zze = 0;
    }

    public final void zzJ(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzd.length) {
            z = true;
        }
        zzek.zzd(z);
        this.zzf = i;
    }

    public final void zzK(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzf) {
            z = true;
        }
        zzek.zzd(z);
        this.zze = i;
    }

    public final void zzL(int i) {
        zzK(this.zze + i);
    }

    public final byte[] zzM() {
        return this.zzd;
    }

    public final char zza(Charset charset) {
        zzek.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(String.valueOf(charset))));
        return (char) (zzO(charset) >> 16);
    }

    public final int zzb() {
        return this.zzf - this.zze;
    }

    public final int zzc() {
        return this.zzd.length;
    }

    public final int zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.zze = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i4 + 1;
        this.zze = i6;
        int i7 = bArr[i4] & 255;
        this.zze = i6 + 1;
        return (bArr[i6] & 255) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.zze = i4;
        int i5 = bArr[i2] & 255;
        this.zze = i4 + 1;
        return (bArr[i4] & 255) | ((i3 << 24) >> 8) | (i5 << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.zze = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i4 + 1;
        this.zze = i6;
        int i7 = bArr[i4] & 255;
        this.zze = i6 + 1;
        return ((bArr[i6] & 255) << 24) | i3 | (i5 << 8) | (i7 << 16);
    }

    public final int zzj() {
        int iZzi = zzi();
        if (iZzi >= 0) {
            return iZzi;
        }
        throw new IllegalStateException("Top bit not zero: " + iZzi);
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        int i3 = bArr[i] & 255;
        this.zze = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        this.zze = i + 1;
        return bArr[i] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.zze = i4;
        int i5 = bArr[i2] & 255;
        this.zze = i4 + 2;
        return i5 | (i3 << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        this.zze = i4;
        int i5 = bArr[i2] & 255;
        this.zze = i4 + 1;
        return (bArr[i4] & 255) | (i3 << 16) | (i5 << 8);
    }

    public final int zzp() {
        int iZzg = zzg();
        if (iZzg >= 0) {
            return iZzg;
        }
        throw new IllegalStateException("Top bit not zero: " + iZzg);
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        int i3 = bArr[i] & 255;
        this.zze = i2 + 1;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final long zzr() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.zze = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.zze = i4;
        long j3 = bArr[i3];
        int i5 = i4 + 1;
        this.zze = i5;
        long j4 = bArr[i4];
        int i6 = i5 + 1;
        this.zze = i6;
        long j5 = bArr[i5];
        int i7 = i6 + 1;
        this.zze = i7;
        long j6 = bArr[i6];
        int i8 = i7 + 1;
        this.zze = i8;
        long j7 = bArr[i7];
        this.zze = i8 + 1;
        return ((bArr[i8] & 255) << 56) | ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
    }

    public final long zzs() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.zze = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.zze = i4;
        long j3 = bArr[i3];
        this.zze = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long zzt() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.zze = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.zze = i4;
        long j3 = bArr[i3];
        int i5 = i4 + 1;
        this.zze = i5;
        long j4 = bArr[i4];
        int i6 = i5 + 1;
        this.zze = i6;
        long j5 = bArr[i5];
        int i7 = i6 + 1;
        this.zze = i7;
        long j6 = bArr[i6];
        int i8 = i7 + 1;
        this.zze = i8;
        long j7 = bArr[i7];
        this.zze = i8 + 1;
        return (bArr[i8] & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long zzu() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.zze = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.zze = i4;
        long j3 = bArr[i3];
        this.zze = i4 + 1;
        return (bArr[i4] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long zzv() {
        long jZzt = zzt();
        if (jZzt >= 0) {
            return jZzt;
        }
        throw new IllegalStateException("Top bit not zero: " + jZzt);
    }

    public final long zzw() {
        int i;
        int i2;
        long j = this.zzd[this.zze];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r7 - 1;
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i2 = 1; i2 < i; i2++) {
            if ((this.zzd[this.zze + i2] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (r2 & Utf8.REPLACEMENT_BYTE);
        }
        this.zze += i;
        return j;
    }

    public final String zzx(char c) {
        int i = this.zzf;
        int i2 = this.zze;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.zzf && this.zzd[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.zzd;
        int i3 = this.zze;
        String strZzB = zzfx.zzB(bArr, i3, i2 - i3);
        this.zze = i2;
        if (i2 < this.zzf) {
            this.zze = i2 + 1;
        }
        return strZzB;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzy(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzfzs r0 = com.google.android.gms.internal.ads.zzfo.zzc
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Unsupported charset: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.internal.ads.zzek.zze(r0, r1)
            int r0 = r4.zzf
            int r1 = r4.zze
            int r0 = r0 - r1
            if (r0 != 0) goto L20
            r5 = 0
            return r5
        L20:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzfwd.zza
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2b
            r4.zzB()
        L2b:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzfwd.zzc
            boolean r0 = r5.equals(r0)
            r1 = 2
            r3 = 1
            if (r0 != 0) goto L69
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzfwd.zza
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L3e
            goto L69
        L3e:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzfwd.zzf
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L6a
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzfwd.zze
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L6a
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzfwd.zzd
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L57
            goto L6a
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r2.concat(r5)
            r0.<init>(r5)
            throw r0
        L69:
            r1 = r3
        L6a:
            int r0 = r4.zze
        L6c:
            int r2 = r4.zzf
            int r3 = r1 + (-1)
            int r3 = r2 - r3
            if (r0 >= r3) goto Lc9
            java.nio.charset.Charset r2 = com.google.android.gms.internal.ads.zzfwd.zzc
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L84
            java.nio.charset.Charset r2 = com.google.android.gms.internal.ads.zzfwd.zza
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8e
        L84:
            byte[] r2 = r4.zzd
            r2 = r2[r0]
            boolean r2 = com.google.android.gms.internal.ads.zzfx.zzL(r2)
            if (r2 != 0) goto Lca
        L8e:
            java.nio.charset.Charset r2 = com.google.android.gms.internal.ads.zzfwd.zzf
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L9e
            java.nio.charset.Charset r2 = com.google.android.gms.internal.ads.zzfwd.zzd
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lae
        L9e:
            byte[] r2 = r4.zzd
            r3 = r2[r0]
            if (r3 != 0) goto Lae
            int r3 = r0 + 1
            r2 = r2[r3]
            boolean r2 = com.google.android.gms.internal.ads.zzfx.zzL(r2)
            if (r2 != 0) goto Lca
        Lae:
            java.nio.charset.Charset r2 = com.google.android.gms.internal.ads.zzfwd.zze
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lc7
            int r2 = r0 + 1
            byte[] r3 = r4.zzd
            r2 = r3[r2]
            if (r2 != 0) goto Lc7
            r2 = r3[r0]
            boolean r2 = com.google.android.gms.internal.ads.zzfx.zzL(r2)
            if (r2 == 0) goto Lc7
            goto Lca
        Lc7:
            int r0 = r0 + r1
            goto L6c
        Lc9:
            r0 = r2
        Lca:
            int r1 = r4.zze
            int r0 = r0 - r1
            java.lang.String r0 = r4.zzA(r0, r5)
            int r1 = r4.zze
            int r2 = r4.zzf
            if (r1 == r2) goto Le6
            char[] r1 = com.google.android.gms.internal.ads.zzfo.zza
            char r1 = r4.zzN(r5, r1)
            r2 = 13
            if (r1 != r2) goto Le6
            char[] r1 = com.google.android.gms.internal.ads.zzfo.zzb
            r4.zzN(r5, r1)
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfo.zzy(java.nio.charset.Charset):java.lang.String");
    }

    public final String zzz(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.zze;
        int i3 = (i2 + i) - 1;
        String strZzB = zzfx.zzB(this.zzd, i2, (i3 >= this.zzf || this.zzd[i3] != 0) ? i : i - 1);
        this.zze += i;
        return strZzB;
    }

    public zzfo(int i) {
        this.zzd = new byte[i];
        this.zzf = i;
    }

    public zzfo(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}
