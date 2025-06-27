package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzalt implements zzalh {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzalm zzg;
    private final zzall zzh;
    private final zzals zzi;
    private Bitmap zzj;

    public zzalt(List list) {
        zzfo zzfoVar = new zzfo((byte[]) list.get(0));
        int iZzq = zzfoVar.zzq();
        int iZzq2 = zzfoVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzalm(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.zzh = new zzall(0, zzg(), zzh(), zzi());
        this.zzi = new zzals(iZzq, iZzq2);
    }

    private static int zzb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static zzall zzc(zzfn zzfnVar, int i) {
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i2 = 8;
        int iZzd5 = zzfnVar.zzd(8);
        zzfnVar.zzm(8);
        int[] iArrZzg = zzg();
        int[] iArrZzh = zzh();
        int[] iArrZzi = zzi();
        int i3 = i - 2;
        while (i3 > 0) {
            int iZzd6 = zzfnVar.zzd(i2);
            int iZzd7 = zzfnVar.zzd(i2);
            int i4 = i3 - 2;
            int[] iArr = (iZzd7 & 128) != 0 ? iArrZzg : (iZzd7 & 64) != 0 ? iArrZzh : iArrZzi;
            if ((iZzd7 & 1) != 0) {
                iZzd3 = zzfnVar.zzd(i2);
                iZzd4 = zzfnVar.zzd(i2);
                iZzd = zzfnVar.zzd(i2);
                iZzd2 = zzfnVar.zzd(i2);
                i3 = i4 - 4;
            } else {
                int iZzd8 = zzfnVar.zzd(6) << 2;
                int iZzd9 = zzfnVar.zzd(4) << 4;
                i3 = i4 - 2;
                iZzd = zzfnVar.zzd(4) << 4;
                iZzd2 = zzfnVar.zzd(2) << 6;
                iZzd3 = iZzd8;
                iZzd4 = iZzd9;
            }
            if (iZzd3 == 0) {
                iZzd2 = 255;
            }
            if (iZzd3 == 0) {
                iZzd = 0;
            }
            if (iZzd3 == 0) {
                iZzd4 = 0;
            }
            double d = iZzd3;
            double d2 = iZzd4 - 128;
            double d3 = iZzd - 128;
            iArr[iZzd6] = zzb((byte) (255 - (iZzd2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            iZzd5 = iZzd5;
            i2 = 8;
        }
        return new zzall(iZzd5, iArrZzg, iArrZzh, iArrZzi);
    }

    private static zzaln zzd(zzfn zzfnVar) {
        int iZzd = zzfnVar.zzd(16);
        zzfnVar.zzm(4);
        int iZzd2 = zzfnVar.zzd(2);
        boolean zZzo = zzfnVar.zzo();
        zzfnVar.zzm(1);
        byte[] bArr = zzfx.zzf;
        byte[] bArr2 = zzfx.zzf;
        if (iZzd2 == 1) {
            zzfnVar.zzm(zzfnVar.zzd(8) * 16);
        } else if (iZzd2 == 0) {
            int iZzd3 = zzfnVar.zzd(16);
            int iZzd4 = zzfnVar.zzd(16);
            if (iZzd3 > 0) {
                bArr = new byte[iZzd3];
                zzfnVar.zzh(bArr, 0, iZzd3);
            }
            if (iZzd4 > 0) {
                bArr2 = new byte[iZzd4];
                zzfnVar.zzh(bArr2, 0, iZzd4);
            } else {
                bArr2 = bArr;
            }
        }
        return new zzaln(iZzd, zZzo, bArr, bArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0228 A[LOOP:3: B:88:0x0172->B:119:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zze(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalt.zze(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzf(int i, int i2, zzfn zzfnVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzfnVar.zzd(i2);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzb(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = zzb(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = zzb(63, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                int i4 = Opcodes.TABLESWITCH;
                if (i3 == 0) {
                    int i5 = i2 & 16;
                    int i6 = i2 & 32;
                    int i7 = i2 & 2;
                    int i8 = i2 & 64;
                    int i9 = i2 & 4;
                    int i10 = 1 != (i2 & 1) ? 0 : 85;
                    int i11 = i5 != 0 ? 170 : 0;
                    int i12 = i7 != 0 ? 85 : 0;
                    int i13 = i6 != 0 ? 170 : 0;
                    i = i9 == 0 ? 0 : 85;
                    if (i8 == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = zzb(255, i10 + i11, i12 + i13, i + i4);
                } else if (i3 == 8) {
                    int i14 = i2 & 16;
                    int i15 = i2 & 32;
                    int i16 = i2 & 2;
                    int i17 = i2 & 64;
                    int i18 = i2 & 4;
                    int i19 = 1 != (i2 & 1) ? 0 : 85;
                    int i20 = i14 != 0 ? 170 : 0;
                    int i21 = i16 != 0 ? 85 : 0;
                    int i22 = i15 != 0 ? 170 : 0;
                    i = i18 == 0 ? 0 : 85;
                    if (i17 == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = zzb(127, i19 + i20, i21 + i22, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = zzb(255, (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = zzb(255, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzalh
    public final void zza(byte[] bArr, int i, int i2, zzalg zzalgVar, zzep zzepVar) {
        zzakz zzakzVar;
        char c;
        char c2;
        int i3;
        SparseArray sparseArray;
        int i4;
        SparseArray sparseArray2;
        zzalq zzalqVar;
        int i5;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i6;
        int iZzd5;
        zzfn zzfnVar = new zzfn(bArr, i + i2);
        zzfnVar.zzk(i);
        while (zzfnVar.zza() >= 48 && zzfnVar.zzd(8) == 15) {
            zzals zzalsVar = this.zzi;
            int iZzd6 = zzfnVar.zzd(8);
            int iZzd7 = zzfnVar.zzd(16);
            int iZzd8 = zzfnVar.zzd(16);
            int iZzb = zzfnVar.zzb() + iZzd8;
            if (iZzd8 * 8 > zzfnVar.zza()) {
                zzfe.zzf("DvbParser", "Data field length exceeds limit");
                zzfnVar.zzm(zzfnVar.zza());
            } else {
                switch (iZzd6) {
                    case 16:
                        if (iZzd7 == zzalsVar.zza) {
                            zzalo zzaloVar = zzalsVar.zzi;
                            int iZzd9 = zzfnVar.zzd(8);
                            int iZzd10 = zzfnVar.zzd(4);
                            int iZzd11 = zzfnVar.zzd(2);
                            zzfnVar.zzm(2);
                            SparseArray sparseArray3 = new SparseArray();
                            for (int i7 = iZzd8 - 2; i7 > 0; i7 -= 6) {
                                int iZzd12 = zzfnVar.zzd(8);
                                zzfnVar.zzm(8);
                                sparseArray3.put(iZzd12, new zzalp(zzfnVar.zzd(16), zzfnVar.zzd(16)));
                            }
                            zzalo zzaloVar2 = new zzalo(iZzd9, iZzd10, iZzd11, sparseArray3);
                            if (zzaloVar2.zzb != 0) {
                                zzalsVar.zzi = zzaloVar2;
                                zzalsVar.zzc.clear();
                                zzalsVar.zzd.clear();
                                zzalsVar.zze.clear();
                                break;
                            } else if (zzaloVar != null) {
                                if (zzaloVar.zza != zzaloVar2.zza) {
                                    zzalsVar.zzi = zzaloVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzalo zzaloVar3 = zzalsVar.zzi;
                        if (iZzd7 == zzalsVar.zza && zzaloVar3 != null) {
                            int iZzd13 = zzfnVar.zzd(8);
                            zzfnVar.zzm(4);
                            boolean zZzo = zzfnVar.zzo();
                            zzfnVar.zzm(3);
                            int iZzd14 = zzfnVar.zzd(16);
                            int iZzd15 = zzfnVar.zzd(16);
                            int iZzd16 = zzfnVar.zzd(3);
                            int iZzd17 = zzfnVar.zzd(3);
                            zzfnVar.zzm(2);
                            int iZzd18 = zzfnVar.zzd(8);
                            int iZzd19 = zzfnVar.zzd(8);
                            int iZzd20 = zzfnVar.zzd(4);
                            int iZzd21 = zzfnVar.zzd(2);
                            zzfnVar.zzm(2);
                            int i8 = iZzd8 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i8 > 0) {
                                int iZzd22 = zzfnVar.zzd(16);
                                int iZzd23 = zzfnVar.zzd(2);
                                int iZzd24 = zzfnVar.zzd(2);
                                int iZzd25 = zzfnVar.zzd(12);
                                zzfnVar.zzm(4);
                                int iZzd26 = zzfnVar.zzd(12);
                                i8 -= 6;
                                if (iZzd23 == 1) {
                                    i8 -= 2;
                                    i5 = iZzd23;
                                    iZzd = zzfnVar.zzd(8);
                                    iZzd2 = zzfnVar.zzd(8);
                                } else if (iZzd23 == 2) {
                                    iZzd23 = 2;
                                    i8 -= 2;
                                    i5 = iZzd23;
                                    iZzd = zzfnVar.zzd(8);
                                    iZzd2 = zzfnVar.zzd(8);
                                } else {
                                    i5 = iZzd23;
                                    iZzd = 0;
                                    iZzd2 = 0;
                                }
                                sparseArray4.put(iZzd22, new zzalr(i5, iZzd24, iZzd25, iZzd26, iZzd, iZzd2));
                            }
                            zzalq zzalqVar2 = new zzalq(iZzd13, zZzo, iZzd14, iZzd15, iZzd16, iZzd17, iZzd18, iZzd19, iZzd20, iZzd21, sparseArray4);
                            if (zzaloVar3.zzb == 0 && (zzalqVar = (zzalq) zzalsVar.zzc.get(zzalqVar2.zza)) != null) {
                                int i9 = 0;
                                while (true) {
                                    SparseArray sparseArray5 = zzalqVar.zzj;
                                    if (i9 < sparseArray5.size()) {
                                        zzalqVar2.zzj.put(sparseArray5.keyAt(i9), (zzalr) sparseArray5.valueAt(i9));
                                        i9++;
                                    }
                                }
                            }
                            zzalsVar.zzc.put(zzalqVar2.zza, zzalqVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (iZzd7 == zzalsVar.zza) {
                            zzall zzallVarZzc = zzc(zzfnVar, iZzd8);
                            zzalsVar.zzd.put(zzallVarZzc.zza, zzallVarZzc);
                            break;
                        } else if (iZzd7 == zzalsVar.zzb) {
                            zzall zzallVarZzc2 = zzc(zzfnVar, iZzd8);
                            zzalsVar.zzf.put(zzallVarZzc2.zza, zzallVarZzc2);
                            break;
                        }
                        break;
                    case 19:
                        if (iZzd7 == zzalsVar.zza) {
                            zzaln zzalnVarZzd = zzd(zzfnVar);
                            zzalsVar.zze.put(zzalnVarZzd.zza, zzalnVarZzd);
                            break;
                        } else if (iZzd7 == zzalsVar.zzb) {
                            zzaln zzalnVarZzd2 = zzd(zzfnVar);
                            zzalsVar.zzg.put(zzalnVarZzd2.zza, zzalnVarZzd2);
                            break;
                        }
                        break;
                    case 20:
                        if (iZzd7 == zzalsVar.zza) {
                            zzfnVar.zzm(4);
                            boolean zZzo2 = zzfnVar.zzo();
                            zzfnVar.zzm(3);
                            int iZzd27 = zzfnVar.zzd(16);
                            int iZzd28 = zzfnVar.zzd(16);
                            if (zZzo2) {
                                int iZzd29 = zzfnVar.zzd(16);
                                iZzd3 = zzfnVar.zzd(16);
                                iZzd5 = zzfnVar.zzd(16);
                                iZzd4 = zzfnVar.zzd(16);
                                i6 = iZzd29;
                            } else {
                                iZzd3 = iZzd27;
                                iZzd4 = iZzd28;
                                i6 = 0;
                                iZzd5 = 0;
                            }
                            zzalsVar.zzh = new zzalm(iZzd27, iZzd28, i6, iZzd3, iZzd5, iZzd4);
                            break;
                        }
                        break;
                }
                zzfnVar.zzn(iZzb - zzfnVar.zzb());
            }
        }
        zzals zzalsVar2 = this.zzi;
        zzalo zzaloVar4 = zzalsVar2.zzi;
        if (zzaloVar4 == null) {
            zzakzVar = new zzakz(zzfzn.zzm(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzalm zzalmVar = zzalsVar2.zzh;
            if (zzalmVar == null) {
                zzalmVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzalmVar.zza + 1 != bitmap.getWidth() || zzalmVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzalmVar.zza + 1, zzalmVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = zzaloVar4.zzc;
            int i10 = 0;
            while (i10 < sparseArray6.size()) {
                this.zzf.save();
                zzalp zzalpVar = (zzalp) sparseArray6.valueAt(i10);
                zzalq zzalqVar3 = (zzalq) this.zzi.zzc.get(sparseArray6.keyAt(i10));
                int i11 = zzalpVar.zza + zzalmVar.zzc;
                int i12 = zzalpVar.zzb + zzalmVar.zze;
                this.zzf.clipRect(i11, i12, Math.min(zzalqVar3.zzc + i11, zzalmVar.zzd), Math.min(zzalqVar3.zzd + i12, zzalmVar.zzf));
                zzall zzallVar = (zzall) this.zzi.zzd.get(zzalqVar3.zzf);
                if (zzallVar == null) {
                    zzallVar = (zzall) this.zzi.zzf.get(zzalqVar3.zzf);
                    if (zzallVar == null) {
                        zzallVar = this.zzh;
                    }
                }
                SparseArray sparseArray7 = zzalqVar3.zzj;
                int i13 = 0;
                while (i13 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i13);
                    zzalr zzalrVar = (zzalr) sparseArray7.valueAt(i13);
                    zzaln zzalnVar = (zzaln) this.zzi.zze.get(iKeyAt);
                    if (zzalnVar == null) {
                        zzalnVar = (zzaln) this.zzi.zzg.get(iKeyAt);
                    }
                    if (zzalnVar != null) {
                        Paint paint = zzalnVar.zzb ? null : this.zzd;
                        int i14 = zzalqVar3.zze;
                        int i15 = zzalrVar.zza + i11;
                        int i16 = zzalrVar.zzb + i12;
                        sparseArray = sparseArray6;
                        Canvas canvas = this.zzf;
                        sparseArray2 = sparseArray7;
                        i4 = i10;
                        int[] iArr = i14 == 3 ? zzallVar.zzd : i14 == 2 ? zzallVar.zzc : zzallVar.zzb;
                        Paint paint2 = paint;
                        zze(zzalnVar.zzc, iArr, i14, i15, i16, paint2, canvas);
                        zze(zzalnVar.zzd, iArr, i14, i15, i16 + 1, paint2, canvas);
                    } else {
                        sparseArray = sparseArray6;
                        i4 = i10;
                        sparseArray2 = sparseArray7;
                    }
                    i13++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    i10 = i4;
                }
                SparseArray sparseArray8 = sparseArray6;
                int i17 = i10;
                float f = i12;
                float f2 = i11;
                if (zzalqVar3.zzb) {
                    int i18 = zzalqVar3.zze;
                    c = 3;
                    if (i18 == 3) {
                        i3 = zzallVar.zzd[zzalqVar3.zzg];
                        c2 = 2;
                    } else {
                        c2 = 2;
                        i3 = i18 == 2 ? zzallVar.zzc[zzalqVar3.zzh] : zzallVar.zzb[zzalqVar3.zzi];
                    }
                    this.zze.setColor(i3);
                    this.zzf.drawRect(f2, f, zzalqVar3.zzc + i11, zzalqVar3.zzd + i12, this.zze);
                } else {
                    c = 3;
                    c2 = 2;
                }
                zzea zzeaVar = new zzea();
                zzeaVar.zzc(Bitmap.createBitmap(this.zzj, i11, i12, zzalqVar3.zzc, zzalqVar3.zzd));
                zzeaVar.zzh(f2 / zzalmVar.zza);
                zzeaVar.zzi(0);
                zzeaVar.zze(f / zzalmVar.zzb, 0);
                zzeaVar.zzf(0);
                zzeaVar.zzk(zzalqVar3.zzc / zzalmVar.zza);
                zzeaVar.zzd(zzalqVar3.zzd / zzalmVar.zzb);
                arrayList.add(zzeaVar.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i10 = i17 + 1;
                sparseArray6 = sparseArray8;
            }
            zzakzVar = new zzakz(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzepVar.zza(zzakzVar);
    }
}
