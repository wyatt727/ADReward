package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakw extends zzaku {
    private zzakv zza;
    private int zzb;
    private boolean zzc;
    private zzaer zzd;
    private zzaep zze;

    zzakw() {
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    protected final long zza(zzfo zzfoVar) {
        if ((zzfoVar.zzM()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzfoVar.zzM()[0];
        zzakv zzakvVar = this.zza;
        zzek.zzb(zzakvVar);
        int i = !zzakvVar.zzd[(b >> 1) & (255 >>> (8 - zzakvVar.zze))].zza ? zzakvVar.zza.zze : zzakvVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzfoVar.zzc() < zzfoVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzfoVar.zzM(), zzfoVar.zze() + 4);
            zzfoVar.zzI(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzfoVar.zzJ(zzfoVar.zze() + 4);
        }
        long j = i2;
        byte[] bArrZzM = zzfoVar.zzM();
        bArrZzM[zzfoVar.zze() - 4] = (byte) (j & 255);
        bArrZzM[zzfoVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzM[zzfoVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzM[zzfoVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    protected final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzaer zzaerVar = this.zzd;
        this.zzb = zzaerVar != null ? zzaerVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfo zzfoVar, long j, zzakr zzakrVar) throws IOException {
        zzakv zzakvVar;
        int i;
        int iZzb;
        int i2;
        int i3;
        zzaer zzaerVar;
        long jFloor;
        if (this.zza != null) {
            Objects.requireNonNull(zzakrVar.zza);
            return false;
        }
        zzaer zzaerVar2 = this.zzd;
        int i4 = 4;
        if (zzaerVar2 == null) {
            zzaes.zzd(1, zzfoVar, false);
            int iZzj = zzfoVar.zzj();
            int iZzm = zzfoVar.zzm();
            int iZzj2 = zzfoVar.zzj();
            int iZzi = zzfoVar.zzi();
            int i5 = iZzi <= 0 ? -1 : iZzi;
            int iZzi2 = zzfoVar.zzi();
            int i6 = iZzi2 <= 0 ? -1 : iZzi2;
            int iZzi3 = zzfoVar.zzi();
            int i7 = iZzi3 <= 0 ? -1 : iZzi3;
            int iZzm2 = zzfoVar.zzm();
            this.zzd = new zzaer(iZzj, iZzm, iZzj2, i5, i6, i7, (int) Math.pow(2.0d, iZzm2 & 15), (int) Math.pow(2.0d, (iZzm2 & 240) >> 4), 1 == (zzfoVar.zzm() & 1), Arrays.copyOf(zzfoVar.zzM(), zzfoVar.zze()));
        } else {
            zzaep zzaepVar = this.zze;
            if (zzaepVar == null) {
                this.zze = zzaes.zzc(zzfoVar, true, true);
            } else {
                byte[] bArr = new byte[zzfoVar.zze()];
                System.arraycopy(zzfoVar.zzM(), 0, bArr, 0, zzfoVar.zze());
                int i8 = zzaerVar2.zza;
                int i9 = 5;
                zzaes.zzd(5, zzfoVar, false);
                int iZzm3 = zzfoVar.zzm() + 1;
                zzaeo zzaeoVar = new zzaeo(zzfoVar.zzM());
                zzaeoVar.zzc(zzfoVar.zzd() * 8);
                int i10 = 0;
                while (true) {
                    int i11 = 2;
                    int i12 = 16;
                    if (i10 >= iZzm3) {
                        zzaer zzaerVar3 = zzaerVar2;
                        int i13 = 6;
                        int iZzb2 = zzaeoVar.zzb(6) + 1;
                        for (int i14 = 0; i14 < iZzb2; i14++) {
                            if (zzaeoVar.zzb(16) != 0) {
                                throw zzcc.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i15 = 1;
                        int iZzb3 = zzaeoVar.zzb(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 < iZzb3) {
                                int iZzb4 = zzaeoVar.zzb(i12);
                                if (iZzb4 == 0) {
                                    i2 = iZzb3;
                                    int i18 = 8;
                                    zzaeoVar.zzc(8);
                                    zzaeoVar.zzc(16);
                                    zzaeoVar.zzc(16);
                                    zzaeoVar.zzc(6);
                                    zzaeoVar.zzc(8);
                                    int iZzb5 = zzaeoVar.zzb(4) + 1;
                                    int i19 = 0;
                                    while (i19 < iZzb5) {
                                        zzaeoVar.zzc(i18);
                                        i19++;
                                        i18 = 8;
                                    }
                                } else {
                                    if (iZzb4 != i15) {
                                        throw zzcc.zza("floor type greater than 1 not decodable: " + iZzb4, null);
                                    }
                                    int iZzb6 = zzaeoVar.zzb(i9);
                                    int[] iArr = new int[iZzb6];
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < iZzb6; i21++) {
                                        int iZzb7 = zzaeoVar.zzb(4);
                                        iArr[i21] = iZzb7;
                                        if (iZzb7 > i20) {
                                            i20 = iZzb7;
                                        }
                                    }
                                    int i22 = i20 + 1;
                                    int[] iArr2 = new int[i22];
                                    int i23 = 0;
                                    while (i23 < i22) {
                                        iArr2[i23] = zzaeoVar.zzb(i17) + 1;
                                        int iZzb8 = zzaeoVar.zzb(i11);
                                        if (iZzb8 > 0) {
                                            i3 = 8;
                                            zzaeoVar.zzc(8);
                                        } else {
                                            i3 = 8;
                                        }
                                        int i24 = iZzb3;
                                        int i25 = 0;
                                        for (int i26 = 1; i25 < (i26 << iZzb8); i26 = 1) {
                                            zzaeoVar.zzc(i3);
                                            i25++;
                                            i3 = 8;
                                        }
                                        i23++;
                                        iZzb3 = i24;
                                        i11 = 2;
                                        i17 = 3;
                                    }
                                    i2 = iZzb3;
                                    zzaeoVar.zzc(i11);
                                    int iZzb9 = zzaeoVar.zzb(4);
                                    int i27 = 0;
                                    int i28 = 0;
                                    for (int i29 = 0; i29 < iZzb6; i29++) {
                                        i27 += iArr2[iArr[i29]];
                                        while (i28 < i27) {
                                            zzaeoVar.zzc(iZzb9);
                                            i28++;
                                        }
                                    }
                                }
                                i16++;
                                iZzb3 = i2;
                                i13 = 6;
                                i12 = 16;
                                i11 = 2;
                                i15 = 1;
                                i9 = 5;
                            } else {
                                int i30 = 1;
                                int iZzb10 = zzaeoVar.zzb(i13) + 1;
                                int i31 = 0;
                                while (i31 < iZzb10) {
                                    if (zzaeoVar.zzb(16) > 2) {
                                        throw zzcc.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzaeoVar.zzc(24);
                                    zzaeoVar.zzc(24);
                                    zzaeoVar.zzc(24);
                                    int iZzb11 = zzaeoVar.zzb(i13) + i30;
                                    int i32 = 8;
                                    zzaeoVar.zzc(8);
                                    int[] iArr3 = new int[iZzb11];
                                    for (int i33 = 0; i33 < iZzb11; i33++) {
                                        iArr3[i33] = ((zzaeoVar.zzd() ? zzaeoVar.zzb(5) : 0) * 8) + zzaeoVar.zzb(3);
                                    }
                                    int i34 = 0;
                                    while (i34 < iZzb11) {
                                        int i35 = 0;
                                        while (i35 < i32) {
                                            if ((iArr3[i34] & (1 << i35)) != 0) {
                                                zzaeoVar.zzc(i32);
                                            }
                                            i35++;
                                            i32 = 8;
                                        }
                                        i34++;
                                        i32 = 8;
                                    }
                                    i31++;
                                    i13 = 6;
                                    i30 = 1;
                                }
                                int iZzb12 = zzaeoVar.zzb(i13) + 1;
                                for (int i36 = 0; i36 < iZzb12; i36++) {
                                    int iZzb13 = zzaeoVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        zzfe.zzc("VorbisUtil", "mapping type other than 0 not supported: " + iZzb13);
                                    } else {
                                        if (zzaeoVar.zzd()) {
                                            i = 1;
                                            iZzb = zzaeoVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzaeoVar.zzd()) {
                                            int iZzb14 = zzaeoVar.zzb(8) + i;
                                            for (int i37 = 0; i37 < iZzb14; i37++) {
                                                int i38 = i8 - 1;
                                                zzaeoVar.zzc(zzaes.zza(i38));
                                                zzaeoVar.zzc(zzaes.zza(i38));
                                            }
                                        }
                                        if (zzaeoVar.zzb(2) != 0) {
                                            throw zzcc.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i39 = 0; i39 < i8; i39++) {
                                                zzaeoVar.zzc(4);
                                            }
                                        }
                                        for (int i40 = 0; i40 < iZzb; i40++) {
                                            zzaeoVar.zzc(8);
                                            zzaeoVar.zzc(8);
                                            zzaeoVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzaeoVar.zzb(6) + 1;
                                zzaeq[] zzaeqVarArr = new zzaeq[iZzb15];
                                for (int i41 = 0; i41 < iZzb15; i41++) {
                                    zzaeqVarArr[i41] = new zzaeq(zzaeoVar.zzd(), zzaeoVar.zzb(16), zzaeoVar.zzb(16), zzaeoVar.zzb(8));
                                }
                                if (!zzaeoVar.zzd()) {
                                    throw zzcc.zza("framing bit after modes not set as expected", null);
                                }
                                zzakvVar = new zzakv(zzaerVar3, zzaepVar, bArr, zzaeqVarArr, zzaes.zza(iZzb15 - 1));
                            }
                        }
                    } else {
                        if (zzaeoVar.zzb(24) != 5653314) {
                            throw zzcc.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaeoVar.zza(), null);
                        }
                        int iZzb16 = zzaeoVar.zzb(16);
                        int iZzb17 = zzaeoVar.zzb(24);
                        if (zzaeoVar.zzd()) {
                            zzaeoVar.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzaeoVar.zzb(zzaes.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZzd = zzaeoVar.zzd();
                            for (int i42 = 0; i42 < iZzb17; i42++) {
                                if (!zZzd) {
                                    zzaeoVar.zzc(5);
                                } else if (zzaeoVar.zzd()) {
                                    zzaeoVar.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = zzaeoVar.zzb(i4);
                        if (iZzb19 > 2) {
                            throw zzcc.zza("lookup type greater than 2 not decodable: " + iZzb19, null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 != 2) {
                                zzaerVar = zzaerVar2;
                            }
                            i10++;
                            zzaerVar2 = zzaerVar;
                            i4 = 4;
                        } else {
                            i11 = iZzb19;
                        }
                        zzaeoVar.zzc(32);
                        zzaeoVar.zzc(32);
                        int iZzb20 = zzaeoVar.zzb(i4) + 1;
                        zzaeoVar.zzc(1);
                        if (i11 != 1) {
                            zzaerVar = zzaerVar2;
                            jFloor = iZzb16 * iZzb17;
                        } else if (iZzb16 != 0) {
                            zzaerVar = zzaerVar2;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / iZzb16));
                        } else {
                            zzaerVar = zzaerVar2;
                            jFloor = 0;
                        }
                        zzaeoVar.zzc((int) (jFloor * iZzb20));
                        i10++;
                        zzaerVar2 = zzaerVar;
                        i4 = 4;
                    }
                }
            }
        }
        zzakvVar = null;
        this.zza = zzakvVar;
        if (zzakvVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaer zzaerVar4 = zzakvVar.zza;
        arrayList.add(zzaerVar4.zzg);
        arrayList.add(zzakvVar.zzc);
        zzby zzbyVarZzb = zzaes.zzb(zzfzn.zzl(zzakvVar.zzb.zzb));
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/vorbis");
        zzakVar.zzx(zzaerVar4.zzd);
        zzakVar.zzR(zzaerVar4.zzc);
        zzakVar.zzy(zzaerVar4.zza);
        zzakVar.zzX(zzaerVar4.zzb);
        zzakVar.zzL(arrayList);
        zzakVar.zzP(zzbyVarZzb);
        zzakrVar.zza = zzakVar.zzac();
        return true;
    }
}
